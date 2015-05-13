package org.gemoc.bcool.transformation.qvto2ccsl.ui.popup.actions;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModelParameter;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
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
	
	
	private ArrayList<IFile> modelfiles = new ArrayList<IFile>();
	
	
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
	    
	    // output file
	    String qvtUriString0 = qvtoFile.getProject().getName()+"/"+qvtoFile.getProjectRelativePath().toOSString();
	    int numberOfCharToRemove1 = qvtUriString0.length() - transformationURI.fileExtension().length() -1;
	    String outputPathStringtotal = qvtUriString0.substring(0, numberOfCharToRemove1)+"Coordinated.extendedCCSL";
		
	    URI outputUritotal = URI.createPlatformResourceURI(outputPathStringtotal,false);
	    Resource outputResourcetotal=null;
	    try{
	    	outputResourcetotal = outputResourceSet.createResource(outputUritotal);
	    }catch( Exception e){
	    	System.out.println(e);
	    	outputResourcetotal = outputResourceSet.createResource(outputUritotal);
	    };
	    
	    //executor and context
	    TransformationExecutor executor = new TransformationExecutor(transformationURI);
	    ExecutionContextImpl context = new ExecutionContextImpl();
	    ModelExtent output = new BasicModelExtent();
	    
	    // trace of the applicacion of the operators
	    HashMap<IFile,Boolean> tracemodels = new HashMap<IFile, Boolean>();
	    
	    // ugly since it should be check the parameters
		for (IFile model1 : modelfiles) {
		    //model1 resource
		    String model1UriString = model1.getProject().getName()+"/"+model1.getProjectRelativePath().toOSString();
		    URI model1Uri = URI.createPlatformResourceURI(model1UriString,false);
		    Resource model1Resource = aModelResourceSet.getResource(model1Uri, true);
		   
		    HashMap<Object, Object> saveOptions1 = new HashMap<Object, Object>();
		    Builder aBuilder1 = SaveOptions.newBuilder();
		    SaveOptions anOption1 = aBuilder1.getOptions();
		    anOption1.addTo(saveOptions1);
		    try {
		    	model1Resource.load(saveOptions1);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    ModelExtent input1 = new BasicModelExtent(model1Resource.getContents());
		    
		    //tracemodels.put(model1, true);
			//////////////////////////////////////////////////////////////////////////////
			for (IFile model2 : modelfiles){
				
				//model2 resource
			    String model2UriString = model2.getProject().getName()+"/"+model2.getProjectRelativePath().toOSString();
			    URI model2Uri = URI.createPlatformResourceURI(model2UriString,false);
			    Resource model2Resource = aModelResourceSet.getResource(model2Uri, true);
				
			    
				if ((model1.getFullPath().toString().equals(model2.getFullPath().toString())))  {
				}else{
				
				    // models conforming to same language, the transfo is aplicable only one time
				    if  ((model2Uri.fileExtension().equals(model1Uri.fileExtension())) && (tracemodels.get(model2) == null)) {  
				  
				    	tracemodels.put(model1,true);
				    	
				    	HashMap<Object, Object> saveOptions2 = new HashMap<Object, Object>();
				    	Builder aBuilder2 = SaveOptions.newBuilder();
				    	SaveOptions anOption2 = aBuilder2.getOptions();
				    	anOption2.addTo(saveOptions2);
				    	try {
				    		model2Resource.load(saveOptions2);
				    	} catch (IOException e1) {
				    		// TODO Auto-generated catch block
				    		e1.printStackTrace();
				    	}
				    
				    	ModelExtent input2 = new BasicModelExtent(model2Resource.getContents());
				    	ExecutionDiagnostic diagnostic = executor.execute(context, input1, input2 , output);
				    // models conforming different languages
				    } else if  (!(model2Uri.fileExtension().equals(model1Uri.fileExtension()))) {
				    	HashMap<Object, Object> saveOptions2 = new HashMap<Object, Object>();
				    	Builder aBuilder2 = SaveOptions.newBuilder();
				    	SaveOptions anOption2 = aBuilder2.getOptions();
				    	anOption2.addTo(saveOptions2);
				    	try {
				    		model2Resource.load(saveOptions2);
				    	} catch (IOException e1) {
				    		// TODO Auto-generated catch block
				    		e1.printStackTrace();
				    	}
				    
				    	ModelExtent input2 = new BasicModelExtent(model2Resource.getContents());
				    	ExecutionDiagnostic diagnostic = executor.execute(context, input1, input2 , output);
				    	
				    }
					
				}
			}
		}
		
		outputResourcetotal.getContents().addAll(output.getContents());
		
		try {
			outputResourcetotal.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	 

	}

	/**path
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	// Here models are loaded from the parameters 
	// I should split it into two groups here
	public void selectionChanged(IAction action, ISelection selection) {
		qvtoFile=null;
		modelFile1=null;
		modelFile2=null;
		modelfiles.removeAll(modelfiles);
		
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
						modelfiles.add((IFile) o);
					}
					
					
				}
			}
			
		}
	}

}
