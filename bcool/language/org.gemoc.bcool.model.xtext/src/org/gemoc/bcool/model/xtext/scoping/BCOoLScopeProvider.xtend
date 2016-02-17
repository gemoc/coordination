/*
 * generated by Xtext
 */
package org.gemoc.bcool.model.xtext.scoping

import fr.inria.aoste.timesquare.ECL.ECLDocument
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS
import org.eclipse.xtext.scoping.IScope
import org.gemoc.bcool.model.bcool.BCoolOperatorArg
import org.gemoc.bcool.model.xtext.helpers.BCoolXtextHelper
import org.gemoc.gexpressions.xtext.scoping.GExpressionsScopeProvider
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.impl.FilteringScope
import org.eclipse.xtext.resource.IEObjectDescription
import com.google.common.base.Predicate
import org.eclipse.emf.ecore.EPackage

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 * 
 */
class BCOoLScopeProvider extends GExpressionsScopeProvider {
	private static Map<URI, Set<EClassifier>> eclClassifiersMapping = new HashMap()
	

		
	/**
	 * Scope for a BCool Operator argument (an ECL event under the hood). Present all the features and operations of the context in which it is defined.
	 */
	def protected dispatch IScope getNavigationScopeForEObject(BCoolOperatorArg operatorArgument, IScope outerScope) {
		val eclEvent = operatorArgument.DSE
		loadEclResourceIfNecessary(eclEvent)

		val  EClassifier context = getEClassifierFromName(eclEvent)

		return getScopeOfNavigableElementsForType(context, outerScope)
	}

/**
 * Scope for DSE. It presents only the DSE from the corresponding interface.
 */
def IScope scope_BCoolOperatorArg_DSE(BCoolOperatorArg reference, EReference eRef){
	val interface = reference.interface
	val importedURI =  interface.importURI.substring(0, interface.importURI.length)

	return new FilteringScope(delegateGetScope(reference, eRef), new Predicate<IEObjectDescription>() {
                               override public boolean apply(IEObjectDescription input) {
                               			val r = input.EObjectURI.toString
                                       if (r.contains(importedURI)) { return true } else { return false }}});
	}

//	
// TODO:
// If we eleminate the QualifyName to look for the EventRelaation, then, we have to write correctly the scoping.
// This can help for sketching.	
//
//	def IScope scope_EventRelation_declaration(EventRelation reference, EReference eRef) {
//		return new FilteringScope(delegateGetScope(reference, eRef), new Predicate<IEObjectDescription>() {
 //                              override public boolean apply(IEObjectDescription input) {
  //                                     if (input.EClass.name.equals("EventRelation")) { return true } else { return false }}});
//	}
	
	
		//def protected dispatch IScope getNavigationScopeForEventRelation(CoordinationRule context, EventRelation reference)) {
		//	super.delegateGetScope(operatorArgument,outerScope)
        //return operatorArgument.delegateGetScope(operatorArgument.)
		//loadEclResourceIfNecessary(eclEvent)
       //operator.getNavigationScopeForEObject(outerScope)
		//val EClassifier context = getEClassifierFromName(eclEvent)

		//return getScopeOfNavigableElementsForType(context, outerScope)
	//}
	
	
	
	
	/**
	 * Load the ECL resource owning the given ECL event if not already done.
	 */
	def private void loadEclResourceIfNecessary(DefPropertyCS eclEvent) {
		if (eclClassifiersMapping.containsKey(eclEvent.eResource.URI)) {
			return
		} else {
			
			val quotedURI = (eclEvent.eContainer.eContainer.eContainer as ECLDocument).ownedImport.get(0).pathName.toString
			val importedURI = quotedURI.substring(1, quotedURI.length - 1)
			val pivotOfEclEvent = eclEvent.classifierContextDecl.pivot

			val resourceSet = pivotOfEclEvent.eResource.resourceSet

			// we get the EPackage that corresponds with the URI
			val epack = resourceSet.getPackageRegistry().getEPackage(importedURI) as EPackage
			val setOfClassifiers = new HashSet()
			
			// we get the EClassifiers	
			epack.EClassifiers.forEach[classifier | setOfClassifiers.add (classifier as EClassifier)]
			eclClassifiersMapping.put(eclEvent.eResource.URI, setOfClassifiers)
		}
	}

	/**
	 * Retrieve EClassifier context of the given ECL event.
	 */
	def private EClassifier getEClassifierFromName(DefPropertyCS eclEvent) {
		// All the EClassifiers used in the ECL Specification owning the given ECL event.
		val possibleClassifiers = eclClassifiersMapping.get(eclEvent.eResource.URI)
		// Name of the context according to the ECL file
		val nameOfContextOfEclEvent = BCoolXtextHelper.parseContextName(eclEvent.classifierContextDecl)
		// Filter by name the possible classifiers.
		val legitClassifiers = possibleClassifiers.filter [ possibleClassifier |
			possibleClassifier.name.equals(nameOfContextOfEclEvent)
		]
		if (legitClassifiers.size != 1) {
			throw new RuntimeException("Found 0 or more than 1 possible classifier for " + eclEvent)
		}
		return legitClassifiers.get(0)
	}
}
 