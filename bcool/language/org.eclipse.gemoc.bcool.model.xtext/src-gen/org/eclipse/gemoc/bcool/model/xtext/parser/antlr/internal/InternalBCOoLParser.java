package org.eclipse.gemoc.bcool.model.xtext.parser.antlr.internal; 

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
import org.eclipse.gemoc.bcool.model.xtext.services.BCOoLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBCOoLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Spec'", "'Global Event'", "';'", "'let'", "'Operator'", "'('", "','", "')'", "'MatchingCorrespondance:'", "'end operator;'", "' : '", "'::'", "'when'", "'CoordinationRule:'", "'Local Event'", "'='", "'ImportLib'", "'ImportInterface'", "'as'", "'import'", "'#'", "'if'", "'then'", "'else'", "'endif'", "'.'", "'->'", "'and'", "'xor'", "'or'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'~'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBCOoLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBCOoLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBCOoLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBCOoL.g"; }



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
    // InternalBCOoL.g:68:1: entryRuleBCoolSpec returns [EObject current=null] : iv_ruleBCoolSpec= ruleBCoolSpec EOF ;
    public final EObject entryRuleBCoolSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolSpec = null;


        try {
            // InternalBCOoL.g:69:2: (iv_ruleBCoolSpec= ruleBCoolSpec EOF )
            // InternalBCOoL.g:70:2: iv_ruleBCoolSpec= ruleBCoolSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBCoolSpec=ruleBCoolSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:77:1: ruleBCoolSpec returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ ) ;
    public final EObject ruleBCoolSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_importsLib_1_0 = null;

        EObject lv_importsBehavioralInterface_2_0 = null;

        EObject lv_bcoolOperators_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:80:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ ) )
            // InternalBCOoL.g:81:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ )
            {
            // InternalBCOoL.g:81:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ )
            // InternalBCOoL.g:81:2: ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+
            {
            // InternalBCOoL.g:81:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBCOoL.g:82:1: (lv_name_0_0= RULE_ID )
                    {
                    // InternalBCOoL.g:82:1: (lv_name_0_0= RULE_ID )
                    // InternalBCOoL.g:83:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalBCOoL.g:99:3: ( (lv_importsLib_1_0= ruleImportLibRule ) )+
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
            	    // InternalBCOoL.g:100:1: (lv_importsLib_1_0= ruleImportLibRule )
            	    {
            	    // InternalBCOoL.g:100:1: (lv_importsLib_1_0= ruleImportLibRule )
            	    // InternalBCOoL.g:101:3: lv_importsLib_1_0= ruleImportLibRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolSpecAccess().getImportsLibImportLibRuleParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
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
            	              		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.ImportLibRule");
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

            // InternalBCOoL.g:117:3: ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+
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
            	    // InternalBCOoL.g:118:1: (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule )
            	    {
            	    // InternalBCOoL.g:118:1: (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule )
            	    // InternalBCOoL.g:119:3: lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceImportInterfaceRuleParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
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
            	              		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.ImportInterfaceRule");
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

            // InternalBCOoL.g:135:3: ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=13 && LA4_0<=14)||(LA4_0>=16 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBCOoL.g:136:1: (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec )
            	    {
            	    // InternalBCOoL.g:136:1: (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec )
            	    // InternalBCOoL.g:137:3: lv_bcoolOperators_3_0= ruleBCoolOperatorSpec
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsBCoolOperatorSpecParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
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
            	              		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.BCoolOperatorSpec");
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
    // InternalBCOoL.g:161:1: entryRuleBCoolOperatorSpec returns [EObject current=null] : iv_ruleBCoolOperatorSpec= ruleBCoolOperatorSpec EOF ;
    public final EObject entryRuleBCoolOperatorSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolOperatorSpec = null;


        try {
            // InternalBCOoL.g:162:2: (iv_ruleBCoolOperatorSpec= ruleBCoolOperatorSpec EOF )
            // InternalBCOoL.g:163:2: iv_ruleBCoolOperatorSpec= ruleBCoolOperatorSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolOperatorSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBCoolOperatorSpec=ruleBCoolOperatorSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolOperatorSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:170:1: ruleBCoolOperatorSpec returns [EObject current=null] : ( (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ ) ;
    public final EObject ruleBCoolOperatorSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_globalEventExpressions_2_0 = null;

        EObject lv_globalDSEs_3_0 = null;

        EObject lv_bcoolCompositionRules_4_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:173:28: ( ( (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ ) )
            // InternalBCOoL.g:174:1: ( (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ )
            {
            // InternalBCOoL.g:174:1: ( (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ )
            // InternalBCOoL.g:174:2: (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+
            {
            // InternalBCOoL.g:174:2: (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBCOoL.g:174:4: otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBCoolOperatorSpecAccess().getSpecKeyword_0_0());
                          
                    }
                    // InternalBCOoL.g:178:1: ( (lv_name_1_0= RULE_ID ) )
                    // InternalBCOoL.g:179:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalBCOoL.g:179:1: (lv_name_1_0= RULE_ID )
                    // InternalBCOoL.g:180:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getBCoolOperatorSpecAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBCoolOperatorSpecRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalBCOoL.g:196:4: ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBCOoL.g:197:1: (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule )
                    {
                    // InternalBCOoL.g:197:1: (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule )
                    // InternalBCOoL.g:198:3: lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsGlobalEventExpressionRuleParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
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
                              		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.globalEventExpressionRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalBCOoL.g:214:3: ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBCOoL.g:215:1: (lv_globalDSEs_3_0= ruleglobalDSEsRule )
                    {
                    // InternalBCOoL.g:215:1: (lv_globalDSEs_3_0= ruleglobalDSEsRule )
                    // InternalBCOoL.g:216:3: lv_globalDSEs_3_0= ruleglobalDSEsRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsGlobalDSEsRuleParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
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
                              		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.globalDSEsRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalBCOoL.g:232:3: ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBCOoL.g:233:1: (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule )
            	    {
            	    // InternalBCOoL.g:233:1: (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule )
            	    // InternalBCOoL.g:234:3: lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesBCoolCompositionRuleParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
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
            	              		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.BCoolCompositionRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // InternalBCOoL.g:258:1: entryRuleglobalDSEsRule returns [EObject current=null] : iv_ruleglobalDSEsRule= ruleglobalDSEsRule EOF ;
    public final EObject entryRuleglobalDSEsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleglobalDSEsRule = null;


        try {
            // InternalBCOoL.g:259:2: (iv_ruleglobalDSEsRule= ruleglobalDSEsRule EOF )
            // InternalBCOoL.g:260:2: iv_ruleglobalDSEsRule= ruleglobalDSEsRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalDSEsRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleglobalDSEsRule=ruleglobalDSEsRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleglobalDSEsRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:267:1: ruleglobalDSEsRule returns [EObject current=null] : (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleglobalDSEsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:270:28: ( (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalBCOoL.g:271:1: (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalBCOoL.g:271:1: (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalBCOoL.g:271:3: otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalDSEsRuleAccess().getGlobalEventKeyword_0());
                  
            }
            // InternalBCOoL.g:275:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalBCOoL.g:276:1: (lv_name_1_0= RULE_ID )
            {
            // InternalBCOoL.g:276:1: (lv_name_1_0= RULE_ID )
            // InternalBCOoL.g:277:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:305:1: entryRuleglobalEventExpressionRule returns [EObject current=null] : iv_ruleglobalEventExpressionRule= ruleglobalEventExpressionRule EOF ;
    public final EObject entryRuleglobalEventExpressionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleglobalEventExpressionRule = null;


        try {
            // InternalBCOoL.g:306:2: (iv_ruleglobalEventExpressionRule= ruleglobalEventExpressionRule EOF )
            // InternalBCOoL.g:307:2: iv_ruleglobalEventExpressionRule= ruleglobalEventExpressionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalEventExpressionRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleglobalEventExpressionRule=ruleglobalEventExpressionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleglobalEventExpressionRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:314:1: ruleglobalEventExpressionRule returns [EObject current=null] : (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression ) ;
    public final EObject ruleglobalEventExpressionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_EventExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:317:28: ( (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression ) )
            // InternalBCOoL.g:318:1: (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression )
            {
            // InternalBCOoL.g:318:1: (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression )
            // InternalBCOoL.g:318:3: otherlv_0= 'let' this_EventExpression_1= ruleEventExpression
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalEventExpressionRuleAccess().getLetKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGlobalEventExpressionRuleAccess().getEventExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_2);
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
    // InternalBCOoL.g:339:1: entryRuleBCoolCompositionRule returns [EObject current=null] : iv_ruleBCoolCompositionRule= ruleBCoolCompositionRule EOF ;
    public final EObject entryRuleBCoolCompositionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolCompositionRule = null;


        try {
            // InternalBCOoL.g:340:2: (iv_ruleBCoolCompositionRule= ruleBCoolCompositionRule EOF )
            // InternalBCOoL.g:341:2: iv_ruleBCoolCompositionRule= ruleBCoolCompositionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolCompositionRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBCoolCompositionRule=ruleBCoolCompositionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolCompositionRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:348:1: ruleBCoolCompositionRule returns [EObject current=null] : (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' (otherlv_7= 'MatchingCorrespondance:' )? ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) ;
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
            // InternalBCOoL.g:351:28: ( (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' (otherlv_7= 'MatchingCorrespondance:' )? ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) )
            // InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' (otherlv_7= 'MatchingCorrespondance:' )? ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            {
            // InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' (otherlv_7= 'MatchingCorrespondance:' )? ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            // InternalBCOoL.g:352:3: otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' (otherlv_7= 'MatchingCorrespondance:' )? ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBCoolCompositionRuleAccess().getOperatorKeyword_0());
                  
            }
            // InternalBCOoL.g:356:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalBCOoL.g:357:1: (lv_name_1_0= RULE_ID )
            {
            // InternalBCOoL.g:357:1: (lv_name_1_0= RULE_ID )
            // InternalBCOoL.g:358:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBCoolCompositionRuleAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalBCOoL.g:378:1: ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) )
            // InternalBCOoL.g:379:1: (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg )
            {
            // InternalBCOoL.g:379:1: (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg )
            // InternalBCOoL.g:380:3: lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
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
                      		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.BCoolOperatorArg");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBCOoL.g:396:2: (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBCOoL.g:396:4: otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalBCOoL.g:400:1: ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) )
            	    // InternalBCOoL.g:401:1: (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg )
            	    {
            	    // InternalBCOoL.g:401:1: (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg )
            	    // InternalBCOoL.g:402:3: lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_11);
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
            	              		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.BCoolOperatorArg");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_5());
                  
            }
            // InternalBCOoL.g:422:1: (otherlv_7= 'MatchingCorrespondance:' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBCOoL.g:422:3: otherlv_7= 'MatchingCorrespondance:'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_6());
                          
                    }

                    }
                    break;

            }

            // InternalBCOoL.g:426:3: ( (lv_matchingRule_8_0= ruleMatchingRule ) )
            // InternalBCOoL.g:427:1: (lv_matchingRule_8_0= ruleMatchingRule )
            {
            // InternalBCOoL.g:427:1: (lv_matchingRule_8_0= ruleMatchingRule )
            // InternalBCOoL.g:428:3: lv_matchingRule_8_0= ruleMatchingRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
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
                      		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.MatchingRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBCOoL.g:444:2: ( (lv_coordinationRule_9_0= ruleCoordinationRule ) )
            // InternalBCOoL.g:445:1: (lv_coordinationRule_9_0= ruleCoordinationRule )
            {
            // InternalBCOoL.g:445:1: (lv_coordinationRule_9_0= ruleCoordinationRule )
            // InternalBCOoL.g:446:3: lv_coordinationRule_9_0= ruleCoordinationRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
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
                      		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.CoordinationRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:474:1: entryRuleBCoolOperatorArg returns [EObject current=null] : iv_ruleBCoolOperatorArg= ruleBCoolOperatorArg EOF ;
    public final EObject entryRuleBCoolOperatorArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolOperatorArg = null;


        try {
            // InternalBCOoL.g:475:2: (iv_ruleBCoolOperatorArg= ruleBCoolOperatorArg EOF )
            // InternalBCOoL.g:476:2: iv_ruleBCoolOperatorArg= ruleBCoolOperatorArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolOperatorArgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBCoolOperatorArg=ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolOperatorArg; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:483:1: ruleBCoolOperatorArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_STRING ) )? ) ;
    public final EObject ruleBCoolOperatorArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:486:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_STRING ) )? ) )
            // InternalBCOoL.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_STRING ) )? )
            {
            // InternalBCOoL.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_STRING ) )? )
            // InternalBCOoL.g:487:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) )? ( (otherlv_5= RULE_STRING ) )?
            {
            // InternalBCOoL.g:487:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBCOoL.g:488:1: (lv_name_0_0= RULE_ID )
            {
            // InternalBCOoL.g:488:1: (lv_name_0_0= RULE_ID )
            // InternalBCOoL.g:489:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBCoolOperatorArgAccess().getSpaceColonSpaceKeyword_1());
                  
            }
            // InternalBCOoL.g:509:1: ( (otherlv_2= RULE_ID ) )
            // InternalBCOoL.g:510:1: (otherlv_2= RULE_ID )
            {
            // InternalBCOoL.g:510:1: (otherlv_2= RULE_ID )
            // InternalBCOoL.g:511:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBCoolOperatorArgAccess().getColonColonKeyword_3());
                  
            }
            // InternalBCOoL.g:526:1: ( (otherlv_4= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBCOoL.g:527:1: (otherlv_4= RULE_ID )
                    {
                    // InternalBCOoL.g:527:1: (otherlv_4= RULE_ID )
                    // InternalBCOoL.g:528:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getBCoolOperatorArgAccess().getDSEDefPropertyCSCrossReference_4_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // InternalBCOoL.g:539:3: ( (otherlv_5= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBCOoL.g:540:1: (otherlv_5= RULE_STRING )
                    {
                    // InternalBCOoL.g:540:1: (otherlv_5= RULE_STRING )
                    // InternalBCOoL.g:541:3: otherlv_5= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getBCoolOperatorArgAccess().getInterfaceClassEClassCrossReference_5_0()); 
                      	
                    }

                    }


                    }
                    break;

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
    // InternalBCOoL.g:560:1: entryRuleMatchingRule returns [EObject current=null] : iv_ruleMatchingRule= ruleMatchingRule EOF ;
    public final EObject entryRuleMatchingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchingRule = null;


        try {
            // InternalBCOoL.g:561:2: (iv_ruleMatchingRule= ruleMatchingRule EOF )
            // InternalBCOoL.g:562:2: iv_ruleMatchingRule= ruleMatchingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchingRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMatchingRule=ruleMatchingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:569:1: ruleMatchingRule returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) ;
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
            // InternalBCOoL.g:572:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) )
            // InternalBCOoL.g:573:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            {
            // InternalBCOoL.g:573:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            // InternalBCOoL.g:573:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMatchingRuleAccess().getWhenKeyword_0());
                  
            }
            // InternalBCOoL.g:577:1: ( (lv_condition_1_0= ruleGExpression ) )
            // InternalBCOoL.g:578:1: (lv_condition_1_0= ruleGExpression )
            {
            // InternalBCOoL.g:578:1: (lv_condition_1_0= ruleGExpression )
            // InternalBCOoL.g:579:3: lv_condition_1_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchingRuleAccess().getConditionGExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
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
                      		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3());
                  
            }
            // InternalBCOoL.g:603:1: (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBCOoL.g:603:3: otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMatchingRuleAccess().getLocalEventKeyword_4_0());
            	          
            	    }
            	    // InternalBCOoL.g:607:1: ( (lv_filterEventExpressions_5_0= ruleEventExpression ) )
            	    // InternalBCOoL.g:608:1: (lv_filterEventExpressions_5_0= ruleEventExpression )
            	    {
            	    // InternalBCOoL.g:608:1: (lv_filterEventExpressions_5_0= ruleEventExpression )
            	    // InternalBCOoL.g:609:3: lv_filterEventExpressions_5_0= ruleEventExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsEventExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
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
            	              		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.EventExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalBCOoL.g:637:1: entryRuleEventExpression returns [EObject current=null] : iv_ruleEventExpression= ruleEventExpression EOF ;
    public final EObject entryRuleEventExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventExpression = null;


        try {
            // InternalBCOoL.g:638:2: (iv_ruleEventExpression= ruleEventExpression EOF )
            // InternalBCOoL.g:639:2: iv_ruleEventExpression= ruleEventExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventExpression=ruleEventExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:646:1: ruleEventExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleEventExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:649:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) )
            // InternalBCOoL.g:650:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            {
            // InternalBCOoL.g:650:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            // InternalBCOoL.g:650:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')'
            {
            // InternalBCOoL.g:650:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBCOoL.g:651:1: (lv_name_0_0= RULE_ID )
            {
            // InternalBCOoL.g:651:1: (lv_name_0_0= RULE_ID )
            // InternalBCOoL.g:652:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalBCOoL.g:672:1: ( ( ruleQualifiedName ) )
            // InternalBCOoL.g:673:1: ( ruleQualifiedName )
            {
            // InternalBCOoL.g:673:1: ( ruleQualifiedName )
            // InternalBCOoL.g:674:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // InternalBCOoL.g:691:1: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBCOoL.g:691:2: ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // InternalBCOoL.g:691:2: ( (otherlv_4= RULE_ID ) )
                    // InternalBCOoL.g:692:1: (otherlv_4= RULE_ID )
                    {
                    // InternalBCOoL.g:692:1: (otherlv_4= RULE_ID )
                    // InternalBCOoL.g:693:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventExpressionRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_0_0()); 
                      	
                    }

                    }


                    }

                    // InternalBCOoL.g:704:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBCOoL.g:704:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // InternalBCOoL.g:708:1: ( (otherlv_6= RULE_ID ) )
                    	    // InternalBCOoL.g:709:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalBCOoL.g:709:1: (otherlv_6= RULE_ID )
                    	    // InternalBCOoL.g:710:3: otherlv_6= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventExpressionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_6, grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
                    	      	
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
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:733:1: entryRuleCoordinationRule returns [EObject current=null] : iv_ruleCoordinationRule= ruleCoordinationRule EOF ;
    public final EObject entryRuleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationRule = null;


        try {
            // InternalBCOoL.g:734:2: (iv_ruleCoordinationRule= ruleCoordinationRule EOF )
            // InternalBCOoL.g:735:2: iv_ruleCoordinationRule= ruleCoordinationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoordinationRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationRule=ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoordinationRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:742:1: ruleCoordinationRule returns [EObject current=null] : ( (lv_eventRelations_0_0= ruleEventRelation ) ) ;
    public final EObject ruleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject lv_eventRelations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:745:28: ( ( (lv_eventRelations_0_0= ruleEventRelation ) ) )
            // InternalBCOoL.g:746:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            {
            // InternalBCOoL.g:746:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            // InternalBCOoL.g:747:1: (lv_eventRelations_0_0= ruleEventRelation )
            {
            // InternalBCOoL.g:747:1: (lv_eventRelations_0_0= ruleEventRelation )
            // InternalBCOoL.g:748:3: lv_eventRelations_0_0= ruleEventRelation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.eclipse.gemoc.bcool.model.xtext.BCOoL.EventRelation");
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
    // InternalBCOoL.g:772:1: entryRuleEventRelation returns [EObject current=null] : iv_ruleEventRelation= ruleEventRelation EOF ;
    public final EObject entryRuleEventRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRelation = null;


        try {
            // InternalBCOoL.g:773:2: (iv_ruleEventRelation= ruleEventRelation EOF )
            // InternalBCOoL.g:774:2: iv_ruleEventRelation= ruleEventRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventRelation=ruleEventRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:781:1: ruleEventRelation returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleEventRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:784:28: ( ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ) )
            // InternalBCOoL.g:785:1: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' )
            {
            // InternalBCOoL.g:785:1: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' )
            // InternalBCOoL.g:785:2: () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')'
            {
            // InternalBCOoL.g:785:2: ()
            // InternalBCOoL.g:786:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRelationAccess().getEventRelationAction_0(),
                          current);
                  
            }

            }

            // InternalBCOoL.g:791:2: ( ( ruleQualifiedName ) )
            // InternalBCOoL.g:792:1: ( ruleQualifiedName )
            {
            // InternalBCOoL.g:792:1: ( ruleQualifiedName )
            // InternalBCOoL.g:793:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRelationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalBCOoL.g:810:1: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBCOoL.g:810:2: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalBCOoL.g:810:2: ( (otherlv_3= RULE_ID ) )
                    // InternalBCOoL.g:811:1: (otherlv_3= RULE_ID )
                    {
                    // InternalBCOoL.g:811:1: (otherlv_3= RULE_ID )
                    // InternalBCOoL.g:812:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventRelationRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSCrossReference_3_0_0()); 
                      	
                    }

                    }


                    }

                    // InternalBCOoL.g:823:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBCOoL.g:823:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getEventRelationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalBCOoL.g:827:1: ( (otherlv_5= RULE_ID ) )
                    	    // InternalBCOoL.g:828:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalBCOoL.g:828:1: (otherlv_5= RULE_ID )
                    	    // InternalBCOoL.g:829:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventRelationRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSCrossReference_3_1_1_0()); 
                    	      	
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
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_4());
                  
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
    // InternalBCOoL.g:852:1: entryRuleImportLibRule returns [EObject current=null] : iv_ruleImportLibRule= ruleImportLibRule EOF ;
    public final EObject entryRuleImportLibRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportLibRule = null;


        try {
            // InternalBCOoL.g:853:2: (iv_ruleImportLibRule= ruleImportLibRule EOF )
            // InternalBCOoL.g:854:2: iv_ruleImportLibRule= ruleImportLibRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportLibRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportLibRule=ruleImportLibRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportLibRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:861:1: ruleImportLibRule returns [EObject current=null] : (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportLibRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:864:28: ( (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalBCOoL.g:865:1: (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalBCOoL.g:865:1: (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalBCOoL.g:865:3: otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0());
                  
            }
            // InternalBCOoL.g:869:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalBCOoL.g:870:1: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalBCOoL.g:870:1: (lv_importURI_1_0= RULE_STRING )
            // InternalBCOoL.g:871:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // InternalBCOoL.g:895:1: entryRuleImportInterfaceRule returns [EObject current=null] : iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF ;
    public final EObject entryRuleImportInterfaceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportInterfaceRule = null;


        try {
            // InternalBCOoL.g:896:2: (iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF )
            // InternalBCOoL.g:897:2: iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportInterfaceRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportInterfaceRule=ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportInterfaceRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:904:1: ruleImportInterfaceRule returns [EObject current=null] : (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImportInterfaceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:907:28: ( (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalBCOoL.g:908:1: (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalBCOoL.g:908:1: (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalBCOoL.g:908:3: otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0());
                  
            }
            // InternalBCOoL.g:912:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalBCOoL.g:913:1: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalBCOoL.g:913:1: (lv_importURI_1_0= RULE_STRING )
            // InternalBCOoL.g:914:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2());
                  
            }
            // InternalBCOoL.g:934:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalBCOoL.g:935:1: (lv_name_3_0= RULE_ID )
            {
            // InternalBCOoL.g:935:1: (lv_name_3_0= RULE_ID )
            // InternalBCOoL.g:936:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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
    // InternalBCOoL.g:962:1: entryRuleGImportStatement returns [EObject current=null] : iv_ruleGImportStatement= ruleGImportStatement EOF ;
    public final EObject entryRuleGImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGImportStatement = null;


        try {
            // InternalBCOoL.g:963:2: (iv_ruleGImportStatement= ruleGImportStatement EOF )
            // InternalBCOoL.g:964:2: iv_ruleGImportStatement= ruleGImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGImportStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGImportStatement=ruleGImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGImportStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:971:1: ruleGImportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:974:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalBCOoL.g:975:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalBCOoL.g:975:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalBCOoL.g:975:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGImportStatementAccess().getImportKeyword_0());
                  
            }
            // InternalBCOoL.g:979:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalBCOoL.g:980:1: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalBCOoL.g:980:1: (lv_importURI_1_0= RULE_STRING )
            // InternalBCOoL.g:981:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // InternalBCOoL.g:1005:1: entryRuleGExpression returns [EObject current=null] : iv_ruleGExpression= ruleGExpression EOF ;
    public final EObject entryRuleGExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGExpression = null;


        try {
            // InternalBCOoL.g:1006:2: (iv_ruleGExpression= ruleGExpression EOF )
            // InternalBCOoL.g:1007:2: iv_ruleGExpression= ruleGExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGExpression=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1014:1: ruleGExpression returns [EObject current=null] : this_GOrExpression_0= ruleGOrExpression ;
    public final EObject ruleGExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1017:28: (this_GOrExpression_0= ruleGOrExpression )
            // InternalBCOoL.g:1019:5: this_GOrExpression_0= ruleGOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
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
    // InternalBCOoL.g:1035:1: entryRuleGOrExpression returns [EObject current=null] : iv_ruleGOrExpression= ruleGOrExpression EOF ;
    public final EObject entryRuleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGOrExpression = null;


        try {
            // InternalBCOoL.g:1036:2: (iv_ruleGOrExpression= ruleGOrExpression EOF )
            // InternalBCOoL.g:1037:2: iv_ruleGOrExpression= ruleGOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGOrExpression=ruleGOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1044:1: ruleGOrExpression returns [EObject current=null] : (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) ;
    public final EObject ruleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GXorExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1047:28: ( (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) )
            // InternalBCOoL.g:1048:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            {
            // InternalBCOoL.g:1048:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            // InternalBCOoL.g:1049:5: this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_25);
            this_GXorExpression_0=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GXorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBCOoL.g:1057:1: ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBCOoL.g:1057:2: () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    {
            	    // InternalBCOoL.g:1057:2: ()
            	    // InternalBCOoL.g:1058:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBCOoL.g:1063:2: ( (lv_operator_2_0= ruleGOrOperator ) )
            	    // InternalBCOoL.g:1064:1: (lv_operator_2_0= ruleGOrOperator )
            	    {
            	    // InternalBCOoL.g:1064:1: (lv_operator_2_0= ruleGOrOperator )
            	    // InternalBCOoL.g:1065:3: lv_operator_2_0= ruleGOrOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GOrOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalBCOoL.g:1081:2: ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    // InternalBCOoL.g:1082:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    {
            	    // InternalBCOoL.g:1082:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    // InternalBCOoL.g:1083:3: lv_rightOperand_3_0= ruleGXorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GXorExpression");
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
    // $ANTLR end "ruleGOrExpression"


    // $ANTLR start "entryRuleGXorExpression"
    // InternalBCOoL.g:1107:1: entryRuleGXorExpression returns [EObject current=null] : iv_ruleGXorExpression= ruleGXorExpression EOF ;
    public final EObject entryRuleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGXorExpression = null;


        try {
            // InternalBCOoL.g:1108:2: (iv_ruleGXorExpression= ruleGXorExpression EOF )
            // InternalBCOoL.g:1109:2: iv_ruleGXorExpression= ruleGXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGXorExpression=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGXorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1116:1: ruleGXorExpression returns [EObject current=null] : (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) ;
    public final EObject ruleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1119:28: ( (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) )
            // InternalBCOoL.g:1120:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            {
            // InternalBCOoL.g:1120:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            // InternalBCOoL.g:1121:5: this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_26);
            this_GAndExpression_0=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBCOoL.g:1129:1: ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBCOoL.g:1129:2: () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    {
            	    // InternalBCOoL.g:1129:2: ()
            	    // InternalBCOoL.g:1130:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBCOoL.g:1135:2: ( (lv_operator_2_0= ruleGXorOperator ) )
            	    // InternalBCOoL.g:1136:1: (lv_operator_2_0= ruleGXorOperator )
            	    {
            	    // InternalBCOoL.g:1136:1: (lv_operator_2_0= ruleGXorOperator )
            	    // InternalBCOoL.g:1137:3: lv_operator_2_0= ruleGXorOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GXorOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalBCOoL.g:1153:2: ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    // InternalBCOoL.g:1154:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    {
            	    // InternalBCOoL.g:1154:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    // InternalBCOoL.g:1155:3: lv_rightOperand_3_0= ruleGAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GAndExpression");
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
    // $ANTLR end "ruleGXorExpression"


    // $ANTLR start "entryRuleGAndExpression"
    // InternalBCOoL.g:1179:1: entryRuleGAndExpression returns [EObject current=null] : iv_ruleGAndExpression= ruleGAndExpression EOF ;
    public final EObject entryRuleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAndExpression = null;


        try {
            // InternalBCOoL.g:1180:2: (iv_ruleGAndExpression= ruleGAndExpression EOF )
            // InternalBCOoL.g:1181:2: iv_ruleGAndExpression= ruleGAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGAndExpression=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1188:1: ruleGAndExpression returns [EObject current=null] : (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) ;
    public final EObject ruleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1191:28: ( (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) )
            // InternalBCOoL.g:1192:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            {
            // InternalBCOoL.g:1192:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            // InternalBCOoL.g:1193:5: this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_27);
            this_GEqualityExpression_0=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBCOoL.g:1201:1: ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBCOoL.g:1201:2: () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    {
            	    // InternalBCOoL.g:1201:2: ()
            	    // InternalBCOoL.g:1202:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBCOoL.g:1207:2: ( (lv_operator_2_0= ruleGAndOperator ) )
            	    // InternalBCOoL.g:1208:1: (lv_operator_2_0= ruleGAndOperator )
            	    {
            	    // InternalBCOoL.g:1208:1: (lv_operator_2_0= ruleGAndOperator )
            	    // InternalBCOoL.g:1209:3: lv_operator_2_0= ruleGAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GAndOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalBCOoL.g:1225:2: ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    // InternalBCOoL.g:1226:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    {
            	    // InternalBCOoL.g:1226:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    // InternalBCOoL.g:1227:3: lv_rightOperand_3_0= ruleGEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GEqualityExpression");
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
    // $ANTLR end "ruleGAndExpression"


    // $ANTLR start "entryRuleGEqualityExpression"
    // InternalBCOoL.g:1251:1: entryRuleGEqualityExpression returns [EObject current=null] : iv_ruleGEqualityExpression= ruleGEqualityExpression EOF ;
    public final EObject entryRuleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEqualityExpression = null;


        try {
            // InternalBCOoL.g:1252:2: (iv_ruleGEqualityExpression= ruleGEqualityExpression EOF )
            // InternalBCOoL.g:1253:2: iv_ruleGEqualityExpression= ruleGEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGEqualityExpression=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1260:1: ruleGEqualityExpression returns [EObject current=null] : (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) ;
    public final EObject ruleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GRelationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1263:28: ( (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) )
            // InternalBCOoL.g:1264:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            {
            // InternalBCOoL.g:1264:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            // InternalBCOoL.g:1265:5: this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_28);
            this_GRelationExpression_0=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBCOoL.g:1273:1: ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28||LA21_0==43) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBCOoL.g:1273:2: () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    {
            	    // InternalBCOoL.g:1273:2: ()
            	    // InternalBCOoL.g:1274:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBCOoL.g:1279:2: ( (lv_operator_2_0= ruleGEqualityOperator ) )
            	    // InternalBCOoL.g:1280:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    {
            	    // InternalBCOoL.g:1280:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    // InternalBCOoL.g:1281:3: lv_operator_2_0= ruleGEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GEqualityOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalBCOoL.g:1297:2: ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    // InternalBCOoL.g:1298:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    {
            	    // InternalBCOoL.g:1298:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    // InternalBCOoL.g:1299:3: lv_rightOperand_3_0= ruleGRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GRelationExpression");
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
    // $ANTLR end "ruleGEqualityExpression"


    // $ANTLR start "entryRuleGRelationExpression"
    // InternalBCOoL.g:1323:1: entryRuleGRelationExpression returns [EObject current=null] : iv_ruleGRelationExpression= ruleGRelationExpression EOF ;
    public final EObject entryRuleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRelationExpression = null;


        try {
            // InternalBCOoL.g:1324:2: (iv_ruleGRelationExpression= ruleGRelationExpression EOF )
            // InternalBCOoL.g:1325:2: iv_ruleGRelationExpression= ruleGRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGRelationExpression=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGRelationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1332:1: ruleGRelationExpression returns [EObject current=null] : (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) ;
    public final EObject ruleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1335:28: ( (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) )
            // InternalBCOoL.g:1336:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            {
            // InternalBCOoL.g:1336:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            // InternalBCOoL.g:1337:5: this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_29);
            this_GAdditionExpression_0=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAdditionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBCOoL.g:1345:1: ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=44 && LA22_0<=47)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBCOoL.g:1345:2: () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    {
            	    // InternalBCOoL.g:1345:2: ()
            	    // InternalBCOoL.g:1346:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBCOoL.g:1351:2: ( (lv_operator_2_0= ruleGRelationOperator ) )
            	    // InternalBCOoL.g:1352:1: (lv_operator_2_0= ruleGRelationOperator )
            	    {
            	    // InternalBCOoL.g:1352:1: (lv_operator_2_0= ruleGRelationOperator )
            	    // InternalBCOoL.g:1353:3: lv_operator_2_0= ruleGRelationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GRelationOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalBCOoL.g:1369:2: ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    // InternalBCOoL.g:1370:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    {
            	    // InternalBCOoL.g:1370:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    // InternalBCOoL.g:1371:3: lv_rightOperand_3_0= ruleGAdditionExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GAdditionExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleGRelationExpression"


    // $ANTLR start "entryRuleGAdditionExpression"
    // InternalBCOoL.g:1395:1: entryRuleGAdditionExpression returns [EObject current=null] : iv_ruleGAdditionExpression= ruleGAdditionExpression EOF ;
    public final EObject entryRuleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAdditionExpression = null;


        try {
            // InternalBCOoL.g:1396:2: (iv_ruleGAdditionExpression= ruleGAdditionExpression EOF )
            // InternalBCOoL.g:1397:2: iv_ruleGAdditionExpression= ruleGAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGAdditionExpression=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAdditionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1404:1: ruleGAdditionExpression returns [EObject current=null] : (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) ;
    public final EObject ruleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GMultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1407:28: ( (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) )
            // InternalBCOoL.g:1408:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            {
            // InternalBCOoL.g:1408:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            // InternalBCOoL.g:1409:5: this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_30);
            this_GMultiplicationExpression_0=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GMultiplicationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBCOoL.g:1417:1: ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=48 && LA23_0<=49)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBCOoL.g:1417:2: () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    {
            	    // InternalBCOoL.g:1417:2: ()
            	    // InternalBCOoL.g:1418:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBCOoL.g:1423:2: ( (lv_operator_2_0= ruleGAdditionOperator ) )
            	    // InternalBCOoL.g:1424:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    {
            	    // InternalBCOoL.g:1424:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    // InternalBCOoL.g:1425:3: lv_operator_2_0= ruleGAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GAdditionOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalBCOoL.g:1441:2: ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    // InternalBCOoL.g:1442:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    {
            	    // InternalBCOoL.g:1442:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    // InternalBCOoL.g:1443:3: lv_rightOperand_3_0= ruleGMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GMultiplicationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleGAdditionExpression"


    // $ANTLR start "entryRuleGMultiplicationExpression"
    // InternalBCOoL.g:1467:1: entryRuleGMultiplicationExpression returns [EObject current=null] : iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF ;
    public final EObject entryRuleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGMultiplicationExpression = null;


        try {
            // InternalBCOoL.g:1468:2: (iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF )
            // InternalBCOoL.g:1469:2: iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGMultiplicationExpression=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1476:1: ruleGMultiplicationExpression returns [EObject current=null] : (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) ;
    public final EObject ruleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNegationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1479:28: ( (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) )
            // InternalBCOoL.g:1480:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            {
            // InternalBCOoL.g:1480:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            // InternalBCOoL.g:1481:5: this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_31);
            this_GNegationExpression_0=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GNegationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBCOoL.g:1489:1: ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=50 && LA24_0<=51)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBCOoL.g:1489:2: () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    {
            	    // InternalBCOoL.g:1489:2: ()
            	    // InternalBCOoL.g:1490:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBCOoL.g:1495:2: ( (lv_operator_2_0= ruleGMultiplicationOperator ) )
            	    // InternalBCOoL.g:1496:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    {
            	    // InternalBCOoL.g:1496:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    // InternalBCOoL.g:1497:3: lv_operator_2_0= ruleGMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GMultiplicationOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalBCOoL.g:1513:2: ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    // InternalBCOoL.g:1514:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    {
            	    // InternalBCOoL.g:1514:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    // InternalBCOoL.g:1515:3: lv_rightOperand_3_0= ruleGNegationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_31);
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
            	              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GNegationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalBCOoL.g:1539:1: entryRuleGNegationExpression returns [EObject current=null] : iv_ruleGNegationExpression= ruleGNegationExpression EOF ;
    public final EObject entryRuleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNegationExpression = null;


        try {
            // InternalBCOoL.g:1540:2: (iv_ruleGNegationExpression= ruleGNegationExpression EOF )
            // InternalBCOoL.g:1541:2: iv_ruleGNegationExpression= ruleGNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGNegationExpression=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNegationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1548:1: ruleGNegationExpression returns [EObject current=null] : (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) ;
    public final EObject ruleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNavigationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1551:28: ( (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) )
            // InternalBCOoL.g:1552:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            {
            // InternalBCOoL.g:1552:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_DOUBLE)||LA25_0==18||(LA25_0>=33 && LA25_0<=34)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=52 && LA25_0<=53)) ) {
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
                    // InternalBCOoL.g:1553:5: this_GNavigationExpression_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBCOoL.g:1562:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    {
                    // InternalBCOoL.g:1562:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    // InternalBCOoL.g:1562:7: () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    {
                    // InternalBCOoL.g:1562:7: ()
                    // InternalBCOoL.g:1563:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalBCOoL.g:1568:2: ( (lv_operator_2_0= ruleGNegationOperator ) )
                    // InternalBCOoL.g:1569:1: (lv_operator_2_0= ruleGNegationOperator )
                    {
                    // InternalBCOoL.g:1569:1: (lv_operator_2_0= ruleGNegationOperator )
                    // InternalBCOoL.g:1570:3: lv_operator_2_0= ruleGNegationOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_32);
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
                              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GNegationOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalBCOoL.g:1586:2: ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    // InternalBCOoL.g:1587:1: (lv_operand_3_0= ruleGNavigationExpression )
                    {
                    // InternalBCOoL.g:1587:1: (lv_operand_3_0= ruleGNavigationExpression )
                    // InternalBCOoL.g:1588:3: lv_operand_3_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GNavigationExpression");
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
    // InternalBCOoL.g:1612:1: entryRuleGNavigationExpression returns [EObject current=null] : iv_ruleGNavigationExpression= ruleGNavigationExpression EOF ;
    public final EObject entryRuleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNavigationExpression = null;


        try {
            // InternalBCOoL.g:1613:2: (iv_ruleGNavigationExpression= ruleGNavigationExpression EOF )
            // InternalBCOoL.g:1614:2: iv_ruleGNavigationExpression= ruleGNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGNavigationExpression=ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNavigationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1621:1: ruleGNavigationExpression returns [EObject current=null] : (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_GReferenceExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1624:28: ( (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalBCOoL.g:1625:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalBCOoL.g:1625:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            // InternalBCOoL.g:1626:5: this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_33);
            this_GReferenceExpression_0=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBCOoL.g:1634:1: ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=38 && LA26_0<=39)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBCOoL.g:1634:2: () ruleNavigationOperator ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalBCOoL.g:1634:2: ()
            	    // InternalBCOoL.g:1635:5: 
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
            	    pushFollow(FOLLOW_7);
            	    ruleNavigationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // InternalBCOoL.g:1648:1: ( (otherlv_3= RULE_ID ) )
            	    // InternalBCOoL.g:1649:1: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBCOoL.g:1649:1: (otherlv_3= RULE_ID )
            	    // InternalBCOoL.g:1650:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGNavigationExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalBCOoL.g:1669:1: entryRuleGReferenceExpression returns [EObject current=null] : iv_ruleGReferenceExpression= ruleGReferenceExpression EOF ;
    public final EObject entryRuleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGReferenceExpression = null;


        try {
            // InternalBCOoL.g:1670:2: (iv_ruleGReferenceExpression= ruleGReferenceExpression EOF )
            // InternalBCOoL.g:1671:2: iv_ruleGReferenceExpression= ruleGReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGReferenceExpression=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGReferenceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1678:1: ruleGReferenceExpression returns [EObject current=null] : (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_GPrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1681:28: ( (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalBCOoL.g:1682:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalBCOoL.g:1682:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_DOUBLE)||LA27_0==18||(LA27_0>=33 && LA27_0<=34)) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
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
                    // InternalBCOoL.g:1683:5: this_GPrimaryExpression_0= ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBCOoL.g:1692:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalBCOoL.g:1692:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    // InternalBCOoL.g:1692:7: () ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalBCOoL.g:1692:7: ()
                    // InternalBCOoL.g:1693:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalBCOoL.g:1698:2: ( (otherlv_2= RULE_ID ) )
                    // InternalBCOoL.g:1699:1: (otherlv_2= RULE_ID )
                    {
                    // InternalBCOoL.g:1699:1: (otherlv_2= RULE_ID )
                    // InternalBCOoL.g:1700:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGReferenceExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:1719:1: entryRuleGPrimaryExpression returns [EObject current=null] : iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF ;
    public final EObject entryRuleGPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPrimaryExpression = null;


        try {
            // InternalBCOoL.g:1720:2: (iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF )
            // InternalBCOoL.g:1721:2: iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGPrimaryExpression=ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1728:1: ruleGPrimaryExpression returns [EObject current=null] : (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) ;
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
            // InternalBCOoL.g:1731:28: ( (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) )
            // InternalBCOoL.g:1732:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
            {
            // InternalBCOoL.g:1732:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
            int alt28=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt28=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt28=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt28=3;
                }
                break;
            case 33:
                {
                alt28=4;
                }
                break;
            case 34:
                {
                alt28=5;
                }
                break;
            case 18:
                {
                alt28=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalBCOoL.g:1733:5: this_GStringExpression_0= ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBCOoL.g:1743:5: this_GBooleanExpression_1= ruleGBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBCOoL.g:1753:5: this_GNumericExpression_2= ruleGNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBCOoL.g:1763:5: this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBCOoL.g:1773:5: this_GIfExpression_4= ruleGIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBCOoL.g:1783:5: this_GBraceExpression_5= ruleGBraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalBCOoL.g:1799:1: entryRuleGStringExpression returns [EObject current=null] : iv_ruleGStringExpression= ruleGStringExpression EOF ;
    public final EObject entryRuleGStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGStringExpression = null;


        try {
            // InternalBCOoL.g:1800:2: (iv_ruleGStringExpression= ruleGStringExpression EOF )
            // InternalBCOoL.g:1801:2: iv_ruleGStringExpression= ruleGStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGStringExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGStringExpression=ruleGStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGStringExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1808:1: ruleGStringExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:1811:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalBCOoL.g:1812:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalBCOoL.g:1812:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalBCOoL.g:1812:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalBCOoL.g:1812:2: ()
            // InternalBCOoL.g:1813:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalBCOoL.g:1818:2: ( (lv_value_1_0= RULE_STRING ) )
            // InternalBCOoL.g:1819:1: (lv_value_1_0= RULE_STRING )
            {
            // InternalBCOoL.g:1819:1: (lv_value_1_0= RULE_STRING )
            // InternalBCOoL.g:1820:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // InternalBCOoL.g:1844:1: entryRuleGBooleanExpression returns [EObject current=null] : iv_ruleGBooleanExpression= ruleGBooleanExpression EOF ;
    public final EObject entryRuleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBooleanExpression = null;


        try {
            // InternalBCOoL.g:1845:2: (iv_ruleGBooleanExpression= ruleGBooleanExpression EOF )
            // InternalBCOoL.g:1846:2: iv_ruleGBooleanExpression= ruleGBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGBooleanExpression=ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBooleanExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1853:1: ruleGBooleanExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:1856:28: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) )
            // InternalBCOoL.g:1857:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            {
            // InternalBCOoL.g:1857:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            // InternalBCOoL.g:1857:2: () ( (lv_value_1_0= RULE_BOOLEAN ) )
            {
            // InternalBCOoL.g:1857:2: ()
            // InternalBCOoL.g:1858:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalBCOoL.g:1863:2: ( (lv_value_1_0= RULE_BOOLEAN ) )
            // InternalBCOoL.g:1864:1: (lv_value_1_0= RULE_BOOLEAN )
            {
            // InternalBCOoL.g:1864:1: (lv_value_1_0= RULE_BOOLEAN )
            // InternalBCOoL.g:1865:3: lv_value_1_0= RULE_BOOLEAN
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.BOOLEAN");
              	    
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
    // InternalBCOoL.g:1889:1: entryRuleGNumericExpression returns [EObject current=null] : iv_ruleGNumericExpression= ruleGNumericExpression EOF ;
    public final EObject entryRuleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNumericExpression = null;


        try {
            // InternalBCOoL.g:1890:2: (iv_ruleGNumericExpression= ruleGNumericExpression EOF )
            // InternalBCOoL.g:1891:2: iv_ruleGNumericExpression= ruleGNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGNumericExpression=ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNumericExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1898:1: ruleGNumericExpression returns [EObject current=null] : (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) ;
    public final EObject ruleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GIntegerExpression_0 = null;

        EObject this_GDoubleExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:1901:28: ( (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) )
            // InternalBCOoL.g:1902:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
            {
            // InternalBCOoL.g:1902:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_DOUBLE) ) {
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
                    // InternalBCOoL.g:1903:5: this_GIntegerExpression_0= ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBCOoL.g:1913:5: this_GDoubleExpression_1= ruleGDoubleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalBCOoL.g:1929:1: entryRuleGIntegerExpression returns [EObject current=null] : iv_ruleGIntegerExpression= ruleGIntegerExpression EOF ;
    public final EObject entryRuleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIntegerExpression = null;


        try {
            // InternalBCOoL.g:1930:2: (iv_ruleGIntegerExpression= ruleGIntegerExpression EOF )
            // InternalBCOoL.g:1931:2: iv_ruleGIntegerExpression= ruleGIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGIntegerExpression=ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIntegerExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1938:1: ruleGIntegerExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:1941:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalBCOoL.g:1942:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalBCOoL.g:1942:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalBCOoL.g:1942:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalBCOoL.g:1942:2: ()
            // InternalBCOoL.g:1943:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalBCOoL.g:1948:2: ( (lv_value_1_0= RULE_INT ) )
            // InternalBCOoL.g:1949:1: (lv_value_1_0= RULE_INT )
            {
            // InternalBCOoL.g:1949:1: (lv_value_1_0= RULE_INT )
            // InternalBCOoL.g:1950:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
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
    // InternalBCOoL.g:1974:1: entryRuleGDoubleExpression returns [EObject current=null] : iv_ruleGDoubleExpression= ruleGDoubleExpression EOF ;
    public final EObject entryRuleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDoubleExpression = null;


        try {
            // InternalBCOoL.g:1975:2: (iv_ruleGDoubleExpression= ruleGDoubleExpression EOF )
            // InternalBCOoL.g:1976:2: iv_ruleGDoubleExpression= ruleGDoubleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDoubleExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGDoubleExpression=ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDoubleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:1983:1: ruleGDoubleExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:1986:28: ( ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) )
            // InternalBCOoL.g:1987:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            {
            // InternalBCOoL.g:1987:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            // InternalBCOoL.g:1987:2: () ( (lv_value_1_0= RULE_DOUBLE ) )
            {
            // InternalBCOoL.g:1987:2: ()
            // InternalBCOoL.g:1988:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0(),
                          current);
                  
            }

            }

            // InternalBCOoL.g:1993:2: ( (lv_value_1_0= RULE_DOUBLE ) )
            // InternalBCOoL.g:1994:1: (lv_value_1_0= RULE_DOUBLE )
            {
            // InternalBCOoL.g:1994:1: (lv_value_1_0= RULE_DOUBLE )
            // InternalBCOoL.g:1995:3: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.DOUBLE");
              	    
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
    // InternalBCOoL.g:2019:1: entryRuleGEnumLiteralExpression returns [EObject current=null] : iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF ;
    public final EObject entryRuleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEnumLiteralExpression = null;


        try {
            // InternalBCOoL.g:2020:2: (iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF )
            // InternalBCOoL.g:2021:2: iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGEnumLiteralExpression=ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEnumLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:2028:1: ruleGEnumLiteralExpression returns [EObject current=null] : ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:2031:28: ( ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) )
            // InternalBCOoL.g:2032:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            {
            // InternalBCOoL.g:2032:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            // InternalBCOoL.g:2032:2: () otherlv_1= '#' ( ( ruleQualifiedName ) )
            {
            // InternalBCOoL.g:2032:2: ()
            // InternalBCOoL.g:2033:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1());
                  
            }
            // InternalBCOoL.g:2042:1: ( ( ruleQualifiedName ) )
            // InternalBCOoL.g:2043:1: ( ruleQualifiedName )
            {
            // InternalBCOoL.g:2043:1: ( ruleQualifiedName )
            // InternalBCOoL.g:2044:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGEnumLiteralExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
    // InternalBCOoL.g:2065:1: entryRuleGIfExpression returns [EObject current=null] : iv_ruleGIfExpression= ruleGIfExpression EOF ;
    public final EObject entryRuleGIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIfExpression = null;


        try {
            // InternalBCOoL.g:2066:2: (iv_ruleGIfExpression= ruleGIfExpression EOF )
            // InternalBCOoL.g:2067:2: iv_ruleGIfExpression= ruleGIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGIfExpression=ruleGIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:2074:1: ruleGIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) ;
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
            // InternalBCOoL.g:2077:28: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) )
            // InternalBCOoL.g:2078:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            {
            // InternalBCOoL.g:2078:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            // InternalBCOoL.g:2078:2: () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif'
            {
            // InternalBCOoL.g:2078:2: ()
            // InternalBCOoL.g:2079:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGIfExpressionAccess().getIfKeyword_1());
                  
            }
            // InternalBCOoL.g:2088:1: ( (lv_condition_2_0= ruleGExpression ) )
            // InternalBCOoL.g:2089:1: (lv_condition_2_0= ruleGExpression )
            {
            // InternalBCOoL.g:2089:1: (lv_condition_2_0= ruleGExpression )
            // InternalBCOoL.g:2090:3: lv_condition_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
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
                      		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGIfExpressionAccess().getThenKeyword_3());
                  
            }
            // InternalBCOoL.g:2110:1: ( (lv_thenExpression_4_0= ruleGExpression ) )
            // InternalBCOoL.g:2111:1: (lv_thenExpression_4_0= ruleGExpression )
            {
            // InternalBCOoL.g:2111:1: (lv_thenExpression_4_0= ruleGExpression )
            // InternalBCOoL.g:2112:3: lv_thenExpression_4_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_35);
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
                      		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGIfExpressionAccess().getElseKeyword_5());
                  
            }
            // InternalBCOoL.g:2132:1: ( (lv_elseExpression_6_0= ruleGExpression ) )
            // InternalBCOoL.g:2133:1: (lv_elseExpression_6_0= ruleGExpression )
            {
            // InternalBCOoL.g:2133:1: (lv_elseExpression_6_0= ruleGExpression )
            // InternalBCOoL.g:2134:3: lv_elseExpression_6_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_36);
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
                      		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2162:1: entryRuleGBraceExpression returns [EObject current=null] : iv_ruleGBraceExpression= ruleGBraceExpression EOF ;
    public final EObject entryRuleGBraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBraceExpression = null;


        try {
            // InternalBCOoL.g:2163:2: (iv_ruleGBraceExpression= ruleGBraceExpression EOF )
            // InternalBCOoL.g:2164:2: iv_ruleGBraceExpression= ruleGBraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBraceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGBraceExpression=ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBraceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:2171:1: ruleGBraceExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleGBraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innerExpression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalBCOoL.g:2174:28: ( ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) )
            // InternalBCOoL.g:2175:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            {
            // InternalBCOoL.g:2175:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            // InternalBCOoL.g:2175:2: () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')'
            {
            // InternalBCOoL.g:2175:2: ()
            // InternalBCOoL.g:2176:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalBCOoL.g:2185:1: ( (lv_innerExpression_2_0= ruleGExpression ) )
            // InternalBCOoL.g:2186:1: (lv_innerExpression_2_0= ruleGExpression )
            {
            // InternalBCOoL.g:2186:1: (lv_innerExpression_2_0= ruleGExpression )
            // InternalBCOoL.g:2187:3: lv_innerExpression_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_37);
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
                      		"org.eclipse.gemoc.gexpressions.xtext.GExpressions.GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2215:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // InternalBCOoL.g:2216:2: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // InternalBCOoL.g:2217:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigationOperator=ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:2224:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:2227:28: ( (kw= '.' | kw= '->' ) )
            // InternalBCOoL.g:2228:1: (kw= '.' | kw= '->' )
            {
            // InternalBCOoL.g:2228:1: (kw= '.' | kw= '->' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            else if ( (LA30_0==39) ) {
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
                    // InternalBCOoL.g:2229:2: kw= '.'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:2236:2: kw= '->'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2249:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBCOoL.g:2250:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBCOoL.g:2251:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalBCOoL.g:2258:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalBCOoL.g:2261:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalBCOoL.g:2262:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalBCOoL.g:2262:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalBCOoL.g:2262:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalBCOoL.g:2269:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==38) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==RULE_ID) ) {
                        int LA31_3 = input.LA(3);

                        if ( (synpred1_InternalBCOoL()) ) {
                            alt31=1;
                        }


                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalBCOoL.g:2269:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalBCOoL.g:2269:2: ( ( '.' )=>kw= '.' )
            	    // InternalBCOoL.g:2269:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalBCOoL.g:2292:1: ruleGAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleGAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalBCOoL.g:2294:28: ( (enumLiteral_0= 'and' ) )
            // InternalBCOoL.g:2295:1: (enumLiteral_0= 'and' )
            {
            // InternalBCOoL.g:2295:1: (enumLiteral_0= 'and' )
            // InternalBCOoL.g:2295:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2305:1: ruleGXorOperator returns [Enumerator current=null] : (enumLiteral_0= 'xor' ) ;
    public final Enumerator ruleGXorOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalBCOoL.g:2307:28: ( (enumLiteral_0= 'xor' ) )
            // InternalBCOoL.g:2308:1: (enumLiteral_0= 'xor' )
            {
            // InternalBCOoL.g:2308:1: (enumLiteral_0= 'xor' )
            // InternalBCOoL.g:2308:3: enumLiteral_0= 'xor'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2318:1: ruleGOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleGOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalBCOoL.g:2320:28: ( (enumLiteral_0= 'or' ) )
            // InternalBCOoL.g:2321:1: (enumLiteral_0= 'or' )
            {
            // InternalBCOoL.g:2321:1: (enumLiteral_0= 'or' )
            // InternalBCOoL.g:2321:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2331:1: ruleGEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleGEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalBCOoL.g:2333:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalBCOoL.g:2334:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalBCOoL.g:2334:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            else if ( (LA32_0==43) ) {
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
                    // InternalBCOoL.g:2334:2: (enumLiteral_0= '=' )
                    {
                    // InternalBCOoL.g:2334:2: (enumLiteral_0= '=' )
                    // InternalBCOoL.g:2334:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:2340:6: (enumLiteral_1= '<>' )
                    {
                    // InternalBCOoL.g:2340:6: (enumLiteral_1= '<>' )
                    // InternalBCOoL.g:2340:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2350:1: ruleGRelationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleGRelationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalBCOoL.g:2352:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalBCOoL.g:2353:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalBCOoL.g:2353:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 45:
                {
                alt33=2;
                }
                break;
            case 46:
                {
                alt33=3;
                }
                break;
            case 47:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalBCOoL.g:2353:2: (enumLiteral_0= '<' )
                    {
                    // InternalBCOoL.g:2353:2: (enumLiteral_0= '<' )
                    // InternalBCOoL.g:2353:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:2359:6: (enumLiteral_1= '>' )
                    {
                    // InternalBCOoL.g:2359:6: (enumLiteral_1= '>' )
                    // InternalBCOoL.g:2359:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBCOoL.g:2365:6: (enumLiteral_2= '<=' )
                    {
                    // InternalBCOoL.g:2365:6: (enumLiteral_2= '<=' )
                    // InternalBCOoL.g:2365:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBCOoL.g:2371:6: (enumLiteral_3= '>=' )
                    {
                    // InternalBCOoL.g:2371:6: (enumLiteral_3= '>=' )
                    // InternalBCOoL.g:2371:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2381:1: ruleGAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleGAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalBCOoL.g:2383:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalBCOoL.g:2384:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalBCOoL.g:2384:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            else if ( (LA34_0==49) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalBCOoL.g:2384:2: (enumLiteral_0= '+' )
                    {
                    // InternalBCOoL.g:2384:2: (enumLiteral_0= '+' )
                    // InternalBCOoL.g:2384:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:2390:6: (enumLiteral_1= '-' )
                    {
                    // InternalBCOoL.g:2390:6: (enumLiteral_1= '-' )
                    // InternalBCOoL.g:2390:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2400:1: ruleGMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleGMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalBCOoL.g:2402:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalBCOoL.g:2403:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalBCOoL.g:2403:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            else if ( (LA35_0==51) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalBCOoL.g:2403:2: (enumLiteral_0= '*' )
                    {
                    // InternalBCOoL.g:2403:2: (enumLiteral_0= '*' )
                    // InternalBCOoL.g:2403:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:2409:6: (enumLiteral_1= '/' )
                    {
                    // InternalBCOoL.g:2409:6: (enumLiteral_1= '/' )
                    // InternalBCOoL.g:2409:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalBCOoL.g:2419:1: ruleGNegationOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) ;
    public final Enumerator ruleGNegationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalBCOoL.g:2421:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) )
            // InternalBCOoL.g:2422:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            {
            // InternalBCOoL.g:2422:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            else if ( (LA36_0==53) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalBCOoL.g:2422:2: (enumLiteral_0= 'not' )
                    {
                    // InternalBCOoL.g:2422:2: (enumLiteral_0= 'not' )
                    // InternalBCOoL.g:2422:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:2428:6: (enumLiteral_1= '~' )
                    {
                    // InternalBCOoL.g:2428:6: (enumLiteral_1= '~' )
                    // InternalBCOoL.g:2428:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
        // InternalBCOoL.g:2269:3: ( '.' )
        // InternalBCOoL.g:2270:2: '.'
        {
        match(input,38,FOLLOW_2); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040036000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000036002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080010000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000006000401F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000002L});

}