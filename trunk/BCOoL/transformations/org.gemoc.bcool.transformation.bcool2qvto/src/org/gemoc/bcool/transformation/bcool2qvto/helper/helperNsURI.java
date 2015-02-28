package org.gemoc.bcool.transformation.bcool2qvto.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
	
	
	public String XexpressiontoString (XExpression exp ){
	String leftoper = "";
	String rightoper = "";
	String binaryoperstr = "";
	
		if (exp instanceof XBinaryOperation) {
			XBinaryOperation binaryoper = (XBinaryOperation) exp;
			XExpression _leftOperand = ((XBinaryOperation)exp).getLeftOperand();
			XMemberFeatureCall left = ((XMemberFeatureCall) _leftOperand);
			XExpression _memberCallTarget = left.getMemberCallTarget();
	        XMemberFeatureCall atributo = ((XMemberFeatureCall) _memberCallTarget);
	        XExpression _memberCallTarget_1 = atributo.getMemberCallTarget();
	        XMemberFeatureCall contexto = ((XMemberFeatureCall) _memberCallTarget_1);
	        XExpression _memberCallTarget_2 = contexto.getMemberCallTarget();
	        XFeatureCall dse = ((XFeatureCall) _memberCallTarget_2);
	        leftoper = dse.getConcreteSyntaxFeatureName() + "." + atributo.getConcreteSyntaxFeatureName();
			
	        XExpression _rightOperand = ((XBinaryOperation)exp).getRightOperand();
			XMemberFeatureCall right = ((XMemberFeatureCall) _rightOperand);
			XExpression _memberCallTargetright = right.getMemberCallTarget();
	        XMemberFeatureCall atributoright = ((XMemberFeatureCall) _memberCallTargetright);
	        XExpression _memberCallTarget_1right = atributoright.getMemberCallTarget();
	        XMemberFeatureCall contextoright = ((XMemberFeatureCall) _memberCallTarget_1right);
	        XExpression _memberCallTarget_2right = contextoright.getMemberCallTarget();
	        XFeatureCall dseright = ((XFeatureCall) _memberCallTarget_2right);
	        rightoper = dseright.getConcreteSyntaxFeatureName() + "." + atributoright.getConcreteSyntaxFeatureName();
	        
	        binaryoperstr = binaryoper.getConcreteSyntaxFeatureName();
	        if (binaryoperstr.startsWith("==")) {return leftoper+ "=" + rightoper;  }
	        if (binaryoperstr.startsWith("!=")) {return leftoper+ "<>" + rightoper;  }
	        
	        
		}
		return "not valid XExpression";
	}
	
	public String GexpressiontoString (GExpression exp ){
		//GEqualityExpression binaryoper = null;
		//GAndExpression tmpoper = null;
		String s = "";
		String m = "";
		  GExpressionsStandaloneSetup setup = new GExpressionsStandaloneSetup();
		
		   Injector injector = setup.createInjectorAndDoEMFRegistration();
	       Serializer serializer = injector.getInstance(Serializer.class);
	       //GEqualityExpression  gexp = (GEqualityExpression) exp;
	       
	      // GexpressionsFactory factory = GexpressionsFactory.eINSTANCE;
           //GAdditionExpression exph = factory.createGAdditionExpression();
           //GIntegerExpression un = factory.createGIntegerExpression();
           //un.setValue(1);
           //GStringExpression deux = factory.createGStringExpression();
           //deux.setValue("deux");
           //exph.setLeftOperand(un);
           //exph.setRightOperand(deux);
	       
	      // GExpression gexpp = gexp.;
	       
	      try {  
	    	  
	    	  if (exp instanceof GEqualityExpression) {
	    		GEqualityExpression  gexp = (GEqualityExpression) exp;
	    		  m = serializer.serialize(gexp.getLeftOperand());
	    		  m = m + "=";
	    		  m = m + serializer.serialize(gexp.getRightOperand());
	    	  } else if (exp instanceof GAndExpression) {
	    		  GAndExpression  gexpand = (GAndExpression) exp;
	    		  m = serializer.serialize(gexpand.getLeftOperand());
	    		  m = m + "and";
	    		  m = m + serializer.serialize(gexpand.getRightOperand());
	    	  }else if (exp instanceof GBraceExpression){
	    		  GBraceExpression  gexpra = (GBraceExpression) exp;
	    		  m = serializer.serialize(gexpra.getInnerExpression());
	    		//  m = m + "and";
	    		 // m = m + serializer.serialize(gexpra.getRightOperand());
	    		  
	    	  }
	    		
	    		//  binaryoper = (GEqualityExpression) gexp.getInnerExpression();	
	    		 // if (gexp.getInnerExpression() instanceof GAndExpression) {
	    		//	  tmpoper  = (GAndExpression) gexp.getInnerExpression();
	    		//	  s = serializer.serialize(tmpoper);
	    		 // } else {
	    			//  binaryoper = (GEqualityExpression) gexp.getInnerExpression();	
	    			//  s = serializer.serialize(binaryoper);
	    		 // }
	    	  
	    	 
			
	    	  } catch (Exception ex) { // fall back:  
	    		  ex.printStackTrace();
	    		  //s = gexp.getInnerExpression().toString(); 
	    		  //s =  exp.getClass().getSimpleName()+'@'+exp.hashCode();  
	    	  }
		s = m.replace(" ", "");
		return s;
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
