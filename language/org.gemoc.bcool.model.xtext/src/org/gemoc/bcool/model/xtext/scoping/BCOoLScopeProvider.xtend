/*
 * generated by Xtext
 */
package org.gemoc.bcool.model.xtext.scoping

import org.gemoc.gel.gexpressions.GReferenceExpression
import org.eclipse.xtext.scoping.IScope
import fr.inria.aoste.timesquare.ECL.ECLDefCS
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.ClassifierContextDeclCS
import org.eclipse.xtext.scoping.Scopes
import org.gemoc.bcool.model.bcool.BCoolOperatorArg
import org.eclipse.emf.ecore.EObject

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
 
class BCOoLScopeProvider extends org.gemoc.gel.gexpressions.xtext.scoping.GExpressionsScopeProvider {

def protected dispatch IScope getNavigationScopeForEObject(BCoolOperatorArg eo, IScope outerScope) {
       val eclEvent = (eo.DSE.eContainer as ClassifierContextDeclCS).classifier
       val contentList = eclEvent.eAllContents.toList
        for (c : eclEvent.superClass){
            contentList.addAll(c.eAllContents.toList)
        }
        return Scopes.scopeFor(contentList)
}


	def getAllElem(EObject eo){
		//if(eo.)
	}


}
 