package org.gemoc.bcool.model.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.bcool.model.xtext.services.BCOoLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBCOoLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Spec'", "'Global Event'", "';'", "'let'", "'Operator'", "'('", "','", "')'", "'MatchingCorrespondance:'", "'end operator;'", "' : '", "'::'", "'when'", "'CoordinationRule:'", "'Local Event'", "'='", "'Relation'", "'ImportLib'", "'ImportInterface'", "'as'", "'import'", "'#'", "'if'", "'then'", "'else'", "'endif'", "'.'", "'->'", "'and'", "'xor'", "'or'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'~'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalBCOoLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBCOoLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBCOoLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g"; }



     	private BCOoLGrammarAccess grammarAccess;
     	
        public InternalBCOoLParser(TokenStream input, BCOoLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BCoolSpec";	
       	}
       	
       	@Override
       	protected BCOoLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBCoolSpec"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:68:1: entryRuleBCoolSpec returns [EObject current=null] : iv_ruleBCoolSpec= ruleBCoolSpec EOF ;
    public final EObject entryRuleBCoolSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolSpec = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:69:2: (iv_ruleBCoolSpec= ruleBCoolSpec EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:70:2: iv_ruleBCoolSpec= ruleBCoolSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolSpec_in_entryRuleBCoolSpec75);
            iv_ruleBCoolSpec=ruleBCoolSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolSpec85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBCoolSpec"


    // $ANTLR start "ruleBCoolSpec"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:77:1: ruleBCoolSpec returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ ) ;
    public final EObject ruleBCoolSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_importsLib_1_0 = null;

        EObject lv_importsBehavioralInterface_2_0 = null;

        EObject lv_bcoolOperators_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:80:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:81:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:81:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:81:2: ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:81:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:82:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:82:1: (lv_name_0_0= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:83:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolSpec127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getBCoolSpecAccess().getNameIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBCoolSpecRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:99:3: ( (lv_importsLib_1_0= ruleImportLibRule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:100:1: (lv_importsLib_1_0= ruleImportLibRule )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:100:1: (lv_importsLib_1_0= ruleImportLibRule )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:101:3: lv_importsLib_1_0= ruleImportLibRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolSpecAccess().getImportsLibImportLibRuleParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportLibRule_in_ruleBCoolSpec154);
            	    lv_importsLib_1_0=ruleImportLibRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importsLib",
            	              		lv_importsLib_1_0, 
            	              		"ImportLibRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:117:3: ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:118:1: (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:118:1: (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:119:3: lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceImportInterfaceRuleParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportInterfaceRule_in_ruleBCoolSpec176);
            	    lv_importsBehavioralInterface_2_0=ruleImportInterfaceRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importsBehavioralInterface",
            	              		lv_importsBehavioralInterface_2_0, 
            	              		"ImportInterfaceRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:135:3: ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:136:1: (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:136:1: (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:137:3: lv_bcoolOperators_3_0= ruleBCoolOperatorSpec
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsBCoolOperatorSpecParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBCoolOperatorSpec_in_ruleBCoolSpec198);
            	    lv_bcoolOperators_3_0=ruleBCoolOperatorSpec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"bcoolOperators",
            	              		lv_bcoolOperators_3_0, 
            	              		"BCoolOperatorSpec");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBCoolSpec"


    // $ANTLR start "entryRuleBCoolOperatorSpec"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:161:1: entryRuleBCoolOperatorSpec returns [EObject current=null] : iv_ruleBCoolOperatorSpec= ruleBCoolOperatorSpec EOF ;
    public final EObject entryRuleBCoolOperatorSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolOperatorSpec = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:162:2: (iv_ruleBCoolOperatorSpec= ruleBCoolOperatorSpec EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:163:2: iv_ruleBCoolOperatorSpec= ruleBCoolOperatorSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolOperatorSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorSpec_in_entryRuleBCoolOperatorSpec235);
            iv_ruleBCoolOperatorSpec=ruleBCoolOperatorSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolOperatorSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolOperatorSpec245); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBCoolOperatorSpec"


    // $ANTLR start "ruleBCoolOperatorSpec"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:170:1: ruleBCoolOperatorSpec returns [EObject current=null] : (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ ) ;
    public final EObject ruleBCoolOperatorSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_globalEventExpressions_2_0 = null;

        EObject lv_globalDSEs_3_0 = null;

        EObject lv_bcoolCompositionRules_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:173:28: ( (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:174:1: (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:174:1: (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:174:3: otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleBCoolOperatorSpec282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBCoolOperatorSpecAccess().getSpecKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:178:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:179:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:179:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:180:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorSpec299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBCoolOperatorSpecAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:196:2: ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:197:1: (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:197:1: (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:198:3: lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsGlobalEventExpressionRuleParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleglobalEventExpressionRule_in_ruleBCoolOperatorSpec325);
                    lv_globalEventExpressions_2_0=ruleglobalEventExpressionRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBCoolOperatorSpecRule());
                      	        }
                             		add(
                             			current, 
                             			"globalEventExpressions",
                              		lv_globalEventExpressions_2_0, 
                              		"globalEventExpressionRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:214:3: ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:215:1: (lv_globalDSEs_3_0= ruleglobalDSEsRule )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:215:1: (lv_globalDSEs_3_0= ruleglobalDSEsRule )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:216:3: lv_globalDSEs_3_0= ruleglobalDSEsRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsGlobalDSEsRuleParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleglobalDSEsRule_in_ruleBCoolOperatorSpec347);
                    lv_globalDSEs_3_0=ruleglobalDSEsRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBCoolOperatorSpecRule());
                      	        }
                             		add(
                             			current, 
                             			"globalDSEs",
                              		lv_globalDSEs_3_0, 
                              		"globalDSEsRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:232:3: ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:233:1: (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:233:1: (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:234:3: lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesBCoolCompositionRuleParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBCoolCompositionRule_in_ruleBCoolOperatorSpec369);
            	    lv_bcoolCompositionRules_4_0=ruleBCoolCompositionRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolOperatorSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"bcoolCompositionRules",
            	              		lv_bcoolCompositionRules_4_0, 
            	              		"BCoolCompositionRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBCoolOperatorSpec"


    // $ANTLR start "entryRuleglobalDSEsRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:258:1: entryRuleglobalDSEsRule returns [EObject current=null] : iv_ruleglobalDSEsRule= ruleglobalDSEsRule EOF ;
    public final EObject entryRuleglobalDSEsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleglobalDSEsRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:259:2: (iv_ruleglobalDSEsRule= ruleglobalDSEsRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:260:2: iv_ruleglobalDSEsRule= ruleglobalDSEsRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalDSEsRuleRule()); 
            }
            pushFollow(FOLLOW_ruleglobalDSEsRule_in_entryRuleglobalDSEsRule406);
            iv_ruleglobalDSEsRule=ruleglobalDSEsRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleglobalDSEsRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglobalDSEsRule416); if (state.failed) return current;

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
    // $ANTLR end "entryRuleglobalDSEsRule"


    // $ANTLR start "ruleglobalDSEsRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:267:1: ruleglobalDSEsRule returns [EObject current=null] : (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleglobalDSEsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:270:28: ( (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:271:1: (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:271:1: (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:271:3: otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleglobalDSEsRule453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalDSEsRuleAccess().getGlobalEventKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:275:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:276:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:276:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:277:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleglobalDSEsRule470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGlobalDSEsRuleAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGlobalDSEsRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleglobalDSEsRule487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGlobalDSEsRuleAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleglobalDSEsRule"


    // $ANTLR start "entryRuleglobalEventExpressionRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:305:1: entryRuleglobalEventExpressionRule returns [EObject current=null] : iv_ruleglobalEventExpressionRule= ruleglobalEventExpressionRule EOF ;
    public final EObject entryRuleglobalEventExpressionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleglobalEventExpressionRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:306:2: (iv_ruleglobalEventExpressionRule= ruleglobalEventExpressionRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:307:2: iv_ruleglobalEventExpressionRule= ruleglobalEventExpressionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalEventExpressionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleglobalEventExpressionRule_in_entryRuleglobalEventExpressionRule523);
            iv_ruleglobalEventExpressionRule=ruleglobalEventExpressionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleglobalEventExpressionRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglobalEventExpressionRule533); if (state.failed) return current;

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
    // $ANTLR end "entryRuleglobalEventExpressionRule"


    // $ANTLR start "ruleglobalEventExpressionRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:314:1: ruleglobalEventExpressionRule returns [EObject current=null] : (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression ) ;
    public final EObject ruleglobalEventExpressionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_EventExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:317:28: ( (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:318:1: (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:318:1: (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:318:3: otherlv_0= 'let' this_EventExpression_1= ruleEventExpression
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleglobalEventExpressionRule570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalEventExpressionRuleAccess().getLetKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGlobalEventExpressionRuleAccess().getEventExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleEventExpression_in_ruleglobalEventExpressionRule592);
            this_EventExpression_1=ruleEventExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EventExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleglobalEventExpressionRule"


    // $ANTLR start "entryRuleBCoolCompositionRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:339:1: entryRuleBCoolCompositionRule returns [EObject current=null] : iv_ruleBCoolCompositionRule= ruleBCoolCompositionRule EOF ;
    public final EObject entryRuleBCoolCompositionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolCompositionRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:340:2: (iv_ruleBCoolCompositionRule= ruleBCoolCompositionRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:341:2: iv_ruleBCoolCompositionRule= ruleBCoolCompositionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolCompositionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolCompositionRule_in_entryRuleBCoolCompositionRule627);
            iv_ruleBCoolCompositionRule=ruleBCoolCompositionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolCompositionRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolCompositionRule637); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBCoolCompositionRule"


    // $ANTLR start "ruleBCoolCompositionRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:348:1: ruleBCoolCompositionRule returns [EObject current=null] : (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) ;
    public final EObject ruleBCoolCompositionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_BCoolOperatorArgs_3_0 = null;

        EObject lv_BCoolOperatorArgs_5_0 = null;

        EObject lv_matchingRule_8_0 = null;

        EObject lv_coordinationRule_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:351:28: ( (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:3: otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBCoolCompositionRule674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBCoolCompositionRuleAccess().getOperatorKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:356:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:357:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:357:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:358:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolCompositionRule691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBCoolCompositionRuleAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolCompositionRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleBCoolCompositionRule708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBCoolCompositionRuleAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:378:1: ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:379:1: (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:379:1: (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:380:3: lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule729);
            lv_BCoolOperatorArgs_3_0=ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBCoolCompositionRuleRule());
              	        }
                     		add(
                     			current, 
                     			"BCoolOperatorArgs",
                      		lv_BCoolOperatorArgs_3_0, 
                      		"BCoolOperatorArg");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:396:2: (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:396:4: otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleBCoolCompositionRule742); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:400:1: ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:401:1: (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:401:1: (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:402:3: lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule763);
            	    lv_BCoolOperatorArgs_5_0=ruleBCoolOperatorArg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolCompositionRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"BCoolOperatorArgs",
            	              		lv_BCoolOperatorArgs_5_0, 
            	              		"BCoolOperatorArg");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleBCoolCompositionRule777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleBCoolCompositionRule789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_6());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:426:1: ( (lv_matchingRule_8_0= ruleMatchingRule ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:427:1: (lv_matchingRule_8_0= ruleMatchingRule )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:427:1: (lv_matchingRule_8_0= ruleMatchingRule )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:428:3: lv_matchingRule_8_0= ruleMatchingRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_ruleBCoolCompositionRule810);
            lv_matchingRule_8_0=ruleMatchingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBCoolCompositionRuleRule());
              	        }
                     		set(
                     			current, 
                     			"matchingRule",
                      		lv_matchingRule_8_0, 
                      		"MatchingRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:444:2: ( (lv_coordinationRule_9_0= ruleCoordinationRule ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:445:1: (lv_coordinationRule_9_0= ruleCoordinationRule )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:445:1: (lv_coordinationRule_9_0= ruleCoordinationRule )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:446:3: lv_coordinationRule_9_0= ruleCoordinationRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_ruleBCoolCompositionRule831);
            lv_coordinationRule_9_0=ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBCoolCompositionRuleRule());
              	        }
                     		set(
                     			current, 
                     			"coordinationRule",
                      		lv_coordinationRule_9_0, 
                      		"CoordinationRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleBCoolCompositionRule843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getBCoolCompositionRuleAccess().getEndOperatorKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBCoolCompositionRule"


    // $ANTLR start "entryRuleBCoolOperatorArg"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:474:1: entryRuleBCoolOperatorArg returns [EObject current=null] : iv_ruleBCoolOperatorArg= ruleBCoolOperatorArg EOF ;
    public final EObject entryRuleBCoolOperatorArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolOperatorArg = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:475:2: (iv_ruleBCoolOperatorArg= ruleBCoolOperatorArg EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:476:2: iv_ruleBCoolOperatorArg= ruleBCoolOperatorArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolOperatorArgRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorArg_in_entryRuleBCoolOperatorArg879);
            iv_ruleBCoolOperatorArg=ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolOperatorArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolOperatorArg889); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBCoolOperatorArg"


    // $ANTLR start "ruleBCoolOperatorArg"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:483:1: ruleBCoolOperatorArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleBCoolOperatorArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:486:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:488:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:488:1: (lv_name_0_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:489:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorArg931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getBCoolOperatorArgAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleBCoolOperatorArg948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBCoolOperatorArgAccess().getSpaceColonSpaceKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:509:1: ( (otherlv_2= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:510:1: (otherlv_2= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:510:1: (otherlv_2= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:511:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorArg968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleBCoolOperatorArg980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBCoolOperatorArgAccess().getColonColonKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:526:1: ( (otherlv_4= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:527:1: (otherlv_4= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:527:1: (otherlv_4= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:528:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorArg1000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getBCoolOperatorArgAccess().getDSEECLDefCSCrossReference_4_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBCoolOperatorArg"


    // $ANTLR start "entryRuleMatchingRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:547:1: entryRuleMatchingRule returns [EObject current=null] : iv_ruleMatchingRule= ruleMatchingRule EOF ;
    public final EObject entryRuleMatchingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchingRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:548:2: (iv_ruleMatchingRule= ruleMatchingRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:549:2: iv_ruleMatchingRule= ruleMatchingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule1036);
            iv_ruleMatchingRule=ruleMatchingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingRule1046); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatchingRule"


    // $ANTLR start "ruleMatchingRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:556:1: ruleMatchingRule returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) ;
    public final EObject ruleMatchingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_filterEventExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:559:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:560:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:560:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:560:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleMatchingRule1083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMatchingRuleAccess().getWhenKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:564:1: ( (lv_condition_1_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:565:1: (lv_condition_1_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:565:1: (lv_condition_1_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:566:3: lv_condition_1_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchingRuleAccess().getConditionGExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleMatchingRule1104);
            lv_condition_1_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMatchingRuleRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMatchingRule1116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleMatchingRule1128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:590:1: (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:590:3: otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleMatchingRule1141); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMatchingRuleAccess().getLocalEventKeyword_4_0());
            	          
            	    }
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:594:1: ( (lv_filterEventExpressions_5_0= ruleEventExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:595:1: (lv_filterEventExpressions_5_0= ruleEventExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:595:1: (lv_filterEventExpressions_5_0= ruleEventExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:596:3: lv_filterEventExpressions_5_0= ruleEventExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsEventExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEventExpression_in_ruleMatchingRule1162);
            	    lv_filterEventExpressions_5_0=ruleEventExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMatchingRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"filterEventExpressions",
            	              		lv_filterEventExpressions_5_0, 
            	              		"EventExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMatchingRule1174); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMatchingRule"


    // $ANTLR start "entryRuleEventExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:624:1: entryRuleEventExpression returns [EObject current=null] : iv_ruleEventExpression= ruleEventExpression EOF ;
    public final EObject entryRuleEventExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:625:2: (iv_ruleEventExpression= ruleEventExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:626:2: iv_ruleEventExpression= ruleEventExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventExpression_in_entryRuleEventExpression1212);
            iv_ruleEventExpression=ruleEventExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExpression1222); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventExpression"


    // $ANTLR start "ruleEventExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:633:1: ruleEventExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleEventExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:636:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:637:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:637:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:637:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:637:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:638:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:638:1: (lv_name_0_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEventExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEventExpression1281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:659:1: ( (otherlv_2= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:660:1: (otherlv_2= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:660:1: (otherlv_2= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:661:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventExpressionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEventExpression1313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:676:1: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:676:2: ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:676:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:677:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:677:1: (otherlv_4= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:678:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventExpressionRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:689:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:689:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEventExpression1347); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:693:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:694:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:694:1: (otherlv_6= RULE_ID )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:695:3: otherlv_6= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventExpressionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1367); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_6, grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEventExpression1383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEventExpressionAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEventExpression"


    // $ANTLR start "entryRuleCoordinationRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:718:1: entryRuleCoordinationRule returns [EObject current=null] : iv_ruleCoordinationRule= ruleCoordinationRule EOF ;
    public final EObject entryRuleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:719:2: (iv_ruleCoordinationRule= ruleCoordinationRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:720:2: iv_ruleCoordinationRule= ruleCoordinationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoordinationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule1419);
            iv_ruleCoordinationRule=ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoordinationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinationRule1429); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCoordinationRule"


    // $ANTLR start "ruleCoordinationRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:727:1: ruleCoordinationRule returns [EObject current=null] : ( (lv_eventRelations_0_0= ruleEventRelation ) ) ;
    public final EObject ruleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject lv_eventRelations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:730:28: ( ( (lv_eventRelations_0_0= ruleEventRelation ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:731:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:731:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:732:1: (lv_eventRelations_0_0= ruleEventRelation )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:732:1: (lv_eventRelations_0_0= ruleEventRelation )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:733:3: lv_eventRelations_0_0= ruleEventRelation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEventRelation_in_ruleCoordinationRule1474);
            lv_eventRelations_0_0=ruleEventRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoordinationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"eventRelations",
                      		lv_eventRelations_0_0, 
                      		"EventRelation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCoordinationRule"


    // $ANTLR start "entryRuleEventRelation"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:757:1: entryRuleEventRelation returns [EObject current=null] : iv_ruleEventRelation= ruleEventRelation EOF ;
    public final EObject entryRuleEventRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRelation = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:758:2: (iv_ruleEventRelation= ruleEventRelation EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:759:2: iv_ruleEventRelation= ruleEventRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRelationRule()); 
            }
            pushFollow(FOLLOW_ruleEventRelation_in_entryRuleEventRelation1509);
            iv_ruleEventRelation=ruleEventRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRelation1519); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventRelation"


    // $ANTLR start "ruleEventRelation"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:766:1: ruleEventRelation returns [EObject current=null] : ( () (otherlv_1= 'Relation' )? ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleEventRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:769:28: ( ( () (otherlv_1= 'Relation' )? ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:770:1: ( () (otherlv_1= 'Relation' )? ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:770:1: ( () (otherlv_1= 'Relation' )? ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:770:2: () (otherlv_1= 'Relation' )? ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:770:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:771:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRelationAccess().getEventRelationAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:776:2: (otherlv_1= 'Relation' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:776:4: otherlv_1= 'Relation'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleEventRelation1566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEventRelationAccess().getRelationKeyword_1());
                          
                    }

                    }
                    break;

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:780:3: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:781:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:781:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:782:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRelationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventRelation1591);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEventRelation1603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:799:1: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:799:2: ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:799:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:800:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:800:1: (otherlv_4= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:801:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventRelationRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventRelation1624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_4_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:812:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==19) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:812:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEventRelation1637); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEventRelationAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:816:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:817:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:817:1: (otherlv_6= RULE_ID )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:818:3: otherlv_6= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventRelationRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventRelation1657); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_6, grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_4_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEventRelation1673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEventRelation"


    // $ANTLR start "entryRuleImportLibRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:841:1: entryRuleImportLibRule returns [EObject current=null] : iv_ruleImportLibRule= ruleImportLibRule EOF ;
    public final EObject entryRuleImportLibRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportLibRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:842:2: (iv_ruleImportLibRule= ruleImportLibRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:843:2: iv_ruleImportLibRule= ruleImportLibRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportLibRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule1709);
            iv_ruleImportLibRule=ruleImportLibRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportLibRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportLibRule1719); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportLibRule"


    // $ANTLR start "ruleImportLibRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:850:1: ruleImportLibRule returns [EObject current=null] : (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportLibRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:853:28: ( (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:854:1: (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:854:1: (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:854:3: otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleImportLibRule1756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:858:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:859:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:859:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:860:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportLibRule1773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportLibRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportLibRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImportLibRule"


    // $ANTLR start "entryRuleImportInterfaceRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:884:1: entryRuleImportInterfaceRule returns [EObject current=null] : iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF ;
    public final EObject entryRuleImportInterfaceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportInterfaceRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:885:2: (iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:886:2: iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportInterfaceRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule1814);
            iv_ruleImportInterfaceRule=ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportInterfaceRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportInterfaceRule1824); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportInterfaceRule"


    // $ANTLR start "ruleImportInterfaceRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:893:1: ruleImportInterfaceRule returns [EObject current=null] : (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImportInterfaceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:896:28: ( (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:897:1: (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:897:1: (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:897:3: otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleImportInterfaceRule1861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:901:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:902:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:902:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:903:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportInterfaceRule1878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportInterfaceRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportInterfaceRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleImportInterfaceRule1895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:923:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:924:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:924:1: (lv_name_3_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:925:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportInterfaceRule1912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getImportInterfaceRuleAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportInterfaceRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImportInterfaceRule"


    // $ANTLR start "entryRuleGImportStatement"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:951:1: entryRuleGImportStatement returns [EObject current=null] : iv_ruleGImportStatement= ruleGImportStatement EOF ;
    public final EObject entryRuleGImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGImportStatement = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:952:2: (iv_ruleGImportStatement= ruleGImportStatement EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:953:2: iv_ruleGImportStatement= ruleGImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement1955);
            iv_ruleGImportStatement=ruleGImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGImportStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGImportStatement1965); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGImportStatement"


    // $ANTLR start "ruleGImportStatement"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:960:1: ruleGImportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:963:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:964:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:964:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:964:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleGImportStatement2002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGImportStatementAccess().getImportKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:968:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:969:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:969:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:970:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGImportStatement2019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getGImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGImportStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGImportStatement"


    // $ANTLR start "entryRuleGExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:994:1: entryRuleGExpression returns [EObject current=null] : iv_ruleGExpression= ruleGExpression EOF ;
    public final EObject entryRuleGExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:995:2: (iv_ruleGExpression= ruleGExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:996:2: iv_ruleGExpression= ruleGExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_entryRuleGExpression2060);
            iv_ruleGExpression=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGExpression2070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGExpression"


    // $ANTLR start "ruleGExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1003:1: ruleGExpression returns [EObject current=null] : this_GOrExpression_0= ruleGOrExpression ;
    public final EObject ruleGExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1006:28: (this_GOrExpression_0= ruleGOrExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1008:5: this_GOrExpression_0= ruleGOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_ruleGExpression2116);
            this_GOrExpression_0=ruleGOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGExpression"


    // $ANTLR start "entryRuleGOrExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1024:1: entryRuleGOrExpression returns [EObject current=null] : iv_ruleGOrExpression= ruleGOrExpression EOF ;
    public final EObject entryRuleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGOrExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1025:2: (iv_ruleGOrExpression= ruleGOrExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1026:2: iv_ruleGOrExpression= ruleGOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression2150);
            iv_ruleGOrExpression=ruleGOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGOrExpression2160); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGOrExpression"


    // $ANTLR start "ruleGOrExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1033:1: ruleGOrExpression returns [EObject current=null] : (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) ;
    public final EObject ruleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GXorExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1036:28: ( (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1037:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1037:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1038:5: this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression2207);
            this_GXorExpression_0=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GXorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1046:1: ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1046:2: () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1046:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1047:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1052:2: ( (lv_operator_2_0= ruleGOrOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1053:1: (lv_operator_2_0= ruleGOrOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1053:1: (lv_operator_2_0= ruleGOrOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1054:3: lv_operator_2_0= ruleGOrOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGOrOperator_in_ruleGOrExpression2237);
            	    lv_operator_2_0=ruleGOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GOrOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1070:2: ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1071:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1071:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1072:3: lv_rightOperand_3_0= ruleGXorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression2258);
            	    lv_rightOperand_3_0=ruleGXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GXorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGOrExpression"


    // $ANTLR start "entryRuleGXorExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1096:1: entryRuleGXorExpression returns [EObject current=null] : iv_ruleGXorExpression= ruleGXorExpression EOF ;
    public final EObject entryRuleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGXorExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1097:2: (iv_ruleGXorExpression= ruleGXorExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1098:2: iv_ruleGXorExpression= ruleGXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression2296);
            iv_ruleGXorExpression=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGXorExpression2306); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGXorExpression"


    // $ANTLR start "ruleGXorExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1105:1: ruleGXorExpression returns [EObject current=null] : (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) ;
    public final EObject ruleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1108:28: ( (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1109:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1109:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1110:5: this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression2353);
            this_GAndExpression_0=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1118:1: ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1118:2: () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1118:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1119:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1124:2: ( (lv_operator_2_0= ruleGXorOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1125:1: (lv_operator_2_0= ruleGXorOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1125:1: (lv_operator_2_0= ruleGXorOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1126:3: lv_operator_2_0= ruleGXorOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGXorOperator_in_ruleGXorExpression2383);
            	    lv_operator_2_0=ruleGXorOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGXorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GXorOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1142:2: ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1143:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1143:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1144:3: lv_rightOperand_3_0= ruleGAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression2404);
            	    lv_rightOperand_3_0=ruleGAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGXorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGXorExpression"


    // $ANTLR start "entryRuleGAndExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1168:1: entryRuleGAndExpression returns [EObject current=null] : iv_ruleGAndExpression= ruleGAndExpression EOF ;
    public final EObject entryRuleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAndExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1169:2: (iv_ruleGAndExpression= ruleGAndExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1170:2: iv_ruleGAndExpression= ruleGAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression2442);
            iv_ruleGAndExpression=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAndExpression2452); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGAndExpression"


    // $ANTLR start "ruleGAndExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1177:1: ruleGAndExpression returns [EObject current=null] : (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) ;
    public final EObject ruleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1180:28: ( (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1181:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1181:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1182:5: this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2499);
            this_GEqualityExpression_0=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1190:1: ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1190:2: () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1190:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1191:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1196:2: ( (lv_operator_2_0= ruleGAndOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1197:1: (lv_operator_2_0= ruleGAndOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1197:1: (lv_operator_2_0= ruleGAndOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1198:3: lv_operator_2_0= ruleGAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAndOperator_in_ruleGAndExpression2529);
            	    lv_operator_2_0=ruleGAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GAndOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1214:2: ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1215:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1215:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1216:3: lv_rightOperand_3_0= ruleGEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2550);
            	    lv_rightOperand_3_0=ruleGEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGAndExpression"


    // $ANTLR start "entryRuleGEqualityExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1240:1: entryRuleGEqualityExpression returns [EObject current=null] : iv_ruleGEqualityExpression= ruleGEqualityExpression EOF ;
    public final EObject entryRuleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEqualityExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1241:2: (iv_ruleGEqualityExpression= ruleGEqualityExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1242:2: iv_ruleGEqualityExpression= ruleGEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression2588);
            iv_ruleGEqualityExpression=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEqualityExpression2598); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGEqualityExpression"


    // $ANTLR start "ruleGEqualityExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1249:1: ruleGEqualityExpression returns [EObject current=null] : (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) ;
    public final EObject ruleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GRelationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1252:28: ( (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1253:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1253:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1254:5: this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2645);
            this_GRelationExpression_0=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1262:1: ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28||LA18_0==44) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1262:2: () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1262:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1263:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1268:2: ( (lv_operator_2_0= ruleGEqualityOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1269:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1269:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1270:3: lv_operator_2_0= ruleGEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression2675);
            	    lv_operator_2_0=ruleGEqualityOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GEqualityOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1286:2: ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1287:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1287:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1288:3: lv_rightOperand_3_0= ruleGRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2696);
            	    lv_rightOperand_3_0=ruleGRelationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GRelationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGEqualityExpression"


    // $ANTLR start "entryRuleGRelationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1312:1: entryRuleGRelationExpression returns [EObject current=null] : iv_ruleGRelationExpression= ruleGRelationExpression EOF ;
    public final EObject entryRuleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRelationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1313:2: (iv_ruleGRelationExpression= ruleGRelationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1314:2: iv_ruleGRelationExpression= ruleGRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression2734);
            iv_ruleGRelationExpression=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRelationExpression2744); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGRelationExpression"


    // $ANTLR start "ruleGRelationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1321:1: ruleGRelationExpression returns [EObject current=null] : (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) ;
    public final EObject ruleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1324:28: ( (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1325:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1325:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1326:5: this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2791);
            this_GAdditionExpression_0=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAdditionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1334:1: ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=45 && LA19_0<=48)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1334:2: () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1334:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1335:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1340:2: ( (lv_operator_2_0= ruleGRelationOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1341:1: (lv_operator_2_0= ruleGRelationOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1341:1: (lv_operator_2_0= ruleGRelationOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1342:3: lv_operator_2_0= ruleGRelationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression2821);
            	    lv_operator_2_0=ruleGRelationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GRelationOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1358:2: ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1359:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1359:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1360:3: lv_rightOperand_3_0= ruleGAdditionExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2842);
            	    lv_rightOperand_3_0=ruleGAdditionExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GAdditionExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGRelationExpression"


    // $ANTLR start "entryRuleGAdditionExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1384:1: entryRuleGAdditionExpression returns [EObject current=null] : iv_ruleGAdditionExpression= ruleGAdditionExpression EOF ;
    public final EObject entryRuleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAdditionExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1385:2: (iv_ruleGAdditionExpression= ruleGAdditionExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1386:2: iv_ruleGAdditionExpression= ruleGAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression2880);
            iv_ruleGAdditionExpression=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAdditionExpression2890); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGAdditionExpression"


    // $ANTLR start "ruleGAdditionExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1393:1: ruleGAdditionExpression returns [EObject current=null] : (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) ;
    public final EObject ruleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GMultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1396:28: ( (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1397:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1397:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1398:5: this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2937);
            this_GMultiplicationExpression_0=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GMultiplicationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1406:1: ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=49 && LA20_0<=50)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1406:2: () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1406:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1407:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1412:2: ( (lv_operator_2_0= ruleGAdditionOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1413:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1413:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1414:3: lv_operator_2_0= ruleGAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression2967);
            	    lv_operator_2_0=ruleGAdditionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGAdditionExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GAdditionOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1430:2: ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1431:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1431:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1432:3: lv_rightOperand_3_0= ruleGMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2988);
            	    lv_rightOperand_3_0=ruleGMultiplicationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGAdditionExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GMultiplicationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGAdditionExpression"


    // $ANTLR start "entryRuleGMultiplicationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1456:1: entryRuleGMultiplicationExpression returns [EObject current=null] : iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF ;
    public final EObject entryRuleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGMultiplicationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1457:2: (iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1458:2: iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression3026);
            iv_ruleGMultiplicationExpression=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGMultiplicationExpression3036); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGMultiplicationExpression"


    // $ANTLR start "ruleGMultiplicationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1465:1: ruleGMultiplicationExpression returns [EObject current=null] : (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) ;
    public final EObject ruleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNegationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1468:28: ( (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1469:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1469:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1470:5: this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3083);
            this_GNegationExpression_0=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GNegationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1478:1: ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=51 && LA21_0<=52)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1478:2: () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1478:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1479:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1484:2: ( (lv_operator_2_0= ruleGMultiplicationOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1485:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1485:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1486:3: lv_operator_2_0= ruleGMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression3113);
            	    lv_operator_2_0=ruleGMultiplicationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGMultiplicationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GMultiplicationOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1502:2: ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1503:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1503:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1504:3: lv_rightOperand_3_0= ruleGNegationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3134);
            	    lv_rightOperand_3_0=ruleGNegationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGMultiplicationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GNegationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGMultiplicationExpression"


    // $ANTLR start "entryRuleGNegationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1528:1: entryRuleGNegationExpression returns [EObject current=null] : iv_ruleGNegationExpression= ruleGNegationExpression EOF ;
    public final EObject entryRuleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNegationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1529:2: (iv_ruleGNegationExpression= ruleGNegationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1530:2: iv_ruleGNegationExpression= ruleGNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression3172);
            iv_ruleGNegationExpression=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNegationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNegationExpression3182); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGNegationExpression"


    // $ANTLR start "ruleGNegationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1537:1: ruleGNegationExpression returns [EObject current=null] : (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) ;
    public final EObject ruleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNavigationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1540:28: ( (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1541:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1541:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_DOUBLE)||LA22_0==18||(LA22_0>=34 && LA22_0<=35)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=53 && LA22_0<=54)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1542:5: this_GNavigationExpression_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3229);
                    this_GNavigationExpression_0=ruleGNavigationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GNavigationExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1551:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1551:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1551:7: () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1551:7: ()
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1552:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1557:2: ( (lv_operator_2_0= ruleGNegationOperator ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1558:1: (lv_operator_2_0= ruleGNegationOperator )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1558:1: (lv_operator_2_0= ruleGNegationOperator )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1559:3: lv_operator_2_0= ruleGNegationOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression3265);
                    lv_operator_2_0=ruleGNegationOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGNegationExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"GNegationOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1575:2: ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1576:1: (lv_operand_3_0= ruleGNavigationExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1576:1: (lv_operand_3_0= ruleGNavigationExpression )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1577:3: lv_operand_3_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3286);
                    lv_operand_3_0=ruleGNavigationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGNegationExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"GNavigationExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGNegationExpression"


    // $ANTLR start "entryRuleGNavigationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1601:1: entryRuleGNavigationExpression returns [EObject current=null] : iv_ruleGNavigationExpression= ruleGNavigationExpression EOF ;
    public final EObject entryRuleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNavigationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1602:2: (iv_ruleGNavigationExpression= ruleGNavigationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1603:2: iv_ruleGNavigationExpression= ruleGNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression3323);
            iv_ruleGNavigationExpression=ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNavigationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNavigationExpression3333); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGNavigationExpression"


    // $ANTLR start "ruleGNavigationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1610:1: ruleGNavigationExpression returns [EObject current=null] : (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_GReferenceExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1613:28: ( (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1614:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1614:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1615:5: this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression3380);
            this_GReferenceExpression_0=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1623:1: ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=39 && LA23_0<=40)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1623:2: () ruleNavigationOperator ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1623:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1624:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getGNavigationExpressionAccess().getNavigationOperatorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression3405);
            	    ruleNavigationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1637:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1638:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1638:1: (otherlv_3= RULE_ID )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1639:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGNavigationExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGNavigationExpression3424); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGNavigationExpression"


    // $ANTLR start "entryRuleGReferenceExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1658:1: entryRuleGReferenceExpression returns [EObject current=null] : iv_ruleGReferenceExpression= ruleGReferenceExpression EOF ;
    public final EObject entryRuleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGReferenceExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1659:2: (iv_ruleGReferenceExpression= ruleGReferenceExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1660:2: iv_ruleGReferenceExpression= ruleGReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression3462);
            iv_ruleGReferenceExpression=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGReferenceExpression3472); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGReferenceExpression"


    // $ANTLR start "ruleGReferenceExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1667:1: ruleGReferenceExpression returns [EObject current=null] : (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_GPrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1670:28: ( (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1671:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1671:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_DOUBLE)||LA24_0==18||(LA24_0>=34 && LA24_0<=35)) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1672:5: this_GPrimaryExpression_0= ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression3519);
                    this_GPrimaryExpression_0=ruleGPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GPrimaryExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1681:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1681:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1681:7: () ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1681:7: ()
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1682:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1687:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1688:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1688:1: (otherlv_2= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1689:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGReferenceExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGReferenceExpression3554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGReferenceExpression"


    // $ANTLR start "entryRuleGPrimaryExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1708:1: entryRuleGPrimaryExpression returns [EObject current=null] : iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF ;
    public final EObject entryRuleGPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPrimaryExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1709:2: (iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1710:2: iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression3591);
            iv_ruleGPrimaryExpression=ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGPrimaryExpression3601); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGPrimaryExpression"


    // $ANTLR start "ruleGPrimaryExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1717:1: ruleGPrimaryExpression returns [EObject current=null] : (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) ;
    public final EObject ruleGPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GStringExpression_0 = null;

        EObject this_GBooleanExpression_1 = null;

        EObject this_GNumericExpression_2 = null;

        EObject this_GEnumLiteralExpression_3 = null;

        EObject this_GIfExpression_4 = null;

        EObject this_GBraceExpression_5 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1720:28: ( (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1721:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1721:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
            int alt25=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt25=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt25=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt25=3;
                }
                break;
            case 34:
                {
                alt25=4;
                }
                break;
            case 35:
                {
                alt25=5;
                }
                break;
            case 18:
                {
                alt25=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1722:5: this_GStringExpression_0= ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression3648);
                    this_GStringExpression_0=ruleGStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GStringExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1732:5: this_GBooleanExpression_1= ruleGBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression3675);
                    this_GBooleanExpression_1=ruleGBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GBooleanExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1742:5: this_GNumericExpression_2= ruleGNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression3702);
                    this_GNumericExpression_2=ruleGNumericExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GNumericExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1752:5: this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression3729);
                    this_GEnumLiteralExpression_3=ruleGEnumLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GEnumLiteralExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1762:5: this_GIfExpression_4= ruleGIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression3756);
                    this_GIfExpression_4=ruleGIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GIfExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1772:5: this_GBraceExpression_5= ruleGBraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression3783);
                    this_GBraceExpression_5=ruleGBraceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GBraceExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGPrimaryExpression"


    // $ANTLR start "entryRuleGStringExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1788:1: entryRuleGStringExpression returns [EObject current=null] : iv_ruleGStringExpression= ruleGStringExpression EOF ;
    public final EObject entryRuleGStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGStringExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1789:2: (iv_ruleGStringExpression= ruleGStringExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1790:2: iv_ruleGStringExpression= ruleGStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression3818);
            iv_ruleGStringExpression=ruleGStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGStringExpression3828); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGStringExpression"


    // $ANTLR start "ruleGStringExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1797:1: ruleGStringExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1800:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1801:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1801:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1801:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1801:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1802:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1807:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1808:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1808:1: (lv_value_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1809:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGStringExpression3879); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getGStringExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGStringExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGStringExpression"


    // $ANTLR start "entryRuleGBooleanExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1833:1: entryRuleGBooleanExpression returns [EObject current=null] : iv_ruleGBooleanExpression= ruleGBooleanExpression EOF ;
    public final EObject entryRuleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBooleanExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1834:2: (iv_ruleGBooleanExpression= ruleGBooleanExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1835:2: iv_ruleGBooleanExpression= ruleGBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression3920);
            iv_ruleGBooleanExpression=ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBooleanExpression3930); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGBooleanExpression"


    // $ANTLR start "ruleGBooleanExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1842:1: ruleGBooleanExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1845:28: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1846:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1846:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1846:2: () ( (lv_value_1_0= RULE_BOOLEAN ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1846:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1847:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1852:2: ( (lv_value_1_0= RULE_BOOLEAN ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1853:1: (lv_value_1_0= RULE_BOOLEAN )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1853:1: (lv_value_1_0= RULE_BOOLEAN )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1854:3: lv_value_1_0= RULE_BOOLEAN
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression3981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getGBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGBooleanExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"BOOLEAN");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGBooleanExpression"


    // $ANTLR start "entryRuleGNumericExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1878:1: entryRuleGNumericExpression returns [EObject current=null] : iv_ruleGNumericExpression= ruleGNumericExpression EOF ;
    public final EObject entryRuleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNumericExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1879:2: (iv_ruleGNumericExpression= ruleGNumericExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1880:2: iv_ruleGNumericExpression= ruleGNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression4022);
            iv_ruleGNumericExpression=ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNumericExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNumericExpression4032); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGNumericExpression"


    // $ANTLR start "ruleGNumericExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1887:1: ruleGNumericExpression returns [EObject current=null] : (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) ;
    public final EObject ruleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GIntegerExpression_0 = null;

        EObject this_GDoubleExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1890:28: ( (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1891:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1891:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_DOUBLE) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1892:5: this_GIntegerExpression_0= ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression4079);
                    this_GIntegerExpression_0=ruleGIntegerExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GIntegerExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1902:5: this_GDoubleExpression_1= ruleGDoubleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression4106);
                    this_GDoubleExpression_1=ruleGDoubleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GDoubleExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGNumericExpression"


    // $ANTLR start "entryRuleGIntegerExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1918:1: entryRuleGIntegerExpression returns [EObject current=null] : iv_ruleGIntegerExpression= ruleGIntegerExpression EOF ;
    public final EObject entryRuleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIntegerExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1919:2: (iv_ruleGIntegerExpression= ruleGIntegerExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1920:2: iv_ruleGIntegerExpression= ruleGIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression4141);
            iv_ruleGIntegerExpression=ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIntegerExpression4151); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGIntegerExpression"


    // $ANTLR start "ruleGIntegerExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1927:1: ruleGIntegerExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1930:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1931:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1931:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1931:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1931:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1932:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1937:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1938:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1938:1: (lv_value_1_0= RULE_INT )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1939:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGIntegerExpression4202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getGIntegerExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGIntegerExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGIntegerExpression"


    // $ANTLR start "entryRuleGDoubleExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1963:1: entryRuleGDoubleExpression returns [EObject current=null] : iv_ruleGDoubleExpression= ruleGDoubleExpression EOF ;
    public final EObject entryRuleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDoubleExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1964:2: (iv_ruleGDoubleExpression= ruleGDoubleExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1965:2: iv_ruleGDoubleExpression= ruleGDoubleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDoubleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression4243);
            iv_ruleGDoubleExpression=ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDoubleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDoubleExpression4253); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGDoubleExpression"


    // $ANTLR start "ruleGDoubleExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1972:1: ruleGDoubleExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1975:28: ( ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1976:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1976:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1976:2: () ( (lv_value_1_0= RULE_DOUBLE ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1976:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1977:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1982:2: ( (lv_value_1_0= RULE_DOUBLE ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1983:1: (lv_value_1_0= RULE_DOUBLE )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1983:1: (lv_value_1_0= RULE_DOUBLE )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1984:3: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression4304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getGDoubleExpressionAccess().getValueDOUBLETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGDoubleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"DOUBLE");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGDoubleExpression"


    // $ANTLR start "entryRuleGEnumLiteralExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2008:1: entryRuleGEnumLiteralExpression returns [EObject current=null] : iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF ;
    public final EObject entryRuleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEnumLiteralExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2009:2: (iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2010:2: iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression4345);
            iv_ruleGEnumLiteralExpression=ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEnumLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEnumLiteralExpression4355); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGEnumLiteralExpression"


    // $ANTLR start "ruleGEnumLiteralExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2017:1: ruleGEnumLiteralExpression returns [EObject current=null] : ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2020:28: ( ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2021:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2021:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2021:2: () otherlv_1= '#' ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2021:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2022:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleGEnumLiteralExpression4401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2031:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2032:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2032:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2033:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGEnumLiteralExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression4424);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGEnumLiteralExpression"


    // $ANTLR start "entryRuleGIfExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2054:1: entryRuleGIfExpression returns [EObject current=null] : iv_ruleGIfExpression= ruleGIfExpression EOF ;
    public final EObject entryRuleGIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIfExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2055:2: (iv_ruleGIfExpression= ruleGIfExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2056:2: iv_ruleGIfExpression= ruleGIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression4460);
            iv_ruleGIfExpression=ruleGIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIfExpression4470); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGIfExpression"


    // $ANTLR start "ruleGIfExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2063:1: ruleGIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) ;
    public final EObject ruleGIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenExpression_4_0 = null;

        EObject lv_elseExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2066:28: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2067:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2067:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2067:2: () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2067:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2068:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleGIfExpression4516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGIfExpressionAccess().getIfKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2077:1: ( (lv_condition_2_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2078:1: (lv_condition_2_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2078:1: (lv_condition_2_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2079:3: lv_condition_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4537);
            lv_condition_2_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleGIfExpression4549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGIfExpressionAccess().getThenKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2099:1: ( (lv_thenExpression_4_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2100:1: (lv_thenExpression_4_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2100:1: (lv_thenExpression_4_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2101:3: lv_thenExpression_4_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4570);
            lv_thenExpression_4_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"thenExpression",
                      		lv_thenExpression_4_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleGIfExpression4582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGIfExpressionAccess().getElseKeyword_5());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2121:1: ( (lv_elseExpression_6_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2122:1: (lv_elseExpression_6_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2122:1: (lv_elseExpression_6_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2123:3: lv_elseExpression_6_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4603);
            lv_elseExpression_6_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"elseExpression",
                      		lv_elseExpression_6_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleGIfExpression4615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getGIfExpressionAccess().getEndifKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGIfExpression"


    // $ANTLR start "entryRuleGBraceExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2151:1: entryRuleGBraceExpression returns [EObject current=null] : iv_ruleGBraceExpression= ruleGBraceExpression EOF ;
    public final EObject entryRuleGBraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBraceExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2152:2: (iv_ruleGBraceExpression= ruleGBraceExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2153:2: iv_ruleGBraceExpression= ruleGBraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBraceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression4651);
            iv_ruleGBraceExpression=ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBraceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBraceExpression4661); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGBraceExpression"


    // $ANTLR start "ruleGBraceExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2160:1: ruleGBraceExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleGBraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innerExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2163:28: ( ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2164:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2164:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2164:2: () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2164:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2165:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGBraceExpression4707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2174:1: ( (lv_innerExpression_2_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2175:1: (lv_innerExpression_2_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2175:1: (lv_innerExpression_2_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2176:3: lv_innerExpression_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGBraceExpression4728);
            lv_innerExpression_2_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGBraceExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"innerExpression",
                      		lv_innerExpression_2_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleGBraceExpression4740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGBraceExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGBraceExpression"


    // $ANTLR start "entryRuleNavigationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2204:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2205:2: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2206:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator4777);
            iv_ruleNavigationOperator=ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationOperator4788); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigationOperator"


    // $ANTLR start "ruleNavigationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2213:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2216:28: ( (kw= '.' | kw= '->' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2217:1: (kw= '.' | kw= '->' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2217:1: (kw= '.' | kw= '->' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            else if ( (LA27_0==40) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2218:2: kw= '.'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNavigationOperator4826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2225:2: kw= '->'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleNavigationOperator4845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNavigationOperator"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2238:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2239:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2240:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4886);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4897); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2247:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2250:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2251:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2251:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2251:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2258:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_ID) ) {
                        int LA28_3 = input.LA(3);

                        if ( (synpred1_InternalBCOoL()) ) {
                            alt28=1;
                        }


                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2258:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2258:2: ( ( '.' )=>kw= '.' )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2258:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName4965); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4981); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleGAndOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2281:1: ruleGAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleGAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2283:28: ( (enumLiteral_0= 'and' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2284:1: (enumLiteral_0= 'and' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2284:1: (enumLiteral_0= 'and' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2284:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleGAndOperator5041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGAndOperator"


    // $ANTLR start "ruleGXorOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2294:1: ruleGXorOperator returns [Enumerator current=null] : (enumLiteral_0= 'xor' ) ;
    public final Enumerator ruleGXorOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2296:28: ( (enumLiteral_0= 'xor' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2297:1: (enumLiteral_0= 'xor' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2297:1: (enumLiteral_0= 'xor' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2297:3: enumLiteral_0= 'xor'
            {
            enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleGXorOperator5084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGXorOperator"


    // $ANTLR start "ruleGOrOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2307:1: ruleGOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleGOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2309:28: ( (enumLiteral_0= 'or' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2310:1: (enumLiteral_0= 'or' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2310:1: (enumLiteral_0= 'or' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2310:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleGOrOperator5127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGOrOperator"


    // $ANTLR start "ruleGEqualityOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2320:1: ruleGEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleGEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2322:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            else if ( (LA29_0==44) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:2: (enumLiteral_0= '=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:2: (enumLiteral_0= '=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleGEqualityOperator5171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2329:6: (enumLiteral_1= '<>' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2329:6: (enumLiteral_1= '<>' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2329:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleGEqualityOperator5188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGEqualityOperator"


    // $ANTLR start "ruleGRelationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2339:1: ruleGRelationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleGRelationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2341:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt30=1;
                }
                break;
            case 46:
                {
                alt30=2;
                }
                break;
            case 47:
                {
                alt30=3;
                }
                break;
            case 48:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:2: (enumLiteral_0= '<' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:2: (enumLiteral_0= '<' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleGRelationOperator5233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2348:6: (enumLiteral_1= '>' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2348:6: (enumLiteral_1= '>' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2348:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleGRelationOperator5250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2354:6: (enumLiteral_2= '<=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2354:6: (enumLiteral_2= '<=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2354:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_ruleGRelationOperator5267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2360:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2360:6: (enumLiteral_3= '>=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2360:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_48_in_ruleGRelationOperator5284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGRelationOperator"


    // $ANTLR start "ruleGAdditionOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2370:1: ruleGAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleGAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2372:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            else if ( (LA31_0==50) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:2: (enumLiteral_0= '+' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:2: (enumLiteral_0= '+' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleGAdditionOperator5329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2379:6: (enumLiteral_1= '-' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2379:6: (enumLiteral_1= '-' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2379:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleGAdditionOperator5346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGAdditionOperator"


    // $ANTLR start "ruleGMultiplicationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2389:1: ruleGMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleGMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2391:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            else if ( (LA32_0==52) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:2: (enumLiteral_0= '*' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:2: (enumLiteral_0= '*' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleGMultiplicationOperator5391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2398:6: (enumLiteral_1= '/' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2398:6: (enumLiteral_1= '/' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2398:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleGMultiplicationOperator5408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGMultiplicationOperator"


    // $ANTLR start "ruleGNegationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2408:1: ruleGNegationOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) ;
    public final Enumerator ruleGNegationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2410:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            else if ( (LA33_0==54) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:2: (enumLiteral_0= 'not' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:2: (enumLiteral_0= 'not' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleGNegationOperator5453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2417:6: (enumLiteral_1= '~' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2417:6: (enumLiteral_1= '~' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2417:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleGNegationOperator5470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGNegationOperator"

    // $ANTLR start synpred1_InternalBCOoL
    public final void synpred1_InternalBCOoL_fragment() throws RecognitionException {   
        // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2258:3: ( '.' )
        // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2259:2: '.'
        {
        match(input,39,FOLLOW_39_in_synpred1_InternalBCOoL4956); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalBCOoL

    // Delegated rules

    public final boolean synpred1_InternalBCOoL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBCOoL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleBCoolSpec_in_entryRuleBCoolSpec75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolSpec85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolSpec127 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_ruleBCoolSpec154 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_ruleBCoolSpec176 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_ruleBCoolOperatorSpec_in_ruleBCoolSpec198 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorSpec_in_entryRuleBCoolOperatorSpec235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolOperatorSpec245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBCoolOperatorSpec282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorSpec299 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_ruleglobalEventExpressionRule_in_ruleBCoolOperatorSpec325 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_ruleglobalDSEsRule_in_ruleBCoolOperatorSpec347 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_ruleBCoolCompositionRule_in_ruleBCoolOperatorSpec369 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_ruleglobalDSEsRule_in_entryRuleglobalDSEsRule406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglobalDSEsRule416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleglobalDSEsRule453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleglobalDSEsRule470 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleglobalDSEsRule487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalEventExpressionRule_in_entryRuleglobalEventExpressionRule523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglobalEventExpressionRule533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleglobalEventExpressionRule570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventExpression_in_ruleglobalEventExpressionRule592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolCompositionRule_in_entryRuleBCoolCompositionRule627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolCompositionRule637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBCoolCompositionRule674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolCompositionRule691 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBCoolCompositionRule708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule729 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleBCoolCompositionRule742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule763 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleBCoolCompositionRule777 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBCoolCompositionRule789 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_ruleBCoolCompositionRule810 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_ruleBCoolCompositionRule831 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBCoolCompositionRule843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_entryRuleBCoolOperatorArg879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolOperatorArg889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg931 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBCoolOperatorArg948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg968 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBCoolOperatorArg980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingRule1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMatchingRule1083 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleMatchingRule1104 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMatchingRule1116 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMatchingRule1128 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleMatchingRule1141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventExpression_in_ruleMatchingRule1162 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMatchingRule1174 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_entryRuleEventExpression1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExpression1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1264 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEventExpression1281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1301 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventExpression1313 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1334 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEventExpression1347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1367 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleEventExpression1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule1419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinationRule1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_ruleCoordinationRule1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_entryRuleEventRelation1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRelation1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEventRelation1566 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventRelation1591 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventRelation1603 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventRelation1624 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEventRelation1637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventRelation1657 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleEventRelation1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportLibRule1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleImportLibRule1756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportLibRule1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule1814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportInterfaceRule1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleImportInterfaceRule1861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportInterfaceRule1878 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleImportInterfaceRule1895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportInterfaceRule1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement1955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGImportStatement1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGImportStatement2002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGImportStatement2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_entryRuleGExpression2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGExpression2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_ruleGExpression2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGOrExpression2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression2207 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleGOrOperator_in_ruleGOrExpression2237 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression2258 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression2296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGXorExpression2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression2353 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleGXorOperator_in_ruleGXorExpression2383 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression2404 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression2442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAndExpression2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2499 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleGAndOperator_in_ruleGAndExpression2529 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2550 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression2588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEqualityExpression2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2645 = new BitSet(new long[]{0x0000100010000002L});
    public static final BitSet FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression2675 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2696 = new BitSet(new long[]{0x0000100010000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression2734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRelationExpression2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2791 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression2821 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2842 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAdditionExpression2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2937 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression2967 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2988 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression3026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGMultiplicationExpression3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3083 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression3113 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3134 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression3172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNegationExpression3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression3265 = new BitSet(new long[]{0x0000000C000401F0L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression3323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNavigationExpression3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression3380 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression3405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGNavigationExpression3424 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression3462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGReferenceExpression3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGReferenceExpression3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression3591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGPrimaryExpression3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression3818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGStringExpression3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGStringExpression3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression3920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBooleanExpression3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression4022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNumericExpression4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression4141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIntegerExpression4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGIntegerExpression4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression4243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDoubleExpression4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression4345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEnumLiteralExpression4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGEnumLiteralExpression4401 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression4460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIfExpression4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleGIfExpression4516 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4537 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGIfExpression4549 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4570 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleGIfExpression4582 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4603 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleGIfExpression4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression4651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBraceExpression4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGBraceExpression4707 = new BitSet(new long[]{0x0060000C000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGBraceExpression4728 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGBraceExpression4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator4777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNavigationOperator4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNavigationOperator4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4937 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName4965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4981 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_41_in_ruleGAndOperator5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleGXorOperator5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleGOrOperator5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGEqualityOperator5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleGEqualityOperator5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGRelationOperator5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleGRelationOperator5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGRelationOperator5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleGRelationOperator5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleGAdditionOperator5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleGAdditionOperator5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGMultiplicationOperator5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGMultiplicationOperator5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGNegationOperator5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleGNegationOperator5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred1_InternalBCOoL4956 = new BitSet(new long[]{0x0000000000000002L});

}