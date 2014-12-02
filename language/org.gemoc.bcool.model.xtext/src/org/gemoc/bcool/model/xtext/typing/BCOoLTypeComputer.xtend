
package org.gemoc.bcool.model.xtext.typing

import com.google.inject.Singleton
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.impl.XVariableDeclarationImplCustom
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.conformance.ConformanceHint
import org.eclipse.xtext.xbase.typesystem.references.AnyTypeReference
import org.gemoc.bcool.model.bcool.BCoolCompositionRule

/**
* Custom version of type computer for Custom XExpressions
* introduced by BCOoL
*/
@Singleton
class BCOoLTypeComputer extends XbaseWithAnnotationsTypeComputer {
	
	override computeTypes(XExpression expression, ITypeComputationState state) {
		switch (expression) {
			XBlockExpression: expression._computeTypes(state)
			default: super.computeTypes(expression, state)
		}
	}

override void _computeTypes(XBlockExpression b, ITypeComputationState typeState) {
		var state = typeState
		
		if (b.eContainer.eContainer instanceof BCoolCompositionRule) {
			val compoRule = b.eContainer.eContainer as BCoolCompositionRule
			for (dse : compoRule.DSEs) {
				// insert the dse in the scope
						val XVariableDeclaration decl = new XVariableDeclarationImplCustom()
						decl.name = dse.name
						addLocalToCurrentScope(decl, state);
			}
		}

		//super._computeTypes(b, state)
		// this is copied (and translated to Xtend) from the base class
		for (expectation : state.getExpectations()) {
			val expectedType = expectation.getExpectedType();
			if (expectedType != null && expectedType.isPrimitiveVoid()) {
				val expressions = b.getExpressions();
				if (!expressions.isEmpty()) {
					for (XExpression expression : expressions) {
						val expressionState = state.withoutExpectation(); // no expectation
						expressionState.computeTypes(expression);
						expression.addVariableDeclarationsToScope(state);
					}
				}
				expectation.acceptActualType(getPrimitiveVoid(state), ConformanceHint.CHECKED, ConformanceHint.SUCCESS);
			} else {
				val expressions = b.getExpressions();
				if (!expressions.isEmpty()) {
					for (XExpression expression : expressions.subList(0, expressions.size() - 1)) {
						val expressionState = state.withoutExpectation();
						expressionState.computeTypes(expression);
						expression.addVariableDeclarationsToScope(state);
					}
					val lastExpression = IterableExtensions.last(expressions);
					state.computeTypes(lastExpression);

					// add the last expression to the scope, too in order validate for duplicate names, even
					// though the variable declaration could be removed automatically to keep only the side effect
					// of the initializer
					lastExpression.addVariableDeclarationsToScope(state);
				} else {
					expectation.acceptActualType(new AnyTypeReference(expectation.getReferenceOwner()),
						ConformanceHint.UNCHECKED);
				}
			}
		}
	}

	protected def void addVariableDeclarationsToScope(XExpression e, ITypeComputationState state) {
		switch (e) {
			XVariableDeclaration:
				addLocalToCurrentScope(e, state)
//			BCoolCompositionRule: {
//				for (exp : e.DSEs) {
//						val XVariableDeclaration decl = new XVariableDeclarationImplCustom()
//						decl.name = exp.name
//						addLocalToCurrentScope(decl, state);
//				}
//			}
		}
	}



}