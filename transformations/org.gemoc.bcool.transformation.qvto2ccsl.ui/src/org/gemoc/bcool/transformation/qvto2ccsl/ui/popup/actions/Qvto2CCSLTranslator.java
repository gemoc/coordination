package org.gemoc.bcool.transformation.qvto2ccsl.ui.popup.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ccslkernel.parser.xtext.ExtendedCCSLStandaloneSetup;


public class Qvto2CCSLTranslator implements IObjectActionDelegate {
	private IFile modelFile1=null;
	private IFile modelFile2=null;
	private IFile qvtoFile=null;
	private XtextResourceSet aModelResourceSet=null;
	private XtextResourceSet outputResourceSet=null;
	
	/**
	 * Constructor for Action1.
	 */
	public Qvto2CCSLTranslator() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * just initialization stuff from xtext for an ecl resource
	 */
	private void initializeXtext(){
		ExtendedCCSLStandaloneSetup ess= new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		aModelResourceSet = injector.getInstance(XtextResourceSet.class);
		outputResourceSet = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		aModelResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		initializeXtext();

		//qvto uri
		String qvtoUriString = qvtoFile.getLocation().toOSString();
	    URI transformationURI = URI.createFileURI(qvtoUriString);
	    
		
	    //model1 resource
	    String modelUriString1 = modelFile1.getProject().getName()+"/"+modelFile1.getProjectRelativePath().toOSString();
	    URI modelUri1 = URI.createPlatformResourceURI(modelUriString1,false);
	    Resource modelResource1 = aModelResourceSet.getResource(modelUri1, true);
	   
	    HashMap<Object, Object> saveOptions1 = new HashMap<Object, Object>();
	    Builder aBuilder1 = SaveOptions.newBuilder();
	    SaveOptions anOption1 = aBuilder1.getOptions();
	    anOption1.addTo(saveOptions1);
	    try {
	    	modelResource1.load(saveOptions1);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	  //model2 resource
	    String modelUriString2 = modelFile2.getProject().getName()+"/"+modelFile2.getProjectRelativePath().toOSString();
	    URI modelUri2 = URI.createPlatformResourceURI(modelUriString2,false);
	    Resource modelResource2 = aModelResourceSet.getResource(modelUri2, true);
	   
	    HashMap<Object, Object> saveOptions2 = new HashMap<Object, Object>();
	    Builder aBuilder2 = SaveOptions.newBuilder();
	    SaveOptions anOption2 = aBuilder2.getOptions();
	    anOption2.addTo(saveOptions2);
	    try {
	    	modelResource2.load(saveOptions2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	   
	    //transformationURI is the URI of qvto file
		TransformationExecutor executor = new TransformationExecutor(transformationURI);

		//inResource1 have the vaule of inModel
		ModelExtent input1 = new BasicModelExtent(modelResource1.getContents());
		ModelExtent input2 = new BasicModelExtent(modelResource2.getContents());
		ModelExtent output = new BasicModelExtent();

		ExecutionContextImpl context = new ExecutionContextImpl();
		// importa el orden!!!!!
		ExecutionDiagnostic diagnostic = executor.execute(context, input2, input1, output);
		System.out.println(diagnostic);
		//output resource saving
		int numberOfCharToRemove1 = modelUriString1.length() - modelUri1.fileExtension().length() -1;
	    String outputPathString = modelUriString1.substring(0, numberOfCharToRemove1)+ "_coordinatedWith_";
		int numberOfCharToRemove2 = modelUriString2.length() - modelUri2.fileExtension().length() -1;
	    String tmp = modelUriString2.substring(0, numberOfCharToRemove2);
	    tmp = tmp.substring(tmp.lastIndexOf('/')+1, tmp.length()-1)+"_MoCC.extendedCCSL";
	    outputPathString += tmp;
	    
	    URI outputUri = URI.createPlatformResourceURI(outputPathString,false);
	    Resource outputResource=null;
	    try{
	    	outputResource = outputResourceSet.createResource(outputUri);
	    }catch( Exception e){
	    	System.out.println(e);
	    	outputResource = outputResourceSet.createResource(outputUri);

	    //	outputResource = outputResourceSet.getResource(outputUri,true);
	    };
	    outputResource.getContents().addAll(output.getContents());
	    try {
			outputResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**path
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		qvtoFile=null;
		modelFile1=null;
		modelFile2=null;
		if (selection instanceof StructuredSelection) {
			StructuredSelection ts = (StructuredSelection) selection;
			Iterator it = ts.iterator();
			while(it.hasNext()){
				Object o = it.next();
				if (o instanceof IFile) {
					IFile f = (IFile)o;
					if (f.getFileExtension().compareTo("qvto")==0){
						qvtoFile = (IFile) o;
					}else{
						if (modelFile1 == null){
							modelFile1 = (IFile) o;
						}else{
							modelFile2 = (IFile) o;
						}
					}
					
					
				}
			}
			
		}
	}

}
