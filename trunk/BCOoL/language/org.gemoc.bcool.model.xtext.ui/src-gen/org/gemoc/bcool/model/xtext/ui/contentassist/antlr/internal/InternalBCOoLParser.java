package org.gemoc.bcool.model.xtext.ui.contentassist.antlr.internal; 

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
import org.gemoc.bcool.model.xtext.services.BCOoLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBCOoLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'xor'", "'or'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'~'", "'Spec'", "'Event'", "';'", "'let'", "'Operator'", "'('", "')'", "'MatchingCorrespondance :'", "'end operator;'", "','", "'when'", "'CoordinationRule:'", "'ImportLib'", "'ImportInterface'", "'as'", "'import'", "'.'", "'#'", "'if'", "'then'", "'else'", "'endif'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=5;
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
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
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
    public static final int T__32=32;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g"; }


     
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:61:1: entryRuleBCoolSpec : ruleBCoolSpec EOF ;
    public final void entryRuleBCoolSpec() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:62:1: ( ruleBCoolSpec EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:63:1: ruleBCoolSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolSpec_in_entryRuleBCoolSpec67);
            ruleBCoolSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolSpec74); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:70:1: ruleBCoolSpec : ( ( rule__BCoolSpec__Group__0 ) ) ;
    public final void ruleBCoolSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:74:2: ( ( ( rule__BCoolSpec__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:75:1: ( ( rule__BCoolSpec__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:75:1: ( ( rule__BCoolSpec__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:76:1: ( rule__BCoolSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:77:1: ( rule__BCoolSpec__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:77:2: rule__BCoolSpec__Group__0
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__0_in_ruleBCoolSpec100);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:89:1: entryRuleBCoolOperatorSpec : ruleBCoolOperatorSpec EOF ;
    public final void entryRuleBCoolOperatorSpec() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:90:1: ( ruleBCoolOperatorSpec EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:91:1: ruleBCoolOperatorSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorSpec_in_entryRuleBCoolOperatorSpec127);
            ruleBCoolOperatorSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolOperatorSpec134); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:98:1: ruleBCoolOperatorSpec : ( ( rule__BCoolOperatorSpec__Group__0 ) ) ;
    public final void ruleBCoolOperatorSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:102:2: ( ( ( rule__BCoolOperatorSpec__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:103:1: ( ( rule__BCoolOperatorSpec__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:103:1: ( ( rule__BCoolOperatorSpec__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:104:1: ( rule__BCoolOperatorSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:105:1: ( rule__BCoolOperatorSpec__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:105:2: rule__BCoolOperatorSpec__Group__0
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__0_in_ruleBCoolOperatorSpec160);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:117:1: entryRuleglobalDSEsRule : ruleglobalDSEsRule EOF ;
    public final void entryRuleglobalDSEsRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:118:1: ( ruleglobalDSEsRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:119:1: ruleglobalDSEsRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleRule()); 
            }
            pushFollow(FOLLOW_ruleglobalDSEsRule_in_entryRuleglobalDSEsRule187);
            ruleglobalDSEsRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglobalDSEsRule194); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:126:1: ruleglobalDSEsRule : ( ( rule__GlobalDSEsRule__Group__0 ) ) ;
    public final void ruleglobalDSEsRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:130:2: ( ( ( rule__GlobalDSEsRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:131:1: ( ( rule__GlobalDSEsRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:131:1: ( ( rule__GlobalDSEsRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:132:1: ( rule__GlobalDSEsRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:133:1: ( rule__GlobalDSEsRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:133:2: rule__GlobalDSEsRule__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__0_in_ruleglobalDSEsRule220);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:145:1: entryRuleglobalEventExpressionRule : ruleglobalEventExpressionRule EOF ;
    public final void entryRuleglobalEventExpressionRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:146:1: ( ruleglobalEventExpressionRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:147:1: ruleglobalEventExpressionRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleglobalEventExpressionRule_in_entryRuleglobalEventExpressionRule247);
            ruleglobalEventExpressionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalEventExpressionRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglobalEventExpressionRule254); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:154:1: ruleglobalEventExpressionRule : ( ( rule__GlobalEventExpressionRule__Group__0 ) ) ;
    public final void ruleglobalEventExpressionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:158:2: ( ( ( rule__GlobalEventExpressionRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:159:1: ( ( rule__GlobalEventExpressionRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:159:1: ( ( rule__GlobalEventExpressionRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:160:1: ( rule__GlobalEventExpressionRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:161:1: ( rule__GlobalEventExpressionRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:161:2: rule__GlobalEventExpressionRule__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalEventExpressionRule__Group__0_in_ruleglobalEventExpressionRule280);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:173:1: entryRuleBCoolCompositionRule : ruleBCoolCompositionRule EOF ;
    public final void entryRuleBCoolCompositionRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:174:1: ( ruleBCoolCompositionRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:175:1: ruleBCoolCompositionRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolCompositionRule_in_entryRuleBCoolCompositionRule307);
            ruleBCoolCompositionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolCompositionRule314); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:182:1: ruleBCoolCompositionRule : ( ( rule__BCoolCompositionRule__Group__0 ) ) ;
    public final void ruleBCoolCompositionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:186:2: ( ( ( rule__BCoolCompositionRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:187:1: ( ( rule__BCoolCompositionRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:187:1: ( ( rule__BCoolCompositionRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:188:1: ( rule__BCoolCompositionRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:189:1: ( rule__BCoolCompositionRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:189:2: rule__BCoolCompositionRule__Group__0
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__0_in_ruleBCoolCompositionRule340);
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


    // $ANTLR start "entryRuleMatchingRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:201:1: entryRuleMatchingRule : ruleMatchingRule EOF ;
    public final void entryRuleMatchingRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:202:1: ( ruleMatchingRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:203:1: ruleMatchingRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule367);
            ruleMatchingRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingRule374); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:210:1: ruleMatchingRule : ( ( rule__MatchingRule__Group__0 ) ) ;
    public final void ruleMatchingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:214:2: ( ( ( rule__MatchingRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:215:1: ( ( rule__MatchingRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:215:1: ( ( rule__MatchingRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:216:1: ( rule__MatchingRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:217:1: ( rule__MatchingRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:217:2: rule__MatchingRule__Group__0
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__0_in_ruleMatchingRule400);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:229:1: entryRuleEventExpression : ruleEventExpression EOF ;
    public final void entryRuleEventExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:230:1: ( ruleEventExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:231:1: ruleEventExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventExpression_in_entryRuleEventExpression427);
            ruleEventExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExpression434); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:238:1: ruleEventExpression : ( ( rule__EventExpression__Group__0 ) ) ;
    public final void ruleEventExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:242:2: ( ( ( rule__EventExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:243:1: ( ( rule__EventExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:243:1: ( ( rule__EventExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:244:1: ( rule__EventExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:245:1: ( rule__EventExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:245:2: rule__EventExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__0_in_ruleEventExpression460);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:257:1: entryRuleCoordinationRule : ruleCoordinationRule EOF ;
    public final void entryRuleCoordinationRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:258:1: ( ruleCoordinationRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:259:1: ruleCoordinationRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoordinationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule487);
            ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoordinationRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinationRule494); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:266:1: ruleCoordinationRule : ( ( rule__CoordinationRule__EventRelationsAssignment ) ) ;
    public final void ruleCoordinationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:270:2: ( ( ( rule__CoordinationRule__EventRelationsAssignment ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:271:1: ( ( rule__CoordinationRule__EventRelationsAssignment ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:271:1: ( ( rule__CoordinationRule__EventRelationsAssignment ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:272:1: ( rule__CoordinationRule__EventRelationsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoordinationRuleAccess().getEventRelationsAssignment()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:273:1: ( rule__CoordinationRule__EventRelationsAssignment )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:273:2: rule__CoordinationRule__EventRelationsAssignment
            {
            pushFollow(FOLLOW_rule__CoordinationRule__EventRelationsAssignment_in_ruleCoordinationRule520);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:285:1: entryRuleEventRelation : ruleEventRelation EOF ;
    public final void entryRuleEventRelation() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:286:1: ( ruleEventRelation EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:287:1: ruleEventRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationRule()); 
            }
            pushFollow(FOLLOW_ruleEventRelation_in_entryRuleEventRelation547);
            ruleEventRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRelation554); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:294:1: ruleEventRelation : ( ( rule__EventRelation__Group__0 ) ) ;
    public final void ruleEventRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:298:2: ( ( ( rule__EventRelation__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:299:1: ( ( rule__EventRelation__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:299:1: ( ( rule__EventRelation__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:300:1: ( rule__EventRelation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:301:1: ( rule__EventRelation__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:301:2: rule__EventRelation__Group__0
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__0_in_ruleEventRelation580);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:313:1: entryRuleImportLibRule : ruleImportLibRule EOF ;
    public final void entryRuleImportLibRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:314:1: ( ruleImportLibRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:315:1: ruleImportLibRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule607);
            ruleImportLibRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportLibRule614); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:322:1: ruleImportLibRule : ( ( rule__ImportLibRule__Group__0 ) ) ;
    public final void ruleImportLibRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:326:2: ( ( ( rule__ImportLibRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:327:1: ( ( rule__ImportLibRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:327:1: ( ( rule__ImportLibRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:328:1: ( rule__ImportLibRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:329:1: ( rule__ImportLibRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:329:2: rule__ImportLibRule__Group__0
            {
            pushFollow(FOLLOW_rule__ImportLibRule__Group__0_in_ruleImportLibRule640);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:341:1: entryRuleImportInterfaceRule : ruleImportInterfaceRule EOF ;
    public final void entryRuleImportInterfaceRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:342:1: ( ruleImportInterfaceRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:343:1: ruleImportInterfaceRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule667);
            ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportInterfaceRule674); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:350:1: ruleImportInterfaceRule : ( ( rule__ImportInterfaceRule__Group__0 ) ) ;
    public final void ruleImportInterfaceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:354:2: ( ( ( rule__ImportInterfaceRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:355:1: ( ( rule__ImportInterfaceRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:355:1: ( ( rule__ImportInterfaceRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:356:1: ( rule__ImportInterfaceRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:357:1: ( rule__ImportInterfaceRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:357:2: rule__ImportInterfaceRule__Group__0
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__0_in_ruleImportInterfaceRule700);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:371:1: entryRuleGImportStatement : ruleGImportStatement EOF ;
    public final void entryRuleGImportStatement() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:372:1: ( ruleGImportStatement EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:373:1: ruleGImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement729);
            ruleGImportStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGImportStatement736); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:380:1: ruleGImportStatement : ( ( rule__GImportStatement__Group__0 ) ) ;
    public final void ruleGImportStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:384:2: ( ( ( rule__GImportStatement__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:385:1: ( ( rule__GImportStatement__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:385:1: ( ( rule__GImportStatement__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:386:1: ( rule__GImportStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:387:1: ( rule__GImportStatement__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:387:2: rule__GImportStatement__Group__0
            {
            pushFollow(FOLLOW_rule__GImportStatement__Group__0_in_ruleGImportStatement762);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:399:1: entryRuleGExpression : ruleGExpression EOF ;
    public final void entryRuleGExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:400:1: ( ruleGExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:401:1: ruleGExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_entryRuleGExpression789);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGExpression796); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:408:1: ruleGExpression : ( ruleGOrExpression ) ;
    public final void ruleGExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:412:2: ( ( ruleGOrExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:413:1: ( ruleGOrExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:413:1: ( ruleGOrExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:414:1: ruleGOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_ruleGExpression822);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:427:1: entryRuleGOrExpression : ruleGOrExpression EOF ;
    public final void entryRuleGOrExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:428:1: ( ruleGOrExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:429:1: ruleGOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression848);
            ruleGOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGOrExpression855); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:436:1: ruleGOrExpression : ( ( rule__GOrExpression__Group__0 ) ) ;
    public final void ruleGOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:440:2: ( ( ( rule__GOrExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:441:1: ( ( rule__GOrExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:441:1: ( ( rule__GOrExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:442:1: ( rule__GOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:443:1: ( rule__GOrExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:443:2: rule__GOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group__0_in_ruleGOrExpression881);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:455:1: entryRuleGXorExpression : ruleGXorExpression EOF ;
    public final void entryRuleGXorExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:456:1: ( ruleGXorExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:457:1: ruleGXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression908);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGXorExpression915); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:464:1: ruleGXorExpression : ( ( rule__GXorExpression__Group__0 ) ) ;
    public final void ruleGXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:468:2: ( ( ( rule__GXorExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:469:1: ( ( rule__GXorExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:469:1: ( ( rule__GXorExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:470:1: ( rule__GXorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:471:1: ( rule__GXorExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:471:2: rule__GXorExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group__0_in_ruleGXorExpression941);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:483:1: entryRuleGAndExpression : ruleGAndExpression EOF ;
    public final void entryRuleGAndExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:484:1: ( ruleGAndExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:485:1: ruleGAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression968);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAndExpression975); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:492:1: ruleGAndExpression : ( ( rule__GAndExpression__Group__0 ) ) ;
    public final void ruleGAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:496:2: ( ( ( rule__GAndExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:497:1: ( ( rule__GAndExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:497:1: ( ( rule__GAndExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:498:1: ( rule__GAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:499:1: ( rule__GAndExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:499:2: rule__GAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group__0_in_ruleGAndExpression1001);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:511:1: entryRuleGEqualityExpression : ruleGEqualityExpression EOF ;
    public final void entryRuleGEqualityExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:512:1: ( ruleGEqualityExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:513:1: ruleGEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression1028);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEqualityExpression1035); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:520:1: ruleGEqualityExpression : ( ( rule__GEqualityExpression__Group__0 ) ) ;
    public final void ruleGEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:524:2: ( ( ( rule__GEqualityExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:525:1: ( ( rule__GEqualityExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:525:1: ( ( rule__GEqualityExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:526:1: ( rule__GEqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:527:1: ( rule__GEqualityExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:527:2: rule__GEqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__0_in_ruleGEqualityExpression1061);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:539:1: entryRuleGRelationExpression : ruleGRelationExpression EOF ;
    public final void entryRuleGRelationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:540:1: ( ruleGRelationExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:541:1: ruleGRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression1088);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRelationExpression1095); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:548:1: ruleGRelationExpression : ( ( rule__GRelationExpression__Group__0 ) ) ;
    public final void ruleGRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:552:2: ( ( ( rule__GRelationExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:553:1: ( ( rule__GRelationExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:553:1: ( ( rule__GRelationExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:554:1: ( rule__GRelationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:555:1: ( rule__GRelationExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:555:2: rule__GRelationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group__0_in_ruleGRelationExpression1121);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:567:1: entryRuleGAdditionExpression : ruleGAdditionExpression EOF ;
    public final void entryRuleGAdditionExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:568:1: ( ruleGAdditionExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:569:1: ruleGAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression1148);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAdditionExpression1155); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:576:1: ruleGAdditionExpression : ( ( rule__GAdditionExpression__Group__0 ) ) ;
    public final void ruleGAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:580:2: ( ( ( rule__GAdditionExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:581:1: ( ( rule__GAdditionExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:581:1: ( ( rule__GAdditionExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:582:1: ( rule__GAdditionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:583:1: ( rule__GAdditionExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:583:2: rule__GAdditionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__0_in_ruleGAdditionExpression1181);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:595:1: entryRuleGMultiplicationExpression : ruleGMultiplicationExpression EOF ;
    public final void entryRuleGMultiplicationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:596:1: ( ruleGMultiplicationExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:597:1: ruleGMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression1208);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGMultiplicationExpression1215); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:604:1: ruleGMultiplicationExpression : ( ( rule__GMultiplicationExpression__Group__0 ) ) ;
    public final void ruleGMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:608:2: ( ( ( rule__GMultiplicationExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:609:1: ( ( rule__GMultiplicationExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:609:1: ( ( rule__GMultiplicationExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:610:1: ( rule__GMultiplicationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:611:1: ( rule__GMultiplicationExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:611:2: rule__GMultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__0_in_ruleGMultiplicationExpression1241);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:623:1: entryRuleGNegationExpression : ruleGNegationExpression EOF ;
    public final void entryRuleGNegationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:624:1: ( ruleGNegationExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:625:1: ruleGNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression1268);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNegationExpression1275); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:632:1: ruleGNegationExpression : ( ( rule__GNegationExpression__Alternatives ) ) ;
    public final void ruleGNegationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:636:2: ( ( ( rule__GNegationExpression__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:637:1: ( ( rule__GNegationExpression__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:637:1: ( ( rule__GNegationExpression__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:638:1: ( rule__GNegationExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:639:1: ( rule__GNegationExpression__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:639:2: rule__GNegationExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Alternatives_in_ruleGNegationExpression1301);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:651:1: entryRuleGNavigationExpression : ruleGNavigationExpression EOF ;
    public final void entryRuleGNavigationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:652:1: ( ruleGNavigationExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:653:1: ruleGNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression1328);
            ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNavigationExpression1335); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:660:1: ruleGNavigationExpression : ( ( rule__GNavigationExpression__Group__0 ) ) ;
    public final void ruleGNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:664:2: ( ( ( rule__GNavigationExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:665:1: ( ( rule__GNavigationExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:665:1: ( ( rule__GNavigationExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:666:1: ( rule__GNavigationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:667:1: ( rule__GNavigationExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:667:2: rule__GNavigationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__0_in_ruleGNavigationExpression1361);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:679:1: entryRuleGReferenceExpression : ruleGReferenceExpression EOF ;
    public final void entryRuleGReferenceExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:680:1: ( ruleGReferenceExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:681:1: ruleGReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression1388);
            ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGReferenceExpression1395); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:688:1: ruleGReferenceExpression : ( ( rule__GReferenceExpression__Alternatives ) ) ;
    public final void ruleGReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:692:2: ( ( ( rule__GReferenceExpression__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:693:1: ( ( rule__GReferenceExpression__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:693:1: ( ( rule__GReferenceExpression__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:694:1: ( rule__GReferenceExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:695:1: ( rule__GReferenceExpression__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:695:2: rule__GReferenceExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__Alternatives_in_ruleGReferenceExpression1421);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:707:1: entryRuleGPrimaryExpression : ruleGPrimaryExpression EOF ;
    public final void entryRuleGPrimaryExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:708:1: ( ruleGPrimaryExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:709:1: ruleGPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression1448);
            ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGPrimaryExpression1455); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:716:1: ruleGPrimaryExpression : ( ( rule__GPrimaryExpression__Alternatives ) ) ;
    public final void ruleGPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:720:2: ( ( ( rule__GPrimaryExpression__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:721:1: ( ( rule__GPrimaryExpression__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:721:1: ( ( rule__GPrimaryExpression__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:722:1: ( rule__GPrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:723:1: ( rule__GPrimaryExpression__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:723:2: rule__GPrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GPrimaryExpression__Alternatives_in_ruleGPrimaryExpression1481);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:735:1: entryRuleGStringExpression : ruleGStringExpression EOF ;
    public final void entryRuleGStringExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:736:1: ( ruleGStringExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:737:1: ruleGStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression1508);
            ruleGStringExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGStringExpression1515); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:744:1: ruleGStringExpression : ( ( rule__GStringExpression__Group__0 ) ) ;
    public final void ruleGStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:748:2: ( ( ( rule__GStringExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:749:1: ( ( rule__GStringExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:749:1: ( ( rule__GStringExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:750:1: ( rule__GStringExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:751:1: ( rule__GStringExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:751:2: rule__GStringExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GStringExpression__Group__0_in_ruleGStringExpression1541);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:763:1: entryRuleGBooleanExpression : ruleGBooleanExpression EOF ;
    public final void entryRuleGBooleanExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:764:1: ( ruleGBooleanExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:765:1: ruleGBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression1568);
            ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBooleanExpression1575); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:772:1: ruleGBooleanExpression : ( ( rule__GBooleanExpression__Group__0 ) ) ;
    public final void ruleGBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:776:2: ( ( ( rule__GBooleanExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:777:1: ( ( rule__GBooleanExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:777:1: ( ( rule__GBooleanExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:778:1: ( rule__GBooleanExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:779:1: ( rule__GBooleanExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:779:2: rule__GBooleanExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__0_in_ruleGBooleanExpression1601);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:791:1: entryRuleGNumericExpression : ruleGNumericExpression EOF ;
    public final void entryRuleGNumericExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:792:1: ( ruleGNumericExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:793:1: ruleGNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression1628);
            ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNumericExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNumericExpression1635); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:800:1: ruleGNumericExpression : ( ( rule__GNumericExpression__Alternatives ) ) ;
    public final void ruleGNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:804:2: ( ( ( rule__GNumericExpression__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:805:1: ( ( rule__GNumericExpression__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:805:1: ( ( rule__GNumericExpression__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:806:1: ( rule__GNumericExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNumericExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:807:1: ( rule__GNumericExpression__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:807:2: rule__GNumericExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GNumericExpression__Alternatives_in_ruleGNumericExpression1661);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:819:1: entryRuleGIntegerExpression : ruleGIntegerExpression EOF ;
    public final void entryRuleGIntegerExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:820:1: ( ruleGIntegerExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:821:1: ruleGIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression1688);
            ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIntegerExpression1695); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:828:1: ruleGIntegerExpression : ( ( rule__GIntegerExpression__Group__0 ) ) ;
    public final void ruleGIntegerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:832:2: ( ( ( rule__GIntegerExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:833:1: ( ( rule__GIntegerExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:833:1: ( ( rule__GIntegerExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:834:1: ( rule__GIntegerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:835:1: ( rule__GIntegerExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:835:2: rule__GIntegerExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__0_in_ruleGIntegerExpression1721);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:847:1: entryRuleGDoubleExpression : ruleGDoubleExpression EOF ;
    public final void entryRuleGDoubleExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:848:1: ( ruleGDoubleExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:849:1: ruleGDoubleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression1748);
            ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDoubleExpression1755); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:856:1: ruleGDoubleExpression : ( ( rule__GDoubleExpression__Group__0 ) ) ;
    public final void ruleGDoubleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:860:2: ( ( ( rule__GDoubleExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:861:1: ( ( rule__GDoubleExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:861:1: ( ( rule__GDoubleExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:862:1: ( rule__GDoubleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:863:1: ( rule__GDoubleExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:863:2: rule__GDoubleExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__0_in_ruleGDoubleExpression1781);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:875:1: entryRuleGEnumLiteralExpression : ruleGEnumLiteralExpression EOF ;
    public final void entryRuleGEnumLiteralExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:876:1: ( ruleGEnumLiteralExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:877:1: ruleGEnumLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression1808);
            ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEnumLiteralExpression1815); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:884:1: ruleGEnumLiteralExpression : ( ( rule__GEnumLiteralExpression__Group__0 ) ) ;
    public final void ruleGEnumLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:888:2: ( ( ( rule__GEnumLiteralExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:889:1: ( ( rule__GEnumLiteralExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:889:1: ( ( rule__GEnumLiteralExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:890:1: ( rule__GEnumLiteralExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:891:1: ( rule__GEnumLiteralExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:891:2: rule__GEnumLiteralExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__0_in_ruleGEnumLiteralExpression1841);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:903:1: entryRuleGIfExpression : ruleGIfExpression EOF ;
    public final void entryRuleGIfExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:904:1: ( ruleGIfExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:905:1: ruleGIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression1868);
            ruleGIfExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIfExpression1875); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:912:1: ruleGIfExpression : ( ( rule__GIfExpression__Group__0 ) ) ;
    public final void ruleGIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:916:2: ( ( ( rule__GIfExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:917:1: ( ( rule__GIfExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:917:1: ( ( rule__GIfExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:918:1: ( rule__GIfExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:919:1: ( rule__GIfExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:919:2: rule__GIfExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__0_in_ruleGIfExpression1901);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:931:1: entryRuleGBraceExpression : ruleGBraceExpression EOF ;
    public final void entryRuleGBraceExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:932:1: ( ruleGBraceExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:933:1: ruleGBraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression1928);
            ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBraceExpression1935); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:940:1: ruleGBraceExpression : ( ( rule__GBraceExpression__Group__0 ) ) ;
    public final void ruleGBraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:944:2: ( ( ( rule__GBraceExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:945:1: ( ( rule__GBraceExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:945:1: ( ( rule__GBraceExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:946:1: ( rule__GBraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:947:1: ( rule__GBraceExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:947:2: rule__GBraceExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__0_in_ruleGBraceExpression1961);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:959:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:960:1: ( ruleQualifiedName EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:961:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1988);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1995); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:968:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:972:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:973:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:973:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:974:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:975:1: ( rule__QualifiedName__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:975:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2021);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:988:1: ruleGAndOperator : ( ( 'and' ) ) ;
    public final void ruleGAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:992:1: ( ( ( 'and' ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:993:1: ( ( 'and' ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:993:1: ( ( 'and' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:994:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:995:1: ( 'and' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:995:3: 'and'
            {
            match(input,13,FOLLOW_13_in_ruleGAndOperator2059); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1008:1: ruleGXorOperator : ( ( 'xor' ) ) ;
    public final void ruleGXorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1012:1: ( ( ( 'xor' ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1013:1: ( ( 'xor' ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1013:1: ( ( 'xor' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1014:1: ( 'xor' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1015:1: ( 'xor' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1015:3: 'xor'
            {
            match(input,14,FOLLOW_14_in_ruleGXorOperator2098); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1028:1: ruleGOrOperator : ( ( 'or' ) ) ;
    public final void ruleGOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1032:1: ( ( ( 'or' ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1033:1: ( ( 'or' ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1033:1: ( ( 'or' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1034:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1035:1: ( 'or' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1035:3: 'or'
            {
            match(input,15,FOLLOW_15_in_ruleGOrOperator2137); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1048:1: ruleGEqualityOperator : ( ( rule__GEqualityOperator__Alternatives ) ) ;
    public final void ruleGEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1052:1: ( ( ( rule__GEqualityOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1053:1: ( ( rule__GEqualityOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1053:1: ( ( rule__GEqualityOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1054:1: ( rule__GEqualityOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1055:1: ( rule__GEqualityOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1055:2: rule__GEqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GEqualityOperator__Alternatives_in_ruleGEqualityOperator2175);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1067:1: ruleGRelationOperator : ( ( rule__GRelationOperator__Alternatives ) ) ;
    public final void ruleGRelationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1071:1: ( ( ( rule__GRelationOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1072:1: ( ( rule__GRelationOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1072:1: ( ( rule__GRelationOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1073:1: ( rule__GRelationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1074:1: ( rule__GRelationOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1074:2: rule__GRelationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GRelationOperator__Alternatives_in_ruleGRelationOperator2211);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1086:1: ruleGAdditionOperator : ( ( rule__GAdditionOperator__Alternatives ) ) ;
    public final void ruleGAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1090:1: ( ( ( rule__GAdditionOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1091:1: ( ( rule__GAdditionOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1091:1: ( ( rule__GAdditionOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1092:1: ( rule__GAdditionOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1093:1: ( rule__GAdditionOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1093:2: rule__GAdditionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GAdditionOperator__Alternatives_in_ruleGAdditionOperator2247);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1105:1: ruleGMultiplicationOperator : ( ( rule__GMultiplicationOperator__Alternatives ) ) ;
    public final void ruleGMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1109:1: ( ( ( rule__GMultiplicationOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1110:1: ( ( rule__GMultiplicationOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1110:1: ( ( rule__GMultiplicationOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1111:1: ( rule__GMultiplicationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1112:1: ( rule__GMultiplicationOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1112:2: rule__GMultiplicationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GMultiplicationOperator__Alternatives_in_ruleGMultiplicationOperator2283);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1124:1: ruleGNegationOperator : ( ( rule__GNegationOperator__Alternatives ) ) ;
    public final void ruleGNegationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1128:1: ( ( ( rule__GNegationOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1129:1: ( ( rule__GNegationOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1129:1: ( ( rule__GNegationOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1130:1: ( rule__GNegationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1131:1: ( rule__GNegationOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1131:2: rule__GNegationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GNegationOperator__Alternatives_in_ruleGNegationOperator2319);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1142:1: rule__GNegationExpression__Alternatives : ( ( ruleGNavigationExpression ) | ( ( rule__GNegationExpression__Group_1__0 ) ) );
    public final void rule__GNegationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1146:1: ( ( ruleGNavigationExpression ) | ( ( rule__GNegationExpression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_DOUBLE)||LA1_0==33||(LA1_0>=45 && LA1_0<=46)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=26 && LA1_0<=27)) ) {
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1147:1: ( ruleGNavigationExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1147:1: ( ruleGNavigationExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1148:1: ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__Alternatives2354);
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1153:6: ( ( rule__GNegationExpression__Group_1__0 ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1153:6: ( ( rule__GNegationExpression__Group_1__0 ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1154:1: ( rule__GNegationExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationExpressionAccess().getGroup_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1155:1: ( rule__GNegationExpression__Group_1__0 )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1155:2: rule__GNegationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GNegationExpression__Group_1__0_in_rule__GNegationExpression__Alternatives2371);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1164:1: rule__GReferenceExpression__Alternatives : ( ( ruleGPrimaryExpression ) | ( ( rule__GReferenceExpression__Group_1__0 ) ) );
    public final void rule__GReferenceExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1168:1: ( ( ruleGPrimaryExpression ) | ( ( rule__GReferenceExpression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING||(LA2_0>=RULE_BOOLEAN && LA2_0<=RULE_DOUBLE)||LA2_0==33||(LA2_0>=45 && LA2_0<=46)) ) {
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1169:1: ( ruleGPrimaryExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1169:1: ( ruleGPrimaryExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1170:1: ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGPrimaryExpression_in_rule__GReferenceExpression__Alternatives2404);
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1175:6: ( ( rule__GReferenceExpression__Group_1__0 ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1175:6: ( ( rule__GReferenceExpression__Group_1__0 ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1176:1: ( rule__GReferenceExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGReferenceExpressionAccess().getGroup_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1177:1: ( rule__GReferenceExpression__Group_1__0 )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1177:2: rule__GReferenceExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__0_in_rule__GReferenceExpression__Alternatives2421);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1186:1: rule__GPrimaryExpression__Alternatives : ( ( ruleGStringExpression ) | ( ruleGBooleanExpression ) | ( ruleGNumericExpression ) | ( ruleGEnumLiteralExpression ) | ( ruleGIfExpression ) | ( ruleGBraceExpression ) );
    public final void rule__GPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1190:1: ( ( ruleGStringExpression ) | ( ruleGBooleanExpression ) | ( ruleGNumericExpression ) | ( ruleGEnumLiteralExpression ) | ( ruleGIfExpression ) | ( ruleGBraceExpression ) )
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
            case 45:
                {
                alt3=4;
                }
                break;
            case 46:
                {
                alt3=5;
                }
                break;
            case 33:
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1191:1: ( ruleGStringExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1191:1: ( ruleGStringExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1192:1: ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGStringExpression_in_rule__GPrimaryExpression__Alternatives2454);
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1197:6: ( ruleGBooleanExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1197:6: ( ruleGBooleanExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1198:1: ruleGBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGBooleanExpression_in_rule__GPrimaryExpression__Alternatives2471);
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1203:6: ( ruleGNumericExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1203:6: ( ruleGNumericExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1204:1: ruleGNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleGNumericExpression_in_rule__GPrimaryExpression__Alternatives2488);
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1209:6: ( ruleGEnumLiteralExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1209:6: ( ruleGEnumLiteralExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1210:1: ruleGEnumLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_rule__GPrimaryExpression__Alternatives2505);
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1215:6: ( ruleGIfExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1215:6: ( ruleGIfExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1216:1: ruleGIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleGIfExpression_in_rule__GPrimaryExpression__Alternatives2522);
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1221:6: ( ruleGBraceExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1221:6: ( ruleGBraceExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1222:1: ruleGBraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleGBraceExpression_in_rule__GPrimaryExpression__Alternatives2539);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1232:1: rule__GNumericExpression__Alternatives : ( ( ruleGIntegerExpression ) | ( ruleGDoubleExpression ) );
    public final void rule__GNumericExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1236:1: ( ( ruleGIntegerExpression ) | ( ruleGDoubleExpression ) )
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1237:1: ( ruleGIntegerExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1237:1: ( ruleGIntegerExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1238:1: ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGIntegerExpression_in_rule__GNumericExpression__Alternatives2571);
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1243:6: ( ruleGDoubleExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1243:6: ( ruleGDoubleExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1244:1: ruleGDoubleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGDoubleExpression_in_rule__GNumericExpression__Alternatives2588);
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


    // $ANTLR start "rule__GEqualityOperator__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1254:1: rule__GEqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<>' ) ) );
    public final void rule__GEqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1258:1: ( ( ( '=' ) ) | ( ( '<>' ) ) )
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1259:1: ( ( '=' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1259:1: ( ( '=' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1260:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1261:1: ( '=' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1261:3: '='
                    {
                    match(input,16,FOLLOW_16_in_rule__GEqualityOperator__Alternatives2621); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1266:6: ( ( '<>' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1266:6: ( ( '<>' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1267:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1268:1: ( '<>' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1268:3: '<>'
                    {
                    match(input,17,FOLLOW_17_in_rule__GEqualityOperator__Alternatives2642); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1278:1: rule__GRelationOperator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__GRelationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1282:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1283:1: ( ( '<' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1283:1: ( ( '<' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1284:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1285:1: ( '<' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1285:3: '<'
                    {
                    match(input,18,FOLLOW_18_in_rule__GRelationOperator__Alternatives2678); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1290:6: ( ( '>' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1290:6: ( ( '>' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1291:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1292:1: ( '>' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1292:3: '>'
                    {
                    match(input,19,FOLLOW_19_in_rule__GRelationOperator__Alternatives2699); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1297:6: ( ( '<=' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1297:6: ( ( '<=' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1298:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1299:1: ( '<=' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1299:3: '<='
                    {
                    match(input,20,FOLLOW_20_in_rule__GRelationOperator__Alternatives2720); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1304:6: ( ( '>=' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1304:6: ( ( '>=' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1305:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1306:1: ( '>=' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1306:3: '>='
                    {
                    match(input,21,FOLLOW_21_in_rule__GRelationOperator__Alternatives2741); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1316:1: rule__GAdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__GAdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1320:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1321:1: ( ( '+' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1321:1: ( ( '+' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1322:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1323:1: ( '+' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1323:3: '+'
                    {
                    match(input,22,FOLLOW_22_in_rule__GAdditionOperator__Alternatives2777); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1328:6: ( ( '-' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1328:6: ( ( '-' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1329:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1330:1: ( '-' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1330:3: '-'
                    {
                    match(input,23,FOLLOW_23_in_rule__GAdditionOperator__Alternatives2798); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1340:1: rule__GMultiplicationOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__GMultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1344:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1345:1: ( ( '*' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1345:1: ( ( '*' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1346:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1347:1: ( '*' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1347:3: '*'
                    {
                    match(input,24,FOLLOW_24_in_rule__GMultiplicationOperator__Alternatives2834); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1352:6: ( ( '/' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1352:6: ( ( '/' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1353:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1354:1: ( '/' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1354:3: '/'
                    {
                    match(input,25,FOLLOW_25_in_rule__GMultiplicationOperator__Alternatives2855); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1364:1: rule__GNegationOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '~' ) ) );
    public final void rule__GNegationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1368:1: ( ( ( 'not' ) ) | ( ( '~' ) ) )
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
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1369:1: ( ( 'not' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1369:1: ( ( 'not' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1370:1: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1371:1: ( 'not' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1371:3: 'not'
                    {
                    match(input,26,FOLLOW_26_in_rule__GNegationOperator__Alternatives2891); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1376:6: ( ( '~' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1376:6: ( ( '~' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1377:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1378:1: ( '~' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1378:3: '~'
                    {
                    match(input,27,FOLLOW_27_in_rule__GNegationOperator__Alternatives2912); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1390:1: rule__BCoolSpec__Group__0 : rule__BCoolSpec__Group__0__Impl rule__BCoolSpec__Group__1 ;
    public final void rule__BCoolSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1394:1: ( rule__BCoolSpec__Group__0__Impl rule__BCoolSpec__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1395:2: rule__BCoolSpec__Group__0__Impl rule__BCoolSpec__Group__1
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__0__Impl_in_rule__BCoolSpec__Group__02945);
            rule__BCoolSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolSpec__Group__1_in_rule__BCoolSpec__Group__02948);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1402:1: rule__BCoolSpec__Group__0__Impl : ( ( rule__BCoolSpec__NameAssignment_0 )? ) ;
    public final void rule__BCoolSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1406:1: ( ( ( rule__BCoolSpec__NameAssignment_0 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1407:1: ( ( rule__BCoolSpec__NameAssignment_0 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1407:1: ( ( rule__BCoolSpec__NameAssignment_0 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1408:1: ( rule__BCoolSpec__NameAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getNameAssignment_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1409:1: ( rule__BCoolSpec__NameAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1409:2: rule__BCoolSpec__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BCoolSpec__NameAssignment_0_in_rule__BCoolSpec__Group__0__Impl2975);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1419:1: rule__BCoolSpec__Group__1 : rule__BCoolSpec__Group__1__Impl rule__BCoolSpec__Group__2 ;
    public final void rule__BCoolSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1423:1: ( rule__BCoolSpec__Group__1__Impl rule__BCoolSpec__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1424:2: rule__BCoolSpec__Group__1__Impl rule__BCoolSpec__Group__2
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__1__Impl_in_rule__BCoolSpec__Group__13006);
            rule__BCoolSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolSpec__Group__2_in_rule__BCoolSpec__Group__13009);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1431:1: rule__BCoolSpec__Group__1__Impl : ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) ) ;
    public final void rule__BCoolSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1435:1: ( ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1436:1: ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1436:1: ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1437:1: ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1437:1: ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1438:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1439:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1439:2: rule__BCoolSpec__ImportsLibAssignment_1
            {
            pushFollow(FOLLOW_rule__BCoolSpec__ImportsLibAssignment_1_in_rule__BCoolSpec__Group__1__Impl3038);
            rule__BCoolSpec__ImportsLibAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }

            }

            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1442:1: ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1443:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1444:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==40) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1444:2: rule__BCoolSpec__ImportsLibAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__BCoolSpec__ImportsLibAssignment_1_in_rule__BCoolSpec__Group__1__Impl3050);
            	    rule__BCoolSpec__ImportsLibAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1455:1: rule__BCoolSpec__Group__2 : rule__BCoolSpec__Group__2__Impl rule__BCoolSpec__Group__3 ;
    public final void rule__BCoolSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1459:1: ( rule__BCoolSpec__Group__2__Impl rule__BCoolSpec__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1460:2: rule__BCoolSpec__Group__2__Impl rule__BCoolSpec__Group__3
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__2__Impl_in_rule__BCoolSpec__Group__23083);
            rule__BCoolSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolSpec__Group__3_in_rule__BCoolSpec__Group__23086);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1467:1: rule__BCoolSpec__Group__2__Impl : ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) ) ;
    public final void rule__BCoolSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1471:1: ( ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1472:1: ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1472:1: ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1473:1: ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1473:1: ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1474:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1475:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1475:2: rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2
            {
            pushFollow(FOLLOW_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2_in_rule__BCoolSpec__Group__2__Impl3115);
            rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }

            }

            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1478:1: ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1479:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1480:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1480:2: rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2_in_rule__BCoolSpec__Group__2__Impl3127);
            	    rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1491:1: rule__BCoolSpec__Group__3 : rule__BCoolSpec__Group__3__Impl ;
    public final void rule__BCoolSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1495:1: ( rule__BCoolSpec__Group__3__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1496:2: rule__BCoolSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__3__Impl_in_rule__BCoolSpec__Group__33160);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1502:1: rule__BCoolSpec__Group__3__Impl : ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) ) ;
    public final void rule__BCoolSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1506:1: ( ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1507:1: ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1507:1: ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1508:1: ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1508:1: ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1509:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1510:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1510:2: rule__BCoolSpec__BcoolOperatorsAssignment_3
            {
            pushFollow(FOLLOW_rule__BCoolSpec__BcoolOperatorsAssignment_3_in_rule__BCoolSpec__Group__3__Impl3189);
            rule__BCoolSpec__BcoolOperatorsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }

            }

            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1513:1: ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1514:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1515:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1515:2: rule__BCoolSpec__BcoolOperatorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BCoolSpec__BcoolOperatorsAssignment_3_in_rule__BCoolSpec__Group__3__Impl3201);
            	    rule__BCoolSpec__BcoolOperatorsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1534:1: rule__BCoolOperatorSpec__Group__0 : rule__BCoolOperatorSpec__Group__0__Impl rule__BCoolOperatorSpec__Group__1 ;
    public final void rule__BCoolOperatorSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1538:1: ( rule__BCoolOperatorSpec__Group__0__Impl rule__BCoolOperatorSpec__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1539:2: rule__BCoolOperatorSpec__Group__0__Impl rule__BCoolOperatorSpec__Group__1
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__0__Impl_in_rule__BCoolOperatorSpec__Group__03242);
            rule__BCoolOperatorSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__1_in_rule__BCoolOperatorSpec__Group__03245);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1546:1: rule__BCoolOperatorSpec__Group__0__Impl : ( 'Spec' ) ;
    public final void rule__BCoolOperatorSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1550:1: ( ( 'Spec' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1551:1: ( 'Spec' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1551:1: ( 'Spec' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1552:1: 'Spec'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getSpecKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__BCoolOperatorSpec__Group__0__Impl3273); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getSpecKeyword_0()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1565:1: rule__BCoolOperatorSpec__Group__1 : rule__BCoolOperatorSpec__Group__1__Impl rule__BCoolOperatorSpec__Group__2 ;
    public final void rule__BCoolOperatorSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1569:1: ( rule__BCoolOperatorSpec__Group__1__Impl rule__BCoolOperatorSpec__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1570:2: rule__BCoolOperatorSpec__Group__1__Impl rule__BCoolOperatorSpec__Group__2
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__1__Impl_in_rule__BCoolOperatorSpec__Group__13304);
            rule__BCoolOperatorSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__2_in_rule__BCoolOperatorSpec__Group__13307);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1577:1: rule__BCoolOperatorSpec__Group__1__Impl : ( ( rule__BCoolOperatorSpec__NameAssignment_1 ) ) ;
    public final void rule__BCoolOperatorSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1581:1: ( ( ( rule__BCoolOperatorSpec__NameAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1582:1: ( ( rule__BCoolOperatorSpec__NameAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1582:1: ( ( rule__BCoolOperatorSpec__NameAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1583:1: ( rule__BCoolOperatorSpec__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getNameAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1584:1: ( rule__BCoolOperatorSpec__NameAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1584:2: rule__BCoolOperatorSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__NameAssignment_1_in_rule__BCoolOperatorSpec__Group__1__Impl3334);
            rule__BCoolOperatorSpec__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getNameAssignment_1()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1594:1: rule__BCoolOperatorSpec__Group__2 : rule__BCoolOperatorSpec__Group__2__Impl rule__BCoolOperatorSpec__Group__3 ;
    public final void rule__BCoolOperatorSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1598:1: ( rule__BCoolOperatorSpec__Group__2__Impl rule__BCoolOperatorSpec__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1599:2: rule__BCoolOperatorSpec__Group__2__Impl rule__BCoolOperatorSpec__Group__3
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__2__Impl_in_rule__BCoolOperatorSpec__Group__23364);
            rule__BCoolOperatorSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__3_in_rule__BCoolOperatorSpec__Group__23367);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1606:1: rule__BCoolOperatorSpec__Group__2__Impl : ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )? ) ;
    public final void rule__BCoolOperatorSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1610:1: ( ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1611:1: ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1611:1: ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1612:1: ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1613:1: ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1613:2: rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2_in_rule__BCoolOperatorSpec__Group__2__Impl3394);
                    rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsAssignment_2()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1623:1: rule__BCoolOperatorSpec__Group__3 : rule__BCoolOperatorSpec__Group__3__Impl rule__BCoolOperatorSpec__Group__4 ;
    public final void rule__BCoolOperatorSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1627:1: ( rule__BCoolOperatorSpec__Group__3__Impl rule__BCoolOperatorSpec__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1628:2: rule__BCoolOperatorSpec__Group__3__Impl rule__BCoolOperatorSpec__Group__4
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__3__Impl_in_rule__BCoolOperatorSpec__Group__33425);
            rule__BCoolOperatorSpec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__4_in_rule__BCoolOperatorSpec__Group__33428);
            rule__BCoolOperatorSpec__Group__4();

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1635:1: rule__BCoolOperatorSpec__Group__3__Impl : ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )? ) ;
    public final void rule__BCoolOperatorSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1639:1: ( ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1640:1: ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1640:1: ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1641:1: ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsAssignment_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1642:1: ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1642:2: rule__BCoolOperatorSpec__GlobalDSEsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__BCoolOperatorSpec__GlobalDSEsAssignment_3_in_rule__BCoolOperatorSpec__Group__3__Impl3455);
                    rule__BCoolOperatorSpec__GlobalDSEsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsAssignment_3()); 
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


    // $ANTLR start "rule__BCoolOperatorSpec__Group__4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1652:1: rule__BCoolOperatorSpec__Group__4 : rule__BCoolOperatorSpec__Group__4__Impl ;
    public final void rule__BCoolOperatorSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1656:1: ( rule__BCoolOperatorSpec__Group__4__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1657:2: rule__BCoolOperatorSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__4__Impl_in_rule__BCoolOperatorSpec__Group__43486);
            rule__BCoolOperatorSpec__Group__4__Impl();

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
    // $ANTLR end "rule__BCoolOperatorSpec__Group__4"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__4__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1663:1: rule__BCoolOperatorSpec__Group__4__Impl : ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* ) ) ;
    public final void rule__BCoolOperatorSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1667:1: ( ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1668:1: ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1668:1: ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1669:1: ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1669:1: ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1670:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1671:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1671:2: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4_in_rule__BCoolOperatorSpec__Group__4__Impl3515);
            rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_4()); 
            }

            }

            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1674:1: ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1675:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1676:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1676:2: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4_in_rule__BCoolOperatorSpec__Group__4__Impl3527);
            	    rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_4()); 
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
    // $ANTLR end "rule__BCoolOperatorSpec__Group__4__Impl"


    // $ANTLR start "rule__GlobalDSEsRule__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1697:1: rule__GlobalDSEsRule__Group__0 : rule__GlobalDSEsRule__Group__0__Impl rule__GlobalDSEsRule__Group__1 ;
    public final void rule__GlobalDSEsRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1701:1: ( rule__GlobalDSEsRule__Group__0__Impl rule__GlobalDSEsRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1702:2: rule__GlobalDSEsRule__Group__0__Impl rule__GlobalDSEsRule__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__0__Impl_in_rule__GlobalDSEsRule__Group__03570);
            rule__GlobalDSEsRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__1_in_rule__GlobalDSEsRule__Group__03573);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1709:1: rule__GlobalDSEsRule__Group__0__Impl : ( 'Event' ) ;
    public final void rule__GlobalDSEsRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1713:1: ( ( 'Event' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1714:1: ( 'Event' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1714:1: ( 'Event' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1715:1: 'Event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getEventKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__GlobalDSEsRule__Group__0__Impl3601); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getEventKeyword_0()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1728:1: rule__GlobalDSEsRule__Group__1 : rule__GlobalDSEsRule__Group__1__Impl rule__GlobalDSEsRule__Group__2 ;
    public final void rule__GlobalDSEsRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1732:1: ( rule__GlobalDSEsRule__Group__1__Impl rule__GlobalDSEsRule__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1733:2: rule__GlobalDSEsRule__Group__1__Impl rule__GlobalDSEsRule__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__1__Impl_in_rule__GlobalDSEsRule__Group__13632);
            rule__GlobalDSEsRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__2_in_rule__GlobalDSEsRule__Group__13635);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1740:1: rule__GlobalDSEsRule__Group__1__Impl : ( ( rule__GlobalDSEsRule__NameAssignment_1 ) ) ;
    public final void rule__GlobalDSEsRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1744:1: ( ( ( rule__GlobalDSEsRule__NameAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1745:1: ( ( rule__GlobalDSEsRule__NameAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1745:1: ( ( rule__GlobalDSEsRule__NameAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1746:1: ( rule__GlobalDSEsRule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getNameAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1747:1: ( rule__GlobalDSEsRule__NameAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1747:2: rule__GlobalDSEsRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__NameAssignment_1_in_rule__GlobalDSEsRule__Group__1__Impl3662);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1757:1: rule__GlobalDSEsRule__Group__2 : rule__GlobalDSEsRule__Group__2__Impl ;
    public final void rule__GlobalDSEsRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1761:1: ( rule__GlobalDSEsRule__Group__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1762:2: rule__GlobalDSEsRule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__2__Impl_in_rule__GlobalDSEsRule__Group__23692);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1768:1: rule__GlobalDSEsRule__Group__2__Impl : ( ';' ) ;
    public final void rule__GlobalDSEsRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1772:1: ( ( ';' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1773:1: ( ';' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1773:1: ( ';' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1774:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getSemicolonKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__GlobalDSEsRule__Group__2__Impl3720); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1793:1: rule__GlobalEventExpressionRule__Group__0 : rule__GlobalEventExpressionRule__Group__0__Impl rule__GlobalEventExpressionRule__Group__1 ;
    public final void rule__GlobalEventExpressionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1797:1: ( rule__GlobalEventExpressionRule__Group__0__Impl rule__GlobalEventExpressionRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1798:2: rule__GlobalEventExpressionRule__Group__0__Impl rule__GlobalEventExpressionRule__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalEventExpressionRule__Group__0__Impl_in_rule__GlobalEventExpressionRule__Group__03757);
            rule__GlobalEventExpressionRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalEventExpressionRule__Group__1_in_rule__GlobalEventExpressionRule__Group__03760);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1805:1: rule__GlobalEventExpressionRule__Group__0__Impl : ( 'let' ) ;
    public final void rule__GlobalEventExpressionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1809:1: ( ( 'let' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1810:1: ( 'let' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1810:1: ( 'let' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1811:1: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleAccess().getLetKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__GlobalEventExpressionRule__Group__0__Impl3788); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1824:1: rule__GlobalEventExpressionRule__Group__1 : rule__GlobalEventExpressionRule__Group__1__Impl ;
    public final void rule__GlobalEventExpressionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1828:1: ( rule__GlobalEventExpressionRule__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1829:2: rule__GlobalEventExpressionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GlobalEventExpressionRule__Group__1__Impl_in_rule__GlobalEventExpressionRule__Group__13819);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1835:1: rule__GlobalEventExpressionRule__Group__1__Impl : ( ruleEventExpression ) ;
    public final void rule__GlobalEventExpressionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1839:1: ( ( ruleEventExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1840:1: ( ruleEventExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1840:1: ( ruleEventExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1841:1: ruleEventExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleAccess().getEventExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleEventExpression_in_rule__GlobalEventExpressionRule__Group__1__Impl3846);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1856:1: rule__BCoolCompositionRule__Group__0 : rule__BCoolCompositionRule__Group__0__Impl rule__BCoolCompositionRule__Group__1 ;
    public final void rule__BCoolCompositionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1860:1: ( rule__BCoolCompositionRule__Group__0__Impl rule__BCoolCompositionRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1861:2: rule__BCoolCompositionRule__Group__0__Impl rule__BCoolCompositionRule__Group__1
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__0__Impl_in_rule__BCoolCompositionRule__Group__03879);
            rule__BCoolCompositionRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__1_in_rule__BCoolCompositionRule__Group__03882);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1868:1: rule__BCoolCompositionRule__Group__0__Impl : ( 'Operator' ) ;
    public final void rule__BCoolCompositionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1872:1: ( ( 'Operator' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1873:1: ( 'Operator' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1873:1: ( 'Operator' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1874:1: 'Operator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getOperatorKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__BCoolCompositionRule__Group__0__Impl3910); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1887:1: rule__BCoolCompositionRule__Group__1 : rule__BCoolCompositionRule__Group__1__Impl rule__BCoolCompositionRule__Group__2 ;
    public final void rule__BCoolCompositionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1891:1: ( rule__BCoolCompositionRule__Group__1__Impl rule__BCoolCompositionRule__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1892:2: rule__BCoolCompositionRule__Group__1__Impl rule__BCoolCompositionRule__Group__2
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__1__Impl_in_rule__BCoolCompositionRule__Group__13941);
            rule__BCoolCompositionRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__2_in_rule__BCoolCompositionRule__Group__13944);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1899:1: rule__BCoolCompositionRule__Group__1__Impl : ( ( rule__BCoolCompositionRule__NameAssignment_1 ) ) ;
    public final void rule__BCoolCompositionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1903:1: ( ( ( rule__BCoolCompositionRule__NameAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1904:1: ( ( rule__BCoolCompositionRule__NameAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1904:1: ( ( rule__BCoolCompositionRule__NameAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1905:1: ( rule__BCoolCompositionRule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getNameAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1906:1: ( rule__BCoolCompositionRule__NameAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1906:2: rule__BCoolCompositionRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__NameAssignment_1_in_rule__BCoolCompositionRule__Group__1__Impl3971);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1916:1: rule__BCoolCompositionRule__Group__2 : rule__BCoolCompositionRule__Group__2__Impl rule__BCoolCompositionRule__Group__3 ;
    public final void rule__BCoolCompositionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1920:1: ( rule__BCoolCompositionRule__Group__2__Impl rule__BCoolCompositionRule__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1921:2: rule__BCoolCompositionRule__Group__2__Impl rule__BCoolCompositionRule__Group__3
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__2__Impl_in_rule__BCoolCompositionRule__Group__24001);
            rule__BCoolCompositionRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__3_in_rule__BCoolCompositionRule__Group__24004);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1928:1: rule__BCoolCompositionRule__Group__2__Impl : ( '(' ) ;
    public final void rule__BCoolCompositionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1932:1: ( ( '(' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1933:1: ( '(' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1933:1: ( '(' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1934:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__BCoolCompositionRule__Group__2__Impl4032); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1947:1: rule__BCoolCompositionRule__Group__3 : rule__BCoolCompositionRule__Group__3__Impl rule__BCoolCompositionRule__Group__4 ;
    public final void rule__BCoolCompositionRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1951:1: ( rule__BCoolCompositionRule__Group__3__Impl rule__BCoolCompositionRule__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1952:2: rule__BCoolCompositionRule__Group__3__Impl rule__BCoolCompositionRule__Group__4
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__3__Impl_in_rule__BCoolCompositionRule__Group__34063);
            rule__BCoolCompositionRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__4_in_rule__BCoolCompositionRule__Group__34066);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1959:1: rule__BCoolCompositionRule__Group__3__Impl : ( ( rule__BCoolCompositionRule__Group_3__0 )? ) ;
    public final void rule__BCoolCompositionRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1963:1: ( ( ( rule__BCoolCompositionRule__Group_3__0 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1964:1: ( ( rule__BCoolCompositionRule__Group_3__0 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1964:1: ( ( rule__BCoolCompositionRule__Group_3__0 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1965:1: ( rule__BCoolCompositionRule__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getGroup_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1966:1: ( rule__BCoolCompositionRule__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1966:2: rule__BCoolCompositionRule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_3__0_in_rule__BCoolCompositionRule__Group__3__Impl4093);
                    rule__BCoolCompositionRule__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getGroup_3()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1976:1: rule__BCoolCompositionRule__Group__4 : rule__BCoolCompositionRule__Group__4__Impl rule__BCoolCompositionRule__Group__5 ;
    public final void rule__BCoolCompositionRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1980:1: ( rule__BCoolCompositionRule__Group__4__Impl rule__BCoolCompositionRule__Group__5 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1981:2: rule__BCoolCompositionRule__Group__4__Impl rule__BCoolCompositionRule__Group__5
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__4__Impl_in_rule__BCoolCompositionRule__Group__44124);
            rule__BCoolCompositionRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__5_in_rule__BCoolCompositionRule__Group__44127);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1988:1: rule__BCoolCompositionRule__Group__4__Impl : ( ')' ) ;
    public final void rule__BCoolCompositionRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1992:1: ( ( ')' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1993:1: ( ')' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1993:1: ( ')' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1994:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,34,FOLLOW_34_in_rule__BCoolCompositionRule__Group__4__Impl4155); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_4()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2007:1: rule__BCoolCompositionRule__Group__5 : rule__BCoolCompositionRule__Group__5__Impl rule__BCoolCompositionRule__Group__6 ;
    public final void rule__BCoolCompositionRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2011:1: ( rule__BCoolCompositionRule__Group__5__Impl rule__BCoolCompositionRule__Group__6 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2012:2: rule__BCoolCompositionRule__Group__5__Impl rule__BCoolCompositionRule__Group__6
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__5__Impl_in_rule__BCoolCompositionRule__Group__54186);
            rule__BCoolCompositionRule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__6_in_rule__BCoolCompositionRule__Group__54189);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2019:1: rule__BCoolCompositionRule__Group__5__Impl : ( 'MatchingCorrespondance :' ) ;
    public final void rule__BCoolCompositionRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2023:1: ( ( 'MatchingCorrespondance :' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2024:1: ( 'MatchingCorrespondance :' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2024:1: ( 'MatchingCorrespondance :' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2025:1: 'MatchingCorrespondance :'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_5()); 
            }
            match(input,35,FOLLOW_35_in_rule__BCoolCompositionRule__Group__5__Impl4217); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_5()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2038:1: rule__BCoolCompositionRule__Group__6 : rule__BCoolCompositionRule__Group__6__Impl rule__BCoolCompositionRule__Group__7 ;
    public final void rule__BCoolCompositionRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2042:1: ( rule__BCoolCompositionRule__Group__6__Impl rule__BCoolCompositionRule__Group__7 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2043:2: rule__BCoolCompositionRule__Group__6__Impl rule__BCoolCompositionRule__Group__7
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__6__Impl_in_rule__BCoolCompositionRule__Group__64248);
            rule__BCoolCompositionRule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__7_in_rule__BCoolCompositionRule__Group__64251);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2050:1: rule__BCoolCompositionRule__Group__6__Impl : ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_6 ) ) ;
    public final void rule__BCoolCompositionRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2054:1: ( ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_6 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2055:1: ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_6 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2055:1: ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_6 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2056:1: ( rule__BCoolCompositionRule__MatchingRuleAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleAssignment_6()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2057:1: ( rule__BCoolCompositionRule__MatchingRuleAssignment_6 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2057:2: rule__BCoolCompositionRule__MatchingRuleAssignment_6
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__MatchingRuleAssignment_6_in_rule__BCoolCompositionRule__Group__6__Impl4278);
            rule__BCoolCompositionRule__MatchingRuleAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleAssignment_6()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2067:1: rule__BCoolCompositionRule__Group__7 : rule__BCoolCompositionRule__Group__7__Impl rule__BCoolCompositionRule__Group__8 ;
    public final void rule__BCoolCompositionRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2071:1: ( rule__BCoolCompositionRule__Group__7__Impl rule__BCoolCompositionRule__Group__8 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2072:2: rule__BCoolCompositionRule__Group__7__Impl rule__BCoolCompositionRule__Group__8
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__7__Impl_in_rule__BCoolCompositionRule__Group__74308);
            rule__BCoolCompositionRule__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__8_in_rule__BCoolCompositionRule__Group__74311);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2079:1: rule__BCoolCompositionRule__Group__7__Impl : ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_7 ) ) ;
    public final void rule__BCoolCompositionRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2083:1: ( ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_7 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2084:1: ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_7 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2084:1: ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_7 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2085:1: ( rule__BCoolCompositionRule__CoordinationRuleAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleAssignment_7()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2086:1: ( rule__BCoolCompositionRule__CoordinationRuleAssignment_7 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2086:2: rule__BCoolCompositionRule__CoordinationRuleAssignment_7
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__CoordinationRuleAssignment_7_in_rule__BCoolCompositionRule__Group__7__Impl4338);
            rule__BCoolCompositionRule__CoordinationRuleAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleAssignment_7()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2096:1: rule__BCoolCompositionRule__Group__8 : rule__BCoolCompositionRule__Group__8__Impl ;
    public final void rule__BCoolCompositionRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2100:1: ( rule__BCoolCompositionRule__Group__8__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2101:2: rule__BCoolCompositionRule__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__8__Impl_in_rule__BCoolCompositionRule__Group__84368);
            rule__BCoolCompositionRule__Group__8__Impl();

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2107:1: rule__BCoolCompositionRule__Group__8__Impl : ( 'end operator;' ) ;
    public final void rule__BCoolCompositionRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2111:1: ( ( 'end operator;' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2112:1: ( 'end operator;' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2112:1: ( 'end operator;' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2113:1: 'end operator;'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getEndOperatorKeyword_8()); 
            }
            match(input,36,FOLLOW_36_in_rule__BCoolCompositionRule__Group__8__Impl4396); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getEndOperatorKeyword_8()); 
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


    // $ANTLR start "rule__BCoolCompositionRule__Group_3__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2144:1: rule__BCoolCompositionRule__Group_3__0 : rule__BCoolCompositionRule__Group_3__0__Impl rule__BCoolCompositionRule__Group_3__1 ;
    public final void rule__BCoolCompositionRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2148:1: ( rule__BCoolCompositionRule__Group_3__0__Impl rule__BCoolCompositionRule__Group_3__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2149:2: rule__BCoolCompositionRule__Group_3__0__Impl rule__BCoolCompositionRule__Group_3__1
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_3__0__Impl_in_rule__BCoolCompositionRule__Group_3__04445);
            rule__BCoolCompositionRule__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_3__1_in_rule__BCoolCompositionRule__Group_3__04448);
            rule__BCoolCompositionRule__Group_3__1();

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
    // $ANTLR end "rule__BCoolCompositionRule__Group_3__0"


    // $ANTLR start "rule__BCoolCompositionRule__Group_3__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2156:1: rule__BCoolCompositionRule__Group_3__0__Impl : ( ( rule__BCoolCompositionRule__DSEsAssignment_3_0 ) ) ;
    public final void rule__BCoolCompositionRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2160:1: ( ( ( rule__BCoolCompositionRule__DSEsAssignment_3_0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2161:1: ( ( rule__BCoolCompositionRule__DSEsAssignment_3_0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2161:1: ( ( rule__BCoolCompositionRule__DSEsAssignment_3_0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2162:1: ( rule__BCoolCompositionRule__DSEsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getDSEsAssignment_3_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2163:1: ( rule__BCoolCompositionRule__DSEsAssignment_3_0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2163:2: rule__BCoolCompositionRule__DSEsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__DSEsAssignment_3_0_in_rule__BCoolCompositionRule__Group_3__0__Impl4475);
            rule__BCoolCompositionRule__DSEsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getDSEsAssignment_3_0()); 
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
    // $ANTLR end "rule__BCoolCompositionRule__Group_3__0__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group_3__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2173:1: rule__BCoolCompositionRule__Group_3__1 : rule__BCoolCompositionRule__Group_3__1__Impl ;
    public final void rule__BCoolCompositionRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2177:1: ( rule__BCoolCompositionRule__Group_3__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2178:2: rule__BCoolCompositionRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_3__1__Impl_in_rule__BCoolCompositionRule__Group_3__14505);
            rule__BCoolCompositionRule__Group_3__1__Impl();

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
    // $ANTLR end "rule__BCoolCompositionRule__Group_3__1"


    // $ANTLR start "rule__BCoolCompositionRule__Group_3__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2184:1: rule__BCoolCompositionRule__Group_3__1__Impl : ( ( rule__BCoolCompositionRule__Group_3_1__0 )* ) ;
    public final void rule__BCoolCompositionRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2188:1: ( ( ( rule__BCoolCompositionRule__Group_3_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2189:1: ( ( rule__BCoolCompositionRule__Group_3_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2189:1: ( ( rule__BCoolCompositionRule__Group_3_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2190:1: ( rule__BCoolCompositionRule__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getGroup_3_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2191:1: ( rule__BCoolCompositionRule__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2191:2: rule__BCoolCompositionRule__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_3_1__0_in_rule__BCoolCompositionRule__Group_3__1__Impl4532);
            	    rule__BCoolCompositionRule__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__BCoolCompositionRule__Group_3__1__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group_3_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2205:1: rule__BCoolCompositionRule__Group_3_1__0 : rule__BCoolCompositionRule__Group_3_1__0__Impl rule__BCoolCompositionRule__Group_3_1__1 ;
    public final void rule__BCoolCompositionRule__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2209:1: ( rule__BCoolCompositionRule__Group_3_1__0__Impl rule__BCoolCompositionRule__Group_3_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2210:2: rule__BCoolCompositionRule__Group_3_1__0__Impl rule__BCoolCompositionRule__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_3_1__0__Impl_in_rule__BCoolCompositionRule__Group_3_1__04567);
            rule__BCoolCompositionRule__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_3_1__1_in_rule__BCoolCompositionRule__Group_3_1__04570);
            rule__BCoolCompositionRule__Group_3_1__1();

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
    // $ANTLR end "rule__BCoolCompositionRule__Group_3_1__0"


    // $ANTLR start "rule__BCoolCompositionRule__Group_3_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2217:1: rule__BCoolCompositionRule__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__BCoolCompositionRule__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2221:1: ( ( ',' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2222:1: ( ',' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2222:1: ( ',' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2223:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__BCoolCompositionRule__Group_3_1__0__Impl4598); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_3_1_0()); 
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
    // $ANTLR end "rule__BCoolCompositionRule__Group_3_1__0__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group_3_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2236:1: rule__BCoolCompositionRule__Group_3_1__1 : rule__BCoolCompositionRule__Group_3_1__1__Impl ;
    public final void rule__BCoolCompositionRule__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2240:1: ( rule__BCoolCompositionRule__Group_3_1__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2241:2: rule__BCoolCompositionRule__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_3_1__1__Impl_in_rule__BCoolCompositionRule__Group_3_1__14629);
            rule__BCoolCompositionRule__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__BCoolCompositionRule__Group_3_1__1"


    // $ANTLR start "rule__BCoolCompositionRule__Group_3_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2247:1: rule__BCoolCompositionRule__Group_3_1__1__Impl : ( ( rule__BCoolCompositionRule__DSEsAssignment_3_1_1 ) ) ;
    public final void rule__BCoolCompositionRule__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2251:1: ( ( ( rule__BCoolCompositionRule__DSEsAssignment_3_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2252:1: ( ( rule__BCoolCompositionRule__DSEsAssignment_3_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2252:1: ( ( rule__BCoolCompositionRule__DSEsAssignment_3_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2253:1: ( rule__BCoolCompositionRule__DSEsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getDSEsAssignment_3_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2254:1: ( rule__BCoolCompositionRule__DSEsAssignment_3_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2254:2: rule__BCoolCompositionRule__DSEsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__DSEsAssignment_3_1_1_in_rule__BCoolCompositionRule__Group_3_1__1__Impl4656);
            rule__BCoolCompositionRule__DSEsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getDSEsAssignment_3_1_1()); 
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
    // $ANTLR end "rule__BCoolCompositionRule__Group_3_1__1__Impl"


    // $ANTLR start "rule__MatchingRule__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2268:1: rule__MatchingRule__Group__0 : rule__MatchingRule__Group__0__Impl rule__MatchingRule__Group__1 ;
    public final void rule__MatchingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2272:1: ( rule__MatchingRule__Group__0__Impl rule__MatchingRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2273:2: rule__MatchingRule__Group__0__Impl rule__MatchingRule__Group__1
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__0__Impl_in_rule__MatchingRule__Group__04690);
            rule__MatchingRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group__1_in_rule__MatchingRule__Group__04693);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2280:1: rule__MatchingRule__Group__0__Impl : ( 'when' ) ;
    public final void rule__MatchingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2284:1: ( ( 'when' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2285:1: ( 'when' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2285:1: ( 'when' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2286:1: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getWhenKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__MatchingRule__Group__0__Impl4721); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2299:1: rule__MatchingRule__Group__1 : rule__MatchingRule__Group__1__Impl rule__MatchingRule__Group__2 ;
    public final void rule__MatchingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2303:1: ( rule__MatchingRule__Group__1__Impl rule__MatchingRule__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2304:2: rule__MatchingRule__Group__1__Impl rule__MatchingRule__Group__2
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__1__Impl_in_rule__MatchingRule__Group__14752);
            rule__MatchingRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group__2_in_rule__MatchingRule__Group__14755);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2311:1: rule__MatchingRule__Group__1__Impl : ( ( rule__MatchingRule__ConditionAssignment_1 ) ) ;
    public final void rule__MatchingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2315:1: ( ( ( rule__MatchingRule__ConditionAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2316:1: ( ( rule__MatchingRule__ConditionAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2316:1: ( ( rule__MatchingRule__ConditionAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2317:1: ( rule__MatchingRule__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getConditionAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2318:1: ( rule__MatchingRule__ConditionAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2318:2: rule__MatchingRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__MatchingRule__ConditionAssignment_1_in_rule__MatchingRule__Group__1__Impl4782);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2328:1: rule__MatchingRule__Group__2 : rule__MatchingRule__Group__2__Impl rule__MatchingRule__Group__3 ;
    public final void rule__MatchingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2332:1: ( rule__MatchingRule__Group__2__Impl rule__MatchingRule__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2333:2: rule__MatchingRule__Group__2__Impl rule__MatchingRule__Group__3
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__2__Impl_in_rule__MatchingRule__Group__24812);
            rule__MatchingRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group__3_in_rule__MatchingRule__Group__24815);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2340:1: rule__MatchingRule__Group__2__Impl : ( ';' ) ;
    public final void rule__MatchingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2344:1: ( ( ';' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2345:1: ( ';' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2345:1: ( ';' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2346:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__MatchingRule__Group__2__Impl4843); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2359:1: rule__MatchingRule__Group__3 : rule__MatchingRule__Group__3__Impl rule__MatchingRule__Group__4 ;
    public final void rule__MatchingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2363:1: ( rule__MatchingRule__Group__3__Impl rule__MatchingRule__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2364:2: rule__MatchingRule__Group__3__Impl rule__MatchingRule__Group__4
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__3__Impl_in_rule__MatchingRule__Group__34874);
            rule__MatchingRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group__4_in_rule__MatchingRule__Group__34877);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2371:1: rule__MatchingRule__Group__3__Impl : ( 'CoordinationRule:' ) ;
    public final void rule__MatchingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2375:1: ( ( 'CoordinationRule:' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2376:1: ( 'CoordinationRule:' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2376:1: ( 'CoordinationRule:' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2377:1: 'CoordinationRule:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__MatchingRule__Group__3__Impl4905); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2390:1: rule__MatchingRule__Group__4 : rule__MatchingRule__Group__4__Impl ;
    public final void rule__MatchingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2394:1: ( rule__MatchingRule__Group__4__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2395:2: rule__MatchingRule__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__4__Impl_in_rule__MatchingRule__Group__44936);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2401:1: rule__MatchingRule__Group__4__Impl : ( ( rule__MatchingRule__Group_4__0 )* ) ;
    public final void rule__MatchingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2405:1: ( ( ( rule__MatchingRule__Group_4__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2406:1: ( ( rule__MatchingRule__Group_4__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2406:1: ( ( rule__MatchingRule__Group_4__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2407:1: ( rule__MatchingRule__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getGroup_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2408:1: ( rule__MatchingRule__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2408:2: rule__MatchingRule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MatchingRule__Group_4__0_in_rule__MatchingRule__Group__4__Impl4963);
            	    rule__MatchingRule__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2428:1: rule__MatchingRule__Group_4__0 : rule__MatchingRule__Group_4__0__Impl rule__MatchingRule__Group_4__1 ;
    public final void rule__MatchingRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2432:1: ( rule__MatchingRule__Group_4__0__Impl rule__MatchingRule__Group_4__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2433:2: rule__MatchingRule__Group_4__0__Impl rule__MatchingRule__Group_4__1
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__0__Impl_in_rule__MatchingRule__Group_4__05004);
            rule__MatchingRule__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__1_in_rule__MatchingRule__Group_4__05007);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2440:1: rule__MatchingRule__Group_4__0__Impl : ( 'Event' ) ;
    public final void rule__MatchingRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2444:1: ( ( 'Event' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2445:1: ( 'Event' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2445:1: ( 'Event' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2446:1: 'Event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getEventKeyword_4_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__MatchingRule__Group_4__0__Impl5035); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getEventKeyword_4_0()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2459:1: rule__MatchingRule__Group_4__1 : rule__MatchingRule__Group_4__1__Impl rule__MatchingRule__Group_4__2 ;
    public final void rule__MatchingRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2463:1: ( rule__MatchingRule__Group_4__1__Impl rule__MatchingRule__Group_4__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2464:2: rule__MatchingRule__Group_4__1__Impl rule__MatchingRule__Group_4__2
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__1__Impl_in_rule__MatchingRule__Group_4__15066);
            rule__MatchingRule__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__2_in_rule__MatchingRule__Group_4__15069);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2471:1: rule__MatchingRule__Group_4__1__Impl : ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) ) ;
    public final void rule__MatchingRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2475:1: ( ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2476:1: ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2476:1: ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2477:1: ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsAssignment_4_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2478:1: ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2478:2: rule__MatchingRule__FilterEventExpressionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MatchingRule__FilterEventExpressionsAssignment_4_1_in_rule__MatchingRule__Group_4__1__Impl5096);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2488:1: rule__MatchingRule__Group_4__2 : rule__MatchingRule__Group_4__2__Impl ;
    public final void rule__MatchingRule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2492:1: ( rule__MatchingRule__Group_4__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2493:2: rule__MatchingRule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__2__Impl_in_rule__MatchingRule__Group_4__25126);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2499:1: rule__MatchingRule__Group_4__2__Impl : ( ';' ) ;
    public final void rule__MatchingRule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2503:1: ( ( ';' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2504:1: ( ';' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2504:1: ( ';' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2505:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_4_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__MatchingRule__Group_4__2__Impl5154); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2524:1: rule__EventExpression__Group__0 : rule__EventExpression__Group__0__Impl rule__EventExpression__Group__1 ;
    public final void rule__EventExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2528:1: ( rule__EventExpression__Group__0__Impl rule__EventExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2529:2: rule__EventExpression__Group__0__Impl rule__EventExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__0__Impl_in_rule__EventExpression__Group__05191);
            rule__EventExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__1_in_rule__EventExpression__Group__05194);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2536:1: rule__EventExpression__Group__0__Impl : ( ( rule__EventExpression__NameAssignment_0 ) ) ;
    public final void rule__EventExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2540:1: ( ( ( rule__EventExpression__NameAssignment_0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2541:1: ( ( rule__EventExpression__NameAssignment_0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2541:1: ( ( rule__EventExpression__NameAssignment_0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2542:1: ( rule__EventExpression__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getNameAssignment_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2543:1: ( rule__EventExpression__NameAssignment_0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2543:2: rule__EventExpression__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EventExpression__NameAssignment_0_in_rule__EventExpression__Group__0__Impl5221);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2553:1: rule__EventExpression__Group__1 : rule__EventExpression__Group__1__Impl rule__EventExpression__Group__2 ;
    public final void rule__EventExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2557:1: ( rule__EventExpression__Group__1__Impl rule__EventExpression__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2558:2: rule__EventExpression__Group__1__Impl rule__EventExpression__Group__2
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__1__Impl_in_rule__EventExpression__Group__15251);
            rule__EventExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__2_in_rule__EventExpression__Group__15254);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2565:1: rule__EventExpression__Group__1__Impl : ( '=' ) ;
    public final void rule__EventExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2569:1: ( ( '=' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2570:1: ( '=' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2570:1: ( '=' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2571:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__EventExpression__Group__1__Impl5282); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2584:1: rule__EventExpression__Group__2 : rule__EventExpression__Group__2__Impl rule__EventExpression__Group__3 ;
    public final void rule__EventExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2588:1: ( rule__EventExpression__Group__2__Impl rule__EventExpression__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2589:2: rule__EventExpression__Group__2__Impl rule__EventExpression__Group__3
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__2__Impl_in_rule__EventExpression__Group__25313);
            rule__EventExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__3_in_rule__EventExpression__Group__25316);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2596:1: rule__EventExpression__Group__2__Impl : ( ( rule__EventExpression__DeclarationAssignment_2 ) ) ;
    public final void rule__EventExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2600:1: ( ( ( rule__EventExpression__DeclarationAssignment_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2601:1: ( ( rule__EventExpression__DeclarationAssignment_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2601:1: ( ( rule__EventExpression__DeclarationAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2602:1: ( rule__EventExpression__DeclarationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getDeclarationAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2603:1: ( rule__EventExpression__DeclarationAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2603:2: rule__EventExpression__DeclarationAssignment_2
            {
            pushFollow(FOLLOW_rule__EventExpression__DeclarationAssignment_2_in_rule__EventExpression__Group__2__Impl5343);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2613:1: rule__EventExpression__Group__3 : rule__EventExpression__Group__3__Impl rule__EventExpression__Group__4 ;
    public final void rule__EventExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2617:1: ( rule__EventExpression__Group__3__Impl rule__EventExpression__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2618:2: rule__EventExpression__Group__3__Impl rule__EventExpression__Group__4
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__3__Impl_in_rule__EventExpression__Group__35373);
            rule__EventExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__4_in_rule__EventExpression__Group__35376);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2625:1: rule__EventExpression__Group__3__Impl : ( '(' ) ;
    public final void rule__EventExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2629:1: ( ( '(' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2630:1: ( '(' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2630:1: ( '(' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2631:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__EventExpression__Group__3__Impl5404); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2644:1: rule__EventExpression__Group__4 : rule__EventExpression__Group__4__Impl rule__EventExpression__Group__5 ;
    public final void rule__EventExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2648:1: ( rule__EventExpression__Group__4__Impl rule__EventExpression__Group__5 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2649:2: rule__EventExpression__Group__4__Impl rule__EventExpression__Group__5
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__4__Impl_in_rule__EventExpression__Group__45435);
            rule__EventExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__5_in_rule__EventExpression__Group__45438);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2656:1: rule__EventExpression__Group__4__Impl : ( ( rule__EventExpression__Group_4__0 )? ) ;
    public final void rule__EventExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2660:1: ( ( ( rule__EventExpression__Group_4__0 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2661:1: ( ( rule__EventExpression__Group_4__0 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2661:1: ( ( rule__EventExpression__Group_4__0 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2662:1: ( rule__EventExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getGroup_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2663:1: ( rule__EventExpression__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2663:2: rule__EventExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__EventExpression__Group_4__0_in_rule__EventExpression__Group__4__Impl5465);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2673:1: rule__EventExpression__Group__5 : rule__EventExpression__Group__5__Impl ;
    public final void rule__EventExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2677:1: ( rule__EventExpression__Group__5__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2678:2: rule__EventExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__5__Impl_in_rule__EventExpression__Group__55496);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2684:1: rule__EventExpression__Group__5__Impl : ( ')' ) ;
    public final void rule__EventExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2688:1: ( ( ')' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2689:1: ( ')' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2689:1: ( ')' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2690:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,34,FOLLOW_34_in_rule__EventExpression__Group__5__Impl5524); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2715:1: rule__EventExpression__Group_4__0 : rule__EventExpression__Group_4__0__Impl rule__EventExpression__Group_4__1 ;
    public final void rule__EventExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2719:1: ( rule__EventExpression__Group_4__0__Impl rule__EventExpression__Group_4__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2720:2: rule__EventExpression__Group_4__0__Impl rule__EventExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__EventExpression__Group_4__0__Impl_in_rule__EventExpression__Group_4__05567);
            rule__EventExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group_4__1_in_rule__EventExpression__Group_4__05570);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2727:1: rule__EventExpression__Group_4__0__Impl : ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) ) ;
    public final void rule__EventExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2731:1: ( ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2732:1: ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2732:1: ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2733:1: ( rule__EventExpression__ActualParametersAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2734:1: ( rule__EventExpression__ActualParametersAssignment_4_0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2734:2: rule__EventExpression__ActualParametersAssignment_4_0
            {
            pushFollow(FOLLOW_rule__EventExpression__ActualParametersAssignment_4_0_in_rule__EventExpression__Group_4__0__Impl5597);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2744:1: rule__EventExpression__Group_4__1 : rule__EventExpression__Group_4__1__Impl ;
    public final void rule__EventExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2748:1: ( rule__EventExpression__Group_4__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2749:2: rule__EventExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EventExpression__Group_4__1__Impl_in_rule__EventExpression__Group_4__15627);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2755:1: rule__EventExpression__Group_4__1__Impl : ( ( rule__EventExpression__Group_4_1__0 )* ) ;
    public final void rule__EventExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2759:1: ( ( ( rule__EventExpression__Group_4_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2760:1: ( ( rule__EventExpression__Group_4_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2760:1: ( ( rule__EventExpression__Group_4_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2761:1: ( rule__EventExpression__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getGroup_4_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2762:1: ( rule__EventExpression__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2762:2: rule__EventExpression__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EventExpression__Group_4_1__0_in_rule__EventExpression__Group_4__1__Impl5654);
            	    rule__EventExpression__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2776:1: rule__EventExpression__Group_4_1__0 : rule__EventExpression__Group_4_1__0__Impl rule__EventExpression__Group_4_1__1 ;
    public final void rule__EventExpression__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2780:1: ( rule__EventExpression__Group_4_1__0__Impl rule__EventExpression__Group_4_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2781:2: rule__EventExpression__Group_4_1__0__Impl rule__EventExpression__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__EventExpression__Group_4_1__0__Impl_in_rule__EventExpression__Group_4_1__05689);
            rule__EventExpression__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group_4_1__1_in_rule__EventExpression__Group_4_1__05692);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2788:1: rule__EventExpression__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__EventExpression__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2792:1: ( ( ',' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2793:1: ( ',' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2793:1: ( ',' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2794:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__EventExpression__Group_4_1__0__Impl5720); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2807:1: rule__EventExpression__Group_4_1__1 : rule__EventExpression__Group_4_1__1__Impl ;
    public final void rule__EventExpression__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2811:1: ( rule__EventExpression__Group_4_1__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2812:2: rule__EventExpression__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EventExpression__Group_4_1__1__Impl_in_rule__EventExpression__Group_4_1__15751);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2818:1: rule__EventExpression__Group_4_1__1__Impl : ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) ) ;
    public final void rule__EventExpression__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2822:1: ( ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2823:1: ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2823:1: ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2824:1: ( rule__EventExpression__ActualParametersAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2825:1: ( rule__EventExpression__ActualParametersAssignment_4_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2825:2: rule__EventExpression__ActualParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__EventExpression__ActualParametersAssignment_4_1_1_in_rule__EventExpression__Group_4_1__1__Impl5778);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2839:1: rule__EventRelation__Group__0 : rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 ;
    public final void rule__EventRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2843:1: ( rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2844:2: rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__0__Impl_in_rule__EventRelation__Group__05812);
            rule__EventRelation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group__1_in_rule__EventRelation__Group__05815);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2851:1: rule__EventRelation__Group__0__Impl : ( ( rule__EventRelation__DeclarationAssignment_0 ) ) ;
    public final void rule__EventRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2855:1: ( ( ( rule__EventRelation__DeclarationAssignment_0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2856:1: ( ( rule__EventRelation__DeclarationAssignment_0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2856:1: ( ( rule__EventRelation__DeclarationAssignment_0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2857:1: ( rule__EventRelation__DeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getDeclarationAssignment_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2858:1: ( rule__EventRelation__DeclarationAssignment_0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2858:2: rule__EventRelation__DeclarationAssignment_0
            {
            pushFollow(FOLLOW_rule__EventRelation__DeclarationAssignment_0_in_rule__EventRelation__Group__0__Impl5842);
            rule__EventRelation__DeclarationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getDeclarationAssignment_0()); 
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
    // $ANTLR end "rule__EventRelation__Group__0__Impl"


    // $ANTLR start "rule__EventRelation__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2868:1: rule__EventRelation__Group__1 : rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 ;
    public final void rule__EventRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2872:1: ( rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2873:2: rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__1__Impl_in_rule__EventRelation__Group__15872);
            rule__EventRelation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group__2_in_rule__EventRelation__Group__15875);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2880:1: rule__EventRelation__Group__1__Impl : ( '(' ) ;
    public final void rule__EventRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2884:1: ( ( '(' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2885:1: ( '(' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2885:1: ( '(' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2886:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__EventRelation__Group__1__Impl5903); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_1()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2899:1: rule__EventRelation__Group__2 : rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 ;
    public final void rule__EventRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2903:1: ( rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2904:2: rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__2__Impl_in_rule__EventRelation__Group__25934);
            rule__EventRelation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group__3_in_rule__EventRelation__Group__25937);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2911:1: rule__EventRelation__Group__2__Impl : ( ( rule__EventRelation__Group_2__0 )? ) ;
    public final void rule__EventRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2915:1: ( ( ( rule__EventRelation__Group_2__0 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2916:1: ( ( rule__EventRelation__Group_2__0 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2916:1: ( ( rule__EventRelation__Group_2__0 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2917:1: ( rule__EventRelation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getGroup_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2918:1: ( rule__EventRelation__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2918:2: rule__EventRelation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EventRelation__Group_2__0_in_rule__EventRelation__Group__2__Impl5964);
                    rule__EventRelation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getGroup_2()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2928:1: rule__EventRelation__Group__3 : rule__EventRelation__Group__3__Impl ;
    public final void rule__EventRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2932:1: ( rule__EventRelation__Group__3__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2933:2: rule__EventRelation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__3__Impl_in_rule__EventRelation__Group__35995);
            rule__EventRelation__Group__3__Impl();

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2939:1: rule__EventRelation__Group__3__Impl : ( ')' ) ;
    public final void rule__EventRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2943:1: ( ( ')' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2944:1: ( ')' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2944:1: ( ')' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2945:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__EventRelation__Group__3__Impl6023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_3()); 
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


    // $ANTLR start "rule__EventRelation__Group_2__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2966:1: rule__EventRelation__Group_2__0 : rule__EventRelation__Group_2__0__Impl rule__EventRelation__Group_2__1 ;
    public final void rule__EventRelation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2970:1: ( rule__EventRelation__Group_2__0__Impl rule__EventRelation__Group_2__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2971:2: rule__EventRelation__Group_2__0__Impl rule__EventRelation__Group_2__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_2__0__Impl_in_rule__EventRelation__Group_2__06062);
            rule__EventRelation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group_2__1_in_rule__EventRelation__Group_2__06065);
            rule__EventRelation__Group_2__1();

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
    // $ANTLR end "rule__EventRelation__Group_2__0"


    // $ANTLR start "rule__EventRelation__Group_2__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2978:1: rule__EventRelation__Group_2__0__Impl : ( ( rule__EventRelation__ActualParametersAssignment_2_0 ) ) ;
    public final void rule__EventRelation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2982:1: ( ( ( rule__EventRelation__ActualParametersAssignment_2_0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2983:1: ( ( rule__EventRelation__ActualParametersAssignment_2_0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2983:1: ( ( rule__EventRelation__ActualParametersAssignment_2_0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2984:1: ( rule__EventRelation__ActualParametersAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersAssignment_2_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2985:1: ( rule__EventRelation__ActualParametersAssignment_2_0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2985:2: rule__EventRelation__ActualParametersAssignment_2_0
            {
            pushFollow(FOLLOW_rule__EventRelation__ActualParametersAssignment_2_0_in_rule__EventRelation__Group_2__0__Impl6092);
            rule__EventRelation__ActualParametersAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersAssignment_2_0()); 
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
    // $ANTLR end "rule__EventRelation__Group_2__0__Impl"


    // $ANTLR start "rule__EventRelation__Group_2__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2995:1: rule__EventRelation__Group_2__1 : rule__EventRelation__Group_2__1__Impl ;
    public final void rule__EventRelation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2999:1: ( rule__EventRelation__Group_2__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3000:2: rule__EventRelation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_2__1__Impl_in_rule__EventRelation__Group_2__16122);
            rule__EventRelation__Group_2__1__Impl();

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
    // $ANTLR end "rule__EventRelation__Group_2__1"


    // $ANTLR start "rule__EventRelation__Group_2__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3006:1: rule__EventRelation__Group_2__1__Impl : ( ( rule__EventRelation__Group_2_1__0 )* ) ;
    public final void rule__EventRelation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3010:1: ( ( ( rule__EventRelation__Group_2_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3011:1: ( ( rule__EventRelation__Group_2_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3011:1: ( ( rule__EventRelation__Group_2_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3012:1: ( rule__EventRelation__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getGroup_2_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3013:1: ( rule__EventRelation__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3013:2: rule__EventRelation__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EventRelation__Group_2_1__0_in_rule__EventRelation__Group_2__1__Impl6149);
            	    rule__EventRelation__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__EventRelation__Group_2__1__Impl"


    // $ANTLR start "rule__EventRelation__Group_2_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3027:1: rule__EventRelation__Group_2_1__0 : rule__EventRelation__Group_2_1__0__Impl rule__EventRelation__Group_2_1__1 ;
    public final void rule__EventRelation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3031:1: ( rule__EventRelation__Group_2_1__0__Impl rule__EventRelation__Group_2_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3032:2: rule__EventRelation__Group_2_1__0__Impl rule__EventRelation__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_2_1__0__Impl_in_rule__EventRelation__Group_2_1__06184);
            rule__EventRelation__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group_2_1__1_in_rule__EventRelation__Group_2_1__06187);
            rule__EventRelation__Group_2_1__1();

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
    // $ANTLR end "rule__EventRelation__Group_2_1__0"


    // $ANTLR start "rule__EventRelation__Group_2_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3039:1: rule__EventRelation__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__EventRelation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3043:1: ( ( ',' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3044:1: ( ',' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3044:1: ( ',' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3045:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__EventRelation__Group_2_1__0__Impl6215); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__EventRelation__Group_2_1__0__Impl"


    // $ANTLR start "rule__EventRelation__Group_2_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3058:1: rule__EventRelation__Group_2_1__1 : rule__EventRelation__Group_2_1__1__Impl ;
    public final void rule__EventRelation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3062:1: ( rule__EventRelation__Group_2_1__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3063:2: rule__EventRelation__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_2_1__1__Impl_in_rule__EventRelation__Group_2_1__16246);
            rule__EventRelation__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__EventRelation__Group_2_1__1"


    // $ANTLR start "rule__EventRelation__Group_2_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3069:1: rule__EventRelation__Group_2_1__1__Impl : ( ( rule__EventRelation__ActualParametersAssignment_2_1_1 ) ) ;
    public final void rule__EventRelation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3073:1: ( ( ( rule__EventRelation__ActualParametersAssignment_2_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3074:1: ( ( rule__EventRelation__ActualParametersAssignment_2_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3074:1: ( ( rule__EventRelation__ActualParametersAssignment_2_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3075:1: ( rule__EventRelation__ActualParametersAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersAssignment_2_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3076:1: ( rule__EventRelation__ActualParametersAssignment_2_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3076:2: rule__EventRelation__ActualParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__EventRelation__ActualParametersAssignment_2_1_1_in_rule__EventRelation__Group_2_1__1__Impl6273);
            rule__EventRelation__ActualParametersAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersAssignment_2_1_1()); 
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
    // $ANTLR end "rule__EventRelation__Group_2_1__1__Impl"


    // $ANTLR start "rule__ImportLibRule__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3090:1: rule__ImportLibRule__Group__0 : rule__ImportLibRule__Group__0__Impl rule__ImportLibRule__Group__1 ;
    public final void rule__ImportLibRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3094:1: ( rule__ImportLibRule__Group__0__Impl rule__ImportLibRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3095:2: rule__ImportLibRule__Group__0__Impl rule__ImportLibRule__Group__1
            {
            pushFollow(FOLLOW_rule__ImportLibRule__Group__0__Impl_in_rule__ImportLibRule__Group__06307);
            rule__ImportLibRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportLibRule__Group__1_in_rule__ImportLibRule__Group__06310);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3102:1: rule__ImportLibRule__Group__0__Impl : ( 'ImportLib' ) ;
    public final void rule__ImportLibRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3106:1: ( ( 'ImportLib' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3107:1: ( 'ImportLib' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3107:1: ( 'ImportLib' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3108:1: 'ImportLib'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ImportLibRule__Group__0__Impl6338); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3121:1: rule__ImportLibRule__Group__1 : rule__ImportLibRule__Group__1__Impl ;
    public final void rule__ImportLibRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3125:1: ( rule__ImportLibRule__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3126:2: rule__ImportLibRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportLibRule__Group__1__Impl_in_rule__ImportLibRule__Group__16369);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3132:1: rule__ImportLibRule__Group__1__Impl : ( ( rule__ImportLibRule__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportLibRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3136:1: ( ( ( rule__ImportLibRule__ImportURIAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3137:1: ( ( rule__ImportLibRule__ImportURIAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3137:1: ( ( rule__ImportLibRule__ImportURIAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3138:1: ( rule__ImportLibRule__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getImportURIAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3139:1: ( rule__ImportLibRule__ImportURIAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3139:2: rule__ImportLibRule__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportLibRule__ImportURIAssignment_1_in_rule__ImportLibRule__Group__1__Impl6396);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3153:1: rule__ImportInterfaceRule__Group__0 : rule__ImportInterfaceRule__Group__0__Impl rule__ImportInterfaceRule__Group__1 ;
    public final void rule__ImportInterfaceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3157:1: ( rule__ImportInterfaceRule__Group__0__Impl rule__ImportInterfaceRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3158:2: rule__ImportInterfaceRule__Group__0__Impl rule__ImportInterfaceRule__Group__1
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__0__Impl_in_rule__ImportInterfaceRule__Group__06430);
            rule__ImportInterfaceRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__1_in_rule__ImportInterfaceRule__Group__06433);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3165:1: rule__ImportInterfaceRule__Group__0__Impl : ( 'ImportInterface' ) ;
    public final void rule__ImportInterfaceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3169:1: ( ( 'ImportInterface' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3170:1: ( 'ImportInterface' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3170:1: ( 'ImportInterface' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3171:1: 'ImportInterface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__ImportInterfaceRule__Group__0__Impl6461); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3184:1: rule__ImportInterfaceRule__Group__1 : rule__ImportInterfaceRule__Group__1__Impl rule__ImportInterfaceRule__Group__2 ;
    public final void rule__ImportInterfaceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3188:1: ( rule__ImportInterfaceRule__Group__1__Impl rule__ImportInterfaceRule__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3189:2: rule__ImportInterfaceRule__Group__1__Impl rule__ImportInterfaceRule__Group__2
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__1__Impl_in_rule__ImportInterfaceRule__Group__16492);
            rule__ImportInterfaceRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__2_in_rule__ImportInterfaceRule__Group__16495);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3196:1: rule__ImportInterfaceRule__Group__1__Impl : ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportInterfaceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3200:1: ( ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3201:1: ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3201:1: ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3202:1: ( rule__ImportInterfaceRule__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getImportURIAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3203:1: ( rule__ImportInterfaceRule__ImportURIAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3203:2: rule__ImportInterfaceRule__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__ImportURIAssignment_1_in_rule__ImportInterfaceRule__Group__1__Impl6522);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3213:1: rule__ImportInterfaceRule__Group__2 : rule__ImportInterfaceRule__Group__2__Impl rule__ImportInterfaceRule__Group__3 ;
    public final void rule__ImportInterfaceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3217:1: ( rule__ImportInterfaceRule__Group__2__Impl rule__ImportInterfaceRule__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3218:2: rule__ImportInterfaceRule__Group__2__Impl rule__ImportInterfaceRule__Group__3
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__2__Impl_in_rule__ImportInterfaceRule__Group__26552);
            rule__ImportInterfaceRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__3_in_rule__ImportInterfaceRule__Group__26555);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3225:1: rule__ImportInterfaceRule__Group__2__Impl : ( 'as' ) ;
    public final void rule__ImportInterfaceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3229:1: ( ( 'as' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3230:1: ( 'as' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3230:1: ( 'as' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3231:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__ImportInterfaceRule__Group__2__Impl6583); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3244:1: rule__ImportInterfaceRule__Group__3 : rule__ImportInterfaceRule__Group__3__Impl ;
    public final void rule__ImportInterfaceRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3248:1: ( rule__ImportInterfaceRule__Group__3__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3249:2: rule__ImportInterfaceRule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__3__Impl_in_rule__ImportInterfaceRule__Group__36614);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3255:1: rule__ImportInterfaceRule__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__ImportInterfaceRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3259:1: ( ( RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3260:1: ( RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3260:1: ( RULE_STRING )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3261:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getSTRINGTerminalRuleCall_3()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportInterfaceRule__Group__3__Impl6641); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getSTRINGTerminalRuleCall_3()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3283:1: rule__GImportStatement__Group__0 : rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1 ;
    public final void rule__GImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3287:1: ( rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3288:2: rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1
            {
            pushFollow(FOLLOW_rule__GImportStatement__Group__0__Impl_in_rule__GImportStatement__Group__06681);
            rule__GImportStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GImportStatement__Group__1_in_rule__GImportStatement__Group__06684);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3295:1: rule__GImportStatement__Group__0__Impl : ( 'import' ) ;
    public final void rule__GImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3299:1: ( ( 'import' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3300:1: ( 'import' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3300:1: ( 'import' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3301:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportKeyword_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__GImportStatement__Group__0__Impl6712); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3314:1: rule__GImportStatement__Group__1 : rule__GImportStatement__Group__1__Impl ;
    public final void rule__GImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3318:1: ( rule__GImportStatement__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3319:2: rule__GImportStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GImportStatement__Group__1__Impl_in_rule__GImportStatement__Group__16743);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3325:1: rule__GImportStatement__Group__1__Impl : ( ( rule__GImportStatement__ImportURIAssignment_1 ) ) ;
    public final void rule__GImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3329:1: ( ( ( rule__GImportStatement__ImportURIAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3330:1: ( ( rule__GImportStatement__ImportURIAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3330:1: ( ( rule__GImportStatement__ImportURIAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3331:1: ( rule__GImportStatement__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportURIAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3332:1: ( rule__GImportStatement__ImportURIAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3332:2: rule__GImportStatement__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__GImportStatement__ImportURIAssignment_1_in_rule__GImportStatement__Group__1__Impl6770);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3346:1: rule__GOrExpression__Group__0 : rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1 ;
    public final void rule__GOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3350:1: ( rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3351:2: rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group__0__Impl_in_rule__GOrExpression__Group__06804);
            rule__GOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GOrExpression__Group__1_in_rule__GOrExpression__Group__06807);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3358:1: rule__GOrExpression__Group__0__Impl : ( ruleGXorExpression ) ;
    public final void rule__GOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3362:1: ( ( ruleGXorExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3363:1: ( ruleGXorExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3363:1: ( ruleGXorExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3364:1: ruleGXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_rule__GOrExpression__Group__0__Impl6834);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3375:1: rule__GOrExpression__Group__1 : rule__GOrExpression__Group__1__Impl ;
    public final void rule__GOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3379:1: ( rule__GOrExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3380:2: rule__GOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group__1__Impl_in_rule__GOrExpression__Group__16863);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3386:1: rule__GOrExpression__Group__1__Impl : ( ( rule__GOrExpression__Group_1__0 )* ) ;
    public final void rule__GOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3390:1: ( ( ( rule__GOrExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3391:1: ( ( rule__GOrExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3391:1: ( ( rule__GOrExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3392:1: ( rule__GOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3393:1: ( rule__GOrExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3393:2: rule__GOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GOrExpression__Group_1__0_in_rule__GOrExpression__Group__1__Impl6890);
            	    rule__GOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3407:1: rule__GOrExpression__Group_1__0 : rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1 ;
    public final void rule__GOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3411:1: ( rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3412:2: rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__0__Impl_in_rule__GOrExpression__Group_1__06925);
            rule__GOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__1_in_rule__GOrExpression__Group_1__06928);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3419:1: rule__GOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3423:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3424:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3424:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3425:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3426:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3428:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3438:1: rule__GOrExpression__Group_1__1 : rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2 ;
    public final void rule__GOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3442:1: ( rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3443:2: rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__1__Impl_in_rule__GOrExpression__Group_1__16986);
            rule__GOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__2_in_rule__GOrExpression__Group_1__16989);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3450:1: rule__GOrExpression__Group_1__1__Impl : ( ( rule__GOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3454:1: ( ( ( rule__GOrExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3455:1: ( ( rule__GOrExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3455:1: ( ( rule__GOrExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3456:1: ( rule__GOrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3457:1: ( rule__GOrExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3457:2: rule__GOrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GOrExpression__OperatorAssignment_1_1_in_rule__GOrExpression__Group_1__1__Impl7016);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3467:1: rule__GOrExpression__Group_1__2 : rule__GOrExpression__Group_1__2__Impl ;
    public final void rule__GOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3471:1: ( rule__GOrExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3472:2: rule__GOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__2__Impl_in_rule__GOrExpression__Group_1__27046);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3478:1: rule__GOrExpression__Group_1__2__Impl : ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3482:1: ( ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3483:1: ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3483:1: ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3484:1: ( rule__GOrExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3485:1: ( rule__GOrExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3485:2: rule__GOrExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GOrExpression__RightOperandAssignment_1_2_in_rule__GOrExpression__Group_1__2__Impl7073);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3501:1: rule__GXorExpression__Group__0 : rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1 ;
    public final void rule__GXorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3505:1: ( rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3506:2: rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group__0__Impl_in_rule__GXorExpression__Group__07109);
            rule__GXorExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GXorExpression__Group__1_in_rule__GXorExpression__Group__07112);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3513:1: rule__GXorExpression__Group__0__Impl : ( ruleGAndExpression ) ;
    public final void rule__GXorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3517:1: ( ( ruleGAndExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3518:1: ( ruleGAndExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3518:1: ( ruleGAndExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3519:1: ruleGAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_rule__GXorExpression__Group__0__Impl7139);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3530:1: rule__GXorExpression__Group__1 : rule__GXorExpression__Group__1__Impl ;
    public final void rule__GXorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3534:1: ( rule__GXorExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3535:2: rule__GXorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group__1__Impl_in_rule__GXorExpression__Group__17168);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3541:1: rule__GXorExpression__Group__1__Impl : ( ( rule__GXorExpression__Group_1__0 )* ) ;
    public final void rule__GXorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3545:1: ( ( ( rule__GXorExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3546:1: ( ( rule__GXorExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3546:1: ( ( rule__GXorExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3547:1: ( rule__GXorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3548:1: ( rule__GXorExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==14) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3548:2: rule__GXorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GXorExpression__Group_1__0_in_rule__GXorExpression__Group__1__Impl7195);
            	    rule__GXorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3562:1: rule__GXorExpression__Group_1__0 : rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1 ;
    public final void rule__GXorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3566:1: ( rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3567:2: rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__0__Impl_in_rule__GXorExpression__Group_1__07230);
            rule__GXorExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__1_in_rule__GXorExpression__Group_1__07233);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3574:1: rule__GXorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GXorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3578:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3579:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3579:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3580:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3581:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3583:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3593:1: rule__GXorExpression__Group_1__1 : rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2 ;
    public final void rule__GXorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3597:1: ( rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3598:2: rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__1__Impl_in_rule__GXorExpression__Group_1__17291);
            rule__GXorExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__2_in_rule__GXorExpression__Group_1__17294);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3605:1: rule__GXorExpression__Group_1__1__Impl : ( ( rule__GXorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GXorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3609:1: ( ( ( rule__GXorExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3610:1: ( ( rule__GXorExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3610:1: ( ( rule__GXorExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3611:1: ( rule__GXorExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3612:1: ( rule__GXorExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3612:2: rule__GXorExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GXorExpression__OperatorAssignment_1_1_in_rule__GXorExpression__Group_1__1__Impl7321);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3622:1: rule__GXorExpression__Group_1__2 : rule__GXorExpression__Group_1__2__Impl ;
    public final void rule__GXorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3626:1: ( rule__GXorExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3627:2: rule__GXorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__2__Impl_in_rule__GXorExpression__Group_1__27351);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3633:1: rule__GXorExpression__Group_1__2__Impl : ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GXorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3637:1: ( ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3638:1: ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3638:1: ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3639:1: ( rule__GXorExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3640:1: ( rule__GXorExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3640:2: rule__GXorExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GXorExpression__RightOperandAssignment_1_2_in_rule__GXorExpression__Group_1__2__Impl7378);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3656:1: rule__GAndExpression__Group__0 : rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1 ;
    public final void rule__GAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3660:1: ( rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3661:2: rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group__0__Impl_in_rule__GAndExpression__Group__07414);
            rule__GAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAndExpression__Group__1_in_rule__GAndExpression__Group__07417);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3668:1: rule__GAndExpression__Group__0__Impl : ( ruleGEqualityExpression ) ;
    public final void rule__GAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3672:1: ( ( ruleGEqualityExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3673:1: ( ruleGEqualityExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3673:1: ( ruleGEqualityExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3674:1: ruleGEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__Group__0__Impl7444);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3685:1: rule__GAndExpression__Group__1 : rule__GAndExpression__Group__1__Impl ;
    public final void rule__GAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3689:1: ( rule__GAndExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3690:2: rule__GAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group__1__Impl_in_rule__GAndExpression__Group__17473);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3696:1: rule__GAndExpression__Group__1__Impl : ( ( rule__GAndExpression__Group_1__0 )* ) ;
    public final void rule__GAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3700:1: ( ( ( rule__GAndExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3701:1: ( ( rule__GAndExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3701:1: ( ( rule__GAndExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3702:1: ( rule__GAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3703:1: ( rule__GAndExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==13) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3703:2: rule__GAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GAndExpression__Group_1__0_in_rule__GAndExpression__Group__1__Impl7500);
            	    rule__GAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3717:1: rule__GAndExpression__Group_1__0 : rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1 ;
    public final void rule__GAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3721:1: ( rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3722:2: rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__0__Impl_in_rule__GAndExpression__Group_1__07535);
            rule__GAndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__1_in_rule__GAndExpression__Group_1__07538);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3729:1: rule__GAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3733:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3734:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3734:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3735:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3736:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3738:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3748:1: rule__GAndExpression__Group_1__1 : rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2 ;
    public final void rule__GAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3752:1: ( rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3753:2: rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__1__Impl_in_rule__GAndExpression__Group_1__17596);
            rule__GAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__2_in_rule__GAndExpression__Group_1__17599);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3760:1: rule__GAndExpression__Group_1__1__Impl : ( ( rule__GAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3764:1: ( ( ( rule__GAndExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3765:1: ( ( rule__GAndExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3765:1: ( ( rule__GAndExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3766:1: ( rule__GAndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3767:1: ( rule__GAndExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3767:2: rule__GAndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GAndExpression__OperatorAssignment_1_1_in_rule__GAndExpression__Group_1__1__Impl7626);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3777:1: rule__GAndExpression__Group_1__2 : rule__GAndExpression__Group_1__2__Impl ;
    public final void rule__GAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3781:1: ( rule__GAndExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3782:2: rule__GAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__2__Impl_in_rule__GAndExpression__Group_1__27656);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3788:1: rule__GAndExpression__Group_1__2__Impl : ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3792:1: ( ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3793:1: ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3793:1: ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3794:1: ( rule__GAndExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3795:1: ( rule__GAndExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3795:2: rule__GAndExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GAndExpression__RightOperandAssignment_1_2_in_rule__GAndExpression__Group_1__2__Impl7683);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3811:1: rule__GEqualityExpression__Group__0 : rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1 ;
    public final void rule__GEqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3815:1: ( rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3816:2: rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__0__Impl_in_rule__GEqualityExpression__Group__07719);
            rule__GEqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__1_in_rule__GEqualityExpression__Group__07722);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3823:1: rule__GEqualityExpression__Group__0__Impl : ( ruleGRelationExpression ) ;
    public final void rule__GEqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3827:1: ( ( ruleGRelationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3828:1: ( ruleGRelationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3828:1: ( ruleGRelationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3829:1: ruleGRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__Group__0__Impl7749);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3840:1: rule__GEqualityExpression__Group__1 : rule__GEqualityExpression__Group__1__Impl ;
    public final void rule__GEqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3844:1: ( rule__GEqualityExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3845:2: rule__GEqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__1__Impl_in_rule__GEqualityExpression__Group__17778);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3851:1: rule__GEqualityExpression__Group__1__Impl : ( ( rule__GEqualityExpression__Group_1__0 )* ) ;
    public final void rule__GEqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3855:1: ( ( ( rule__GEqualityExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3856:1: ( ( rule__GEqualityExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3856:1: ( ( rule__GEqualityExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3857:1: ( rule__GEqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3858:1: ( rule__GEqualityExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=16 && LA27_0<=17)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3858:2: rule__GEqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__0_in_rule__GEqualityExpression__Group__1__Impl7805);
            	    rule__GEqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3872:1: rule__GEqualityExpression__Group_1__0 : rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1 ;
    public final void rule__GEqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3876:1: ( rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3877:2: rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__0__Impl_in_rule__GEqualityExpression__Group_1__07840);
            rule__GEqualityExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__1_in_rule__GEqualityExpression__Group_1__07843);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3884:1: rule__GEqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GEqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3888:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3889:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3889:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3890:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3891:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3893:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3903:1: rule__GEqualityExpression__Group_1__1 : rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2 ;
    public final void rule__GEqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3907:1: ( rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3908:2: rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__1__Impl_in_rule__GEqualityExpression__Group_1__17901);
            rule__GEqualityExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__2_in_rule__GEqualityExpression__Group_1__17904);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3915:1: rule__GEqualityExpression__Group_1__1__Impl : ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GEqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3919:1: ( ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3920:1: ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3920:1: ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3921:1: ( rule__GEqualityExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3922:1: ( rule__GEqualityExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3922:2: rule__GEqualityExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__OperatorAssignment_1_1_in_rule__GEqualityExpression__Group_1__1__Impl7931);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3932:1: rule__GEqualityExpression__Group_1__2 : rule__GEqualityExpression__Group_1__2__Impl ;
    public final void rule__GEqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3936:1: ( rule__GEqualityExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3937:2: rule__GEqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__2__Impl_in_rule__GEqualityExpression__Group_1__27961);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3943:1: rule__GEqualityExpression__Group_1__2__Impl : ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GEqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3947:1: ( ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3948:1: ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3948:1: ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3949:1: ( rule__GEqualityExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3950:1: ( rule__GEqualityExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3950:2: rule__GEqualityExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__RightOperandAssignment_1_2_in_rule__GEqualityExpression__Group_1__2__Impl7988);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3966:1: rule__GRelationExpression__Group__0 : rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1 ;
    public final void rule__GRelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3970:1: ( rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3971:2: rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group__0__Impl_in_rule__GRelationExpression__Group__08024);
            rule__GRelationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GRelationExpression__Group__1_in_rule__GRelationExpression__Group__08027);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3978:1: rule__GRelationExpression__Group__0__Impl : ( ruleGAdditionExpression ) ;
    public final void rule__GRelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3982:1: ( ( ruleGAdditionExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3983:1: ( ruleGAdditionExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3983:1: ( ruleGAdditionExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3984:1: ruleGAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__Group__0__Impl8054);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3995:1: rule__GRelationExpression__Group__1 : rule__GRelationExpression__Group__1__Impl ;
    public final void rule__GRelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3999:1: ( rule__GRelationExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4000:2: rule__GRelationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group__1__Impl_in_rule__GRelationExpression__Group__18083);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4006:1: rule__GRelationExpression__Group__1__Impl : ( ( rule__GRelationExpression__Group_1__0 )* ) ;
    public final void rule__GRelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4010:1: ( ( ( rule__GRelationExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4011:1: ( ( rule__GRelationExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4011:1: ( ( rule__GRelationExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4012:1: ( rule__GRelationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4013:1: ( rule__GRelationExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=18 && LA28_0<=21)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4013:2: rule__GRelationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GRelationExpression__Group_1__0_in_rule__GRelationExpression__Group__1__Impl8110);
            	    rule__GRelationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4027:1: rule__GRelationExpression__Group_1__0 : rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1 ;
    public final void rule__GRelationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4031:1: ( rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4032:2: rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__0__Impl_in_rule__GRelationExpression__Group_1__08145);
            rule__GRelationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__1_in_rule__GRelationExpression__Group_1__08148);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4039:1: rule__GRelationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GRelationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4043:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4044:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4044:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4045:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4046:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4048:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4058:1: rule__GRelationExpression__Group_1__1 : rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2 ;
    public final void rule__GRelationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4062:1: ( rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4063:2: rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__1__Impl_in_rule__GRelationExpression__Group_1__18206);
            rule__GRelationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__2_in_rule__GRelationExpression__Group_1__18209);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4070:1: rule__GRelationExpression__Group_1__1__Impl : ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GRelationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4074:1: ( ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4075:1: ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4075:1: ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4076:1: ( rule__GRelationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4077:1: ( rule__GRelationExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4077:2: rule__GRelationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GRelationExpression__OperatorAssignment_1_1_in_rule__GRelationExpression__Group_1__1__Impl8236);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4087:1: rule__GRelationExpression__Group_1__2 : rule__GRelationExpression__Group_1__2__Impl ;
    public final void rule__GRelationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4091:1: ( rule__GRelationExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4092:2: rule__GRelationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__2__Impl_in_rule__GRelationExpression__Group_1__28266);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4098:1: rule__GRelationExpression__Group_1__2__Impl : ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GRelationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4102:1: ( ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4103:1: ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4103:1: ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4104:1: ( rule__GRelationExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4105:1: ( rule__GRelationExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4105:2: rule__GRelationExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GRelationExpression__RightOperandAssignment_1_2_in_rule__GRelationExpression__Group_1__2__Impl8293);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4121:1: rule__GAdditionExpression__Group__0 : rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1 ;
    public final void rule__GAdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4125:1: ( rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4126:2: rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__0__Impl_in_rule__GAdditionExpression__Group__08329);
            rule__GAdditionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__1_in_rule__GAdditionExpression__Group__08332);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4133:1: rule__GAdditionExpression__Group__0__Impl : ( ruleGMultiplicationExpression ) ;
    public final void rule__GAdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4137:1: ( ( ruleGMultiplicationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4138:1: ( ruleGMultiplicationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4138:1: ( ruleGMultiplicationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4139:1: ruleGMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__Group__0__Impl8359);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4150:1: rule__GAdditionExpression__Group__1 : rule__GAdditionExpression__Group__1__Impl ;
    public final void rule__GAdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4154:1: ( rule__GAdditionExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4155:2: rule__GAdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__1__Impl_in_rule__GAdditionExpression__Group__18388);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4161:1: rule__GAdditionExpression__Group__1__Impl : ( ( rule__GAdditionExpression__Group_1__0 )* ) ;
    public final void rule__GAdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4165:1: ( ( ( rule__GAdditionExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4166:1: ( ( rule__GAdditionExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4166:1: ( ( rule__GAdditionExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4167:1: ( rule__GAdditionExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4168:1: ( rule__GAdditionExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=22 && LA29_0<=23)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4168:2: rule__GAdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__0_in_rule__GAdditionExpression__Group__1__Impl8415);
            	    rule__GAdditionExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4182:1: rule__GAdditionExpression__Group_1__0 : rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1 ;
    public final void rule__GAdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4186:1: ( rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4187:2: rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__0__Impl_in_rule__GAdditionExpression__Group_1__08450);
            rule__GAdditionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__1_in_rule__GAdditionExpression__Group_1__08453);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4194:1: rule__GAdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GAdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4198:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4199:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4199:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4200:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4201:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4203:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4213:1: rule__GAdditionExpression__Group_1__1 : rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2 ;
    public final void rule__GAdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4217:1: ( rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4218:2: rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__1__Impl_in_rule__GAdditionExpression__Group_1__18511);
            rule__GAdditionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__2_in_rule__GAdditionExpression__Group_1__18514);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4225:1: rule__GAdditionExpression__Group_1__1__Impl : ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GAdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4229:1: ( ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4230:1: ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4230:1: ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4231:1: ( rule__GAdditionExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4232:1: ( rule__GAdditionExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4232:2: rule__GAdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__OperatorAssignment_1_1_in_rule__GAdditionExpression__Group_1__1__Impl8541);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4242:1: rule__GAdditionExpression__Group_1__2 : rule__GAdditionExpression__Group_1__2__Impl ;
    public final void rule__GAdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4246:1: ( rule__GAdditionExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4247:2: rule__GAdditionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__2__Impl_in_rule__GAdditionExpression__Group_1__28571);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4253:1: rule__GAdditionExpression__Group_1__2__Impl : ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GAdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4257:1: ( ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4258:1: ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4258:1: ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4259:1: ( rule__GAdditionExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4260:1: ( rule__GAdditionExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4260:2: rule__GAdditionExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__RightOperandAssignment_1_2_in_rule__GAdditionExpression__Group_1__2__Impl8598);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4276:1: rule__GMultiplicationExpression__Group__0 : rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1 ;
    public final void rule__GMultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4280:1: ( rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4281:2: rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__0__Impl_in_rule__GMultiplicationExpression__Group__08634);
            rule__GMultiplicationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__1_in_rule__GMultiplicationExpression__Group__08637);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4288:1: rule__GMultiplicationExpression__Group__0__Impl : ( ruleGNegationExpression ) ;
    public final void rule__GMultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4292:1: ( ( ruleGNegationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4293:1: ( ruleGNegationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4293:1: ( ruleGNegationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4294:1: ruleGNegationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__Group__0__Impl8664);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4305:1: rule__GMultiplicationExpression__Group__1 : rule__GMultiplicationExpression__Group__1__Impl ;
    public final void rule__GMultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4309:1: ( rule__GMultiplicationExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4310:2: rule__GMultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__1__Impl_in_rule__GMultiplicationExpression__Group__18693);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4316:1: rule__GMultiplicationExpression__Group__1__Impl : ( ( rule__GMultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__GMultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4320:1: ( ( ( rule__GMultiplicationExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4321:1: ( ( rule__GMultiplicationExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4321:1: ( ( rule__GMultiplicationExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4322:1: ( rule__GMultiplicationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4323:1: ( rule__GMultiplicationExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=24 && LA30_0<=25)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4323:2: rule__GMultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__0_in_rule__GMultiplicationExpression__Group__1__Impl8720);
            	    rule__GMultiplicationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4337:1: rule__GMultiplicationExpression__Group_1__0 : rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1 ;
    public final void rule__GMultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4341:1: ( rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4342:2: rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__0__Impl_in_rule__GMultiplicationExpression__Group_1__08755);
            rule__GMultiplicationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__1_in_rule__GMultiplicationExpression__Group_1__08758);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4349:1: rule__GMultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GMultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4353:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4354:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4354:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4355:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4356:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4358:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4368:1: rule__GMultiplicationExpression__Group_1__1 : rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2 ;
    public final void rule__GMultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4372:1: ( rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4373:2: rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__1__Impl_in_rule__GMultiplicationExpression__Group_1__18816);
            rule__GMultiplicationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__2_in_rule__GMultiplicationExpression__Group_1__18819);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4380:1: rule__GMultiplicationExpression__Group_1__1__Impl : ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GMultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4384:1: ( ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4385:1: ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4385:1: ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4386:1: ( rule__GMultiplicationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4387:1: ( rule__GMultiplicationExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4387:2: rule__GMultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__OperatorAssignment_1_1_in_rule__GMultiplicationExpression__Group_1__1__Impl8846);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4397:1: rule__GMultiplicationExpression__Group_1__2 : rule__GMultiplicationExpression__Group_1__2__Impl ;
    public final void rule__GMultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4401:1: ( rule__GMultiplicationExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4402:2: rule__GMultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__2__Impl_in_rule__GMultiplicationExpression__Group_1__28876);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4408:1: rule__GMultiplicationExpression__Group_1__2__Impl : ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GMultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4412:1: ( ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4413:1: ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4413:1: ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4414:1: ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4415:1: ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4415:2: rule__GMultiplicationExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__RightOperandAssignment_1_2_in_rule__GMultiplicationExpression__Group_1__2__Impl8903);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4431:1: rule__GNegationExpression__Group_1__0 : rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1 ;
    public final void rule__GNegationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4435:1: ( rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4436:2: rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__0__Impl_in_rule__GNegationExpression__Group_1__08939);
            rule__GNegationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__1_in_rule__GNegationExpression__Group_1__08942);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4443:1: rule__GNegationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GNegationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4447:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4448:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4448:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4449:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4450:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4452:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4462:1: rule__GNegationExpression__Group_1__1 : rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2 ;
    public final void rule__GNegationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4466:1: ( rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4467:2: rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__1__Impl_in_rule__GNegationExpression__Group_1__19000);
            rule__GNegationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__2_in_rule__GNegationExpression__Group_1__19003);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4474:1: rule__GNegationExpression__Group_1__1__Impl : ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GNegationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4478:1: ( ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4479:1: ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4479:1: ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4480:1: ( rule__GNegationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4481:1: ( rule__GNegationExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4481:2: rule__GNegationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GNegationExpression__OperatorAssignment_1_1_in_rule__GNegationExpression__Group_1__1__Impl9030);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4491:1: rule__GNegationExpression__Group_1__2 : rule__GNegationExpression__Group_1__2__Impl ;
    public final void rule__GNegationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4495:1: ( rule__GNegationExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4496:2: rule__GNegationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__2__Impl_in_rule__GNegationExpression__Group_1__29060);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4502:1: rule__GNegationExpression__Group_1__2__Impl : ( ( rule__GNegationExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__GNegationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4506:1: ( ( ( rule__GNegationExpression__OperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4507:1: ( ( rule__GNegationExpression__OperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4507:1: ( ( rule__GNegationExpression__OperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4508:1: ( rule__GNegationExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4509:1: ( rule__GNegationExpression__OperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4509:2: rule__GNegationExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GNegationExpression__OperandAssignment_1_2_in_rule__GNegationExpression__Group_1__2__Impl9087);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4525:1: rule__GNavigationExpression__Group__0 : rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1 ;
    public final void rule__GNavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4529:1: ( rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4530:2: rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__0__Impl_in_rule__GNavigationExpression__Group__09123);
            rule__GNavigationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__1_in_rule__GNavigationExpression__Group__09126);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4537:1: rule__GNavigationExpression__Group__0__Impl : ( ruleGReferenceExpression ) ;
    public final void rule__GNavigationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4541:1: ( ( ruleGReferenceExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4542:1: ( ruleGReferenceExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4542:1: ( ruleGReferenceExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4543:1: ruleGReferenceExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_rule__GNavigationExpression__Group__0__Impl9153);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4554:1: rule__GNavigationExpression__Group__1 : rule__GNavigationExpression__Group__1__Impl ;
    public final void rule__GNavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4558:1: ( rule__GNavigationExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4559:2: rule__GNavigationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__1__Impl_in_rule__GNavigationExpression__Group__19182);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4565:1: rule__GNavigationExpression__Group__1__Impl : ( ( rule__GNavigationExpression__Group_1__0 )* ) ;
    public final void rule__GNavigationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4569:1: ( ( ( rule__GNavigationExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4570:1: ( ( rule__GNavigationExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4570:1: ( ( rule__GNavigationExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4571:1: ( rule__GNavigationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4572:1: ( rule__GNavigationExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4572:2: rule__GNavigationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__0_in_rule__GNavigationExpression__Group__1__Impl9209);
            	    rule__GNavigationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4586:1: rule__GNavigationExpression__Group_1__0 : rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1 ;
    public final void rule__GNavigationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4590:1: ( rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4591:2: rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__0__Impl_in_rule__GNavigationExpression__Group_1__09244);
            rule__GNavigationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__1_in_rule__GNavigationExpression__Group_1__09247);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4598:1: rule__GNavigationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GNavigationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4602:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4603:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4603:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4604:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionSourceAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4605:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4607:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionSourceAction_1_0()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4617:1: rule__GNavigationExpression__Group_1__1 : rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2 ;
    public final void rule__GNavigationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4621:1: ( rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4622:2: rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__1__Impl_in_rule__GNavigationExpression__Group_1__19305);
            rule__GNavigationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__2_in_rule__GNavigationExpression__Group_1__19308);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4629:1: rule__GNavigationExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__GNavigationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4633:1: ( ( '.' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4634:1: ( '.' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4634:1: ( '.' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4635:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getFullStopKeyword_1_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__GNavigationExpression__Group_1__1__Impl9336); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getFullStopKeyword_1_1()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4648:1: rule__GNavigationExpression__Group_1__2 : rule__GNavigationExpression__Group_1__2__Impl ;
    public final void rule__GNavigationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4652:1: ( rule__GNavigationExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4653:2: rule__GNavigationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__2__Impl_in_rule__GNavigationExpression__Group_1__29367);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4659:1: rule__GNavigationExpression__Group_1__2__Impl : ( ( rule__GNavigationExpression__FeatureAssignment_1_2 ) ) ;
    public final void rule__GNavigationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4663:1: ( ( ( rule__GNavigationExpression__FeatureAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4664:1: ( ( rule__GNavigationExpression__FeatureAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4664:1: ( ( rule__GNavigationExpression__FeatureAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4665:1: ( rule__GNavigationExpression__FeatureAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getFeatureAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4666:1: ( rule__GNavigationExpression__FeatureAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4666:2: rule__GNavigationExpression__FeatureAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__FeatureAssignment_1_2_in_rule__GNavigationExpression__Group_1__2__Impl9394);
            rule__GNavigationExpression__FeatureAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getFeatureAssignment_1_2()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4682:1: rule__GReferenceExpression__Group_1__0 : rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1 ;
    public final void rule__GReferenceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4686:1: ( rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4687:2: rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__0__Impl_in_rule__GReferenceExpression__Group_1__09430);
            rule__GReferenceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__1_in_rule__GReferenceExpression__Group_1__09433);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4694:1: rule__GReferenceExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GReferenceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4698:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4699:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4699:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4700:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4701:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4703:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4713:1: rule__GReferenceExpression__Group_1__1 : rule__GReferenceExpression__Group_1__1__Impl ;
    public final void rule__GReferenceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4717:1: ( rule__GReferenceExpression__Group_1__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4718:2: rule__GReferenceExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__1__Impl_in_rule__GReferenceExpression__Group_1__19491);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4724:1: rule__GReferenceExpression__Group_1__1__Impl : ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) ) ;
    public final void rule__GReferenceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4728:1: ( ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4729:1: ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4729:1: ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4730:1: ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4731:1: ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4731:2: rule__GReferenceExpression__ReferencedEObjectAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__ReferencedEObjectAssignment_1_1_in_rule__GReferenceExpression__Group_1__1__Impl9518);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4745:1: rule__GStringExpression__Group__0 : rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1 ;
    public final void rule__GStringExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4749:1: ( rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4750:2: rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GStringExpression__Group__0__Impl_in_rule__GStringExpression__Group__09552);
            rule__GStringExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GStringExpression__Group__1_in_rule__GStringExpression__Group__09555);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4757:1: rule__GStringExpression__Group__0__Impl : ( () ) ;
    public final void rule__GStringExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4761:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4762:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4762:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4763:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4764:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4766:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4776:1: rule__GStringExpression__Group__1 : rule__GStringExpression__Group__1__Impl ;
    public final void rule__GStringExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4780:1: ( rule__GStringExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4781:2: rule__GStringExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GStringExpression__Group__1__Impl_in_rule__GStringExpression__Group__19613);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4787:1: rule__GStringExpression__Group__1__Impl : ( ( rule__GStringExpression__ValueAssignment_1 ) ) ;
    public final void rule__GStringExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4791:1: ( ( ( rule__GStringExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4792:1: ( ( rule__GStringExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4792:1: ( ( rule__GStringExpression__ValueAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4793:1: ( rule__GStringExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4794:1: ( rule__GStringExpression__ValueAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4794:2: rule__GStringExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GStringExpression__ValueAssignment_1_in_rule__GStringExpression__Group__1__Impl9640);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4808:1: rule__GBooleanExpression__Group__0 : rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1 ;
    public final void rule__GBooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4812:1: ( rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4813:2: rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__0__Impl_in_rule__GBooleanExpression__Group__09674);
            rule__GBooleanExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__1_in_rule__GBooleanExpression__Group__09677);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4820:1: rule__GBooleanExpression__Group__0__Impl : ( () ) ;
    public final void rule__GBooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4824:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4825:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4825:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4826:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4827:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4829:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4839:1: rule__GBooleanExpression__Group__1 : rule__GBooleanExpression__Group__1__Impl ;
    public final void rule__GBooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4843:1: ( rule__GBooleanExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4844:2: rule__GBooleanExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__1__Impl_in_rule__GBooleanExpression__Group__19735);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4850:1: rule__GBooleanExpression__Group__1__Impl : ( ( rule__GBooleanExpression__ValueAssignment_1 ) ) ;
    public final void rule__GBooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4854:1: ( ( ( rule__GBooleanExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4855:1: ( ( rule__GBooleanExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4855:1: ( ( rule__GBooleanExpression__ValueAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4856:1: ( rule__GBooleanExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4857:1: ( rule__GBooleanExpression__ValueAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4857:2: rule__GBooleanExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__ValueAssignment_1_in_rule__GBooleanExpression__Group__1__Impl9762);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4871:1: rule__GIntegerExpression__Group__0 : rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1 ;
    public final void rule__GIntegerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4875:1: ( rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4876:2: rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__0__Impl_in_rule__GIntegerExpression__Group__09796);
            rule__GIntegerExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__1_in_rule__GIntegerExpression__Group__09799);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4883:1: rule__GIntegerExpression__Group__0__Impl : ( () ) ;
    public final void rule__GIntegerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4887:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4888:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4888:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4889:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4890:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4892:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4902:1: rule__GIntegerExpression__Group__1 : rule__GIntegerExpression__Group__1__Impl ;
    public final void rule__GIntegerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4906:1: ( rule__GIntegerExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4907:2: rule__GIntegerExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__1__Impl_in_rule__GIntegerExpression__Group__19857);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4913:1: rule__GIntegerExpression__Group__1__Impl : ( ( rule__GIntegerExpression__ValueAssignment_1 ) ) ;
    public final void rule__GIntegerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4917:1: ( ( ( rule__GIntegerExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4918:1: ( ( rule__GIntegerExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4918:1: ( ( rule__GIntegerExpression__ValueAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4919:1: ( rule__GIntegerExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4920:1: ( rule__GIntegerExpression__ValueAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4920:2: rule__GIntegerExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__ValueAssignment_1_in_rule__GIntegerExpression__Group__1__Impl9884);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4934:1: rule__GDoubleExpression__Group__0 : rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1 ;
    public final void rule__GDoubleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4938:1: ( rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4939:2: rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__0__Impl_in_rule__GDoubleExpression__Group__09918);
            rule__GDoubleExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__1_in_rule__GDoubleExpression__Group__09921);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4946:1: rule__GDoubleExpression__Group__0__Impl : ( () ) ;
    public final void rule__GDoubleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4950:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4951:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4951:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4952:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4953:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4955:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4965:1: rule__GDoubleExpression__Group__1 : rule__GDoubleExpression__Group__1__Impl ;
    public final void rule__GDoubleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4969:1: ( rule__GDoubleExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4970:2: rule__GDoubleExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__1__Impl_in_rule__GDoubleExpression__Group__19979);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4976:1: rule__GDoubleExpression__Group__1__Impl : ( ( rule__GDoubleExpression__ValueAssignment_1 ) ) ;
    public final void rule__GDoubleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4980:1: ( ( ( rule__GDoubleExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4981:1: ( ( rule__GDoubleExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4981:1: ( ( rule__GDoubleExpression__ValueAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4982:1: ( rule__GDoubleExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4983:1: ( rule__GDoubleExpression__ValueAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4983:2: rule__GDoubleExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__ValueAssignment_1_in_rule__GDoubleExpression__Group__1__Impl10006);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4997:1: rule__GEnumLiteralExpression__Group__0 : rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1 ;
    public final void rule__GEnumLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5001:1: ( rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5002:2: rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__0__Impl_in_rule__GEnumLiteralExpression__Group__010040);
            rule__GEnumLiteralExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__1_in_rule__GEnumLiteralExpression__Group__010043);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5009:1: rule__GEnumLiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__GEnumLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5013:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5014:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5014:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5015:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5016:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5018:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5028:1: rule__GEnumLiteralExpression__Group__1 : rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2 ;
    public final void rule__GEnumLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5032:1: ( rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5033:2: rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__1__Impl_in_rule__GEnumLiteralExpression__Group__110101);
            rule__GEnumLiteralExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__2_in_rule__GEnumLiteralExpression__Group__110104);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5040:1: rule__GEnumLiteralExpression__Group__1__Impl : ( '#' ) ;
    public final void rule__GEnumLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5044:1: ( ( '#' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5045:1: ( '#' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5045:1: ( '#' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5046:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__GEnumLiteralExpression__Group__1__Impl10132); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5059:1: rule__GEnumLiteralExpression__Group__2 : rule__GEnumLiteralExpression__Group__2__Impl ;
    public final void rule__GEnumLiteralExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5063:1: ( rule__GEnumLiteralExpression__Group__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5064:2: rule__GEnumLiteralExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__2__Impl_in_rule__GEnumLiteralExpression__Group__210163);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5070:1: rule__GEnumLiteralExpression__Group__2__Impl : ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) ) ;
    public final void rule__GEnumLiteralExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5074:1: ( ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5075:1: ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5075:1: ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5076:1: ( rule__GEnumLiteralExpression__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5077:1: ( rule__GEnumLiteralExpression__ValueAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5077:2: rule__GEnumLiteralExpression__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__ValueAssignment_2_in_rule__GEnumLiteralExpression__Group__2__Impl10190);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5093:1: rule__GIfExpression__Group__0 : rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1 ;
    public final void rule__GIfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5097:1: ( rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5098:2: rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__0__Impl_in_rule__GIfExpression__Group__010226);
            rule__GIfExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__1_in_rule__GIfExpression__Group__010229);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5105:1: rule__GIfExpression__Group__0__Impl : ( () ) ;
    public final void rule__GIfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5109:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5110:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5110:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5111:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5112:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5114:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5124:1: rule__GIfExpression__Group__1 : rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2 ;
    public final void rule__GIfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5128:1: ( rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5129:2: rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__1__Impl_in_rule__GIfExpression__Group__110287);
            rule__GIfExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__2_in_rule__GIfExpression__Group__110290);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5136:1: rule__GIfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__GIfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5140:1: ( ( 'if' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5141:1: ( 'if' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5141:1: ( 'if' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5142:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getIfKeyword_1()); 
            }
            match(input,46,FOLLOW_46_in_rule__GIfExpression__Group__1__Impl10318); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5155:1: rule__GIfExpression__Group__2 : rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3 ;
    public final void rule__GIfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5159:1: ( rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5160:2: rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__2__Impl_in_rule__GIfExpression__Group__210349);
            rule__GIfExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__3_in_rule__GIfExpression__Group__210352);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5167:1: rule__GIfExpression__Group__2__Impl : ( ( rule__GIfExpression__ConditionAssignment_2 ) ) ;
    public final void rule__GIfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5171:1: ( ( ( rule__GIfExpression__ConditionAssignment_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5172:1: ( ( rule__GIfExpression__ConditionAssignment_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5172:1: ( ( rule__GIfExpression__ConditionAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5173:1: ( rule__GIfExpression__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getConditionAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5174:1: ( rule__GIfExpression__ConditionAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5174:2: rule__GIfExpression__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__GIfExpression__ConditionAssignment_2_in_rule__GIfExpression__Group__2__Impl10379);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5184:1: rule__GIfExpression__Group__3 : rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4 ;
    public final void rule__GIfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5188:1: ( rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5189:2: rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__3__Impl_in_rule__GIfExpression__Group__310409);
            rule__GIfExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__4_in_rule__GIfExpression__Group__310412);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5196:1: rule__GIfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__GIfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5200:1: ( ( 'then' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5201:1: ( 'then' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5201:1: ( 'then' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5202:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenKeyword_3()); 
            }
            match(input,47,FOLLOW_47_in_rule__GIfExpression__Group__3__Impl10440); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5215:1: rule__GIfExpression__Group__4 : rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5 ;
    public final void rule__GIfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5219:1: ( rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5220:2: rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__4__Impl_in_rule__GIfExpression__Group__410471);
            rule__GIfExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__5_in_rule__GIfExpression__Group__410474);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5227:1: rule__GIfExpression__Group__4__Impl : ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) ) ;
    public final void rule__GIfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5231:1: ( ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5232:1: ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5232:1: ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5233:1: ( rule__GIfExpression__ThenExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenExpressionAssignment_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5234:1: ( rule__GIfExpression__ThenExpressionAssignment_4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5234:2: rule__GIfExpression__ThenExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__GIfExpression__ThenExpressionAssignment_4_in_rule__GIfExpression__Group__4__Impl10501);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5244:1: rule__GIfExpression__Group__5 : rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6 ;
    public final void rule__GIfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5248:1: ( rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5249:2: rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__5__Impl_in_rule__GIfExpression__Group__510531);
            rule__GIfExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__6_in_rule__GIfExpression__Group__510534);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5256:1: rule__GIfExpression__Group__5__Impl : ( 'else' ) ;
    public final void rule__GIfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5260:1: ( ( 'else' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5261:1: ( 'else' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5261:1: ( 'else' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5262:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseKeyword_5()); 
            }
            match(input,48,FOLLOW_48_in_rule__GIfExpression__Group__5__Impl10562); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5275:1: rule__GIfExpression__Group__6 : rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7 ;
    public final void rule__GIfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5279:1: ( rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5280:2: rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__6__Impl_in_rule__GIfExpression__Group__610593);
            rule__GIfExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__7_in_rule__GIfExpression__Group__610596);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5287:1: rule__GIfExpression__Group__6__Impl : ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) ) ;
    public final void rule__GIfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5291:1: ( ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5292:1: ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5292:1: ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5293:1: ( rule__GIfExpression__ElseExpressionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseExpressionAssignment_6()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5294:1: ( rule__GIfExpression__ElseExpressionAssignment_6 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5294:2: rule__GIfExpression__ElseExpressionAssignment_6
            {
            pushFollow(FOLLOW_rule__GIfExpression__ElseExpressionAssignment_6_in_rule__GIfExpression__Group__6__Impl10623);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5304:1: rule__GIfExpression__Group__7 : rule__GIfExpression__Group__7__Impl ;
    public final void rule__GIfExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5308:1: ( rule__GIfExpression__Group__7__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5309:2: rule__GIfExpression__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__7__Impl_in_rule__GIfExpression__Group__710653);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5315:1: rule__GIfExpression__Group__7__Impl : ( 'endif' ) ;
    public final void rule__GIfExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5319:1: ( ( 'endif' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5320:1: ( 'endif' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5320:1: ( 'endif' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5321:1: 'endif'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getEndifKeyword_7()); 
            }
            match(input,49,FOLLOW_49_in_rule__GIfExpression__Group__7__Impl10681); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5350:1: rule__GBraceExpression__Group__0 : rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1 ;
    public final void rule__GBraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5354:1: ( rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5355:2: rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__0__Impl_in_rule__GBraceExpression__Group__010728);
            rule__GBraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBraceExpression__Group__1_in_rule__GBraceExpression__Group__010731);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5362:1: rule__GBraceExpression__Group__0__Impl : ( () ) ;
    public final void rule__GBraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5366:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5367:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5367:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5368:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5369:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5371:1: 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5381:1: rule__GBraceExpression__Group__1 : rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2 ;
    public final void rule__GBraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5385:1: ( rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5386:2: rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__1__Impl_in_rule__GBraceExpression__Group__110789);
            rule__GBraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBraceExpression__Group__2_in_rule__GBraceExpression__Group__110792);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5393:1: rule__GBraceExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__GBraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5397:1: ( ( '(' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5398:1: ( '(' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5398:1: ( '(' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5399:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__GBraceExpression__Group__1__Impl10820); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5412:1: rule__GBraceExpression__Group__2 : rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3 ;
    public final void rule__GBraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5416:1: ( rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5417:2: rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__2__Impl_in_rule__GBraceExpression__Group__210851);
            rule__GBraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBraceExpression__Group__3_in_rule__GBraceExpression__Group__210854);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5424:1: rule__GBraceExpression__Group__2__Impl : ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) ) ;
    public final void rule__GBraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5428:1: ( ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5429:1: ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5429:1: ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5430:1: ( rule__GBraceExpression__InnerExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getInnerExpressionAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5431:1: ( rule__GBraceExpression__InnerExpressionAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5431:2: rule__GBraceExpression__InnerExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__GBraceExpression__InnerExpressionAssignment_2_in_rule__GBraceExpression__Group__2__Impl10881);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5441:1: rule__GBraceExpression__Group__3 : rule__GBraceExpression__Group__3__Impl ;
    public final void rule__GBraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5445:1: ( rule__GBraceExpression__Group__3__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5446:2: rule__GBraceExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__3__Impl_in_rule__GBraceExpression__Group__310911);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5452:1: rule__GBraceExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__GBraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5456:1: ( ( ')' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5457:1: ( ')' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5457:1: ( ')' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5458:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__GBraceExpression__Group__3__Impl10939); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5479:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5483:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5484:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010978);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010981);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5491:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5495:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5496:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5496:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5497:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl11008); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5508:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5512:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5513:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__111037);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5519:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5523:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5524:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5524:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5525:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5526:1: ( rule__QualifiedName__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==44) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_ID) ) {
                        int LA32_3 = input.LA(3);

                        if ( (synpred38_InternalBCOoL()) ) {
                            alt32=1;
                        }


                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5526:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl11064);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5540:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5544:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5545:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__011099);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__011102);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5552:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5556:1: ( ( ( '.' ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5557:1: ( ( '.' ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5557:1: ( ( '.' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5558:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5559:1: ( '.' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5560:2: '.'
            {
            match(input,44,FOLLOW_44_in_rule__QualifiedName__Group_1__0__Impl11131); if (state.failed) return ;

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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5571:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5575:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5576:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__111163);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5582:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5586:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5587:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5587:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5588:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl11190); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5604:1: rule__BCoolSpec__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BCoolSpec__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5608:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5609:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5609:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5610:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolSpec__NameAssignment_011228); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5619:1: rule__BCoolSpec__ImportsLibAssignment_1 : ( ruleImportLibRule ) ;
    public final void rule__BCoolSpec__ImportsLibAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5623:1: ( ( ruleImportLibRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5624:1: ( ruleImportLibRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5624:1: ( ruleImportLibRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5625:1: ruleImportLibRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsLibImportLibRuleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImportLibRule_in_rule__BCoolSpec__ImportsLibAssignment_111259);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5634:1: rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 : ( ruleImportInterfaceRule ) ;
    public final void rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5638:1: ( ( ruleImportInterfaceRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5639:1: ( ruleImportInterfaceRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5639:1: ( ruleImportInterfaceRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5640:1: ruleImportInterfaceRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceImportInterfaceRuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleImportInterfaceRule_in_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_211290);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5649:1: rule__BCoolSpec__BcoolOperatorsAssignment_3 : ( ruleBCoolOperatorSpec ) ;
    public final void rule__BCoolSpec__BcoolOperatorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5653:1: ( ( ruleBCoolOperatorSpec ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5654:1: ( ruleBCoolOperatorSpec )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5654:1: ( ruleBCoolOperatorSpec )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5655:1: ruleBCoolOperatorSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsBCoolOperatorSpecParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorSpec_in_rule__BCoolSpec__BcoolOperatorsAssignment_311321);
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


    // $ANTLR start "rule__BCoolOperatorSpec__NameAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5664:1: rule__BCoolOperatorSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BCoolOperatorSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5668:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5669:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5669:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5670:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolOperatorSpec__NameAssignment_111352); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__BCoolOperatorSpec__NameAssignment_1"


    // $ANTLR start "rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5679:1: rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 : ( ruleglobalEventExpressionRule ) ;
    public final void rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5683:1: ( ( ruleglobalEventExpressionRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5684:1: ( ruleglobalEventExpressionRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5684:1: ( ruleglobalEventExpressionRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5685:1: ruleglobalEventExpressionRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsGlobalEventExpressionRuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleglobalEventExpressionRule_in_rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_211383);
            ruleglobalEventExpressionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsGlobalEventExpressionRuleParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2"


    // $ANTLR start "rule__BCoolOperatorSpec__GlobalDSEsAssignment_3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5694:1: rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 : ( ruleglobalDSEsRule ) ;
    public final void rule__BCoolOperatorSpec__GlobalDSEsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5698:1: ( ( ruleglobalDSEsRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5699:1: ( ruleglobalDSEsRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5699:1: ( ruleglobalDSEsRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5700:1: ruleglobalDSEsRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsGlobalDSEsRuleParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleglobalDSEsRule_in_rule__BCoolOperatorSpec__GlobalDSEsAssignment_311414);
            ruleglobalDSEsRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsGlobalDSEsRuleParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__BCoolOperatorSpec__GlobalDSEsAssignment_3"


    // $ANTLR start "rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5709:1: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 : ( ruleBCoolCompositionRule ) ;
    public final void rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5713:1: ( ( ruleBCoolCompositionRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5714:1: ( ruleBCoolCompositionRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5714:1: ( ruleBCoolCompositionRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5715:1: ruleBCoolCompositionRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesBCoolCompositionRuleParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBCoolCompositionRule_in_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_411445);
            ruleBCoolCompositionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesBCoolCompositionRuleParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4"


    // $ANTLR start "rule__GlobalDSEsRule__NameAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5724:1: rule__GlobalDSEsRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalDSEsRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5728:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5729:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5729:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5730:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalDSEsRule__NameAssignment_111476); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5739:1: rule__BCoolCompositionRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BCoolCompositionRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5743:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5744:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5744:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5745:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolCompositionRule__NameAssignment_111507); if (state.failed) return ;
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


    // $ANTLR start "rule__BCoolCompositionRule__DSEsAssignment_3_0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5754:1: rule__BCoolCompositionRule__DSEsAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BCoolCompositionRule__DSEsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5758:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5759:1: ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5759:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5760:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getDSEsECLDefCSCrossReference_3_0_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5761:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5762:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getDSEsECLDefCSQualifiedNameParserRuleCall_3_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__BCoolCompositionRule__DSEsAssignment_3_011542);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getDSEsECLDefCSQualifiedNameParserRuleCall_3_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getDSEsECLDefCSCrossReference_3_0_0()); 
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
    // $ANTLR end "rule__BCoolCompositionRule__DSEsAssignment_3_0"


    // $ANTLR start "rule__BCoolCompositionRule__DSEsAssignment_3_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5773:1: rule__BCoolCompositionRule__DSEsAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BCoolCompositionRule__DSEsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5777:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5778:1: ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5778:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5779:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getDSEsECLDefCSCrossReference_3_1_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5780:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5781:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getDSEsECLDefCSQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__BCoolCompositionRule__DSEsAssignment_3_1_111581);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getDSEsECLDefCSQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getDSEsECLDefCSCrossReference_3_1_1_0()); 
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
    // $ANTLR end "rule__BCoolCompositionRule__DSEsAssignment_3_1_1"


    // $ANTLR start "rule__BCoolCompositionRule__MatchingRuleAssignment_6"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5792:1: rule__BCoolCompositionRule__MatchingRuleAssignment_6 : ( ruleMatchingRule ) ;
    public final void rule__BCoolCompositionRule__MatchingRuleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5796:1: ( ( ruleMatchingRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5797:1: ( ruleMatchingRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5797:1: ( ruleMatchingRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5798:1: ruleMatchingRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_rule__BCoolCompositionRule__MatchingRuleAssignment_611616);
            ruleMatchingRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__BCoolCompositionRule__MatchingRuleAssignment_6"


    // $ANTLR start "rule__BCoolCompositionRule__CoordinationRuleAssignment_7"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5807:1: rule__BCoolCompositionRule__CoordinationRuleAssignment_7 : ( ruleCoordinationRule ) ;
    public final void rule__BCoolCompositionRule__CoordinationRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5811:1: ( ( ruleCoordinationRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5812:1: ( ruleCoordinationRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5812:1: ( ruleCoordinationRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5813:1: ruleCoordinationRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_rule__BCoolCompositionRule__CoordinationRuleAssignment_711647);
            ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__BCoolCompositionRule__CoordinationRuleAssignment_7"


    // $ANTLR start "rule__MatchingRule__ConditionAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5822:1: rule__MatchingRule__ConditionAssignment_1 : ( ruleGExpression ) ;
    public final void rule__MatchingRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5826:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5827:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5827:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5828:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getConditionGExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__MatchingRule__ConditionAssignment_111678);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5837:1: rule__MatchingRule__FilterEventExpressionsAssignment_4_1 : ( ruleEventExpression ) ;
    public final void rule__MatchingRule__FilterEventExpressionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5841:1: ( ( ruleEventExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5842:1: ( ruleEventExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5842:1: ( ruleEventExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5843:1: ruleEventExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsEventExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEventExpression_in_rule__MatchingRule__FilterEventExpressionsAssignment_4_111709);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5852:1: rule__EventExpression__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EventExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5856:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5857:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5857:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5858:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventExpression__NameAssignment_011740); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5867:1: rule__EventExpression__DeclarationAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventExpression__DeclarationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5871:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5872:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5872:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5873:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5874:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5875:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventExpression__DeclarationAssignment_211775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationIDTerminalRuleCall_2_0_1()); 
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5886:1: rule__EventExpression__ActualParametersAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__EventExpression__ActualParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5890:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5891:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5891:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5892:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_0_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5893:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5894:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventExpression__ActualParametersAssignment_4_011814); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5905:1: rule__EventExpression__ActualParametersAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__EventExpression__ActualParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5909:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5910:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5910:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5911:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5912:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5913:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventExpression__ActualParametersAssignment_4_1_111853); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5924:1: rule__CoordinationRule__EventRelationsAssignment : ( ruleEventRelation ) ;
    public final void rule__CoordinationRule__EventRelationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5928:1: ( ( ruleEventRelation ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5929:1: ( ruleEventRelation )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5929:1: ( ruleEventRelation )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5930:1: ruleEventRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEventRelation_in_rule__CoordinationRule__EventRelationsAssignment11888);
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


    // $ANTLR start "rule__EventRelation__DeclarationAssignment_0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5939:1: rule__EventRelation__DeclarationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EventRelation__DeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5943:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5944:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5944:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5945:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_0_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5946:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5947:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventRelation__DeclarationAssignment_011923); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_0_0()); 
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
    // $ANTLR end "rule__EventRelation__DeclarationAssignment_0"


    // $ANTLR start "rule__EventRelation__ActualParametersAssignment_2_0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5958:1: rule__EventRelation__ActualParametersAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EventRelation__ActualParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5962:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5963:1: ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5963:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5964:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_2_0_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5965:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5966:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSQualifiedNameParserRuleCall_2_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EventRelation__ActualParametersAssignment_2_011962);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSQualifiedNameParserRuleCall_2_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_2_0_0()); 
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
    // $ANTLR end "rule__EventRelation__ActualParametersAssignment_2_0"


    // $ANTLR start "rule__EventRelation__ActualParametersAssignment_2_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5977:1: rule__EventRelation__ActualParametersAssignment_2_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EventRelation__ActualParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5981:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5982:1: ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5982:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5983:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_2_1_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5984:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5985:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSQualifiedNameParserRuleCall_2_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EventRelation__ActualParametersAssignment_2_1_112001);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSQualifiedNameParserRuleCall_2_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_2_1_1_0()); 
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
    // $ANTLR end "rule__EventRelation__ActualParametersAssignment_2_1_1"


    // $ANTLR start "rule__ImportLibRule__ImportURIAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5996:1: rule__ImportLibRule__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImportLibRule__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6000:1: ( ( RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6001:1: ( RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6001:1: ( RULE_STRING )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6002:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportLibRule__ImportURIAssignment_112036); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6011:1: rule__ImportInterfaceRule__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImportInterfaceRule__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6015:1: ( ( RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6016:1: ( RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6016:1: ( RULE_STRING )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6017:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportInterfaceRule__ImportURIAssignment_112067); if (state.failed) return ;
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


    // $ANTLR start "rule__GImportStatement__ImportURIAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6029:1: rule__GImportStatement__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GImportStatement__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6033:1: ( ( RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6034:1: ( RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6034:1: ( RULE_STRING )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6035:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GImportStatement__ImportURIAssignment_112101); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6044:1: rule__GOrExpression__OperatorAssignment_1_1 : ( ruleGOrOperator ) ;
    public final void rule__GOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6048:1: ( ( ruleGOrOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6049:1: ( ruleGOrOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6049:1: ( ruleGOrOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6050:1: ruleGOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGOrOperator_in_rule__GOrExpression__OperatorAssignment_1_112132);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6059:1: rule__GOrExpression__RightOperandAssignment_1_2 : ( ruleGXorExpression ) ;
    public final void rule__GOrExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6063:1: ( ( ruleGXorExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6064:1: ( ruleGXorExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6064:1: ( ruleGXorExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6065:1: ruleGXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_rule__GOrExpression__RightOperandAssignment_1_212163);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6074:1: rule__GXorExpression__OperatorAssignment_1_1 : ( ruleGXorOperator ) ;
    public final void rule__GXorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6078:1: ( ( ruleGXorOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6079:1: ( ruleGXorOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6079:1: ( ruleGXorOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6080:1: ruleGXorOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGXorOperator_in_rule__GXorExpression__OperatorAssignment_1_112194);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6089:1: rule__GXorExpression__RightOperandAssignment_1_2 : ( ruleGAndExpression ) ;
    public final void rule__GXorExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6093:1: ( ( ruleGAndExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6094:1: ( ruleGAndExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6094:1: ( ruleGAndExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6095:1: ruleGAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_rule__GXorExpression__RightOperandAssignment_1_212225);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6104:1: rule__GAndExpression__OperatorAssignment_1_1 : ( ruleGAndOperator ) ;
    public final void rule__GAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6108:1: ( ( ruleGAndOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6109:1: ( ruleGAndOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6109:1: ( ruleGAndOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6110:1: ruleGAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGAndOperator_in_rule__GAndExpression__OperatorAssignment_1_112256);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6119:1: rule__GAndExpression__RightOperandAssignment_1_2 : ( ruleGEqualityExpression ) ;
    public final void rule__GAndExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6123:1: ( ( ruleGEqualityExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6124:1: ( ruleGEqualityExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6124:1: ( ruleGEqualityExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6125:1: ruleGEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__RightOperandAssignment_1_212287);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6134:1: rule__GEqualityExpression__OperatorAssignment_1_1 : ( ruleGEqualityOperator ) ;
    public final void rule__GEqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6138:1: ( ( ruleGEqualityOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6139:1: ( ruleGEqualityOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6139:1: ( ruleGEqualityOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6140:1: ruleGEqualityOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGEqualityOperator_in_rule__GEqualityExpression__OperatorAssignment_1_112318);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6149:1: rule__GEqualityExpression__RightOperandAssignment_1_2 : ( ruleGRelationExpression ) ;
    public final void rule__GEqualityExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6153:1: ( ( ruleGRelationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6154:1: ( ruleGRelationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6154:1: ( ruleGRelationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6155:1: ruleGRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__RightOperandAssignment_1_212349);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6164:1: rule__GRelationExpression__OperatorAssignment_1_1 : ( ruleGRelationOperator ) ;
    public final void rule__GRelationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6168:1: ( ( ruleGRelationOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6169:1: ( ruleGRelationOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6169:1: ( ruleGRelationOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6170:1: ruleGRelationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGRelationOperator_in_rule__GRelationExpression__OperatorAssignment_1_112380);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6179:1: rule__GRelationExpression__RightOperandAssignment_1_2 : ( ruleGAdditionExpression ) ;
    public final void rule__GRelationExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6183:1: ( ( ruleGAdditionExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6184:1: ( ruleGAdditionExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6184:1: ( ruleGAdditionExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6185:1: ruleGAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__RightOperandAssignment_1_212411);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6194:1: rule__GAdditionExpression__OperatorAssignment_1_1 : ( ruleGAdditionOperator ) ;
    public final void rule__GAdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6198:1: ( ( ruleGAdditionOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6199:1: ( ruleGAdditionOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6199:1: ( ruleGAdditionOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6200:1: ruleGAdditionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGAdditionOperator_in_rule__GAdditionExpression__OperatorAssignment_1_112442);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6209:1: rule__GAdditionExpression__RightOperandAssignment_1_2 : ( ruleGMultiplicationExpression ) ;
    public final void rule__GAdditionExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6213:1: ( ( ruleGMultiplicationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6214:1: ( ruleGMultiplicationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6214:1: ( ruleGMultiplicationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6215:1: ruleGMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__RightOperandAssignment_1_212473);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6224:1: rule__GMultiplicationExpression__OperatorAssignment_1_1 : ( ruleGMultiplicationOperator ) ;
    public final void rule__GMultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6228:1: ( ( ruleGMultiplicationOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6229:1: ( ruleGMultiplicationOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6229:1: ( ruleGMultiplicationOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6230:1: ruleGMultiplicationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationOperator_in_rule__GMultiplicationExpression__OperatorAssignment_1_112504);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6239:1: rule__GMultiplicationExpression__RightOperandAssignment_1_2 : ( ruleGNegationExpression ) ;
    public final void rule__GMultiplicationExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6243:1: ( ( ruleGNegationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6244:1: ( ruleGNegationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6244:1: ( ruleGNegationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6245:1: ruleGNegationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__RightOperandAssignment_1_212535);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6254:1: rule__GNegationExpression__OperatorAssignment_1_1 : ( ruleGNegationOperator ) ;
    public final void rule__GNegationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6258:1: ( ( ruleGNegationOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6259:1: ( ruleGNegationOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6259:1: ( ruleGNegationOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6260:1: ruleGNegationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGNegationOperator_in_rule__GNegationExpression__OperatorAssignment_1_112566);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6269:1: rule__GNegationExpression__OperandAssignment_1_2 : ( ruleGNavigationExpression ) ;
    public final void rule__GNegationExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6273:1: ( ( ruleGNavigationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6274:1: ( ruleGNavigationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6274:1: ( ruleGNavigationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6275:1: ruleGNavigationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__OperandAssignment_1_212597);
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


    // $ANTLR start "rule__GNavigationExpression__FeatureAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6284:1: rule__GNavigationExpression__FeatureAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__GNavigationExpression__FeatureAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6288:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6289:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6289:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6290:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getFeatureEStructuralFeatureCrossReference_1_2_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6291:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6292:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GNavigationExpression__FeatureAssignment_1_212632); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getFeatureEStructuralFeatureCrossReference_1_2_0()); 
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
    // $ANTLR end "rule__GNavigationExpression__FeatureAssignment_1_2"


    // $ANTLR start "rule__GReferenceExpression__ReferencedEObjectAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6303:1: rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GReferenceExpression__ReferencedEObjectAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6307:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6308:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6308:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6309:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectCrossReference_1_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6310:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6311:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GReferenceExpression__ReferencedEObjectAssignment_1_112671); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6322:1: rule__GStringExpression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GStringExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6326:1: ( ( RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6327:1: ( RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6327:1: ( RULE_STRING )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6328:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GStringExpression__ValueAssignment_112706); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6337:1: rule__GBooleanExpression__ValueAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__GBooleanExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6341:1: ( ( RULE_BOOLEAN ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6342:1: ( RULE_BOOLEAN )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6342:1: ( RULE_BOOLEAN )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6343:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__GBooleanExpression__ValueAssignment_112737); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6352:1: rule__GIntegerExpression__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__GIntegerExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6356:1: ( ( RULE_INT ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6357:1: ( RULE_INT )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6357:1: ( RULE_INT )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6358:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GIntegerExpression__ValueAssignment_112768); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6367:1: rule__GDoubleExpression__ValueAssignment_1 : ( RULE_DOUBLE ) ;
    public final void rule__GDoubleExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6371:1: ( ( RULE_DOUBLE ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6372:1: ( RULE_DOUBLE )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6372:1: ( RULE_DOUBLE )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6373:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__GDoubleExpression__ValueAssignment_112799); if (state.failed) return ;
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6382:1: rule__GEnumLiteralExpression__ValueAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GEnumLiteralExpression__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6386:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6387:1: ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6387:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6388:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6389:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6390:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GEnumLiteralExpression__ValueAssignment_212834);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6401:1: rule__GIfExpression__ConditionAssignment_2 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6405:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6406:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6406:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6407:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GIfExpression__ConditionAssignment_212869);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6416:1: rule__GIfExpression__ThenExpressionAssignment_4 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ThenExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6420:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6421:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6421:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6422:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GIfExpression__ThenExpressionAssignment_412900);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6431:1: rule__GIfExpression__ElseExpressionAssignment_6 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ElseExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6435:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6436:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6436:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6437:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GIfExpression__ElseExpressionAssignment_612931);
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
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6446:1: rule__GBraceExpression__InnerExpressionAssignment_2 : ( ruleGExpression ) ;
    public final void rule__GBraceExpression__InnerExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6450:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6451:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6451:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6452:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GBraceExpression__InnerExpressionAssignment_212962);
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

    // $ANTLR start synpred38_InternalBCOoL
    public final void synpred38_InternalBCOoL_fragment() throws RecognitionException {   
        // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5526:2: ( rule__QualifiedName__Group_1__0 )
        // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5526:2: rule__QualifiedName__Group_1__0
        {
        pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_synpred38_InternalBCOoL11064);
        rule__QualifiedName__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalBCOoL

    // Delegated rules

    public final boolean synpred38_InternalBCOoL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalBCOoL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleBCoolSpec_in_entryRuleBCoolSpec67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolSpec74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__0_in_ruleBCoolSpec100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorSpec_in_entryRuleBCoolOperatorSpec127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolOperatorSpec134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__0_in_ruleBCoolOperatorSpec160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalDSEsRule_in_entryRuleglobalDSEsRule187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglobalDSEsRule194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__0_in_ruleglobalDSEsRule220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalEventExpressionRule_in_entryRuleglobalEventExpressionRule247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglobalEventExpressionRule254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEventExpressionRule__Group__0_in_ruleglobalEventExpressionRule280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolCompositionRule_in_entryRuleBCoolCompositionRule307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolCompositionRule314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__0_in_ruleBCoolCompositionRule340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingRule374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__0_in_ruleMatchingRule400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_entryRuleEventExpression427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExpression434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__0_in_ruleEventExpression460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinationRule494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CoordinationRule__EventRelationsAssignment_in_ruleCoordinationRule520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_entryRuleEventRelation547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRelation554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__0_in_ruleEventRelation580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportLibRule614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportLibRule__Group__0_in_ruleImportLibRule640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportInterfaceRule674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__0_in_ruleImportInterfaceRule700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGImportStatement736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__0_in_ruleGImportStatement762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_entryRuleGExpression789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGExpression796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_ruleGExpression822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGOrExpression855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__0_in_ruleGOrExpression881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGXorExpression915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__0_in_ruleGXorExpression941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAndExpression975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__0_in_ruleGAndExpression1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEqualityExpression1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__0_in_ruleGEqualityExpression1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRelationExpression1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__0_in_ruleGRelationExpression1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAdditionExpression1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__0_in_ruleGAdditionExpression1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGMultiplicationExpression1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__0_in_ruleGMultiplicationExpression1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNegationExpression1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Alternatives_in_ruleGNegationExpression1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNavigationExpression1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__0_in_ruleGNavigationExpression1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGReferenceExpression1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Alternatives_in_ruleGReferenceExpression1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression1448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGPrimaryExpression1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GPrimaryExpression__Alternatives_in_ruleGPrimaryExpression1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGStringExpression1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__0_in_ruleGStringExpression1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBooleanExpression1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__0_in_ruleGBooleanExpression1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression1628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNumericExpression1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNumericExpression__Alternatives_in_ruleGNumericExpression1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIntegerExpression1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__0_in_ruleGIntegerExpression1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression1748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDoubleExpression1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__0_in_ruleGDoubleExpression1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEnumLiteralExpression1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__0_in_ruleGEnumLiteralExpression1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIfExpression1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__0_in_ruleGIfExpression1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBraceExpression1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__0_in_ruleGBraceExpression1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGAndOperator2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGXorOperator2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGOrOperator2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityOperator__Alternatives_in_ruleGEqualityOperator2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationOperator__Alternatives_in_ruleGRelationOperator2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionOperator__Alternatives_in_ruleGAdditionOperator2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationOperator__Alternatives_in_ruleGMultiplicationOperator2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationOperator__Alternatives_in_ruleGNegationOperator2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__0_in_rule__GNegationExpression__Alternatives2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_rule__GReferenceExpression__Alternatives2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__0_in_rule__GReferenceExpression__Alternatives2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_rule__GPrimaryExpression__Alternatives2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_rule__GPrimaryExpression__Alternatives2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_rule__GPrimaryExpression__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_rule__GPrimaryExpression__Alternatives2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_rule__GPrimaryExpression__Alternatives2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_rule__GPrimaryExpression__Alternatives2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_rule__GNumericExpression__Alternatives2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_rule__GNumericExpression__Alternatives2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GEqualityOperator__Alternatives2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GEqualityOperator__Alternatives2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GRelationOperator__Alternatives2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GRelationOperator__Alternatives2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GRelationOperator__Alternatives2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GRelationOperator__Alternatives2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GAdditionOperator__Alternatives2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GAdditionOperator__Alternatives2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GMultiplicationOperator__Alternatives2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GMultiplicationOperator__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GNegationOperator__Alternatives2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GNegationOperator__Alternatives2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__0__Impl_in_rule__BCoolSpec__Group__02945 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__1_in_rule__BCoolSpec__Group__02948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__NameAssignment_0_in_rule__BCoolSpec__Group__0__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__1__Impl_in_rule__BCoolSpec__Group__13006 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__2_in_rule__BCoolSpec__Group__13009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__ImportsLibAssignment_1_in_rule__BCoolSpec__Group__1__Impl3038 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__ImportsLibAssignment_1_in_rule__BCoolSpec__Group__1__Impl3050 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__2__Impl_in_rule__BCoolSpec__Group__23083 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__3_in_rule__BCoolSpec__Group__23086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2_in_rule__BCoolSpec__Group__2__Impl3115 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2_in_rule__BCoolSpec__Group__2__Impl3127 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__3__Impl_in_rule__BCoolSpec__Group__33160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__BcoolOperatorsAssignment_3_in_rule__BCoolSpec__Group__3__Impl3189 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__BcoolOperatorsAssignment_3_in_rule__BCoolSpec__Group__3__Impl3201 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__0__Impl_in_rule__BCoolOperatorSpec__Group__03242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__1_in_rule__BCoolOperatorSpec__Group__03245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BCoolOperatorSpec__Group__0__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__1__Impl_in_rule__BCoolOperatorSpec__Group__13304 = new BitSet(new long[]{0x00000001A0000000L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__2_in_rule__BCoolOperatorSpec__Group__13307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__NameAssignment_1_in_rule__BCoolOperatorSpec__Group__1__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__2__Impl_in_rule__BCoolOperatorSpec__Group__23364 = new BitSet(new long[]{0x00000001A0000000L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__3_in_rule__BCoolOperatorSpec__Group__23367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2_in_rule__BCoolOperatorSpec__Group__2__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__3__Impl_in_rule__BCoolOperatorSpec__Group__33425 = new BitSet(new long[]{0x00000001A0000000L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__4_in_rule__BCoolOperatorSpec__Group__33428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__GlobalDSEsAssignment_3_in_rule__BCoolOperatorSpec__Group__3__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__4__Impl_in_rule__BCoolOperatorSpec__Group__43486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4_in_rule__BCoolOperatorSpec__Group__4__Impl3515 = new BitSet(new long[]{0x00000001A0000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4_in_rule__BCoolOperatorSpec__Group__4__Impl3527 = new BitSet(new long[]{0x00000001A0000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__0__Impl_in_rule__GlobalDSEsRule__Group__03570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__1_in_rule__GlobalDSEsRule__Group__03573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GlobalDSEsRule__Group__0__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__1__Impl_in_rule__GlobalDSEsRule__Group__13632 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__2_in_rule__GlobalDSEsRule__Group__13635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__NameAssignment_1_in_rule__GlobalDSEsRule__Group__1__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__2__Impl_in_rule__GlobalDSEsRule__Group__23692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GlobalDSEsRule__Group__2__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEventExpressionRule__Group__0__Impl_in_rule__GlobalEventExpressionRule__Group__03757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GlobalEventExpressionRule__Group__1_in_rule__GlobalEventExpressionRule__Group__03760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GlobalEventExpressionRule__Group__0__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEventExpressionRule__Group__1__Impl_in_rule__GlobalEventExpressionRule__Group__13819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_rule__GlobalEventExpressionRule__Group__1__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__0__Impl_in_rule__BCoolCompositionRule__Group__03879 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__1_in_rule__BCoolCompositionRule__Group__03882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BCoolCompositionRule__Group__0__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__1__Impl_in_rule__BCoolCompositionRule__Group__13941 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__2_in_rule__BCoolCompositionRule__Group__13944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__NameAssignment_1_in_rule__BCoolCompositionRule__Group__1__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__2__Impl_in_rule__BCoolCompositionRule__Group__24001 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__3_in_rule__BCoolCompositionRule__Group__24004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BCoolCompositionRule__Group__2__Impl4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__3__Impl_in_rule__BCoolCompositionRule__Group__34063 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__4_in_rule__BCoolCompositionRule__Group__34066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_3__0_in_rule__BCoolCompositionRule__Group__3__Impl4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__4__Impl_in_rule__BCoolCompositionRule__Group__44124 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__5_in_rule__BCoolCompositionRule__Group__44127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BCoolCompositionRule__Group__4__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__5__Impl_in_rule__BCoolCompositionRule__Group__54186 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__6_in_rule__BCoolCompositionRule__Group__54189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BCoolCompositionRule__Group__5__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__6__Impl_in_rule__BCoolCompositionRule__Group__64248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__7_in_rule__BCoolCompositionRule__Group__64251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__MatchingRuleAssignment_6_in_rule__BCoolCompositionRule__Group__6__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__7__Impl_in_rule__BCoolCompositionRule__Group__74308 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__8_in_rule__BCoolCompositionRule__Group__74311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__CoordinationRuleAssignment_7_in_rule__BCoolCompositionRule__Group__7__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__8__Impl_in_rule__BCoolCompositionRule__Group__84368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BCoolCompositionRule__Group__8__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_3__0__Impl_in_rule__BCoolCompositionRule__Group_3__04445 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_3__1_in_rule__BCoolCompositionRule__Group_3__04448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__DSEsAssignment_3_0_in_rule__BCoolCompositionRule__Group_3__0__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_3__1__Impl_in_rule__BCoolCompositionRule__Group_3__14505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_3_1__0_in_rule__BCoolCompositionRule__Group_3__1__Impl4532 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_3_1__0__Impl_in_rule__BCoolCompositionRule__Group_3_1__04567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_3_1__1_in_rule__BCoolCompositionRule__Group_3_1__04570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BCoolCompositionRule__Group_3_1__0__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_3_1__1__Impl_in_rule__BCoolCompositionRule__Group_3_1__14629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__DSEsAssignment_3_1_1_in_rule__BCoolCompositionRule__Group_3_1__1__Impl4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__0__Impl_in_rule__MatchingRule__Group__04690 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__1_in_rule__MatchingRule__Group__04693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MatchingRule__Group__0__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__1__Impl_in_rule__MatchingRule__Group__14752 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__2_in_rule__MatchingRule__Group__14755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__ConditionAssignment_1_in_rule__MatchingRule__Group__1__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__2__Impl_in_rule__MatchingRule__Group__24812 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__3_in_rule__MatchingRule__Group__24815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MatchingRule__Group__2__Impl4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__3__Impl_in_rule__MatchingRule__Group__34874 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__4_in_rule__MatchingRule__Group__34877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MatchingRule__Group__3__Impl4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__4__Impl_in_rule__MatchingRule__Group__44936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__0_in_rule__MatchingRule__Group__4__Impl4963 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__0__Impl_in_rule__MatchingRule__Group_4__05004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__1_in_rule__MatchingRule__Group_4__05007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MatchingRule__Group_4__0__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__1__Impl_in_rule__MatchingRule__Group_4__15066 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__2_in_rule__MatchingRule__Group_4__15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__FilterEventExpressionsAssignment_4_1_in_rule__MatchingRule__Group_4__1__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__2__Impl_in_rule__MatchingRule__Group_4__25126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MatchingRule__Group_4__2__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__0__Impl_in_rule__EventExpression__Group__05191 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__1_in_rule__EventExpression__Group__05194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__NameAssignment_0_in_rule__EventExpression__Group__0__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__1__Impl_in_rule__EventExpression__Group__15251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__2_in_rule__EventExpression__Group__15254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EventExpression__Group__1__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__2__Impl_in_rule__EventExpression__Group__25313 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__3_in_rule__EventExpression__Group__25316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__DeclarationAssignment_2_in_rule__EventExpression__Group__2__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__3__Impl_in_rule__EventExpression__Group__35373 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__4_in_rule__EventExpression__Group__35376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EventExpression__Group__3__Impl5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__4__Impl_in_rule__EventExpression__Group__45435 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__5_in_rule__EventExpression__Group__45438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4__0_in_rule__EventExpression__Group__4__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__5__Impl_in_rule__EventExpression__Group__55496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EventExpression__Group__5__Impl5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4__0__Impl_in_rule__EventExpression__Group_4__05567 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4__1_in_rule__EventExpression__Group_4__05570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__ActualParametersAssignment_4_0_in_rule__EventExpression__Group_4__0__Impl5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4__1__Impl_in_rule__EventExpression__Group_4__15627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4_1__0_in_rule__EventExpression__Group_4__1__Impl5654 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4_1__0__Impl_in_rule__EventExpression__Group_4_1__05689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4_1__1_in_rule__EventExpression__Group_4_1__05692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EventExpression__Group_4_1__0__Impl5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4_1__1__Impl_in_rule__EventExpression__Group_4_1__15751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__ActualParametersAssignment_4_1_1_in_rule__EventExpression__Group_4_1__1__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__0__Impl_in_rule__EventRelation__Group__05812 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__1_in_rule__EventRelation__Group__05815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__DeclarationAssignment_0_in_rule__EventRelation__Group__0__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__1__Impl_in_rule__EventRelation__Group__15872 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__2_in_rule__EventRelation__Group__15875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EventRelation__Group__1__Impl5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__2__Impl_in_rule__EventRelation__Group__25934 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__3_in_rule__EventRelation__Group__25937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_2__0_in_rule__EventRelation__Group__2__Impl5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__3__Impl_in_rule__EventRelation__Group__35995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EventRelation__Group__3__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_2__0__Impl_in_rule__EventRelation__Group_2__06062 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_2__1_in_rule__EventRelation__Group_2__06065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__ActualParametersAssignment_2_0_in_rule__EventRelation__Group_2__0__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_2__1__Impl_in_rule__EventRelation__Group_2__16122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_2_1__0_in_rule__EventRelation__Group_2__1__Impl6149 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_2_1__0__Impl_in_rule__EventRelation__Group_2_1__06184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_2_1__1_in_rule__EventRelation__Group_2_1__06187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EventRelation__Group_2_1__0__Impl6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_2_1__1__Impl_in_rule__EventRelation__Group_2_1__16246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__ActualParametersAssignment_2_1_1_in_rule__EventRelation__Group_2_1__1__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportLibRule__Group__0__Impl_in_rule__ImportLibRule__Group__06307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImportLibRule__Group__1_in_rule__ImportLibRule__Group__06310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ImportLibRule__Group__0__Impl6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportLibRule__Group__1__Impl_in_rule__ImportLibRule__Group__16369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportLibRule__ImportURIAssignment_1_in_rule__ImportLibRule__Group__1__Impl6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__0__Impl_in_rule__ImportInterfaceRule__Group__06430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__1_in_rule__ImportInterfaceRule__Group__06433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ImportInterfaceRule__Group__0__Impl6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__1__Impl_in_rule__ImportInterfaceRule__Group__16492 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__2_in_rule__ImportInterfaceRule__Group__16495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__ImportURIAssignment_1_in_rule__ImportInterfaceRule__Group__1__Impl6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__2__Impl_in_rule__ImportInterfaceRule__Group__26552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__3_in_rule__ImportInterfaceRule__Group__26555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ImportInterfaceRule__Group__2__Impl6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__3__Impl_in_rule__ImportInterfaceRule__Group__36614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportInterfaceRule__Group__3__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__0__Impl_in_rule__GImportStatement__Group__06681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__1_in_rule__GImportStatement__Group__06684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__GImportStatement__Group__0__Impl6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__1__Impl_in_rule__GImportStatement__Group__16743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__ImportURIAssignment_1_in_rule__GImportStatement__Group__1__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__0__Impl_in_rule__GOrExpression__Group__06804 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__1_in_rule__GOrExpression__Group__06807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_rule__GOrExpression__Group__0__Impl6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__1__Impl_in_rule__GOrExpression__Group__16863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__0_in_rule__GOrExpression__Group__1__Impl6890 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__0__Impl_in_rule__GOrExpression__Group_1__06925 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__1_in_rule__GOrExpression__Group_1__06928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__1__Impl_in_rule__GOrExpression__Group_1__16986 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__2_in_rule__GOrExpression__Group_1__16989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__OperatorAssignment_1_1_in_rule__GOrExpression__Group_1__1__Impl7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__2__Impl_in_rule__GOrExpression__Group_1__27046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__RightOperandAssignment_1_2_in_rule__GOrExpression__Group_1__2__Impl7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__0__Impl_in_rule__GXorExpression__Group__07109 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__1_in_rule__GXorExpression__Group__07112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_rule__GXorExpression__Group__0__Impl7139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__1__Impl_in_rule__GXorExpression__Group__17168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__0_in_rule__GXorExpression__Group__1__Impl7195 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__0__Impl_in_rule__GXorExpression__Group_1__07230 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__1_in_rule__GXorExpression__Group_1__07233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__1__Impl_in_rule__GXorExpression__Group_1__17291 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__2_in_rule__GXorExpression__Group_1__17294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__OperatorAssignment_1_1_in_rule__GXorExpression__Group_1__1__Impl7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__2__Impl_in_rule__GXorExpression__Group_1__27351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__RightOperandAssignment_1_2_in_rule__GXorExpression__Group_1__2__Impl7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__0__Impl_in_rule__GAndExpression__Group__07414 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__1_in_rule__GAndExpression__Group__07417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__Group__0__Impl7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__1__Impl_in_rule__GAndExpression__Group__17473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__0_in_rule__GAndExpression__Group__1__Impl7500 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__0__Impl_in_rule__GAndExpression__Group_1__07535 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__1_in_rule__GAndExpression__Group_1__07538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__1__Impl_in_rule__GAndExpression__Group_1__17596 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__2_in_rule__GAndExpression__Group_1__17599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__OperatorAssignment_1_1_in_rule__GAndExpression__Group_1__1__Impl7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__2__Impl_in_rule__GAndExpression__Group_1__27656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__RightOperandAssignment_1_2_in_rule__GAndExpression__Group_1__2__Impl7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__0__Impl_in_rule__GEqualityExpression__Group__07719 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__1_in_rule__GEqualityExpression__Group__07722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__Group__0__Impl7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__1__Impl_in_rule__GEqualityExpression__Group__17778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__0_in_rule__GEqualityExpression__Group__1__Impl7805 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__0__Impl_in_rule__GEqualityExpression__Group_1__07840 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__1_in_rule__GEqualityExpression__Group_1__07843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__1__Impl_in_rule__GEqualityExpression__Group_1__17901 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__2_in_rule__GEqualityExpression__Group_1__17904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__OperatorAssignment_1_1_in_rule__GEqualityExpression__Group_1__1__Impl7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__2__Impl_in_rule__GEqualityExpression__Group_1__27961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__RightOperandAssignment_1_2_in_rule__GEqualityExpression__Group_1__2__Impl7988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__0__Impl_in_rule__GRelationExpression__Group__08024 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__1_in_rule__GRelationExpression__Group__08027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__Group__0__Impl8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__1__Impl_in_rule__GRelationExpression__Group__18083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__0_in_rule__GRelationExpression__Group__1__Impl8110 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__0__Impl_in_rule__GRelationExpression__Group_1__08145 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__1_in_rule__GRelationExpression__Group_1__08148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__1__Impl_in_rule__GRelationExpression__Group_1__18206 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__2_in_rule__GRelationExpression__Group_1__18209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__OperatorAssignment_1_1_in_rule__GRelationExpression__Group_1__1__Impl8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__2__Impl_in_rule__GRelationExpression__Group_1__28266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__RightOperandAssignment_1_2_in_rule__GRelationExpression__Group_1__2__Impl8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__0__Impl_in_rule__GAdditionExpression__Group__08329 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__1_in_rule__GAdditionExpression__Group__08332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__Group__0__Impl8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__1__Impl_in_rule__GAdditionExpression__Group__18388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__0_in_rule__GAdditionExpression__Group__1__Impl8415 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__0__Impl_in_rule__GAdditionExpression__Group_1__08450 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__1_in_rule__GAdditionExpression__Group_1__08453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__1__Impl_in_rule__GAdditionExpression__Group_1__18511 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__2_in_rule__GAdditionExpression__Group_1__18514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__OperatorAssignment_1_1_in_rule__GAdditionExpression__Group_1__1__Impl8541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__2__Impl_in_rule__GAdditionExpression__Group_1__28571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__RightOperandAssignment_1_2_in_rule__GAdditionExpression__Group_1__2__Impl8598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__0__Impl_in_rule__GMultiplicationExpression__Group__08634 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__1_in_rule__GMultiplicationExpression__Group__08637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__Group__0__Impl8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__1__Impl_in_rule__GMultiplicationExpression__Group__18693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__0_in_rule__GMultiplicationExpression__Group__1__Impl8720 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__0__Impl_in_rule__GMultiplicationExpression__Group_1__08755 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__1_in_rule__GMultiplicationExpression__Group_1__08758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__1__Impl_in_rule__GMultiplicationExpression__Group_1__18816 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__2_in_rule__GMultiplicationExpression__Group_1__18819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__OperatorAssignment_1_1_in_rule__GMultiplicationExpression__Group_1__1__Impl8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__2__Impl_in_rule__GMultiplicationExpression__Group_1__28876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__RightOperandAssignment_1_2_in_rule__GMultiplicationExpression__Group_1__2__Impl8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__0__Impl_in_rule__GNegationExpression__Group_1__08939 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__1_in_rule__GNegationExpression__Group_1__08942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__1__Impl_in_rule__GNegationExpression__Group_1__19000 = new BitSet(new long[]{0x00006002000001F0L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__2_in_rule__GNegationExpression__Group_1__19003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__OperatorAssignment_1_1_in_rule__GNegationExpression__Group_1__1__Impl9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__2__Impl_in_rule__GNegationExpression__Group_1__29060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__OperandAssignment_1_2_in_rule__GNegationExpression__Group_1__2__Impl9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__0__Impl_in_rule__GNavigationExpression__Group__09123 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__1_in_rule__GNavigationExpression__Group__09126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_rule__GNavigationExpression__Group__0__Impl9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__1__Impl_in_rule__GNavigationExpression__Group__19182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__0_in_rule__GNavigationExpression__Group__1__Impl9209 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__0__Impl_in_rule__GNavigationExpression__Group_1__09244 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__1_in_rule__GNavigationExpression__Group_1__09247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__1__Impl_in_rule__GNavigationExpression__Group_1__19305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__2_in_rule__GNavigationExpression__Group_1__19308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__GNavigationExpression__Group_1__1__Impl9336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__2__Impl_in_rule__GNavigationExpression__Group_1__29367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__FeatureAssignment_1_2_in_rule__GNavigationExpression__Group_1__2__Impl9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__0__Impl_in_rule__GReferenceExpression__Group_1__09430 = new BitSet(new long[]{0x00006002000001F0L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__1_in_rule__GReferenceExpression__Group_1__09433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__1__Impl_in_rule__GReferenceExpression__Group_1__19491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__ReferencedEObjectAssignment_1_1_in_rule__GReferenceExpression__Group_1__1__Impl9518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__0__Impl_in_rule__GStringExpression__Group__09552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__1_in_rule__GStringExpression__Group__09555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__1__Impl_in_rule__GStringExpression__Group__19613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__ValueAssignment_1_in_rule__GStringExpression__Group__1__Impl9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__0__Impl_in_rule__GBooleanExpression__Group__09674 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__1_in_rule__GBooleanExpression__Group__09677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__1__Impl_in_rule__GBooleanExpression__Group__19735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__ValueAssignment_1_in_rule__GBooleanExpression__Group__1__Impl9762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__0__Impl_in_rule__GIntegerExpression__Group__09796 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__1_in_rule__GIntegerExpression__Group__09799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__1__Impl_in_rule__GIntegerExpression__Group__19857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__ValueAssignment_1_in_rule__GIntegerExpression__Group__1__Impl9884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__0__Impl_in_rule__GDoubleExpression__Group__09918 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__1_in_rule__GDoubleExpression__Group__09921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__1__Impl_in_rule__GDoubleExpression__Group__19979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__ValueAssignment_1_in_rule__GDoubleExpression__Group__1__Impl10006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__0__Impl_in_rule__GEnumLiteralExpression__Group__010040 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__1_in_rule__GEnumLiteralExpression__Group__010043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__1__Impl_in_rule__GEnumLiteralExpression__Group__110101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__2_in_rule__GEnumLiteralExpression__Group__110104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__GEnumLiteralExpression__Group__1__Impl10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__2__Impl_in_rule__GEnumLiteralExpression__Group__210163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__ValueAssignment_2_in_rule__GEnumLiteralExpression__Group__2__Impl10190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__0__Impl_in_rule__GIfExpression__Group__010226 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__1_in_rule__GIfExpression__Group__010229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__1__Impl_in_rule__GIfExpression__Group__110287 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__2_in_rule__GIfExpression__Group__110290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__GIfExpression__Group__1__Impl10318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__2__Impl_in_rule__GIfExpression__Group__210349 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__3_in_rule__GIfExpression__Group__210352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__ConditionAssignment_2_in_rule__GIfExpression__Group__2__Impl10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__3__Impl_in_rule__GIfExpression__Group__310409 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__4_in_rule__GIfExpression__Group__310412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__GIfExpression__Group__3__Impl10440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__4__Impl_in_rule__GIfExpression__Group__410471 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__5_in_rule__GIfExpression__Group__410474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__ThenExpressionAssignment_4_in_rule__GIfExpression__Group__4__Impl10501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__5__Impl_in_rule__GIfExpression__Group__510531 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__6_in_rule__GIfExpression__Group__510534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__GIfExpression__Group__5__Impl10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__6__Impl_in_rule__GIfExpression__Group__610593 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__7_in_rule__GIfExpression__Group__610596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__ElseExpressionAssignment_6_in_rule__GIfExpression__Group__6__Impl10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__7__Impl_in_rule__GIfExpression__Group__710653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__GIfExpression__Group__7__Impl10681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__0__Impl_in_rule__GBraceExpression__Group__010728 = new BitSet(new long[]{0x00006002000001D0L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__1_in_rule__GBraceExpression__Group__010731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__1__Impl_in_rule__GBraceExpression__Group__110789 = new BitSet(new long[]{0x000060020C0001F0L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__2_in_rule__GBraceExpression__Group__110792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GBraceExpression__Group__1__Impl10820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__2__Impl_in_rule__GBraceExpression__Group__210851 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__3_in_rule__GBraceExpression__Group__210854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__InnerExpressionAssignment_2_in_rule__GBraceExpression__Group__2__Impl10881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__3__Impl_in_rule__GBraceExpression__Group__310911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__GBraceExpression__Group__3__Impl10939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010978 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__111037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl11064 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__011099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__011102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__QualifiedName__Group_1__0__Impl11131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__111163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl11190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolSpec__NameAssignment_011228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_rule__BCoolSpec__ImportsLibAssignment_111259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_211290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorSpec_in_rule__BCoolSpec__BcoolOperatorsAssignment_311321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolOperatorSpec__NameAssignment_111352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalEventExpressionRule_in_rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_211383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalDSEsRule_in_rule__BCoolOperatorSpec__GlobalDSEsAssignment_311414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolCompositionRule_in_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_411445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalDSEsRule__NameAssignment_111476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolCompositionRule__NameAssignment_111507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BCoolCompositionRule__DSEsAssignment_3_011542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BCoolCompositionRule__DSEsAssignment_3_1_111581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_rule__BCoolCompositionRule__MatchingRuleAssignment_611616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_rule__BCoolCompositionRule__CoordinationRuleAssignment_711647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__MatchingRule__ConditionAssignment_111678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_rule__MatchingRule__FilterEventExpressionsAssignment_4_111709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventExpression__NameAssignment_011740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventExpression__DeclarationAssignment_211775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventExpression__ActualParametersAssignment_4_011814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventExpression__ActualParametersAssignment_4_1_111853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_rule__CoordinationRule__EventRelationsAssignment11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventRelation__DeclarationAssignment_011923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EventRelation__ActualParametersAssignment_2_011962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EventRelation__ActualParametersAssignment_2_1_112001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportLibRule__ImportURIAssignment_112036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportInterfaceRule__ImportURIAssignment_112067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GImportStatement__ImportURIAssignment_112101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrOperator_in_rule__GOrExpression__OperatorAssignment_1_112132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_rule__GOrExpression__RightOperandAssignment_1_212163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorOperator_in_rule__GXorExpression__OperatorAssignment_1_112194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_rule__GXorExpression__RightOperandAssignment_1_212225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndOperator_in_rule__GAndExpression__OperatorAssignment_1_112256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__RightOperandAssignment_1_212287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityOperator_in_rule__GEqualityExpression__OperatorAssignment_1_112318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__RightOperandAssignment_1_212349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationOperator_in_rule__GRelationExpression__OperatorAssignment_1_112380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__RightOperandAssignment_1_212411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionOperator_in_rule__GAdditionExpression__OperatorAssignment_1_112442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__RightOperandAssignment_1_212473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationOperator_in_rule__GMultiplicationExpression__OperatorAssignment_1_112504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__RightOperandAssignment_1_212535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationOperator_in_rule__GNegationExpression__OperatorAssignment_1_112566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__OperandAssignment_1_212597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GNavigationExpression__FeatureAssignment_1_212632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GReferenceExpression__ReferencedEObjectAssignment_1_112671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GStringExpression__ValueAssignment_112706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__GBooleanExpression__ValueAssignment_112737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GIntegerExpression__ValueAssignment_112768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__GDoubleExpression__ValueAssignment_112799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GEnumLiteralExpression__ValueAssignment_212834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GIfExpression__ConditionAssignment_212869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GIfExpression__ThenExpressionAssignment_412900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GIfExpression__ElseExpressionAssignment_612931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GBraceExpression__InnerExpressionAssignment_212962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_synpred38_InternalBCOoL11064 = new BitSet(new long[]{0x0000000000000002L});

}