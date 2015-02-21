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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Spec'", "'Event'", "';'", "'let'", "'Operator'", "'('", "','", "')'", "'MatchingCorrespondance :'", "'end operator;'", "' : '", "'::'", "'when'", "'CoordinationRule:'", "'='", "'ImportLib'", "'ImportInterface'", "'as'", "'import'", "'#'", "'if'", "'then'", "'else'", "'endif'", "'.'", "'->'", "'and'", "'xor'", "'or'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'~'"
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

                if ( (LA2_0==28) ) {
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

                if ( (LA3_0==29) ) {
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:267:1: ruleglobalDSEsRule returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleglobalDSEsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:270:28: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:271:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:271:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:271:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleglobalDSEsRule453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalDSEsRuleAccess().getEventKeyword_0());
                  
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:348:1: ruleBCoolCompositionRule returns [EObject current=null] : (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* )? otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) ;
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
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:351:28: ( (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* )? otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* )? otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* )? otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:3: otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* )? otherlv_6= ')' otherlv_7= 'MatchingCorrespondance :' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;'
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
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:378:1: ( ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:378:2: ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )*
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:378:2: ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:379:1: (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:379:1: (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:380:3: lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule730);
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
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleBCoolCompositionRule743); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:400:1: ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:401:1: (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg )
                    	    {
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:401:1: (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:402:3: lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule764);
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleBCoolCompositionRule780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleBCoolCompositionRule792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_5());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:426:1: ( (lv_matchingRule_8_0= ruleMatchingRule ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:427:1: (lv_matchingRule_8_0= ruleMatchingRule )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:427:1: (lv_matchingRule_8_0= ruleMatchingRule )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:428:3: lv_matchingRule_8_0= ruleMatchingRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_ruleBCoolCompositionRule813);
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
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_ruleBCoolCompositionRule834);
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

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleBCoolCompositionRule846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getBCoolCompositionRuleAccess().getEndOperatorKeyword_8());
                  
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
            pushFollow(FOLLOW_ruleBCoolOperatorArg_in_entryRuleBCoolOperatorArg882);
            iv_ruleBCoolOperatorArg=ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolOperatorArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolOperatorArg892); if (state.failed) return current;

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
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorArg934); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleBCoolOperatorArg951); if (state.failed) return current;
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
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorArg971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleBCoolOperatorArg983); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBCoolOperatorArg1006);
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
            pushFollow(FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule1042);
            iv_ruleMatchingRule=ruleMatchingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingRule1052); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:558:1: ruleMatchingRule returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) ;
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
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:561:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:562:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:562:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:562:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleMatchingRule1089); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGExpression_in_ruleMatchingRule1110);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMatchingRule1122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleMatchingRule1134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:592:1: (otherlv_4= 'Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:592:3: otherlv_4= 'Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleMatchingRule1147); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMatchingRuleAccess().getEventKeyword_4_0());
            	          
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
            	    pushFollow(FOLLOW_ruleEventExpression_in_ruleMatchingRule1168);
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

            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMatchingRule1180); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
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
            pushFollow(FOLLOW_ruleEventExpression_in_entryRuleEventExpression1218);
            iv_ruleEventExpression=ruleEventExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExpression1228); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:635:1: ruleEventExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) ;
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
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:638:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:640:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:640:1: (lv_name_0_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:641:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1270); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEventExpression1287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:661:1: ( (otherlv_2= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:662:1: (otherlv_2= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:662:1: (otherlv_2= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:663:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventExpressionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEventExpression1319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:678:1: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:678:2: ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:678:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:679:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:679:1: (otherlv_4= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:680:3: otherlv_4= RULE_ID
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

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:691:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:691:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEventExpression1353); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:695:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:696:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:696:1: (otherlv_6= RULE_ID )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:697:3: otherlv_6= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventExpressionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1373); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_6, grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEventExpression1389); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:720:1: entryRuleCoordinationRule returns [EObject current=null] : iv_ruleCoordinationRule= ruleCoordinationRule EOF ;
    public final EObject entryRuleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:721:2: (iv_ruleCoordinationRule= ruleCoordinationRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:722:2: iv_ruleCoordinationRule= ruleCoordinationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoordinationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule1425);
            iv_ruleCoordinationRule=ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoordinationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinationRule1435); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:729:1: ruleCoordinationRule returns [EObject current=null] : ( (lv_eventRelations_0_0= ruleEventRelation ) ) ;
    public final EObject ruleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject lv_eventRelations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:732:28: ( ( (lv_eventRelations_0_0= ruleEventRelation ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:733:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:733:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:734:1: (lv_eventRelations_0_0= ruleEventRelation )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:734:1: (lv_eventRelations_0_0= ruleEventRelation )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:735:3: lv_eventRelations_0_0= ruleEventRelation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEventRelation_in_ruleCoordinationRule1480);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:759:1: entryRuleEventRelation returns [EObject current=null] : iv_ruleEventRelation= ruleEventRelation EOF ;
    public final EObject entryRuleEventRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRelation = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:760:2: (iv_ruleEventRelation= ruleEventRelation EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:761:2: iv_ruleEventRelation= ruleEventRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRelationRule()); 
            }
            pushFollow(FOLLOW_ruleEventRelation_in_entryRuleEventRelation1515);
            iv_ruleEventRelation=ruleEventRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRelation1525); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:768:1: ruleEventRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleEventRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:771:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:772:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:772:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:772:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:772:2: ( (otherlv_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:773:1: (otherlv_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:773:1: (otherlv_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:774:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRelationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventRelation1570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleEventRelation1582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:789:1: ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:789:2: ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:789:2: ( ( ruleQualifiedName ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:790:1: ( ruleQualifiedName )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:790:1: ( ruleQualifiedName )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:791:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventRelationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventRelation1606);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:804:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==19) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:804:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleEventRelation1619); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEventRelationAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:808:1: ( ( ruleQualifiedName ) )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:809:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:809:1: ( ruleQualifiedName )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:810:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventRelationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventRelation1642);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleEventRelation1658); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:835:1: entryRuleImportLibRule returns [EObject current=null] : iv_ruleImportLibRule= ruleImportLibRule EOF ;
    public final EObject entryRuleImportLibRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportLibRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:836:2: (iv_ruleImportLibRule= ruleImportLibRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:837:2: iv_ruleImportLibRule= ruleImportLibRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportLibRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule1694);
            iv_ruleImportLibRule=ruleImportLibRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportLibRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportLibRule1704); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:844:1: ruleImportLibRule returns [EObject current=null] : (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportLibRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:847:28: ( (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:848:1: (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:848:1: (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:848:3: otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleImportLibRule1741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:852:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:853:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:853:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:854:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportLibRule1758); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:878:1: entryRuleImportInterfaceRule returns [EObject current=null] : iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF ;
    public final EObject entryRuleImportInterfaceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportInterfaceRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:879:2: (iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:880:2: iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportInterfaceRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule1799);
            iv_ruleImportInterfaceRule=ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportInterfaceRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportInterfaceRule1809); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:887:1: ruleImportInterfaceRule returns [EObject current=null] : (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImportInterfaceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:890:28: ( (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:891:1: (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:891:1: (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:891:3: otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleImportInterfaceRule1846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:895:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:896:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:896:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:897:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportInterfaceRule1863); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleImportInterfaceRule1880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:917:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:918:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:918:1: (lv_name_3_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:919:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportInterfaceRule1897); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:945:1: entryRuleGImportStatement returns [EObject current=null] : iv_ruleGImportStatement= ruleGImportStatement EOF ;
    public final EObject entryRuleGImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGImportStatement = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:946:2: (iv_ruleGImportStatement= ruleGImportStatement EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:947:2: iv_ruleGImportStatement= ruleGImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement1940);
            iv_ruleGImportStatement=ruleGImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGImportStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGImportStatement1950); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:954:1: ruleGImportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:957:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:958:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:958:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:958:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleGImportStatement1987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGImportStatementAccess().getImportKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:962:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:963:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:963:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:964:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGImportStatement2004); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:988:1: entryRuleGExpression returns [EObject current=null] : iv_ruleGExpression= ruleGExpression EOF ;
    public final EObject entryRuleGExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:989:2: (iv_ruleGExpression= ruleGExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:990:2: iv_ruleGExpression= ruleGExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_entryRuleGExpression2045);
            iv_ruleGExpression=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGExpression2055); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:997:1: ruleGExpression returns [EObject current=null] : this_GOrExpression_0= ruleGOrExpression ;
    public final EObject ruleGExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1000:28: (this_GOrExpression_0= ruleGOrExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1002:5: this_GOrExpression_0= ruleGOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_ruleGExpression2101);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1018:1: entryRuleGOrExpression returns [EObject current=null] : iv_ruleGOrExpression= ruleGOrExpression EOF ;
    public final EObject entryRuleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGOrExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1019:2: (iv_ruleGOrExpression= ruleGOrExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1020:2: iv_ruleGOrExpression= ruleGOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression2135);
            iv_ruleGOrExpression=ruleGOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGOrExpression2145); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1027:1: ruleGOrExpression returns [EObject current=null] : (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) ;
    public final EObject ruleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GXorExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1030:28: ( (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1031:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1031:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1032:5: this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression2192);
            this_GXorExpression_0=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GXorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1040:1: ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1040:2: () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1040:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1041:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1046:2: ( (lv_operator_2_0= ruleGOrOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1047:1: (lv_operator_2_0= ruleGOrOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1047:1: (lv_operator_2_0= ruleGOrOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1048:3: lv_operator_2_0= ruleGOrOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGOrOperator_in_ruleGOrExpression2222);
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

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1064:2: ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1065:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1065:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1066:3: lv_rightOperand_3_0= ruleGXorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression2243);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1090:1: entryRuleGXorExpression returns [EObject current=null] : iv_ruleGXorExpression= ruleGXorExpression EOF ;
    public final EObject entryRuleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGXorExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1091:2: (iv_ruleGXorExpression= ruleGXorExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1092:2: iv_ruleGXorExpression= ruleGXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression2281);
            iv_ruleGXorExpression=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGXorExpression2291); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1099:1: ruleGXorExpression returns [EObject current=null] : (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) ;
    public final EObject ruleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1102:28: ( (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1103:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1103:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1104:5: this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression2338);
            this_GAndExpression_0=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1112:1: ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1112:2: () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1112:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1113:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1118:2: ( (lv_operator_2_0= ruleGXorOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1119:1: (lv_operator_2_0= ruleGXorOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1119:1: (lv_operator_2_0= ruleGXorOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1120:3: lv_operator_2_0= ruleGXorOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGXorOperator_in_ruleGXorExpression2368);
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

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1136:2: ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1137:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1137:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1138:3: lv_rightOperand_3_0= ruleGAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression2389);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1162:1: entryRuleGAndExpression returns [EObject current=null] : iv_ruleGAndExpression= ruleGAndExpression EOF ;
    public final EObject entryRuleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAndExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1163:2: (iv_ruleGAndExpression= ruleGAndExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1164:2: iv_ruleGAndExpression= ruleGAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression2427);
            iv_ruleGAndExpression=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAndExpression2437); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1171:1: ruleGAndExpression returns [EObject current=null] : (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) ;
    public final EObject ruleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1174:28: ( (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1175:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1175:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1176:5: this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2484);
            this_GEqualityExpression_0=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1184:1: ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1184:2: () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1184:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1185:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1190:2: ( (lv_operator_2_0= ruleGAndOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1191:1: (lv_operator_2_0= ruleGAndOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1191:1: (lv_operator_2_0= ruleGAndOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1192:3: lv_operator_2_0= ruleGAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAndOperator_in_ruleGAndExpression2514);
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

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1208:2: ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1209:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1209:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1210:3: lv_rightOperand_3_0= ruleGEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2535);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1234:1: entryRuleGEqualityExpression returns [EObject current=null] : iv_ruleGEqualityExpression= ruleGEqualityExpression EOF ;
    public final EObject entryRuleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEqualityExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1235:2: (iv_ruleGEqualityExpression= ruleGEqualityExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1236:2: iv_ruleGEqualityExpression= ruleGEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression2573);
            iv_ruleGEqualityExpression=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEqualityExpression2583); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1243:1: ruleGEqualityExpression returns [EObject current=null] : (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) ;
    public final EObject ruleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GRelationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1246:28: ( (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1247:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1247:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1248:5: this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2630);
            this_GRelationExpression_0=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1256:1: ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27||LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1256:2: () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1256:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1257:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1262:2: ( (lv_operator_2_0= ruleGEqualityOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1263:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1263:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1264:3: lv_operator_2_0= ruleGEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression2660);
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

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1280:2: ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1281:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1281:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1282:3: lv_rightOperand_3_0= ruleGRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2681);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1306:1: entryRuleGRelationExpression returns [EObject current=null] : iv_ruleGRelationExpression= ruleGRelationExpression EOF ;
    public final EObject entryRuleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRelationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1307:2: (iv_ruleGRelationExpression= ruleGRelationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1308:2: iv_ruleGRelationExpression= ruleGRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression2719);
            iv_ruleGRelationExpression=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRelationExpression2729); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1315:1: ruleGRelationExpression returns [EObject current=null] : (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) ;
    public final EObject ruleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1318:28: ( (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1319:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1319:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1320:5: this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2776);
            this_GAdditionExpression_0=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAdditionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1328:1: ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=43 && LA19_0<=46)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1328:2: () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1328:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1329:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1334:2: ( (lv_operator_2_0= ruleGRelationOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1335:1: (lv_operator_2_0= ruleGRelationOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1335:1: (lv_operator_2_0= ruleGRelationOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1336:3: lv_operator_2_0= ruleGRelationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression2806);
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

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1352:2: ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1353:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1353:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1354:3: lv_rightOperand_3_0= ruleGAdditionExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2827);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1378:1: entryRuleGAdditionExpression returns [EObject current=null] : iv_ruleGAdditionExpression= ruleGAdditionExpression EOF ;
    public final EObject entryRuleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAdditionExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1379:2: (iv_ruleGAdditionExpression= ruleGAdditionExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1380:2: iv_ruleGAdditionExpression= ruleGAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression2865);
            iv_ruleGAdditionExpression=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAdditionExpression2875); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1387:1: ruleGAdditionExpression returns [EObject current=null] : (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) ;
    public final EObject ruleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GMultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1390:28: ( (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1391:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1391:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1392:5: this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2922);
            this_GMultiplicationExpression_0=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GMultiplicationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1400:1: ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=47 && LA20_0<=48)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1400:2: () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1400:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1401:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1406:2: ( (lv_operator_2_0= ruleGAdditionOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1407:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1407:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1408:3: lv_operator_2_0= ruleGAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression2952);
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

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1424:2: ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1425:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1425:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1426:3: lv_rightOperand_3_0= ruleGMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2973);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1450:1: entryRuleGMultiplicationExpression returns [EObject current=null] : iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF ;
    public final EObject entryRuleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGMultiplicationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1451:2: (iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1452:2: iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression3011);
            iv_ruleGMultiplicationExpression=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGMultiplicationExpression3021); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1459:1: ruleGMultiplicationExpression returns [EObject current=null] : (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) ;
    public final EObject ruleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNegationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1462:28: ( (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1463:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1463:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1464:5: this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3068);
            this_GNegationExpression_0=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GNegationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1472:1: ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=49 && LA21_0<=50)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1472:2: () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1472:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1473:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1478:2: ( (lv_operator_2_0= ruleGMultiplicationOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1479:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1479:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1480:3: lv_operator_2_0= ruleGMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression3098);
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

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1496:2: ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1497:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1497:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1498:3: lv_rightOperand_3_0= ruleGNegationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3119);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1522:1: entryRuleGNegationExpression returns [EObject current=null] : iv_ruleGNegationExpression= ruleGNegationExpression EOF ;
    public final EObject entryRuleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNegationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1523:2: (iv_ruleGNegationExpression= ruleGNegationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1524:2: iv_ruleGNegationExpression= ruleGNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression3157);
            iv_ruleGNegationExpression=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNegationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNegationExpression3167); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1531:1: ruleGNegationExpression returns [EObject current=null] : (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) ;
    public final EObject ruleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNavigationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1534:28: ( (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1535:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1535:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_DOUBLE)||LA22_0==18||(LA22_0>=32 && LA22_0<=33)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=51 && LA22_0<=52)) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1536:5: this_GNavigationExpression_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3214);
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1545:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1545:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1545:7: () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1545:7: ()
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1546:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1551:2: ( (lv_operator_2_0= ruleGNegationOperator ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1552:1: (lv_operator_2_0= ruleGNegationOperator )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1552:1: (lv_operator_2_0= ruleGNegationOperator )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1553:3: lv_operator_2_0= ruleGNegationOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression3250);
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

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1569:2: ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1570:1: (lv_operand_3_0= ruleGNavigationExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1570:1: (lv_operand_3_0= ruleGNavigationExpression )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1571:3: lv_operand_3_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3271);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1595:1: entryRuleGNavigationExpression returns [EObject current=null] : iv_ruleGNavigationExpression= ruleGNavigationExpression EOF ;
    public final EObject entryRuleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNavigationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1596:2: (iv_ruleGNavigationExpression= ruleGNavigationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1597:2: iv_ruleGNavigationExpression= ruleGNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression3308);
            iv_ruleGNavigationExpression=ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNavigationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNavigationExpression3318); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1604:1: ruleGNavigationExpression returns [EObject current=null] : (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_GReferenceExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1607:28: ( (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1608:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1608:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1609:5: this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression3365);
            this_GReferenceExpression_0=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1617:1: ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=37 && LA23_0<=38)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1617:2: () ruleNavigationOperator ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1617:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1618:5: 
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
            	    pushFollow(FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression3390);
            	    ruleNavigationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1631:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1632:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1632:1: (otherlv_3= RULE_ID )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1633:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGNavigationExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGNavigationExpression3409); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1652:1: entryRuleGReferenceExpression returns [EObject current=null] : iv_ruleGReferenceExpression= ruleGReferenceExpression EOF ;
    public final EObject entryRuleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGReferenceExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1653:2: (iv_ruleGReferenceExpression= ruleGReferenceExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1654:2: iv_ruleGReferenceExpression= ruleGReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression3447);
            iv_ruleGReferenceExpression=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGReferenceExpression3457); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1661:1: ruleGReferenceExpression returns [EObject current=null] : (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_GPrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1664:28: ( (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1665:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1665:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_DOUBLE)||LA24_0==18||(LA24_0>=32 && LA24_0<=33)) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1666:5: this_GPrimaryExpression_0= ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression3504);
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1675:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1675:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1675:7: () ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1675:7: ()
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1676:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1681:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1682:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1682:1: (otherlv_2= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1683:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGReferenceExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGReferenceExpression3539); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1702:1: entryRuleGPrimaryExpression returns [EObject current=null] : iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF ;
    public final EObject entryRuleGPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPrimaryExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1703:2: (iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1704:2: iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression3576);
            iv_ruleGPrimaryExpression=ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGPrimaryExpression3586); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1711:1: ruleGPrimaryExpression returns [EObject current=null] : (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) ;
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
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1714:28: ( (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1715:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1715:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
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
            case 32:
                {
                alt25=4;
                }
                break;
            case 33:
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1716:5: this_GStringExpression_0= ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression3633);
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1726:5: this_GBooleanExpression_1= ruleGBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression3660);
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1736:5: this_GNumericExpression_2= ruleGNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression3687);
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1746:5: this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression3714);
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1756:5: this_GIfExpression_4= ruleGIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression3741);
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1766:5: this_GBraceExpression_5= ruleGBraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression3768);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1782:1: entryRuleGStringExpression returns [EObject current=null] : iv_ruleGStringExpression= ruleGStringExpression EOF ;
    public final EObject entryRuleGStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGStringExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1783:2: (iv_ruleGStringExpression= ruleGStringExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1784:2: iv_ruleGStringExpression= ruleGStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression3803);
            iv_ruleGStringExpression=ruleGStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGStringExpression3813); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1791:1: ruleGStringExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1794:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1795:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1795:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1795:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1795:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1796:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1801:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1802:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1802:1: (lv_value_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1803:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGStringExpression3864); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1827:1: entryRuleGBooleanExpression returns [EObject current=null] : iv_ruleGBooleanExpression= ruleGBooleanExpression EOF ;
    public final EObject entryRuleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBooleanExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1828:2: (iv_ruleGBooleanExpression= ruleGBooleanExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1829:2: iv_ruleGBooleanExpression= ruleGBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression3905);
            iv_ruleGBooleanExpression=ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBooleanExpression3915); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1836:1: ruleGBooleanExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1839:28: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1840:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1840:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1840:2: () ( (lv_value_1_0= RULE_BOOLEAN ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1840:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1841:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1846:2: ( (lv_value_1_0= RULE_BOOLEAN ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1847:1: (lv_value_1_0= RULE_BOOLEAN )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1847:1: (lv_value_1_0= RULE_BOOLEAN )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1848:3: lv_value_1_0= RULE_BOOLEAN
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression3966); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1872:1: entryRuleGNumericExpression returns [EObject current=null] : iv_ruleGNumericExpression= ruleGNumericExpression EOF ;
    public final EObject entryRuleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNumericExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1873:2: (iv_ruleGNumericExpression= ruleGNumericExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1874:2: iv_ruleGNumericExpression= ruleGNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression4007);
            iv_ruleGNumericExpression=ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNumericExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNumericExpression4017); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1881:1: ruleGNumericExpression returns [EObject current=null] : (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) ;
    public final EObject ruleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GIntegerExpression_0 = null;

        EObject this_GDoubleExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1884:28: ( (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1885:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1885:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1886:5: this_GIntegerExpression_0= ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression4064);
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1896:5: this_GDoubleExpression_1= ruleGDoubleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression4091);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1912:1: entryRuleGIntegerExpression returns [EObject current=null] : iv_ruleGIntegerExpression= ruleGIntegerExpression EOF ;
    public final EObject entryRuleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIntegerExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1913:2: (iv_ruleGIntegerExpression= ruleGIntegerExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1914:2: iv_ruleGIntegerExpression= ruleGIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression4126);
            iv_ruleGIntegerExpression=ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIntegerExpression4136); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1921:1: ruleGIntegerExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1924:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1925:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1925:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1925:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1925:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1926:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1931:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1932:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1932:1: (lv_value_1_0= RULE_INT )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1933:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGIntegerExpression4187); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1957:1: entryRuleGDoubleExpression returns [EObject current=null] : iv_ruleGDoubleExpression= ruleGDoubleExpression EOF ;
    public final EObject entryRuleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDoubleExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1958:2: (iv_ruleGDoubleExpression= ruleGDoubleExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1959:2: iv_ruleGDoubleExpression= ruleGDoubleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDoubleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression4228);
            iv_ruleGDoubleExpression=ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDoubleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDoubleExpression4238); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1966:1: ruleGDoubleExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1969:28: ( ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1970:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1970:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1970:2: () ( (lv_value_1_0= RULE_DOUBLE ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1970:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1971:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1976:2: ( (lv_value_1_0= RULE_DOUBLE ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1977:1: (lv_value_1_0= RULE_DOUBLE )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1977:1: (lv_value_1_0= RULE_DOUBLE )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1978:3: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression4289); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2002:1: entryRuleGEnumLiteralExpression returns [EObject current=null] : iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF ;
    public final EObject entryRuleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEnumLiteralExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2003:2: (iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2004:2: iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression4330);
            iv_ruleGEnumLiteralExpression=ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEnumLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEnumLiteralExpression4340); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2011:1: ruleGEnumLiteralExpression returns [EObject current=null] : ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2014:28: ( ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2015:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2015:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2015:2: () otherlv_1= '#' ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2015:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2016:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleGEnumLiteralExpression4386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2025:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2026:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2026:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2027:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGEnumLiteralExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression4409);
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2048:1: entryRuleGIfExpression returns [EObject current=null] : iv_ruleGIfExpression= ruleGIfExpression EOF ;
    public final EObject entryRuleGIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIfExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2049:2: (iv_ruleGIfExpression= ruleGIfExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2050:2: iv_ruleGIfExpression= ruleGIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression4445);
            iv_ruleGIfExpression=ruleGIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIfExpression4455); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2057:1: ruleGIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) ;
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
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2060:28: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2061:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2061:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2061:2: () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2061:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2062:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleGIfExpression4501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGIfExpressionAccess().getIfKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2071:1: ( (lv_condition_2_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2072:1: (lv_condition_2_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2072:1: (lv_condition_2_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2073:3: lv_condition_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4522);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleGIfExpression4534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGIfExpressionAccess().getThenKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2093:1: ( (lv_thenExpression_4_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2094:1: (lv_thenExpression_4_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2094:1: (lv_thenExpression_4_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2095:3: lv_thenExpression_4_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4555);
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

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleGIfExpression4567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGIfExpressionAccess().getElseKeyword_5());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2115:1: ( (lv_elseExpression_6_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2116:1: (lv_elseExpression_6_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2116:1: (lv_elseExpression_6_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2117:3: lv_elseExpression_6_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4588);
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

            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleGIfExpression4600); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2145:1: entryRuleGBraceExpression returns [EObject current=null] : iv_ruleGBraceExpression= ruleGBraceExpression EOF ;
    public final EObject entryRuleGBraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBraceExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2146:2: (iv_ruleGBraceExpression= ruleGBraceExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2147:2: iv_ruleGBraceExpression= ruleGBraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBraceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression4636);
            iv_ruleGBraceExpression=ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBraceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBraceExpression4646); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2154:1: ruleGBraceExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleGBraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innerExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2157:28: ( ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2158:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2158:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2158:2: () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2158:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2159:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGBraceExpression4692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2168:1: ( (lv_innerExpression_2_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2169:1: (lv_innerExpression_2_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2169:1: (lv_innerExpression_2_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2170:3: lv_innerExpression_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGBraceExpression4713);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleGBraceExpression4725); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2198:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2199:2: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2200:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator4762);
            iv_ruleNavigationOperator=ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationOperator4773); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2207:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2210:28: ( (kw= '.' | kw= '->' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2211:1: (kw= '.' | kw= '->' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2211:1: (kw= '.' | kw= '->' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            else if ( (LA27_0==38) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2212:2: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleNavigationOperator4811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2219:2: kw= '->'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleNavigationOperator4830); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2232:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2233:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2234:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4871);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4882); if (state.failed) return current;

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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2241:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2244:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2245:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2245:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2245:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2252:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
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
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2252:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2252:2: ( ( '.' )=>kw= '.' )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2252:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedName4950); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4966); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2275:1: ruleGAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleGAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2277:28: ( (enumLiteral_0= 'and' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2278:1: (enumLiteral_0= 'and' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2278:1: (enumLiteral_0= 'and' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2278:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleGAndOperator5026); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2288:1: ruleGXorOperator returns [Enumerator current=null] : (enumLiteral_0= 'xor' ) ;
    public final Enumerator ruleGXorOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2290:28: ( (enumLiteral_0= 'xor' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2291:1: (enumLiteral_0= 'xor' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2291:1: (enumLiteral_0= 'xor' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2291:3: enumLiteral_0= 'xor'
            {
            enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleGXorOperator5069); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2301:1: ruleGOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleGOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2303:28: ( (enumLiteral_0= 'or' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2304:1: (enumLiteral_0= 'or' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2304:1: (enumLiteral_0= 'or' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2304:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleGOrOperator5112); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2314:1: ruleGEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleGEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2316:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2317:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2317:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            else if ( (LA29_0==42) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2317:2: (enumLiteral_0= '=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2317:2: (enumLiteral_0= '=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2317:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleGEqualityOperator5156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:6: (enumLiteral_1= '<>' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:6: (enumLiteral_1= '<>' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2323:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleGEqualityOperator5173); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2333:1: ruleGRelationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleGRelationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2335:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2336:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2336:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt30=1;
                }
                break;
            case 44:
                {
                alt30=2;
                }
                break;
            case 45:
                {
                alt30=3;
                }
                break;
            case 46:
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2336:2: (enumLiteral_0= '<' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2336:2: (enumLiteral_0= '<' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2336:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleGRelationOperator5218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:6: (enumLiteral_1= '>' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:6: (enumLiteral_1= '>' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2342:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleGRelationOperator5235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2348:6: (enumLiteral_2= '<=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2348:6: (enumLiteral_2= '<=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2348:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleGRelationOperator5252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2354:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2354:6: (enumLiteral_3= '>=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2354:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_46_in_ruleGRelationOperator5269); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2364:1: ruleGAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleGAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2366:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2367:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2367:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            else if ( (LA31_0==48) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2367:2: (enumLiteral_0= '+' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2367:2: (enumLiteral_0= '+' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2367:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleGAdditionOperator5314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:6: (enumLiteral_1= '-' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:6: (enumLiteral_1= '-' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2373:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleGAdditionOperator5331); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2383:1: ruleGMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleGMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2385:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2386:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2386:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            else if ( (LA32_0==50) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2386:2: (enumLiteral_0= '*' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2386:2: (enumLiteral_0= '*' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2386:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleGMultiplicationOperator5376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:6: (enumLiteral_1= '/' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:6: (enumLiteral_1= '/' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2392:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleGMultiplicationOperator5393); if (state.failed) return current;
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
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2402:1: ruleGNegationOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) ;
    public final Enumerator ruleGNegationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2404:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2405:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2405:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            else if ( (LA33_0==52) ) {
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
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2405:2: (enumLiteral_0= 'not' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2405:2: (enumLiteral_0= 'not' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2405:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleGNegationOperator5438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:6: (enumLiteral_1= '~' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:6: (enumLiteral_1= '~' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2411:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleGNegationOperator5455); if (state.failed) return current;
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
        // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2252:3: ( '.' )
        // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2253:2: '.'
        {
        match(input,37,FOLLOW_37_in_synpred1_InternalBCOoL4941); if (state.failed) return ;

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolSpec127 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_ruleBCoolSpec154 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_ruleBCoolSpec176 = new BitSet(new long[]{0x0000000020002000L});
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
    public static final BitSet FOLLOW_18_in_ruleBCoolCompositionRule708 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule730 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleBCoolCompositionRule743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule764 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleBCoolCompositionRule780 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBCoolCompositionRule792 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_ruleBCoolCompositionRule813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_ruleBCoolCompositionRule834 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBCoolCompositionRule846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_entryRuleBCoolOperatorArg882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolOperatorArg892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg934 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBCoolOperatorArg951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg971 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBCoolOperatorArg983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBCoolOperatorArg1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingRule1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMatchingRule1089 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleMatchingRule1110 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMatchingRule1122 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMatchingRule1134 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleMatchingRule1147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventExpression_in_ruleMatchingRule1168 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMatchingRule1180 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_entryRuleEventExpression1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExpression1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1270 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEventExpression1287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1307 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventExpression1319 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1340 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEventExpression1353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1373 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleEventExpression1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinationRule1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_ruleCoordinationRule1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_entryRuleEventRelation1515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRelation1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventRelation1570 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventRelation1582 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventRelation1606 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEventRelation1619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventRelation1642 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleEventRelation1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportLibRule1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleImportLibRule1741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportLibRule1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule1799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportInterfaceRule1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleImportInterfaceRule1846 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportInterfaceRule1863 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleImportInterfaceRule1880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportInterfaceRule1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement1940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGImportStatement1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleGImportStatement1987 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGImportStatement2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_entryRuleGExpression2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGExpression2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_ruleGExpression2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGOrExpression2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression2192 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleGOrOperator_in_ruleGOrExpression2222 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression2243 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGXorExpression2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression2338 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleGXorOperator_in_ruleGXorExpression2368 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression2389 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression2427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAndExpression2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2484 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleGAndOperator_in_ruleGAndExpression2514 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2535 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression2573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEqualityExpression2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2630 = new BitSet(new long[]{0x0000040008000002L});
    public static final BitSet FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression2660 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2681 = new BitSet(new long[]{0x0000040008000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression2719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRelationExpression2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2776 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression2806 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2827 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression2865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAdditionExpression2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2922 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression2952 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2973 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression3011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGMultiplicationExpression3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3068 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression3098 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3119 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression3157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNegationExpression3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression3250 = new BitSet(new long[]{0x00000003000401F0L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression3308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNavigationExpression3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression3365 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression3390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGNavigationExpression3409 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression3447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGReferenceExpression3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGReferenceExpression3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression3576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGPrimaryExpression3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression3803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGStringExpression3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGStringExpression3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression3905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBooleanExpression3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression4007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNumericExpression4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression4126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIntegerExpression4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGIntegerExpression4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression4228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDoubleExpression4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression4330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEnumLiteralExpression4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGEnumLiteralExpression4386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression4445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIfExpression4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGIfExpression4501 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4522 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleGIfExpression4534 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4555 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleGIfExpression4567 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4588 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGIfExpression4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression4636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBraceExpression4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGBraceExpression4692 = new BitSet(new long[]{0x00180003000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGBraceExpression4713 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGBraceExpression4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator4762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNavigationOperator4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNavigationOperator4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4922 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName4950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4966 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_39_in_ruleGAndOperator5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleGXorOperator5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleGOrOperator5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleGEqualityOperator5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleGEqualityOperator5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleGRelationOperator5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleGRelationOperator5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGRelationOperator5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleGRelationOperator5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGAdditionOperator5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleGAdditionOperator5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleGMultiplicationOperator5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleGMultiplicationOperator5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGNegationOperator5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGNegationOperator5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred1_InternalBCOoL4941 = new BitSet(new long[]{0x0000000000000002L});

}