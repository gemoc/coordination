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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBCOoLLibParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BCoolLibrary'", "'{'", "'expressionDefinitions'", "','", "'}'", "'relationDefinitions'", "'relationDeclarations'", "'expressionDeclarations'", "'ExpressionDefinition'", "'definition'", "'RelationDefinition'", "'RelationDeclaration'", "'formalParameters'", "'ExpressionDeclaration'"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalBCOoLLibParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBCOoLLibParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBCOoLLibParser.tokenNames; }
    public String getGrammarFileName() { return "../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g"; }



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



    // $ANTLR start "entryRuleBCoolLibrary"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:67:1: entryRuleBCoolLibrary returns [EObject current=null] : iv_ruleBCoolLibrary= ruleBCoolLibrary EOF ;
    public final EObject entryRuleBCoolLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolLibrary = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:68:2: (iv_ruleBCoolLibrary= ruleBCoolLibrary EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:69:2: iv_ruleBCoolLibrary= ruleBCoolLibrary EOF
            {
             newCompositeNode(grammarAccess.getBCoolLibraryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBCoolLibrary_in_entryRuleBCoolLibrary75);
            iv_ruleBCoolLibrary=ruleBCoolLibrary();

            state._fsp--;

             current =iv_ruleBCoolLibrary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBCoolLibrary85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBCoolLibrary"


    // $ANTLR start "ruleBCoolLibrary"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:76:1: ruleBCoolLibrary returns [EObject current=null] : ( () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleBCoolLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expressionDefinitions_6_0 = null;

        EObject lv_expressionDefinitions_8_0 = null;

        EObject lv_relationDefinitions_12_0 = null;

        EObject lv_relationDefinitions_14_0 = null;

        EObject lv_relationDeclarations_18_0 = null;

        EObject lv_relationDeclarations_20_0 = null;

        EObject lv_expressionDeclarations_24_0 = null;

        EObject lv_expressionDeclarations_26_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:79:28: ( ( () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:80:1: ( () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:80:1: ( () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:80:2: () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:80:2: ()
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBCoolLibraryAccess().getBCoolLibraryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBCoolLibrary131); 

                	newLeafNode(otherlv_1, grammarAccess.getBCoolLibraryAccess().getBCoolLibraryKeyword_1());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:91:1: (lv_name_2_0= ruleEString )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBCoolLibrary152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBCoolLibrary164); 

                	newLeafNode(otherlv_3, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:112:1: (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:112:3: otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBCoolLibrary177); 

                        	newLeafNode(otherlv_4, grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBCoolLibrary189); 

                        	newLeafNode(otherlv_5, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:120:1: ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:121:1: (lv_expressionDefinitions_6_0= ruleExpressionDefinition )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:121:1: (lv_expressionDefinitions_6_0= ruleExpressionDefinition )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:122:3: lv_expressionDefinitions_6_0= ruleExpressionDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionDefinition_in_ruleBCoolLibrary210);
                    lv_expressionDefinitions_6_0=ruleExpressionDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"expressionDefinitions",
                            		lv_expressionDefinitions_6_0, 
                            		"ExpressionDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:138:2: (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:138:4: otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBCoolLibrary223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:142:1: ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:143:1: (lv_expressionDefinitions_8_0= ruleExpressionDefinition )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:143:1: (lv_expressionDefinitions_8_0= ruleExpressionDefinition )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:144:3: lv_expressionDefinitions_8_0= ruleExpressionDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExpressionDefinition_in_ruleBCoolLibrary244);
                    	    lv_expressionDefinitions_8_0=ruleExpressionDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressionDefinitions",
                    	            		lv_expressionDefinitions_8_0, 
                    	            		"ExpressionDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBCoolLibrary258); 

                        	newLeafNode(otherlv_9, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:164:3: (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:164:5: otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBCoolLibrary273); 

                        	newLeafNode(otherlv_10, grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBCoolLibrary285); 

                        	newLeafNode(otherlv_11, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:172:1: ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:173:1: (lv_relationDefinitions_12_0= ruleRelationDefinition )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:173:1: (lv_relationDefinitions_12_0= ruleRelationDefinition )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:174:3: lv_relationDefinitions_12_0= ruleRelationDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRelationDefinition_in_ruleBCoolLibrary306);
                    lv_relationDefinitions_12_0=ruleRelationDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"relationDefinitions",
                            		lv_relationDefinitions_12_0, 
                            		"RelationDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:190:2: (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:190:4: otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBCoolLibrary319); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:194:1: ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:195:1: (lv_relationDefinitions_14_0= ruleRelationDefinition )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:195:1: (lv_relationDefinitions_14_0= ruleRelationDefinition )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:196:3: lv_relationDefinitions_14_0= ruleRelationDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRelationDefinition_in_ruleBCoolLibrary340);
                    	    lv_relationDefinitions_14_0=ruleRelationDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relationDefinitions",
                    	            		lv_relationDefinitions_14_0, 
                    	            		"RelationDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBCoolLibrary354); 

                        	newLeafNode(otherlv_15, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:216:3: (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:216:5: otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBCoolLibrary369); 

                        	newLeafNode(otherlv_16, grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBCoolLibrary381); 

                        	newLeafNode(otherlv_17, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:224:1: ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:225:1: (lv_relationDeclarations_18_0= ruleRelationDeclaration )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:225:1: (lv_relationDeclarations_18_0= ruleRelationDeclaration )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:226:3: lv_relationDeclarations_18_0= ruleRelationDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRelationDeclaration_in_ruleBCoolLibrary402);
                    lv_relationDeclarations_18_0=ruleRelationDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"relationDeclarations",
                            		lv_relationDeclarations_18_0, 
                            		"RelationDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:242:2: (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:242:4: otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBCoolLibrary415); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:246:1: ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:247:1: (lv_relationDeclarations_20_0= ruleRelationDeclaration )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:247:1: (lv_relationDeclarations_20_0= ruleRelationDeclaration )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:248:3: lv_relationDeclarations_20_0= ruleRelationDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRelationDeclaration_in_ruleBCoolLibrary436);
                    	    lv_relationDeclarations_20_0=ruleRelationDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relationDeclarations",
                    	            		lv_relationDeclarations_20_0, 
                    	            		"RelationDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBCoolLibrary450); 

                        	newLeafNode(otherlv_21, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:268:3: (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:268:5: otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBCoolLibrary465); 

                        	newLeafNode(otherlv_22, grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsKeyword_7_0());
                        
                    otherlv_23=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBCoolLibrary477); 

                        	newLeafNode(otherlv_23, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:276:1: ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:277:1: (lv_expressionDeclarations_24_0= ruleExpressionDeclaration )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:277:1: (lv_expressionDeclarations_24_0= ruleExpressionDeclaration )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:278:3: lv_expressionDeclarations_24_0= ruleExpressionDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionDeclaration_in_ruleBCoolLibrary498);
                    lv_expressionDeclarations_24_0=ruleExpressionDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"expressionDeclarations",
                            		lv_expressionDeclarations_24_0, 
                            		"ExpressionDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:294:2: (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:294:4: otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBCoolLibrary511); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:298:1: ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:299:1: (lv_expressionDeclarations_26_0= ruleExpressionDeclaration )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:299:1: (lv_expressionDeclarations_26_0= ruleExpressionDeclaration )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:300:3: lv_expressionDeclarations_26_0= ruleExpressionDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExpressionDeclaration_in_ruleBCoolLibrary532);
                    	    lv_expressionDeclarations_26_0=ruleExpressionDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressionDeclarations",
                    	            		lv_expressionDeclarations_26_0, 
                    	            		"ExpressionDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBCoolLibrary546); 

                        	newLeafNode(otherlv_27, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBCoolLibrary560); 

                	newLeafNode(otherlv_28, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBCoolLibrary"


    // $ANTLR start "entryRuleEString"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:332:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:333:2: (iv_ruleEString= ruleEString EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:334:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString597);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString608); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:341:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:344:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:345:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:345:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:345:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString648); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:353:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString674); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExpressionDefinition"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:368:1: entryRuleExpressionDefinition returns [EObject current=null] : iv_ruleExpressionDefinition= ruleExpressionDefinition EOF ;
    public final EObject entryRuleExpressionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionDefinition = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:369:2: (iv_ruleExpressionDefinition= ruleExpressionDefinition EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:370:2: iv_ruleExpressionDefinition= ruleExpressionDefinition EOF
            {
             newCompositeNode(grammarAccess.getExpressionDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionDefinition_in_entryRuleExpressionDefinition719);
            iv_ruleExpressionDefinition=ruleExpressionDefinition();

            state._fsp--;

             current =iv_ruleExpressionDefinition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionDefinition729); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionDefinition"


    // $ANTLR start "ruleExpressionDefinition"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:377:1: ruleExpressionDefinition returns [EObject current=null] : (otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleExpressionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:380:28: ( (otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:381:1: (otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:381:1: (otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:381:3: otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExpressionDefinition766); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionDefinitionAccess().getExpressionDefinitionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExpressionDefinition778); 

                	newLeafNode(otherlv_1, grammarAccess.getExpressionDefinitionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExpressionDefinition790); 

                	newLeafNode(otherlv_2, grammarAccess.getExpressionDefinitionAccess().getDefinitionKeyword_2());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:393:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:394:1: ( ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:394:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:395:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExpressionDefinitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExpressionDefinition813);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExpressionDefinition825); 

                	newLeafNode(otherlv_4, grammarAccess.getExpressionDefinitionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionDefinition"


    // $ANTLR start "entryRuleRelationDefinition"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:420:1: entryRuleRelationDefinition returns [EObject current=null] : iv_ruleRelationDefinition= ruleRelationDefinition EOF ;
    public final EObject entryRuleRelationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDefinition = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:421:2: (iv_ruleRelationDefinition= ruleRelationDefinition EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:422:2: iv_ruleRelationDefinition= ruleRelationDefinition EOF
            {
             newCompositeNode(grammarAccess.getRelationDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationDefinition_in_entryRuleRelationDefinition861);
            iv_ruleRelationDefinition=ruleRelationDefinition();

            state._fsp--;

             current =iv_ruleRelationDefinition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationDefinition871); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationDefinition"


    // $ANTLR start "ruleRelationDefinition"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:429:1: ruleRelationDefinition returns [EObject current=null] : (otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleRelationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:432:28: ( (otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:433:1: (otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:433:1: (otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:433:3: otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRelationDefinition908); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationDefinitionAccess().getRelationDefinitionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRelationDefinition920); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationDefinitionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRelationDefinition932); 

                	newLeafNode(otherlv_2, grammarAccess.getRelationDefinitionAccess().getDefinitionKeyword_2());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:445:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:446:1: ( ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:446:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:447:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationDefinitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRelationDefinition955);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRelationDefinition967); 

                	newLeafNode(otherlv_4, grammarAccess.getRelationDefinitionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationDefinition"


    // $ANTLR start "entryRuleRelationDeclaration"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:472:1: entryRuleRelationDeclaration returns [EObject current=null] : iv_ruleRelationDeclaration= ruleRelationDeclaration EOF ;
    public final EObject entryRuleRelationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDeclaration = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:473:2: (iv_ruleRelationDeclaration= ruleRelationDeclaration EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:474:2: iv_ruleRelationDeclaration= ruleRelationDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRelationDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationDeclaration_in_entryRuleRelationDeclaration1003);
            iv_ruleRelationDeclaration=ruleRelationDeclaration();

            state._fsp--;

             current =iv_ruleRelationDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationDeclaration1013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationDeclaration"


    // $ANTLR start "ruleRelationDeclaration"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:481:1: ruleRelationDeclaration returns [EObject current=null] : ( () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleRelationDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_formalParameters_6_0 = null;

        AntlrDatatypeRuleToken lv_formalParameters_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:484:28: ( ( () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:485:1: ( () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:485:1: ( () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:485:2: () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:485:2: ()
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:486:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRelationDeclarationAccess().getRelationDeclarationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRelationDeclaration1059); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationDeclarationAccess().getRelationDeclarationKeyword_1());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:495:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:496:1: (lv_name_2_0= ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:496:1: (lv_name_2_0= ruleEString )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:497:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRelationDeclarationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRelationDeclaration1080);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRelationDeclaration1092); 

                	newLeafNode(otherlv_3, grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:517:1: (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:517:3: otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRelationDeclaration1105); 

                        	newLeafNode(otherlv_4, grammarAccess.getRelationDeclarationAccess().getFormalParametersKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRelationDeclaration1117); 

                        	newLeafNode(otherlv_5, grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:525:1: ( (lv_formalParameters_6_0= ruleEString ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:526:1: (lv_formalParameters_6_0= ruleEString )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:526:1: (lv_formalParameters_6_0= ruleEString )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:527:3: lv_formalParameters_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationDeclarationAccess().getFormalParametersEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRelationDeclaration1138);
                    lv_formalParameters_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationDeclarationRule());
                    	        }
                           		add(
                           			current, 
                           			"formalParameters",
                            		lv_formalParameters_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:543:2: (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:543:4: otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRelationDeclaration1151); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getRelationDeclarationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:547:1: ( (lv_formalParameters_8_0= ruleEString ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:548:1: (lv_formalParameters_8_0= ruleEString )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:548:1: (lv_formalParameters_8_0= ruleEString )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:549:3: lv_formalParameters_8_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationDeclarationAccess().getFormalParametersEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRelationDeclaration1172);
                    	    lv_formalParameters_8_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRelationDeclarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"formalParameters",
                    	            		lv_formalParameters_8_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRelationDeclaration1186); 

                        	newLeafNode(otherlv_9, grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRelationDeclaration1200); 

                	newLeafNode(otherlv_10, grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationDeclaration"


    // $ANTLR start "entryRuleExpressionDeclaration"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:581:1: entryRuleExpressionDeclaration returns [EObject current=null] : iv_ruleExpressionDeclaration= ruleExpressionDeclaration EOF ;
    public final EObject entryRuleExpressionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionDeclaration = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:582:2: (iv_ruleExpressionDeclaration= ruleExpressionDeclaration EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:583:2: iv_ruleExpressionDeclaration= ruleExpressionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExpressionDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionDeclaration_in_entryRuleExpressionDeclaration1236);
            iv_ruleExpressionDeclaration=ruleExpressionDeclaration();

            state._fsp--;

             current =iv_ruleExpressionDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionDeclaration1246); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionDeclaration"


    // $ANTLR start "ruleExpressionDeclaration"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:590:1: ruleExpressionDeclaration returns [EObject current=null] : ( () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleExpressionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_formalParameters_6_0 = null;

        AntlrDatatypeRuleToken lv_formalParameters_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:593:28: ( ( () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:594:1: ( () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:594:1: ( () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:594:2: () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:594:2: ()
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:595:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExpressionDeclaration1292); 

                	newLeafNode(otherlv_1, grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationKeyword_1());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:604:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:605:1: (lv_name_2_0= ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:605:1: (lv_name_2_0= ruleEString )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:606:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExpressionDeclarationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExpressionDeclaration1313);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExpressionDeclaration1325); 

                	newLeafNode(otherlv_3, grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:626:1: (otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:626:3: otherlv_4= 'formalParameters' otherlv_5= '{' ( (lv_formalParameters_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExpressionDeclaration1338); 

                        	newLeafNode(otherlv_4, grammarAccess.getExpressionDeclarationAccess().getFormalParametersKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExpressionDeclaration1350); 

                        	newLeafNode(otherlv_5, grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:634:1: ( (lv_formalParameters_6_0= ruleEString ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:635:1: (lv_formalParameters_6_0= ruleEString )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:635:1: (lv_formalParameters_6_0= ruleEString )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:636:3: lv_formalParameters_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExpressionDeclaration1371);
                    lv_formalParameters_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionDeclarationRule());
                    	        }
                           		add(
                           			current, 
                           			"formalParameters",
                            		lv_formalParameters_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:652:2: (otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:652:4: otherlv_7= ',' ( (lv_formalParameters_8_0= ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExpressionDeclaration1384); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getExpressionDeclarationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:656:1: ( (lv_formalParameters_8_0= ruleEString ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:657:1: (lv_formalParameters_8_0= ruleEString )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:657:1: (lv_formalParameters_8_0= ruleEString )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:658:3: lv_formalParameters_8_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExpressionDeclaration1405);
                    	    lv_formalParameters_8_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExpressionDeclarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"formalParameters",
                    	            		lv_formalParameters_8_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExpressionDeclaration1419); 

                        	newLeafNode(otherlv_9, grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExpressionDeclaration1433); 

                	newLeafNode(otherlv_10, grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionDeclaration"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBCoolLibrary_in_entryRuleBCoolLibrary75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBCoolLibrary85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleBCoolLibrary131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBCoolLibrary152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBCoolLibrary164 = new BitSet(new long[]{0x000000000007A000L});
        public static final BitSet FOLLOW_13_in_ruleBCoolLibrary177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBCoolLibrary189 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleExpressionDefinition_in_ruleBCoolLibrary210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBCoolLibrary223 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleExpressionDefinition_in_ruleBCoolLibrary244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBCoolLibrary258 = new BitSet(new long[]{0x0000000000078000L});
        public static final BitSet FOLLOW_16_in_ruleBCoolLibrary273 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBCoolLibrary285 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleRelationDefinition_in_ruleBCoolLibrary306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBCoolLibrary319 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleRelationDefinition_in_ruleBCoolLibrary340 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBCoolLibrary354 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_17_in_ruleBCoolLibrary369 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBCoolLibrary381 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleRelationDeclaration_in_ruleBCoolLibrary402 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBCoolLibrary415 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleRelationDeclaration_in_ruleBCoolLibrary436 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBCoolLibrary450 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleBCoolLibrary465 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBCoolLibrary477 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleExpressionDeclaration_in_ruleBCoolLibrary498 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBCoolLibrary511 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleExpressionDeclaration_in_ruleBCoolLibrary532 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBCoolLibrary546 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBCoolLibrary560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString597 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionDefinition_in_entryRuleExpressionDefinition719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionDefinition729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleExpressionDefinition766 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExpressionDefinition778 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleExpressionDefinition790 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExpressionDefinition813 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExpressionDefinition825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationDefinition_in_entryRuleRelationDefinition861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationDefinition871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleRelationDefinition908 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRelationDefinition920 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleRelationDefinition932 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRelationDefinition955 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRelationDefinition967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationDeclaration_in_entryRuleRelationDeclaration1003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationDeclaration1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleRelationDeclaration1059 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRelationDeclaration1080 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRelationDeclaration1092 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleRelationDeclaration1105 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRelationDeclaration1117 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRelationDeclaration1138 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleRelationDeclaration1151 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRelationDeclaration1172 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleRelationDeclaration1186 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRelationDeclaration1200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionDeclaration_in_entryRuleExpressionDeclaration1236 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionDeclaration1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleExpressionDeclaration1292 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExpressionDeclaration1313 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExpressionDeclaration1325 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleExpressionDeclaration1338 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExpressionDeclaration1350 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExpressionDeclaration1371 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleExpressionDeclaration1384 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExpressionDeclaration1405 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleExpressionDeclaration1419 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExpressionDeclaration1433 = new BitSet(new long[]{0x0000000000000002L});
    }


}