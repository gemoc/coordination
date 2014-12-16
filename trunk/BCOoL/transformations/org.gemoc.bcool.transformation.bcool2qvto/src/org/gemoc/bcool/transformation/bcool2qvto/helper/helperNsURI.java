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
import org.gemoc.bcool.model.bcool.BCoolSpecification;
import org.gemoc.bcool.model.bcool.EventExpression;
import org.gemoc.bcool.model.bcool.ImportInterfaceStatement;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ECL.ECLDocument;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.BasicType.IntegerElement;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.BasicType.impl.IntegerImpl;
import fr.inria.aoste.timesquare.ecl.xtext.EclStandaloneSetup;

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
	
	public String getpackageIndex(ECLDocument eclDoc, String objectName){
		EList<PackageDeclarationCS> allpackages = eclDoc.getPackages();
		
		for(int i=0; i< allpackages.size(); i++){
			PackageDeclarationCS pdecl = allpackages.get(i);
			Package p = (Package) pdecl.getPackage();
			TreeIterator<EObject> it = ((EObject) p).eAllContents();
			while( it.hasNext()){
				EObject eo = it.next();
				String eoName = "";
				try {
					if(eo.getClass().getMethod("getName") != null){
						eoName = (String) eo.getClass().getMethod("getName").invoke(eo, new Object[]{});
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if ((eoName != null) && (eoName.compareTo(objectName)==0)){
					return (new Integer(i+1)).toString();
				}
			}
		}
		return (new Integer(1)).toString(); //1 is returned by default since we do not necessarly know the name of the rootElement and it is PAckage by default (for UML)
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
	
	public String DSEtoString (EObject dse ){
		if (dse instanceof JvmFieldImplCustom) {
		JvmFieldImplCustom dsetmp = (JvmFieldImplCustom) dse ;
		return dsetmp.getSimpleName();
		}
		
		if (dse instanceof EventExpression) {
			EventExpression dsetmp = (EventExpression) dse ;
			return dsetmp.getName();
			}
		
		if (dse instanceof IntegerImpl) {
			IntegerImpl dsetmp = (IntegerImpl) dse ;
			return dsetmp.getName();
			}

		return "nada";
	}	
	
}
