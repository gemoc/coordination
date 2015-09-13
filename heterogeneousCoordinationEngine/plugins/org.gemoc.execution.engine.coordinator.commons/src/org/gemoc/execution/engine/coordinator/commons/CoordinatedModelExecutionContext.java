package org.gemoc.execution.engine.coordinator.commons;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.management.RuntimeErrorException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gemoc.bcool.model.bcool.BCoolSpecification;
import org.gemoc.bcool.transformation.bcool2qvto.ui.common.GenerateAll;
import org.gemoc.execution.engine.commons.Activator;
import org.gemoc.execution.engine.commons.EngineContextException;
import org.gemoc.execution.engine.commons.LogicalStepDeciderFactory;
import org.gemoc.execution.engine.core.ExecutionWorkspace;
import org.gemoc.executionengine.ccsljava.api.core.ILogicalStepDecider;
import org.gemoc.gemoc_language_workbench.api.core.EngineStatus.RunStatus;
import org.gemoc.gemoc_language_workbench.api.core.ExecutionMode;
import org.gemoc.gemoc_language_workbench.api.core.IBasicExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionContext;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionPlatform;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionWorkspace;
import org.gemoc.gemoc_language_workbench.api.extensions.languages.LanguageDefinitionExtension;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.CCSLModelFactory;
import fr.inria.aoste.timesquare.ccslkernel.parser.xtext.ExtendedCCSLStandaloneSetup;
import fr.inria.aoste.timesquare.ecl.feedback.feedback.ActionModel;

public class CoordinatedModelExecutionContext implements IExecutionContext
{

	private CoordinatedRunConfiguration _runConfiguration;
	
private XtextResourceSet coordinationModelResourceSet;

private URI coordinationModelURI = null;

private ArrayList<IExecutionEngine> coordinatedEngines = null;

private ExecutionMode _executionMode;

private ILogicalStepDecider _logicalStepDecider;

public void set_logicalStepDecider(ILogicalStepDecider _logicalStepDecider) {
	this._logicalStepDecider = _logicalStepDecider;
}


public ILogicalStepDecider get_logicalStepDecider() {
	return _logicalStepDecider;
}


private HeterogeneousExecutionPlatform _executionPlatform = new HeterogeneousExecutionPlatform();

private Resource _resourceBCOoL;

public ArrayList<IExecutionEngine> getCoordinatedEngines() {
	return coordinatedEngines;
}


	public URI getCoordinationModelURI() {
		return coordinationModelURI;
	}

	public CoordinatedModelExecutionContext(CoordinatedRunConfiguration runConfiguration, ExecutionMode executionMode) throws EngineContextException
	{

		_runConfiguration = runConfiguration;
		_executionMode = executionMode;
		try
		{
				_logicalStepDecider = LogicalStepDeciderFactory.createDecider(runConfiguration.getDeciderName(),
						executionMode);
			_executionWorkspace = new ExecutionWorkspace(_runConfiguration.getExecutedModelURI());
			
		} catch (CoreException e)
		{
			EngineContextException exception = new EngineContextException(
					"Cannot initialize the execution context, see inner exception.", e);
			throw exception;
		}
		
		IProgressMonitor monitor = new NullProgressMonitor();
		
		//launch the configurations and get the associated engine		
		URI launch1URI = runConfiguration.getConfigurationURI1();
		ILaunch startedLaunch1 = createAndLaunchConfiguration(executionMode, monitor, launch1URI);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		URI launch2URI = runConfiguration.getConfigurationURI2();
		ILaunch startedLaunch2 = createAndLaunchConfiguration(executionMode, monitor, launch2URI);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//		TODO: need a synchro to wait for the engine to start (otherwise it is not yet in the list)
		
		/*
		 * warning, here we consider that the only started engines are the one that need to be coordinated...
		 */
		ArrayList<IFile> inputModelfiles = new ArrayList<IFile>();
		ArrayList<IFile> timodelFiles = new ArrayList<IFile>();
		coordinatedEngines  = new ArrayList<IExecutionEngine>();
		Collection<IBasicExecutionEngine> engines = org.gemoc.execution.engine.Activator.getDefault().gemocRunningEngineRegistry.getRunningEngines().values();
		for (IBasicExecutionEngine engine : engines)
		{
			if (engine.getRunningStatus() == RunStatus.Stopped){
				continue;
			}
			if (! (engine instanceof IExecutionEngine)){
				throw new RuntimeErrorException(new Error("for now, basic execution engines are not candidates for coordination"), "for now, basic execution engines are not candidates for coordination");
			}
			
			coordinatedEngines.add((IExecutionEngine)engine);
			timodelFiles.add(getTimemodelFile((IExecutionEngine)engine));			
			
			URI modelURI = engine.getExecutionContext().getRunConfiguration().getExecutedModelURI();
			String modelPathName = modelURI.toPlatformString(true);
			String tmpProjectName = modelPathName.substring(1, modelPathName.length());
			String projectName = tmpProjectName.substring(0, tmpProjectName.indexOf('/'));
			IProject modelProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			IFile modelFile = modelProject.getFile(modelPathName.replaceFirst("/"+projectName+"/", ""));
			inputModelfiles.add(modelFile);
		}
		
		//create qvto and then apply it
		URI bcoolURI = runConfiguration.getBcoolModelURI();
		IContainer gemocGenFolder = createQVToFromBCOoL(bcoolURI, monitor);
		URI qvtoURI = getGeneratedQvtoURI(bcoolURI, gemocGenFolder);
		
		String coordinationModelPath = qvtoURI.toString().substring(0, qvtoURI.toString().lastIndexOf('/')+1)
				+ launch1URI.lastSegment() + launch2URI.lastSegment()+".timemodel"
				;
		
		
		coordinationModelURI = URI.createURI(coordinationModelPath);
		
		_resourceBCOoL = createCoordinationResourceAndSaveIt(coordinationModelURI);
		
		GemocQvto2CCSLTranslator qvto2ccslTranslator = new GemocQvto2CCSLTranslator(); 

		qvto2ccslTranslator.applyQVTo(qvtoURI, inputModelfiles, coordinationModelURI);
	
		return;
	}

	
	protected Resource createCoordinationResourceAndSaveIt(URI ccslModelURI) {
		ExtendedCCSLStandaloneSetup ess= new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		XtextResourceSet ccslResourceSet = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		ccslResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
		Resource ccslResource=null;
		try{
			ccslResource = ccslResourceSet.createResource(ccslModelURI);
			ccslResource.load(null);
			if (ccslResource.getContents().size() == 0){
				ccslResource.getContents().add(CCSLModelFactory.eINSTANCE.createClockConstraintSystem());
			}
			ccslResource.save(null);
	    }catch( Exception e){
	    	System.out.println(e);
	    };
	    return ccslResource;
	}


	protected URI getGeneratedQvtoURI(URI bcoolURI, IContainer gemocGenFolder) {
		ExtendedCCSLStandaloneSetup ess= new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		XtextResourceSet bcoolResourceSet = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		bcoolResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
		Resource bcoolResource=null;
		try{
			bcoolResource = bcoolResourceSet.createResource(bcoolURI);
			bcoolResource.load(null);
	    }catch( Exception e){
	    	System.out.println(e);
	    };
	    
	    String qvtoFileName = ((BCoolSpecification) bcoolResource.getContents().get(0)).getName()+".qvto";
	    IFile qvtoFile = gemocGenFolder.getFile(new Path(qvtoFileName));
	    URI qvtoURI = URI.createURI(qvtoFile.getFullPath().toString());
		return qvtoURI;
	}


	protected IFile getTimemodelFile(IExecutionEngine engine) {
		URI modelURI = engine.getExecutionContext().getResourceModel().getURI();
		String modelPathName = modelURI.toPlatformString(true);
		String tmpModelProjectName = modelPathName.substring(1, modelPathName.length());
		String modelprojectName = tmpModelProjectName.substring(0, tmpModelProjectName.indexOf('/'));
		IProject modelProject = ResourcesPlugin.getWorkspace().getRoot().getProject(modelprojectName);
		String modelName = modelPathName.substring(modelPathName.lastIndexOf('/'));
		String modelNameWithoutExtension = modelName.substring(0, modelName.lastIndexOf('.'));
		IFile modelTimemodelFile = modelProject.getFile("gemoc-gen"+ modelNameWithoutExtension+".timemodel");
		return modelTimemodelFile;
	}


	private ILaunch createAndLaunchConfiguration(ExecutionMode executionMode,
			IProgressMonitor monitor, URI launchURI) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		String launchPathName = launchURI.toPlatformString(true);
		String tmpProjectName = launchPathName.substring(1, launchPathName.length());
		String projectName = tmpProjectName.substring(0, tmpProjectName.indexOf('/'));
		IProject launchProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFile launchFile = launchProject.getFile(launchPathName.replaceFirst("/"+projectName+"/", ""));
		ILaunchConfiguration launch = manager.getLaunchConfiguration(launchFile);
		try {
			ILaunch startedLaunch = launch.launch(ILaunchManager.DEBUG_MODE, monitor);
			return startedLaunch;
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}


	private IContainer createQVToFromBCOoL(URI bcoolURI, 	IProgressMonitor monitor) {
		String bcoolPathName = bcoolURI.toPlatformString(true);
		String tmpProjectName = bcoolPathName.substring(1, bcoolPathName.length());
		String projectName = tmpProjectName.substring(0, tmpProjectName.indexOf('/'));
		IProject BcoolProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFile bcoolFile = BcoolProject.getFile(bcoolPathName.replaceFirst("/"+projectName+"/", ""));
		IContainer target = BcoolProject.getFolder("gemoc-gen");
		
		try {
			GenerateAll generator = new GenerateAll(bcoolURI, target,new ArrayList<String>());
			generator.doGenerate(monitor );
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		} finally {
			try {
				bcoolFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return target;
	}

	
	public CoordinatedRunConfiguration getRunConfiguration()
	{
		return _runConfiguration;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//copy from ModelExecutioContext
	
	
	private ResourceSet getResourceSet()
	{
		return null;
	}

	

	@Override
	public Resource getResourceModel()
	{
		return _resourceBCOoL;
	}

	@Override
	public void dispose()
	{
		_logicalStepDecider.dispose();
	}

	public ILogicalStepDecider getLogicalStepDecider() {
		return _logicalStepDecider;
	}

	
	private IExecutionWorkspace _executionWorkspace;

	@Override
	public IExecutionWorkspace getWorkspace()
	{
		return _executionWorkspace;
	}

	@Override
	public ExecutionMode getExecutionMode()
	{
		return _executionMode;
	}


	@Override
	public ActionModel getFeedbackModel()
	{
		return null;
	}

	@Override
	public IExecutionPlatform getExecutionPlatform()
	{
		return _executionPlatform;
	}

	@Override
	public LanguageDefinitionExtension getLanguageDefinitionExtension()
	{
		return null;
	}

	



	
	
	
	
	
	
	
	
}
