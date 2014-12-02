package org.gemoc.bcool.model.xtext.jvmmodel

import com.google.inject.Inject
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.gemoc.bcool.model.bcool.BCoolCompositionRule
import org.gemoc.bcool.model.bcool.BCoolSpecification
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.ClassifierContextDeclCS
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.impl.JvmUnknownTypeReferenceImplCustom
import org.eclipse.xtext.common.types.JvmTypeReference
import org.gemoc.bcool.model.bcool.BCoolOperator
import org.eclipse.xtext.xbase.XExpression
import java.util.ArrayList
import java.util.List
import java.util.HashMap
import java.util.Map
import org.eclipse.xtext.common.types.JvmGenericType
import fr.inria.aoste.timesquare.ECL.ECLDocument
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtend.typesystem.emf.EcoreUtil2
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.ETypeParameter

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class BCOoLJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	
	@Inject extension TypeReferences typeRefs
	
	
	private Map<String, JvmGenericType> inferedObject = new HashMap
	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
   	def dispatch void infer(BCoolCompositionRule rule, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		inferedObject.clear()
   		for(eo : rule.eContents + rule.eCrossReferences){
			eo.inferEObject(acceptor,isPreIndexingPhase)
		}
			
			
		val type = rule.toClass(rule.eClass.myQualifiedName)
//		print(rule.myQualifiedName)
   		inferedObject.put(rule.myQualifiedName,type)
   		acceptor.accept(
   			type
   		).initializeLater[
  			
			members += rule.toMethod("f_"+rule.name, rule.newTypeRef(Boolean::TYPE))[
				body = rule.matchingRule.condition
			]
			
			for(eo : rule.eContents + rule.eCrossReferences){
				if(eo.containsNameAttribute()){
					val jvmType =inferedObject.get(eo.myQualifiedName)
   						if(jvmType != null){
		   					var typeRef= jvmType.createTypeRef()
   							var m = eo.toField(eo.EOName, typeRef)
   							m.setVisibility(JvmVisibility.PUBLIC);
   							members+=m
//   							print("members bcoolrule: "+ eo.EOName+"("+jvmType+") ->"+typeRef+"\n")
						}
				}
			}
   	  			members += rule.toToStringMethod(it)
  			]
  			
  			
   	}
   	
   	
   	var String importedNSURI =null
   	
	def dispatch private void inferEObject(DefPropertyCS eo, IJvmDeclaredTypeAcceptor acceptor,
		boolean isPreIndexingPhase) {
		if (eo.eContainer != null) {
			var tempURI = (eo.eContainer.eContainer.eContainer as ECLDocument).ownedImport.get(0).pathName.toString
			importedNSURI = tempURI.substring(1, tempURI.length - 1)
		} else {
			importedNSURI = "notSet"
		}
		val na = eo.myQualifiedName
		var alreadyExists = inferedObject.containsKey(na)
		if (!(alreadyExists)) {
			inferedObject.put(na, null) //just to avoid infinite loop
			val ClassifierContextDeclCS context = eo.classifierContextDecl
			if (context != null) {
				for (cr : context.eCrossReferences) {
					cr.inferEObject(acceptor, isPreIndexingPhase)
				}
			}
			
			val type = eo.toClass("org.gemoc.behavioralInterface.DSE")
			inferedObject.put(na, type)
			acceptor.accept(
				type
			).initializeLater [
				if (context != null) {
					for (cr : context.eCrossReferences) {
						var JvmGenericType jvmType = null
						if (cr instanceof org.eclipse.ocl.examples.pivot.Class &&
							(cr as org.eclipse.ocl.examples.pivot.Class).ETarget != null) {
							jvmType = inferedObject.get(
								(cr as org.eclipse.ocl.examples.pivot.Class).ETarget.myQualifiedName)
						} else {
							jvmType = inferedObject.get(cr.myQualifiedName)
						}

						if (jvmType != null) {
							var typeRef = jvmType.createTypeRef()
							var m = cr.toField(cr.EOName, cloneWithProxies(typeRef))
							m.setVisibility(JvmVisibility.PUBLIC);
							members += m
						}
					}
				}
				members += eo.toToStringMethod(it)
			]
		}
	}
   	
   	
   	
   	
def dispatch private void inferEObject(EClass clazz, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
	val na = clazz.myQualifiedName
	
	var alreadyExists = inferedObject.containsKey(na)
	if(!(alreadyExists)){
   		inferedObject.put(na,null) //just to avoid infinite loop		

		for(sup : clazz.ESuperTypes){
			sup.inferEObject(acceptor,isPreIndexingPhase)
		}
		for(nestedEo : clazz.eContents+clazz.eCrossReferences){
			if((!(nestedEo instanceof EOperation)) && nestedEo.containsNameAttribute()){
				nestedEo.inferEObject(acceptor,isPreIndexingPhase)
			}
		}
		for(nestedOp : clazz.EOperations){
			if(nestedOp.EType != null){
				nestedOp.EType.inferEObject(acceptor,isPreIndexingPhase)
			}
		}

   		val type = clazz.toClass(clazz.myQualifiedName)
   		inferedObject.put(na,type)
   		acceptor.accept(
   			type
   		).initializeLater[

		for(sup : clazz.ESuperTypes){
			val jvmType =inferedObject.get(sup.myQualifiedName)
			if(jvmType != null){
				var typeRef= jvmType.createTypeRef()
				it.superTypes += typeRef.cloneWithProxies			
			}
		}

		for(nestedEo : clazz.eContents+clazz.eCrossReferences){
			if((!(nestedEo instanceof EOperation)) && nestedEo.containsNameAttribute()){
				val jvmType =inferedObject.get(nestedEo.myQualifiedName)
				if(jvmType != null){
					var typeRef= jvmType.createTypeRef()
					var m = nestedEo.toField(nestedEo.EOName, typeRef.cloneWithProxies)
					m.setVisibility(JvmVisibility.PUBLIC);
					members+=m
				}
			}
		}
		
		for(nestedOp : clazz.EOperations){
			val jvmType = inferedObject.get(nestedOp.EType.myQualifiedName)
			if(jvmType != null){
				var typeRef= jvmType.createTypeRef()
				var m = clazz.toMethod(nestedOp.EOName, typeRef.cloneWithProxies)[]
				m.setVisibility(JvmVisibility.PUBLIC);
				members+=m
			}
		}
		members += clazz.toToStringMethod(it)
		]
	}
}
   	
   	
   	
   	
   	
synchronized def dispatch private void inferEObject(org.eclipse.ocl.examples.pivot.Class pivot,
		IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val na = pivot.myQualifiedName
		var alreadyExists = inferedObject.containsKey(na)
		if (!(alreadyExists)) {
			inferedObject.put(na, null) //just to avoid infinite loop

			var EObject linkedEO = null
			var set = pivot.eResource.resourceSet
			if (set != null) {
				set.getPackageRegistry().put(importedNSURI, set.getPackageRegistry().getEPackage(importedNSURI));
				for (r : set.resources) {
					if (r.URI.toString.startsWith(importedNSURI)) {
						var iter = r.allContents
						while (iter.hasNext) {
							val eo = iter.next
							if ((eo.ecoreQualifiedName == pivot.ecoreQualifiedName)) {
								if (eo instanceof org.eclipse.ocl.examples.pivot.Class &&
									(eo as org.eclipse.ocl.examples.pivot.Class).ETarget != null) {
									linkedEO = (eo as org.eclipse.ocl.examples.pivot.Class).ETarget
								} else {
									linkedEO = eo
								}

								var nestedAlreadyExists = inferedObject.containsKey(eo.myQualifiedName)
								if (!(nestedAlreadyExists)) {
									if (eo instanceof org.eclipse.ocl.examples.pivot.Class &&
										(eo as org.eclipse.ocl.examples.pivot.Class).ETarget != null) {
										(eo as org.eclipse.ocl.examples.pivot.Class).ETarget.eClass.
											inferEObject(acceptor, isPreIndexingPhase)
										(eo as org.eclipse.ocl.examples.pivot.Class).ETarget.inferEObject(acceptor,
											isPreIndexingPhase)
									} else {
										eo.eClass.inferEObject(acceptor, isPreIndexingPhase)
										eo.inferEObject(acceptor, isPreIndexingPhase)
									}
								}
							}
						}
						if (linkedEO != null) {
							val flinkedEO = linkedEO
							var typeOK = inferedObject.get(flinkedEO.myQualifiedName)
							acceptor.accept(
								typeOK
							).initializeLater [
								for (nestedEo : flinkedEO.eContents + flinkedEO.eCrossReferences) {
									if (nestedEo.containsNameAttribute()) {
										val jvmType = inferedObject.get(nestedEo.myQualifiedName)
										if (jvmType != null) {
											var typeRef = jvmType.createTypeRef()
											var m = nestedEo.toField(nestedEo.EOName, cloneWithProxies(typeRef))
											m.setVisibility(JvmVisibility.PUBLIC);
											members += m
										}
									}
								}
								members += flinkedEO.toToStringMethod(it)
							]
						}

					}
				}
			}
		}
	}
   	
   	
   	
   	
   	
   	
   	
def dispatch private void inferEObject(EObject eo, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   	if(eo.containsNameAttribute()){
   		val na = eo.myQualifiedName
   		var alreadyExists = inferedObject.containsKey(na)
   		if(!(alreadyExists)){
	   		inferedObject.put(na,null) //just to avoid infinite loop
	   		for(nestedEo : eo.eContents+eo.eCrossReferences){
	   			nestedEo.inferEObject(acceptor,isPreIndexingPhase)
	   		}
	   		
	   		var JvmGenericType type = null
		   	switch eo{
				EAttribute:{
		   			eo.EAttributeType.inferEObject(acceptor,isPreIndexingPhase)
		   			type = eo.toClass(eo.EAttributeType.myQualifiedName)
		   		}
			    EDataType:{
			    	if(eo.myQualifiedName.toString().endsWith("String")){
			    		type = eo.toClass("java.lang.String")
			    	}else{
		   				type = eo.toClass(eo.myQualifiedName)
	   				}
			   	}
			   	EReference:{
			   		eo.EReferenceType.inferEObject(acceptor,isPreIndexingPhase)
		   			type = eo.toClass(eo.EReferenceType.myQualifiedName)	
			   	}
			   	ETypeParameter:{
		   			type = eo.toClass(eo.myQualifiedName)
		   		}
		   		EEnumLiteral:{
		   			type = eo.toClass(eo.myQualifiedName)
		   		}
	   		}
		   	
   			inferedObject.put(na,type)
	   		acceptor.accept(
	   			type
	   		).initializeLater[
	   			for(nestedEo : eo.eContents+eo.eCrossReferences){	
   				if(nestedEo.containsNameAttribute()){
   					val jvmType =inferedObject.get(nestedEo.myQualifiedName)
   					if(jvmType != null){
   						var typeRef= jvmType.createTypeRef()
   						var m = nestedEo.toField(nestedEo.EOName, it.newTypeRef())
   						m.setVisibility(JvmVisibility.PUBLIC);
   						members+=m
					}
				}
				}
				members += eo.toToStringMethod(it)
	   		]
		}
   	}
}	
   		
   		
   		
   		
//   		eo.eClass.inferEObject(acceptor,isPreIndexingPhase)
////   		inferedObject.get(eo.eClass.myQualifiedName)
//   		var type = eo.toClass(eo.eClass.myQualifiedName)
//   		inferedObject.put(na,type)
//   		acceptor.accept(
//   			type
//   		).initializeLater[
//   			
//   			for(nestedEo : eo.eContents+eo.eCrossReferences){
//   				if(nestedEo.containsNameAttribute()){
//   					val jvmType =inferedObject.get(nestedEo.myQualifiedName)
//   					if(jvmType != null){
//   						var typeRef= jvmType.createTypeRef()
//   						var m = nestedEo.toField(nestedEo.EOName, cloneWithProxies(typeRef))
//   						m.setVisibility(JvmVisibility.PUBLIC);
//   						members+=m
//					}
//   				}
//   			}
//   			members += eo.toToStringMethod(it)
//   		]
//   		
//   		}
//	}			
//   	}
   	
   	def private boolean containsNameAttribute(EObject eo){
   		for (feat : eo.eClass.EAllStructuralFeatures){
   			if (feat.name == "name"){
   				return true
   			}
   		}
   		return false
   	}
   	
   	def private String getEOName(EObject eo) {
		if (eo != null) {
			for (feat : eo.eClass.EAllStructuralFeatures) {
				if (feat.name == "name") {
					var res = eo.eGet(feat) as String
					if (res == null) {
						res = "noName" + eo.eClass.name
					}
					return res
				}
			}
			return "noName" + eo.eClass.name
		} else {
			return "null_"
		}
   	
   	}
   	
   	
   	
   	def private String myQualifiedName(EObject eo){
		if(eo != null){
		var String res=eo.EOName
		var currentEo = eo
		while(currentEo.eContainer != null ){
			currentEo = currentEo.eContainer
			res = currentEo.EOName +"."+res
		}
	return res
   	}else{
   	return "nullQN"	
   	}
   	
   	}
   	
   	
   		def private String ecoreQualifiedName(EObject p){

   			var String res=p.EOName
   			var currentEo = p
   			while(currentEo.eContainer != null && currentEo.eContainer.eContainer != null){
   				currentEo = currentEo.eContainer
   				res = currentEo.EOName +"::"+res
   			}
   			return res
//   		}
   	}
   	
}

