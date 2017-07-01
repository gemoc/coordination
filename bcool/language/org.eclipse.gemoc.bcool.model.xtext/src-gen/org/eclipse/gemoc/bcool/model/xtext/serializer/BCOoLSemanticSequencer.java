/*
 * generated by Xtext
 */
package org.eclipse.gemoc.bcool.model.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gemoc.bcool.model.bcool.BCoolCompositionRule;
import org.eclipse.gemoc.bcool.model.bcool.BCoolOperator;
import org.eclipse.gemoc.bcool.model.bcool.BCoolOperatorArg;
import org.eclipse.gemoc.bcool.model.bcool.BCoolSpecification;
import org.eclipse.gemoc.bcool.model.bcool.BcoolPackage;
import org.eclipse.gemoc.bcool.model.bcool.CoordinationRule;
import org.eclipse.gemoc.bcool.model.bcool.EventExpression;
import org.eclipse.gemoc.bcool.model.bcool.EventRelation;
import org.eclipse.gemoc.bcool.model.bcool.ImportInterfaceStatement;
import org.eclipse.gemoc.bcool.model.bcool.ImportLibStatement;
import org.eclipse.gemoc.bcool.model.bcool.MatchingRule;
import org.eclipse.gemoc.bcool.model.xtext.services.BCOoLGrammarAccess;
import org.eclipse.gemoc.gexpressions.GAdditionExpression;
import org.eclipse.gemoc.gexpressions.GAndExpression;
import org.eclipse.gemoc.gexpressions.GBooleanExpression;
import org.eclipse.gemoc.gexpressions.GBraceExpression;
import org.eclipse.gemoc.gexpressions.GDoubleExpression;
import org.eclipse.gemoc.gexpressions.GEnumLiteralExpression;
import org.eclipse.gemoc.gexpressions.GEqualityExpression;
import org.eclipse.gemoc.gexpressions.GIfExpression;
import org.eclipse.gemoc.gexpressions.GImportStatement;
import org.eclipse.gemoc.gexpressions.GIntegerExpression;
import org.eclipse.gemoc.gexpressions.GMultiplicationExpression;
import org.eclipse.gemoc.gexpressions.GNavigationExpression;
import org.eclipse.gemoc.gexpressions.GNegationExpression;
import org.eclipse.gemoc.gexpressions.GOrExpression;
import org.eclipse.gemoc.gexpressions.GProgram;
import org.eclipse.gemoc.gexpressions.GReferenceExpression;
import org.eclipse.gemoc.gexpressions.GRelationExpression;
import org.eclipse.gemoc.gexpressions.GStringExpression;
import org.eclipse.gemoc.gexpressions.GXorExpression;
import org.eclipse.gemoc.gexpressions.GexpressionsPackage;
import org.eclipse.gemoc.gexpressions.xtext.serializer.GExpressionsSemanticSequencer;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSPackage;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BCOoLSemanticSequencer extends GExpressionsSemanticSequencer {

	@Inject
	private BCOoLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BcoolPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BcoolPackage.BCOOL_COMPOSITION_RULE:
				sequence_BCoolCompositionRule(context, (BCoolCompositionRule) semanticObject); 
				return; 
			case BcoolPackage.BCOOL_OPERATOR:
				sequence_BCoolOperatorSpec(context, (BCoolOperator) semanticObject); 
				return; 
			case BcoolPackage.BCOOL_OPERATOR_ARG:
				sequence_BCoolOperatorArg(context, (BCoolOperatorArg) semanticObject); 
				return; 
			case BcoolPackage.BCOOL_SPECIFICATION:
				sequence_BCoolSpec(context, (BCoolSpecification) semanticObject); 
				return; 
			case BcoolPackage.COORDINATION_RULE:
				sequence_CoordinationRule(context, (CoordinationRule) semanticObject); 
				return; 
			case BcoolPackage.EVENT_EXPRESSION:
				sequence_EventExpression(context, (EventExpression) semanticObject); 
				return; 
			case BcoolPackage.EVENT_RELATION:
				sequence_EventRelation(context, (EventRelation) semanticObject); 
				return; 
			case BcoolPackage.IMPORT_INTERFACE_STATEMENT:
				sequence_ImportInterfaceRule(context, (ImportInterfaceStatement) semanticObject); 
				return; 
			case BcoolPackage.IMPORT_LIB_STATEMENT:
				sequence_ImportLibRule(context, (ImportLibStatement) semanticObject); 
				return; 
			case BcoolPackage.MATCHING_RULE:
				sequence_MatchingRule(context, (MatchingRule) semanticObject); 
				return; 
			}
		else if (epackage == CompleteOCLCSPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CompleteOCLCSPackage.DEF_PROPERTY_CS:
				sequence_globalDSEsRule(context, (DefPropertyCS) semanticObject); 
				return; 
			}
		else if (epackage == GexpressionsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GexpressionsPackage.GADDITION_EXPRESSION:
				sequence_GAdditionExpression(context, (GAdditionExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GAND_EXPRESSION:
				sequence_GAndExpression(context, (GAndExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GBOOLEAN_EXPRESSION:
				sequence_GBooleanExpression(context, (GBooleanExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GBRACE_EXPRESSION:
				sequence_GBraceExpression(context, (GBraceExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GDOUBLE_EXPRESSION:
				sequence_GDoubleExpression(context, (GDoubleExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GENUM_LITERAL_EXPRESSION:
				sequence_GEnumLiteralExpression(context, (GEnumLiteralExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GEQUALITY_EXPRESSION:
				sequence_GEqualityExpression(context, (GEqualityExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GIF_EXPRESSION:
				sequence_GIfExpression(context, (GIfExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GIMPORT_STATEMENT:
				sequence_GImportStatement(context, (GImportStatement) semanticObject); 
				return; 
			case GexpressionsPackage.GINTEGER_EXPRESSION:
				sequence_GIntegerExpression(context, (GIntegerExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GMULTIPLICATION_EXPRESSION:
				sequence_GMultiplicationExpression(context, (GMultiplicationExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GNAVIGATION_EXPRESSION:
				sequence_GNavigationExpression(context, (GNavigationExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GNEGATION_EXPRESSION:
				sequence_GNegationExpression(context, (GNegationExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GOR_EXPRESSION:
				sequence_GOrExpression(context, (GOrExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GPROGRAM:
				sequence_GProgram(context, (GProgram) semanticObject); 
				return; 
			case GexpressionsPackage.GREFERENCE_EXPRESSION:
				sequence_GReferenceExpression(context, (GReferenceExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GRELATION_EXPRESSION:
				sequence_GRelationExpression(context, (GRelationExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GSTRING_EXPRESSION:
				sequence_GStringExpression(context, (GStringExpression) semanticObject); 
				return; 
			case GexpressionsPackage.GXOR_EXPRESSION:
				sequence_GXorExpression(context, (GXorExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BCoolCompositionRule returns BCoolCompositionRule
	 *
	 * Constraint:
	 *     (name=ID BCoolOperatorArgs+=BCoolOperatorArg BCoolOperatorArgs+=BCoolOperatorArg* matchingRule=MatchingRule coordinationRule=CoordinationRule)
	 */
	protected void sequence_BCoolCompositionRule(ISerializationContext context, BCoolCompositionRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BCoolOperatorArg returns BCoolOperatorArg
	 *
	 * Constraint:
	 *     (name=ID Interface=[ImportInterfaceStatement|ID] DSE=[DefPropertyCS|ID]? InterfaceClass=[EClass|STRING]?)
	 */
	protected void sequence_BCoolOperatorArg(ISerializationContext context, BCoolOperatorArg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BCoolOperatorSpec returns BCoolOperator
	 *
	 * Constraint:
	 *     (name=ID? globalEventExpressions+=globalEventExpressionRule? globalDSEs+=globalDSEsRule? bcoolCompositionRules+=BCoolCompositionRule+)
	 */
	protected void sequence_BCoolOperatorSpec(ISerializationContext context, BCoolOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BCoolSpec returns BCoolSpecification
	 *
	 * Constraint:
	 *     (name=ID? importsLib+=ImportLibRule+ importsBehavioralInterface+=ImportInterfaceRule+ bcoolOperators+=BCoolOperatorSpec+)
	 */
	protected void sequence_BCoolSpec(ISerializationContext context, BCoolSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CoordinationRule returns CoordinationRule
	 *
	 * Constraint:
	 *     eventRelations=EventRelation
	 */
	protected void sequence_CoordinationRule(ISerializationContext context, CoordinationRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.COORDINATION_RULE__EVENT_RELATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.COORDINATION_RULE__EVENT_RELATIONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0(), semanticObject.getEventRelations());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     globalEventExpressionRule returns EventExpression
	 *     EventExpression returns EventExpression
	 *
	 * Constraint:
	 *     (name=ID declaration=[ExpressionDeclaration|QualifiedName] (actualParameters+=[EObject|ID] actualParameters+=[EObject|ID]*)?)
	 */
	protected void sequence_EventExpression(ISerializationContext context, EventExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventRelation returns EventRelation
	 *
	 * Constraint:
	 *     (declaration=[RelationDeclaration|QualifiedName] (actualParameters+=[DefPropertyCS|ID] actualParameters+=[DefPropertyCS|ID]*)?)
	 */
	protected void sequence_EventRelation(ISerializationContext context, EventRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportInterfaceRule returns ImportInterfaceStatement
	 *
	 * Constraint:
	 *     (importURI=STRING name=ID)
	 */
	protected void sequence_ImportInterfaceRule(ISerializationContext context, ImportInterfaceStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.IMPORT_INTERFACE_STATEMENT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.IMPORT_INTERFACE_STATEMENT__IMPORT_URI));
			if (transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportInterfaceRuleAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.accept(grammarAccess.getImportInterfaceRuleAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImportLibRule returns ImportLibStatement
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ImportLibRule(ISerializationContext context, ImportLibStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.IMPORT_LIB_STATEMENT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.IMPORT_LIB_STATEMENT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportLibRuleAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MatchingRule returns MatchingRule
	 *
	 * Constraint:
	 *     (condition=GExpression filterEventExpressions+=EventExpression*)
	 */
	protected void sequence_MatchingRule(ISerializationContext context, MatchingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     globalDSEsRule returns DefPropertyCS
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_globalDSEsRule(ISerializationContext context, DefPropertyCS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BaseCSPackage.Literals.NAMED_ELEMENT_CS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BaseCSPackage.Literals.NAMED_ELEMENT_CS__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlobalDSEsRuleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}