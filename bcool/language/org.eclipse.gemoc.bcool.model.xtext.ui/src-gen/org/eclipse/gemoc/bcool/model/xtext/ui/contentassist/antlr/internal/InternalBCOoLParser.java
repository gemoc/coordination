package org.eclipse.gemoc.bcool.model.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.gemoc.bcool.model.xtext.services.BCOoLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBCOoLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'xor'", "'or'", "'.'", "'->'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'~'", "'Spec'", "'Global Event'", "';'", "'let'", "'Operator'", "'('", "')'", "'MatchingCorrespondance:'", "'end operator;'", "','", "' : '", "'::'", "'when'", "'CoordinationRule:'", "'Local Event'", "'ImportLib'", "'ImportInterface'", "'as'", "'import'", "'#'", "'if'", "'then'", "'else'", "'endif'"
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
     	
        public void setGrammarAccess(BCOoLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleBCoolSpec"
    // InternalBCOoL.g:61:1: entryRuleBCoolSpec : ruleBCoolSpec EOF ;
    public final void entryRuleBCoolSpec() throws RecognitionException {
        try {
            // InternalBCOoL.g:62:1: ( ruleBCoolSpec EOF )
            // InternalBCOoL.g:63:1: ruleBCoolSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBCoolSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBCoolSpec"


    // $ANTLR start "ruleBCoolSpec"
    // InternalBCOoL.g:70:1: ruleBCoolSpec : ( ( rule__BCoolSpec__Group__0 ) ) ;
    public final void ruleBCoolSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:74:2: ( ( ( rule__BCoolSpec__Group__0 ) ) )
            // InternalBCOoL.g:75:1: ( ( rule__BCoolSpec__Group__0 ) )
            {
            // InternalBCOoL.g:75:1: ( ( rule__BCoolSpec__Group__0 ) )
            // InternalBCOoL.g:76:1: ( rule__BCoolSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getGroup()); 
            }
            // InternalBCOoL.g:77:1: ( rule__BCoolSpec__Group__0 )
            // InternalBCOoL.g:77:2: rule__BCoolSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BCoolSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBCoolSpec"


    // $ANTLR start "entryRuleBCoolOperatorSpec"
    // InternalBCOoL.g:89:1: entryRuleBCoolOperatorSpec : ruleBCoolOperatorSpec EOF ;
    public final void entryRuleBCoolOperatorSpec() throws RecognitionException {
        try {
            // InternalBCOoL.g:90:1: ( ruleBCoolOperatorSpec EOF )
            // InternalBCOoL.g:91:1: ruleBCoolOperatorSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBCoolOperatorSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBCoolOperatorSpec"


    // $ANTLR start "ruleBCoolOperatorSpec"
    // InternalBCOoL.g:98:1: ruleBCoolOperatorSpec : ( ( rule__BCoolOperatorSpec__Group__0 ) ) ;
    public final void ruleBCoolOperatorSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:102:2: ( ( ( rule__BCoolOperatorSpec__Group__0 ) ) )
            // InternalBCOoL.g:103:1: ( ( rule__BCoolOperatorSpec__Group__0 ) )
            {
            // InternalBCOoL.g:103:1: ( ( rule__BCoolOperatorSpec__Group__0 ) )
            // InternalBCOoL.g:104:1: ( rule__BCoolOperatorSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGroup()); 
            }
            // InternalBCOoL.g:105:1: ( rule__BCoolOperatorSpec__Group__0 )
            // InternalBCOoL.g:105:2: rule__BCoolOperatorSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBCoolOperatorSpec"


    // $ANTLR start "entryRuleglobalDSEsRule"
    // InternalBCOoL.g:117:1: entryRuleglobalDSEsRule : ruleglobalDSEsRule EOF ;
    public final void entryRuleglobalDSEsRule() throws RecognitionException {
        try {
            // InternalBCOoL.g:118:1: ( ruleglobalDSEsRule EOF )
            // InternalBCOoL.g:119:1: ruleglobalDSEsRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleglobalDSEsRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleglobalDSEsRule"


    // $ANTLR start "ruleglobalDSEsRule"
    // InternalBCOoL.g:126:1: ruleglobalDSEsRule : ( ( rule__GlobalDSEsRule__Group__0 ) ) ;
    public final void ruleglobalDSEsRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:130:2: ( ( ( rule__GlobalDSEsRule__Group__0 ) ) )
            // InternalBCOoL.g:131:1: ( ( rule__GlobalDSEsRule__Group__0 ) )
            {
            // InternalBCOoL.g:131:1: ( ( rule__GlobalDSEsRule__Group__0 ) )
            // InternalBCOoL.g:132:1: ( rule__GlobalDSEsRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getGroup()); 
            }
            // InternalBCOoL.g:133:1: ( rule__GlobalDSEsRule__Group__0 )
            // InternalBCOoL.g:133:2: rule__GlobalDSEsRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalDSEsRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleglobalDSEsRule"


    // $ANTLR start "entryRuleglobalEventExpressionRule"
    // InternalBCOoL.g:145:1: entryRuleglobalEventExpressionRule : ruleglobalEventExpressionRule EOF ;
    public final void entryRuleglobalEventExpressionRule() throws RecognitionException {
        try {
            // InternalBCOoL.g:146:1: ( ruleglobalEventExpressionRule EOF )
            // InternalBCOoL.g:147:1: ruleglobalEventExpressionRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleglobalEventExpressionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalEventExpressionRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleglobalEventExpressionRule"


    // $ANTLR start "ruleglobalEventExpressionRule"
    // InternalBCOoL.g:154:1: ruleglobalEventExpressionRule : ( ( rule__GlobalEventExpressionRule__Group__0 ) ) ;
    public final void ruleglobalEventExpressionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:158:2: ( ( ( rule__GlobalEventExpressionRule__Group__0 ) ) )
            // InternalBCOoL.g:159:1: ( ( rule__GlobalEventExpressionRule__Group__0 ) )
            {
            // InternalBCOoL.g:159:1: ( ( rule__GlobalEventExpressionRule__Group__0 ) )
            // InternalBCOoL.g:160:1: ( rule__GlobalEventExpressionRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleAccess().getGroup()); 
            }
            // InternalBCOoL.g:161:1: ( rule__GlobalEventExpressionRule__Group__0 )
            // InternalBCOoL.g:161:2: rule__GlobalEventExpressionRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalEventExpressionRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalEventExpressionRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleglobalEventExpressionRule"


    // $ANTLR start "entryRuleBCoolCompositionRule"
    // InternalBCOoL.g:173:1: entryRuleBCoolCompositionRule : ruleBCoolCompositionRule EOF ;
    public final void entryRuleBCoolCompositionRule() throws RecognitionException {
        try {
            // InternalBCOoL.g:174:1: ( ruleBCoolCompositionRule EOF )
            // InternalBCOoL.g:175:1: ruleBCoolCompositionRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBCoolCompositionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBCoolCompositionRule"


    // $ANTLR start "ruleBCoolCompositionRule"
    // InternalBCOoL.g:182:1: ruleBCoolCompositionRule : ( ( rule__BCoolCompositionRule__Group__0 ) ) ;
    public final void ruleBCoolCompositionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:186:2: ( ( ( rule__BCoolCompositionRule__Group__0 ) ) )
            // InternalBCOoL.g:187:1: ( ( rule__BCoolCompositionRule__Group__0 ) )
            {
            // InternalBCOoL.g:187:1: ( ( rule__BCoolCompositionRule__Group__0 ) )
            // InternalBCOoL.g:188:1: ( rule__BCoolCompositionRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getGroup()); 
            }
            // InternalBCOoL.g:189:1: ( rule__BCoolCompositionRule__Group__0 )
            // InternalBCOoL.g:189:2: rule__BCoolCompositionRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBCoolCompositionRule"


    // $ANTLR start "entryRuleBCoolOperatorArg"
    // InternalBCOoL.g:201:1: entryRuleBCoolOperatorArg : ruleBCoolOperatorArg EOF ;
    public final void entryRuleBCoolOperatorArg() throws RecognitionException {
        try {
            // InternalBCOoL.g:202:1: ( ruleBCoolOperatorArg EOF )
            // InternalBCOoL.g:203:1: ruleBCoolOperatorArg EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBCoolOperatorArg"


    // $ANTLR start "ruleBCoolOperatorArg"
    // InternalBCOoL.g:210:1: ruleBCoolOperatorArg : ( ( rule__BCoolOperatorArg__Group__0 ) ) ;
    public final void ruleBCoolOperatorArg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:214:2: ( ( ( rule__BCoolOperatorArg__Group__0 ) ) )
            // InternalBCOoL.g:215:1: ( ( rule__BCoolOperatorArg__Group__0 ) )
            {
            // InternalBCOoL.g:215:1: ( ( rule__BCoolOperatorArg__Group__0 ) )
            // InternalBCOoL.g:216:1: ( rule__BCoolOperatorArg__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getGroup()); 
            }
            // InternalBCOoL.g:217:1: ( rule__BCoolOperatorArg__Group__0 )
            // InternalBCOoL.g:217:2: rule__BCoolOperatorArg__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorArg__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBCoolOperatorArg"


    // $ANTLR start "entryRuleMatchingRule"
    // InternalBCOoL.g:229:1: entryRuleMatchingRule : ruleMatchingRule EOF ;
    public final void entryRuleMatchingRule() throws RecognitionException {
        try {
            // InternalBCOoL.g:230:1: ( ruleMatchingRule EOF )
            // InternalBCOoL.g:231:1: ruleMatchingRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMatchingRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatchingRule"


    // $ANTLR start "ruleMatchingRule"
    // InternalBCOoL.g:238:1: ruleMatchingRule : ( ( rule__MatchingRule__Group__0 ) ) ;
    public final void ruleMatchingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:242:2: ( ( ( rule__MatchingRule__Group__0 ) ) )
            // InternalBCOoL.g:243:1: ( ( rule__MatchingRule__Group__0 ) )
            {
            // InternalBCOoL.g:243:1: ( ( rule__MatchingRule__Group__0 ) )
            // InternalBCOoL.g:244:1: ( rule__MatchingRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getGroup()); 
            }
            // InternalBCOoL.g:245:1: ( rule__MatchingRule__Group__0 )
            // InternalBCOoL.g:245:2: rule__MatchingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatchingRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchingRule"


    // $ANTLR start "entryRuleEventExpression"
    // InternalBCOoL.g:257:1: entryRuleEventExpression : ruleEventExpression EOF ;
    public final void entryRuleEventExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:258:1: ( ruleEventExpression EOF )
            // InternalBCOoL.g:259:1: ruleEventExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventExpression"


    // $ANTLR start "ruleEventExpression"
    // InternalBCOoL.g:266:1: ruleEventExpression : ( ( rule__EventExpression__Group__0 ) ) ;
    public final void ruleEventExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:270:2: ( ( ( rule__EventExpression__Group__0 ) ) )
            // InternalBCOoL.g:271:1: ( ( rule__EventExpression__Group__0 ) )
            {
            // InternalBCOoL.g:271:1: ( ( rule__EventExpression__Group__0 ) )
            // InternalBCOoL.g:272:1: ( rule__EventExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:273:1: ( rule__EventExpression__Group__0 )
            // InternalBCOoL.g:273:2: rule__EventExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventExpression"


    // $ANTLR start "entryRuleCoordinationRule"
    // InternalBCOoL.g:285:1: entryRuleCoordinationRule : ruleCoordinationRule EOF ;
    public final void entryRuleCoordinationRule() throws RecognitionException {
        try {
            // InternalBCOoL.g:286:1: ( ruleCoordinationRule EOF )
            // InternalBCOoL.g:287:1: ruleCoordinationRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoordinationRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoordinationRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinationRule"


    // $ANTLR start "ruleCoordinationRule"
    // InternalBCOoL.g:294:1: ruleCoordinationRule : ( ( rule__CoordinationRule__EventRelationsAssignment ) ) ;
    public final void ruleCoordinationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:298:2: ( ( ( rule__CoordinationRule__EventRelationsAssignment ) ) )
            // InternalBCOoL.g:299:1: ( ( rule__CoordinationRule__EventRelationsAssignment ) )
            {
            // InternalBCOoL.g:299:1: ( ( rule__CoordinationRule__EventRelationsAssignment ) )
            // InternalBCOoL.g:300:1: ( rule__CoordinationRule__EventRelationsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoordinationRuleAccess().getEventRelationsAssignment()); 
            }
            // InternalBCOoL.g:301:1: ( rule__CoordinationRule__EventRelationsAssignment )
            // InternalBCOoL.g:301:2: rule__CoordinationRule__EventRelationsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationRule__EventRelationsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoordinationRuleAccess().getEventRelationsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinationRule"


    // $ANTLR start "entryRuleEventRelation"
    // InternalBCOoL.g:313:1: entryRuleEventRelation : ruleEventRelation EOF ;
    public final void entryRuleEventRelation() throws RecognitionException {
        try {
            // InternalBCOoL.g:314:1: ( ruleEventRelation EOF )
            // InternalBCOoL.g:315:1: ruleEventRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventRelation"


    // $ANTLR start "ruleEventRelation"
    // InternalBCOoL.g:322:1: ruleEventRelation : ( ( rule__EventRelation__Group__0 ) ) ;
    public final void ruleEventRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:326:2: ( ( ( rule__EventRelation__Group__0 ) ) )
            // InternalBCOoL.g:327:1: ( ( rule__EventRelation__Group__0 ) )
            {
            // InternalBCOoL.g:327:1: ( ( rule__EventRelation__Group__0 ) )
            // InternalBCOoL.g:328:1: ( rule__EventRelation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getGroup()); 
            }
            // InternalBCOoL.g:329:1: ( rule__EventRelation__Group__0 )
            // InternalBCOoL.g:329:2: rule__EventRelation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventRelation"


    // $ANTLR start "entryRuleImportLibRule"
    // InternalBCOoL.g:341:1: entryRuleImportLibRule : ruleImportLibRule EOF ;
    public final void entryRuleImportLibRule() throws RecognitionException {
        try {
            // InternalBCOoL.g:342:1: ( ruleImportLibRule EOF )
            // InternalBCOoL.g:343:1: ruleImportLibRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImportLibRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportLibRule"


    // $ANTLR start "ruleImportLibRule"
    // InternalBCOoL.g:350:1: ruleImportLibRule : ( ( rule__ImportLibRule__Group__0 ) ) ;
    public final void ruleImportLibRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:354:2: ( ( ( rule__ImportLibRule__Group__0 ) ) )
            // InternalBCOoL.g:355:1: ( ( rule__ImportLibRule__Group__0 ) )
            {
            // InternalBCOoL.g:355:1: ( ( rule__ImportLibRule__Group__0 ) )
            // InternalBCOoL.g:356:1: ( rule__ImportLibRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getGroup()); 
            }
            // InternalBCOoL.g:357:1: ( rule__ImportLibRule__Group__0 )
            // InternalBCOoL.g:357:2: rule__ImportLibRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportLibRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportLibRule"


    // $ANTLR start "entryRuleImportInterfaceRule"
    // InternalBCOoL.g:369:1: entryRuleImportInterfaceRule : ruleImportInterfaceRule EOF ;
    public final void entryRuleImportInterfaceRule() throws RecognitionException {
        try {
            // InternalBCOoL.g:370:1: ( ruleImportInterfaceRule EOF )
            // InternalBCOoL.g:371:1: ruleImportInterfaceRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportInterfaceRule"


    // $ANTLR start "ruleImportInterfaceRule"
    // InternalBCOoL.g:378:1: ruleImportInterfaceRule : ( ( rule__ImportInterfaceRule__Group__0 ) ) ;
    public final void ruleImportInterfaceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:382:2: ( ( ( rule__ImportInterfaceRule__Group__0 ) ) )
            // InternalBCOoL.g:383:1: ( ( rule__ImportInterfaceRule__Group__0 ) )
            {
            // InternalBCOoL.g:383:1: ( ( rule__ImportInterfaceRule__Group__0 ) )
            // InternalBCOoL.g:384:1: ( rule__ImportInterfaceRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getGroup()); 
            }
            // InternalBCOoL.g:385:1: ( rule__ImportInterfaceRule__Group__0 )
            // InternalBCOoL.g:385:2: rule__ImportInterfaceRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportInterfaceRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportInterfaceRule"


    // $ANTLR start "entryRuleGImportStatement"
    // InternalBCOoL.g:399:1: entryRuleGImportStatement : ruleGImportStatement EOF ;
    public final void entryRuleGImportStatement() throws RecognitionException {
        try {
            // InternalBCOoL.g:400:1: ( ruleGImportStatement EOF )
            // InternalBCOoL.g:401:1: ruleGImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGImportStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGImportStatement"


    // $ANTLR start "ruleGImportStatement"
    // InternalBCOoL.g:408:1: ruleGImportStatement : ( ( rule__GImportStatement__Group__0 ) ) ;
    public final void ruleGImportStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:412:2: ( ( ( rule__GImportStatement__Group__0 ) ) )
            // InternalBCOoL.g:413:1: ( ( rule__GImportStatement__Group__0 ) )
            {
            // InternalBCOoL.g:413:1: ( ( rule__GImportStatement__Group__0 ) )
            // InternalBCOoL.g:414:1: ( rule__GImportStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getGroup()); 
            }
            // InternalBCOoL.g:415:1: ( rule__GImportStatement__Group__0 )
            // InternalBCOoL.g:415:2: rule__GImportStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GImportStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGImportStatement"


    // $ANTLR start "entryRuleGExpression"
    // InternalBCOoL.g:427:1: entryRuleGExpression : ruleGExpression EOF ;
    public final void entryRuleGExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:428:1: ( ruleGExpression EOF )
            // InternalBCOoL.g:429:1: ruleGExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGExpression"


    // $ANTLR start "ruleGExpression"
    // InternalBCOoL.g:436:1: ruleGExpression : ( ruleGOrExpression ) ;
    public final void ruleGExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:440:2: ( ( ruleGOrExpression ) )
            // InternalBCOoL.g:441:1: ( ruleGOrExpression )
            {
            // InternalBCOoL.g:441:1: ( ruleGOrExpression )
            // InternalBCOoL.g:442:1: ruleGOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleGOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGExpression"


    // $ANTLR start "entryRuleGOrExpression"
    // InternalBCOoL.g:455:1: entryRuleGOrExpression : ruleGOrExpression EOF ;
    public final void entryRuleGOrExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:456:1: ( ruleGOrExpression EOF )
            // InternalBCOoL.g:457:1: ruleGOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGOrExpression"


    // $ANTLR start "ruleGOrExpression"
    // InternalBCOoL.g:464:1: ruleGOrExpression : ( ( rule__GOrExpression__Group__0 ) ) ;
    public final void ruleGOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:468:2: ( ( ( rule__GOrExpression__Group__0 ) ) )
            // InternalBCOoL.g:469:1: ( ( rule__GOrExpression__Group__0 ) )
            {
            // InternalBCOoL.g:469:1: ( ( rule__GOrExpression__Group__0 ) )
            // InternalBCOoL.g:470:1: ( rule__GOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:471:1: ( rule__GOrExpression__Group__0 )
            // InternalBCOoL.g:471:2: rule__GOrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GOrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGOrExpression"


    // $ANTLR start "entryRuleGXorExpression"
    // InternalBCOoL.g:483:1: entryRuleGXorExpression : ruleGXorExpression EOF ;
    public final void entryRuleGXorExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:484:1: ( ruleGXorExpression EOF )
            // InternalBCOoL.g:485:1: ruleGXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGXorExpression"


    // $ANTLR start "ruleGXorExpression"
    // InternalBCOoL.g:492:1: ruleGXorExpression : ( ( rule__GXorExpression__Group__0 ) ) ;
    public final void ruleGXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:496:2: ( ( ( rule__GXorExpression__Group__0 ) ) )
            // InternalBCOoL.g:497:1: ( ( rule__GXorExpression__Group__0 ) )
            {
            // InternalBCOoL.g:497:1: ( ( rule__GXorExpression__Group__0 ) )
            // InternalBCOoL.g:498:1: ( rule__GXorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:499:1: ( rule__GXorExpression__Group__0 )
            // InternalBCOoL.g:499:2: rule__GXorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GXorExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGXorExpression"


    // $ANTLR start "entryRuleGAndExpression"
    // InternalBCOoL.g:511:1: entryRuleGAndExpression : ruleGAndExpression EOF ;
    public final void entryRuleGAndExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:512:1: ( ruleGAndExpression EOF )
            // InternalBCOoL.g:513:1: ruleGAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGAndExpression"


    // $ANTLR start "ruleGAndExpression"
    // InternalBCOoL.g:520:1: ruleGAndExpression : ( ( rule__GAndExpression__Group__0 ) ) ;
    public final void ruleGAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:524:2: ( ( ( rule__GAndExpression__Group__0 ) ) )
            // InternalBCOoL.g:525:1: ( ( rule__GAndExpression__Group__0 ) )
            {
            // InternalBCOoL.g:525:1: ( ( rule__GAndExpression__Group__0 ) )
            // InternalBCOoL.g:526:1: ( rule__GAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:527:1: ( rule__GAndExpression__Group__0 )
            // InternalBCOoL.g:527:2: rule__GAndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GAndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAndExpression"


    // $ANTLR start "entryRuleGEqualityExpression"
    // InternalBCOoL.g:539:1: entryRuleGEqualityExpression : ruleGEqualityExpression EOF ;
    public final void entryRuleGEqualityExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:540:1: ( ruleGEqualityExpression EOF )
            // InternalBCOoL.g:541:1: ruleGEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGEqualityExpression"


    // $ANTLR start "ruleGEqualityExpression"
    // InternalBCOoL.g:548:1: ruleGEqualityExpression : ( ( rule__GEqualityExpression__Group__0 ) ) ;
    public final void ruleGEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:552:2: ( ( ( rule__GEqualityExpression__Group__0 ) ) )
            // InternalBCOoL.g:553:1: ( ( rule__GEqualityExpression__Group__0 ) )
            {
            // InternalBCOoL.g:553:1: ( ( rule__GEqualityExpression__Group__0 ) )
            // InternalBCOoL.g:554:1: ( rule__GEqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:555:1: ( rule__GEqualityExpression__Group__0 )
            // InternalBCOoL.g:555:2: rule__GEqualityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GEqualityExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEqualityExpression"


    // $ANTLR start "entryRuleGRelationExpression"
    // InternalBCOoL.g:567:1: entryRuleGRelationExpression : ruleGRelationExpression EOF ;
    public final void entryRuleGRelationExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:568:1: ( ruleGRelationExpression EOF )
            // InternalBCOoL.g:569:1: ruleGRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGRelationExpression"


    // $ANTLR start "ruleGRelationExpression"
    // InternalBCOoL.g:576:1: ruleGRelationExpression : ( ( rule__GRelationExpression__Group__0 ) ) ;
    public final void ruleGRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:580:2: ( ( ( rule__GRelationExpression__Group__0 ) ) )
            // InternalBCOoL.g:581:1: ( ( rule__GRelationExpression__Group__0 ) )
            {
            // InternalBCOoL.g:581:1: ( ( rule__GRelationExpression__Group__0 ) )
            // InternalBCOoL.g:582:1: ( rule__GRelationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:583:1: ( rule__GRelationExpression__Group__0 )
            // InternalBCOoL.g:583:2: rule__GRelationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GRelationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGRelationExpression"


    // $ANTLR start "entryRuleGAdditionExpression"
    // InternalBCOoL.g:595:1: entryRuleGAdditionExpression : ruleGAdditionExpression EOF ;
    public final void entryRuleGAdditionExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:596:1: ( ruleGAdditionExpression EOF )
            // InternalBCOoL.g:597:1: ruleGAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGAdditionExpression"


    // $ANTLR start "ruleGAdditionExpression"
    // InternalBCOoL.g:604:1: ruleGAdditionExpression : ( ( rule__GAdditionExpression__Group__0 ) ) ;
    public final void ruleGAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:608:2: ( ( ( rule__GAdditionExpression__Group__0 ) ) )
            // InternalBCOoL.g:609:1: ( ( rule__GAdditionExpression__Group__0 ) )
            {
            // InternalBCOoL.g:609:1: ( ( rule__GAdditionExpression__Group__0 ) )
            // InternalBCOoL.g:610:1: ( rule__GAdditionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:611:1: ( rule__GAdditionExpression__Group__0 )
            // InternalBCOoL.g:611:2: rule__GAdditionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GAdditionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAdditionExpression"


    // $ANTLR start "entryRuleGMultiplicationExpression"
    // InternalBCOoL.g:623:1: entryRuleGMultiplicationExpression : ruleGMultiplicationExpression EOF ;
    public final void entryRuleGMultiplicationExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:624:1: ( ruleGMultiplicationExpression EOF )
            // InternalBCOoL.g:625:1: ruleGMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGMultiplicationExpression"


    // $ANTLR start "ruleGMultiplicationExpression"
    // InternalBCOoL.g:632:1: ruleGMultiplicationExpression : ( ( rule__GMultiplicationExpression__Group__0 ) ) ;
    public final void ruleGMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:636:2: ( ( ( rule__GMultiplicationExpression__Group__0 ) ) )
            // InternalBCOoL.g:637:1: ( ( rule__GMultiplicationExpression__Group__0 ) )
            {
            // InternalBCOoL.g:637:1: ( ( rule__GMultiplicationExpression__Group__0 ) )
            // InternalBCOoL.g:638:1: ( rule__GMultiplicationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:639:1: ( rule__GMultiplicationExpression__Group__0 )
            // InternalBCOoL.g:639:2: rule__GMultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GMultiplicationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGMultiplicationExpression"


    // $ANTLR start "entryRuleGNegationExpression"
    // InternalBCOoL.g:651:1: entryRuleGNegationExpression : ruleGNegationExpression EOF ;
    public final void entryRuleGNegationExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:652:1: ( ruleGNegationExpression EOF )
            // InternalBCOoL.g:653:1: ruleGNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNegationExpression"


    // $ANTLR start "ruleGNegationExpression"
    // InternalBCOoL.g:660:1: ruleGNegationExpression : ( ( rule__GNegationExpression__Alternatives ) ) ;
    public final void ruleGNegationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:664:2: ( ( ( rule__GNegationExpression__Alternatives ) ) )
            // InternalBCOoL.g:665:1: ( ( rule__GNegationExpression__Alternatives ) )
            {
            // InternalBCOoL.g:665:1: ( ( rule__GNegationExpression__Alternatives ) )
            // InternalBCOoL.g:666:1: ( rule__GNegationExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:667:1: ( rule__GNegationExpression__Alternatives )
            // InternalBCOoL.g:667:2: rule__GNegationExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GNegationExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNegationExpression"


    // $ANTLR start "entryRuleGNavigationExpression"
    // InternalBCOoL.g:679:1: entryRuleGNavigationExpression : ruleGNavigationExpression EOF ;
    public final void entryRuleGNavigationExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:680:1: ( ruleGNavigationExpression EOF )
            // InternalBCOoL.g:681:1: ruleGNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNavigationExpression"


    // $ANTLR start "ruleGNavigationExpression"
    // InternalBCOoL.g:688:1: ruleGNavigationExpression : ( ( rule__GNavigationExpression__Group__0 ) ) ;
    public final void ruleGNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:692:2: ( ( ( rule__GNavigationExpression__Group__0 ) ) )
            // InternalBCOoL.g:693:1: ( ( rule__GNavigationExpression__Group__0 ) )
            {
            // InternalBCOoL.g:693:1: ( ( rule__GNavigationExpression__Group__0 ) )
            // InternalBCOoL.g:694:1: ( rule__GNavigationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:695:1: ( rule__GNavigationExpression__Group__0 )
            // InternalBCOoL.g:695:2: rule__GNavigationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GNavigationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNavigationExpression"


    // $ANTLR start "entryRuleGReferenceExpression"
    // InternalBCOoL.g:707:1: entryRuleGReferenceExpression : ruleGReferenceExpression EOF ;
    public final void entryRuleGReferenceExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:708:1: ( ruleGReferenceExpression EOF )
            // InternalBCOoL.g:709:1: ruleGReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGReferenceExpression"


    // $ANTLR start "ruleGReferenceExpression"
    // InternalBCOoL.g:716:1: ruleGReferenceExpression : ( ( rule__GReferenceExpression__Alternatives ) ) ;
    public final void ruleGReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:720:2: ( ( ( rule__GReferenceExpression__Alternatives ) ) )
            // InternalBCOoL.g:721:1: ( ( rule__GReferenceExpression__Alternatives ) )
            {
            // InternalBCOoL.g:721:1: ( ( rule__GReferenceExpression__Alternatives ) )
            // InternalBCOoL.g:722:1: ( rule__GReferenceExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:723:1: ( rule__GReferenceExpression__Alternatives )
            // InternalBCOoL.g:723:2: rule__GReferenceExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GReferenceExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGReferenceExpression"


    // $ANTLR start "entryRuleGPrimaryExpression"
    // InternalBCOoL.g:735:1: entryRuleGPrimaryExpression : ruleGPrimaryExpression EOF ;
    public final void entryRuleGPrimaryExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:736:1: ( ruleGPrimaryExpression EOF )
            // InternalBCOoL.g:737:1: ruleGPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGPrimaryExpression"


    // $ANTLR start "ruleGPrimaryExpression"
    // InternalBCOoL.g:744:1: ruleGPrimaryExpression : ( ( rule__GPrimaryExpression__Alternatives ) ) ;
    public final void ruleGPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:748:2: ( ( ( rule__GPrimaryExpression__Alternatives ) ) )
            // InternalBCOoL.g:749:1: ( ( rule__GPrimaryExpression__Alternatives ) )
            {
            // InternalBCOoL.g:749:1: ( ( rule__GPrimaryExpression__Alternatives ) )
            // InternalBCOoL.g:750:1: ( rule__GPrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:751:1: ( rule__GPrimaryExpression__Alternatives )
            // InternalBCOoL.g:751:2: rule__GPrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GPrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPrimaryExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGPrimaryExpression"


    // $ANTLR start "entryRuleGStringExpression"
    // InternalBCOoL.g:763:1: entryRuleGStringExpression : ruleGStringExpression EOF ;
    public final void entryRuleGStringExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:764:1: ( ruleGStringExpression EOF )
            // InternalBCOoL.g:765:1: ruleGStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGStringExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGStringExpression"


    // $ANTLR start "ruleGStringExpression"
    // InternalBCOoL.g:772:1: ruleGStringExpression : ( ( rule__GStringExpression__Group__0 ) ) ;
    public final void ruleGStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:776:2: ( ( ( rule__GStringExpression__Group__0 ) ) )
            // InternalBCOoL.g:777:1: ( ( rule__GStringExpression__Group__0 ) )
            {
            // InternalBCOoL.g:777:1: ( ( rule__GStringExpression__Group__0 ) )
            // InternalBCOoL.g:778:1: ( rule__GStringExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:779:1: ( rule__GStringExpression__Group__0 )
            // InternalBCOoL.g:779:2: rule__GStringExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GStringExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGStringExpression"


    // $ANTLR start "entryRuleGBooleanExpression"
    // InternalBCOoL.g:791:1: entryRuleGBooleanExpression : ruleGBooleanExpression EOF ;
    public final void entryRuleGBooleanExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:792:1: ( ruleGBooleanExpression EOF )
            // InternalBCOoL.g:793:1: ruleGBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGBooleanExpression"


    // $ANTLR start "ruleGBooleanExpression"
    // InternalBCOoL.g:800:1: ruleGBooleanExpression : ( ( rule__GBooleanExpression__Group__0 ) ) ;
    public final void ruleGBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:804:2: ( ( ( rule__GBooleanExpression__Group__0 ) ) )
            // InternalBCOoL.g:805:1: ( ( rule__GBooleanExpression__Group__0 ) )
            {
            // InternalBCOoL.g:805:1: ( ( rule__GBooleanExpression__Group__0 ) )
            // InternalBCOoL.g:806:1: ( rule__GBooleanExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:807:1: ( rule__GBooleanExpression__Group__0 )
            // InternalBCOoL.g:807:2: rule__GBooleanExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GBooleanExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGBooleanExpression"


    // $ANTLR start "entryRuleGNumericExpression"
    // InternalBCOoL.g:819:1: entryRuleGNumericExpression : ruleGNumericExpression EOF ;
    public final void entryRuleGNumericExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:820:1: ( ruleGNumericExpression EOF )
            // InternalBCOoL.g:821:1: ruleGNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNumericExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNumericExpression"


    // $ANTLR start "ruleGNumericExpression"
    // InternalBCOoL.g:828:1: ruleGNumericExpression : ( ( rule__GNumericExpression__Alternatives ) ) ;
    public final void ruleGNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:832:2: ( ( ( rule__GNumericExpression__Alternatives ) ) )
            // InternalBCOoL.g:833:1: ( ( rule__GNumericExpression__Alternatives ) )
            {
            // InternalBCOoL.g:833:1: ( ( rule__GNumericExpression__Alternatives ) )
            // InternalBCOoL.g:834:1: ( rule__GNumericExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNumericExpressionAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:835:1: ( rule__GNumericExpression__Alternatives )
            // InternalBCOoL.g:835:2: rule__GNumericExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GNumericExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNumericExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNumericExpression"


    // $ANTLR start "entryRuleGIntegerExpression"
    // InternalBCOoL.g:847:1: entryRuleGIntegerExpression : ruleGIntegerExpression EOF ;
    public final void entryRuleGIntegerExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:848:1: ( ruleGIntegerExpression EOF )
            // InternalBCOoL.g:849:1: ruleGIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGIntegerExpression"


    // $ANTLR start "ruleGIntegerExpression"
    // InternalBCOoL.g:856:1: ruleGIntegerExpression : ( ( rule__GIntegerExpression__Group__0 ) ) ;
    public final void ruleGIntegerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:860:2: ( ( ( rule__GIntegerExpression__Group__0 ) ) )
            // InternalBCOoL.g:861:1: ( ( rule__GIntegerExpression__Group__0 ) )
            {
            // InternalBCOoL.g:861:1: ( ( rule__GIntegerExpression__Group__0 ) )
            // InternalBCOoL.g:862:1: ( rule__GIntegerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:863:1: ( rule__GIntegerExpression__Group__0 )
            // InternalBCOoL.g:863:2: rule__GIntegerExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GIntegerExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGIntegerExpression"


    // $ANTLR start "entryRuleGDoubleExpression"
    // InternalBCOoL.g:875:1: entryRuleGDoubleExpression : ruleGDoubleExpression EOF ;
    public final void entryRuleGDoubleExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:876:1: ( ruleGDoubleExpression EOF )
            // InternalBCOoL.g:877:1: ruleGDoubleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGDoubleExpression"


    // $ANTLR start "ruleGDoubleExpression"
    // InternalBCOoL.g:884:1: ruleGDoubleExpression : ( ( rule__GDoubleExpression__Group__0 ) ) ;
    public final void ruleGDoubleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:888:2: ( ( ( rule__GDoubleExpression__Group__0 ) ) )
            // InternalBCOoL.g:889:1: ( ( rule__GDoubleExpression__Group__0 ) )
            {
            // InternalBCOoL.g:889:1: ( ( rule__GDoubleExpression__Group__0 ) )
            // InternalBCOoL.g:890:1: ( rule__GDoubleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:891:1: ( rule__GDoubleExpression__Group__0 )
            // InternalBCOoL.g:891:2: rule__GDoubleExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GDoubleExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGDoubleExpression"


    // $ANTLR start "entryRuleGEnumLiteralExpression"
    // InternalBCOoL.g:903:1: entryRuleGEnumLiteralExpression : ruleGEnumLiteralExpression EOF ;
    public final void entryRuleGEnumLiteralExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:904:1: ( ruleGEnumLiteralExpression EOF )
            // InternalBCOoL.g:905:1: ruleGEnumLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGEnumLiteralExpression"


    // $ANTLR start "ruleGEnumLiteralExpression"
    // InternalBCOoL.g:912:1: ruleGEnumLiteralExpression : ( ( rule__GEnumLiteralExpression__Group__0 ) ) ;
    public final void ruleGEnumLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:916:2: ( ( ( rule__GEnumLiteralExpression__Group__0 ) ) )
            // InternalBCOoL.g:917:1: ( ( rule__GEnumLiteralExpression__Group__0 ) )
            {
            // InternalBCOoL.g:917:1: ( ( rule__GEnumLiteralExpression__Group__0 ) )
            // InternalBCOoL.g:918:1: ( rule__GEnumLiteralExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:919:1: ( rule__GEnumLiteralExpression__Group__0 )
            // InternalBCOoL.g:919:2: rule__GEnumLiteralExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GEnumLiteralExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEnumLiteralExpression"


    // $ANTLR start "entryRuleGIfExpression"
    // InternalBCOoL.g:931:1: entryRuleGIfExpression : ruleGIfExpression EOF ;
    public final void entryRuleGIfExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:932:1: ( ruleGIfExpression EOF )
            // InternalBCOoL.g:933:1: ruleGIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGIfExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGIfExpression"


    // $ANTLR start "ruleGIfExpression"
    // InternalBCOoL.g:940:1: ruleGIfExpression : ( ( rule__GIfExpression__Group__0 ) ) ;
    public final void ruleGIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:944:2: ( ( ( rule__GIfExpression__Group__0 ) ) )
            // InternalBCOoL.g:945:1: ( ( rule__GIfExpression__Group__0 ) )
            {
            // InternalBCOoL.g:945:1: ( ( rule__GIfExpression__Group__0 ) )
            // InternalBCOoL.g:946:1: ( rule__GIfExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:947:1: ( rule__GIfExpression__Group__0 )
            // InternalBCOoL.g:947:2: rule__GIfExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GIfExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGIfExpression"


    // $ANTLR start "entryRuleGBraceExpression"
    // InternalBCOoL.g:959:1: entryRuleGBraceExpression : ruleGBraceExpression EOF ;
    public final void entryRuleGBraceExpression() throws RecognitionException {
        try {
            // InternalBCOoL.g:960:1: ( ruleGBraceExpression EOF )
            // InternalBCOoL.g:961:1: ruleGBraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGBraceExpression"


    // $ANTLR start "ruleGBraceExpression"
    // InternalBCOoL.g:968:1: ruleGBraceExpression : ( ( rule__GBraceExpression__Group__0 ) ) ;
    public final void ruleGBraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:972:2: ( ( ( rule__GBraceExpression__Group__0 ) ) )
            // InternalBCOoL.g:973:1: ( ( rule__GBraceExpression__Group__0 ) )
            {
            // InternalBCOoL.g:973:1: ( ( rule__GBraceExpression__Group__0 ) )
            // InternalBCOoL.g:974:1: ( rule__GBraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getGroup()); 
            }
            // InternalBCOoL.g:975:1: ( rule__GBraceExpression__Group__0 )
            // InternalBCOoL.g:975:2: rule__GBraceExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GBraceExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGBraceExpression"


    // $ANTLR start "entryRuleNavigationOperator"
    // InternalBCOoL.g:987:1: entryRuleNavigationOperator : ruleNavigationOperator EOF ;
    public final void entryRuleNavigationOperator() throws RecognitionException {
        try {
            // InternalBCOoL.g:988:1: ( ruleNavigationOperator EOF )
            // InternalBCOoL.g:989:1: ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigationOperator"


    // $ANTLR start "ruleNavigationOperator"
    // InternalBCOoL.g:996:1: ruleNavigationOperator : ( ( rule__NavigationOperator__Alternatives ) ) ;
    public final void ruleNavigationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1000:2: ( ( ( rule__NavigationOperator__Alternatives ) ) )
            // InternalBCOoL.g:1001:1: ( ( rule__NavigationOperator__Alternatives ) )
            {
            // InternalBCOoL.g:1001:1: ( ( rule__NavigationOperator__Alternatives ) )
            // InternalBCOoL.g:1002:1: ( rule__NavigationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationOperatorAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:1003:1: ( rule__NavigationOperator__Alternatives )
            // InternalBCOoL.g:1003:2: rule__NavigationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NavigationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigationOperator"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBCOoL.g:1015:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBCOoL.g:1016:1: ( ruleQualifiedName EOF )
            // InternalBCOoL.g:1017:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalBCOoL.g:1024:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1028:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBCOoL.g:1029:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBCOoL.g:1029:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBCOoL.g:1030:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalBCOoL.g:1031:1: ( rule__QualifiedName__Group__0 )
            // InternalBCOoL.g:1031:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleGAndOperator"
    // InternalBCOoL.g:1044:1: ruleGAndOperator : ( ( 'and' ) ) ;
    public final void ruleGAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1048:1: ( ( ( 'and' ) ) )
            // InternalBCOoL.g:1049:1: ( ( 'and' ) )
            {
            // InternalBCOoL.g:1049:1: ( ( 'and' ) )
            // InternalBCOoL.g:1050:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // InternalBCOoL.g:1051:1: ( 'and' )
            // InternalBCOoL.g:1051:3: 'and'
            {
            match(input,13,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAndOperator"


    // $ANTLR start "ruleGXorOperator"
    // InternalBCOoL.g:1064:1: ruleGXorOperator : ( ( 'xor' ) ) ;
    public final void ruleGXorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1068:1: ( ( ( 'xor' ) ) )
            // InternalBCOoL.g:1069:1: ( ( 'xor' ) )
            {
            // InternalBCOoL.g:1069:1: ( ( 'xor' ) )
            // InternalBCOoL.g:1070:1: ( 'xor' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration()); 
            }
            // InternalBCOoL.g:1071:1: ( 'xor' )
            // InternalBCOoL.g:1071:3: 'xor'
            {
            match(input,14,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGXorOperator"


    // $ANTLR start "ruleGOrOperator"
    // InternalBCOoL.g:1084:1: ruleGOrOperator : ( ( 'or' ) ) ;
    public final void ruleGOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1088:1: ( ( ( 'or' ) ) )
            // InternalBCOoL.g:1089:1: ( ( 'or' ) )
            {
            // InternalBCOoL.g:1089:1: ( ( 'or' ) )
            // InternalBCOoL.g:1090:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // InternalBCOoL.g:1091:1: ( 'or' )
            // InternalBCOoL.g:1091:3: 'or'
            {
            match(input,15,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGOrOperator"


    // $ANTLR start "ruleGEqualityOperator"
    // InternalBCOoL.g:1104:1: ruleGEqualityOperator : ( ( rule__GEqualityOperator__Alternatives ) ) ;
    public final void ruleGEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1108:1: ( ( ( rule__GEqualityOperator__Alternatives ) ) )
            // InternalBCOoL.g:1109:1: ( ( rule__GEqualityOperator__Alternatives ) )
            {
            // InternalBCOoL.g:1109:1: ( ( rule__GEqualityOperator__Alternatives ) )
            // InternalBCOoL.g:1110:1: ( rule__GEqualityOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityOperatorAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:1111:1: ( rule__GEqualityOperator__Alternatives )
            // InternalBCOoL.g:1111:2: rule__GEqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GEqualityOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEqualityOperator"


    // $ANTLR start "ruleGRelationOperator"
    // InternalBCOoL.g:1123:1: ruleGRelationOperator : ( ( rule__GRelationOperator__Alternatives ) ) ;
    public final void ruleGRelationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1127:1: ( ( ( rule__GRelationOperator__Alternatives ) ) )
            // InternalBCOoL.g:1128:1: ( ( rule__GRelationOperator__Alternatives ) )
            {
            // InternalBCOoL.g:1128:1: ( ( rule__GRelationOperator__Alternatives ) )
            // InternalBCOoL.g:1129:1: ( rule__GRelationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationOperatorAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:1130:1: ( rule__GRelationOperator__Alternatives )
            // InternalBCOoL.g:1130:2: rule__GRelationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GRelationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGRelationOperator"


    // $ANTLR start "ruleGAdditionOperator"
    // InternalBCOoL.g:1142:1: ruleGAdditionOperator : ( ( rule__GAdditionOperator__Alternatives ) ) ;
    public final void ruleGAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1146:1: ( ( ( rule__GAdditionOperator__Alternatives ) ) )
            // InternalBCOoL.g:1147:1: ( ( rule__GAdditionOperator__Alternatives ) )
            {
            // InternalBCOoL.g:1147:1: ( ( rule__GAdditionOperator__Alternatives ) )
            // InternalBCOoL.g:1148:1: ( rule__GAdditionOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionOperatorAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:1149:1: ( rule__GAdditionOperator__Alternatives )
            // InternalBCOoL.g:1149:2: rule__GAdditionOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GAdditionOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAdditionOperator"


    // $ANTLR start "ruleGMultiplicationOperator"
    // InternalBCOoL.g:1161:1: ruleGMultiplicationOperator : ( ( rule__GMultiplicationOperator__Alternatives ) ) ;
    public final void ruleGMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1165:1: ( ( ( rule__GMultiplicationOperator__Alternatives ) ) )
            // InternalBCOoL.g:1166:1: ( ( rule__GMultiplicationOperator__Alternatives ) )
            {
            // InternalBCOoL.g:1166:1: ( ( rule__GMultiplicationOperator__Alternatives ) )
            // InternalBCOoL.g:1167:1: ( rule__GMultiplicationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationOperatorAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:1168:1: ( rule__GMultiplicationOperator__Alternatives )
            // InternalBCOoL.g:1168:2: rule__GMultiplicationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GMultiplicationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGMultiplicationOperator"


    // $ANTLR start "ruleGNegationOperator"
    // InternalBCOoL.g:1180:1: ruleGNegationOperator : ( ( rule__GNegationOperator__Alternatives ) ) ;
    public final void ruleGNegationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1184:1: ( ( ( rule__GNegationOperator__Alternatives ) ) )
            // InternalBCOoL.g:1185:1: ( ( rule__GNegationOperator__Alternatives ) )
            {
            // InternalBCOoL.g:1185:1: ( ( rule__GNegationOperator__Alternatives ) )
            // InternalBCOoL.g:1186:1: ( rule__GNegationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationOperatorAccess().getAlternatives()); 
            }
            // InternalBCOoL.g:1187:1: ( rule__GNegationOperator__Alternatives )
            // InternalBCOoL.g:1187:2: rule__GNegationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GNegationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNegationOperator"


    // $ANTLR start "rule__GNegationExpression__Alternatives"
    // InternalBCOoL.g:1198:1: rule__GNegationExpression__Alternatives : ( ( ruleGNavigationExpression ) | ( ( rule__GNegationExpression__Group_1__0 ) ) );
    public final void rule__GNegationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1202:1: ( ( ruleGNavigationExpression ) | ( ( rule__GNegationExpression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_DOUBLE)||LA1_0==35||(LA1_0>=49 && LA1_0<=50)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=28 && LA1_0<=29)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBCOoL.g:1203:1: ( ruleGNavigationExpression )
                    {
                    // InternalBCOoL.g:1203:1: ( ruleGNavigationExpression )
                    // InternalBCOoL.g:1204:1: ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGNavigationExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1209:6: ( ( rule__GNegationExpression__Group_1__0 ) )
                    {
                    // InternalBCOoL.g:1209:6: ( ( rule__GNegationExpression__Group_1__0 ) )
                    // InternalBCOoL.g:1210:1: ( rule__GNegationExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationExpressionAccess().getGroup_1()); 
                    }
                    // InternalBCOoL.g:1211:1: ( rule__GNegationExpression__Group_1__0 )
                    // InternalBCOoL.g:1211:2: rule__GNegationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GNegationExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Alternatives"


    // $ANTLR start "rule__GReferenceExpression__Alternatives"
    // InternalBCOoL.g:1220:1: rule__GReferenceExpression__Alternatives : ( ( ruleGPrimaryExpression ) | ( ( rule__GReferenceExpression__Group_1__0 ) ) );
    public final void rule__GReferenceExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1224:1: ( ( ruleGPrimaryExpression ) | ( ( rule__GReferenceExpression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_DOUBLE)||LA2_0==35||(LA2_0>=49 && LA2_0<=50)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBCOoL.g:1225:1: ( ruleGPrimaryExpression )
                    {
                    // InternalBCOoL.g:1225:1: ( ruleGPrimaryExpression )
                    // InternalBCOoL.g:1226:1: ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1231:6: ( ( rule__GReferenceExpression__Group_1__0 ) )
                    {
                    // InternalBCOoL.g:1231:6: ( ( rule__GReferenceExpression__Group_1__0 ) )
                    // InternalBCOoL.g:1232:1: ( rule__GReferenceExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGReferenceExpressionAccess().getGroup_1()); 
                    }
                    // InternalBCOoL.g:1233:1: ( rule__GReferenceExpression__Group_1__0 )
                    // InternalBCOoL.g:1233:2: rule__GReferenceExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GReferenceExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGReferenceExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Alternatives"


    // $ANTLR start "rule__GPrimaryExpression__Alternatives"
    // InternalBCOoL.g:1242:1: rule__GPrimaryExpression__Alternatives : ( ( ruleGStringExpression ) | ( ruleGBooleanExpression ) | ( ruleGNumericExpression ) | ( ruleGEnumLiteralExpression ) | ( ruleGIfExpression ) | ( ruleGBraceExpression ) );
    public final void rule__GPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1246:1: ( ( ruleGStringExpression ) | ( ruleGBooleanExpression ) | ( ruleGNumericExpression ) | ( ruleGEnumLiteralExpression ) | ( ruleGIfExpression ) | ( ruleGBraceExpression ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt3=3;
                }
                break;
            case 49:
                {
                alt3=4;
                }
                break;
            case 50:
                {
                alt3=5;
                }
                break;
            case 35:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBCOoL.g:1247:1: ( ruleGStringExpression )
                    {
                    // InternalBCOoL.g:1247:1: ( ruleGStringExpression )
                    // InternalBCOoL.g:1248:1: ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGStringExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1253:6: ( ruleGBooleanExpression )
                    {
                    // InternalBCOoL.g:1253:6: ( ruleGBooleanExpression )
                    // InternalBCOoL.g:1254:1: ruleGBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGBooleanExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBCOoL.g:1259:6: ( ruleGNumericExpression )
                    {
                    // InternalBCOoL.g:1259:6: ( ruleGNumericExpression )
                    // InternalBCOoL.g:1260:1: ruleGNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGNumericExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBCOoL.g:1265:6: ( ruleGEnumLiteralExpression )
                    {
                    // InternalBCOoL.g:1265:6: ( ruleGEnumLiteralExpression )
                    // InternalBCOoL.g:1266:1: ruleGEnumLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGEnumLiteralExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBCOoL.g:1271:6: ( ruleGIfExpression )
                    {
                    // InternalBCOoL.g:1271:6: ( ruleGIfExpression )
                    // InternalBCOoL.g:1272:1: ruleGIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGIfExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBCOoL.g:1277:6: ( ruleGBraceExpression )
                    {
                    // InternalBCOoL.g:1277:6: ( ruleGBraceExpression )
                    // InternalBCOoL.g:1278:1: ruleGBraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGBraceExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPrimaryExpression__Alternatives"


    // $ANTLR start "rule__GNumericExpression__Alternatives"
    // InternalBCOoL.g:1288:1: rule__GNumericExpression__Alternatives : ( ( ruleGIntegerExpression ) | ( ruleGDoubleExpression ) );
    public final void rule__GNumericExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1292:1: ( ( ruleGIntegerExpression ) | ( ruleGDoubleExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_DOUBLE) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBCOoL.g:1293:1: ( ruleGIntegerExpression )
                    {
                    // InternalBCOoL.g:1293:1: ( ruleGIntegerExpression )
                    // InternalBCOoL.g:1294:1: ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGIntegerExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1299:6: ( ruleGDoubleExpression )
                    {
                    // InternalBCOoL.g:1299:6: ( ruleGDoubleExpression )
                    // InternalBCOoL.g:1300:1: ruleGDoubleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGDoubleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNumericExpression__Alternatives"


    // $ANTLR start "rule__NavigationOperator__Alternatives"
    // InternalBCOoL.g:1310:1: rule__NavigationOperator__Alternatives : ( ( '.' ) | ( '->' ) );
    public final void rule__NavigationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1314:1: ( ( '.' ) | ( '->' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBCOoL.g:1315:1: ( '.' )
                    {
                    // InternalBCOoL.g:1315:1: ( '.' )
                    // InternalBCOoL.g:1316:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1323:6: ( '->' )
                    {
                    // InternalBCOoL.g:1323:6: ( '->' )
                    // InternalBCOoL.g:1324:1: '->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationOperator__Alternatives"


    // $ANTLR start "rule__GEqualityOperator__Alternatives"
    // InternalBCOoL.g:1336:1: rule__GEqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<>' ) ) );
    public final void rule__GEqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1340:1: ( ( ( '=' ) ) | ( ( '<>' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBCOoL.g:1341:1: ( ( '=' ) )
                    {
                    // InternalBCOoL.g:1341:1: ( ( '=' ) )
                    // InternalBCOoL.g:1342:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // InternalBCOoL.g:1343:1: ( '=' )
                    // InternalBCOoL.g:1343:3: '='
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1348:6: ( ( '<>' ) )
                    {
                    // InternalBCOoL.g:1348:6: ( ( '<>' ) )
                    // InternalBCOoL.g:1349:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalBCOoL.g:1350:1: ( '<>' )
                    // InternalBCOoL.g:1350:3: '<>'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityOperator__Alternatives"


    // $ANTLR start "rule__GRelationOperator__Alternatives"
    // InternalBCOoL.g:1360:1: rule__GRelationOperator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__GRelationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1364:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBCOoL.g:1365:1: ( ( '<' ) )
                    {
                    // InternalBCOoL.g:1365:1: ( ( '<' ) )
                    // InternalBCOoL.g:1366:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    }
                    // InternalBCOoL.g:1367:1: ( '<' )
                    // InternalBCOoL.g:1367:3: '<'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1372:6: ( ( '>' ) )
                    {
                    // InternalBCOoL.g:1372:6: ( ( '>' ) )
                    // InternalBCOoL.g:1373:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }
                    // InternalBCOoL.g:1374:1: ( '>' )
                    // InternalBCOoL.g:1374:3: '>'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBCOoL.g:1379:6: ( ( '<=' ) )
                    {
                    // InternalBCOoL.g:1379:6: ( ( '<=' ) )
                    // InternalBCOoL.g:1380:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalBCOoL.g:1381:1: ( '<=' )
                    // InternalBCOoL.g:1381:3: '<='
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBCOoL.g:1386:6: ( ( '>=' ) )
                    {
                    // InternalBCOoL.g:1386:6: ( ( '>=' ) )
                    // InternalBCOoL.g:1387:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalBCOoL.g:1388:1: ( '>=' )
                    // InternalBCOoL.g:1388:3: '>='
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationOperator__Alternatives"


    // $ANTLR start "rule__GAdditionOperator__Alternatives"
    // InternalBCOoL.g:1398:1: rule__GAdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__GAdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1402:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBCOoL.g:1403:1: ( ( '+' ) )
                    {
                    // InternalBCOoL.g:1403:1: ( ( '+' ) )
                    // InternalBCOoL.g:1404:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                    }
                    // InternalBCOoL.g:1405:1: ( '+' )
                    // InternalBCOoL.g:1405:3: '+'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1410:6: ( ( '-' ) )
                    {
                    // InternalBCOoL.g:1410:6: ( ( '-' ) )
                    // InternalBCOoL.g:1411:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1()); 
                    }
                    // InternalBCOoL.g:1412:1: ( '-' )
                    // InternalBCOoL.g:1412:3: '-'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionOperator__Alternatives"


    // $ANTLR start "rule__GMultiplicationOperator__Alternatives"
    // InternalBCOoL.g:1422:1: rule__GMultiplicationOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__GMultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1426:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBCOoL.g:1427:1: ( ( '*' ) )
                    {
                    // InternalBCOoL.g:1427:1: ( ( '*' ) )
                    // InternalBCOoL.g:1428:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                    }
                    // InternalBCOoL.g:1429:1: ( '*' )
                    // InternalBCOoL.g:1429:3: '*'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1434:6: ( ( '/' ) )
                    {
                    // InternalBCOoL.g:1434:6: ( ( '/' ) )
                    // InternalBCOoL.g:1435:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1()); 
                    }
                    // InternalBCOoL.g:1436:1: ( '/' )
                    // InternalBCOoL.g:1436:3: '/'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationOperator__Alternatives"


    // $ANTLR start "rule__GNegationOperator__Alternatives"
    // InternalBCOoL.g:1446:1: rule__GNegationOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '~' ) ) );
    public final void rule__GNegationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1450:1: ( ( ( 'not' ) ) | ( ( '~' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBCOoL.g:1451:1: ( ( 'not' ) )
                    {
                    // InternalBCOoL.g:1451:1: ( ( 'not' ) )
                    // InternalBCOoL.g:1452:1: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                    }
                    // InternalBCOoL.g:1453:1: ( 'not' )
                    // InternalBCOoL.g:1453:3: 'not'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBCOoL.g:1458:6: ( ( '~' ) )
                    {
                    // InternalBCOoL.g:1458:6: ( ( '~' ) )
                    // InternalBCOoL.g:1459:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // InternalBCOoL.g:1460:1: ( '~' )
                    // InternalBCOoL.g:1460:3: '~'
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationOperator__Alternatives"


    // $ANTLR start "rule__BCoolSpec__Group__0"
    // InternalBCOoL.g:1472:1: rule__BCoolSpec__Group__0 : rule__BCoolSpec__Group__0__Impl rule__BCoolSpec__Group__1 ;
    public final void rule__BCoolSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1476:1: ( rule__BCoolSpec__Group__0__Impl rule__BCoolSpec__Group__1 )
            // InternalBCOoL.g:1477:2: rule__BCoolSpec__Group__0__Impl rule__BCoolSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BCoolSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__0"


    // $ANTLR start "rule__BCoolSpec__Group__0__Impl"
    // InternalBCOoL.g:1484:1: rule__BCoolSpec__Group__0__Impl : ( ( rule__BCoolSpec__NameAssignment_0 )? ) ;
    public final void rule__BCoolSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1488:1: ( ( ( rule__BCoolSpec__NameAssignment_0 )? ) )
            // InternalBCOoL.g:1489:1: ( ( rule__BCoolSpec__NameAssignment_0 )? )
            {
            // InternalBCOoL.g:1489:1: ( ( rule__BCoolSpec__NameAssignment_0 )? )
            // InternalBCOoL.g:1490:1: ( rule__BCoolSpec__NameAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getNameAssignment_0()); 
            }
            // InternalBCOoL.g:1491:1: ( rule__BCoolSpec__NameAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBCOoL.g:1491:2: rule__BCoolSpec__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BCoolSpec__NameAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__0__Impl"


    // $ANTLR start "rule__BCoolSpec__Group__1"
    // InternalBCOoL.g:1501:1: rule__BCoolSpec__Group__1 : rule__BCoolSpec__Group__1__Impl rule__BCoolSpec__Group__2 ;
    public final void rule__BCoolSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1505:1: ( rule__BCoolSpec__Group__1__Impl rule__BCoolSpec__Group__2 )
            // InternalBCOoL.g:1506:2: rule__BCoolSpec__Group__1__Impl rule__BCoolSpec__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BCoolSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__1"


    // $ANTLR start "rule__BCoolSpec__Group__1__Impl"
    // InternalBCOoL.g:1513:1: rule__BCoolSpec__Group__1__Impl : ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) ) ;
    public final void rule__BCoolSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1517:1: ( ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) ) )
            // InternalBCOoL.g:1518:1: ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) )
            {
            // InternalBCOoL.g:1518:1: ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) )
            // InternalBCOoL.g:1519:1: ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* )
            {
            // InternalBCOoL.g:1519:1: ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) )
            // InternalBCOoL.g:1520:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }
            // InternalBCOoL.g:1521:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )
            // InternalBCOoL.g:1521:2: rule__BCoolSpec__ImportsLibAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__BCoolSpec__ImportsLibAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }

            }

            // InternalBCOoL.g:1524:1: ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* )
            // InternalBCOoL.g:1525:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }
            // InternalBCOoL.g:1526:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBCOoL.g:1526:2: rule__BCoolSpec__ImportsLibAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__BCoolSpec__ImportsLibAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__1__Impl"


    // $ANTLR start "rule__BCoolSpec__Group__2"
    // InternalBCOoL.g:1537:1: rule__BCoolSpec__Group__2 : rule__BCoolSpec__Group__2__Impl rule__BCoolSpec__Group__3 ;
    public final void rule__BCoolSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1541:1: ( rule__BCoolSpec__Group__2__Impl rule__BCoolSpec__Group__3 )
            // InternalBCOoL.g:1542:2: rule__BCoolSpec__Group__2__Impl rule__BCoolSpec__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__BCoolSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolSpec__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__2"


    // $ANTLR start "rule__BCoolSpec__Group__2__Impl"
    // InternalBCOoL.g:1549:1: rule__BCoolSpec__Group__2__Impl : ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) ) ;
    public final void rule__BCoolSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1553:1: ( ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) ) )
            // InternalBCOoL.g:1554:1: ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) )
            {
            // InternalBCOoL.g:1554:1: ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) )
            // InternalBCOoL.g:1555:1: ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* )
            {
            // InternalBCOoL.g:1555:1: ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) )
            // InternalBCOoL.g:1556:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }
            // InternalBCOoL.g:1557:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )
            // InternalBCOoL.g:1557:2: rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }

            }

            // InternalBCOoL.g:1560:1: ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* )
            // InternalBCOoL.g:1561:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }
            // InternalBCOoL.g:1562:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBCOoL.g:1562:2: rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__2__Impl"


    // $ANTLR start "rule__BCoolSpec__Group__3"
    // InternalBCOoL.g:1573:1: rule__BCoolSpec__Group__3 : rule__BCoolSpec__Group__3__Impl ;
    public final void rule__BCoolSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1577:1: ( rule__BCoolSpec__Group__3__Impl )
            // InternalBCOoL.g:1578:2: rule__BCoolSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BCoolSpec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__3"


    // $ANTLR start "rule__BCoolSpec__Group__3__Impl"
    // InternalBCOoL.g:1584:1: rule__BCoolSpec__Group__3__Impl : ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) ) ;
    public final void rule__BCoolSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1588:1: ( ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) ) )
            // InternalBCOoL.g:1589:1: ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) )
            {
            // InternalBCOoL.g:1589:1: ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) )
            // InternalBCOoL.g:1590:1: ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* )
            {
            // InternalBCOoL.g:1590:1: ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) )
            // InternalBCOoL.g:1591:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }
            // InternalBCOoL.g:1592:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )
            // InternalBCOoL.g:1592:2: rule__BCoolSpec__BcoolOperatorsAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__BCoolSpec__BcoolOperatorsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }

            }

            // InternalBCOoL.g:1595:1: ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* )
            // InternalBCOoL.g:1596:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }
            // InternalBCOoL.g:1597:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=30 && LA14_0<=31)||(LA14_0>=33 && LA14_0<=34)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBCOoL.g:1597:2: rule__BCoolSpec__BcoolOperatorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BCoolSpec__BcoolOperatorsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__3__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__0"
    // InternalBCOoL.g:1616:1: rule__BCoolOperatorSpec__Group__0 : rule__BCoolOperatorSpec__Group__0__Impl rule__BCoolOperatorSpec__Group__1 ;
    public final void rule__BCoolOperatorSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1620:1: ( rule__BCoolOperatorSpec__Group__0__Impl rule__BCoolOperatorSpec__Group__1 )
            // InternalBCOoL.g:1621:2: rule__BCoolOperatorSpec__Group__0__Impl rule__BCoolOperatorSpec__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BCoolOperatorSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__0"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__0__Impl"
    // InternalBCOoL.g:1628:1: rule__BCoolOperatorSpec__Group__0__Impl : ( ( rule__BCoolOperatorSpec__Group_0__0 )? ) ;
    public final void rule__BCoolOperatorSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1632:1: ( ( ( rule__BCoolOperatorSpec__Group_0__0 )? ) )
            // InternalBCOoL.g:1633:1: ( ( rule__BCoolOperatorSpec__Group_0__0 )? )
            {
            // InternalBCOoL.g:1633:1: ( ( rule__BCoolOperatorSpec__Group_0__0 )? )
            // InternalBCOoL.g:1634:1: ( rule__BCoolOperatorSpec__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGroup_0()); 
            }
            // InternalBCOoL.g:1635:1: ( rule__BCoolOperatorSpec__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBCOoL.g:1635:2: rule__BCoolOperatorSpec__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BCoolOperatorSpec__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__0__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__1"
    // InternalBCOoL.g:1645:1: rule__BCoolOperatorSpec__Group__1 : rule__BCoolOperatorSpec__Group__1__Impl rule__BCoolOperatorSpec__Group__2 ;
    public final void rule__BCoolOperatorSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1649:1: ( rule__BCoolOperatorSpec__Group__1__Impl rule__BCoolOperatorSpec__Group__2 )
            // InternalBCOoL.g:1650:2: rule__BCoolOperatorSpec__Group__1__Impl rule__BCoolOperatorSpec__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BCoolOperatorSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__1"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__1__Impl"
    // InternalBCOoL.g:1657:1: rule__BCoolOperatorSpec__Group__1__Impl : ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1 )? ) ;
    public final void rule__BCoolOperatorSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1661:1: ( ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1 )? ) )
            // InternalBCOoL.g:1662:1: ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1 )? )
            {
            // InternalBCOoL.g:1662:1: ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1 )? )
            // InternalBCOoL.g:1663:1: ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsAssignment_1()); 
            }
            // InternalBCOoL.g:1664:1: ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBCOoL.g:1664:2: rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__1__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__2"
    // InternalBCOoL.g:1674:1: rule__BCoolOperatorSpec__Group__2 : rule__BCoolOperatorSpec__Group__2__Impl rule__BCoolOperatorSpec__Group__3 ;
    public final void rule__BCoolOperatorSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1678:1: ( rule__BCoolOperatorSpec__Group__2__Impl rule__BCoolOperatorSpec__Group__3 )
            // InternalBCOoL.g:1679:2: rule__BCoolOperatorSpec__Group__2__Impl rule__BCoolOperatorSpec__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__BCoolOperatorSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorSpec__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__2"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__2__Impl"
    // InternalBCOoL.g:1686:1: rule__BCoolOperatorSpec__Group__2__Impl : ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_2 )? ) ;
    public final void rule__BCoolOperatorSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1690:1: ( ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_2 )? ) )
            // InternalBCOoL.g:1691:1: ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_2 )? )
            {
            // InternalBCOoL.g:1691:1: ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_2 )? )
            // InternalBCOoL.g:1692:1: ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsAssignment_2()); 
            }
            // InternalBCOoL.g:1693:1: ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBCOoL.g:1693:2: rule__BCoolOperatorSpec__GlobalDSEsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BCoolOperatorSpec__GlobalDSEsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__2__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__3"
    // InternalBCOoL.g:1703:1: rule__BCoolOperatorSpec__Group__3 : rule__BCoolOperatorSpec__Group__3__Impl ;
    public final void rule__BCoolOperatorSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1707:1: ( rule__BCoolOperatorSpec__Group__3__Impl )
            // InternalBCOoL.g:1708:2: rule__BCoolOperatorSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorSpec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__3"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__3__Impl"
    // InternalBCOoL.g:1714:1: rule__BCoolOperatorSpec__Group__3__Impl : ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )* ) ) ;
    public final void rule__BCoolOperatorSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1718:1: ( ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )* ) ) )
            // InternalBCOoL.g:1719:1: ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )* ) )
            {
            // InternalBCOoL.g:1719:1: ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )* ) )
            // InternalBCOoL.g:1720:1: ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )* )
            {
            // InternalBCOoL.g:1720:1: ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 ) )
            // InternalBCOoL.g:1721:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_3()); 
            }
            // InternalBCOoL.g:1722:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )
            // InternalBCOoL.g:1722:2: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_3()); 
            }

            }

            // InternalBCOoL.g:1725:1: ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )* )
            // InternalBCOoL.g:1726:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_3()); 
            }
            // InternalBCOoL.g:1727:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    int LA18_5 = input.LA(2);

                    if ( (synpred24_InternalBCOoL()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalBCOoL.g:1727:2: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__3__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group_0__0"
    // InternalBCOoL.g:1746:1: rule__BCoolOperatorSpec__Group_0__0 : rule__BCoolOperatorSpec__Group_0__0__Impl rule__BCoolOperatorSpec__Group_0__1 ;
    public final void rule__BCoolOperatorSpec__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1750:1: ( rule__BCoolOperatorSpec__Group_0__0__Impl rule__BCoolOperatorSpec__Group_0__1 )
            // InternalBCOoL.g:1751:2: rule__BCoolOperatorSpec__Group_0__0__Impl rule__BCoolOperatorSpec__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__BCoolOperatorSpec__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorSpec__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group_0__0"


    // $ANTLR start "rule__BCoolOperatorSpec__Group_0__0__Impl"
    // InternalBCOoL.g:1758:1: rule__BCoolOperatorSpec__Group_0__0__Impl : ( 'Spec' ) ;
    public final void rule__BCoolOperatorSpec__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1762:1: ( ( 'Spec' ) )
            // InternalBCOoL.g:1763:1: ( 'Spec' )
            {
            // InternalBCOoL.g:1763:1: ( 'Spec' )
            // InternalBCOoL.g:1764:1: 'Spec'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getSpecKeyword_0_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getSpecKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group_0__0__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group_0__1"
    // InternalBCOoL.g:1777:1: rule__BCoolOperatorSpec__Group_0__1 : rule__BCoolOperatorSpec__Group_0__1__Impl ;
    public final void rule__BCoolOperatorSpec__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1781:1: ( rule__BCoolOperatorSpec__Group_0__1__Impl )
            // InternalBCOoL.g:1782:2: rule__BCoolOperatorSpec__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorSpec__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group_0__1"


    // $ANTLR start "rule__BCoolOperatorSpec__Group_0__1__Impl"
    // InternalBCOoL.g:1788:1: rule__BCoolOperatorSpec__Group_0__1__Impl : ( ( rule__BCoolOperatorSpec__NameAssignment_0_1 ) ) ;
    public final void rule__BCoolOperatorSpec__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1792:1: ( ( ( rule__BCoolOperatorSpec__NameAssignment_0_1 ) ) )
            // InternalBCOoL.g:1793:1: ( ( rule__BCoolOperatorSpec__NameAssignment_0_1 ) )
            {
            // InternalBCOoL.g:1793:1: ( ( rule__BCoolOperatorSpec__NameAssignment_0_1 ) )
            // InternalBCOoL.g:1794:1: ( rule__BCoolOperatorSpec__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getNameAssignment_0_1()); 
            }
            // InternalBCOoL.g:1795:1: ( rule__BCoolOperatorSpec__NameAssignment_0_1 )
            // InternalBCOoL.g:1795:2: rule__BCoolOperatorSpec__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorSpec__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group_0__1__Impl"


    // $ANTLR start "rule__GlobalDSEsRule__Group__0"
    // InternalBCOoL.g:1809:1: rule__GlobalDSEsRule__Group__0 : rule__GlobalDSEsRule__Group__0__Impl rule__GlobalDSEsRule__Group__1 ;
    public final void rule__GlobalDSEsRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1813:1: ( rule__GlobalDSEsRule__Group__0__Impl rule__GlobalDSEsRule__Group__1 )
            // InternalBCOoL.g:1814:2: rule__GlobalDSEsRule__Group__0__Impl rule__GlobalDSEsRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GlobalDSEsRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GlobalDSEsRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__0"


    // $ANTLR start "rule__GlobalDSEsRule__Group__0__Impl"
    // InternalBCOoL.g:1821:1: rule__GlobalDSEsRule__Group__0__Impl : ( 'Global Event' ) ;
    public final void rule__GlobalDSEsRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1825:1: ( ( 'Global Event' ) )
            // InternalBCOoL.g:1826:1: ( 'Global Event' )
            {
            // InternalBCOoL.g:1826:1: ( 'Global Event' )
            // InternalBCOoL.g:1827:1: 'Global Event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getGlobalEventKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getGlobalEventKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__0__Impl"


    // $ANTLR start "rule__GlobalDSEsRule__Group__1"
    // InternalBCOoL.g:1840:1: rule__GlobalDSEsRule__Group__1 : rule__GlobalDSEsRule__Group__1__Impl rule__GlobalDSEsRule__Group__2 ;
    public final void rule__GlobalDSEsRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1844:1: ( rule__GlobalDSEsRule__Group__1__Impl rule__GlobalDSEsRule__Group__2 )
            // InternalBCOoL.g:1845:2: rule__GlobalDSEsRule__Group__1__Impl rule__GlobalDSEsRule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GlobalDSEsRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GlobalDSEsRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__1"


    // $ANTLR start "rule__GlobalDSEsRule__Group__1__Impl"
    // InternalBCOoL.g:1852:1: rule__GlobalDSEsRule__Group__1__Impl : ( ( rule__GlobalDSEsRule__NameAssignment_1 ) ) ;
    public final void rule__GlobalDSEsRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1856:1: ( ( ( rule__GlobalDSEsRule__NameAssignment_1 ) ) )
            // InternalBCOoL.g:1857:1: ( ( rule__GlobalDSEsRule__NameAssignment_1 ) )
            {
            // InternalBCOoL.g:1857:1: ( ( rule__GlobalDSEsRule__NameAssignment_1 ) )
            // InternalBCOoL.g:1858:1: ( rule__GlobalDSEsRule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getNameAssignment_1()); 
            }
            // InternalBCOoL.g:1859:1: ( rule__GlobalDSEsRule__NameAssignment_1 )
            // InternalBCOoL.g:1859:2: rule__GlobalDSEsRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalDSEsRule__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__1__Impl"


    // $ANTLR start "rule__GlobalDSEsRule__Group__2"
    // InternalBCOoL.g:1869:1: rule__GlobalDSEsRule__Group__2 : rule__GlobalDSEsRule__Group__2__Impl ;
    public final void rule__GlobalDSEsRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1873:1: ( rule__GlobalDSEsRule__Group__2__Impl )
            // InternalBCOoL.g:1874:2: rule__GlobalDSEsRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalDSEsRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__2"


    // $ANTLR start "rule__GlobalDSEsRule__Group__2__Impl"
    // InternalBCOoL.g:1880:1: rule__GlobalDSEsRule__Group__2__Impl : ( ';' ) ;
    public final void rule__GlobalDSEsRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1884:1: ( ( ';' ) )
            // InternalBCOoL.g:1885:1: ( ';' )
            {
            // InternalBCOoL.g:1885:1: ( ';' )
            // InternalBCOoL.g:1886:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getSemicolonKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__2__Impl"


    // $ANTLR start "rule__GlobalEventExpressionRule__Group__0"
    // InternalBCOoL.g:1905:1: rule__GlobalEventExpressionRule__Group__0 : rule__GlobalEventExpressionRule__Group__0__Impl rule__GlobalEventExpressionRule__Group__1 ;
    public final void rule__GlobalEventExpressionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1909:1: ( rule__GlobalEventExpressionRule__Group__0__Impl rule__GlobalEventExpressionRule__Group__1 )
            // InternalBCOoL.g:1910:2: rule__GlobalEventExpressionRule__Group__0__Impl rule__GlobalEventExpressionRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GlobalEventExpressionRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GlobalEventExpressionRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEventExpressionRule__Group__0"


    // $ANTLR start "rule__GlobalEventExpressionRule__Group__0__Impl"
    // InternalBCOoL.g:1917:1: rule__GlobalEventExpressionRule__Group__0__Impl : ( 'let' ) ;
    public final void rule__GlobalEventExpressionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1921:1: ( ( 'let' ) )
            // InternalBCOoL.g:1922:1: ( 'let' )
            {
            // InternalBCOoL.g:1922:1: ( 'let' )
            // InternalBCOoL.g:1923:1: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleAccess().getLetKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalEventExpressionRuleAccess().getLetKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEventExpressionRule__Group__0__Impl"


    // $ANTLR start "rule__GlobalEventExpressionRule__Group__1"
    // InternalBCOoL.g:1936:1: rule__GlobalEventExpressionRule__Group__1 : rule__GlobalEventExpressionRule__Group__1__Impl ;
    public final void rule__GlobalEventExpressionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1940:1: ( rule__GlobalEventExpressionRule__Group__1__Impl )
            // InternalBCOoL.g:1941:2: rule__GlobalEventExpressionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalEventExpressionRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEventExpressionRule__Group__1"


    // $ANTLR start "rule__GlobalEventExpressionRule__Group__1__Impl"
    // InternalBCOoL.g:1947:1: rule__GlobalEventExpressionRule__Group__1__Impl : ( ruleEventExpression ) ;
    public final void rule__GlobalEventExpressionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1951:1: ( ( ruleEventExpression ) )
            // InternalBCOoL.g:1952:1: ( ruleEventExpression )
            {
            // InternalBCOoL.g:1952:1: ( ruleEventExpression )
            // InternalBCOoL.g:1953:1: ruleEventExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleAccess().getEventExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalEventExpressionRuleAccess().getEventExpressionParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEventExpressionRule__Group__1__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__0"
    // InternalBCOoL.g:1968:1: rule__BCoolCompositionRule__Group__0 : rule__BCoolCompositionRule__Group__0__Impl rule__BCoolCompositionRule__Group__1 ;
    public final void rule__BCoolCompositionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1972:1: ( rule__BCoolCompositionRule__Group__0__Impl rule__BCoolCompositionRule__Group__1 )
            // InternalBCOoL.g:1973:2: rule__BCoolCompositionRule__Group__0__Impl rule__BCoolCompositionRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BCoolCompositionRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__0"


    // $ANTLR start "rule__BCoolCompositionRule__Group__0__Impl"
    // InternalBCOoL.g:1980:1: rule__BCoolCompositionRule__Group__0__Impl : ( 'Operator' ) ;
    public final void rule__BCoolCompositionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:1984:1: ( ( 'Operator' ) )
            // InternalBCOoL.g:1985:1: ( 'Operator' )
            {
            // InternalBCOoL.g:1985:1: ( 'Operator' )
            // InternalBCOoL.g:1986:1: 'Operator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getOperatorKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getOperatorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__0__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__1"
    // InternalBCOoL.g:1999:1: rule__BCoolCompositionRule__Group__1 : rule__BCoolCompositionRule__Group__1__Impl rule__BCoolCompositionRule__Group__2 ;
    public final void rule__BCoolCompositionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2003:1: ( rule__BCoolCompositionRule__Group__1__Impl rule__BCoolCompositionRule__Group__2 )
            // InternalBCOoL.g:2004:2: rule__BCoolCompositionRule__Group__1__Impl rule__BCoolCompositionRule__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__BCoolCompositionRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__1"


    // $ANTLR start "rule__BCoolCompositionRule__Group__1__Impl"
    // InternalBCOoL.g:2011:1: rule__BCoolCompositionRule__Group__1__Impl : ( ( rule__BCoolCompositionRule__NameAssignment_1 ) ) ;
    public final void rule__BCoolCompositionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2015:1: ( ( ( rule__BCoolCompositionRule__NameAssignment_1 ) ) )
            // InternalBCOoL.g:2016:1: ( ( rule__BCoolCompositionRule__NameAssignment_1 ) )
            {
            // InternalBCOoL.g:2016:1: ( ( rule__BCoolCompositionRule__NameAssignment_1 ) )
            // InternalBCOoL.g:2017:1: ( rule__BCoolCompositionRule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getNameAssignment_1()); 
            }
            // InternalBCOoL.g:2018:1: ( rule__BCoolCompositionRule__NameAssignment_1 )
            // InternalBCOoL.g:2018:2: rule__BCoolCompositionRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__1__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__2"
    // InternalBCOoL.g:2028:1: rule__BCoolCompositionRule__Group__2 : rule__BCoolCompositionRule__Group__2__Impl rule__BCoolCompositionRule__Group__3 ;
    public final void rule__BCoolCompositionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2032:1: ( rule__BCoolCompositionRule__Group__2__Impl rule__BCoolCompositionRule__Group__3 )
            // InternalBCOoL.g:2033:2: rule__BCoolCompositionRule__Group__2__Impl rule__BCoolCompositionRule__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__BCoolCompositionRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__2"


    // $ANTLR start "rule__BCoolCompositionRule__Group__2__Impl"
    // InternalBCOoL.g:2040:1: rule__BCoolCompositionRule__Group__2__Impl : ( '(' ) ;
    public final void rule__BCoolCompositionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2044:1: ( ( '(' ) )
            // InternalBCOoL.g:2045:1: ( '(' )
            {
            // InternalBCOoL.g:2045:1: ( '(' )
            // InternalBCOoL.g:2046:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__2__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__3"
    // InternalBCOoL.g:2059:1: rule__BCoolCompositionRule__Group__3 : rule__BCoolCompositionRule__Group__3__Impl rule__BCoolCompositionRule__Group__4 ;
    public final void rule__BCoolCompositionRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2063:1: ( rule__BCoolCompositionRule__Group__3__Impl rule__BCoolCompositionRule__Group__4 )
            // InternalBCOoL.g:2064:2: rule__BCoolCompositionRule__Group__3__Impl rule__BCoolCompositionRule__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__BCoolCompositionRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__3"


    // $ANTLR start "rule__BCoolCompositionRule__Group__3__Impl"
    // InternalBCOoL.g:2071:1: rule__BCoolCompositionRule__Group__3__Impl : ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 ) ) ;
    public final void rule__BCoolCompositionRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2075:1: ( ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 ) ) )
            // InternalBCOoL.g:2076:1: ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 ) )
            {
            // InternalBCOoL.g:2076:1: ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 ) )
            // InternalBCOoL.g:2077:1: ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsAssignment_3()); 
            }
            // InternalBCOoL.g:2078:1: ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 )
            // InternalBCOoL.g:2078:2: rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__3__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__4"
    // InternalBCOoL.g:2088:1: rule__BCoolCompositionRule__Group__4 : rule__BCoolCompositionRule__Group__4__Impl rule__BCoolCompositionRule__Group__5 ;
    public final void rule__BCoolCompositionRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2092:1: ( rule__BCoolCompositionRule__Group__4__Impl rule__BCoolCompositionRule__Group__5 )
            // InternalBCOoL.g:2093:2: rule__BCoolCompositionRule__Group__4__Impl rule__BCoolCompositionRule__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__BCoolCompositionRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__4"


    // $ANTLR start "rule__BCoolCompositionRule__Group__4__Impl"
    // InternalBCOoL.g:2100:1: rule__BCoolCompositionRule__Group__4__Impl : ( ( rule__BCoolCompositionRule__Group_4__0 )* ) ;
    public final void rule__BCoolCompositionRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2104:1: ( ( ( rule__BCoolCompositionRule__Group_4__0 )* ) )
            // InternalBCOoL.g:2105:1: ( ( rule__BCoolCompositionRule__Group_4__0 )* )
            {
            // InternalBCOoL.g:2105:1: ( ( rule__BCoolCompositionRule__Group_4__0 )* )
            // InternalBCOoL.g:2106:1: ( rule__BCoolCompositionRule__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getGroup_4()); 
            }
            // InternalBCOoL.g:2107:1: ( rule__BCoolCompositionRule__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBCOoL.g:2107:2: rule__BCoolCompositionRule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BCoolCompositionRule__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__4__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__5"
    // InternalBCOoL.g:2117:1: rule__BCoolCompositionRule__Group__5 : rule__BCoolCompositionRule__Group__5__Impl rule__BCoolCompositionRule__Group__6 ;
    public final void rule__BCoolCompositionRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2121:1: ( rule__BCoolCompositionRule__Group__5__Impl rule__BCoolCompositionRule__Group__6 )
            // InternalBCOoL.g:2122:2: rule__BCoolCompositionRule__Group__5__Impl rule__BCoolCompositionRule__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__BCoolCompositionRule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__5"


    // $ANTLR start "rule__BCoolCompositionRule__Group__5__Impl"
    // InternalBCOoL.g:2129:1: rule__BCoolCompositionRule__Group__5__Impl : ( ')' ) ;
    public final void rule__BCoolCompositionRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2133:1: ( ( ')' ) )
            // InternalBCOoL.g:2134:1: ( ')' )
            {
            // InternalBCOoL.g:2134:1: ( ')' )
            // InternalBCOoL.g:2135:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__5__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__6"
    // InternalBCOoL.g:2148:1: rule__BCoolCompositionRule__Group__6 : rule__BCoolCompositionRule__Group__6__Impl rule__BCoolCompositionRule__Group__7 ;
    public final void rule__BCoolCompositionRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2152:1: ( rule__BCoolCompositionRule__Group__6__Impl rule__BCoolCompositionRule__Group__7 )
            // InternalBCOoL.g:2153:2: rule__BCoolCompositionRule__Group__6__Impl rule__BCoolCompositionRule__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__BCoolCompositionRule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__6"


    // $ANTLR start "rule__BCoolCompositionRule__Group__6__Impl"
    // InternalBCOoL.g:2160:1: rule__BCoolCompositionRule__Group__6__Impl : ( ( 'MatchingCorrespondance:' )? ) ;
    public final void rule__BCoolCompositionRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2164:1: ( ( ( 'MatchingCorrespondance:' )? ) )
            // InternalBCOoL.g:2165:1: ( ( 'MatchingCorrespondance:' )? )
            {
            // InternalBCOoL.g:2165:1: ( ( 'MatchingCorrespondance:' )? )
            // InternalBCOoL.g:2166:1: ( 'MatchingCorrespondance:' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_6()); 
            }
            // InternalBCOoL.g:2167:1: ( 'MatchingCorrespondance:' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBCOoL.g:2168:2: 'MatchingCorrespondance:'
                    {
                    match(input,37,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__6__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__7"
    // InternalBCOoL.g:2179:1: rule__BCoolCompositionRule__Group__7 : rule__BCoolCompositionRule__Group__7__Impl rule__BCoolCompositionRule__Group__8 ;
    public final void rule__BCoolCompositionRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2183:1: ( rule__BCoolCompositionRule__Group__7__Impl rule__BCoolCompositionRule__Group__8 )
            // InternalBCOoL.g:2184:2: rule__BCoolCompositionRule__Group__7__Impl rule__BCoolCompositionRule__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__BCoolCompositionRule__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__7"


    // $ANTLR start "rule__BCoolCompositionRule__Group__7__Impl"
    // InternalBCOoL.g:2191:1: rule__BCoolCompositionRule__Group__7__Impl : ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 ) ) ;
    public final void rule__BCoolCompositionRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2195:1: ( ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 ) ) )
            // InternalBCOoL.g:2196:1: ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 ) )
            {
            // InternalBCOoL.g:2196:1: ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 ) )
            // InternalBCOoL.g:2197:1: ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleAssignment_7()); 
            }
            // InternalBCOoL.g:2198:1: ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 )
            // InternalBCOoL.g:2198:2: rule__BCoolCompositionRule__MatchingRuleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__MatchingRuleAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__7__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__8"
    // InternalBCOoL.g:2208:1: rule__BCoolCompositionRule__Group__8 : rule__BCoolCompositionRule__Group__8__Impl rule__BCoolCompositionRule__Group__9 ;
    public final void rule__BCoolCompositionRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2212:1: ( rule__BCoolCompositionRule__Group__8__Impl rule__BCoolCompositionRule__Group__9 )
            // InternalBCOoL.g:2213:2: rule__BCoolCompositionRule__Group__8__Impl rule__BCoolCompositionRule__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__BCoolCompositionRule__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__8"


    // $ANTLR start "rule__BCoolCompositionRule__Group__8__Impl"
    // InternalBCOoL.g:2220:1: rule__BCoolCompositionRule__Group__8__Impl : ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 ) ) ;
    public final void rule__BCoolCompositionRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2224:1: ( ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 ) ) )
            // InternalBCOoL.g:2225:1: ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 ) )
            {
            // InternalBCOoL.g:2225:1: ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 ) )
            // InternalBCOoL.g:2226:1: ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleAssignment_8()); 
            }
            // InternalBCOoL.g:2227:1: ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 )
            // InternalBCOoL.g:2227:2: rule__BCoolCompositionRule__CoordinationRuleAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__CoordinationRuleAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__8__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__9"
    // InternalBCOoL.g:2237:1: rule__BCoolCompositionRule__Group__9 : rule__BCoolCompositionRule__Group__9__Impl ;
    public final void rule__BCoolCompositionRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2241:1: ( rule__BCoolCompositionRule__Group__9__Impl )
            // InternalBCOoL.g:2242:2: rule__BCoolCompositionRule__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__9"


    // $ANTLR start "rule__BCoolCompositionRule__Group__9__Impl"
    // InternalBCOoL.g:2248:1: rule__BCoolCompositionRule__Group__9__Impl : ( 'end operator;' ) ;
    public final void rule__BCoolCompositionRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2252:1: ( ( 'end operator;' ) )
            // InternalBCOoL.g:2253:1: ( 'end operator;' )
            {
            // InternalBCOoL.g:2253:1: ( 'end operator;' )
            // InternalBCOoL.g:2254:1: 'end operator;'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getEndOperatorKeyword_9()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getEndOperatorKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__9__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group_4__0"
    // InternalBCOoL.g:2287:1: rule__BCoolCompositionRule__Group_4__0 : rule__BCoolCompositionRule__Group_4__0__Impl rule__BCoolCompositionRule__Group_4__1 ;
    public final void rule__BCoolCompositionRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2291:1: ( rule__BCoolCompositionRule__Group_4__0__Impl rule__BCoolCompositionRule__Group_4__1 )
            // InternalBCOoL.g:2292:2: rule__BCoolCompositionRule__Group_4__0__Impl rule__BCoolCompositionRule__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__BCoolCompositionRule__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group_4__0"


    // $ANTLR start "rule__BCoolCompositionRule__Group_4__0__Impl"
    // InternalBCOoL.g:2299:1: rule__BCoolCompositionRule__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BCoolCompositionRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2303:1: ( ( ',' ) )
            // InternalBCOoL.g:2304:1: ( ',' )
            {
            // InternalBCOoL.g:2304:1: ( ',' )
            // InternalBCOoL.g:2305:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_4_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group_4__0__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group_4__1"
    // InternalBCOoL.g:2318:1: rule__BCoolCompositionRule__Group_4__1 : rule__BCoolCompositionRule__Group_4__1__Impl ;
    public final void rule__BCoolCompositionRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2322:1: ( rule__BCoolCompositionRule__Group_4__1__Impl )
            // InternalBCOoL.g:2323:2: rule__BCoolCompositionRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group_4__1"


    // $ANTLR start "rule__BCoolCompositionRule__Group_4__1__Impl"
    // InternalBCOoL.g:2329:1: rule__BCoolCompositionRule__Group_4__1__Impl : ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 ) ) ;
    public final void rule__BCoolCompositionRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2333:1: ( ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 ) ) )
            // InternalBCOoL.g:2334:1: ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 ) )
            {
            // InternalBCOoL.g:2334:1: ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 ) )
            // InternalBCOoL.g:2335:1: ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsAssignment_4_1()); 
            }
            // InternalBCOoL.g:2336:1: ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 )
            // InternalBCOoL.g:2336:2: rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group_4__1__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__0"
    // InternalBCOoL.g:2350:1: rule__BCoolOperatorArg__Group__0 : rule__BCoolOperatorArg__Group__0__Impl rule__BCoolOperatorArg__Group__1 ;
    public final void rule__BCoolOperatorArg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2354:1: ( rule__BCoolOperatorArg__Group__0__Impl rule__BCoolOperatorArg__Group__1 )
            // InternalBCOoL.g:2355:2: rule__BCoolOperatorArg__Group__0__Impl rule__BCoolOperatorArg__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BCoolOperatorArg__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorArg__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__0"


    // $ANTLR start "rule__BCoolOperatorArg__Group__0__Impl"
    // InternalBCOoL.g:2362:1: rule__BCoolOperatorArg__Group__0__Impl : ( ( rule__BCoolOperatorArg__NameAssignment_0 ) ) ;
    public final void rule__BCoolOperatorArg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2366:1: ( ( ( rule__BCoolOperatorArg__NameAssignment_0 ) ) )
            // InternalBCOoL.g:2367:1: ( ( rule__BCoolOperatorArg__NameAssignment_0 ) )
            {
            // InternalBCOoL.g:2367:1: ( ( rule__BCoolOperatorArg__NameAssignment_0 ) )
            // InternalBCOoL.g:2368:1: ( rule__BCoolOperatorArg__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getNameAssignment_0()); 
            }
            // InternalBCOoL.g:2369:1: ( rule__BCoolOperatorArg__NameAssignment_0 )
            // InternalBCOoL.g:2369:2: rule__BCoolOperatorArg__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorArg__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__0__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__1"
    // InternalBCOoL.g:2379:1: rule__BCoolOperatorArg__Group__1 : rule__BCoolOperatorArg__Group__1__Impl rule__BCoolOperatorArg__Group__2 ;
    public final void rule__BCoolOperatorArg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2383:1: ( rule__BCoolOperatorArg__Group__1__Impl rule__BCoolOperatorArg__Group__2 )
            // InternalBCOoL.g:2384:2: rule__BCoolOperatorArg__Group__1__Impl rule__BCoolOperatorArg__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__BCoolOperatorArg__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorArg__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__1"


    // $ANTLR start "rule__BCoolOperatorArg__Group__1__Impl"
    // InternalBCOoL.g:2391:1: rule__BCoolOperatorArg__Group__1__Impl : ( ' : ' ) ;
    public final void rule__BCoolOperatorArg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2395:1: ( ( ' : ' ) )
            // InternalBCOoL.g:2396:1: ( ' : ' )
            {
            // InternalBCOoL.g:2396:1: ( ' : ' )
            // InternalBCOoL.g:2397:1: ' : '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getSpaceColonSpaceKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getSpaceColonSpaceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__1__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__2"
    // InternalBCOoL.g:2410:1: rule__BCoolOperatorArg__Group__2 : rule__BCoolOperatorArg__Group__2__Impl rule__BCoolOperatorArg__Group__3 ;
    public final void rule__BCoolOperatorArg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2414:1: ( rule__BCoolOperatorArg__Group__2__Impl rule__BCoolOperatorArg__Group__3 )
            // InternalBCOoL.g:2415:2: rule__BCoolOperatorArg__Group__2__Impl rule__BCoolOperatorArg__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__BCoolOperatorArg__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorArg__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__2"


    // $ANTLR start "rule__BCoolOperatorArg__Group__2__Impl"
    // InternalBCOoL.g:2422:1: rule__BCoolOperatorArg__Group__2__Impl : ( ( rule__BCoolOperatorArg__InterfaceAssignment_2 ) ) ;
    public final void rule__BCoolOperatorArg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2426:1: ( ( ( rule__BCoolOperatorArg__InterfaceAssignment_2 ) ) )
            // InternalBCOoL.g:2427:1: ( ( rule__BCoolOperatorArg__InterfaceAssignment_2 ) )
            {
            // InternalBCOoL.g:2427:1: ( ( rule__BCoolOperatorArg__InterfaceAssignment_2 ) )
            // InternalBCOoL.g:2428:1: ( rule__BCoolOperatorArg__InterfaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getInterfaceAssignment_2()); 
            }
            // InternalBCOoL.g:2429:1: ( rule__BCoolOperatorArg__InterfaceAssignment_2 )
            // InternalBCOoL.g:2429:2: rule__BCoolOperatorArg__InterfaceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorArg__InterfaceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getInterfaceAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__2__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__3"
    // InternalBCOoL.g:2439:1: rule__BCoolOperatorArg__Group__3 : rule__BCoolOperatorArg__Group__3__Impl rule__BCoolOperatorArg__Group__4 ;
    public final void rule__BCoolOperatorArg__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2443:1: ( rule__BCoolOperatorArg__Group__3__Impl rule__BCoolOperatorArg__Group__4 )
            // InternalBCOoL.g:2444:2: rule__BCoolOperatorArg__Group__3__Impl rule__BCoolOperatorArg__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__BCoolOperatorArg__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorArg__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__3"


    // $ANTLR start "rule__BCoolOperatorArg__Group__3__Impl"
    // InternalBCOoL.g:2451:1: rule__BCoolOperatorArg__Group__3__Impl : ( '::' ) ;
    public final void rule__BCoolOperatorArg__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2455:1: ( ( '::' ) )
            // InternalBCOoL.g:2456:1: ( '::' )
            {
            // InternalBCOoL.g:2456:1: ( '::' )
            // InternalBCOoL.g:2457:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getColonColonKeyword_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getColonColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__3__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__4"
    // InternalBCOoL.g:2470:1: rule__BCoolOperatorArg__Group__4 : rule__BCoolOperatorArg__Group__4__Impl rule__BCoolOperatorArg__Group__5 ;
    public final void rule__BCoolOperatorArg__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2474:1: ( rule__BCoolOperatorArg__Group__4__Impl rule__BCoolOperatorArg__Group__5 )
            // InternalBCOoL.g:2475:2: rule__BCoolOperatorArg__Group__4__Impl rule__BCoolOperatorArg__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__BCoolOperatorArg__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorArg__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__4"


    // $ANTLR start "rule__BCoolOperatorArg__Group__4__Impl"
    // InternalBCOoL.g:2482:1: rule__BCoolOperatorArg__Group__4__Impl : ( ( rule__BCoolOperatorArg__DSEAssignment_4 )? ) ;
    public final void rule__BCoolOperatorArg__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2486:1: ( ( ( rule__BCoolOperatorArg__DSEAssignment_4 )? ) )
            // InternalBCOoL.g:2487:1: ( ( rule__BCoolOperatorArg__DSEAssignment_4 )? )
            {
            // InternalBCOoL.g:2487:1: ( ( rule__BCoolOperatorArg__DSEAssignment_4 )? )
            // InternalBCOoL.g:2488:1: ( rule__BCoolOperatorArg__DSEAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getDSEAssignment_4()); 
            }
            // InternalBCOoL.g:2489:1: ( rule__BCoolOperatorArg__DSEAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBCOoL.g:2489:2: rule__BCoolOperatorArg__DSEAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__BCoolOperatorArg__DSEAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getDSEAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__4__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__5"
    // InternalBCOoL.g:2499:1: rule__BCoolOperatorArg__Group__5 : rule__BCoolOperatorArg__Group__5__Impl ;
    public final void rule__BCoolOperatorArg__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2503:1: ( rule__BCoolOperatorArg__Group__5__Impl )
            // InternalBCOoL.g:2504:2: rule__BCoolOperatorArg__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BCoolOperatorArg__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__5"


    // $ANTLR start "rule__BCoolOperatorArg__Group__5__Impl"
    // InternalBCOoL.g:2510:1: rule__BCoolOperatorArg__Group__5__Impl : ( ( rule__BCoolOperatorArg__InterfaceClassAssignment_5 )? ) ;
    public final void rule__BCoolOperatorArg__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2514:1: ( ( ( rule__BCoolOperatorArg__InterfaceClassAssignment_5 )? ) )
            // InternalBCOoL.g:2515:1: ( ( rule__BCoolOperatorArg__InterfaceClassAssignment_5 )? )
            {
            // InternalBCOoL.g:2515:1: ( ( rule__BCoolOperatorArg__InterfaceClassAssignment_5 )? )
            // InternalBCOoL.g:2516:1: ( rule__BCoolOperatorArg__InterfaceClassAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getInterfaceClassAssignment_5()); 
            }
            // InternalBCOoL.g:2517:1: ( rule__BCoolOperatorArg__InterfaceClassAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBCOoL.g:2517:2: rule__BCoolOperatorArg__InterfaceClassAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__BCoolOperatorArg__InterfaceClassAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getInterfaceClassAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__5__Impl"


    // $ANTLR start "rule__MatchingRule__Group__0"
    // InternalBCOoL.g:2539:1: rule__MatchingRule__Group__0 : rule__MatchingRule__Group__0__Impl rule__MatchingRule__Group__1 ;
    public final void rule__MatchingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2543:1: ( rule__MatchingRule__Group__0__Impl rule__MatchingRule__Group__1 )
            // InternalBCOoL.g:2544:2: rule__MatchingRule__Group__0__Impl rule__MatchingRule__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MatchingRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchingRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__0"


    // $ANTLR start "rule__MatchingRule__Group__0__Impl"
    // InternalBCOoL.g:2551:1: rule__MatchingRule__Group__0__Impl : ( 'when' ) ;
    public final void rule__MatchingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2555:1: ( ( 'when' ) )
            // InternalBCOoL.g:2556:1: ( 'when' )
            {
            // InternalBCOoL.g:2556:1: ( 'when' )
            // InternalBCOoL.g:2557:1: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getWhenKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getWhenKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__0__Impl"


    // $ANTLR start "rule__MatchingRule__Group__1"
    // InternalBCOoL.g:2570:1: rule__MatchingRule__Group__1 : rule__MatchingRule__Group__1__Impl rule__MatchingRule__Group__2 ;
    public final void rule__MatchingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2574:1: ( rule__MatchingRule__Group__1__Impl rule__MatchingRule__Group__2 )
            // InternalBCOoL.g:2575:2: rule__MatchingRule__Group__1__Impl rule__MatchingRule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MatchingRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchingRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__1"


    // $ANTLR start "rule__MatchingRule__Group__1__Impl"
    // InternalBCOoL.g:2582:1: rule__MatchingRule__Group__1__Impl : ( ( rule__MatchingRule__ConditionAssignment_1 ) ) ;
    public final void rule__MatchingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2586:1: ( ( ( rule__MatchingRule__ConditionAssignment_1 ) ) )
            // InternalBCOoL.g:2587:1: ( ( rule__MatchingRule__ConditionAssignment_1 ) )
            {
            // InternalBCOoL.g:2587:1: ( ( rule__MatchingRule__ConditionAssignment_1 ) )
            // InternalBCOoL.g:2588:1: ( rule__MatchingRule__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getConditionAssignment_1()); 
            }
            // InternalBCOoL.g:2589:1: ( rule__MatchingRule__ConditionAssignment_1 )
            // InternalBCOoL.g:2589:2: rule__MatchingRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchingRule__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getConditionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__1__Impl"


    // $ANTLR start "rule__MatchingRule__Group__2"
    // InternalBCOoL.g:2599:1: rule__MatchingRule__Group__2 : rule__MatchingRule__Group__2__Impl rule__MatchingRule__Group__3 ;
    public final void rule__MatchingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2603:1: ( rule__MatchingRule__Group__2__Impl rule__MatchingRule__Group__3 )
            // InternalBCOoL.g:2604:2: rule__MatchingRule__Group__2__Impl rule__MatchingRule__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__MatchingRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchingRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__2"


    // $ANTLR start "rule__MatchingRule__Group__2__Impl"
    // InternalBCOoL.g:2611:1: rule__MatchingRule__Group__2__Impl : ( ';' ) ;
    public final void rule__MatchingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2615:1: ( ( ';' ) )
            // InternalBCOoL.g:2616:1: ( ';' )
            {
            // InternalBCOoL.g:2616:1: ( ';' )
            // InternalBCOoL.g:2617:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__2__Impl"


    // $ANTLR start "rule__MatchingRule__Group__3"
    // InternalBCOoL.g:2630:1: rule__MatchingRule__Group__3 : rule__MatchingRule__Group__3__Impl rule__MatchingRule__Group__4 ;
    public final void rule__MatchingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2634:1: ( rule__MatchingRule__Group__3__Impl rule__MatchingRule__Group__4 )
            // InternalBCOoL.g:2635:2: rule__MatchingRule__Group__3__Impl rule__MatchingRule__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__MatchingRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchingRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__3"


    // $ANTLR start "rule__MatchingRule__Group__3__Impl"
    // InternalBCOoL.g:2642:1: rule__MatchingRule__Group__3__Impl : ( 'CoordinationRule:' ) ;
    public final void rule__MatchingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2646:1: ( ( 'CoordinationRule:' ) )
            // InternalBCOoL.g:2647:1: ( 'CoordinationRule:' )
            {
            // InternalBCOoL.g:2647:1: ( 'CoordinationRule:' )
            // InternalBCOoL.g:2648:1: 'CoordinationRule:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__3__Impl"


    // $ANTLR start "rule__MatchingRule__Group__4"
    // InternalBCOoL.g:2661:1: rule__MatchingRule__Group__4 : rule__MatchingRule__Group__4__Impl ;
    public final void rule__MatchingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2665:1: ( rule__MatchingRule__Group__4__Impl )
            // InternalBCOoL.g:2666:2: rule__MatchingRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchingRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__4"


    // $ANTLR start "rule__MatchingRule__Group__4__Impl"
    // InternalBCOoL.g:2672:1: rule__MatchingRule__Group__4__Impl : ( ( rule__MatchingRule__Group_4__0 )* ) ;
    public final void rule__MatchingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2676:1: ( ( ( rule__MatchingRule__Group_4__0 )* ) )
            // InternalBCOoL.g:2677:1: ( ( rule__MatchingRule__Group_4__0 )* )
            {
            // InternalBCOoL.g:2677:1: ( ( rule__MatchingRule__Group_4__0 )* )
            // InternalBCOoL.g:2678:1: ( rule__MatchingRule__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getGroup_4()); 
            }
            // InternalBCOoL.g:2679:1: ( rule__MatchingRule__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBCOoL.g:2679:2: rule__MatchingRule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__MatchingRule__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__4__Impl"


    // $ANTLR start "rule__MatchingRule__Group_4__0"
    // InternalBCOoL.g:2699:1: rule__MatchingRule__Group_4__0 : rule__MatchingRule__Group_4__0__Impl rule__MatchingRule__Group_4__1 ;
    public final void rule__MatchingRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2703:1: ( rule__MatchingRule__Group_4__0__Impl rule__MatchingRule__Group_4__1 )
            // InternalBCOoL.g:2704:2: rule__MatchingRule__Group_4__0__Impl rule__MatchingRule__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__MatchingRule__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchingRule__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__0"


    // $ANTLR start "rule__MatchingRule__Group_4__0__Impl"
    // InternalBCOoL.g:2711:1: rule__MatchingRule__Group_4__0__Impl : ( 'Local Event' ) ;
    public final void rule__MatchingRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2715:1: ( ( 'Local Event' ) )
            // InternalBCOoL.g:2716:1: ( 'Local Event' )
            {
            // InternalBCOoL.g:2716:1: ( 'Local Event' )
            // InternalBCOoL.g:2717:1: 'Local Event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getLocalEventKeyword_4_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getLocalEventKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__0__Impl"


    // $ANTLR start "rule__MatchingRule__Group_4__1"
    // InternalBCOoL.g:2730:1: rule__MatchingRule__Group_4__1 : rule__MatchingRule__Group_4__1__Impl rule__MatchingRule__Group_4__2 ;
    public final void rule__MatchingRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2734:1: ( rule__MatchingRule__Group_4__1__Impl rule__MatchingRule__Group_4__2 )
            // InternalBCOoL.g:2735:2: rule__MatchingRule__Group_4__1__Impl rule__MatchingRule__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__MatchingRule__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MatchingRule__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__1"


    // $ANTLR start "rule__MatchingRule__Group_4__1__Impl"
    // InternalBCOoL.g:2742:1: rule__MatchingRule__Group_4__1__Impl : ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) ) ;
    public final void rule__MatchingRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2746:1: ( ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) ) )
            // InternalBCOoL.g:2747:1: ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) )
            {
            // InternalBCOoL.g:2747:1: ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) )
            // InternalBCOoL.g:2748:1: ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsAssignment_4_1()); 
            }
            // InternalBCOoL.g:2749:1: ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 )
            // InternalBCOoL.g:2749:2: rule__MatchingRule__FilterEventExpressionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MatchingRule__FilterEventExpressionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__1__Impl"


    // $ANTLR start "rule__MatchingRule__Group_4__2"
    // InternalBCOoL.g:2759:1: rule__MatchingRule__Group_4__2 : rule__MatchingRule__Group_4__2__Impl ;
    public final void rule__MatchingRule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2763:1: ( rule__MatchingRule__Group_4__2__Impl )
            // InternalBCOoL.g:2764:2: rule__MatchingRule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatchingRule__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__2"


    // $ANTLR start "rule__MatchingRule__Group_4__2__Impl"
    // InternalBCOoL.g:2770:1: rule__MatchingRule__Group_4__2__Impl : ( ';' ) ;
    public final void rule__MatchingRule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2774:1: ( ( ';' ) )
            // InternalBCOoL.g:2775:1: ( ';' )
            {
            // InternalBCOoL.g:2775:1: ( ';' )
            // InternalBCOoL.g:2776:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_4_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__2__Impl"


    // $ANTLR start "rule__EventExpression__Group__0"
    // InternalBCOoL.g:2795:1: rule__EventExpression__Group__0 : rule__EventExpression__Group__0__Impl rule__EventExpression__Group__1 ;
    public final void rule__EventExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2799:1: ( rule__EventExpression__Group__0__Impl rule__EventExpression__Group__1 )
            // InternalBCOoL.g:2800:2: rule__EventExpression__Group__0__Impl rule__EventExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__EventExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__0"


    // $ANTLR start "rule__EventExpression__Group__0__Impl"
    // InternalBCOoL.g:2807:1: rule__EventExpression__Group__0__Impl : ( ( rule__EventExpression__NameAssignment_0 ) ) ;
    public final void rule__EventExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2811:1: ( ( ( rule__EventExpression__NameAssignment_0 ) ) )
            // InternalBCOoL.g:2812:1: ( ( rule__EventExpression__NameAssignment_0 ) )
            {
            // InternalBCOoL.g:2812:1: ( ( rule__EventExpression__NameAssignment_0 ) )
            // InternalBCOoL.g:2813:1: ( rule__EventExpression__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getNameAssignment_0()); 
            }
            // InternalBCOoL.g:2814:1: ( rule__EventExpression__NameAssignment_0 )
            // InternalBCOoL.g:2814:2: rule__EventExpression__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EventExpression__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__0__Impl"


    // $ANTLR start "rule__EventExpression__Group__1"
    // InternalBCOoL.g:2824:1: rule__EventExpression__Group__1 : rule__EventExpression__Group__1__Impl rule__EventExpression__Group__2 ;
    public final void rule__EventExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2828:1: ( rule__EventExpression__Group__1__Impl rule__EventExpression__Group__2 )
            // InternalBCOoL.g:2829:2: rule__EventExpression__Group__1__Impl rule__EventExpression__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EventExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__1"


    // $ANTLR start "rule__EventExpression__Group__1__Impl"
    // InternalBCOoL.g:2836:1: rule__EventExpression__Group__1__Impl : ( '=' ) ;
    public final void rule__EventExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2840:1: ( ( '=' ) )
            // InternalBCOoL.g:2841:1: ( '=' )
            {
            // InternalBCOoL.g:2841:1: ( '=' )
            // InternalBCOoL.g:2842:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__1__Impl"


    // $ANTLR start "rule__EventExpression__Group__2"
    // InternalBCOoL.g:2855:1: rule__EventExpression__Group__2 : rule__EventExpression__Group__2__Impl rule__EventExpression__Group__3 ;
    public final void rule__EventExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2859:1: ( rule__EventExpression__Group__2__Impl rule__EventExpression__Group__3 )
            // InternalBCOoL.g:2860:2: rule__EventExpression__Group__2__Impl rule__EventExpression__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EventExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__2"


    // $ANTLR start "rule__EventExpression__Group__2__Impl"
    // InternalBCOoL.g:2867:1: rule__EventExpression__Group__2__Impl : ( ( rule__EventExpression__DeclarationAssignment_2 ) ) ;
    public final void rule__EventExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2871:1: ( ( ( rule__EventExpression__DeclarationAssignment_2 ) ) )
            // InternalBCOoL.g:2872:1: ( ( rule__EventExpression__DeclarationAssignment_2 ) )
            {
            // InternalBCOoL.g:2872:1: ( ( rule__EventExpression__DeclarationAssignment_2 ) )
            // InternalBCOoL.g:2873:1: ( rule__EventExpression__DeclarationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getDeclarationAssignment_2()); 
            }
            // InternalBCOoL.g:2874:1: ( rule__EventExpression__DeclarationAssignment_2 )
            // InternalBCOoL.g:2874:2: rule__EventExpression__DeclarationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventExpression__DeclarationAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getDeclarationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__2__Impl"


    // $ANTLR start "rule__EventExpression__Group__3"
    // InternalBCOoL.g:2884:1: rule__EventExpression__Group__3 : rule__EventExpression__Group__3__Impl rule__EventExpression__Group__4 ;
    public final void rule__EventExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2888:1: ( rule__EventExpression__Group__3__Impl rule__EventExpression__Group__4 )
            // InternalBCOoL.g:2889:2: rule__EventExpression__Group__3__Impl rule__EventExpression__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__EventExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__3"


    // $ANTLR start "rule__EventExpression__Group__3__Impl"
    // InternalBCOoL.g:2896:1: rule__EventExpression__Group__3__Impl : ( '(' ) ;
    public final void rule__EventExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2900:1: ( ( '(' ) )
            // InternalBCOoL.g:2901:1: ( '(' )
            {
            // InternalBCOoL.g:2901:1: ( '(' )
            // InternalBCOoL.g:2902:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__3__Impl"


    // $ANTLR start "rule__EventExpression__Group__4"
    // InternalBCOoL.g:2915:1: rule__EventExpression__Group__4 : rule__EventExpression__Group__4__Impl rule__EventExpression__Group__5 ;
    public final void rule__EventExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2919:1: ( rule__EventExpression__Group__4__Impl rule__EventExpression__Group__5 )
            // InternalBCOoL.g:2920:2: rule__EventExpression__Group__4__Impl rule__EventExpression__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__EventExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__4"


    // $ANTLR start "rule__EventExpression__Group__4__Impl"
    // InternalBCOoL.g:2927:1: rule__EventExpression__Group__4__Impl : ( ( rule__EventExpression__Group_4__0 )? ) ;
    public final void rule__EventExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2931:1: ( ( ( rule__EventExpression__Group_4__0 )? ) )
            // InternalBCOoL.g:2932:1: ( ( rule__EventExpression__Group_4__0 )? )
            {
            // InternalBCOoL.g:2932:1: ( ( rule__EventExpression__Group_4__0 )? )
            // InternalBCOoL.g:2933:1: ( rule__EventExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getGroup_4()); 
            }
            // InternalBCOoL.g:2934:1: ( rule__EventExpression__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBCOoL.g:2934:2: rule__EventExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__4__Impl"


    // $ANTLR start "rule__EventExpression__Group__5"
    // InternalBCOoL.g:2944:1: rule__EventExpression__Group__5 : rule__EventExpression__Group__5__Impl ;
    public final void rule__EventExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2948:1: ( rule__EventExpression__Group__5__Impl )
            // InternalBCOoL.g:2949:2: rule__EventExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__5"


    // $ANTLR start "rule__EventExpression__Group__5__Impl"
    // InternalBCOoL.g:2955:1: rule__EventExpression__Group__5__Impl : ( ')' ) ;
    public final void rule__EventExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2959:1: ( ( ')' ) )
            // InternalBCOoL.g:2960:1: ( ')' )
            {
            // InternalBCOoL.g:2960:1: ( ')' )
            // InternalBCOoL.g:2961:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__5__Impl"


    // $ANTLR start "rule__EventExpression__Group_4__0"
    // InternalBCOoL.g:2986:1: rule__EventExpression__Group_4__0 : rule__EventExpression__Group_4__0__Impl rule__EventExpression__Group_4__1 ;
    public final void rule__EventExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:2990:1: ( rule__EventExpression__Group_4__0__Impl rule__EventExpression__Group_4__1 )
            // InternalBCOoL.g:2991:2: rule__EventExpression__Group_4__0__Impl rule__EventExpression__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__EventExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4__0"


    // $ANTLR start "rule__EventExpression__Group_4__0__Impl"
    // InternalBCOoL.g:2998:1: rule__EventExpression__Group_4__0__Impl : ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) ) ;
    public final void rule__EventExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3002:1: ( ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) ) )
            // InternalBCOoL.g:3003:1: ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) )
            {
            // InternalBCOoL.g:3003:1: ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) )
            // InternalBCOoL.g:3004:1: ( rule__EventExpression__ActualParametersAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_0()); 
            }
            // InternalBCOoL.g:3005:1: ( rule__EventExpression__ActualParametersAssignment_4_0 )
            // InternalBCOoL.g:3005:2: rule__EventExpression__ActualParametersAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EventExpression__ActualParametersAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4__0__Impl"


    // $ANTLR start "rule__EventExpression__Group_4__1"
    // InternalBCOoL.g:3015:1: rule__EventExpression__Group_4__1 : rule__EventExpression__Group_4__1__Impl ;
    public final void rule__EventExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3019:1: ( rule__EventExpression__Group_4__1__Impl )
            // InternalBCOoL.g:3020:2: rule__EventExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4__1"


    // $ANTLR start "rule__EventExpression__Group_4__1__Impl"
    // InternalBCOoL.g:3026:1: rule__EventExpression__Group_4__1__Impl : ( ( rule__EventExpression__Group_4_1__0 )* ) ;
    public final void rule__EventExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3030:1: ( ( ( rule__EventExpression__Group_4_1__0 )* ) )
            // InternalBCOoL.g:3031:1: ( ( rule__EventExpression__Group_4_1__0 )* )
            {
            // InternalBCOoL.g:3031:1: ( ( rule__EventExpression__Group_4_1__0 )* )
            // InternalBCOoL.g:3032:1: ( rule__EventExpression__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getGroup_4_1()); 
            }
            // InternalBCOoL.g:3033:1: ( rule__EventExpression__Group_4_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBCOoL.g:3033:2: rule__EventExpression__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EventExpression__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4__1__Impl"


    // $ANTLR start "rule__EventExpression__Group_4_1__0"
    // InternalBCOoL.g:3047:1: rule__EventExpression__Group_4_1__0 : rule__EventExpression__Group_4_1__0__Impl rule__EventExpression__Group_4_1__1 ;
    public final void rule__EventExpression__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3051:1: ( rule__EventExpression__Group_4_1__0__Impl rule__EventExpression__Group_4_1__1 )
            // InternalBCOoL.g:3052:2: rule__EventExpression__Group_4_1__0__Impl rule__EventExpression__Group_4_1__1
            {
            pushFollow(FOLLOW_9);
            rule__EventExpression__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4_1__0"


    // $ANTLR start "rule__EventExpression__Group_4_1__0__Impl"
    // InternalBCOoL.g:3059:1: rule__EventExpression__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__EventExpression__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3063:1: ( ( ',' ) )
            // InternalBCOoL.g:3064:1: ( ',' )
            {
            // InternalBCOoL.g:3064:1: ( ',' )
            // InternalBCOoL.g:3065:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4_1__0__Impl"


    // $ANTLR start "rule__EventExpression__Group_4_1__1"
    // InternalBCOoL.g:3078:1: rule__EventExpression__Group_4_1__1 : rule__EventExpression__Group_4_1__1__Impl ;
    public final void rule__EventExpression__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3082:1: ( rule__EventExpression__Group_4_1__1__Impl )
            // InternalBCOoL.g:3083:2: rule__EventExpression__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventExpression__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4_1__1"


    // $ANTLR start "rule__EventExpression__Group_4_1__1__Impl"
    // InternalBCOoL.g:3089:1: rule__EventExpression__Group_4_1__1__Impl : ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) ) ;
    public final void rule__EventExpression__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3093:1: ( ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) ) )
            // InternalBCOoL.g:3094:1: ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) )
            {
            // InternalBCOoL.g:3094:1: ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) )
            // InternalBCOoL.g:3095:1: ( rule__EventExpression__ActualParametersAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_1_1()); 
            }
            // InternalBCOoL.g:3096:1: ( rule__EventExpression__ActualParametersAssignment_4_1_1 )
            // InternalBCOoL.g:3096:2: rule__EventExpression__ActualParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EventExpression__ActualParametersAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4_1__1__Impl"


    // $ANTLR start "rule__EventRelation__Group__0"
    // InternalBCOoL.g:3110:1: rule__EventRelation__Group__0 : rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 ;
    public final void rule__EventRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3114:1: ( rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 )
            // InternalBCOoL.g:3115:2: rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EventRelation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__0"


    // $ANTLR start "rule__EventRelation__Group__0__Impl"
    // InternalBCOoL.g:3122:1: rule__EventRelation__Group__0__Impl : ( () ) ;
    public final void rule__EventRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3126:1: ( ( () ) )
            // InternalBCOoL.g:3127:1: ( () )
            {
            // InternalBCOoL.g:3127:1: ( () )
            // InternalBCOoL.g:3128:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getEventRelationAction_0()); 
            }
            // InternalBCOoL.g:3129:1: ()
            // InternalBCOoL.g:3131:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getEventRelationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__0__Impl"


    // $ANTLR start "rule__EventRelation__Group__1"
    // InternalBCOoL.g:3141:1: rule__EventRelation__Group__1 : rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 ;
    public final void rule__EventRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3145:1: ( rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 )
            // InternalBCOoL.g:3146:2: rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EventRelation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__1"


    // $ANTLR start "rule__EventRelation__Group__1__Impl"
    // InternalBCOoL.g:3153:1: rule__EventRelation__Group__1__Impl : ( ( rule__EventRelation__DeclarationAssignment_1 ) ) ;
    public final void rule__EventRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3157:1: ( ( ( rule__EventRelation__DeclarationAssignment_1 ) ) )
            // InternalBCOoL.g:3158:1: ( ( rule__EventRelation__DeclarationAssignment_1 ) )
            {
            // InternalBCOoL.g:3158:1: ( ( rule__EventRelation__DeclarationAssignment_1 ) )
            // InternalBCOoL.g:3159:1: ( rule__EventRelation__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getDeclarationAssignment_1()); 
            }
            // InternalBCOoL.g:3160:1: ( rule__EventRelation__DeclarationAssignment_1 )
            // InternalBCOoL.g:3160:2: rule__EventRelation__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EventRelation__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getDeclarationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__1__Impl"


    // $ANTLR start "rule__EventRelation__Group__2"
    // InternalBCOoL.g:3170:1: rule__EventRelation__Group__2 : rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 ;
    public final void rule__EventRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3174:1: ( rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 )
            // InternalBCOoL.g:3175:2: rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__EventRelation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__2"


    // $ANTLR start "rule__EventRelation__Group__2__Impl"
    // InternalBCOoL.g:3182:1: rule__EventRelation__Group__2__Impl : ( '(' ) ;
    public final void rule__EventRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3186:1: ( ( '(' ) )
            // InternalBCOoL.g:3187:1: ( '(' )
            {
            // InternalBCOoL.g:3187:1: ( '(' )
            // InternalBCOoL.g:3188:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__2__Impl"


    // $ANTLR start "rule__EventRelation__Group__3"
    // InternalBCOoL.g:3201:1: rule__EventRelation__Group__3 : rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4 ;
    public final void rule__EventRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3205:1: ( rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4 )
            // InternalBCOoL.g:3206:2: rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__EventRelation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__3"


    // $ANTLR start "rule__EventRelation__Group__3__Impl"
    // InternalBCOoL.g:3213:1: rule__EventRelation__Group__3__Impl : ( ( rule__EventRelation__Group_3__0 )? ) ;
    public final void rule__EventRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3217:1: ( ( ( rule__EventRelation__Group_3__0 )? ) )
            // InternalBCOoL.g:3218:1: ( ( rule__EventRelation__Group_3__0 )? )
            {
            // InternalBCOoL.g:3218:1: ( ( rule__EventRelation__Group_3__0 )? )
            // InternalBCOoL.g:3219:1: ( rule__EventRelation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getGroup_3()); 
            }
            // InternalBCOoL.g:3220:1: ( rule__EventRelation__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBCOoL.g:3220:2: rule__EventRelation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventRelation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__3__Impl"


    // $ANTLR start "rule__EventRelation__Group__4"
    // InternalBCOoL.g:3230:1: rule__EventRelation__Group__4 : rule__EventRelation__Group__4__Impl ;
    public final void rule__EventRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3234:1: ( rule__EventRelation__Group__4__Impl )
            // InternalBCOoL.g:3235:2: rule__EventRelation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__4"


    // $ANTLR start "rule__EventRelation__Group__4__Impl"
    // InternalBCOoL.g:3241:1: rule__EventRelation__Group__4__Impl : ( ')' ) ;
    public final void rule__EventRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3245:1: ( ( ')' ) )
            // InternalBCOoL.g:3246:1: ( ')' )
            {
            // InternalBCOoL.g:3246:1: ( ')' )
            // InternalBCOoL.g:3247:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__4__Impl"


    // $ANTLR start "rule__EventRelation__Group_3__0"
    // InternalBCOoL.g:3270:1: rule__EventRelation__Group_3__0 : rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1 ;
    public final void rule__EventRelation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3274:1: ( rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1 )
            // InternalBCOoL.g:3275:2: rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__EventRelation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__0"


    // $ANTLR start "rule__EventRelation__Group_3__0__Impl"
    // InternalBCOoL.g:3282:1: rule__EventRelation__Group_3__0__Impl : ( ( rule__EventRelation__ActualParametersAssignment_3_0 ) ) ;
    public final void rule__EventRelation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3286:1: ( ( ( rule__EventRelation__ActualParametersAssignment_3_0 ) ) )
            // InternalBCOoL.g:3287:1: ( ( rule__EventRelation__ActualParametersAssignment_3_0 ) )
            {
            // InternalBCOoL.g:3287:1: ( ( rule__EventRelation__ActualParametersAssignment_3_0 ) )
            // InternalBCOoL.g:3288:1: ( rule__EventRelation__ActualParametersAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersAssignment_3_0()); 
            }
            // InternalBCOoL.g:3289:1: ( rule__EventRelation__ActualParametersAssignment_3_0 )
            // InternalBCOoL.g:3289:2: rule__EventRelation__ActualParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__EventRelation__ActualParametersAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__0__Impl"


    // $ANTLR start "rule__EventRelation__Group_3__1"
    // InternalBCOoL.g:3299:1: rule__EventRelation__Group_3__1 : rule__EventRelation__Group_3__1__Impl ;
    public final void rule__EventRelation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3303:1: ( rule__EventRelation__Group_3__1__Impl )
            // InternalBCOoL.g:3304:2: rule__EventRelation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__1"


    // $ANTLR start "rule__EventRelation__Group_3__1__Impl"
    // InternalBCOoL.g:3310:1: rule__EventRelation__Group_3__1__Impl : ( ( rule__EventRelation__Group_3_1__0 )* ) ;
    public final void rule__EventRelation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3314:1: ( ( ( rule__EventRelation__Group_3_1__0 )* ) )
            // InternalBCOoL.g:3315:1: ( ( rule__EventRelation__Group_3_1__0 )* )
            {
            // InternalBCOoL.g:3315:1: ( ( rule__EventRelation__Group_3_1__0 )* )
            // InternalBCOoL.g:3316:1: ( rule__EventRelation__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getGroup_3_1()); 
            }
            // InternalBCOoL.g:3317:1: ( rule__EventRelation__Group_3_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==39) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBCOoL.g:3317:2: rule__EventRelation__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EventRelation__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__1__Impl"


    // $ANTLR start "rule__EventRelation__Group_3_1__0"
    // InternalBCOoL.g:3331:1: rule__EventRelation__Group_3_1__0 : rule__EventRelation__Group_3_1__0__Impl rule__EventRelation__Group_3_1__1 ;
    public final void rule__EventRelation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3335:1: ( rule__EventRelation__Group_3_1__0__Impl rule__EventRelation__Group_3_1__1 )
            // InternalBCOoL.g:3336:2: rule__EventRelation__Group_3_1__0__Impl rule__EventRelation__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
            rule__EventRelation__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3_1__0"


    // $ANTLR start "rule__EventRelation__Group_3_1__0__Impl"
    // InternalBCOoL.g:3343:1: rule__EventRelation__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__EventRelation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3347:1: ( ( ',' ) )
            // InternalBCOoL.g:3348:1: ( ',' )
            {
            // InternalBCOoL.g:3348:1: ( ',' )
            // InternalBCOoL.g:3349:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3_1__0__Impl"


    // $ANTLR start "rule__EventRelation__Group_3_1__1"
    // InternalBCOoL.g:3362:1: rule__EventRelation__Group_3_1__1 : rule__EventRelation__Group_3_1__1__Impl ;
    public final void rule__EventRelation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3366:1: ( rule__EventRelation__Group_3_1__1__Impl )
            // InternalBCOoL.g:3367:2: rule__EventRelation__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventRelation__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3_1__1"


    // $ANTLR start "rule__EventRelation__Group_3_1__1__Impl"
    // InternalBCOoL.g:3373:1: rule__EventRelation__Group_3_1__1__Impl : ( ( rule__EventRelation__ActualParametersAssignment_3_1_1 ) ) ;
    public final void rule__EventRelation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3377:1: ( ( ( rule__EventRelation__ActualParametersAssignment_3_1_1 ) ) )
            // InternalBCOoL.g:3378:1: ( ( rule__EventRelation__ActualParametersAssignment_3_1_1 ) )
            {
            // InternalBCOoL.g:3378:1: ( ( rule__EventRelation__ActualParametersAssignment_3_1_1 ) )
            // InternalBCOoL.g:3379:1: ( rule__EventRelation__ActualParametersAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersAssignment_3_1_1()); 
            }
            // InternalBCOoL.g:3380:1: ( rule__EventRelation__ActualParametersAssignment_3_1_1 )
            // InternalBCOoL.g:3380:2: rule__EventRelation__ActualParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EventRelation__ActualParametersAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3_1__1__Impl"


    // $ANTLR start "rule__ImportLibRule__Group__0"
    // InternalBCOoL.g:3394:1: rule__ImportLibRule__Group__0 : rule__ImportLibRule__Group__0__Impl rule__ImportLibRule__Group__1 ;
    public final void rule__ImportLibRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3398:1: ( rule__ImportLibRule__Group__0__Impl rule__ImportLibRule__Group__1 )
            // InternalBCOoL.g:3399:2: rule__ImportLibRule__Group__0__Impl rule__ImportLibRule__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ImportLibRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportLibRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__Group__0"


    // $ANTLR start "rule__ImportLibRule__Group__0__Impl"
    // InternalBCOoL.g:3406:1: rule__ImportLibRule__Group__0__Impl : ( 'ImportLib' ) ;
    public final void rule__ImportLibRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3410:1: ( ( 'ImportLib' ) )
            // InternalBCOoL.g:3411:1: ( 'ImportLib' )
            {
            // InternalBCOoL.g:3411:1: ( 'ImportLib' )
            // InternalBCOoL.g:3412:1: 'ImportLib'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__Group__0__Impl"


    // $ANTLR start "rule__ImportLibRule__Group__1"
    // InternalBCOoL.g:3425:1: rule__ImportLibRule__Group__1 : rule__ImportLibRule__Group__1__Impl ;
    public final void rule__ImportLibRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3429:1: ( rule__ImportLibRule__Group__1__Impl )
            // InternalBCOoL.g:3430:2: rule__ImportLibRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportLibRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__Group__1"


    // $ANTLR start "rule__ImportLibRule__Group__1__Impl"
    // InternalBCOoL.g:3436:1: rule__ImportLibRule__Group__1__Impl : ( ( rule__ImportLibRule__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportLibRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3440:1: ( ( ( rule__ImportLibRule__ImportURIAssignment_1 ) ) )
            // InternalBCOoL.g:3441:1: ( ( rule__ImportLibRule__ImportURIAssignment_1 ) )
            {
            // InternalBCOoL.g:3441:1: ( ( rule__ImportLibRule__ImportURIAssignment_1 ) )
            // InternalBCOoL.g:3442:1: ( rule__ImportLibRule__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getImportURIAssignment_1()); 
            }
            // InternalBCOoL.g:3443:1: ( rule__ImportLibRule__ImportURIAssignment_1 )
            // InternalBCOoL.g:3443:2: rule__ImportLibRule__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportLibRule__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__Group__1__Impl"


    // $ANTLR start "rule__ImportInterfaceRule__Group__0"
    // InternalBCOoL.g:3457:1: rule__ImportInterfaceRule__Group__0 : rule__ImportInterfaceRule__Group__0__Impl rule__ImportInterfaceRule__Group__1 ;
    public final void rule__ImportInterfaceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3461:1: ( rule__ImportInterfaceRule__Group__0__Impl rule__ImportInterfaceRule__Group__1 )
            // InternalBCOoL.g:3462:2: rule__ImportInterfaceRule__Group__0__Impl rule__ImportInterfaceRule__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ImportInterfaceRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportInterfaceRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__0"


    // $ANTLR start "rule__ImportInterfaceRule__Group__0__Impl"
    // InternalBCOoL.g:3469:1: rule__ImportInterfaceRule__Group__0__Impl : ( 'ImportInterface' ) ;
    public final void rule__ImportInterfaceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3473:1: ( ( 'ImportInterface' ) )
            // InternalBCOoL.g:3474:1: ( 'ImportInterface' )
            {
            // InternalBCOoL.g:3474:1: ( 'ImportInterface' )
            // InternalBCOoL.g:3475:1: 'ImportInterface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__0__Impl"


    // $ANTLR start "rule__ImportInterfaceRule__Group__1"
    // InternalBCOoL.g:3488:1: rule__ImportInterfaceRule__Group__1 : rule__ImportInterfaceRule__Group__1__Impl rule__ImportInterfaceRule__Group__2 ;
    public final void rule__ImportInterfaceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3492:1: ( rule__ImportInterfaceRule__Group__1__Impl rule__ImportInterfaceRule__Group__2 )
            // InternalBCOoL.g:3493:2: rule__ImportInterfaceRule__Group__1__Impl rule__ImportInterfaceRule__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ImportInterfaceRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportInterfaceRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__1"


    // $ANTLR start "rule__ImportInterfaceRule__Group__1__Impl"
    // InternalBCOoL.g:3500:1: rule__ImportInterfaceRule__Group__1__Impl : ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportInterfaceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3504:1: ( ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) ) )
            // InternalBCOoL.g:3505:1: ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) )
            {
            // InternalBCOoL.g:3505:1: ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) )
            // InternalBCOoL.g:3506:1: ( rule__ImportInterfaceRule__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getImportURIAssignment_1()); 
            }
            // InternalBCOoL.g:3507:1: ( rule__ImportInterfaceRule__ImportURIAssignment_1 )
            // InternalBCOoL.g:3507:2: rule__ImportInterfaceRule__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportInterfaceRule__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__1__Impl"


    // $ANTLR start "rule__ImportInterfaceRule__Group__2"
    // InternalBCOoL.g:3517:1: rule__ImportInterfaceRule__Group__2 : rule__ImportInterfaceRule__Group__2__Impl rule__ImportInterfaceRule__Group__3 ;
    public final void rule__ImportInterfaceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3521:1: ( rule__ImportInterfaceRule__Group__2__Impl rule__ImportInterfaceRule__Group__3 )
            // InternalBCOoL.g:3522:2: rule__ImportInterfaceRule__Group__2__Impl rule__ImportInterfaceRule__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ImportInterfaceRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportInterfaceRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__2"


    // $ANTLR start "rule__ImportInterfaceRule__Group__2__Impl"
    // InternalBCOoL.g:3529:1: rule__ImportInterfaceRule__Group__2__Impl : ( 'as' ) ;
    public final void rule__ImportInterfaceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3533:1: ( ( 'as' ) )
            // InternalBCOoL.g:3534:1: ( 'as' )
            {
            // InternalBCOoL.g:3534:1: ( 'as' )
            // InternalBCOoL.g:3535:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__2__Impl"


    // $ANTLR start "rule__ImportInterfaceRule__Group__3"
    // InternalBCOoL.g:3548:1: rule__ImportInterfaceRule__Group__3 : rule__ImportInterfaceRule__Group__3__Impl ;
    public final void rule__ImportInterfaceRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3552:1: ( rule__ImportInterfaceRule__Group__3__Impl )
            // InternalBCOoL.g:3553:2: rule__ImportInterfaceRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportInterfaceRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__3"


    // $ANTLR start "rule__ImportInterfaceRule__Group__3__Impl"
    // InternalBCOoL.g:3559:1: rule__ImportInterfaceRule__Group__3__Impl : ( ( rule__ImportInterfaceRule__NameAssignment_3 ) ) ;
    public final void rule__ImportInterfaceRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3563:1: ( ( ( rule__ImportInterfaceRule__NameAssignment_3 ) ) )
            // InternalBCOoL.g:3564:1: ( ( rule__ImportInterfaceRule__NameAssignment_3 ) )
            {
            // InternalBCOoL.g:3564:1: ( ( rule__ImportInterfaceRule__NameAssignment_3 ) )
            // InternalBCOoL.g:3565:1: ( rule__ImportInterfaceRule__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getNameAssignment_3()); 
            }
            // InternalBCOoL.g:3566:1: ( rule__ImportInterfaceRule__NameAssignment_3 )
            // InternalBCOoL.g:3566:2: rule__ImportInterfaceRule__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ImportInterfaceRule__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__3__Impl"


    // $ANTLR start "rule__GImportStatement__Group__0"
    // InternalBCOoL.g:3587:1: rule__GImportStatement__Group__0 : rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1 ;
    public final void rule__GImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3591:1: ( rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1 )
            // InternalBCOoL.g:3592:2: rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__GImportStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GImportStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__0"


    // $ANTLR start "rule__GImportStatement__Group__0__Impl"
    // InternalBCOoL.g:3599:1: rule__GImportStatement__Group__0__Impl : ( 'import' ) ;
    public final void rule__GImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3603:1: ( ( 'import' ) )
            // InternalBCOoL.g:3604:1: ( 'import' )
            {
            // InternalBCOoL.g:3604:1: ( 'import' )
            // InternalBCOoL.g:3605:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__0__Impl"


    // $ANTLR start "rule__GImportStatement__Group__1"
    // InternalBCOoL.g:3618:1: rule__GImportStatement__Group__1 : rule__GImportStatement__Group__1__Impl ;
    public final void rule__GImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3622:1: ( rule__GImportStatement__Group__1__Impl )
            // InternalBCOoL.g:3623:2: rule__GImportStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GImportStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__1"


    // $ANTLR start "rule__GImportStatement__Group__1__Impl"
    // InternalBCOoL.g:3629:1: rule__GImportStatement__Group__1__Impl : ( ( rule__GImportStatement__ImportURIAssignment_1 ) ) ;
    public final void rule__GImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3633:1: ( ( ( rule__GImportStatement__ImportURIAssignment_1 ) ) )
            // InternalBCOoL.g:3634:1: ( ( rule__GImportStatement__ImportURIAssignment_1 ) )
            {
            // InternalBCOoL.g:3634:1: ( ( rule__GImportStatement__ImportURIAssignment_1 ) )
            // InternalBCOoL.g:3635:1: ( rule__GImportStatement__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportURIAssignment_1()); 
            }
            // InternalBCOoL.g:3636:1: ( rule__GImportStatement__ImportURIAssignment_1 )
            // InternalBCOoL.g:3636:2: rule__GImportStatement__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GImportStatement__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__1__Impl"


    // $ANTLR start "rule__GOrExpression__Group__0"
    // InternalBCOoL.g:3650:1: rule__GOrExpression__Group__0 : rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1 ;
    public final void rule__GOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3654:1: ( rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1 )
            // InternalBCOoL.g:3655:2: rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__GOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GOrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__0"


    // $ANTLR start "rule__GOrExpression__Group__0__Impl"
    // InternalBCOoL.g:3662:1: rule__GOrExpression__Group__0__Impl : ( ruleGXorExpression ) ;
    public final void rule__GOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3666:1: ( ( ruleGXorExpression ) )
            // InternalBCOoL.g:3667:1: ( ruleGXorExpression )
            {
            // InternalBCOoL.g:3667:1: ( ruleGXorExpression )
            // InternalBCOoL.g:3668:1: ruleGXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__0__Impl"


    // $ANTLR start "rule__GOrExpression__Group__1"
    // InternalBCOoL.g:3679:1: rule__GOrExpression__Group__1 : rule__GOrExpression__Group__1__Impl ;
    public final void rule__GOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3683:1: ( rule__GOrExpression__Group__1__Impl )
            // InternalBCOoL.g:3684:2: rule__GOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GOrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__1"


    // $ANTLR start "rule__GOrExpression__Group__1__Impl"
    // InternalBCOoL.g:3690:1: rule__GOrExpression__Group__1__Impl : ( ( rule__GOrExpression__Group_1__0 )* ) ;
    public final void rule__GOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3694:1: ( ( ( rule__GOrExpression__Group_1__0 )* ) )
            // InternalBCOoL.g:3695:1: ( ( rule__GOrExpression__Group_1__0 )* )
            {
            // InternalBCOoL.g:3695:1: ( ( rule__GOrExpression__Group_1__0 )* )
            // InternalBCOoL.g:3696:1: ( rule__GOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGroup_1()); 
            }
            // InternalBCOoL.g:3697:1: ( rule__GOrExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBCOoL.g:3697:2: rule__GOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__GOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__1__Impl"


    // $ANTLR start "rule__GOrExpression__Group_1__0"
    // InternalBCOoL.g:3711:1: rule__GOrExpression__Group_1__0 : rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1 ;
    public final void rule__GOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3715:1: ( rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1 )
            // InternalBCOoL.g:3716:2: rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__GOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GOrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__0"


    // $ANTLR start "rule__GOrExpression__Group_1__0__Impl"
    // InternalBCOoL.g:3723:1: rule__GOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3727:1: ( ( () ) )
            // InternalBCOoL.g:3728:1: ( () )
            {
            // InternalBCOoL.g:3728:1: ( () )
            // InternalBCOoL.g:3729:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0()); 
            }
            // InternalBCOoL.g:3730:1: ()
            // InternalBCOoL.g:3732:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GOrExpression__Group_1__1"
    // InternalBCOoL.g:3742:1: rule__GOrExpression__Group_1__1 : rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2 ;
    public final void rule__GOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3746:1: ( rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2 )
            // InternalBCOoL.g:3747:2: rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__GOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GOrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__1"


    // $ANTLR start "rule__GOrExpression__Group_1__1__Impl"
    // InternalBCOoL.g:3754:1: rule__GOrExpression__Group_1__1__Impl : ( ( rule__GOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3758:1: ( ( ( rule__GOrExpression__OperatorAssignment_1_1 ) ) )
            // InternalBCOoL.g:3759:1: ( ( rule__GOrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalBCOoL.g:3759:1: ( ( rule__GOrExpression__OperatorAssignment_1_1 ) )
            // InternalBCOoL.g:3760:1: ( rule__GOrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalBCOoL.g:3761:1: ( rule__GOrExpression__OperatorAssignment_1_1 )
            // InternalBCOoL.g:3761:2: rule__GOrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GOrExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GOrExpression__Group_1__2"
    // InternalBCOoL.g:3771:1: rule__GOrExpression__Group_1__2 : rule__GOrExpression__Group_1__2__Impl ;
    public final void rule__GOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3775:1: ( rule__GOrExpression__Group_1__2__Impl )
            // InternalBCOoL.g:3776:2: rule__GOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GOrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__2"


    // $ANTLR start "rule__GOrExpression__Group_1__2__Impl"
    // InternalBCOoL.g:3782:1: rule__GOrExpression__Group_1__2__Impl : ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3786:1: ( ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) ) )
            // InternalBCOoL.g:3787:1: ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) )
            {
            // InternalBCOoL.g:3787:1: ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) )
            // InternalBCOoL.g:3788:1: ( rule__GOrExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalBCOoL.g:3789:1: ( rule__GOrExpression__RightOperandAssignment_1_2 )
            // InternalBCOoL.g:3789:2: rule__GOrExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GOrExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GXorExpression__Group__0"
    // InternalBCOoL.g:3805:1: rule__GXorExpression__Group__0 : rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1 ;
    public final void rule__GXorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3809:1: ( rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1 )
            // InternalBCOoL.g:3810:2: rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__GXorExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GXorExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__0"


    // $ANTLR start "rule__GXorExpression__Group__0__Impl"
    // InternalBCOoL.g:3817:1: rule__GXorExpression__Group__0__Impl : ( ruleGAndExpression ) ;
    public final void rule__GXorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3821:1: ( ( ruleGAndExpression ) )
            // InternalBCOoL.g:3822:1: ( ruleGAndExpression )
            {
            // InternalBCOoL.g:3822:1: ( ruleGAndExpression )
            // InternalBCOoL.g:3823:1: ruleGAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__0__Impl"


    // $ANTLR start "rule__GXorExpression__Group__1"
    // InternalBCOoL.g:3834:1: rule__GXorExpression__Group__1 : rule__GXorExpression__Group__1__Impl ;
    public final void rule__GXorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3838:1: ( rule__GXorExpression__Group__1__Impl )
            // InternalBCOoL.g:3839:2: rule__GXorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GXorExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__1"


    // $ANTLR start "rule__GXorExpression__Group__1__Impl"
    // InternalBCOoL.g:3845:1: rule__GXorExpression__Group__1__Impl : ( ( rule__GXorExpression__Group_1__0 )* ) ;
    public final void rule__GXorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3849:1: ( ( ( rule__GXorExpression__Group_1__0 )* ) )
            // InternalBCOoL.g:3850:1: ( ( rule__GXorExpression__Group_1__0 )* )
            {
            // InternalBCOoL.g:3850:1: ( ( rule__GXorExpression__Group_1__0 )* )
            // InternalBCOoL.g:3851:1: ( rule__GXorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGroup_1()); 
            }
            // InternalBCOoL.g:3852:1: ( rule__GXorExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==14) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBCOoL.g:3852:2: rule__GXorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__GXorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__1__Impl"


    // $ANTLR start "rule__GXorExpression__Group_1__0"
    // InternalBCOoL.g:3866:1: rule__GXorExpression__Group_1__0 : rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1 ;
    public final void rule__GXorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3870:1: ( rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1 )
            // InternalBCOoL.g:3871:2: rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__GXorExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GXorExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__0"


    // $ANTLR start "rule__GXorExpression__Group_1__0__Impl"
    // InternalBCOoL.g:3878:1: rule__GXorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GXorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3882:1: ( ( () ) )
            // InternalBCOoL.g:3883:1: ( () )
            {
            // InternalBCOoL.g:3883:1: ( () )
            // InternalBCOoL.g:3884:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()); 
            }
            // InternalBCOoL.g:3885:1: ()
            // InternalBCOoL.g:3887:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GXorExpression__Group_1__1"
    // InternalBCOoL.g:3897:1: rule__GXorExpression__Group_1__1 : rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2 ;
    public final void rule__GXorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3901:1: ( rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2 )
            // InternalBCOoL.g:3902:2: rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__GXorExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GXorExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__1"


    // $ANTLR start "rule__GXorExpression__Group_1__1__Impl"
    // InternalBCOoL.g:3909:1: rule__GXorExpression__Group_1__1__Impl : ( ( rule__GXorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GXorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3913:1: ( ( ( rule__GXorExpression__OperatorAssignment_1_1 ) ) )
            // InternalBCOoL.g:3914:1: ( ( rule__GXorExpression__OperatorAssignment_1_1 ) )
            {
            // InternalBCOoL.g:3914:1: ( ( rule__GXorExpression__OperatorAssignment_1_1 ) )
            // InternalBCOoL.g:3915:1: ( rule__GXorExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalBCOoL.g:3916:1: ( rule__GXorExpression__OperatorAssignment_1_1 )
            // InternalBCOoL.g:3916:2: rule__GXorExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GXorExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GXorExpression__Group_1__2"
    // InternalBCOoL.g:3926:1: rule__GXorExpression__Group_1__2 : rule__GXorExpression__Group_1__2__Impl ;
    public final void rule__GXorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3930:1: ( rule__GXorExpression__Group_1__2__Impl )
            // InternalBCOoL.g:3931:2: rule__GXorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GXorExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__2"


    // $ANTLR start "rule__GXorExpression__Group_1__2__Impl"
    // InternalBCOoL.g:3937:1: rule__GXorExpression__Group_1__2__Impl : ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GXorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3941:1: ( ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) ) )
            // InternalBCOoL.g:3942:1: ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) )
            {
            // InternalBCOoL.g:3942:1: ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) )
            // InternalBCOoL.g:3943:1: ( rule__GXorExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalBCOoL.g:3944:1: ( rule__GXorExpression__RightOperandAssignment_1_2 )
            // InternalBCOoL.g:3944:2: rule__GXorExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GXorExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GAndExpression__Group__0"
    // InternalBCOoL.g:3960:1: rule__GAndExpression__Group__0 : rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1 ;
    public final void rule__GAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3964:1: ( rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1 )
            // InternalBCOoL.g:3965:2: rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__GAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GAndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__0"


    // $ANTLR start "rule__GAndExpression__Group__0__Impl"
    // InternalBCOoL.g:3972:1: rule__GAndExpression__Group__0__Impl : ( ruleGEqualityExpression ) ;
    public final void rule__GAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3976:1: ( ( ruleGEqualityExpression ) )
            // InternalBCOoL.g:3977:1: ( ruleGEqualityExpression )
            {
            // InternalBCOoL.g:3977:1: ( ruleGEqualityExpression )
            // InternalBCOoL.g:3978:1: ruleGEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__0__Impl"


    // $ANTLR start "rule__GAndExpression__Group__1"
    // InternalBCOoL.g:3989:1: rule__GAndExpression__Group__1 : rule__GAndExpression__Group__1__Impl ;
    public final void rule__GAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:3993:1: ( rule__GAndExpression__Group__1__Impl )
            // InternalBCOoL.g:3994:2: rule__GAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GAndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__1"


    // $ANTLR start "rule__GAndExpression__Group__1__Impl"
    // InternalBCOoL.g:4000:1: rule__GAndExpression__Group__1__Impl : ( ( rule__GAndExpression__Group_1__0 )* ) ;
    public final void rule__GAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4004:1: ( ( ( rule__GAndExpression__Group_1__0 )* ) )
            // InternalBCOoL.g:4005:1: ( ( rule__GAndExpression__Group_1__0 )* )
            {
            // InternalBCOoL.g:4005:1: ( ( rule__GAndExpression__Group_1__0 )* )
            // InternalBCOoL.g:4006:1: ( rule__GAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGroup_1()); 
            }
            // InternalBCOoL.g:4007:1: ( rule__GAndExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==13) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBCOoL.g:4007:2: rule__GAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__GAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__1__Impl"


    // $ANTLR start "rule__GAndExpression__Group_1__0"
    // InternalBCOoL.g:4021:1: rule__GAndExpression__Group_1__0 : rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1 ;
    public final void rule__GAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4025:1: ( rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1 )
            // InternalBCOoL.g:4026:2: rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__GAndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GAndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__0"


    // $ANTLR start "rule__GAndExpression__Group_1__0__Impl"
    // InternalBCOoL.g:4033:1: rule__GAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4037:1: ( ( () ) )
            // InternalBCOoL.g:4038:1: ( () )
            {
            // InternalBCOoL.g:4038:1: ( () )
            // InternalBCOoL.g:4039:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0()); 
            }
            // InternalBCOoL.g:4040:1: ()
            // InternalBCOoL.g:4042:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GAndExpression__Group_1__1"
    // InternalBCOoL.g:4052:1: rule__GAndExpression__Group_1__1 : rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2 ;
    public final void rule__GAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4056:1: ( rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2 )
            // InternalBCOoL.g:4057:2: rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__GAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GAndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__1"


    // $ANTLR start "rule__GAndExpression__Group_1__1__Impl"
    // InternalBCOoL.g:4064:1: rule__GAndExpression__Group_1__1__Impl : ( ( rule__GAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4068:1: ( ( ( rule__GAndExpression__OperatorAssignment_1_1 ) ) )
            // InternalBCOoL.g:4069:1: ( ( rule__GAndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalBCOoL.g:4069:1: ( ( rule__GAndExpression__OperatorAssignment_1_1 ) )
            // InternalBCOoL.g:4070:1: ( rule__GAndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalBCOoL.g:4071:1: ( rule__GAndExpression__OperatorAssignment_1_1 )
            // InternalBCOoL.g:4071:2: rule__GAndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GAndExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GAndExpression__Group_1__2"
    // InternalBCOoL.g:4081:1: rule__GAndExpression__Group_1__2 : rule__GAndExpression__Group_1__2__Impl ;
    public final void rule__GAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4085:1: ( rule__GAndExpression__Group_1__2__Impl )
            // InternalBCOoL.g:4086:2: rule__GAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GAndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__2"


    // $ANTLR start "rule__GAndExpression__Group_1__2__Impl"
    // InternalBCOoL.g:4092:1: rule__GAndExpression__Group_1__2__Impl : ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4096:1: ( ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) ) )
            // InternalBCOoL.g:4097:1: ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) )
            {
            // InternalBCOoL.g:4097:1: ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) )
            // InternalBCOoL.g:4098:1: ( rule__GAndExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalBCOoL.g:4099:1: ( rule__GAndExpression__RightOperandAssignment_1_2 )
            // InternalBCOoL.g:4099:2: rule__GAndExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GAndExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group__0"
    // InternalBCOoL.g:4115:1: rule__GEqualityExpression__Group__0 : rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1 ;
    public final void rule__GEqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4119:1: ( rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1 )
            // InternalBCOoL.g:4120:2: rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__GEqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GEqualityExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__0"


    // $ANTLR start "rule__GEqualityExpression__Group__0__Impl"
    // InternalBCOoL.g:4127:1: rule__GEqualityExpression__Group__0__Impl : ( ruleGRelationExpression ) ;
    public final void rule__GEqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4131:1: ( ( ruleGRelationExpression ) )
            // InternalBCOoL.g:4132:1: ( ruleGRelationExpression )
            {
            // InternalBCOoL.g:4132:1: ( ruleGRelationExpression )
            // InternalBCOoL.g:4133:1: ruleGRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group__1"
    // InternalBCOoL.g:4144:1: rule__GEqualityExpression__Group__1 : rule__GEqualityExpression__Group__1__Impl ;
    public final void rule__GEqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4148:1: ( rule__GEqualityExpression__Group__1__Impl )
            // InternalBCOoL.g:4149:2: rule__GEqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GEqualityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__1"


    // $ANTLR start "rule__GEqualityExpression__Group__1__Impl"
    // InternalBCOoL.g:4155:1: rule__GEqualityExpression__Group__1__Impl : ( ( rule__GEqualityExpression__Group_1__0 )* ) ;
    public final void rule__GEqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4159:1: ( ( ( rule__GEqualityExpression__Group_1__0 )* ) )
            // InternalBCOoL.g:4160:1: ( ( rule__GEqualityExpression__Group_1__0 )* )
            {
            // InternalBCOoL.g:4160:1: ( ( rule__GEqualityExpression__Group_1__0 )* )
            // InternalBCOoL.g:4161:1: ( rule__GEqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalBCOoL.g:4162:1: ( rule__GEqualityExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=18 && LA31_0<=19)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBCOoL.g:4162:2: rule__GEqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__GEqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group_1__0"
    // InternalBCOoL.g:4176:1: rule__GEqualityExpression__Group_1__0 : rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1 ;
    public final void rule__GEqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4180:1: ( rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1 )
            // InternalBCOoL.g:4181:2: rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__GEqualityExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GEqualityExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__0"


    // $ANTLR start "rule__GEqualityExpression__Group_1__0__Impl"
    // InternalBCOoL.g:4188:1: rule__GEqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GEqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4192:1: ( ( () ) )
            // InternalBCOoL.g:4193:1: ( () )
            {
            // InternalBCOoL.g:4193:1: ( () )
            // InternalBCOoL.g:4194:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0()); 
            }
            // InternalBCOoL.g:4195:1: ()
            // InternalBCOoL.g:4197:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group_1__1"
    // InternalBCOoL.g:4207:1: rule__GEqualityExpression__Group_1__1 : rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2 ;
    public final void rule__GEqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4211:1: ( rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2 )
            // InternalBCOoL.g:4212:2: rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__GEqualityExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GEqualityExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__1"


    // $ANTLR start "rule__GEqualityExpression__Group_1__1__Impl"
    // InternalBCOoL.g:4219:1: rule__GEqualityExpression__Group_1__1__Impl : ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GEqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4223:1: ( ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalBCOoL.g:4224:1: ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalBCOoL.g:4224:1: ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) )
            // InternalBCOoL.g:4225:1: ( rule__GEqualityExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalBCOoL.g:4226:1: ( rule__GEqualityExpression__OperatorAssignment_1_1 )
            // InternalBCOoL.g:4226:2: rule__GEqualityExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GEqualityExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group_1__2"
    // InternalBCOoL.g:4236:1: rule__GEqualityExpression__Group_1__2 : rule__GEqualityExpression__Group_1__2__Impl ;
    public final void rule__GEqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4240:1: ( rule__GEqualityExpression__Group_1__2__Impl )
            // InternalBCOoL.g:4241:2: rule__GEqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GEqualityExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__2"


    // $ANTLR start "rule__GEqualityExpression__Group_1__2__Impl"
    // InternalBCOoL.g:4247:1: rule__GEqualityExpression__Group_1__2__Impl : ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GEqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4251:1: ( ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) ) )
            // InternalBCOoL.g:4252:1: ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) )
            {
            // InternalBCOoL.g:4252:1: ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) )
            // InternalBCOoL.g:4253:1: ( rule__GEqualityExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalBCOoL.g:4254:1: ( rule__GEqualityExpression__RightOperandAssignment_1_2 )
            // InternalBCOoL.g:4254:2: rule__GEqualityExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GEqualityExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GRelationExpression__Group__0"
    // InternalBCOoL.g:4270:1: rule__GRelationExpression__Group__0 : rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1 ;
    public final void rule__GRelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4274:1: ( rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1 )
            // InternalBCOoL.g:4275:2: rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__GRelationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GRelationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__0"


    // $ANTLR start "rule__GRelationExpression__Group__0__Impl"
    // InternalBCOoL.g:4282:1: rule__GRelationExpression__Group__0__Impl : ( ruleGAdditionExpression ) ;
    public final void rule__GRelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4286:1: ( ( ruleGAdditionExpression ) )
            // InternalBCOoL.g:4287:1: ( ruleGAdditionExpression )
            {
            // InternalBCOoL.g:4287:1: ( ruleGAdditionExpression )
            // InternalBCOoL.g:4288:1: ruleGAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__0__Impl"


    // $ANTLR start "rule__GRelationExpression__Group__1"
    // InternalBCOoL.g:4299:1: rule__GRelationExpression__Group__1 : rule__GRelationExpression__Group__1__Impl ;
    public final void rule__GRelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4303:1: ( rule__GRelationExpression__Group__1__Impl )
            // InternalBCOoL.g:4304:2: rule__GRelationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GRelationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__1"


    // $ANTLR start "rule__GRelationExpression__Group__1__Impl"
    // InternalBCOoL.g:4310:1: rule__GRelationExpression__Group__1__Impl : ( ( rule__GRelationExpression__Group_1__0 )* ) ;
    public final void rule__GRelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4314:1: ( ( ( rule__GRelationExpression__Group_1__0 )* ) )
            // InternalBCOoL.g:4315:1: ( ( rule__GRelationExpression__Group_1__0 )* )
            {
            // InternalBCOoL.g:4315:1: ( ( rule__GRelationExpression__Group_1__0 )* )
            // InternalBCOoL.g:4316:1: ( rule__GRelationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGroup_1()); 
            }
            // InternalBCOoL.g:4317:1: ( rule__GRelationExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=20 && LA32_0<=23)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBCOoL.g:4317:2: rule__GRelationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__GRelationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__1__Impl"


    // $ANTLR start "rule__GRelationExpression__Group_1__0"
    // InternalBCOoL.g:4331:1: rule__GRelationExpression__Group_1__0 : rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1 ;
    public final void rule__GRelationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4335:1: ( rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1 )
            // InternalBCOoL.g:4336:2: rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__GRelationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GRelationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__0"


    // $ANTLR start "rule__GRelationExpression__Group_1__0__Impl"
    // InternalBCOoL.g:4343:1: rule__GRelationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GRelationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4347:1: ( ( () ) )
            // InternalBCOoL.g:4348:1: ( () )
            {
            // InternalBCOoL.g:4348:1: ( () )
            // InternalBCOoL.g:4349:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0()); 
            }
            // InternalBCOoL.g:4350:1: ()
            // InternalBCOoL.g:4352:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GRelationExpression__Group_1__1"
    // InternalBCOoL.g:4362:1: rule__GRelationExpression__Group_1__1 : rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2 ;
    public final void rule__GRelationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4366:1: ( rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2 )
            // InternalBCOoL.g:4367:2: rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__GRelationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GRelationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__1"


    // $ANTLR start "rule__GRelationExpression__Group_1__1__Impl"
    // InternalBCOoL.g:4374:1: rule__GRelationExpression__Group_1__1__Impl : ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GRelationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4378:1: ( ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) ) )
            // InternalBCOoL.g:4379:1: ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalBCOoL.g:4379:1: ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) )
            // InternalBCOoL.g:4380:1: ( rule__GRelationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalBCOoL.g:4381:1: ( rule__GRelationExpression__OperatorAssignment_1_1 )
            // InternalBCOoL.g:4381:2: rule__GRelationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GRelationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GRelationExpression__Group_1__2"
    // InternalBCOoL.g:4391:1: rule__GRelationExpression__Group_1__2 : rule__GRelationExpression__Group_1__2__Impl ;
    public final void rule__GRelationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4395:1: ( rule__GRelationExpression__Group_1__2__Impl )
            // InternalBCOoL.g:4396:2: rule__GRelationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GRelationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__2"


    // $ANTLR start "rule__GRelationExpression__Group_1__2__Impl"
    // InternalBCOoL.g:4402:1: rule__GRelationExpression__Group_1__2__Impl : ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GRelationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4406:1: ( ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) ) )
            // InternalBCOoL.g:4407:1: ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) )
            {
            // InternalBCOoL.g:4407:1: ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) )
            // InternalBCOoL.g:4408:1: ( rule__GRelationExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalBCOoL.g:4409:1: ( rule__GRelationExpression__RightOperandAssignment_1_2 )
            // InternalBCOoL.g:4409:2: rule__GRelationExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GRelationExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group__0"
    // InternalBCOoL.g:4425:1: rule__GAdditionExpression__Group__0 : rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1 ;
    public final void rule__GAdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4429:1: ( rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1 )
            // InternalBCOoL.g:4430:2: rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__GAdditionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GAdditionExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__0"


    // $ANTLR start "rule__GAdditionExpression__Group__0__Impl"
    // InternalBCOoL.g:4437:1: rule__GAdditionExpression__Group__0__Impl : ( ruleGMultiplicationExpression ) ;
    public final void rule__GAdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4441:1: ( ( ruleGMultiplicationExpression ) )
            // InternalBCOoL.g:4442:1: ( ruleGMultiplicationExpression )
            {
            // InternalBCOoL.g:4442:1: ( ruleGMultiplicationExpression )
            // InternalBCOoL.g:4443:1: ruleGMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group__1"
    // InternalBCOoL.g:4454:1: rule__GAdditionExpression__Group__1 : rule__GAdditionExpression__Group__1__Impl ;
    public final void rule__GAdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4458:1: ( rule__GAdditionExpression__Group__1__Impl )
            // InternalBCOoL.g:4459:2: rule__GAdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GAdditionExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__1"


    // $ANTLR start "rule__GAdditionExpression__Group__1__Impl"
    // InternalBCOoL.g:4465:1: rule__GAdditionExpression__Group__1__Impl : ( ( rule__GAdditionExpression__Group_1__0 )* ) ;
    public final void rule__GAdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4469:1: ( ( ( rule__GAdditionExpression__Group_1__0 )* ) )
            // InternalBCOoL.g:4470:1: ( ( rule__GAdditionExpression__Group_1__0 )* )
            {
            // InternalBCOoL.g:4470:1: ( ( rule__GAdditionExpression__Group_1__0 )* )
            // InternalBCOoL.g:4471:1: ( rule__GAdditionExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGroup_1()); 
            }
            // InternalBCOoL.g:4472:1: ( rule__GAdditionExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=24 && LA33_0<=25)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBCOoL.g:4472:2: rule__GAdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__GAdditionExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group_1__0"
    // InternalBCOoL.g:4486:1: rule__GAdditionExpression__Group_1__0 : rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1 ;
    public final void rule__GAdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4490:1: ( rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1 )
            // InternalBCOoL.g:4491:2: rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__GAdditionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GAdditionExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__0"


    // $ANTLR start "rule__GAdditionExpression__Group_1__0__Impl"
    // InternalBCOoL.g:4498:1: rule__GAdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GAdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4502:1: ( ( () ) )
            // InternalBCOoL.g:4503:1: ( () )
            {
            // InternalBCOoL.g:4503:1: ( () )
            // InternalBCOoL.g:4504:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0()); 
            }
            // InternalBCOoL.g:4505:1: ()
            // InternalBCOoL.g:4507:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group_1__1"
    // InternalBCOoL.g:4517:1: rule__GAdditionExpression__Group_1__1 : rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2 ;
    public final void rule__GAdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4521:1: ( rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2 )
            // InternalBCOoL.g:4522:2: rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__GAdditionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GAdditionExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__1"


    // $ANTLR start "rule__GAdditionExpression__Group_1__1__Impl"
    // InternalBCOoL.g:4529:1: rule__GAdditionExpression__Group_1__1__Impl : ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GAdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4533:1: ( ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalBCOoL.g:4534:1: ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalBCOoL.g:4534:1: ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) )
            // InternalBCOoL.g:4535:1: ( rule__GAdditionExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalBCOoL.g:4536:1: ( rule__GAdditionExpression__OperatorAssignment_1_1 )
            // InternalBCOoL.g:4536:2: rule__GAdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GAdditionExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group_1__2"
    // InternalBCOoL.g:4546:1: rule__GAdditionExpression__Group_1__2 : rule__GAdditionExpression__Group_1__2__Impl ;
    public final void rule__GAdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4550:1: ( rule__GAdditionExpression__Group_1__2__Impl )
            // InternalBCOoL.g:4551:2: rule__GAdditionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GAdditionExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__2"


    // $ANTLR start "rule__GAdditionExpression__Group_1__2__Impl"
    // InternalBCOoL.g:4557:1: rule__GAdditionExpression__Group_1__2__Impl : ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GAdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4561:1: ( ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) ) )
            // InternalBCOoL.g:4562:1: ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) )
            {
            // InternalBCOoL.g:4562:1: ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) )
            // InternalBCOoL.g:4563:1: ( rule__GAdditionExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalBCOoL.g:4564:1: ( rule__GAdditionExpression__RightOperandAssignment_1_2 )
            // InternalBCOoL.g:4564:2: rule__GAdditionExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GAdditionExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group__0"
    // InternalBCOoL.g:4580:1: rule__GMultiplicationExpression__Group__0 : rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1 ;
    public final void rule__GMultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4584:1: ( rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1 )
            // InternalBCOoL.g:4585:2: rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__GMultiplicationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GMultiplicationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__0"


    // $ANTLR start "rule__GMultiplicationExpression__Group__0__Impl"
    // InternalBCOoL.g:4592:1: rule__GMultiplicationExpression__Group__0__Impl : ( ruleGNegationExpression ) ;
    public final void rule__GMultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4596:1: ( ( ruleGNegationExpression ) )
            // InternalBCOoL.g:4597:1: ( ruleGNegationExpression )
            {
            // InternalBCOoL.g:4597:1: ( ruleGNegationExpression )
            // InternalBCOoL.g:4598:1: ruleGNegationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__0__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group__1"
    // InternalBCOoL.g:4609:1: rule__GMultiplicationExpression__Group__1 : rule__GMultiplicationExpression__Group__1__Impl ;
    public final void rule__GMultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4613:1: ( rule__GMultiplicationExpression__Group__1__Impl )
            // InternalBCOoL.g:4614:2: rule__GMultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GMultiplicationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__1"


    // $ANTLR start "rule__GMultiplicationExpression__Group__1__Impl"
    // InternalBCOoL.g:4620:1: rule__GMultiplicationExpression__Group__1__Impl : ( ( rule__GMultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__GMultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4624:1: ( ( ( rule__GMultiplicationExpression__Group_1__0 )* ) )
            // InternalBCOoL.g:4625:1: ( ( rule__GMultiplicationExpression__Group_1__0 )* )
            {
            // InternalBCOoL.g:4625:1: ( ( rule__GMultiplicationExpression__Group_1__0 )* )
            // InternalBCOoL.g:4626:1: ( rule__GMultiplicationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGroup_1()); 
            }
            // InternalBCOoL.g:4627:1: ( rule__GMultiplicationExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=26 && LA34_0<=27)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBCOoL.g:4627:2: rule__GMultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__GMultiplicationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__1__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__0"
    // InternalBCOoL.g:4641:1: rule__GMultiplicationExpression__Group_1__0 : rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1 ;
    public final void rule__GMultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4645:1: ( rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1 )
            // InternalBCOoL.g:4646:2: rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__GMultiplicationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GMultiplicationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__0__Impl"
    // InternalBCOoL.g:4653:1: rule__GMultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GMultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4657:1: ( ( () ) )
            // InternalBCOoL.g:4658:1: ( () )
            {
            // InternalBCOoL.g:4658:1: ( () )
            // InternalBCOoL.g:4659:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0()); 
            }
            // InternalBCOoL.g:4660:1: ()
            // InternalBCOoL.g:4662:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__1"
    // InternalBCOoL.g:4672:1: rule__GMultiplicationExpression__Group_1__1 : rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2 ;
    public final void rule__GMultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4676:1: ( rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2 )
            // InternalBCOoL.g:4677:2: rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__GMultiplicationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GMultiplicationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__1__Impl"
    // InternalBCOoL.g:4684:1: rule__GMultiplicationExpression__Group_1__1__Impl : ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GMultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4688:1: ( ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // InternalBCOoL.g:4689:1: ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalBCOoL.g:4689:1: ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) )
            // InternalBCOoL.g:4690:1: ( rule__GMultiplicationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalBCOoL.g:4691:1: ( rule__GMultiplicationExpression__OperatorAssignment_1_1 )
            // InternalBCOoL.g:4691:2: rule__GMultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GMultiplicationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__2"
    // InternalBCOoL.g:4701:1: rule__GMultiplicationExpression__Group_1__2 : rule__GMultiplicationExpression__Group_1__2__Impl ;
    public final void rule__GMultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4705:1: ( rule__GMultiplicationExpression__Group_1__2__Impl )
            // InternalBCOoL.g:4706:2: rule__GMultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GMultiplicationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__2"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__2__Impl"
    // InternalBCOoL.g:4712:1: rule__GMultiplicationExpression__Group_1__2__Impl : ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GMultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4716:1: ( ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) ) )
            // InternalBCOoL.g:4717:1: ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) )
            {
            // InternalBCOoL.g:4717:1: ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) )
            // InternalBCOoL.g:4718:1: ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalBCOoL.g:4719:1: ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 )
            // InternalBCOoL.g:4719:2: rule__GMultiplicationExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GMultiplicationExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GNegationExpression__Group_1__0"
    // InternalBCOoL.g:4735:1: rule__GNegationExpression__Group_1__0 : rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1 ;
    public final void rule__GNegationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4739:1: ( rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1 )
            // InternalBCOoL.g:4740:2: rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__GNegationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GNegationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__0"


    // $ANTLR start "rule__GNegationExpression__Group_1__0__Impl"
    // InternalBCOoL.g:4747:1: rule__GNegationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GNegationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4751:1: ( ( () ) )
            // InternalBCOoL.g:4752:1: ( () )
            {
            // InternalBCOoL.g:4752:1: ( () )
            // InternalBCOoL.g:4753:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0()); 
            }
            // InternalBCOoL.g:4754:1: ()
            // InternalBCOoL.g:4756:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GNegationExpression__Group_1__1"
    // InternalBCOoL.g:4766:1: rule__GNegationExpression__Group_1__1 : rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2 ;
    public final void rule__GNegationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4770:1: ( rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2 )
            // InternalBCOoL.g:4771:2: rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2
            {
            pushFollow(FOLLOW_42);
            rule__GNegationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GNegationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__1"


    // $ANTLR start "rule__GNegationExpression__Group_1__1__Impl"
    // InternalBCOoL.g:4778:1: rule__GNegationExpression__Group_1__1__Impl : ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GNegationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4782:1: ( ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) ) )
            // InternalBCOoL.g:4783:1: ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalBCOoL.g:4783:1: ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) )
            // InternalBCOoL.g:4784:1: ( rule__GNegationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalBCOoL.g:4785:1: ( rule__GNegationExpression__OperatorAssignment_1_1 )
            // InternalBCOoL.g:4785:2: rule__GNegationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GNegationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GNegationExpression__Group_1__2"
    // InternalBCOoL.g:4795:1: rule__GNegationExpression__Group_1__2 : rule__GNegationExpression__Group_1__2__Impl ;
    public final void rule__GNegationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4799:1: ( rule__GNegationExpression__Group_1__2__Impl )
            // InternalBCOoL.g:4800:2: rule__GNegationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GNegationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__2"


    // $ANTLR start "rule__GNegationExpression__Group_1__2__Impl"
    // InternalBCOoL.g:4806:1: rule__GNegationExpression__Group_1__2__Impl : ( ( rule__GNegationExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__GNegationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4810:1: ( ( ( rule__GNegationExpression__OperandAssignment_1_2 ) ) )
            // InternalBCOoL.g:4811:1: ( ( rule__GNegationExpression__OperandAssignment_1_2 ) )
            {
            // InternalBCOoL.g:4811:1: ( ( rule__GNegationExpression__OperandAssignment_1_2 ) )
            // InternalBCOoL.g:4812:1: ( rule__GNegationExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalBCOoL.g:4813:1: ( rule__GNegationExpression__OperandAssignment_1_2 )
            // InternalBCOoL.g:4813:2: rule__GNegationExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GNegationExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group__0"
    // InternalBCOoL.g:4829:1: rule__GNavigationExpression__Group__0 : rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1 ;
    public final void rule__GNavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4833:1: ( rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1 )
            // InternalBCOoL.g:4834:2: rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__GNavigationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GNavigationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__0"


    // $ANTLR start "rule__GNavigationExpression__Group__0__Impl"
    // InternalBCOoL.g:4841:1: rule__GNavigationExpression__Group__0__Impl : ( ruleGReferenceExpression ) ;
    public final void rule__GNavigationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4845:1: ( ( ruleGReferenceExpression ) )
            // InternalBCOoL.g:4846:1: ( ruleGReferenceExpression )
            {
            // InternalBCOoL.g:4846:1: ( ruleGReferenceExpression )
            // InternalBCOoL.g:4847:1: ruleGReferenceExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__0__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group__1"
    // InternalBCOoL.g:4858:1: rule__GNavigationExpression__Group__1 : rule__GNavigationExpression__Group__1__Impl ;
    public final void rule__GNavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4862:1: ( rule__GNavigationExpression__Group__1__Impl )
            // InternalBCOoL.g:4863:2: rule__GNavigationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GNavigationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__1"


    // $ANTLR start "rule__GNavigationExpression__Group__1__Impl"
    // InternalBCOoL.g:4869:1: rule__GNavigationExpression__Group__1__Impl : ( ( rule__GNavigationExpression__Group_1__0 )* ) ;
    public final void rule__GNavigationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4873:1: ( ( ( rule__GNavigationExpression__Group_1__0 )* ) )
            // InternalBCOoL.g:4874:1: ( ( rule__GNavigationExpression__Group_1__0 )* )
            {
            // InternalBCOoL.g:4874:1: ( ( rule__GNavigationExpression__Group_1__0 )* )
            // InternalBCOoL.g:4875:1: ( rule__GNavigationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGroup_1()); 
            }
            // InternalBCOoL.g:4876:1: ( rule__GNavigationExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=16 && LA35_0<=17)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBCOoL.g:4876:2: rule__GNavigationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__GNavigationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__1__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group_1__0"
    // InternalBCOoL.g:4890:1: rule__GNavigationExpression__Group_1__0 : rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1 ;
    public final void rule__GNavigationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4894:1: ( rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1 )
            // InternalBCOoL.g:4895:2: rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__GNavigationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GNavigationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__0"


    // $ANTLR start "rule__GNavigationExpression__Group_1__0__Impl"
    // InternalBCOoL.g:4902:1: rule__GNavigationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GNavigationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4906:1: ( ( () ) )
            // InternalBCOoL.g:4907:1: ( () )
            {
            // InternalBCOoL.g:4907:1: ( () )
            // InternalBCOoL.g:4908:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0()); 
            }
            // InternalBCOoL.g:4909:1: ()
            // InternalBCOoL.g:4911:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group_1__1"
    // InternalBCOoL.g:4921:1: rule__GNavigationExpression__Group_1__1 : rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2 ;
    public final void rule__GNavigationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4925:1: ( rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2 )
            // InternalBCOoL.g:4926:2: rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__GNavigationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GNavigationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__1"


    // $ANTLR start "rule__GNavigationExpression__Group_1__1__Impl"
    // InternalBCOoL.g:4933:1: rule__GNavigationExpression__Group_1__1__Impl : ( ruleNavigationOperator ) ;
    public final void rule__GNavigationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4937:1: ( ( ruleNavigationOperator ) )
            // InternalBCOoL.g:4938:1: ( ruleNavigationOperator )
            {
            // InternalBCOoL.g:4938:1: ( ruleNavigationOperator )
            // InternalBCOoL.g:4939:1: ruleNavigationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getNavigationOperatorParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getNavigationOperatorParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group_1__2"
    // InternalBCOoL.g:4950:1: rule__GNavigationExpression__Group_1__2 : rule__GNavigationExpression__Group_1__2__Impl ;
    public final void rule__GNavigationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4954:1: ( rule__GNavigationExpression__Group_1__2__Impl )
            // InternalBCOoL.g:4955:2: rule__GNavigationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GNavigationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__2"


    // $ANTLR start "rule__GNavigationExpression__Group_1__2__Impl"
    // InternalBCOoL.g:4961:1: rule__GNavigationExpression__Group_1__2__Impl : ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) ) ;
    public final void rule__GNavigationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4965:1: ( ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) ) )
            // InternalBCOoL.g:4966:1: ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) )
            {
            // InternalBCOoL.g:4966:1: ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) )
            // InternalBCOoL.g:4967:1: ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectAssignment_1_2()); 
            }
            // InternalBCOoL.g:4968:1: ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 )
            // InternalBCOoL.g:4968:2: rule__GNavigationExpression__ReferencedEObjectAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GNavigationExpression__ReferencedEObjectAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GReferenceExpression__Group_1__0"
    // InternalBCOoL.g:4984:1: rule__GReferenceExpression__Group_1__0 : rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1 ;
    public final void rule__GReferenceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:4988:1: ( rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1 )
            // InternalBCOoL.g:4989:2: rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__GReferenceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GReferenceExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__0"


    // $ANTLR start "rule__GReferenceExpression__Group_1__0__Impl"
    // InternalBCOoL.g:4996:1: rule__GReferenceExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GReferenceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5000:1: ( ( () ) )
            // InternalBCOoL.g:5001:1: ( () )
            {
            // InternalBCOoL.g:5001:1: ( () )
            // InternalBCOoL.g:5002:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0()); 
            }
            // InternalBCOoL.g:5003:1: ()
            // InternalBCOoL.g:5005:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GReferenceExpression__Group_1__1"
    // InternalBCOoL.g:5015:1: rule__GReferenceExpression__Group_1__1 : rule__GReferenceExpression__Group_1__1__Impl ;
    public final void rule__GReferenceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5019:1: ( rule__GReferenceExpression__Group_1__1__Impl )
            // InternalBCOoL.g:5020:2: rule__GReferenceExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GReferenceExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__1"


    // $ANTLR start "rule__GReferenceExpression__Group_1__1__Impl"
    // InternalBCOoL.g:5026:1: rule__GReferenceExpression__Group_1__1__Impl : ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) ) ;
    public final void rule__GReferenceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5030:1: ( ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) ) )
            // InternalBCOoL.g:5031:1: ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) )
            {
            // InternalBCOoL.g:5031:1: ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) )
            // InternalBCOoL.g:5032:1: ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectAssignment_1_1()); 
            }
            // InternalBCOoL.g:5033:1: ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 )
            // InternalBCOoL.g:5033:2: rule__GReferenceExpression__ReferencedEObjectAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GReferenceExpression__ReferencedEObjectAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GStringExpression__Group__0"
    // InternalBCOoL.g:5047:1: rule__GStringExpression__Group__0 : rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1 ;
    public final void rule__GStringExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5051:1: ( rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1 )
            // InternalBCOoL.g:5052:2: rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__GStringExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GStringExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__0"


    // $ANTLR start "rule__GStringExpression__Group__0__Impl"
    // InternalBCOoL.g:5059:1: rule__GStringExpression__Group__0__Impl : ( () ) ;
    public final void rule__GStringExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5063:1: ( ( () ) )
            // InternalBCOoL.g:5064:1: ( () )
            {
            // InternalBCOoL.g:5064:1: ( () )
            // InternalBCOoL.g:5065:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0()); 
            }
            // InternalBCOoL.g:5066:1: ()
            // InternalBCOoL.g:5068:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__0__Impl"


    // $ANTLR start "rule__GStringExpression__Group__1"
    // InternalBCOoL.g:5078:1: rule__GStringExpression__Group__1 : rule__GStringExpression__Group__1__Impl ;
    public final void rule__GStringExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5082:1: ( rule__GStringExpression__Group__1__Impl )
            // InternalBCOoL.g:5083:2: rule__GStringExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GStringExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__1"


    // $ANTLR start "rule__GStringExpression__Group__1__Impl"
    // InternalBCOoL.g:5089:1: rule__GStringExpression__Group__1__Impl : ( ( rule__GStringExpression__ValueAssignment_1 ) ) ;
    public final void rule__GStringExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5093:1: ( ( ( rule__GStringExpression__ValueAssignment_1 ) ) )
            // InternalBCOoL.g:5094:1: ( ( rule__GStringExpression__ValueAssignment_1 ) )
            {
            // InternalBCOoL.g:5094:1: ( ( rule__GStringExpression__ValueAssignment_1 ) )
            // InternalBCOoL.g:5095:1: ( rule__GStringExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getValueAssignment_1()); 
            }
            // InternalBCOoL.g:5096:1: ( rule__GStringExpression__ValueAssignment_1 )
            // InternalBCOoL.g:5096:2: rule__GStringExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GStringExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__1__Impl"


    // $ANTLR start "rule__GBooleanExpression__Group__0"
    // InternalBCOoL.g:5110:1: rule__GBooleanExpression__Group__0 : rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1 ;
    public final void rule__GBooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5114:1: ( rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1 )
            // InternalBCOoL.g:5115:2: rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__GBooleanExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GBooleanExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__0"


    // $ANTLR start "rule__GBooleanExpression__Group__0__Impl"
    // InternalBCOoL.g:5122:1: rule__GBooleanExpression__Group__0__Impl : ( () ) ;
    public final void rule__GBooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5126:1: ( ( () ) )
            // InternalBCOoL.g:5127:1: ( () )
            {
            // InternalBCOoL.g:5127:1: ( () )
            // InternalBCOoL.g:5128:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0()); 
            }
            // InternalBCOoL.g:5129:1: ()
            // InternalBCOoL.g:5131:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__0__Impl"


    // $ANTLR start "rule__GBooleanExpression__Group__1"
    // InternalBCOoL.g:5141:1: rule__GBooleanExpression__Group__1 : rule__GBooleanExpression__Group__1__Impl ;
    public final void rule__GBooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5145:1: ( rule__GBooleanExpression__Group__1__Impl )
            // InternalBCOoL.g:5146:2: rule__GBooleanExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GBooleanExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__1"


    // $ANTLR start "rule__GBooleanExpression__Group__1__Impl"
    // InternalBCOoL.g:5152:1: rule__GBooleanExpression__Group__1__Impl : ( ( rule__GBooleanExpression__ValueAssignment_1 ) ) ;
    public final void rule__GBooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5156:1: ( ( ( rule__GBooleanExpression__ValueAssignment_1 ) ) )
            // InternalBCOoL.g:5157:1: ( ( rule__GBooleanExpression__ValueAssignment_1 ) )
            {
            // InternalBCOoL.g:5157:1: ( ( rule__GBooleanExpression__ValueAssignment_1 ) )
            // InternalBCOoL.g:5158:1: ( rule__GBooleanExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getValueAssignment_1()); 
            }
            // InternalBCOoL.g:5159:1: ( rule__GBooleanExpression__ValueAssignment_1 )
            // InternalBCOoL.g:5159:2: rule__GBooleanExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GBooleanExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__1__Impl"


    // $ANTLR start "rule__GIntegerExpression__Group__0"
    // InternalBCOoL.g:5173:1: rule__GIntegerExpression__Group__0 : rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1 ;
    public final void rule__GIntegerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5177:1: ( rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1 )
            // InternalBCOoL.g:5178:2: rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__GIntegerExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GIntegerExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__0"


    // $ANTLR start "rule__GIntegerExpression__Group__0__Impl"
    // InternalBCOoL.g:5185:1: rule__GIntegerExpression__Group__0__Impl : ( () ) ;
    public final void rule__GIntegerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5189:1: ( ( () ) )
            // InternalBCOoL.g:5190:1: ( () )
            {
            // InternalBCOoL.g:5190:1: ( () )
            // InternalBCOoL.g:5191:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0()); 
            }
            // InternalBCOoL.g:5192:1: ()
            // InternalBCOoL.g:5194:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__0__Impl"


    // $ANTLR start "rule__GIntegerExpression__Group__1"
    // InternalBCOoL.g:5204:1: rule__GIntegerExpression__Group__1 : rule__GIntegerExpression__Group__1__Impl ;
    public final void rule__GIntegerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5208:1: ( rule__GIntegerExpression__Group__1__Impl )
            // InternalBCOoL.g:5209:2: rule__GIntegerExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GIntegerExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__1"


    // $ANTLR start "rule__GIntegerExpression__Group__1__Impl"
    // InternalBCOoL.g:5215:1: rule__GIntegerExpression__Group__1__Impl : ( ( rule__GIntegerExpression__ValueAssignment_1 ) ) ;
    public final void rule__GIntegerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5219:1: ( ( ( rule__GIntegerExpression__ValueAssignment_1 ) ) )
            // InternalBCOoL.g:5220:1: ( ( rule__GIntegerExpression__ValueAssignment_1 ) )
            {
            // InternalBCOoL.g:5220:1: ( ( rule__GIntegerExpression__ValueAssignment_1 ) )
            // InternalBCOoL.g:5221:1: ( rule__GIntegerExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getValueAssignment_1()); 
            }
            // InternalBCOoL.g:5222:1: ( rule__GIntegerExpression__ValueAssignment_1 )
            // InternalBCOoL.g:5222:2: rule__GIntegerExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GIntegerExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__1__Impl"


    // $ANTLR start "rule__GDoubleExpression__Group__0"
    // InternalBCOoL.g:5236:1: rule__GDoubleExpression__Group__0 : rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1 ;
    public final void rule__GDoubleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5240:1: ( rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1 )
            // InternalBCOoL.g:5241:2: rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__GDoubleExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GDoubleExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__0"


    // $ANTLR start "rule__GDoubleExpression__Group__0__Impl"
    // InternalBCOoL.g:5248:1: rule__GDoubleExpression__Group__0__Impl : ( () ) ;
    public final void rule__GDoubleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5252:1: ( ( () ) )
            // InternalBCOoL.g:5253:1: ( () )
            {
            // InternalBCOoL.g:5253:1: ( () )
            // InternalBCOoL.g:5254:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0()); 
            }
            // InternalBCOoL.g:5255:1: ()
            // InternalBCOoL.g:5257:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__0__Impl"


    // $ANTLR start "rule__GDoubleExpression__Group__1"
    // InternalBCOoL.g:5267:1: rule__GDoubleExpression__Group__1 : rule__GDoubleExpression__Group__1__Impl ;
    public final void rule__GDoubleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5271:1: ( rule__GDoubleExpression__Group__1__Impl )
            // InternalBCOoL.g:5272:2: rule__GDoubleExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GDoubleExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__1"


    // $ANTLR start "rule__GDoubleExpression__Group__1__Impl"
    // InternalBCOoL.g:5278:1: rule__GDoubleExpression__Group__1__Impl : ( ( rule__GDoubleExpression__ValueAssignment_1 ) ) ;
    public final void rule__GDoubleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5282:1: ( ( ( rule__GDoubleExpression__ValueAssignment_1 ) ) )
            // InternalBCOoL.g:5283:1: ( ( rule__GDoubleExpression__ValueAssignment_1 ) )
            {
            // InternalBCOoL.g:5283:1: ( ( rule__GDoubleExpression__ValueAssignment_1 ) )
            // InternalBCOoL.g:5284:1: ( rule__GDoubleExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getValueAssignment_1()); 
            }
            // InternalBCOoL.g:5285:1: ( rule__GDoubleExpression__ValueAssignment_1 )
            // InternalBCOoL.g:5285:2: rule__GDoubleExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GDoubleExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__1__Impl"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__0"
    // InternalBCOoL.g:5299:1: rule__GEnumLiteralExpression__Group__0 : rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1 ;
    public final void rule__GEnumLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5303:1: ( rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1 )
            // InternalBCOoL.g:5304:2: rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__GEnumLiteralExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GEnumLiteralExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__0"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__0__Impl"
    // InternalBCOoL.g:5311:1: rule__GEnumLiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__GEnumLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5315:1: ( ( () ) )
            // InternalBCOoL.g:5316:1: ( () )
            {
            // InternalBCOoL.g:5316:1: ( () )
            // InternalBCOoL.g:5317:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0()); 
            }
            // InternalBCOoL.g:5318:1: ()
            // InternalBCOoL.g:5320:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__0__Impl"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__1"
    // InternalBCOoL.g:5330:1: rule__GEnumLiteralExpression__Group__1 : rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2 ;
    public final void rule__GEnumLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5334:1: ( rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2 )
            // InternalBCOoL.g:5335:2: rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GEnumLiteralExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GEnumLiteralExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__1"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__1__Impl"
    // InternalBCOoL.g:5342:1: rule__GEnumLiteralExpression__Group__1__Impl : ( '#' ) ;
    public final void rule__GEnumLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5346:1: ( ( '#' ) )
            // InternalBCOoL.g:5347:1: ( '#' )
            {
            // InternalBCOoL.g:5347:1: ( '#' )
            // InternalBCOoL.g:5348:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__1__Impl"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__2"
    // InternalBCOoL.g:5361:1: rule__GEnumLiteralExpression__Group__2 : rule__GEnumLiteralExpression__Group__2__Impl ;
    public final void rule__GEnumLiteralExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5365:1: ( rule__GEnumLiteralExpression__Group__2__Impl )
            // InternalBCOoL.g:5366:2: rule__GEnumLiteralExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GEnumLiteralExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__2"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__2__Impl"
    // InternalBCOoL.g:5372:1: rule__GEnumLiteralExpression__Group__2__Impl : ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) ) ;
    public final void rule__GEnumLiteralExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5376:1: ( ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) ) )
            // InternalBCOoL.g:5377:1: ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) )
            {
            // InternalBCOoL.g:5377:1: ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) )
            // InternalBCOoL.g:5378:1: ( rule__GEnumLiteralExpression__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueAssignment_2()); 
            }
            // InternalBCOoL.g:5379:1: ( rule__GEnumLiteralExpression__ValueAssignment_2 )
            // InternalBCOoL.g:5379:2: rule__GEnumLiteralExpression__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GEnumLiteralExpression__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__2__Impl"


    // $ANTLR start "rule__GIfExpression__Group__0"
    // InternalBCOoL.g:5395:1: rule__GIfExpression__Group__0 : rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1 ;
    public final void rule__GIfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5399:1: ( rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1 )
            // InternalBCOoL.g:5400:2: rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__GIfExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GIfExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__0"


    // $ANTLR start "rule__GIfExpression__Group__0__Impl"
    // InternalBCOoL.g:5407:1: rule__GIfExpression__Group__0__Impl : ( () ) ;
    public final void rule__GIfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5411:1: ( ( () ) )
            // InternalBCOoL.g:5412:1: ( () )
            {
            // InternalBCOoL.g:5412:1: ( () )
            // InternalBCOoL.g:5413:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0()); 
            }
            // InternalBCOoL.g:5414:1: ()
            // InternalBCOoL.g:5416:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__0__Impl"


    // $ANTLR start "rule__GIfExpression__Group__1"
    // InternalBCOoL.g:5426:1: rule__GIfExpression__Group__1 : rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2 ;
    public final void rule__GIfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5430:1: ( rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2 )
            // InternalBCOoL.g:5431:2: rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__GIfExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GIfExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__1"


    // $ANTLR start "rule__GIfExpression__Group__1__Impl"
    // InternalBCOoL.g:5438:1: rule__GIfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__GIfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5442:1: ( ( 'if' ) )
            // InternalBCOoL.g:5443:1: ( 'if' )
            {
            // InternalBCOoL.g:5443:1: ( 'if' )
            // InternalBCOoL.g:5444:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getIfKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getIfKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__1__Impl"


    // $ANTLR start "rule__GIfExpression__Group__2"
    // InternalBCOoL.g:5457:1: rule__GIfExpression__Group__2 : rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3 ;
    public final void rule__GIfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5461:1: ( rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3 )
            // InternalBCOoL.g:5462:2: rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__GIfExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GIfExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__2"


    // $ANTLR start "rule__GIfExpression__Group__2__Impl"
    // InternalBCOoL.g:5469:1: rule__GIfExpression__Group__2__Impl : ( ( rule__GIfExpression__ConditionAssignment_2 ) ) ;
    public final void rule__GIfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5473:1: ( ( ( rule__GIfExpression__ConditionAssignment_2 ) ) )
            // InternalBCOoL.g:5474:1: ( ( rule__GIfExpression__ConditionAssignment_2 ) )
            {
            // InternalBCOoL.g:5474:1: ( ( rule__GIfExpression__ConditionAssignment_2 ) )
            // InternalBCOoL.g:5475:1: ( rule__GIfExpression__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getConditionAssignment_2()); 
            }
            // InternalBCOoL.g:5476:1: ( rule__GIfExpression__ConditionAssignment_2 )
            // InternalBCOoL.g:5476:2: rule__GIfExpression__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GIfExpression__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getConditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__2__Impl"


    // $ANTLR start "rule__GIfExpression__Group__3"
    // InternalBCOoL.g:5486:1: rule__GIfExpression__Group__3 : rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4 ;
    public final void rule__GIfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5490:1: ( rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4 )
            // InternalBCOoL.g:5491:2: rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__GIfExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GIfExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__3"


    // $ANTLR start "rule__GIfExpression__Group__3__Impl"
    // InternalBCOoL.g:5498:1: rule__GIfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__GIfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5502:1: ( ( 'then' ) )
            // InternalBCOoL.g:5503:1: ( 'then' )
            {
            // InternalBCOoL.g:5503:1: ( 'then' )
            // InternalBCOoL.g:5504:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenKeyword_3()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getThenKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__3__Impl"


    // $ANTLR start "rule__GIfExpression__Group__4"
    // InternalBCOoL.g:5517:1: rule__GIfExpression__Group__4 : rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5 ;
    public final void rule__GIfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5521:1: ( rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5 )
            // InternalBCOoL.g:5522:2: rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5
            {
            pushFollow(FOLLOW_51);
            rule__GIfExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GIfExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__4"


    // $ANTLR start "rule__GIfExpression__Group__4__Impl"
    // InternalBCOoL.g:5529:1: rule__GIfExpression__Group__4__Impl : ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) ) ;
    public final void rule__GIfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5533:1: ( ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) ) )
            // InternalBCOoL.g:5534:1: ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) )
            {
            // InternalBCOoL.g:5534:1: ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) )
            // InternalBCOoL.g:5535:1: ( rule__GIfExpression__ThenExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenExpressionAssignment_4()); 
            }
            // InternalBCOoL.g:5536:1: ( rule__GIfExpression__ThenExpressionAssignment_4 )
            // InternalBCOoL.g:5536:2: rule__GIfExpression__ThenExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GIfExpression__ThenExpressionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getThenExpressionAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__4__Impl"


    // $ANTLR start "rule__GIfExpression__Group__5"
    // InternalBCOoL.g:5546:1: rule__GIfExpression__Group__5 : rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6 ;
    public final void rule__GIfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5550:1: ( rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6 )
            // InternalBCOoL.g:5551:2: rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__GIfExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GIfExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__5"


    // $ANTLR start "rule__GIfExpression__Group__5__Impl"
    // InternalBCOoL.g:5558:1: rule__GIfExpression__Group__5__Impl : ( 'else' ) ;
    public final void rule__GIfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5562:1: ( ( 'else' ) )
            // InternalBCOoL.g:5563:1: ( 'else' )
            {
            // InternalBCOoL.g:5563:1: ( 'else' )
            // InternalBCOoL.g:5564:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseKeyword_5()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getElseKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__5__Impl"


    // $ANTLR start "rule__GIfExpression__Group__6"
    // InternalBCOoL.g:5577:1: rule__GIfExpression__Group__6 : rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7 ;
    public final void rule__GIfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5581:1: ( rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7 )
            // InternalBCOoL.g:5582:2: rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7
            {
            pushFollow(FOLLOW_52);
            rule__GIfExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GIfExpression__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__6"


    // $ANTLR start "rule__GIfExpression__Group__6__Impl"
    // InternalBCOoL.g:5589:1: rule__GIfExpression__Group__6__Impl : ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) ) ;
    public final void rule__GIfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5593:1: ( ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) ) )
            // InternalBCOoL.g:5594:1: ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) )
            {
            // InternalBCOoL.g:5594:1: ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) )
            // InternalBCOoL.g:5595:1: ( rule__GIfExpression__ElseExpressionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseExpressionAssignment_6()); 
            }
            // InternalBCOoL.g:5596:1: ( rule__GIfExpression__ElseExpressionAssignment_6 )
            // InternalBCOoL.g:5596:2: rule__GIfExpression__ElseExpressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__GIfExpression__ElseExpressionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getElseExpressionAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__6__Impl"


    // $ANTLR start "rule__GIfExpression__Group__7"
    // InternalBCOoL.g:5606:1: rule__GIfExpression__Group__7 : rule__GIfExpression__Group__7__Impl ;
    public final void rule__GIfExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5610:1: ( rule__GIfExpression__Group__7__Impl )
            // InternalBCOoL.g:5611:2: rule__GIfExpression__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GIfExpression__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__7"


    // $ANTLR start "rule__GIfExpression__Group__7__Impl"
    // InternalBCOoL.g:5617:1: rule__GIfExpression__Group__7__Impl : ( 'endif' ) ;
    public final void rule__GIfExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5621:1: ( ( 'endif' ) )
            // InternalBCOoL.g:5622:1: ( 'endif' )
            {
            // InternalBCOoL.g:5622:1: ( 'endif' )
            // InternalBCOoL.g:5623:1: 'endif'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getEndifKeyword_7()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getEndifKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__7__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__0"
    // InternalBCOoL.g:5652:1: rule__GBraceExpression__Group__0 : rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1 ;
    public final void rule__GBraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5656:1: ( rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1 )
            // InternalBCOoL.g:5657:2: rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__GBraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GBraceExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__0"


    // $ANTLR start "rule__GBraceExpression__Group__0__Impl"
    // InternalBCOoL.g:5664:1: rule__GBraceExpression__Group__0__Impl : ( () ) ;
    public final void rule__GBraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5668:1: ( ( () ) )
            // InternalBCOoL.g:5669:1: ( () )
            {
            // InternalBCOoL.g:5669:1: ( () )
            // InternalBCOoL.g:5670:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0()); 
            }
            // InternalBCOoL.g:5671:1: ()
            // InternalBCOoL.g:5673:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__0__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__1"
    // InternalBCOoL.g:5683:1: rule__GBraceExpression__Group__1 : rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2 ;
    public final void rule__GBraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5687:1: ( rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2 )
            // InternalBCOoL.g:5688:2: rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__GBraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GBraceExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__1"


    // $ANTLR start "rule__GBraceExpression__Group__1__Impl"
    // InternalBCOoL.g:5695:1: rule__GBraceExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__GBraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5699:1: ( ( '(' ) )
            // InternalBCOoL.g:5700:1: ( '(' )
            {
            // InternalBCOoL.g:5700:1: ( '(' )
            // InternalBCOoL.g:5701:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__1__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__2"
    // InternalBCOoL.g:5714:1: rule__GBraceExpression__Group__2 : rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3 ;
    public final void rule__GBraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5718:1: ( rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3 )
            // InternalBCOoL.g:5719:2: rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3
            {
            pushFollow(FOLLOW_54);
            rule__GBraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GBraceExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__2"


    // $ANTLR start "rule__GBraceExpression__Group__2__Impl"
    // InternalBCOoL.g:5726:1: rule__GBraceExpression__Group__2__Impl : ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) ) ;
    public final void rule__GBraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5730:1: ( ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) ) )
            // InternalBCOoL.g:5731:1: ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) )
            {
            // InternalBCOoL.g:5731:1: ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) )
            // InternalBCOoL.g:5732:1: ( rule__GBraceExpression__InnerExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getInnerExpressionAssignment_2()); 
            }
            // InternalBCOoL.g:5733:1: ( rule__GBraceExpression__InnerExpressionAssignment_2 )
            // InternalBCOoL.g:5733:2: rule__GBraceExpression__InnerExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GBraceExpression__InnerExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getInnerExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__2__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__3"
    // InternalBCOoL.g:5743:1: rule__GBraceExpression__Group__3 : rule__GBraceExpression__Group__3__Impl ;
    public final void rule__GBraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5747:1: ( rule__GBraceExpression__Group__3__Impl )
            // InternalBCOoL.g:5748:2: rule__GBraceExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GBraceExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__3"


    // $ANTLR start "rule__GBraceExpression__Group__3__Impl"
    // InternalBCOoL.g:5754:1: rule__GBraceExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__GBraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5758:1: ( ( ')' ) )
            // InternalBCOoL.g:5759:1: ( ')' )
            {
            // InternalBCOoL.g:5759:1: ( ')' )
            // InternalBCOoL.g:5760:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBCOoL.g:5781:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5785:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBCOoL.g:5786:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalBCOoL.g:5793:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5797:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:5798:1: ( RULE_ID )
            {
            // InternalBCOoL.g:5798:1: ( RULE_ID )
            // InternalBCOoL.g:5799:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalBCOoL.g:5810:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5814:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBCOoL.g:5815:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalBCOoL.g:5821:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5825:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBCOoL.g:5826:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBCOoL.g:5826:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBCOoL.g:5827:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalBCOoL.g:5828:1: ( rule__QualifiedName__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==16) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==RULE_ID) ) {
                        int LA36_3 = input.LA(3);

                        if ( (synpred42_InternalBCOoL()) ) {
                            alt36=1;
                        }


                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalBCOoL.g:5828:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalBCOoL.g:5842:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5846:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBCOoL.g:5847:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalBCOoL.g:5854:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5858:1: ( ( ( '.' ) ) )
            // InternalBCOoL.g:5859:1: ( ( '.' ) )
            {
            // InternalBCOoL.g:5859:1: ( ( '.' ) )
            // InternalBCOoL.g:5860:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalBCOoL.g:5861:1: ( '.' )
            // InternalBCOoL.g:5862:2: '.'
            {
            match(input,16,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalBCOoL.g:5873:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5877:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBCOoL.g:5878:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalBCOoL.g:5884:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5888:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:5889:1: ( RULE_ID )
            {
            // InternalBCOoL.g:5889:1: ( RULE_ID )
            // InternalBCOoL.g:5890:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__BCoolSpec__NameAssignment_0"
    // InternalBCOoL.g:5906:1: rule__BCoolSpec__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BCoolSpec__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5910:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:5911:1: ( RULE_ID )
            {
            // InternalBCOoL.g:5911:1: ( RULE_ID )
            // InternalBCOoL.g:5912:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__NameAssignment_0"


    // $ANTLR start "rule__BCoolSpec__ImportsLibAssignment_1"
    // InternalBCOoL.g:5921:1: rule__BCoolSpec__ImportsLibAssignment_1 : ( ruleImportLibRule ) ;
    public final void rule__BCoolSpec__ImportsLibAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5925:1: ( ( ruleImportLibRule ) )
            // InternalBCOoL.g:5926:1: ( ruleImportLibRule )
            {
            // InternalBCOoL.g:5926:1: ( ruleImportLibRule )
            // InternalBCOoL.g:5927:1: ruleImportLibRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsLibImportLibRuleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImportLibRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsLibImportLibRuleParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__ImportsLibAssignment_1"


    // $ANTLR start "rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2"
    // InternalBCOoL.g:5936:1: rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 : ( ruleImportInterfaceRule ) ;
    public final void rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5940:1: ( ( ruleImportInterfaceRule ) )
            // InternalBCOoL.g:5941:1: ( ruleImportInterfaceRule )
            {
            // InternalBCOoL.g:5941:1: ( ruleImportInterfaceRule )
            // InternalBCOoL.g:5942:1: ruleImportInterfaceRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceImportInterfaceRuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceImportInterfaceRuleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2"


    // $ANTLR start "rule__BCoolSpec__BcoolOperatorsAssignment_3"
    // InternalBCOoL.g:5951:1: rule__BCoolSpec__BcoolOperatorsAssignment_3 : ( ruleBCoolOperatorSpec ) ;
    public final void rule__BCoolSpec__BcoolOperatorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5955:1: ( ( ruleBCoolOperatorSpec ) )
            // InternalBCOoL.g:5956:1: ( ruleBCoolOperatorSpec )
            {
            // InternalBCOoL.g:5956:1: ( ruleBCoolOperatorSpec )
            // InternalBCOoL.g:5957:1: ruleBCoolOperatorSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsBCoolOperatorSpecParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBCoolOperatorSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsBCoolOperatorSpecParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__BcoolOperatorsAssignment_3"


    // $ANTLR start "rule__BCoolOperatorSpec__NameAssignment_0_1"
    // InternalBCOoL.g:5966:1: rule__BCoolOperatorSpec__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__BCoolOperatorSpec__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5970:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:5971:1: ( RULE_ID )
            {
            // InternalBCOoL.g:5971:1: ( RULE_ID )
            // InternalBCOoL.g:5972:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__NameAssignment_0_1"


    // $ANTLR start "rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1"
    // InternalBCOoL.g:5981:1: rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1 : ( ruleglobalEventExpressionRule ) ;
    public final void rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:5985:1: ( ( ruleglobalEventExpressionRule ) )
            // InternalBCOoL.g:5986:1: ( ruleglobalEventExpressionRule )
            {
            // InternalBCOoL.g:5986:1: ( ruleglobalEventExpressionRule )
            // InternalBCOoL.g:5987:1: ruleglobalEventExpressionRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsGlobalEventExpressionRuleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleglobalEventExpressionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsGlobalEventExpressionRuleParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_1"


    // $ANTLR start "rule__BCoolOperatorSpec__GlobalDSEsAssignment_2"
    // InternalBCOoL.g:5996:1: rule__BCoolOperatorSpec__GlobalDSEsAssignment_2 : ( ruleglobalDSEsRule ) ;
    public final void rule__BCoolOperatorSpec__GlobalDSEsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6000:1: ( ( ruleglobalDSEsRule ) )
            // InternalBCOoL.g:6001:1: ( ruleglobalDSEsRule )
            {
            // InternalBCOoL.g:6001:1: ( ruleglobalDSEsRule )
            // InternalBCOoL.g:6002:1: ruleglobalDSEsRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsGlobalDSEsRuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleglobalDSEsRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsGlobalDSEsRuleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__GlobalDSEsAssignment_2"


    // $ANTLR start "rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3"
    // InternalBCOoL.g:6011:1: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 : ( ruleBCoolCompositionRule ) ;
    public final void rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6015:1: ( ( ruleBCoolCompositionRule ) )
            // InternalBCOoL.g:6016:1: ( ruleBCoolCompositionRule )
            {
            // InternalBCOoL.g:6016:1: ( ruleBCoolCompositionRule )
            // InternalBCOoL.g:6017:1: ruleBCoolCompositionRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesBCoolCompositionRuleParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBCoolCompositionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesBCoolCompositionRuleParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3"


    // $ANTLR start "rule__GlobalDSEsRule__NameAssignment_1"
    // InternalBCOoL.g:6026:1: rule__GlobalDSEsRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalDSEsRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6030:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6031:1: ( RULE_ID )
            {
            // InternalBCOoL.g:6031:1: ( RULE_ID )
            // InternalBCOoL.g:6032:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__NameAssignment_1"


    // $ANTLR start "rule__BCoolCompositionRule__NameAssignment_1"
    // InternalBCOoL.g:6041:1: rule__BCoolCompositionRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BCoolCompositionRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6045:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6046:1: ( RULE_ID )
            {
            // InternalBCOoL.g:6046:1: ( RULE_ID )
            // InternalBCOoL.g:6047:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__NameAssignment_1"


    // $ANTLR start "rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3"
    // InternalBCOoL.g:6056:1: rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 : ( ruleBCoolOperatorArg ) ;
    public final void rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6060:1: ( ( ruleBCoolOperatorArg ) )
            // InternalBCOoL.g:6061:1: ( ruleBCoolOperatorArg )
            {
            // InternalBCOoL.g:6061:1: ( ruleBCoolOperatorArg )
            // InternalBCOoL.g:6062:1: ruleBCoolOperatorArg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3"


    // $ANTLR start "rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1"
    // InternalBCOoL.g:6071:1: rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 : ( ruleBCoolOperatorArg ) ;
    public final void rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6075:1: ( ( ruleBCoolOperatorArg ) )
            // InternalBCOoL.g:6076:1: ( ruleBCoolOperatorArg )
            {
            // InternalBCOoL.g:6076:1: ( ruleBCoolOperatorArg )
            // InternalBCOoL.g:6077:1: ruleBCoolOperatorArg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1"


    // $ANTLR start "rule__BCoolCompositionRule__MatchingRuleAssignment_7"
    // InternalBCOoL.g:6086:1: rule__BCoolCompositionRule__MatchingRuleAssignment_7 : ( ruleMatchingRule ) ;
    public final void rule__BCoolCompositionRule__MatchingRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6090:1: ( ( ruleMatchingRule ) )
            // InternalBCOoL.g:6091:1: ( ruleMatchingRule )
            {
            // InternalBCOoL.g:6091:1: ( ruleMatchingRule )
            // InternalBCOoL.g:6092:1: ruleMatchingRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMatchingRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__MatchingRuleAssignment_7"


    // $ANTLR start "rule__BCoolCompositionRule__CoordinationRuleAssignment_8"
    // InternalBCOoL.g:6101:1: rule__BCoolCompositionRule__CoordinationRuleAssignment_8 : ( ruleCoordinationRule ) ;
    public final void rule__BCoolCompositionRule__CoordinationRuleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6105:1: ( ( ruleCoordinationRule ) )
            // InternalBCOoL.g:6106:1: ( ruleCoordinationRule )
            {
            // InternalBCOoL.g:6106:1: ( ruleCoordinationRule )
            // InternalBCOoL.g:6107:1: ruleCoordinationRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__CoordinationRuleAssignment_8"


    // $ANTLR start "rule__BCoolOperatorArg__NameAssignment_0"
    // InternalBCOoL.g:6116:1: rule__BCoolOperatorArg__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BCoolOperatorArg__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6120:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6121:1: ( RULE_ID )
            {
            // InternalBCOoL.g:6121:1: ( RULE_ID )
            // InternalBCOoL.g:6122:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__NameAssignment_0"


    // $ANTLR start "rule__BCoolOperatorArg__InterfaceAssignment_2"
    // InternalBCOoL.g:6131:1: rule__BCoolOperatorArg__InterfaceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BCoolOperatorArg__InterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6135:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoL.g:6136:1: ( ( RULE_ID ) )
            {
            // InternalBCOoL.g:6136:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6137:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementCrossReference_2_0()); 
            }
            // InternalBCOoL.g:6138:1: ( RULE_ID )
            // InternalBCOoL.g:6139:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__InterfaceAssignment_2"


    // $ANTLR start "rule__BCoolOperatorArg__DSEAssignment_4"
    // InternalBCOoL.g:6150:1: rule__BCoolOperatorArg__DSEAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__BCoolOperatorArg__DSEAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6154:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoL.g:6155:1: ( ( RULE_ID ) )
            {
            // InternalBCOoL.g:6155:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6156:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getDSEDefPropertyCSCrossReference_4_0()); 
            }
            // InternalBCOoL.g:6157:1: ( RULE_ID )
            // InternalBCOoL.g:6158:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getDSEDefPropertyCSIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getDSEDefPropertyCSIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getDSEDefPropertyCSCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__DSEAssignment_4"


    // $ANTLR start "rule__BCoolOperatorArg__InterfaceClassAssignment_5"
    // InternalBCOoL.g:6169:1: rule__BCoolOperatorArg__InterfaceClassAssignment_5 : ( ( RULE_STRING ) ) ;
    public final void rule__BCoolOperatorArg__InterfaceClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6173:1: ( ( ( RULE_STRING ) ) )
            // InternalBCOoL.g:6174:1: ( ( RULE_STRING ) )
            {
            // InternalBCOoL.g:6174:1: ( ( RULE_STRING ) )
            // InternalBCOoL.g:6175:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getInterfaceClassEClassCrossReference_5_0()); 
            }
            // InternalBCOoL.g:6176:1: ( RULE_STRING )
            // InternalBCOoL.g:6177:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getInterfaceClassEClassSTRINGTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getInterfaceClassEClassSTRINGTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getInterfaceClassEClassCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__InterfaceClassAssignment_5"


    // $ANTLR start "rule__MatchingRule__ConditionAssignment_1"
    // InternalBCOoL.g:6188:1: rule__MatchingRule__ConditionAssignment_1 : ( ruleGExpression ) ;
    public final void rule__MatchingRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6192:1: ( ( ruleGExpression ) )
            // InternalBCOoL.g:6193:1: ( ruleGExpression )
            {
            // InternalBCOoL.g:6193:1: ( ruleGExpression )
            // InternalBCOoL.g:6194:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getConditionGExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getConditionGExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__ConditionAssignment_1"


    // $ANTLR start "rule__MatchingRule__FilterEventExpressionsAssignment_4_1"
    // InternalBCOoL.g:6203:1: rule__MatchingRule__FilterEventExpressionsAssignment_4_1 : ( ruleEventExpression ) ;
    public final void rule__MatchingRule__FilterEventExpressionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6207:1: ( ( ruleEventExpression ) )
            // InternalBCOoL.g:6208:1: ( ruleEventExpression )
            {
            // InternalBCOoL.g:6208:1: ( ruleEventExpression )
            // InternalBCOoL.g:6209:1: ruleEventExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsEventExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsEventExpressionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__FilterEventExpressionsAssignment_4_1"


    // $ANTLR start "rule__EventExpression__NameAssignment_0"
    // InternalBCOoL.g:6218:1: rule__EventExpression__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EventExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6222:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6223:1: ( RULE_ID )
            {
            // InternalBCOoL.g:6223:1: ( RULE_ID )
            // InternalBCOoL.g:6224:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__NameAssignment_0"


    // $ANTLR start "rule__EventExpression__DeclarationAssignment_2"
    // InternalBCOoL.g:6233:1: rule__EventExpression__DeclarationAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EventExpression__DeclarationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6237:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBCOoL.g:6238:1: ( ( ruleQualifiedName ) )
            {
            // InternalBCOoL.g:6238:1: ( ( ruleQualifiedName ) )
            // InternalBCOoL.g:6239:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
            }
            // InternalBCOoL.g:6240:1: ( ruleQualifiedName )
            // InternalBCOoL.g:6241:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__DeclarationAssignment_2"


    // $ANTLR start "rule__EventExpression__ActualParametersAssignment_4_0"
    // InternalBCOoL.g:6252:1: rule__EventExpression__ActualParametersAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__EventExpression__ActualParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6256:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoL.g:6257:1: ( ( RULE_ID ) )
            {
            // InternalBCOoL.g:6257:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6258:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_0_0()); 
            }
            // InternalBCOoL.g:6259:1: ( RULE_ID )
            // InternalBCOoL.g:6260:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__ActualParametersAssignment_4_0"


    // $ANTLR start "rule__EventExpression__ActualParametersAssignment_4_1_1"
    // InternalBCOoL.g:6271:1: rule__EventExpression__ActualParametersAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__EventExpression__ActualParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6275:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoL.g:6276:1: ( ( RULE_ID ) )
            {
            // InternalBCOoL.g:6276:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6277:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
            }
            // InternalBCOoL.g:6278:1: ( RULE_ID )
            // InternalBCOoL.g:6279:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__ActualParametersAssignment_4_1_1"


    // $ANTLR start "rule__CoordinationRule__EventRelationsAssignment"
    // InternalBCOoL.g:6290:1: rule__CoordinationRule__EventRelationsAssignment : ( ruleEventRelation ) ;
    public final void rule__CoordinationRule__EventRelationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6294:1: ( ( ruleEventRelation ) )
            // InternalBCOoL.g:6295:1: ( ruleEventRelation )
            {
            // InternalBCOoL.g:6295:1: ( ruleEventRelation )
            // InternalBCOoL.g:6296:1: ruleEventRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationRule__EventRelationsAssignment"


    // $ANTLR start "rule__EventRelation__DeclarationAssignment_1"
    // InternalBCOoL.g:6305:1: rule__EventRelation__DeclarationAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EventRelation__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6309:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBCOoL.g:6310:1: ( ( ruleQualifiedName ) )
            {
            // InternalBCOoL.g:6310:1: ( ( ruleQualifiedName ) )
            // InternalBCOoL.g:6311:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_1_0()); 
            }
            // InternalBCOoL.g:6312:1: ( ruleQualifiedName )
            // InternalBCOoL.g:6313:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__DeclarationAssignment_1"


    // $ANTLR start "rule__EventRelation__ActualParametersAssignment_3_0"
    // InternalBCOoL.g:6324:1: rule__EventRelation__ActualParametersAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__EventRelation__ActualParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6328:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoL.g:6329:1: ( ( RULE_ID ) )
            {
            // InternalBCOoL.g:6329:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6330:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSCrossReference_3_0_0()); 
            }
            // InternalBCOoL.g:6331:1: ( RULE_ID )
            // InternalBCOoL.g:6332:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSIDTerminalRuleCall_3_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSIDTerminalRuleCall_3_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSCrossReference_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__ActualParametersAssignment_3_0"


    // $ANTLR start "rule__EventRelation__ActualParametersAssignment_3_1_1"
    // InternalBCOoL.g:6343:1: rule__EventRelation__ActualParametersAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__EventRelation__ActualParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6347:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoL.g:6348:1: ( ( RULE_ID ) )
            {
            // InternalBCOoL.g:6348:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6349:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSCrossReference_3_1_1_0()); 
            }
            // InternalBCOoL.g:6350:1: ( RULE_ID )
            // InternalBCOoL.g:6351:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSIDTerminalRuleCall_3_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSIDTerminalRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersDefPropertyCSCrossReference_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__ActualParametersAssignment_3_1_1"


    // $ANTLR start "rule__ImportLibRule__ImportURIAssignment_1"
    // InternalBCOoL.g:6362:1: rule__ImportLibRule__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImportLibRule__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6366:1: ( ( RULE_STRING ) )
            // InternalBCOoL.g:6367:1: ( RULE_STRING )
            {
            // InternalBCOoL.g:6367:1: ( RULE_STRING )
            // InternalBCOoL.g:6368:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__ImportURIAssignment_1"


    // $ANTLR start "rule__ImportInterfaceRule__ImportURIAssignment_1"
    // InternalBCOoL.g:6377:1: rule__ImportInterfaceRule__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImportInterfaceRule__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6381:1: ( ( RULE_STRING ) )
            // InternalBCOoL.g:6382:1: ( RULE_STRING )
            {
            // InternalBCOoL.g:6382:1: ( RULE_STRING )
            // InternalBCOoL.g:6383:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__ImportURIAssignment_1"


    // $ANTLR start "rule__ImportInterfaceRule__NameAssignment_3"
    // InternalBCOoL.g:6392:1: rule__ImportInterfaceRule__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ImportInterfaceRule__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6396:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6397:1: ( RULE_ID )
            {
            // InternalBCOoL.g:6397:1: ( RULE_ID )
            // InternalBCOoL.g:6398:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__NameAssignment_3"


    // $ANTLR start "rule__GImportStatement__ImportURIAssignment_1"
    // InternalBCOoL.g:6410:1: rule__GImportStatement__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GImportStatement__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6414:1: ( ( RULE_STRING ) )
            // InternalBCOoL.g:6415:1: ( RULE_STRING )
            {
            // InternalBCOoL.g:6415:1: ( RULE_STRING )
            // InternalBCOoL.g:6416:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__ImportURIAssignment_1"


    // $ANTLR start "rule__GOrExpression__OperatorAssignment_1_1"
    // InternalBCOoL.g:6425:1: rule__GOrExpression__OperatorAssignment_1_1 : ( ruleGOrOperator ) ;
    public final void rule__GOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6429:1: ( ( ruleGOrOperator ) )
            // InternalBCOoL.g:6430:1: ( ruleGOrOperator )
            {
            // InternalBCOoL.g:6430:1: ( ruleGOrOperator )
            // InternalBCOoL.g:6431:1: ruleGOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GOrExpression__RightOperandAssignment_1_2"
    // InternalBCOoL.g:6440:1: rule__GOrExpression__RightOperandAssignment_1_2 : ( ruleGXorExpression ) ;
    public final void rule__GOrExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6444:1: ( ( ruleGXorExpression ) )
            // InternalBCOoL.g:6445:1: ( ruleGXorExpression )
            {
            // InternalBCOoL.g:6445:1: ( ruleGXorExpression )
            // InternalBCOoL.g:6446:1: ruleGXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GXorExpression__OperatorAssignment_1_1"
    // InternalBCOoL.g:6455:1: rule__GXorExpression__OperatorAssignment_1_1 : ( ruleGXorOperator ) ;
    public final void rule__GXorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6459:1: ( ( ruleGXorOperator ) )
            // InternalBCOoL.g:6460:1: ( ruleGXorOperator )
            {
            // InternalBCOoL.g:6460:1: ( ruleGXorOperator )
            // InternalBCOoL.g:6461:1: ruleGXorOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGXorOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GXorExpression__RightOperandAssignment_1_2"
    // InternalBCOoL.g:6470:1: rule__GXorExpression__RightOperandAssignment_1_2 : ( ruleGAndExpression ) ;
    public final void rule__GXorExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6474:1: ( ( ruleGAndExpression ) )
            // InternalBCOoL.g:6475:1: ( ruleGAndExpression )
            {
            // InternalBCOoL.g:6475:1: ( ruleGAndExpression )
            // InternalBCOoL.g:6476:1: ruleGAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GAndExpression__OperatorAssignment_1_1"
    // InternalBCOoL.g:6485:1: rule__GAndExpression__OperatorAssignment_1_1 : ( ruleGAndOperator ) ;
    public final void rule__GAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6489:1: ( ( ruleGAndOperator ) )
            // InternalBCOoL.g:6490:1: ( ruleGAndOperator )
            {
            // InternalBCOoL.g:6490:1: ( ruleGAndOperator )
            // InternalBCOoL.g:6491:1: ruleGAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GAndExpression__RightOperandAssignment_1_2"
    // InternalBCOoL.g:6500:1: rule__GAndExpression__RightOperandAssignment_1_2 : ( ruleGEqualityExpression ) ;
    public final void rule__GAndExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6504:1: ( ( ruleGEqualityExpression ) )
            // InternalBCOoL.g:6505:1: ( ruleGEqualityExpression )
            {
            // InternalBCOoL.g:6505:1: ( ruleGEqualityExpression )
            // InternalBCOoL.g:6506:1: ruleGEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GEqualityExpression__OperatorAssignment_1_1"
    // InternalBCOoL.g:6515:1: rule__GEqualityExpression__OperatorAssignment_1_1 : ( ruleGEqualityOperator ) ;
    public final void rule__GEqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6519:1: ( ( ruleGEqualityOperator ) )
            // InternalBCOoL.g:6520:1: ( ruleGEqualityOperator )
            {
            // InternalBCOoL.g:6520:1: ( ruleGEqualityOperator )
            // InternalBCOoL.g:6521:1: ruleGEqualityOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGEqualityOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GEqualityExpression__RightOperandAssignment_1_2"
    // InternalBCOoL.g:6530:1: rule__GEqualityExpression__RightOperandAssignment_1_2 : ( ruleGRelationExpression ) ;
    public final void rule__GEqualityExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6534:1: ( ( ruleGRelationExpression ) )
            // InternalBCOoL.g:6535:1: ( ruleGRelationExpression )
            {
            // InternalBCOoL.g:6535:1: ( ruleGRelationExpression )
            // InternalBCOoL.g:6536:1: ruleGRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GRelationExpression__OperatorAssignment_1_1"
    // InternalBCOoL.g:6545:1: rule__GRelationExpression__OperatorAssignment_1_1 : ( ruleGRelationOperator ) ;
    public final void rule__GRelationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6549:1: ( ( ruleGRelationOperator ) )
            // InternalBCOoL.g:6550:1: ( ruleGRelationOperator )
            {
            // InternalBCOoL.g:6550:1: ( ruleGRelationOperator )
            // InternalBCOoL.g:6551:1: ruleGRelationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGRelationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GRelationExpression__RightOperandAssignment_1_2"
    // InternalBCOoL.g:6560:1: rule__GRelationExpression__RightOperandAssignment_1_2 : ( ruleGAdditionExpression ) ;
    public final void rule__GRelationExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6564:1: ( ( ruleGAdditionExpression ) )
            // InternalBCOoL.g:6565:1: ( ruleGAdditionExpression )
            {
            // InternalBCOoL.g:6565:1: ( ruleGAdditionExpression )
            // InternalBCOoL.g:6566:1: ruleGAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GAdditionExpression__OperatorAssignment_1_1"
    // InternalBCOoL.g:6575:1: rule__GAdditionExpression__OperatorAssignment_1_1 : ( ruleGAdditionOperator ) ;
    public final void rule__GAdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6579:1: ( ( ruleGAdditionOperator ) )
            // InternalBCOoL.g:6580:1: ( ruleGAdditionOperator )
            {
            // InternalBCOoL.g:6580:1: ( ruleGAdditionOperator )
            // InternalBCOoL.g:6581:1: ruleGAdditionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGAdditionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GAdditionExpression__RightOperandAssignment_1_2"
    // InternalBCOoL.g:6590:1: rule__GAdditionExpression__RightOperandAssignment_1_2 : ( ruleGMultiplicationExpression ) ;
    public final void rule__GAdditionExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6594:1: ( ( ruleGMultiplicationExpression ) )
            // InternalBCOoL.g:6595:1: ( ruleGMultiplicationExpression )
            {
            // InternalBCOoL.g:6595:1: ( ruleGMultiplicationExpression )
            // InternalBCOoL.g:6596:1: ruleGMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GMultiplicationExpression__OperatorAssignment_1_1"
    // InternalBCOoL.g:6605:1: rule__GMultiplicationExpression__OperatorAssignment_1_1 : ( ruleGMultiplicationOperator ) ;
    public final void rule__GMultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6609:1: ( ( ruleGMultiplicationOperator ) )
            // InternalBCOoL.g:6610:1: ( ruleGMultiplicationOperator )
            {
            // InternalBCOoL.g:6610:1: ( ruleGMultiplicationOperator )
            // InternalBCOoL.g:6611:1: ruleGMultiplicationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGMultiplicationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GMultiplicationExpression__RightOperandAssignment_1_2"
    // InternalBCOoL.g:6620:1: rule__GMultiplicationExpression__RightOperandAssignment_1_2 : ( ruleGNegationExpression ) ;
    public final void rule__GMultiplicationExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6624:1: ( ( ruleGNegationExpression ) )
            // InternalBCOoL.g:6625:1: ( ruleGNegationExpression )
            {
            // InternalBCOoL.g:6625:1: ( ruleGNegationExpression )
            // InternalBCOoL.g:6626:1: ruleGNegationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GNegationExpression__OperatorAssignment_1_1"
    // InternalBCOoL.g:6635:1: rule__GNegationExpression__OperatorAssignment_1_1 : ( ruleGNegationOperator ) ;
    public final void rule__GNegationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6639:1: ( ( ruleGNegationOperator ) )
            // InternalBCOoL.g:6640:1: ( ruleGNegationOperator )
            {
            // InternalBCOoL.g:6640:1: ( ruleGNegationOperator )
            // InternalBCOoL.g:6641:1: ruleGNegationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGNegationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GNegationExpression__OperandAssignment_1_2"
    // InternalBCOoL.g:6650:1: rule__GNegationExpression__OperandAssignment_1_2 : ( ruleGNavigationExpression ) ;
    public final void rule__GNegationExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6654:1: ( ( ruleGNavigationExpression ) )
            // InternalBCOoL.g:6655:1: ( ruleGNavigationExpression )
            {
            // InternalBCOoL.g:6655:1: ( ruleGNavigationExpression )
            // InternalBCOoL.g:6656:1: ruleGNavigationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__GNavigationExpression__ReferencedEObjectAssignment_1_2"
    // InternalBCOoL.g:6665:1: rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__GNavigationExpression__ReferencedEObjectAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6669:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoL.g:6670:1: ( ( RULE_ID ) )
            {
            // InternalBCOoL.g:6670:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6671:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            }
            // InternalBCOoL.g:6672:1: ( RULE_ID )
            // InternalBCOoL.g:6673:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__ReferencedEObjectAssignment_1_2"


    // $ANTLR start "rule__GReferenceExpression__ReferencedEObjectAssignment_1_1"
    // InternalBCOoL.g:6684:1: rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GReferenceExpression__ReferencedEObjectAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6688:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoL.g:6689:1: ( ( RULE_ID ) )
            {
            // InternalBCOoL.g:6689:1: ( ( RULE_ID ) )
            // InternalBCOoL.g:6690:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectCrossReference_1_1_0()); 
            }
            // InternalBCOoL.g:6691:1: ( RULE_ID )
            // InternalBCOoL.g:6692:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__ReferencedEObjectAssignment_1_1"


    // $ANTLR start "rule__GStringExpression__ValueAssignment_1"
    // InternalBCOoL.g:6703:1: rule__GStringExpression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GStringExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6707:1: ( ( RULE_STRING ) )
            // InternalBCOoL.g:6708:1: ( RULE_STRING )
            {
            // InternalBCOoL.g:6708:1: ( RULE_STRING )
            // InternalBCOoL.g:6709:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__ValueAssignment_1"


    // $ANTLR start "rule__GBooleanExpression__ValueAssignment_1"
    // InternalBCOoL.g:6718:1: rule__GBooleanExpression__ValueAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__GBooleanExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6722:1: ( ( RULE_BOOLEAN ) )
            // InternalBCOoL.g:6723:1: ( RULE_BOOLEAN )
            {
            // InternalBCOoL.g:6723:1: ( RULE_BOOLEAN )
            // InternalBCOoL.g:6724:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__ValueAssignment_1"


    // $ANTLR start "rule__GIntegerExpression__ValueAssignment_1"
    // InternalBCOoL.g:6733:1: rule__GIntegerExpression__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__GIntegerExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6737:1: ( ( RULE_INT ) )
            // InternalBCOoL.g:6738:1: ( RULE_INT )
            {
            // InternalBCOoL.g:6738:1: ( RULE_INT )
            // InternalBCOoL.g:6739:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__ValueAssignment_1"


    // $ANTLR start "rule__GDoubleExpression__ValueAssignment_1"
    // InternalBCOoL.g:6748:1: rule__GDoubleExpression__ValueAssignment_1 : ( RULE_DOUBLE ) ;
    public final void rule__GDoubleExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6752:1: ( ( RULE_DOUBLE ) )
            // InternalBCOoL.g:6753:1: ( RULE_DOUBLE )
            {
            // InternalBCOoL.g:6753:1: ( RULE_DOUBLE )
            // InternalBCOoL.g:6754:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__ValueAssignment_1"


    // $ANTLR start "rule__GEnumLiteralExpression__ValueAssignment_2"
    // InternalBCOoL.g:6763:1: rule__GEnumLiteralExpression__ValueAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GEnumLiteralExpression__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6767:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBCOoL.g:6768:1: ( ( ruleQualifiedName ) )
            {
            // InternalBCOoL.g:6768:1: ( ( ruleQualifiedName ) )
            // InternalBCOoL.g:6769:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
            }
            // InternalBCOoL.g:6770:1: ( ruleQualifiedName )
            // InternalBCOoL.g:6771:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__ValueAssignment_2"


    // $ANTLR start "rule__GIfExpression__ConditionAssignment_2"
    // InternalBCOoL.g:6782:1: rule__GIfExpression__ConditionAssignment_2 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6786:1: ( ( ruleGExpression ) )
            // InternalBCOoL.g:6787:1: ( ruleGExpression )
            {
            // InternalBCOoL.g:6787:1: ( ruleGExpression )
            // InternalBCOoL.g:6788:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__ConditionAssignment_2"


    // $ANTLR start "rule__GIfExpression__ThenExpressionAssignment_4"
    // InternalBCOoL.g:6797:1: rule__GIfExpression__ThenExpressionAssignment_4 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ThenExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6801:1: ( ( ruleGExpression ) )
            // InternalBCOoL.g:6802:1: ( ruleGExpression )
            {
            // InternalBCOoL.g:6802:1: ( ruleGExpression )
            // InternalBCOoL.g:6803:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__ThenExpressionAssignment_4"


    // $ANTLR start "rule__GIfExpression__ElseExpressionAssignment_6"
    // InternalBCOoL.g:6812:1: rule__GIfExpression__ElseExpressionAssignment_6 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ElseExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6816:1: ( ( ruleGExpression ) )
            // InternalBCOoL.g:6817:1: ( ruleGExpression )
            {
            // InternalBCOoL.g:6817:1: ( ruleGExpression )
            // InternalBCOoL.g:6818:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__ElseExpressionAssignment_6"


    // $ANTLR start "rule__GBraceExpression__InnerExpressionAssignment_2"
    // InternalBCOoL.g:6827:1: rule__GBraceExpression__InnerExpressionAssignment_2 : ( ruleGExpression ) ;
    public final void rule__GBraceExpression__InnerExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoL.g:6831:1: ( ( ruleGExpression ) )
            // InternalBCOoL.g:6832:1: ( ruleGExpression )
            {
            // InternalBCOoL.g:6832:1: ( ruleGExpression )
            // InternalBCOoL.g:6833:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__InnerExpressionAssignment_2"

    // $ANTLR start synpred24_InternalBCOoL
    public final void synpred24_InternalBCOoL_fragment() throws RecognitionException {   
        // InternalBCOoL.g:1727:2: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3 )
        // InternalBCOoL.g:1727:2: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3
        {
        pushFollow(FOLLOW_2);
        rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalBCOoL

    // $ANTLR start synpred42_InternalBCOoL
    public final void synpred42_InternalBCOoL_fragment() throws RecognitionException {   
        // InternalBCOoL.g:5828:2: ( rule__QualifiedName__Group_1__0 )
        // InternalBCOoL.g:5828:2: rule__QualifiedName__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__QualifiedName__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalBCOoL

    // Delegated rules

    public final boolean synpred24_InternalBCOoL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalBCOoL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalBCOoL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalBCOoL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000006C0000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000006C0000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00060008000001F0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00060008000001E0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000010002L});

}