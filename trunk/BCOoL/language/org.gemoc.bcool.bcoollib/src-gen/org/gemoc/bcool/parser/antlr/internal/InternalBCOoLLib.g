/*
* generated by Xtext
*/
grammar InternalBCOoLLib;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.gemoc.bcool.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.gemoc.bcool.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.bcool.services.BCOoLLibGrammarAccess;

}

@parser::members {

 	private BCOoLLibGrammarAccess grammarAccess;
 	
    public InternalBCOoLLibParser(TokenStream input, BCOoLLibGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "BCoolLibrary";	
   	}
   	
   	@Override
   	protected BCOoLLibGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleBCoolLibrary
entryRuleBCoolLibrary returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBCoolLibraryRule()); }
	 iv_ruleBCoolLibrary=ruleBCoolLibrary 
	 { $current=$iv_ruleBCoolLibrary.current; } 
	 EOF 
;

// Rule BCoolLibrary
ruleBCoolLibrary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBCoolLibraryAccess().getBCoolLibraryAction_0(),
            $current);
    }
)	otherlv_1='BCoolLibrary' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBCoolLibraryAccess().getBCoolLibraryKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getBCoolLibraryAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBCoolLibraryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='expressionDefinitions' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0()); 
	    }
		lv_expressionDefinitions_6_0=ruleExpressionDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
	        }
       		add(
       			$current, 
       			"expressionDefinitions",
        		lv_expressionDefinitions_6_0, 
        		"ExpressionDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0()); 
	    }
		lv_expressionDefinitions_8_0=ruleExpressionDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
	        }
       		add(
       			$current, 
       			"expressionDefinitions",
        		lv_expressionDefinitions_8_0, 
        		"ExpressionDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_4_4());
    }
)?(	otherlv_10='relationDefinitions' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsKeyword_5_0());
    }
	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0()); 
	    }
		lv_relationDefinitions_12_0=ruleRelationDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
	        }
       		add(
       			$current, 
       			"relationDefinitions",
        		lv_relationDefinitions_12_0, 
        		"RelationDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_13=',' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_5_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0()); 
	    }
		lv_relationDefinitions_14_0=ruleRelationDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
	        }
       		add(
       			$current, 
       			"relationDefinitions",
        		lv_relationDefinitions_14_0, 
        		"RelationDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_5_4());
    }
)?(	otherlv_16='relationDeclarations' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsKeyword_6_0());
    }
	otherlv_17='{' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0()); 
	    }
		lv_relationDeclarations_18_0=ruleRelationDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
	        }
       		add(
       			$current, 
       			"relationDeclarations",
        		lv_relationDeclarations_18_0, 
        		"RelationDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_19=',' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_6_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0()); 
	    }
		lv_relationDeclarations_20_0=ruleRelationDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
	        }
       		add(
       			$current, 
       			"relationDeclarations",
        		lv_relationDeclarations_20_0, 
        		"RelationDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_21='}' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_6_4());
    }
)?(	otherlv_22='expressionDeclarations' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsKeyword_7_0());
    }
	otherlv_23='{' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_7_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0()); 
	    }
		lv_expressionDeclarations_24_0=ruleExpressionDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
	        }
       		add(
       			$current, 
       			"expressionDeclarations",
        		lv_expressionDeclarations_24_0, 
        		"ExpressionDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_25=',' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_7_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0()); 
	    }
		lv_expressionDeclarations_26_0=ruleExpressionDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
	        }
       		add(
       			$current, 
       			"expressionDeclarations",
        		lv_expressionDeclarations_26_0, 
        		"ExpressionDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_27='}' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_7_4());
    }
)?	otherlv_28='}' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleExpressionDefinition
entryRuleExpressionDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionDefinitionRule()); }
	 iv_ruleExpressionDefinition=ruleExpressionDefinition 
	 { $current=$iv_ruleExpressionDefinition.current; } 
	 EOF 
;

// Rule ExpressionDefinition
ruleExpressionDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ExpressionDefinition' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExpressionDefinitionAccess().getExpressionDefinitionKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExpressionDefinitionAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='definition' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExpressionDefinitionAccess().getDefinitionKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExpressionDefinitionRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationCrossReference_3_0()); 
	}

)
)	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getExpressionDefinitionAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleRelationDefinition
entryRuleRelationDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRelationDefinitionRule()); }
	 iv_ruleRelationDefinition=ruleRelationDefinition 
	 { $current=$iv_ruleRelationDefinition.current; } 
	 EOF 
;

// Rule RelationDefinition
ruleRelationDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='RelationDefinition' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRelationDefinitionAccess().getRelationDefinitionKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRelationDefinitionAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='definition' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRelationDefinitionAccess().getDefinitionKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationDefinitionRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationCrossReference_3_0()); 
	}

)
)	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRelationDefinitionAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleRelationDeclaration
entryRuleRelationDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRelationDeclarationRule()); }
	 iv_ruleRelationDeclaration=ruleRelationDeclaration 
	 { $current=$iv_ruleRelationDeclaration.current; } 
	 EOF 
;

// Rule RelationDeclaration
ruleRelationDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRelationDeclarationAccess().getRelationDeclarationAction_0(),
            $current);
    }
)	otherlv_1='RelationDeclaration' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRelationDeclarationAccess().getRelationDeclarationKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getRelationDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='formalParameters' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRelationDeclarationAccess().getFormalParametersKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationDeclarationRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 
	}

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getRelationDeclarationAccess().getCommaKeyword_4_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationDeclarationRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 
	}

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_4_4());
    }
)?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleExpressionDeclaration
entryRuleExpressionDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionDeclarationRule()); }
	 iv_ruleExpressionDeclaration=ruleExpressionDeclaration 
	 { $current=$iv_ruleExpressionDeclaration.current; } 
	 EOF 
;

// Rule ExpressionDeclaration
ruleExpressionDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationAction_0(),
            $current);
    }
)	otherlv_1='ExpressionDeclaration' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getExpressionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExpressionDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='formalParameters' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getExpressionDeclarationAccess().getFormalParametersKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExpressionDeclarationRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 
	}

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getExpressionDeclarationAccess().getCommaKeyword_4_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getExpressionDeclarationRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 
	}

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_4_4());
    }
)?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_5());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


