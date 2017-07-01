/*
 * generated by Xtext
 */
package org.eclipse.gemoc.bcool.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gemoc.bcool.model.bcool.BCoolLibrary;
import org.eclipse.gemoc.bcool.model.bcool.BcoolPackage;
import org.eclipse.gemoc.bcool.model.bcool.ExpressionDeclaration;
import org.eclipse.gemoc.bcool.model.bcool.ExpressionDefinition;
import org.eclipse.gemoc.bcool.model.bcool.RelationDeclaration;
import org.eclipse.gemoc.bcool.model.bcool.RelationDefinition;
import org.eclipse.gemoc.bcool.services.BCOoLLibGrammarAccess;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BCOoLLibSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BCOoLLibGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BcoolPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BcoolPackage.BCOOL_LIBRARY:
				sequence_BCoolLibrary(context, (BCoolLibrary) semanticObject); 
				return; 
			case BcoolPackage.EXPRESSION_DECLARATION:
				sequence_ExpressionDeclaration(context, (ExpressionDeclaration) semanticObject); 
				return; 
			case BcoolPackage.EXPRESSION_DEFINITION:
				sequence_ExpressionDefinition(context, (ExpressionDefinition) semanticObject); 
				return; 
			case BcoolPackage.RELATION_DECLARATION:
				sequence_RelationDeclaration(context, (RelationDeclaration) semanticObject); 
				return; 
			case BcoolPackage.RELATION_DEFINITION:
				sequence_RelationDefinition(context, (RelationDefinition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BCoolLibrary returns BCoolLibrary
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (expressionDefinitions+=ExpressionDefinition expressionDefinitions+=ExpressionDefinition*)? 
	 *         (relationDefinitions+=RelationDefinition relationDefinitions+=RelationDefinition*)? 
	 *         (relationDeclarations+=RelationDeclaration relationDeclarations+=RelationDeclaration*)? 
	 *         (expressionDeclarations+=ExpressionDeclaration expressionDeclarations+=ExpressionDeclaration*)?
	 *     )
	 */
	protected void sequence_BCoolLibrary(ISerializationContext context, BCoolLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionDeclaration returns ExpressionDeclaration
	 *
	 * Constraint:
	 *     (name=ID (formalParameters+=[EObject|ID] formalParameters+=[EObject|ID]*)?)
	 */
	protected void sequence_ExpressionDeclaration(ISerializationContext context, ExpressionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionDefinition returns ExpressionDefinition
	 *
	 * Constraint:
	 *     definition=[ExpressionDeclaration|ID]
	 */
	protected void sequence_ExpressionDefinition(ISerializationContext context, ExpressionDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.EXPRESSION_DEFINITION__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.EXPRESSION_DEFINITION__DEFINITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationIDTerminalRuleCall_3_0_1(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RelationDeclaration returns RelationDeclaration
	 *
	 * Constraint:
	 *     (name=ID (formalParameters+=[EObject|ID] formalParameters+=[EObject|ID]*)?)
	 */
	protected void sequence_RelationDeclaration(ISerializationContext context, RelationDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationDefinition returns RelationDefinition
	 *
	 * Constraint:
	 *     definition=[RelationDeclaration|ID]
	 */
	protected void sequence_RelationDefinition(ISerializationContext context, RelationDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.RELATION_DEFINITION__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.RELATION_DEFINITION__DEFINITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationIDTerminalRuleCall_3_0_1(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
}
