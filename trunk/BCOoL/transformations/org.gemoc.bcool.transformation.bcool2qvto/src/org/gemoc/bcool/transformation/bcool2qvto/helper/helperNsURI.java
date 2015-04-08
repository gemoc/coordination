package org.gemoc.bcool.transformation.bcool2qvto.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.PackageDeclarationCS;
import org.eclipse.xtext.common.types.impl.JvmFieldImplCustom;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.gemoc.bcool.model.bcool.BCoolOperatorArg;
import org.gemoc.bcool.model.bcool.BCoolSpecification;
import org.gemoc.bcool.model.bcool.EventExpression;
import org.gemoc.bcool.model.bcool.ImportInterfaceStatement;
import org.gemoc.gel.gexpressions.GExpression;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ECL.ECLDocument;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.BasicType.IntegerElement;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.BasicType.impl.IntegerImpl;
import fr.inria.aoste.timesquare.ecl.xtext.EclStandaloneSetup;

import org.gemoc.gel.gexpressions.GAdditionExpression;
import org.gemoc.gel.gexpressions.GAndExpression;
import org.gemoc.gel.gexpressions.GBraceExpression;
import org.gemoc.gel.gexpressions.GEqualityExpression;
import org.gemoc.gel.gexpressions.GIntegerExpression;
import org.gemoc.gel.gexpressions.GNavigationExpression;
import org.gemoc.gel.gexpressions.GReferenceExpression;
import org.gemoc.gel.gexpressions.GStringExpression;
import org.gemoc.gel.gexpressions.GexpressionsFactory;
import org.gemoc.gel.gexpressions.xtext.GExpressionsStandaloneSetup;
import org.eclipse.xtext.serializer.impl.Serializer;



@SuppressWarnings("restriction")
public class helperNsURI {
	
	
	
	
	public String prettyPrintAlias(String e) {
		return e.substring(maxPositive(0,e.lastIndexOf('/')+1), e.lastIndexOf('.'));
	}
	private int maxPositive(int i1, int i2) {
		if (i1 < 0 && i2 <0)
			return 0;
		if (i1 < 0)
			return i2;
		if (i2 < 0)
			return i1;
		if (i1 < i2)
			return i2;
		else
			return i1;
	}
	
	
	public ECLDocument getEclDocument(ImportInterfaceStatement importInterfaceStatement){
		//init Xtext
				String modelPath = importInterfaceStatement.getImportURI();
				
				EclStandaloneSetup  ess= new EclStandaloneSetup();
				Injector injector = ess.createInjector();
			    XtextResourceSet aSet = injector.getInstance(XtextResourceSet.class);
				aSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				EcoreUtil.resolveAll(aSet);
				EclStandaloneSetup.doSetup();

				URI uri =null;
				//filter URI
				if (modelPath.startsWith("platform:/plugin")){
					uri = URI.createPlatformPluginURI(modelPath.replace("platform:/plugin", ""), false);
				}else
				if(modelPath.startsWith("platform:/resource")){
					uri = URI.createPlatformResourceURI(modelPath.replace("platform:/resource", ""),false);
				}else{//relative path
//					throw new IllegalArgumentException("the path of the library must be platform based (platform:/resource or platform:/plugin)");
					uri = URI.createFileURI(modelPath);
				}
				
			    //load the corresponding resource
			    Resource eclResource = aSet.getResource(uri, true);
			    HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
			    Builder aBuilder = SaveOptions.newBuilder();
			    SaveOptions anOption = aBuilder.getOptions();
			    anOption.addTo(saveOptions);
			    try {
			    	eclResource.load(saveOptions);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			    
			    ECLDocument eclDoc = (ECLDocument)eclResource.getContents().get(0);
			    return eclDoc;
	}
	
	
	
	public ECLDocument getEclDocumentfromURI(String modelPath){
		//init Xtext
				
				EclStandaloneSetup  ess= new EclStandaloneSetup();
				Injector injector = ess.createInjector();
			    XtextResourceSet aSet = injector.getInstance(XtextResourceSet.class);
				aSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				EcoreUtil.resolveAll(aSet);
				EclStandaloneSetup.doSetup();

				URI uri =null;
				//filter URI
				if (modelPath.startsWith("platform:/plugin")){
					uri = URI.createPlatformPluginURI(modelPath.replace("platform:/plugin", ""), false);
				}else
				if(modelPath.startsWith("platform:/resource")){
					uri = URI.createPlatformResourceURI(modelPath.replace("platform:/resource", ""),false);
				}else{//relative path
//					throw new IllegalArgumentException("the path of the library must be platform based (platform:/resource or platform:/plugin)");
					uri = URI.createFileURI(modelPath);
				}
				
			    //load the corresponding resource
			    Resource eclResource = aSet.getResource(uri, true);
			    HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
			    Builder aBuilder = SaveOptions.newBuilder();
			    SaveOptions anOption = aBuilder.getOptions();
			    anOption.addTo(saveOptions);
			    try {
			    	eclResource.load(saveOptions);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			    
			    ECLDocument eclDoc = (ECLDocument)eclResource.getContents().get(0);
			    return eclDoc;
	}
	
	
	
	public String resolveAll(BCoolSpecification aBCoolSpec){
		EcoreUtil.resolveAll(aBCoolSpec.eResource().getResourceSet());
		return "// This is the result of the compilation of a BCool spec";
	}
	
	public String getNSURI(ImportInterfaceStatement importInterfaceStatement){
	    ECLDocument eclDoc = getEclDocument(importInterfaceStatement);
	    String oclimport = eclDoc.getOwnedImport().get(0).toString();
	    return oclimport.substring(oclimport.indexOf('\'')+1, oclimport.lastIndexOf('\''));
//	    return eclDoc.getOwnedImport().get(0).getUri();
	}
	
	
	public String getModelPath(EObject d){
		String res ="";
			res = d.eResource().getURI().toFileString();
		return res;
	}
	
	public String getDSEIndex(EObject arg0, BCoolSpecification aBCoolSpec){
		//ECLDocument ecldoc = (ECLDocument) getEclDocument(aBCoolSpec.getImportsBehavioralInterface().get(0));
		
		//TreeIterator<EObject>  dses = ecldoc.eAllContents();
		//DefCS dse0 = (DefCS) dses.next();
		
		//EList<PackageDeclarationCS> allpackages = ecldoc.getPackages();
		//PackageDeclarationCS pdecl = allpackages.get(0);
		//Package p = (Package) pdecl.getPackage();
		//TreeIterator<EObject> it = ((EObject) pdecl).eAllContents();
		// That is very very bad
		DefPropertyCS dsetmp = (DefPropertyCS) arg0 ;
		String s = dsetmp.getName();
		if  (s.contains("startAction")) {
			return "2";
		}
		
		if  (s.contains("finishAction")) {
			return "2";
		}
		
		if  (s.contains("ticks")) {
			return "1";
		}
		return "";
	}
	
	
   // given a GNavigationExpression returns the serialization 
	public String GOperandtoString (GNavigationExpression operand){
		 String m = "";
		 GNavigationExpression test1 = (GNavigationExpression) operand;
		 while (true)
		  {
			  if (test1.getReferencedEObject() instanceof EAttribute) {
				  EAttribute nameatt = (EAttribute) test1.getReferencedEObject();
				  m =  "."  + nameatt.getName()  +  m;
			  } else if (test1.getReferencedEObject() instanceof EReference) {
				  EReference nameatt = (EReference) test1.getReferencedEObject();
				  m =  "."  + nameatt.getName()  +  m;
			  }
			  
			  if (test1.getBody() instanceof GReferenceExpression) break;
			  
			  test1 = (GNavigationExpression) test1.getBody();	 
		  }
		 
		 GReferenceExpression test2 = (GReferenceExpression) test1.getBody();
		 BCoolOperatorArg nameatt = (BCoolOperatorArg) test2.getReferencedEObject();
		 m =  nameatt.getName()  +  m;
		 return m;
	}
	
	
	public String GexpressiontoString (GExpression exp ){
	String serial = "";
		try {  
	    	  
	    	  if (exp instanceof GEqualityExpression) {
	    		GEqualityExpression  gexp = (GEqualityExpression) exp;
	    		GNavigationExpression leftoper = (GNavigationExpression) gexp.getLeftOperand();
	    		GNavigationExpression rightoper = (GNavigationExpression) gexp.getRightOperand();
	    		serial =  GOperandtoString (leftoper);
	    		serial = serial + "="+ GOperandtoString (rightoper);
	    	  } else if (exp instanceof GAndExpression) {
	    		  GAndExpression   gexp = (GAndExpression) exp;
		    	  GNavigationExpression leftoper = (GNavigationExpression) gexp.getLeftOperand();
		    	  GNavigationExpression rightoper = (GNavigationExpression) gexp.getRightOperand();
		    	  serial =  GOperandtoString (leftoper);
		    	  serial = serial + "=" + GOperandtoString (rightoper);
	    	  }else if (exp instanceof GBraceExpression){
	    		  // TODO!!!
	    		  GBraceExpression  gexp = (GBraceExpression) exp;
	    	  }
	    		
	    	 
	    	  } catch (Exception ex) { // fall back:  
	    		  ex.printStackTrace();
	    		  serial = "Bad GExpression serialization!";
	    	  }
		return serial;
	}
	
	
	public String DSEtoString (EObject dse ){
		if (dse instanceof DefPropertyCS) {
			DefPropertyCS dsetmp = (DefPropertyCS) dse ;
		return dsetmp.getName();
		}
		
		if (dse instanceof EventExpression) {
			EventExpression dsetmp = (EventExpression) dse ;
			return dsetmp.getName();
			}
		
		if (dse instanceof IntegerImpl) {
			IntegerImpl dsetmp = (IntegerImpl) dse ;
			return dsetmp.getName();
			}
		
		if (dse instanceof IntegerElement) {
			IntegerElement dsetmp = (IntegerElement) dse ;
			return dsetmp.getName();
			}
		
		if (dse instanceof BCoolOperatorArg) {
			BCoolOperatorArg dsetmp= (BCoolOperatorArg) dse; 
			return dsetmp.getName();
			}

		return "naddda";
	}	
	
}
