package org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.launcher;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.gemoc.execution.engine.coordinator.commons.CoordinatedModelExecutionContext;
import org.gemoc.execution.engine.coordinator.commons.CoordinatedRunConfiguration;
import org.gemoc.execution.engine.coordinator.commons.HeterogeneousEngine;
import org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.Activator;
import org.gemoc.gemoc_language_workbench.api.core.ExecutionMode;
import org.gemoc.gemoc_language_workbench.api.core.IExecutionEngine;
import org.gemoc.gemoc_language_workbench.extensions.sirius.services.AbstractGemocDebuggerServices;
import org.gemoc.gemoc_modeling_workbench.ui.debug.GemocModelDebugger;

import fr.inria.diverse.commons.messagingsystem.api.MessagingSystem;
import fr.obeo.dsl.debug.ide.IDSLDebugger;
import fr.obeo.dsl.debug.ide.adapter.IDSLCurrentInstructionListener;
import fr.obeo.dsl.debug.ide.event.DSLDebugEventDispatcher;

public class Launcher
		extends
		fr.obeo.dsl.debug.ide.sirius.ui.launch.AbstractDSLLaunchConfigurationDelegateUI 
{
	
	
	public final static String TYPE_ID = "org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.GemocReflectiveModelLauncherID";

	public final static String MODEL_ID = "org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.debugModel";

	private ArrayList<IExecutionEngine> _executionEngines;

	private HeterogeneousEngine heterogeneousEngine;

	private CoordinatedModelExecutionContext executionContext;

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {	
		try 
		{
			final CoordinatedRunConfiguration runConfiguration = new CoordinatedRunConfiguration(configuration);
			debug("About to initialize and run the GEMOC Coordinated Execution Engine...");			

			ExecutionMode executionMode = null;
			if (ILaunchManager.DEBUG_MODE.equals(mode))
				//&& runConfiguration.getAnimatorURI() != null) 
			{
				executionMode = ExecutionMode.Animation;			
			}
			else
			{
				executionMode = ExecutionMode.Run;
			}
			executionContext = new CoordinatedModelExecutionContext(runConfiguration, executionMode);			
			
			heterogeneousEngine = new HeterogeneousEngine(executionContext.getCoordinationModelURI(), executionContext.getCoordinatedEngines());
			
			heterogeneousEngine.run();

		} 
		catch (Exception e)
		{
			String message = "Error occured when starting the coordinated execution engine: " + e.getMessage() +  " (see inner exception).";
		  	//error(message);
			e.printStackTrace();
		  	throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, message, e));
		}
	}


	private void debug(String message) {
		getMessagingSystem().debug(message, getPluginID());
	}

	private void info(String message) {
		getMessagingSystem().info(message, getPluginID());
	}

	private void warn(String message) {
		getMessagingSystem().warn(message, getPluginID());
	}

	private void error(String message) {
		getMessagingSystem().error(message, getPluginID());
	}

	private MessagingSystem getMessagingSystem() {
		return Activator
				.getDefault()
				.getMessaggingSystem();	
	}
	
	@Override
	protected String getLaunchConfigurationTypeID() {
		return TYPE_ID;
	}

	@Override
	protected EObject getFirstInstruction(ISelection selection) {
		return EcorePackage.eINSTANCE;
	}

	@Override
	protected EObject getFirstInstruction(IEditorPart editor) {
		return EcorePackage.eINSTANCE;
	}

	@Override
	protected EObject getFirstInstruction(ILaunchConfiguration configuration) {
		return EcorePackage.eINSTANCE;
	}

	@Override
	protected IDSLDebugger getDebugger(ILaunchConfiguration configuration,
			DSLDebugEventDispatcher dispatcher, EObject firstInstruction,
			IProgressMonitor monitor) {
		ArrayList<IDSLDebugger> allRes = new ArrayList<IDSLDebugger>();
		for (IExecutionEngine _executionEngine: _executionEngines){
			GemocModelDebugger res = new GemocModelDebugger(dispatcher, _executionEngine);
			_executionEngine.getExecutionContext().getExecutionPlatform().addEngineAddon(res);
			allRes.add(res);
		}
		return allRes.get(0);
	}

	@Override
	protected String getDebugTargetName(ILaunchConfiguration configuration, EObject firstInstruction) 
	{
		return "Gemoc debug target";
	}

	@Override
	protected List<IDSLCurrentInstructionListener> getCurrentInstructionListeners() 
	{
		List<IDSLCurrentInstructionListener> result = super.getCurrentInstructionListeners();
		result.add(AbstractGemocDebuggerServices.LISTENER);
		return result;
	}

	@Override
	protected String getDebugJobName(ILaunchConfiguration configuration, EObject firstInstruction) 
	{
		return "Gemoc coordinated execution debug job";
	}

	@Override
	protected String getPluginID() 
	{
		return Activator.PLUGIN_ID;
	}

	@Override
	protected String getModelIdentifier() 
	{
		return MODEL_ID;
	}
	
	class DefaultSearchRequestor extends SearchRequestor
	{
		
		public IType _binaryType;

		@Override
		public void acceptSearchMatch(SearchMatch match) throws CoreException {
			_binaryType = (IType)match.getElement();
			System.out.println(match.getElement());
		}
		
	}
}
