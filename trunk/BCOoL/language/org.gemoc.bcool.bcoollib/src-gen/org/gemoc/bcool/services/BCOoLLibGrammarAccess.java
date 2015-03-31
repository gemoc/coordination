/*
* generated by Xtext
*/
package org.gemoc.bcool.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class BCOoLLibGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class BCoolLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BCoolLibrary");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBCoolLibraryAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBCoolLibraryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExpressionDefinitionsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cExpressionDefinitionsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0 = (RuleCall)cExpressionDefinitionsAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cExpressionDefinitionsAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0 = (RuleCall)cExpressionDefinitionsAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cRelationDefinitionsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cRelationDefinitionsAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0 = (RuleCall)cRelationDefinitionsAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cRelationDefinitionsAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0 = (RuleCall)cRelationDefinitionsAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cRelationDeclarationsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cRelationDeclarationsAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0 = (RuleCall)cRelationDeclarationsAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cRelationDeclarationsAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0 = (RuleCall)cRelationDeclarationsAssignment_6_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cExpressionDeclarationsKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cExpressionDeclarationsAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0 = (RuleCall)cExpressionDeclarationsAssignment_7_2.eContents().get(0);
		private final Group cGroup_7_3 = (Group)cGroup_7.eContents().get(3);
		private final Keyword cCommaKeyword_7_3_0 = (Keyword)cGroup_7_3.eContents().get(0);
		private final Assignment cExpressionDeclarationsAssignment_7_3_1 = (Assignment)cGroup_7_3.eContents().get(1);
		private final RuleCall cExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0 = (RuleCall)cExpressionDeclarationsAssignment_7_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7_4 = (Keyword)cGroup_7.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//BCoolLibrary:
		//	{BCoolLibrary} "BCoolLibrary" name=ID "{" ("expressionDefinitions" "{" expressionDefinitions+=ExpressionDefinition
		//	("," expressionDefinitions+=ExpressionDefinition)* "}")? ("relationDefinitions" "{"
		//	relationDefinitions+=RelationDefinition ("," relationDefinitions+=RelationDefinition)* "}")? ("relationDeclarations"
		//	"{" relationDeclarations+=RelationDeclaration ("," relationDeclarations+=RelationDeclaration)* "}")?
		//	("expressionDeclarations" "{" expressionDeclarations+=ExpressionDeclaration (","
		//	expressionDeclarations+=ExpressionDeclaration)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{BCoolLibrary} "BCoolLibrary" name=ID "{" ("expressionDefinitions" "{" expressionDefinitions+=ExpressionDefinition (","
		//expressionDefinitions+=ExpressionDefinition)* "}")? ("relationDefinitions" "{" relationDefinitions+=RelationDefinition
		//("," relationDefinitions+=RelationDefinition)* "}")? ("relationDeclarations" "{"
		//relationDeclarations+=RelationDeclaration ("," relationDeclarations+=RelationDeclaration)* "}")?
		//("expressionDeclarations" "{" expressionDeclarations+=ExpressionDeclaration (","
		//expressionDeclarations+=ExpressionDeclaration)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{BCoolLibrary}
		public Action getBCoolLibraryAction_0() { return cBCoolLibraryAction_0; }

		//"BCoolLibrary"
		public Keyword getBCoolLibraryKeyword_1() { return cBCoolLibraryKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("expressionDefinitions" "{" expressionDefinitions+=ExpressionDefinition (","
		//expressionDefinitions+=ExpressionDefinition)* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"expressionDefinitions"
		public Keyword getExpressionDefinitionsKeyword_4_0() { return cExpressionDefinitionsKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//expressionDefinitions+=ExpressionDefinition
		public Assignment getExpressionDefinitionsAssignment_4_2() { return cExpressionDefinitionsAssignment_4_2; }

		//ExpressionDefinition
		public RuleCall getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0() { return cExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0; }

		//("," expressionDefinitions+=ExpressionDefinition)*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//expressionDefinitions+=ExpressionDefinition
		public Assignment getExpressionDefinitionsAssignment_4_3_1() { return cExpressionDefinitionsAssignment_4_3_1; }

		//ExpressionDefinition
		public RuleCall getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0() { return cExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//("relationDefinitions" "{" relationDefinitions+=RelationDefinition ("," relationDefinitions+=RelationDefinition)* "}")?
		public Group getGroup_5() { return cGroup_5; }

		//"relationDefinitions"
		public Keyword getRelationDefinitionsKeyword_5_0() { return cRelationDefinitionsKeyword_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//relationDefinitions+=RelationDefinition
		public Assignment getRelationDefinitionsAssignment_5_2() { return cRelationDefinitionsAssignment_5_2; }

		//RelationDefinition
		public RuleCall getRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0() { return cRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0; }

		//("," relationDefinitions+=RelationDefinition)*
		public Group getGroup_5_3() { return cGroup_5_3; }

		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }

		//relationDefinitions+=RelationDefinition
		public Assignment getRelationDefinitionsAssignment_5_3_1() { return cRelationDefinitionsAssignment_5_3_1; }

		//RelationDefinition
		public RuleCall getRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0() { return cRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }

		//("relationDeclarations" "{" relationDeclarations+=RelationDeclaration ("," relationDeclarations+=RelationDeclaration)*
		//"}")?
		public Group getGroup_6() { return cGroup_6; }

		//"relationDeclarations"
		public Keyword getRelationDeclarationsKeyword_6_0() { return cRelationDeclarationsKeyword_6_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }

		//relationDeclarations+=RelationDeclaration
		public Assignment getRelationDeclarationsAssignment_6_2() { return cRelationDeclarationsAssignment_6_2; }

		//RelationDeclaration
		public RuleCall getRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0() { return cRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0; }

		//("," relationDeclarations+=RelationDeclaration)*
		public Group getGroup_6_3() { return cGroup_6_3; }

		//","
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }

		//relationDeclarations+=RelationDeclaration
		public Assignment getRelationDeclarationsAssignment_6_3_1() { return cRelationDeclarationsAssignment_6_3_1; }

		//RelationDeclaration
		public RuleCall getRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0() { return cRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6_4() { return cRightCurlyBracketKeyword_6_4; }

		//("expressionDeclarations" "{" expressionDeclarations+=ExpressionDeclaration (","
		//expressionDeclarations+=ExpressionDeclaration)* "}")?
		public Group getGroup_7() { return cGroup_7; }

		//"expressionDeclarations"
		public Keyword getExpressionDeclarationsKeyword_7_0() { return cExpressionDeclarationsKeyword_7_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_7_1() { return cLeftCurlyBracketKeyword_7_1; }

		//expressionDeclarations+=ExpressionDeclaration
		public Assignment getExpressionDeclarationsAssignment_7_2() { return cExpressionDeclarationsAssignment_7_2; }

		//ExpressionDeclaration
		public RuleCall getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0() { return cExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0; }

		//("," expressionDeclarations+=ExpressionDeclaration)*
		public Group getGroup_7_3() { return cGroup_7_3; }

		//","
		public Keyword getCommaKeyword_7_3_0() { return cCommaKeyword_7_3_0; }

		//expressionDeclarations+=ExpressionDeclaration
		public Assignment getExpressionDeclarationsAssignment_7_3_1() { return cExpressionDeclarationsAssignment_7_3_1; }

		//ExpressionDeclaration
		public RuleCall getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0() { return cExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7_4() { return cRightCurlyBracketKeyword_7_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class ExpressionDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExpressionDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExpressionDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cDefinitionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefinitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cDefinitionExpressionDeclarationCrossReference_3_0 = (CrossReference)cDefinitionAssignment_3.eContents().get(0);
		private final RuleCall cDefinitionExpressionDeclarationIDTerminalRuleCall_3_0_1 = (RuleCall)cDefinitionExpressionDeclarationCrossReference_3_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ExpressionDefinition:
		//	"ExpressionDefinition" "{" "definition" definition=[ExpressionDeclaration] "}";
		public ParserRule getRule() { return rule; }

		//"ExpressionDefinition" "{" "definition" definition=[ExpressionDeclaration] "}"
		public Group getGroup() { return cGroup; }

		//"ExpressionDefinition"
		public Keyword getExpressionDefinitionKeyword_0() { return cExpressionDefinitionKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"definition"
		public Keyword getDefinitionKeyword_2() { return cDefinitionKeyword_2; }

		//definition=[ExpressionDeclaration]
		public Assignment getDefinitionAssignment_3() { return cDefinitionAssignment_3; }

		//[ExpressionDeclaration]
		public CrossReference getDefinitionExpressionDeclarationCrossReference_3_0() { return cDefinitionExpressionDeclarationCrossReference_3_0; }

		//ID
		public RuleCall getDefinitionExpressionDeclarationIDTerminalRuleCall_3_0_1() { return cDefinitionExpressionDeclarationIDTerminalRuleCall_3_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class RelationDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RelationDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRelationDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cDefinitionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefinitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cDefinitionRelationDeclarationCrossReference_3_0 = (CrossReference)cDefinitionAssignment_3.eContents().get(0);
		private final RuleCall cDefinitionRelationDeclarationIDTerminalRuleCall_3_0_1 = (RuleCall)cDefinitionRelationDeclarationCrossReference_3_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//RelationDefinition:
		//	"RelationDefinition" "{" "definition" definition=[RelationDeclaration] "}";
		public ParserRule getRule() { return rule; }

		//"RelationDefinition" "{" "definition" definition=[RelationDeclaration] "}"
		public Group getGroup() { return cGroup; }

		//"RelationDefinition"
		public Keyword getRelationDefinitionKeyword_0() { return cRelationDefinitionKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"definition"
		public Keyword getDefinitionKeyword_2() { return cDefinitionKeyword_2; }

		//definition=[RelationDeclaration]
		public Assignment getDefinitionAssignment_3() { return cDefinitionAssignment_3; }

		//[RelationDeclaration]
		public CrossReference getDefinitionRelationDeclarationCrossReference_3_0() { return cDefinitionRelationDeclarationCrossReference_3_0; }

		//ID
		public RuleCall getDefinitionRelationDeclarationIDTerminalRuleCall_3_0_1() { return cDefinitionRelationDeclarationIDTerminalRuleCall_3_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class RelationDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RelationDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRelationDeclarationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRelationDeclarationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cFormalParametersKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cFormalParametersAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final CrossReference cFormalParametersEObjectCrossReference_4_2_0 = (CrossReference)cFormalParametersAssignment_4_2.eContents().get(0);
		private final RuleCall cFormalParametersEObjectIDTerminalRuleCall_4_2_0_1 = (RuleCall)cFormalParametersEObjectCrossReference_4_2_0.eContents().get(1);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cFormalParametersAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final CrossReference cFormalParametersEObjectCrossReference_4_3_1_0 = (CrossReference)cFormalParametersAssignment_4_3_1.eContents().get(0);
		private final RuleCall cFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1 = (RuleCall)cFormalParametersEObjectCrossReference_4_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//RelationDeclaration:
		//	{RelationDeclaration} "RelationDeclaration" name=ID "{" ("formalParameters" "{" formalParameters+=[ecore::EObject]
		//	("," formalParameters+=[ecore::EObject])* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{RelationDeclaration} "RelationDeclaration" name=ID "{" ("formalParameters" "{" formalParameters+=[ecore::EObject] (","
		//formalParameters+=[ecore::EObject])* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{RelationDeclaration}
		public Action getRelationDeclarationAction_0() { return cRelationDeclarationAction_0; }

		//"RelationDeclaration"
		public Keyword getRelationDeclarationKeyword_1() { return cRelationDeclarationKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("formalParameters" "{" formalParameters+=[ecore::EObject] ("," formalParameters+=[ecore::EObject])* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"formalParameters"
		public Keyword getFormalParametersKeyword_4_0() { return cFormalParametersKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//formalParameters+=[ecore::EObject]
		public Assignment getFormalParametersAssignment_4_2() { return cFormalParametersAssignment_4_2; }

		//[ecore::EObject]
		public CrossReference getFormalParametersEObjectCrossReference_4_2_0() { return cFormalParametersEObjectCrossReference_4_2_0; }

		//ID
		public RuleCall getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1() { return cFormalParametersEObjectIDTerminalRuleCall_4_2_0_1; }

		//("," formalParameters+=[ecore::EObject])*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//formalParameters+=[ecore::EObject]
		public Assignment getFormalParametersAssignment_4_3_1() { return cFormalParametersAssignment_4_3_1; }

		//[ecore::EObject]
		public CrossReference getFormalParametersEObjectCrossReference_4_3_1_0() { return cFormalParametersEObjectCrossReference_4_3_1_0; }

		//ID
		public RuleCall getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1() { return cFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class ExpressionDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExpressionDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpressionDeclarationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExpressionDeclarationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cFormalParametersKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cFormalParametersAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final CrossReference cFormalParametersEObjectCrossReference_4_2_0 = (CrossReference)cFormalParametersAssignment_4_2.eContents().get(0);
		private final RuleCall cFormalParametersEObjectIDTerminalRuleCall_4_2_0_1 = (RuleCall)cFormalParametersEObjectCrossReference_4_2_0.eContents().get(1);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cFormalParametersAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final CrossReference cFormalParametersEObjectCrossReference_4_3_1_0 = (CrossReference)cFormalParametersAssignment_4_3_1.eContents().get(0);
		private final RuleCall cFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1 = (RuleCall)cFormalParametersEObjectCrossReference_4_3_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ExpressionDeclaration:
		//	{ExpressionDeclaration} "ExpressionDeclaration" name=ID "{" ("formalParameters" "{" formalParameters+=[ecore::EObject]
		//	("," formalParameters+=[ecore::EObject])* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{ExpressionDeclaration} "ExpressionDeclaration" name=ID "{" ("formalParameters" "{" formalParameters+=[ecore::EObject]
		//("," formalParameters+=[ecore::EObject])* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{ExpressionDeclaration}
		public Action getExpressionDeclarationAction_0() { return cExpressionDeclarationAction_0; }

		//"ExpressionDeclaration"
		public Keyword getExpressionDeclarationKeyword_1() { return cExpressionDeclarationKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("formalParameters" "{" formalParameters+=[ecore::EObject] ("," formalParameters+=[ecore::EObject])* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"formalParameters"
		public Keyword getFormalParametersKeyword_4_0() { return cFormalParametersKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//formalParameters+=[ecore::EObject]
		public Assignment getFormalParametersAssignment_4_2() { return cFormalParametersAssignment_4_2; }

		//[ecore::EObject]
		public CrossReference getFormalParametersEObjectCrossReference_4_2_0() { return cFormalParametersEObjectCrossReference_4_2_0; }

		//ID
		public RuleCall getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1() { return cFormalParametersEObjectIDTerminalRuleCall_4_2_0_1; }

		//("," formalParameters+=[ecore::EObject])*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//formalParameters+=[ecore::EObject]
		public Assignment getFormalParametersAssignment_4_3_1() { return cFormalParametersAssignment_4_3_1; }

		//[ecore::EObject]
		public CrossReference getFormalParametersEObjectCrossReference_4_3_1_0() { return cFormalParametersEObjectCrossReference_4_3_1_0; }

		//ID
		public RuleCall getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1() { return cFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	
	
	private final BCoolLibraryElements pBCoolLibrary;
	private final ExpressionDefinitionElements pExpressionDefinition;
	private final RelationDefinitionElements pRelationDefinition;
	private final RelationDeclarationElements pRelationDeclaration;
	private final ExpressionDeclarationElements pExpressionDeclaration;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BCOoLLibGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pBCoolLibrary = new BCoolLibraryElements();
		this.pExpressionDefinition = new ExpressionDefinitionElements();
		this.pRelationDefinition = new RelationDefinitionElements();
		this.pRelationDeclaration = new RelationDeclarationElements();
		this.pExpressionDeclaration = new ExpressionDeclarationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.gemoc.bcool.BCOoLLib".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//BCoolLibrary:
	//	{BCoolLibrary} "BCoolLibrary" name=ID "{" ("expressionDefinitions" "{" expressionDefinitions+=ExpressionDefinition
	//	("," expressionDefinitions+=ExpressionDefinition)* "}")? ("relationDefinitions" "{"
	//	relationDefinitions+=RelationDefinition ("," relationDefinitions+=RelationDefinition)* "}")? ("relationDeclarations"
	//	"{" relationDeclarations+=RelationDeclaration ("," relationDeclarations+=RelationDeclaration)* "}")?
	//	("expressionDeclarations" "{" expressionDeclarations+=ExpressionDeclaration (","
	//	expressionDeclarations+=ExpressionDeclaration)* "}")? "}";
	public BCoolLibraryElements getBCoolLibraryAccess() {
		return pBCoolLibrary;
	}
	
	public ParserRule getBCoolLibraryRule() {
		return getBCoolLibraryAccess().getRule();
	}

	//ExpressionDefinition:
	//	"ExpressionDefinition" "{" "definition" definition=[ExpressionDeclaration] "}";
	public ExpressionDefinitionElements getExpressionDefinitionAccess() {
		return pExpressionDefinition;
	}
	
	public ParserRule getExpressionDefinitionRule() {
		return getExpressionDefinitionAccess().getRule();
	}

	//RelationDefinition:
	//	"RelationDefinition" "{" "definition" definition=[RelationDeclaration] "}";
	public RelationDefinitionElements getRelationDefinitionAccess() {
		return pRelationDefinition;
	}
	
	public ParserRule getRelationDefinitionRule() {
		return getRelationDefinitionAccess().getRule();
	}

	//RelationDeclaration:
	//	{RelationDeclaration} "RelationDeclaration" name=ID "{" ("formalParameters" "{" formalParameters+=[ecore::EObject]
	//	("," formalParameters+=[ecore::EObject])* "}")? "}";
	public RelationDeclarationElements getRelationDeclarationAccess() {
		return pRelationDeclaration;
	}
	
	public ParserRule getRelationDeclarationRule() {
		return getRelationDeclarationAccess().getRule();
	}

	//ExpressionDeclaration:
	//	{ExpressionDeclaration} "ExpressionDeclaration" name=ID "{" ("formalParameters" "{" formalParameters+=[ecore::EObject]
	//	("," formalParameters+=[ecore::EObject])* "}")? "}";
	public ExpressionDeclarationElements getExpressionDeclarationAccess() {
		return pExpressionDeclaration;
	}
	
	public ParserRule getExpressionDeclarationRule() {
		return getExpressionDeclarationAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
