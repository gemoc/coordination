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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Spec'", "'Global Event'", "';'", "'let'", "'Operator'", "'('", "','", "')'", "'MatchingCorrespondance :'", "'end operator;'", "' : '", "'::'", "'when'", "'CoordinationRule:'", "'Local Event'", "'='", "'ImportLib'", "'ImportInterface'", "'as'", "'import'", "'#'", "'if'", "'then'", "'else'", "'endif'", "'.'", "'->'", "'and'", "'xor'", "'or'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'~'"
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

                if ( (LA2_0==29) ) {
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

                if ( (LA3_0==30) ) {
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:348:1: ruleBCoolCompositionRule returns [EObject current=null] : (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) ;
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
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:351:28: ( (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:3: otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;'
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:483:1: ruleBCoolOperatorArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBCoolOperatorArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:486:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( ( ruleQualifiedName ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( ( ruleQualifiedName ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( ( ruleQualifiedName ) )
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
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:526:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:527:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:527:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:528:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolOperatorArgAccess().getDSEECLDefCSCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBCoolOperatorArg1003);
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
    // $ANTLR end "ruleBCoolOperatorArg"


    // $ANTLR start "entryRuleMatchingRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:549:1: entryRuleMatchingRule returns [EObject current=null] : iv_ruleMatchingRule= ruleMatchingRule EOF ;
    public final EObject entryRuleMatchingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchingRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:550:2: (iv_ruleMatchingRule= ruleMatchingRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:551:2: iv_ruleMatchingRule= ruleMatchingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule1039);
            iv_ruleMatchingRule=ruleMatchingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingRule1049); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:558:1: ruleMatchingRule returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) ;
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
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:561:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:562:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:562:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:562:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleMatchingRule1086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMatchingRuleAccess().getWhenKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:566:1: ( (lv_condition_1_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:567:1: (lv_condition_1_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:567:1: (lv_condition_1_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:568:3: lv_condition_1_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchingRuleAccess().getConditionGExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleMatchingRule1107);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMatchingRule1119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleMatchingRule1131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:592:1: (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:592:3: otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleMatchingRule1144); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMatchingRuleAccess().getLocalEventKeyword_4_0());
            	          
            	    }
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:596:1: ( (lv_filterEventExpressions_5_0= ruleEventExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:597:1: (lv_filterEventExpressions_5_0= ruleEventExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:597:1: (lv_filterEventExpressions_5_0= ruleEventExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:598:3: lv_filterEventExpressions_5_0= ruleEventExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsEventExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEventExpression_in_ruleMatchingRule1165);
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

            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMatchingRule1177); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:626:1: entryRuleEventExpression returns [EObject current=null] : iv_ruleEventExpression= ruleEventExpression EOF ;
    public final EObject entryRuleEventExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:627:2: (iv_ruleEventExpression= ruleEventExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:628:2: iv_ruleEventExpression= ruleEventExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventExpression_in_entryRuleEventExpression1215);
            iv_ruleEventExpression=ruleEventExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExpression1225); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:635:1: ruleEventExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleEventExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:638:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:640:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:640:1: (lv_name_0_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:641:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1267); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEventExpression1284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:661:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:662:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:662:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:663:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventExpression1307);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEventExpression1319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:680:1: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:680:2: ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:680:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:681:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:681:1: (otherlv_4= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:682:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventExpressionRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:693:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:693:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEventExpression1353); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:697:1: ( ( ruleQualifiedName ) )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:698:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:698:1: ( ruleQualifiedName )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:699:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventExpressionRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventExpression1376);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEventExpression1392); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:724:1: entryRuleCoordinationRule returns [EObject current=null] : iv_ruleCoordinationRule= ruleCoordinationRule EOF ;
    public final EObject entryRuleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:725:2: (iv_ruleCoordinationRule= ruleCoordinationRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:726:2: iv_ruleCoordinationRule= ruleCoordinationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoordinationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule1428);
            iv_ruleCoordinationRule=ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoordinationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinationRule1438); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:733:1: ruleCoordinationRule returns [EObject current=null] : ( (lv_eventRelations_0_0= ruleEventRelation ) ) ;
    public final EObject ruleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject lv_eventRelations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:736:28: ( ( (lv_eventRelations_0_0= ruleEventRelation ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:737:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:737:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:738:1: (lv_eventRelations_0_0= ruleEventRelation )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:738:1: (lv_eventRelations_0_0= ruleEventRelation )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:739:3: lv_eventRelations_0_0= ruleEventRelation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEventRelation_in_ruleCoordinationRule1483);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:763:1: entryRuleEventRelation returns [EObject current=null] : iv_ruleEventRelation= ruleEventRelation EOF ;
    public final EObject entryRuleEventRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRelation = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:764:2: (iv_ruleEventRelation= ruleEventRelation EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:765:2: iv_ruleEventRelation= ruleEventRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRelationRule()); 
            }
            pushFollow(FOLLOW_ruleEventRelation_in_entryRuleEventRelation1518);
            iv_ruleEventRelation=ruleEventRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRelation1528); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:772:1: ruleEventRelation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleEventRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:775:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:776:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:776:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:776:2: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:776:2: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:777:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:777:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:778:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRelationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventRelation1576);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleEventRelation1588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:795:1: ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:795:2: ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:795:2: ( ( ruleQualifiedName ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:796:1: ( ruleQualifiedName )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:796:1: ( ruleQualifiedName )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:797:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventRelationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventRelation1612);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:810:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:810:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEventRelation1625); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEventRelationAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:814:1: ( ( ruleQualifiedName ) )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:815:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:815:1: ( ruleQualifiedName )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:816:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventRelationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventRelation1648);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleEventRelation1664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_3());
                  
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
            pushFollow(FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule1700);
            iv_ruleImportLibRule=ruleImportLibRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportLibRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportLibRule1710); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleImportLibRule1747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:858:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:859:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:859:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:860:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportLibRule1764); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule1805);
            iv_ruleImportInterfaceRule=ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportInterfaceRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportInterfaceRule1815); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleImportInterfaceRule1852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:901:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:902:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:902:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:903:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportInterfaceRule1869); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleImportInterfaceRule1886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:923:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:924:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:924:1: (lv_name_3_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:925:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportInterfaceRule1903); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement1946);
            iv_ruleGImportStatement=ruleGImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGImportStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGImportStatement1956); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleGImportStatement1993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGImportStatementAccess().getImportKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:968:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:969:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:969:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:970:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGImportStatement2010); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGExpression_in_entryRuleGExpression2051);
            iv_ruleGExpression=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGExpression2061); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleGOrExpression_in_ruleGExpression2107);
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
            pushFollow(FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression2141);
            iv_ruleGOrExpression=ruleGOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGOrExpression2151); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression2198);
            this_GXorExpression_0=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GXorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1046:1: ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    pushFollow(FOLLOW_ruleGOrOperator_in_ruleGOrExpression2228);
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
            	    pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression2249);
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
            	    break loop14;
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
            pushFollow(FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression2287);
            iv_ruleGXorExpression=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGXorExpression2297); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression2344);
            this_GAndExpression_0=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1118:1: ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    pushFollow(FOLLOW_ruleGXorOperator_in_ruleGXorExpression2374);
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
            	    pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression2395);
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
            pushFollow(FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression2433);
            iv_ruleGAndExpression=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAndExpression2443); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2490);
            this_GEqualityExpression_0=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1190:1: ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    pushFollow(FOLLOW_ruleGAndOperator_in_ruleGAndExpression2520);
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
            	    pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2541);
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
            pushFollow(FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression2579);
            iv_ruleGEqualityExpression=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEqualityExpression2589); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2636);
            this_GRelationExpression_0=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1262:1: ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28||LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    pushFollow(FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression2666);
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
            	    pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2687);
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
            pushFollow(FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression2725);
            iv_ruleGRelationExpression=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRelationExpression2735); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2782);
            this_GAdditionExpression_0=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAdditionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1334:1: ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=44 && LA18_0<=47)) ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    pushFollow(FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression2812);
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
            	    pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2833);
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
            pushFollow(FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression2871);
            iv_ruleGAdditionExpression=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAdditionExpression2881); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2928);
            this_GMultiplicationExpression_0=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GMultiplicationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1406:1: ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=48 && LA19_0<=49)) ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    pushFollow(FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression2958);
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
            	    pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2979);
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
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression3017);
            iv_ruleGMultiplicationExpression=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGMultiplicationExpression3027); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3074);
            this_GNegationExpression_0=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GNegationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1478:1: ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=50 && LA20_0<=51)) ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    pushFollow(FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression3104);
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
            	    pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3125);
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
            pushFollow(FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression3163);
            iv_ruleGNegationExpression=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNegationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNegationExpression3173); if (state.failed) return current;

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
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_DOUBLE)||LA21_0==18||(LA21_0>=33 && LA21_0<=34)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=52 && LA21_0<=53)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1542:5: this_GNavigationExpression_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3220);
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
                    pushFollow(FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression3256);
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
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3277);
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
            pushFollow(FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression3314);
            iv_ruleGNavigationExpression=ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNavigationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNavigationExpression3324); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression3371);
            this_GReferenceExpression_0=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1623:1: ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=38 && LA22_0<=39)) ) {
                    alt22=1;
                }


                switch (alt22) {
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
            	    pushFollow(FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression3396);
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
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGNavigationExpression3415); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
            pushFollow(FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression3453);
            iv_ruleGReferenceExpression=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGReferenceExpression3463); if (state.failed) return current;

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
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_DOUBLE)||LA23_0==18||(LA23_0>=33 && LA23_0<=34)) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1672:5: this_GPrimaryExpression_0= ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression3510);
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
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGReferenceExpression3545); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression3582);
            iv_ruleGPrimaryExpression=ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGPrimaryExpression3592); if (state.failed) return current;

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
            int alt24=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt24=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt24=3;
                }
                break;
            case 33:
                {
                alt24=4;
                }
                break;
            case 34:
                {
                alt24=5;
                }
                break;
            case 18:
                {
                alt24=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1722:5: this_GStringExpression_0= ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression3639);
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
                    pushFollow(FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression3666);
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
                    pushFollow(FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression3693);
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
                    pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression3720);
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
                    pushFollow(FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression3747);
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
                    pushFollow(FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression3774);
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
            pushFollow(FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression3809);
            iv_ruleGStringExpression=ruleGStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGStringExpression3819); if (state.failed) return current;

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
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGStringExpression3870); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression3911);
            iv_ruleGBooleanExpression=ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBooleanExpression3921); if (state.failed) return current;

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
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression3972); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression4013);
            iv_ruleGNumericExpression=ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNumericExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNumericExpression4023); if (state.failed) return current;

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
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_DOUBLE) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1892:5: this_GIntegerExpression_0= ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression4070);
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
                    pushFollow(FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression4097);
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
            pushFollow(FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression4132);
            iv_ruleGIntegerExpression=ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIntegerExpression4142); if (state.failed) return current;

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
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGIntegerExpression4193); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression4234);
            iv_ruleGDoubleExpression=ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDoubleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDoubleExpression4244); if (state.failed) return current;

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
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression4295); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression4336);
            iv_ruleGEnumLiteralExpression=ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEnumLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEnumLiteralExpression4346); if (state.failed) return current;

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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleGEnumLiteralExpression4392); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression4415);
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
            pushFollow(FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression4451);
            iv_ruleGIfExpression=ruleGIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIfExpression4461); if (state.failed) return current;

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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleGIfExpression4507); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4528);
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleGIfExpression4540); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4561);
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

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleGIfExpression4573); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4594);
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

            otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleGIfExpression4606); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression4642);
            iv_ruleGBraceExpression=ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBraceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBraceExpression4652); if (state.failed) return current;

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGBraceExpression4698); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGExpression_in_ruleGBraceExpression4719);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleGBraceExpression4731); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator4768);
            iv_ruleNavigationOperator=ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationOperator4779); if (state.failed) return current;

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
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            else if ( (LA26_0==39) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2218:2: kw= '.'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleNavigationOperator4817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2225:2: kw= '->'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNavigationOperator4836); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4877);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4888); if (state.failed) return current;

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
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2258:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_ID) ) {
                        int LA27_3 = input.LA(3);

                        if ( (synpred1_InternalBCOoL()) ) {
                            alt27=1;
                        }


                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2258:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2258:2: ( ( '.' )=>kw= '.' )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2258:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleQualifiedName4956); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4972); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
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
            enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleGAndOperator5032); if (state.failed) return current;
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
            enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleGXorOperator5075); if (state.failed) return current;
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
            enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleGOrOperator5118); if (state.failed) return current;
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
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            else if ( (LA28_0==43) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:2: (enumLiteral_0= '=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:2: (enumLiteral_0= '=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleGEqualityOperator5162); if (state.failed) return current;
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
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleGEqualityOperator5179); if (state.failed) return current;
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
            int alt29=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt29=1;
                }
                break;
            case 45:
                {
                alt29=2;
                }
                break;
            case 46:
                {
                alt29=3;
                }
                break;
            case 47:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:2: (enumLiteral_0= '<' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:2: (enumLiteral_0= '<' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleGRelationOperator5224); if (state.failed) return current;
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
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleGRelationOperator5241); if (state.failed) return current;
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
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleGRelationOperator5258); if (state.failed) return current;
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
                    enumLiteral_3=(Token)match(input,47,FOLLOW_47_in_ruleGRelationOperator5275); if (state.failed) return current;
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
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            else if ( (LA30_0==49) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:2: (enumLiteral_0= '+' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:2: (enumLiteral_0= '+' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleGAdditionOperator5320); if (state.failed) return current;
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
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleGAdditionOperator5337); if (state.failed) return current;
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
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            else if ( (LA31_0==51) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:2: (enumLiteral_0= '*' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:2: (enumLiteral_0= '*' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleGMultiplicationOperator5382); if (state.failed) return current;
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
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleGMultiplicationOperator5399); if (state.failed) return current;
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
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            else if ( (LA32_0==53) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:2: (enumLiteral_0= 'not' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:2: (enumLiteral_0= 'not' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleGNegationOperator5444); if (state.failed) return current;
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
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleGNegationOperator5461); if (state.failed) return current;
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
        match(input,38,FOLLOW_38_in_synpred1_InternalBCOoL4947); if (state.failed) return ;

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolSpec127 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_ruleBCoolSpec154 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_ruleBCoolSpec176 = new BitSet(new long[]{0x0000000040002000L});
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
    public static final BitSet FOLLOW_ruleMatchingRule_in_ruleBCoolCompositionRule810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_ruleBCoolCompositionRule831 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBCoolCompositionRule843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_entryRuleBCoolOperatorArg879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolOperatorArg889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg931 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBCoolOperatorArg948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg968 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBCoolOperatorArg980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBCoolOperatorArg1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingRule1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMatchingRule1086 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleMatchingRule1107 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMatchingRule1119 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMatchingRule1131 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleMatchingRule1144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventExpression_in_ruleMatchingRule1165 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMatchingRule1177 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_entryRuleEventExpression1215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExpression1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1267 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEventExpression1284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventExpression1307 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventExpression1319 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1340 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEventExpression1353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventExpression1376 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleEventExpression1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinationRule1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_ruleCoordinationRule1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_entryRuleEventRelation1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRelation1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventRelation1576 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventRelation1588 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventRelation1612 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEventRelation1625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventRelation1648 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleEventRelation1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule1700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportLibRule1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleImportLibRule1747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportLibRule1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule1805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportInterfaceRule1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleImportInterfaceRule1852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportInterfaceRule1869 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleImportInterfaceRule1886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportInterfaceRule1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement1946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGImportStatement1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGImportStatement1993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGImportStatement2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_entryRuleGExpression2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGExpression2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_ruleGExpression2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGOrExpression2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression2198 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleGOrOperator_in_ruleGOrExpression2228 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression2249 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression2287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGXorExpression2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression2344 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleGXorOperator_in_ruleGXorExpression2374 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression2395 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression2433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAndExpression2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2490 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleGAndOperator_in_ruleGAndExpression2520 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2541 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression2579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEqualityExpression2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2636 = new BitSet(new long[]{0x0000080010000002L});
    public static final BitSet FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression2666 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2687 = new BitSet(new long[]{0x0000080010000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression2725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRelationExpression2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2782 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression2812 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2833 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression2871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAdditionExpression2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2928 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression2958 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2979 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression3017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGMultiplicationExpression3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3074 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression3104 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3125 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression3163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNegationExpression3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression3256 = new BitSet(new long[]{0x00000006000401F0L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression3314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNavigationExpression3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression3371 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression3396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGNavigationExpression3415 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression3453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGReferenceExpression3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGReferenceExpression3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGPrimaryExpression3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression3809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGStringExpression3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGStringExpression3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression3911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBooleanExpression3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression4013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNumericExpression4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression4132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIntegerExpression4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGIntegerExpression4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression4234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDoubleExpression4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression4336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEnumLiteralExpression4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGEnumLiteralExpression4392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression4451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIfExpression4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGIfExpression4507 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4528 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleGIfExpression4540 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4561 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGIfExpression4573 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4594 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleGIfExpression4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression4642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBraceExpression4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGBraceExpression4698 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGBraceExpression4719 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGBraceExpression4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator4768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNavigationOperator4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNavigationOperator4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4928 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedName4956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4972 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_40_in_ruleGAndOperator5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleGXorOperator5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleGOrOperator5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGEqualityOperator5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleGEqualityOperator5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleGRelationOperator5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGRelationOperator5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleGRelationOperator5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGRelationOperator5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleGAdditionOperator5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleGAdditionOperator5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleGMultiplicationOperator5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGMultiplicationOperator5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGNegationOperator5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGNegationOperator5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred1_InternalBCOoL4947 = new BitSet(new long[]{0x0000000000000002L});

}