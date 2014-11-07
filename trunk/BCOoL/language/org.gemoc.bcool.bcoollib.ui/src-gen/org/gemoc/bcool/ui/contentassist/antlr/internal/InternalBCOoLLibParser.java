package org.gemoc.bcool.ui.contentassist.antlr.internal; 

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
import org.gemoc.bcool.services.BCOoLLibGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBCOoLLibParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BCoolLibrary'", "'{'", "'}'", "'expressionDefinitions'", "','", "'relationDefinitions'", "'relationDeclarations'", "'expressionDeclarations'", "'ExpressionDefinition'", "'definition'", "'RelationDefinition'", "'RelationDeclaration'", "'formalParameters'", "'ExpressionDeclaration'"
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
    public String getGrammarFileName() { return "../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g"; }


     
     	private BCOoLLibGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BCOoLLibGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleBCoolLibrary"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:60:1: entryRuleBCoolLibrary : ruleBCoolLibrary EOF ;
    public final void entryRuleBCoolLibrary() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:61:1: ( ruleBCoolLibrary EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:62:1: ruleBCoolLibrary EOF
            {
             before(grammarAccess.getBCoolLibraryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBCoolLibrary_in_entryRuleBCoolLibrary61);
            ruleBCoolLibrary();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBCoolLibrary68); 

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
    // $ANTLR end "entryRuleBCoolLibrary"


    // $ANTLR start "ruleBCoolLibrary"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:69:1: ruleBCoolLibrary : ( ( rule__BCoolLibrary__Group__0 ) ) ;
    public final void ruleBCoolLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:73:2: ( ( ( rule__BCoolLibrary__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:74:1: ( ( rule__BCoolLibrary__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:74:1: ( ( rule__BCoolLibrary__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:75:1: ( rule__BCoolLibrary__Group__0 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:76:1: ( rule__BCoolLibrary__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:76:2: rule__BCoolLibrary__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__0_in_ruleBCoolLibrary94);
            rule__BCoolLibrary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBCoolLibrary"


    // $ANTLR start "entryRuleEString"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:89:1: ( ruleEString EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:104:1: ( rule__EString__Alternatives )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExpressionDefinition"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:116:1: entryRuleExpressionDefinition : ruleExpressionDefinition EOF ;
    public final void entryRuleExpressionDefinition() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:117:1: ( ruleExpressionDefinition EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:118:1: ruleExpressionDefinition EOF
            {
             before(grammarAccess.getExpressionDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionDefinition_in_entryRuleExpressionDefinition181);
            ruleExpressionDefinition();

            state._fsp--;

             after(grammarAccess.getExpressionDefinitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionDefinition188); 

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
    // $ANTLR end "entryRuleExpressionDefinition"


    // $ANTLR start "ruleExpressionDefinition"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:125:1: ruleExpressionDefinition : ( ( rule__ExpressionDefinition__Group__0 ) ) ;
    public final void ruleExpressionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:129:2: ( ( ( rule__ExpressionDefinition__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:130:1: ( ( rule__ExpressionDefinition__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:130:1: ( ( rule__ExpressionDefinition__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:131:1: ( rule__ExpressionDefinition__Group__0 )
            {
             before(grammarAccess.getExpressionDefinitionAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:132:1: ( rule__ExpressionDefinition__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:132:2: rule__ExpressionDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__0_in_ruleExpressionDefinition214);
            rule__ExpressionDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionDefinition"


    // $ANTLR start "entryRuleRelationDefinition"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:144:1: entryRuleRelationDefinition : ruleRelationDefinition EOF ;
    public final void entryRuleRelationDefinition() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:145:1: ( ruleRelationDefinition EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:146:1: ruleRelationDefinition EOF
            {
             before(grammarAccess.getRelationDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationDefinition_in_entryRuleRelationDefinition241);
            ruleRelationDefinition();

            state._fsp--;

             after(grammarAccess.getRelationDefinitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationDefinition248); 

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
    // $ANTLR end "entryRuleRelationDefinition"


    // $ANTLR start "ruleRelationDefinition"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:153:1: ruleRelationDefinition : ( ( rule__RelationDefinition__Group__0 ) ) ;
    public final void ruleRelationDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:157:2: ( ( ( rule__RelationDefinition__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:158:1: ( ( rule__RelationDefinition__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:158:1: ( ( rule__RelationDefinition__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:159:1: ( rule__RelationDefinition__Group__0 )
            {
             before(grammarAccess.getRelationDefinitionAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:160:1: ( rule__RelationDefinition__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:160:2: rule__RelationDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__0_in_ruleRelationDefinition274);
            rule__RelationDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationDefinition"


    // $ANTLR start "entryRuleRelationDeclaration"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:172:1: entryRuleRelationDeclaration : ruleRelationDeclaration EOF ;
    public final void entryRuleRelationDeclaration() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:173:1: ( ruleRelationDeclaration EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:174:1: ruleRelationDeclaration EOF
            {
             before(grammarAccess.getRelationDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationDeclaration_in_entryRuleRelationDeclaration301);
            ruleRelationDeclaration();

            state._fsp--;

             after(grammarAccess.getRelationDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationDeclaration308); 

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
    // $ANTLR end "entryRuleRelationDeclaration"


    // $ANTLR start "ruleRelationDeclaration"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:181:1: ruleRelationDeclaration : ( ( rule__RelationDeclaration__Group__0 ) ) ;
    public final void ruleRelationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:185:2: ( ( ( rule__RelationDeclaration__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:186:1: ( ( rule__RelationDeclaration__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:186:1: ( ( rule__RelationDeclaration__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:187:1: ( rule__RelationDeclaration__Group__0 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:188:1: ( rule__RelationDeclaration__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:188:2: rule__RelationDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__0_in_ruleRelationDeclaration334);
            rule__RelationDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationDeclaration"


    // $ANTLR start "entryRuleExpressionDeclaration"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:200:1: entryRuleExpressionDeclaration : ruleExpressionDeclaration EOF ;
    public final void entryRuleExpressionDeclaration() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:201:1: ( ruleExpressionDeclaration EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:202:1: ruleExpressionDeclaration EOF
            {
             before(grammarAccess.getExpressionDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionDeclaration_in_entryRuleExpressionDeclaration361);
            ruleExpressionDeclaration();

            state._fsp--;

             after(grammarAccess.getExpressionDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionDeclaration368); 

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
    // $ANTLR end "entryRuleExpressionDeclaration"


    // $ANTLR start "ruleExpressionDeclaration"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:209:1: ruleExpressionDeclaration : ( ( rule__ExpressionDeclaration__Group__0 ) ) ;
    public final void ruleExpressionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:213:2: ( ( ( rule__ExpressionDeclaration__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:214:1: ( ( rule__ExpressionDeclaration__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:214:1: ( ( rule__ExpressionDeclaration__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:215:1: ( rule__ExpressionDeclaration__Group__0 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:216:1: ( rule__ExpressionDeclaration__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:216:2: rule__ExpressionDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__0_in_ruleExpressionDeclaration394);
            rule__ExpressionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionDeclaration"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:228:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:232:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:233:1: ( RULE_STRING )
                    {
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:233:1: ( RULE_STRING )
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:234:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives430); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:239:6: ( RULE_ID )
                    {
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:239:6: ( RULE_ID )
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:240:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives447); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__BCoolLibrary__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:252:1: rule__BCoolLibrary__Group__0 : rule__BCoolLibrary__Group__0__Impl rule__BCoolLibrary__Group__1 ;
    public final void rule__BCoolLibrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:256:1: ( rule__BCoolLibrary__Group__0__Impl rule__BCoolLibrary__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:257:2: rule__BCoolLibrary__Group__0__Impl rule__BCoolLibrary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__0__Impl_in_rule__BCoolLibrary__Group__0477);
            rule__BCoolLibrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__1_in_rule__BCoolLibrary__Group__0480);
            rule__BCoolLibrary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__0"


    // $ANTLR start "rule__BCoolLibrary__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:264:1: rule__BCoolLibrary__Group__0__Impl : ( () ) ;
    public final void rule__BCoolLibrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:268:1: ( ( () ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:269:1: ( () )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:269:1: ( () )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:270:1: ()
            {
             before(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryAction_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:271:1: ()
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:273:1: 
            {
            }

             after(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:283:1: rule__BCoolLibrary__Group__1 : rule__BCoolLibrary__Group__1__Impl rule__BCoolLibrary__Group__2 ;
    public final void rule__BCoolLibrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:287:1: ( rule__BCoolLibrary__Group__1__Impl rule__BCoolLibrary__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:288:2: rule__BCoolLibrary__Group__1__Impl rule__BCoolLibrary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__1__Impl_in_rule__BCoolLibrary__Group__1538);
            rule__BCoolLibrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__2_in_rule__BCoolLibrary__Group__1541);
            rule__BCoolLibrary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__1"


    // $ANTLR start "rule__BCoolLibrary__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:295:1: rule__BCoolLibrary__Group__1__Impl : ( 'BCoolLibrary' ) ;
    public final void rule__BCoolLibrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:299:1: ( ( 'BCoolLibrary' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:300:1: ( 'BCoolLibrary' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:300:1: ( 'BCoolLibrary' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:301:1: 'BCoolLibrary'
            {
             before(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__BCoolLibrary__Group__1__Impl569); 
             after(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:314:1: rule__BCoolLibrary__Group__2 : rule__BCoolLibrary__Group__2__Impl rule__BCoolLibrary__Group__3 ;
    public final void rule__BCoolLibrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:318:1: ( rule__BCoolLibrary__Group__2__Impl rule__BCoolLibrary__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:319:2: rule__BCoolLibrary__Group__2__Impl rule__BCoolLibrary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__2__Impl_in_rule__BCoolLibrary__Group__2600);
            rule__BCoolLibrary__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__3_in_rule__BCoolLibrary__Group__2603);
            rule__BCoolLibrary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__2"


    // $ANTLR start "rule__BCoolLibrary__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:326:1: rule__BCoolLibrary__Group__2__Impl : ( ( rule__BCoolLibrary__NameAssignment_2 ) ) ;
    public final void rule__BCoolLibrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:330:1: ( ( ( rule__BCoolLibrary__NameAssignment_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:331:1: ( ( rule__BCoolLibrary__NameAssignment_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:331:1: ( ( rule__BCoolLibrary__NameAssignment_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:332:1: ( rule__BCoolLibrary__NameAssignment_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getNameAssignment_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:333:1: ( rule__BCoolLibrary__NameAssignment_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:333:2: rule__BCoolLibrary__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__NameAssignment_2_in_rule__BCoolLibrary__Group__2__Impl630);
            rule__BCoolLibrary__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:343:1: rule__BCoolLibrary__Group__3 : rule__BCoolLibrary__Group__3__Impl rule__BCoolLibrary__Group__4 ;
    public final void rule__BCoolLibrary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:347:1: ( rule__BCoolLibrary__Group__3__Impl rule__BCoolLibrary__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:348:2: rule__BCoolLibrary__Group__3__Impl rule__BCoolLibrary__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__3__Impl_in_rule__BCoolLibrary__Group__3660);
            rule__BCoolLibrary__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__4_in_rule__BCoolLibrary__Group__3663);
            rule__BCoolLibrary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__3"


    // $ANTLR start "rule__BCoolLibrary__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:355:1: rule__BCoolLibrary__Group__3__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:359:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:360:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:360:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:361:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BCoolLibrary__Group__3__Impl691); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:374:1: rule__BCoolLibrary__Group__4 : rule__BCoolLibrary__Group__4__Impl rule__BCoolLibrary__Group__5 ;
    public final void rule__BCoolLibrary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:378:1: ( rule__BCoolLibrary__Group__4__Impl rule__BCoolLibrary__Group__5 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:379:2: rule__BCoolLibrary__Group__4__Impl rule__BCoolLibrary__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__4__Impl_in_rule__BCoolLibrary__Group__4722);
            rule__BCoolLibrary__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__5_in_rule__BCoolLibrary__Group__4725);
            rule__BCoolLibrary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__4"


    // $ANTLR start "rule__BCoolLibrary__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:386:1: rule__BCoolLibrary__Group__4__Impl : ( ( rule__BCoolLibrary__Group_4__0 )? ) ;
    public final void rule__BCoolLibrary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:390:1: ( ( ( rule__BCoolLibrary__Group_4__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:391:1: ( ( rule__BCoolLibrary__Group_4__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:391:1: ( ( rule__BCoolLibrary__Group_4__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:392:1: ( rule__BCoolLibrary__Group_4__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_4()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:393:1: ( rule__BCoolLibrary__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:393:2: rule__BCoolLibrary__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__0_in_rule__BCoolLibrary__Group__4__Impl752);
                    rule__BCoolLibrary__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__5"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:403:1: rule__BCoolLibrary__Group__5 : rule__BCoolLibrary__Group__5__Impl rule__BCoolLibrary__Group__6 ;
    public final void rule__BCoolLibrary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:407:1: ( rule__BCoolLibrary__Group__5__Impl rule__BCoolLibrary__Group__6 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:408:2: rule__BCoolLibrary__Group__5__Impl rule__BCoolLibrary__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__5__Impl_in_rule__BCoolLibrary__Group__5783);
            rule__BCoolLibrary__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__6_in_rule__BCoolLibrary__Group__5786);
            rule__BCoolLibrary__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__5"


    // $ANTLR start "rule__BCoolLibrary__Group__5__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:415:1: rule__BCoolLibrary__Group__5__Impl : ( ( rule__BCoolLibrary__Group_5__0 )? ) ;
    public final void rule__BCoolLibrary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:419:1: ( ( ( rule__BCoolLibrary__Group_5__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:420:1: ( ( rule__BCoolLibrary__Group_5__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:420:1: ( ( rule__BCoolLibrary__Group_5__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:421:1: ( rule__BCoolLibrary__Group_5__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_5()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:422:1: ( rule__BCoolLibrary__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:422:2: rule__BCoolLibrary__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__0_in_rule__BCoolLibrary__Group__5__Impl813);
                    rule__BCoolLibrary__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__5__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__6"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:432:1: rule__BCoolLibrary__Group__6 : rule__BCoolLibrary__Group__6__Impl rule__BCoolLibrary__Group__7 ;
    public final void rule__BCoolLibrary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:436:1: ( rule__BCoolLibrary__Group__6__Impl rule__BCoolLibrary__Group__7 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:437:2: rule__BCoolLibrary__Group__6__Impl rule__BCoolLibrary__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__6__Impl_in_rule__BCoolLibrary__Group__6844);
            rule__BCoolLibrary__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__7_in_rule__BCoolLibrary__Group__6847);
            rule__BCoolLibrary__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__6"


    // $ANTLR start "rule__BCoolLibrary__Group__6__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:444:1: rule__BCoolLibrary__Group__6__Impl : ( ( rule__BCoolLibrary__Group_6__0 )? ) ;
    public final void rule__BCoolLibrary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:448:1: ( ( ( rule__BCoolLibrary__Group_6__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:449:1: ( ( rule__BCoolLibrary__Group_6__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:449:1: ( ( rule__BCoolLibrary__Group_6__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:450:1: ( rule__BCoolLibrary__Group_6__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_6()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:451:1: ( rule__BCoolLibrary__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:451:2: rule__BCoolLibrary__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__0_in_rule__BCoolLibrary__Group__6__Impl874);
                    rule__BCoolLibrary__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__6__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__7"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:461:1: rule__BCoolLibrary__Group__7 : rule__BCoolLibrary__Group__7__Impl rule__BCoolLibrary__Group__8 ;
    public final void rule__BCoolLibrary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:465:1: ( rule__BCoolLibrary__Group__7__Impl rule__BCoolLibrary__Group__8 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:466:2: rule__BCoolLibrary__Group__7__Impl rule__BCoolLibrary__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__7__Impl_in_rule__BCoolLibrary__Group__7905);
            rule__BCoolLibrary__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__8_in_rule__BCoolLibrary__Group__7908);
            rule__BCoolLibrary__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__7"


    // $ANTLR start "rule__BCoolLibrary__Group__7__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:473:1: rule__BCoolLibrary__Group__7__Impl : ( ( rule__BCoolLibrary__Group_7__0 )? ) ;
    public final void rule__BCoolLibrary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:477:1: ( ( ( rule__BCoolLibrary__Group_7__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:478:1: ( ( rule__BCoolLibrary__Group_7__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:478:1: ( ( rule__BCoolLibrary__Group_7__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:479:1: ( rule__BCoolLibrary__Group_7__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_7()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:480:1: ( rule__BCoolLibrary__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:480:2: rule__BCoolLibrary__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__0_in_rule__BCoolLibrary__Group__7__Impl935);
                    rule__BCoolLibrary__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__7__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__8"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:490:1: rule__BCoolLibrary__Group__8 : rule__BCoolLibrary__Group__8__Impl ;
    public final void rule__BCoolLibrary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:494:1: ( rule__BCoolLibrary__Group__8__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:495:2: rule__BCoolLibrary__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group__8__Impl_in_rule__BCoolLibrary__Group__8966);
            rule__BCoolLibrary__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__8"


    // $ANTLR start "rule__BCoolLibrary__Group__8__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:501:1: rule__BCoolLibrary__Group__8__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:505:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:506:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:506:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:507:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BCoolLibrary__Group__8__Impl994); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__8__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:538:1: rule__BCoolLibrary__Group_4__0 : rule__BCoolLibrary__Group_4__0__Impl rule__BCoolLibrary__Group_4__1 ;
    public final void rule__BCoolLibrary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:542:1: ( rule__BCoolLibrary__Group_4__0__Impl rule__BCoolLibrary__Group_4__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:543:2: rule__BCoolLibrary__Group_4__0__Impl rule__BCoolLibrary__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__0__Impl_in_rule__BCoolLibrary__Group_4__01043);
            rule__BCoolLibrary__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__1_in_rule__BCoolLibrary__Group_4__01046);
            rule__BCoolLibrary__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__0"


    // $ANTLR start "rule__BCoolLibrary__Group_4__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:550:1: rule__BCoolLibrary__Group_4__0__Impl : ( 'expressionDefinitions' ) ;
    public final void rule__BCoolLibrary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:554:1: ( ( 'expressionDefinitions' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:555:1: ( 'expressionDefinitions' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:555:1: ( 'expressionDefinitions' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:556:1: 'expressionDefinitions'
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__BCoolLibrary__Group_4__0__Impl1074); 
             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:569:1: rule__BCoolLibrary__Group_4__1 : rule__BCoolLibrary__Group_4__1__Impl rule__BCoolLibrary__Group_4__2 ;
    public final void rule__BCoolLibrary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:573:1: ( rule__BCoolLibrary__Group_4__1__Impl rule__BCoolLibrary__Group_4__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:574:2: rule__BCoolLibrary__Group_4__1__Impl rule__BCoolLibrary__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__1__Impl_in_rule__BCoolLibrary__Group_4__11105);
            rule__BCoolLibrary__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__2_in_rule__BCoolLibrary__Group_4__11108);
            rule__BCoolLibrary__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__1"


    // $ANTLR start "rule__BCoolLibrary__Group_4__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:581:1: rule__BCoolLibrary__Group_4__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:585:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:586:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:586:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:587:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BCoolLibrary__Group_4__1__Impl1136); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:600:1: rule__BCoolLibrary__Group_4__2 : rule__BCoolLibrary__Group_4__2__Impl rule__BCoolLibrary__Group_4__3 ;
    public final void rule__BCoolLibrary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:604:1: ( rule__BCoolLibrary__Group_4__2__Impl rule__BCoolLibrary__Group_4__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:605:2: rule__BCoolLibrary__Group_4__2__Impl rule__BCoolLibrary__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__2__Impl_in_rule__BCoolLibrary__Group_4__21167);
            rule__BCoolLibrary__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__3_in_rule__BCoolLibrary__Group_4__21170);
            rule__BCoolLibrary__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__2"


    // $ANTLR start "rule__BCoolLibrary__Group_4__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:612:1: rule__BCoolLibrary__Group_4__2__Impl : ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) ) ;
    public final void rule__BCoolLibrary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:616:1: ( ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:617:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:617:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:618:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:619:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:619:2: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2_in_rule__BCoolLibrary__Group_4__2__Impl1197);
            rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:629:1: rule__BCoolLibrary__Group_4__3 : rule__BCoolLibrary__Group_4__3__Impl rule__BCoolLibrary__Group_4__4 ;
    public final void rule__BCoolLibrary__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:633:1: ( rule__BCoolLibrary__Group_4__3__Impl rule__BCoolLibrary__Group_4__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:634:2: rule__BCoolLibrary__Group_4__3__Impl rule__BCoolLibrary__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__3__Impl_in_rule__BCoolLibrary__Group_4__31227);
            rule__BCoolLibrary__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__4_in_rule__BCoolLibrary__Group_4__31230);
            rule__BCoolLibrary__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__3"


    // $ANTLR start "rule__BCoolLibrary__Group_4__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:641:1: rule__BCoolLibrary__Group_4__3__Impl : ( ( rule__BCoolLibrary__Group_4_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:645:1: ( ( ( rule__BCoolLibrary__Group_4_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:646:1: ( ( rule__BCoolLibrary__Group_4_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:646:1: ( ( rule__BCoolLibrary__Group_4_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:647:1: ( rule__BCoolLibrary__Group_4_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_4_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:648:1: ( rule__BCoolLibrary__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:648:2: rule__BCoolLibrary__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4_3__0_in_rule__BCoolLibrary__Group_4__3__Impl1257);
            	    rule__BCoolLibrary__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBCoolLibraryAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:658:1: rule__BCoolLibrary__Group_4__4 : rule__BCoolLibrary__Group_4__4__Impl ;
    public final void rule__BCoolLibrary__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:662:1: ( rule__BCoolLibrary__Group_4__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:663:2: rule__BCoolLibrary__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4__4__Impl_in_rule__BCoolLibrary__Group_4__41288);
            rule__BCoolLibrary__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__4"


    // $ANTLR start "rule__BCoolLibrary__Group_4__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:669:1: rule__BCoolLibrary__Group_4__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:673:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:674:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:674:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:675:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BCoolLibrary__Group_4__4__Impl1316); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:698:1: rule__BCoolLibrary__Group_4_3__0 : rule__BCoolLibrary__Group_4_3__0__Impl rule__BCoolLibrary__Group_4_3__1 ;
    public final void rule__BCoolLibrary__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:702:1: ( rule__BCoolLibrary__Group_4_3__0__Impl rule__BCoolLibrary__Group_4_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:703:2: rule__BCoolLibrary__Group_4_3__0__Impl rule__BCoolLibrary__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4_3__0__Impl_in_rule__BCoolLibrary__Group_4_3__01357);
            rule__BCoolLibrary__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4_3__1_in_rule__BCoolLibrary__Group_4_3__01360);
            rule__BCoolLibrary__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4_3__0"


    // $ANTLR start "rule__BCoolLibrary__Group_4_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:710:1: rule__BCoolLibrary__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:714:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:715:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:715:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:716:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__BCoolLibrary__Group_4_3__0__Impl1388); 
             after(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4_3__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:729:1: rule__BCoolLibrary__Group_4_3__1 : rule__BCoolLibrary__Group_4_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:733:1: ( rule__BCoolLibrary__Group_4_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:734:2: rule__BCoolLibrary__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_4_3__1__Impl_in_rule__BCoolLibrary__Group_4_3__11419);
            rule__BCoolLibrary__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4_3__1"


    // $ANTLR start "rule__BCoolLibrary__Group_4_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:740:1: rule__BCoolLibrary__Group_4_3__1__Impl : ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:744:1: ( ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:745:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:745:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:746:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:747:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:747:2: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1_in_rule__BCoolLibrary__Group_4_3__1__Impl1446);
            rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4_3__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:761:1: rule__BCoolLibrary__Group_5__0 : rule__BCoolLibrary__Group_5__0__Impl rule__BCoolLibrary__Group_5__1 ;
    public final void rule__BCoolLibrary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:765:1: ( rule__BCoolLibrary__Group_5__0__Impl rule__BCoolLibrary__Group_5__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:766:2: rule__BCoolLibrary__Group_5__0__Impl rule__BCoolLibrary__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__0__Impl_in_rule__BCoolLibrary__Group_5__01480);
            rule__BCoolLibrary__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__1_in_rule__BCoolLibrary__Group_5__01483);
            rule__BCoolLibrary__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__0"


    // $ANTLR start "rule__BCoolLibrary__Group_5__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:773:1: rule__BCoolLibrary__Group_5__0__Impl : ( 'relationDefinitions' ) ;
    public final void rule__BCoolLibrary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:777:1: ( ( 'relationDefinitions' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:778:1: ( 'relationDefinitions' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:778:1: ( 'relationDefinitions' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:779:1: 'relationDefinitions'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__BCoolLibrary__Group_5__0__Impl1511); 
             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:792:1: rule__BCoolLibrary__Group_5__1 : rule__BCoolLibrary__Group_5__1__Impl rule__BCoolLibrary__Group_5__2 ;
    public final void rule__BCoolLibrary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:796:1: ( rule__BCoolLibrary__Group_5__1__Impl rule__BCoolLibrary__Group_5__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:797:2: rule__BCoolLibrary__Group_5__1__Impl rule__BCoolLibrary__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__1__Impl_in_rule__BCoolLibrary__Group_5__11542);
            rule__BCoolLibrary__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__2_in_rule__BCoolLibrary__Group_5__11545);
            rule__BCoolLibrary__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__1"


    // $ANTLR start "rule__BCoolLibrary__Group_5__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:804:1: rule__BCoolLibrary__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:808:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:809:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:809:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:810:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BCoolLibrary__Group_5__1__Impl1573); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:823:1: rule__BCoolLibrary__Group_5__2 : rule__BCoolLibrary__Group_5__2__Impl rule__BCoolLibrary__Group_5__3 ;
    public final void rule__BCoolLibrary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:827:1: ( rule__BCoolLibrary__Group_5__2__Impl rule__BCoolLibrary__Group_5__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:828:2: rule__BCoolLibrary__Group_5__2__Impl rule__BCoolLibrary__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__2__Impl_in_rule__BCoolLibrary__Group_5__21604);
            rule__BCoolLibrary__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__3_in_rule__BCoolLibrary__Group_5__21607);
            rule__BCoolLibrary__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__2"


    // $ANTLR start "rule__BCoolLibrary__Group_5__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:835:1: rule__BCoolLibrary__Group_5__2__Impl : ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) ) ;
    public final void rule__BCoolLibrary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:839:1: ( ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:840:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:840:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:841:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:842:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:842:2: rule__BCoolLibrary__RelationDefinitionsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__RelationDefinitionsAssignment_5_2_in_rule__BCoolLibrary__Group_5__2__Impl1634);
            rule__BCoolLibrary__RelationDefinitionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:852:1: rule__BCoolLibrary__Group_5__3 : rule__BCoolLibrary__Group_5__3__Impl rule__BCoolLibrary__Group_5__4 ;
    public final void rule__BCoolLibrary__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:856:1: ( rule__BCoolLibrary__Group_5__3__Impl rule__BCoolLibrary__Group_5__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:857:2: rule__BCoolLibrary__Group_5__3__Impl rule__BCoolLibrary__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__3__Impl_in_rule__BCoolLibrary__Group_5__31664);
            rule__BCoolLibrary__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__4_in_rule__BCoolLibrary__Group_5__31667);
            rule__BCoolLibrary__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__3"


    // $ANTLR start "rule__BCoolLibrary__Group_5__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:864:1: rule__BCoolLibrary__Group_5__3__Impl : ( ( rule__BCoolLibrary__Group_5_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:868:1: ( ( ( rule__BCoolLibrary__Group_5_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:869:1: ( ( rule__BCoolLibrary__Group_5_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:869:1: ( ( rule__BCoolLibrary__Group_5_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:870:1: ( rule__BCoolLibrary__Group_5_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_5_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:871:1: ( rule__BCoolLibrary__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:871:2: rule__BCoolLibrary__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5_3__0_in_rule__BCoolLibrary__Group_5__3__Impl1694);
            	    rule__BCoolLibrary__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBCoolLibraryAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:881:1: rule__BCoolLibrary__Group_5__4 : rule__BCoolLibrary__Group_5__4__Impl ;
    public final void rule__BCoolLibrary__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:885:1: ( rule__BCoolLibrary__Group_5__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:886:2: rule__BCoolLibrary__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5__4__Impl_in_rule__BCoolLibrary__Group_5__41725);
            rule__BCoolLibrary__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__4"


    // $ANTLR start "rule__BCoolLibrary__Group_5__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:892:1: rule__BCoolLibrary__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:896:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:897:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:897:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:898:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BCoolLibrary__Group_5__4__Impl1753); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:921:1: rule__BCoolLibrary__Group_5_3__0 : rule__BCoolLibrary__Group_5_3__0__Impl rule__BCoolLibrary__Group_5_3__1 ;
    public final void rule__BCoolLibrary__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:925:1: ( rule__BCoolLibrary__Group_5_3__0__Impl rule__BCoolLibrary__Group_5_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:926:2: rule__BCoolLibrary__Group_5_3__0__Impl rule__BCoolLibrary__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5_3__0__Impl_in_rule__BCoolLibrary__Group_5_3__01794);
            rule__BCoolLibrary__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5_3__1_in_rule__BCoolLibrary__Group_5_3__01797);
            rule__BCoolLibrary__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5_3__0"


    // $ANTLR start "rule__BCoolLibrary__Group_5_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:933:1: rule__BCoolLibrary__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:937:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:938:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:938:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:939:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__BCoolLibrary__Group_5_3__0__Impl1825); 
             after(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5_3__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:952:1: rule__BCoolLibrary__Group_5_3__1 : rule__BCoolLibrary__Group_5_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:956:1: ( rule__BCoolLibrary__Group_5_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:957:2: rule__BCoolLibrary__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_5_3__1__Impl_in_rule__BCoolLibrary__Group_5_3__11856);
            rule__BCoolLibrary__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5_3__1"


    // $ANTLR start "rule__BCoolLibrary__Group_5_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:963:1: rule__BCoolLibrary__Group_5_3__1__Impl : ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:967:1: ( ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:968:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:968:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:969:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:970:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:970:2: rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1_in_rule__BCoolLibrary__Group_5_3__1__Impl1883);
            rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5_3__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:984:1: rule__BCoolLibrary__Group_6__0 : rule__BCoolLibrary__Group_6__0__Impl rule__BCoolLibrary__Group_6__1 ;
    public final void rule__BCoolLibrary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:988:1: ( rule__BCoolLibrary__Group_6__0__Impl rule__BCoolLibrary__Group_6__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:989:2: rule__BCoolLibrary__Group_6__0__Impl rule__BCoolLibrary__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__0__Impl_in_rule__BCoolLibrary__Group_6__01917);
            rule__BCoolLibrary__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__1_in_rule__BCoolLibrary__Group_6__01920);
            rule__BCoolLibrary__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__0"


    // $ANTLR start "rule__BCoolLibrary__Group_6__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:996:1: rule__BCoolLibrary__Group_6__0__Impl : ( 'relationDeclarations' ) ;
    public final void rule__BCoolLibrary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1000:1: ( ( 'relationDeclarations' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1001:1: ( 'relationDeclarations' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1001:1: ( 'relationDeclarations' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1002:1: 'relationDeclarations'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__BCoolLibrary__Group_6__0__Impl1948); 
             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1015:1: rule__BCoolLibrary__Group_6__1 : rule__BCoolLibrary__Group_6__1__Impl rule__BCoolLibrary__Group_6__2 ;
    public final void rule__BCoolLibrary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1019:1: ( rule__BCoolLibrary__Group_6__1__Impl rule__BCoolLibrary__Group_6__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1020:2: rule__BCoolLibrary__Group_6__1__Impl rule__BCoolLibrary__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__1__Impl_in_rule__BCoolLibrary__Group_6__11979);
            rule__BCoolLibrary__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__2_in_rule__BCoolLibrary__Group_6__11982);
            rule__BCoolLibrary__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__1"


    // $ANTLR start "rule__BCoolLibrary__Group_6__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1027:1: rule__BCoolLibrary__Group_6__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1031:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1032:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1032:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1033:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BCoolLibrary__Group_6__1__Impl2010); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1046:1: rule__BCoolLibrary__Group_6__2 : rule__BCoolLibrary__Group_6__2__Impl rule__BCoolLibrary__Group_6__3 ;
    public final void rule__BCoolLibrary__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1050:1: ( rule__BCoolLibrary__Group_6__2__Impl rule__BCoolLibrary__Group_6__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1051:2: rule__BCoolLibrary__Group_6__2__Impl rule__BCoolLibrary__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__2__Impl_in_rule__BCoolLibrary__Group_6__22041);
            rule__BCoolLibrary__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__3_in_rule__BCoolLibrary__Group_6__22044);
            rule__BCoolLibrary__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__2"


    // $ANTLR start "rule__BCoolLibrary__Group_6__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1058:1: rule__BCoolLibrary__Group_6__2__Impl : ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) ) ;
    public final void rule__BCoolLibrary__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1062:1: ( ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1063:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1063:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1064:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1065:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1065:2: rule__BCoolLibrary__RelationDeclarationsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__RelationDeclarationsAssignment_6_2_in_rule__BCoolLibrary__Group_6__2__Impl2071);
            rule__BCoolLibrary__RelationDeclarationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1075:1: rule__BCoolLibrary__Group_6__3 : rule__BCoolLibrary__Group_6__3__Impl rule__BCoolLibrary__Group_6__4 ;
    public final void rule__BCoolLibrary__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1079:1: ( rule__BCoolLibrary__Group_6__3__Impl rule__BCoolLibrary__Group_6__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1080:2: rule__BCoolLibrary__Group_6__3__Impl rule__BCoolLibrary__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__3__Impl_in_rule__BCoolLibrary__Group_6__32101);
            rule__BCoolLibrary__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__4_in_rule__BCoolLibrary__Group_6__32104);
            rule__BCoolLibrary__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__3"


    // $ANTLR start "rule__BCoolLibrary__Group_6__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1087:1: rule__BCoolLibrary__Group_6__3__Impl : ( ( rule__BCoolLibrary__Group_6_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1091:1: ( ( ( rule__BCoolLibrary__Group_6_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1092:1: ( ( rule__BCoolLibrary__Group_6_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1092:1: ( ( rule__BCoolLibrary__Group_6_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1093:1: ( rule__BCoolLibrary__Group_6_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_6_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1094:1: ( rule__BCoolLibrary__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1094:2: rule__BCoolLibrary__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6_3__0_in_rule__BCoolLibrary__Group_6__3__Impl2131);
            	    rule__BCoolLibrary__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBCoolLibraryAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1104:1: rule__BCoolLibrary__Group_6__4 : rule__BCoolLibrary__Group_6__4__Impl ;
    public final void rule__BCoolLibrary__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1108:1: ( rule__BCoolLibrary__Group_6__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1109:2: rule__BCoolLibrary__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6__4__Impl_in_rule__BCoolLibrary__Group_6__42162);
            rule__BCoolLibrary__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__4"


    // $ANTLR start "rule__BCoolLibrary__Group_6__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1115:1: rule__BCoolLibrary__Group_6__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1119:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1120:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1120:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1121:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BCoolLibrary__Group_6__4__Impl2190); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1144:1: rule__BCoolLibrary__Group_6_3__0 : rule__BCoolLibrary__Group_6_3__0__Impl rule__BCoolLibrary__Group_6_3__1 ;
    public final void rule__BCoolLibrary__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1148:1: ( rule__BCoolLibrary__Group_6_3__0__Impl rule__BCoolLibrary__Group_6_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1149:2: rule__BCoolLibrary__Group_6_3__0__Impl rule__BCoolLibrary__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6_3__0__Impl_in_rule__BCoolLibrary__Group_6_3__02231);
            rule__BCoolLibrary__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6_3__1_in_rule__BCoolLibrary__Group_6_3__02234);
            rule__BCoolLibrary__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6_3__0"


    // $ANTLR start "rule__BCoolLibrary__Group_6_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1156:1: rule__BCoolLibrary__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1160:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1161:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1161:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1162:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__BCoolLibrary__Group_6_3__0__Impl2262); 
             after(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6_3__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1175:1: rule__BCoolLibrary__Group_6_3__1 : rule__BCoolLibrary__Group_6_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1179:1: ( rule__BCoolLibrary__Group_6_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1180:2: rule__BCoolLibrary__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_6_3__1__Impl_in_rule__BCoolLibrary__Group_6_3__12293);
            rule__BCoolLibrary__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6_3__1"


    // $ANTLR start "rule__BCoolLibrary__Group_6_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1186:1: rule__BCoolLibrary__Group_6_3__1__Impl : ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1190:1: ( ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1191:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1191:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1192:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1193:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1193:2: rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1_in_rule__BCoolLibrary__Group_6_3__1__Impl2320);
            rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6_3__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1207:1: rule__BCoolLibrary__Group_7__0 : rule__BCoolLibrary__Group_7__0__Impl rule__BCoolLibrary__Group_7__1 ;
    public final void rule__BCoolLibrary__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1211:1: ( rule__BCoolLibrary__Group_7__0__Impl rule__BCoolLibrary__Group_7__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1212:2: rule__BCoolLibrary__Group_7__0__Impl rule__BCoolLibrary__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__0__Impl_in_rule__BCoolLibrary__Group_7__02354);
            rule__BCoolLibrary__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__1_in_rule__BCoolLibrary__Group_7__02357);
            rule__BCoolLibrary__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__0"


    // $ANTLR start "rule__BCoolLibrary__Group_7__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1219:1: rule__BCoolLibrary__Group_7__0__Impl : ( 'expressionDeclarations' ) ;
    public final void rule__BCoolLibrary__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1223:1: ( ( 'expressionDeclarations' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1224:1: ( 'expressionDeclarations' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1224:1: ( 'expressionDeclarations' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1225:1: 'expressionDeclarations'
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsKeyword_7_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BCoolLibrary__Group_7__0__Impl2385); 
             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1238:1: rule__BCoolLibrary__Group_7__1 : rule__BCoolLibrary__Group_7__1__Impl rule__BCoolLibrary__Group_7__2 ;
    public final void rule__BCoolLibrary__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1242:1: ( rule__BCoolLibrary__Group_7__1__Impl rule__BCoolLibrary__Group_7__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1243:2: rule__BCoolLibrary__Group_7__1__Impl rule__BCoolLibrary__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__1__Impl_in_rule__BCoolLibrary__Group_7__12416);
            rule__BCoolLibrary__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__2_in_rule__BCoolLibrary__Group_7__12419);
            rule__BCoolLibrary__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__1"


    // $ANTLR start "rule__BCoolLibrary__Group_7__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1250:1: rule__BCoolLibrary__Group_7__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1254:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1255:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1255:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1256:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BCoolLibrary__Group_7__1__Impl2447); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1269:1: rule__BCoolLibrary__Group_7__2 : rule__BCoolLibrary__Group_7__2__Impl rule__BCoolLibrary__Group_7__3 ;
    public final void rule__BCoolLibrary__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1273:1: ( rule__BCoolLibrary__Group_7__2__Impl rule__BCoolLibrary__Group_7__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1274:2: rule__BCoolLibrary__Group_7__2__Impl rule__BCoolLibrary__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__2__Impl_in_rule__BCoolLibrary__Group_7__22478);
            rule__BCoolLibrary__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__3_in_rule__BCoolLibrary__Group_7__22481);
            rule__BCoolLibrary__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__2"


    // $ANTLR start "rule__BCoolLibrary__Group_7__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1281:1: rule__BCoolLibrary__Group_7__2__Impl : ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) ) ;
    public final void rule__BCoolLibrary__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1285:1: ( ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1286:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1286:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1287:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1288:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1288:2: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2_in_rule__BCoolLibrary__Group_7__2__Impl2508);
            rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1298:1: rule__BCoolLibrary__Group_7__3 : rule__BCoolLibrary__Group_7__3__Impl rule__BCoolLibrary__Group_7__4 ;
    public final void rule__BCoolLibrary__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1302:1: ( rule__BCoolLibrary__Group_7__3__Impl rule__BCoolLibrary__Group_7__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1303:2: rule__BCoolLibrary__Group_7__3__Impl rule__BCoolLibrary__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__3__Impl_in_rule__BCoolLibrary__Group_7__32538);
            rule__BCoolLibrary__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__4_in_rule__BCoolLibrary__Group_7__32541);
            rule__BCoolLibrary__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__3"


    // $ANTLR start "rule__BCoolLibrary__Group_7__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1310:1: rule__BCoolLibrary__Group_7__3__Impl : ( ( rule__BCoolLibrary__Group_7_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1314:1: ( ( ( rule__BCoolLibrary__Group_7_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1315:1: ( ( rule__BCoolLibrary__Group_7_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1315:1: ( ( rule__BCoolLibrary__Group_7_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1316:1: ( rule__BCoolLibrary__Group_7_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_7_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1317:1: ( rule__BCoolLibrary__Group_7_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1317:2: rule__BCoolLibrary__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7_3__0_in_rule__BCoolLibrary__Group_7__3__Impl2568);
            	    rule__BCoolLibrary__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBCoolLibraryAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1327:1: rule__BCoolLibrary__Group_7__4 : rule__BCoolLibrary__Group_7__4__Impl ;
    public final void rule__BCoolLibrary__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1331:1: ( rule__BCoolLibrary__Group_7__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1332:2: rule__BCoolLibrary__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7__4__Impl_in_rule__BCoolLibrary__Group_7__42599);
            rule__BCoolLibrary__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__4"


    // $ANTLR start "rule__BCoolLibrary__Group_7__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1338:1: rule__BCoolLibrary__Group_7__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1342:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1343:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1343:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1344:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BCoolLibrary__Group_7__4__Impl2627); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1367:1: rule__BCoolLibrary__Group_7_3__0 : rule__BCoolLibrary__Group_7_3__0__Impl rule__BCoolLibrary__Group_7_3__1 ;
    public final void rule__BCoolLibrary__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1371:1: ( rule__BCoolLibrary__Group_7_3__0__Impl rule__BCoolLibrary__Group_7_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1372:2: rule__BCoolLibrary__Group_7_3__0__Impl rule__BCoolLibrary__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7_3__0__Impl_in_rule__BCoolLibrary__Group_7_3__02668);
            rule__BCoolLibrary__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7_3__1_in_rule__BCoolLibrary__Group_7_3__02671);
            rule__BCoolLibrary__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7_3__0"


    // $ANTLR start "rule__BCoolLibrary__Group_7_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1379:1: rule__BCoolLibrary__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1383:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1384:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1384:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1385:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__BCoolLibrary__Group_7_3__0__Impl2699); 
             after(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7_3__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1398:1: rule__BCoolLibrary__Group_7_3__1 : rule__BCoolLibrary__Group_7_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1402:1: ( rule__BCoolLibrary__Group_7_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1403:2: rule__BCoolLibrary__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__Group_7_3__1__Impl_in_rule__BCoolLibrary__Group_7_3__12730);
            rule__BCoolLibrary__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7_3__1"


    // $ANTLR start "rule__BCoolLibrary__Group_7_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1409:1: rule__BCoolLibrary__Group_7_3__1__Impl : ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1413:1: ( ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1414:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1414:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1415:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1416:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1416:2: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1_in_rule__BCoolLibrary__Group_7_3__1__Impl2757);
            rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7_3__1__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1430:1: rule__ExpressionDefinition__Group__0 : rule__ExpressionDefinition__Group__0__Impl rule__ExpressionDefinition__Group__1 ;
    public final void rule__ExpressionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1434:1: ( rule__ExpressionDefinition__Group__0__Impl rule__ExpressionDefinition__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1435:2: rule__ExpressionDefinition__Group__0__Impl rule__ExpressionDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__0__Impl_in_rule__ExpressionDefinition__Group__02791);
            rule__ExpressionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__1_in_rule__ExpressionDefinition__Group__02794);
            rule__ExpressionDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__0"


    // $ANTLR start "rule__ExpressionDefinition__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1442:1: rule__ExpressionDefinition__Group__0__Impl : ( 'ExpressionDefinition' ) ;
    public final void rule__ExpressionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1446:1: ( ( 'ExpressionDefinition' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1447:1: ( 'ExpressionDefinition' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1447:1: ( 'ExpressionDefinition' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1448:1: 'ExpressionDefinition'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getExpressionDefinitionKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ExpressionDefinition__Group__0__Impl2822); 
             after(grammarAccess.getExpressionDefinitionAccess().getExpressionDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__0__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1461:1: rule__ExpressionDefinition__Group__1 : rule__ExpressionDefinition__Group__1__Impl rule__ExpressionDefinition__Group__2 ;
    public final void rule__ExpressionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1465:1: ( rule__ExpressionDefinition__Group__1__Impl rule__ExpressionDefinition__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1466:2: rule__ExpressionDefinition__Group__1__Impl rule__ExpressionDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__1__Impl_in_rule__ExpressionDefinition__Group__12853);
            rule__ExpressionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__2_in_rule__ExpressionDefinition__Group__12856);
            rule__ExpressionDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__1"


    // $ANTLR start "rule__ExpressionDefinition__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1473:1: rule__ExpressionDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ExpressionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1477:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1478:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1478:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1479:1: '{'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ExpressionDefinition__Group__1__Impl2884); 
             after(grammarAccess.getExpressionDefinitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__1__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1492:1: rule__ExpressionDefinition__Group__2 : rule__ExpressionDefinition__Group__2__Impl rule__ExpressionDefinition__Group__3 ;
    public final void rule__ExpressionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1496:1: ( rule__ExpressionDefinition__Group__2__Impl rule__ExpressionDefinition__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1497:2: rule__ExpressionDefinition__Group__2__Impl rule__ExpressionDefinition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__2__Impl_in_rule__ExpressionDefinition__Group__22915);
            rule__ExpressionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__3_in_rule__ExpressionDefinition__Group__22918);
            rule__ExpressionDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__2"


    // $ANTLR start "rule__ExpressionDefinition__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1504:1: rule__ExpressionDefinition__Group__2__Impl : ( 'definition' ) ;
    public final void rule__ExpressionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1508:1: ( ( 'definition' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1509:1: ( 'definition' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1509:1: ( 'definition' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1510:1: 'definition'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ExpressionDefinition__Group__2__Impl2946); 
             after(grammarAccess.getExpressionDefinitionAccess().getDefinitionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__2__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1523:1: rule__ExpressionDefinition__Group__3 : rule__ExpressionDefinition__Group__3__Impl rule__ExpressionDefinition__Group__4 ;
    public final void rule__ExpressionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1527:1: ( rule__ExpressionDefinition__Group__3__Impl rule__ExpressionDefinition__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1528:2: rule__ExpressionDefinition__Group__3__Impl rule__ExpressionDefinition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__3__Impl_in_rule__ExpressionDefinition__Group__32977);
            rule__ExpressionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__4_in_rule__ExpressionDefinition__Group__32980);
            rule__ExpressionDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__3"


    // $ANTLR start "rule__ExpressionDefinition__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1535:1: rule__ExpressionDefinition__Group__3__Impl : ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) ) ;
    public final void rule__ExpressionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1539:1: ( ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1540:1: ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1540:1: ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1541:1: ( rule__ExpressionDefinition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionAssignment_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1542:1: ( rule__ExpressionDefinition__DefinitionAssignment_3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1542:2: rule__ExpressionDefinition__DefinitionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__DefinitionAssignment_3_in_rule__ExpressionDefinition__Group__3__Impl3007);
            rule__ExpressionDefinition__DefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDefinitionAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__3__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1552:1: rule__ExpressionDefinition__Group__4 : rule__ExpressionDefinition__Group__4__Impl ;
    public final void rule__ExpressionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1556:1: ( rule__ExpressionDefinition__Group__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1557:2: rule__ExpressionDefinition__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDefinition__Group__4__Impl_in_rule__ExpressionDefinition__Group__43037);
            rule__ExpressionDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__4"


    // $ANTLR start "rule__ExpressionDefinition__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1563:1: rule__ExpressionDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__ExpressionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1567:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1568:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1568:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1569:1: '}'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__ExpressionDefinition__Group__4__Impl3065); 
             after(grammarAccess.getExpressionDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__4__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1592:1: rule__RelationDefinition__Group__0 : rule__RelationDefinition__Group__0__Impl rule__RelationDefinition__Group__1 ;
    public final void rule__RelationDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1596:1: ( rule__RelationDefinition__Group__0__Impl rule__RelationDefinition__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1597:2: rule__RelationDefinition__Group__0__Impl rule__RelationDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__0__Impl_in_rule__RelationDefinition__Group__03106);
            rule__RelationDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__1_in_rule__RelationDefinition__Group__03109);
            rule__RelationDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__0"


    // $ANTLR start "rule__RelationDefinition__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1604:1: rule__RelationDefinition__Group__0__Impl : ( 'RelationDefinition' ) ;
    public final void rule__RelationDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1608:1: ( ( 'RelationDefinition' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1609:1: ( 'RelationDefinition' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1609:1: ( 'RelationDefinition' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1610:1: 'RelationDefinition'
            {
             before(grammarAccess.getRelationDefinitionAccess().getRelationDefinitionKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__RelationDefinition__Group__0__Impl3137); 
             after(grammarAccess.getRelationDefinitionAccess().getRelationDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__0__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1623:1: rule__RelationDefinition__Group__1 : rule__RelationDefinition__Group__1__Impl rule__RelationDefinition__Group__2 ;
    public final void rule__RelationDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1627:1: ( rule__RelationDefinition__Group__1__Impl rule__RelationDefinition__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1628:2: rule__RelationDefinition__Group__1__Impl rule__RelationDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__1__Impl_in_rule__RelationDefinition__Group__13168);
            rule__RelationDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__2_in_rule__RelationDefinition__Group__13171);
            rule__RelationDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__1"


    // $ANTLR start "rule__RelationDefinition__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1635:1: rule__RelationDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__RelationDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1639:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1640:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1640:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1641:1: '{'
            {
             before(grammarAccess.getRelationDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RelationDefinition__Group__1__Impl3199); 
             after(grammarAccess.getRelationDefinitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__1__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1654:1: rule__RelationDefinition__Group__2 : rule__RelationDefinition__Group__2__Impl rule__RelationDefinition__Group__3 ;
    public final void rule__RelationDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1658:1: ( rule__RelationDefinition__Group__2__Impl rule__RelationDefinition__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1659:2: rule__RelationDefinition__Group__2__Impl rule__RelationDefinition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__2__Impl_in_rule__RelationDefinition__Group__23230);
            rule__RelationDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__3_in_rule__RelationDefinition__Group__23233);
            rule__RelationDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__2"


    // $ANTLR start "rule__RelationDefinition__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1666:1: rule__RelationDefinition__Group__2__Impl : ( 'definition' ) ;
    public final void rule__RelationDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1670:1: ( ( 'definition' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1671:1: ( 'definition' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1671:1: ( 'definition' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1672:1: 'definition'
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__RelationDefinition__Group__2__Impl3261); 
             after(grammarAccess.getRelationDefinitionAccess().getDefinitionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__2__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1685:1: rule__RelationDefinition__Group__3 : rule__RelationDefinition__Group__3__Impl rule__RelationDefinition__Group__4 ;
    public final void rule__RelationDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1689:1: ( rule__RelationDefinition__Group__3__Impl rule__RelationDefinition__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1690:2: rule__RelationDefinition__Group__3__Impl rule__RelationDefinition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__3__Impl_in_rule__RelationDefinition__Group__33292);
            rule__RelationDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__4_in_rule__RelationDefinition__Group__33295);
            rule__RelationDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__3"


    // $ANTLR start "rule__RelationDefinition__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1697:1: rule__RelationDefinition__Group__3__Impl : ( ( rule__RelationDefinition__DefinitionAssignment_3 ) ) ;
    public final void rule__RelationDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1701:1: ( ( ( rule__RelationDefinition__DefinitionAssignment_3 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1702:1: ( ( rule__RelationDefinition__DefinitionAssignment_3 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1702:1: ( ( rule__RelationDefinition__DefinitionAssignment_3 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1703:1: ( rule__RelationDefinition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionAssignment_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1704:1: ( rule__RelationDefinition__DefinitionAssignment_3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1704:2: rule__RelationDefinition__DefinitionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__DefinitionAssignment_3_in_rule__RelationDefinition__Group__3__Impl3322);
            rule__RelationDefinition__DefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationDefinitionAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__3__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1714:1: rule__RelationDefinition__Group__4 : rule__RelationDefinition__Group__4__Impl ;
    public final void rule__RelationDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1718:1: ( rule__RelationDefinition__Group__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1719:2: rule__RelationDefinition__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDefinition__Group__4__Impl_in_rule__RelationDefinition__Group__43352);
            rule__RelationDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__4"


    // $ANTLR start "rule__RelationDefinition__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1725:1: rule__RelationDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__RelationDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1729:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1730:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1730:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1731:1: '}'
            {
             before(grammarAccess.getRelationDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RelationDefinition__Group__4__Impl3380); 
             after(grammarAccess.getRelationDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__4__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1754:1: rule__RelationDeclaration__Group__0 : rule__RelationDeclaration__Group__0__Impl rule__RelationDeclaration__Group__1 ;
    public final void rule__RelationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1758:1: ( rule__RelationDeclaration__Group__0__Impl rule__RelationDeclaration__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1759:2: rule__RelationDeclaration__Group__0__Impl rule__RelationDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__0__Impl_in_rule__RelationDeclaration__Group__03421);
            rule__RelationDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__1_in_rule__RelationDeclaration__Group__03424);
            rule__RelationDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__0"


    // $ANTLR start "rule__RelationDeclaration__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1766:1: rule__RelationDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__RelationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1770:1: ( ( () ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1771:1: ( () )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1771:1: ( () )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1772:1: ()
            {
             before(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationAction_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1773:1: ()
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1775:1: 
            {
            }

             after(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__0__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1785:1: rule__RelationDeclaration__Group__1 : rule__RelationDeclaration__Group__1__Impl rule__RelationDeclaration__Group__2 ;
    public final void rule__RelationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1789:1: ( rule__RelationDeclaration__Group__1__Impl rule__RelationDeclaration__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1790:2: rule__RelationDeclaration__Group__1__Impl rule__RelationDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__1__Impl_in_rule__RelationDeclaration__Group__13482);
            rule__RelationDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__2_in_rule__RelationDeclaration__Group__13485);
            rule__RelationDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__1"


    // $ANTLR start "rule__RelationDeclaration__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1797:1: rule__RelationDeclaration__Group__1__Impl : ( 'RelationDeclaration' ) ;
    public final void rule__RelationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1801:1: ( ( 'RelationDeclaration' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1802:1: ( 'RelationDeclaration' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1802:1: ( 'RelationDeclaration' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1803:1: 'RelationDeclaration'
            {
             before(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__RelationDeclaration__Group__1__Impl3513); 
             after(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1816:1: rule__RelationDeclaration__Group__2 : rule__RelationDeclaration__Group__2__Impl rule__RelationDeclaration__Group__3 ;
    public final void rule__RelationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1820:1: ( rule__RelationDeclaration__Group__2__Impl rule__RelationDeclaration__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1821:2: rule__RelationDeclaration__Group__2__Impl rule__RelationDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__2__Impl_in_rule__RelationDeclaration__Group__23544);
            rule__RelationDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__3_in_rule__RelationDeclaration__Group__23547);
            rule__RelationDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__2"


    // $ANTLR start "rule__RelationDeclaration__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1828:1: rule__RelationDeclaration__Group__2__Impl : ( ( rule__RelationDeclaration__NameAssignment_2 ) ) ;
    public final void rule__RelationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1832:1: ( ( ( rule__RelationDeclaration__NameAssignment_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1833:1: ( ( rule__RelationDeclaration__NameAssignment_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1833:1: ( ( rule__RelationDeclaration__NameAssignment_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1834:1: ( rule__RelationDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getNameAssignment_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1835:1: ( rule__RelationDeclaration__NameAssignment_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1835:2: rule__RelationDeclaration__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__NameAssignment_2_in_rule__RelationDeclaration__Group__2__Impl3574);
            rule__RelationDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__2__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1845:1: rule__RelationDeclaration__Group__3 : rule__RelationDeclaration__Group__3__Impl rule__RelationDeclaration__Group__4 ;
    public final void rule__RelationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1849:1: ( rule__RelationDeclaration__Group__3__Impl rule__RelationDeclaration__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1850:2: rule__RelationDeclaration__Group__3__Impl rule__RelationDeclaration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__3__Impl_in_rule__RelationDeclaration__Group__33604);
            rule__RelationDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__4_in_rule__RelationDeclaration__Group__33607);
            rule__RelationDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__3"


    // $ANTLR start "rule__RelationDeclaration__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1857:1: rule__RelationDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__RelationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1861:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1862:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1862:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1863:1: '{'
            {
             before(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RelationDeclaration__Group__3__Impl3635); 
             after(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__3__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1876:1: rule__RelationDeclaration__Group__4 : rule__RelationDeclaration__Group__4__Impl rule__RelationDeclaration__Group__5 ;
    public final void rule__RelationDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1880:1: ( rule__RelationDeclaration__Group__4__Impl rule__RelationDeclaration__Group__5 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1881:2: rule__RelationDeclaration__Group__4__Impl rule__RelationDeclaration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__4__Impl_in_rule__RelationDeclaration__Group__43666);
            rule__RelationDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__5_in_rule__RelationDeclaration__Group__43669);
            rule__RelationDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__4"


    // $ANTLR start "rule__RelationDeclaration__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1888:1: rule__RelationDeclaration__Group__4__Impl : ( ( rule__RelationDeclaration__Group_4__0 )? ) ;
    public final void rule__RelationDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1892:1: ( ( ( rule__RelationDeclaration__Group_4__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1893:1: ( ( rule__RelationDeclaration__Group_4__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1893:1: ( ( rule__RelationDeclaration__Group_4__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1894:1: ( rule__RelationDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getRelationDeclarationAccess().getGroup_4()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1895:1: ( rule__RelationDeclaration__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1895:2: rule__RelationDeclaration__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__0_in_rule__RelationDeclaration__Group__4__Impl3696);
                    rule__RelationDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__4__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__5"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1905:1: rule__RelationDeclaration__Group__5 : rule__RelationDeclaration__Group__5__Impl ;
    public final void rule__RelationDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1909:1: ( rule__RelationDeclaration__Group__5__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1910:2: rule__RelationDeclaration__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group__5__Impl_in_rule__RelationDeclaration__Group__53727);
            rule__RelationDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__5"


    // $ANTLR start "rule__RelationDeclaration__Group__5__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1916:1: rule__RelationDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__RelationDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1920:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1921:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1921:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1922:1: '}'
            {
             before(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RelationDeclaration__Group__5__Impl3755); 
             after(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__5__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1947:1: rule__RelationDeclaration__Group_4__0 : rule__RelationDeclaration__Group_4__0__Impl rule__RelationDeclaration__Group_4__1 ;
    public final void rule__RelationDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1951:1: ( rule__RelationDeclaration__Group_4__0__Impl rule__RelationDeclaration__Group_4__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1952:2: rule__RelationDeclaration__Group_4__0__Impl rule__RelationDeclaration__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__0__Impl_in_rule__RelationDeclaration__Group_4__03798);
            rule__RelationDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__1_in_rule__RelationDeclaration__Group_4__03801);
            rule__RelationDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__0"


    // $ANTLR start "rule__RelationDeclaration__Group_4__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1959:1: rule__RelationDeclaration__Group_4__0__Impl : ( 'formalParameters' ) ;
    public final void rule__RelationDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1963:1: ( ( 'formalParameters' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1964:1: ( 'formalParameters' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1964:1: ( 'formalParameters' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1965:1: 'formalParameters'
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__RelationDeclaration__Group_4__0__Impl3829); 
             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1978:1: rule__RelationDeclaration__Group_4__1 : rule__RelationDeclaration__Group_4__1__Impl rule__RelationDeclaration__Group_4__2 ;
    public final void rule__RelationDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1982:1: ( rule__RelationDeclaration__Group_4__1__Impl rule__RelationDeclaration__Group_4__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1983:2: rule__RelationDeclaration__Group_4__1__Impl rule__RelationDeclaration__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__1__Impl_in_rule__RelationDeclaration__Group_4__13860);
            rule__RelationDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__2_in_rule__RelationDeclaration__Group_4__13863);
            rule__RelationDeclaration__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__1"


    // $ANTLR start "rule__RelationDeclaration__Group_4__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1990:1: rule__RelationDeclaration__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RelationDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1994:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1995:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1995:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1996:1: '{'
            {
             before(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RelationDeclaration__Group_4__1__Impl3891); 
             after(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2009:1: rule__RelationDeclaration__Group_4__2 : rule__RelationDeclaration__Group_4__2__Impl rule__RelationDeclaration__Group_4__3 ;
    public final void rule__RelationDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2013:1: ( rule__RelationDeclaration__Group_4__2__Impl rule__RelationDeclaration__Group_4__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2014:2: rule__RelationDeclaration__Group_4__2__Impl rule__RelationDeclaration__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__2__Impl_in_rule__RelationDeclaration__Group_4__23922);
            rule__RelationDeclaration__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__3_in_rule__RelationDeclaration__Group_4__23925);
            rule__RelationDeclaration__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__2"


    // $ANTLR start "rule__RelationDeclaration__Group_4__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2021:1: rule__RelationDeclaration__Group_4__2__Impl : ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) ) ;
    public final void rule__RelationDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2025:1: ( ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2026:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2026:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2027:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_2 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2028:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2028:2: rule__RelationDeclaration__FormalParametersAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__FormalParametersAssignment_4_2_in_rule__RelationDeclaration__Group_4__2__Impl3952);
            rule__RelationDeclaration__FormalParametersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__2__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2038:1: rule__RelationDeclaration__Group_4__3 : rule__RelationDeclaration__Group_4__3__Impl rule__RelationDeclaration__Group_4__4 ;
    public final void rule__RelationDeclaration__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2042:1: ( rule__RelationDeclaration__Group_4__3__Impl rule__RelationDeclaration__Group_4__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2043:2: rule__RelationDeclaration__Group_4__3__Impl rule__RelationDeclaration__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__3__Impl_in_rule__RelationDeclaration__Group_4__33982);
            rule__RelationDeclaration__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__4_in_rule__RelationDeclaration__Group_4__33985);
            rule__RelationDeclaration__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__3"


    // $ANTLR start "rule__RelationDeclaration__Group_4__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2050:1: rule__RelationDeclaration__Group_4__3__Impl : ( ( rule__RelationDeclaration__Group_4_3__0 )* ) ;
    public final void rule__RelationDeclaration__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2054:1: ( ( ( rule__RelationDeclaration__Group_4_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2055:1: ( ( rule__RelationDeclaration__Group_4_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2055:1: ( ( rule__RelationDeclaration__Group_4_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2056:1: ( rule__RelationDeclaration__Group_4_3__0 )*
            {
             before(grammarAccess.getRelationDeclarationAccess().getGroup_4_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2057:1: ( rule__RelationDeclaration__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2057:2: rule__RelationDeclaration__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4_3__0_in_rule__RelationDeclaration__Group_4__3__Impl4012);
            	    rule__RelationDeclaration__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRelationDeclarationAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__3__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2067:1: rule__RelationDeclaration__Group_4__4 : rule__RelationDeclaration__Group_4__4__Impl ;
    public final void rule__RelationDeclaration__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2071:1: ( rule__RelationDeclaration__Group_4__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2072:2: rule__RelationDeclaration__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4__4__Impl_in_rule__RelationDeclaration__Group_4__44043);
            rule__RelationDeclaration__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__4"


    // $ANTLR start "rule__RelationDeclaration__Group_4__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2078:1: rule__RelationDeclaration__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RelationDeclaration__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2082:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2083:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2083:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2084:1: '}'
            {
             before(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RelationDeclaration__Group_4__4__Impl4071); 
             after(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__4__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2107:1: rule__RelationDeclaration__Group_4_3__0 : rule__RelationDeclaration__Group_4_3__0__Impl rule__RelationDeclaration__Group_4_3__1 ;
    public final void rule__RelationDeclaration__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2111:1: ( rule__RelationDeclaration__Group_4_3__0__Impl rule__RelationDeclaration__Group_4_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2112:2: rule__RelationDeclaration__Group_4_3__0__Impl rule__RelationDeclaration__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4_3__0__Impl_in_rule__RelationDeclaration__Group_4_3__04112);
            rule__RelationDeclaration__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4_3__1_in_rule__RelationDeclaration__Group_4_3__04115);
            rule__RelationDeclaration__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4_3__0"


    // $ANTLR start "rule__RelationDeclaration__Group_4_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2119:1: rule__RelationDeclaration__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RelationDeclaration__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2123:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2124:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2124:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2125:1: ','
            {
             before(grammarAccess.getRelationDeclarationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RelationDeclaration__Group_4_3__0__Impl4143); 
             after(grammarAccess.getRelationDeclarationAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4_3__0__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2138:1: rule__RelationDeclaration__Group_4_3__1 : rule__RelationDeclaration__Group_4_3__1__Impl ;
    public final void rule__RelationDeclaration__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2142:1: ( rule__RelationDeclaration__Group_4_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2143:2: rule__RelationDeclaration__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__Group_4_3__1__Impl_in_rule__RelationDeclaration__Group_4_3__14174);
            rule__RelationDeclaration__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4_3__1"


    // $ANTLR start "rule__RelationDeclaration__Group_4_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2149:1: rule__RelationDeclaration__Group_4_3__1__Impl : ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) ) ;
    public final void rule__RelationDeclaration__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2153:1: ( ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2154:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2154:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2155:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2156:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2156:2: rule__RelationDeclaration__FormalParametersAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationDeclaration__FormalParametersAssignment_4_3_1_in_rule__RelationDeclaration__Group_4_3__1__Impl4201);
            rule__RelationDeclaration__FormalParametersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4_3__1__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2170:1: rule__ExpressionDeclaration__Group__0 : rule__ExpressionDeclaration__Group__0__Impl rule__ExpressionDeclaration__Group__1 ;
    public final void rule__ExpressionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2174:1: ( rule__ExpressionDeclaration__Group__0__Impl rule__ExpressionDeclaration__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2175:2: rule__ExpressionDeclaration__Group__0__Impl rule__ExpressionDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__0__Impl_in_rule__ExpressionDeclaration__Group__04235);
            rule__ExpressionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__1_in_rule__ExpressionDeclaration__Group__04238);
            rule__ExpressionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__0"


    // $ANTLR start "rule__ExpressionDeclaration__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2182:1: rule__ExpressionDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ExpressionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2186:1: ( ( () ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2187:1: ( () )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2187:1: ( () )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2188:1: ()
            {
             before(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationAction_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2189:1: ()
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2191:1: 
            {
            }

             after(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2201:1: rule__ExpressionDeclaration__Group__1 : rule__ExpressionDeclaration__Group__1__Impl rule__ExpressionDeclaration__Group__2 ;
    public final void rule__ExpressionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2205:1: ( rule__ExpressionDeclaration__Group__1__Impl rule__ExpressionDeclaration__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2206:2: rule__ExpressionDeclaration__Group__1__Impl rule__ExpressionDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__1__Impl_in_rule__ExpressionDeclaration__Group__14296);
            rule__ExpressionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__2_in_rule__ExpressionDeclaration__Group__14299);
            rule__ExpressionDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__1"


    // $ANTLR start "rule__ExpressionDeclaration__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2213:1: rule__ExpressionDeclaration__Group__1__Impl : ( 'ExpressionDeclaration' ) ;
    public final void rule__ExpressionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2217:1: ( ( 'ExpressionDeclaration' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2218:1: ( 'ExpressionDeclaration' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2218:1: ( 'ExpressionDeclaration' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2219:1: 'ExpressionDeclaration'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ExpressionDeclaration__Group__1__Impl4327); 
             after(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2232:1: rule__ExpressionDeclaration__Group__2 : rule__ExpressionDeclaration__Group__2__Impl rule__ExpressionDeclaration__Group__3 ;
    public final void rule__ExpressionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2236:1: ( rule__ExpressionDeclaration__Group__2__Impl rule__ExpressionDeclaration__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2237:2: rule__ExpressionDeclaration__Group__2__Impl rule__ExpressionDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__2__Impl_in_rule__ExpressionDeclaration__Group__24358);
            rule__ExpressionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__3_in_rule__ExpressionDeclaration__Group__24361);
            rule__ExpressionDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__2"


    // $ANTLR start "rule__ExpressionDeclaration__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2244:1: rule__ExpressionDeclaration__Group__2__Impl : ( ( rule__ExpressionDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ExpressionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2248:1: ( ( ( rule__ExpressionDeclaration__NameAssignment_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2249:1: ( ( rule__ExpressionDeclaration__NameAssignment_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2249:1: ( ( rule__ExpressionDeclaration__NameAssignment_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2250:1: ( rule__ExpressionDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getNameAssignment_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2251:1: ( rule__ExpressionDeclaration__NameAssignment_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2251:2: rule__ExpressionDeclaration__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__NameAssignment_2_in_rule__ExpressionDeclaration__Group__2__Impl4388);
            rule__ExpressionDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2261:1: rule__ExpressionDeclaration__Group__3 : rule__ExpressionDeclaration__Group__3__Impl rule__ExpressionDeclaration__Group__4 ;
    public final void rule__ExpressionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2265:1: ( rule__ExpressionDeclaration__Group__3__Impl rule__ExpressionDeclaration__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2266:2: rule__ExpressionDeclaration__Group__3__Impl rule__ExpressionDeclaration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__3__Impl_in_rule__ExpressionDeclaration__Group__34418);
            rule__ExpressionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__4_in_rule__ExpressionDeclaration__Group__34421);
            rule__ExpressionDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__3"


    // $ANTLR start "rule__ExpressionDeclaration__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2273:1: rule__ExpressionDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ExpressionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2277:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2278:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2278:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2279:1: '{'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ExpressionDeclaration__Group__3__Impl4449); 
             after(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2292:1: rule__ExpressionDeclaration__Group__4 : rule__ExpressionDeclaration__Group__4__Impl rule__ExpressionDeclaration__Group__5 ;
    public final void rule__ExpressionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2296:1: ( rule__ExpressionDeclaration__Group__4__Impl rule__ExpressionDeclaration__Group__5 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2297:2: rule__ExpressionDeclaration__Group__4__Impl rule__ExpressionDeclaration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__4__Impl_in_rule__ExpressionDeclaration__Group__44480);
            rule__ExpressionDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__5_in_rule__ExpressionDeclaration__Group__44483);
            rule__ExpressionDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__4"


    // $ANTLR start "rule__ExpressionDeclaration__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2304:1: rule__ExpressionDeclaration__Group__4__Impl : ( ( rule__ExpressionDeclaration__Group_4__0 )? ) ;
    public final void rule__ExpressionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2308:1: ( ( ( rule__ExpressionDeclaration__Group_4__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2309:1: ( ( rule__ExpressionDeclaration__Group_4__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2309:1: ( ( rule__ExpressionDeclaration__Group_4__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2310:1: ( rule__ExpressionDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getExpressionDeclarationAccess().getGroup_4()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2311:1: ( rule__ExpressionDeclaration__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2311:2: rule__ExpressionDeclaration__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__0_in_rule__ExpressionDeclaration__Group__4__Impl4510);
                    rule__ExpressionDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__5"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2321:1: rule__ExpressionDeclaration__Group__5 : rule__ExpressionDeclaration__Group__5__Impl ;
    public final void rule__ExpressionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2325:1: ( rule__ExpressionDeclaration__Group__5__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2326:2: rule__ExpressionDeclaration__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group__5__Impl_in_rule__ExpressionDeclaration__Group__54541);
            rule__ExpressionDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__5"


    // $ANTLR start "rule__ExpressionDeclaration__Group__5__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2332:1: rule__ExpressionDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__ExpressionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2336:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2337:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2337:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2338:1: '}'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__ExpressionDeclaration__Group__5__Impl4569); 
             after(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2363:1: rule__ExpressionDeclaration__Group_4__0 : rule__ExpressionDeclaration__Group_4__0__Impl rule__ExpressionDeclaration__Group_4__1 ;
    public final void rule__ExpressionDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2367:1: ( rule__ExpressionDeclaration__Group_4__0__Impl rule__ExpressionDeclaration__Group_4__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2368:2: rule__ExpressionDeclaration__Group_4__0__Impl rule__ExpressionDeclaration__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__0__Impl_in_rule__ExpressionDeclaration__Group_4__04612);
            rule__ExpressionDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__1_in_rule__ExpressionDeclaration__Group_4__04615);
            rule__ExpressionDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__0"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2375:1: rule__ExpressionDeclaration__Group_4__0__Impl : ( 'formalParameters' ) ;
    public final void rule__ExpressionDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2379:1: ( ( 'formalParameters' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2380:1: ( 'formalParameters' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2380:1: ( 'formalParameters' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2381:1: 'formalParameters'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ExpressionDeclaration__Group_4__0__Impl4643); 
             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2394:1: rule__ExpressionDeclaration__Group_4__1 : rule__ExpressionDeclaration__Group_4__1__Impl rule__ExpressionDeclaration__Group_4__2 ;
    public final void rule__ExpressionDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2398:1: ( rule__ExpressionDeclaration__Group_4__1__Impl rule__ExpressionDeclaration__Group_4__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2399:2: rule__ExpressionDeclaration__Group_4__1__Impl rule__ExpressionDeclaration__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__1__Impl_in_rule__ExpressionDeclaration__Group_4__14674);
            rule__ExpressionDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__2_in_rule__ExpressionDeclaration__Group_4__14677);
            rule__ExpressionDeclaration__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__1"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2406:1: rule__ExpressionDeclaration__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ExpressionDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2410:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2411:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2411:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2412:1: '{'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ExpressionDeclaration__Group_4__1__Impl4705); 
             after(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2425:1: rule__ExpressionDeclaration__Group_4__2 : rule__ExpressionDeclaration__Group_4__2__Impl rule__ExpressionDeclaration__Group_4__3 ;
    public final void rule__ExpressionDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2429:1: ( rule__ExpressionDeclaration__Group_4__2__Impl rule__ExpressionDeclaration__Group_4__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2430:2: rule__ExpressionDeclaration__Group_4__2__Impl rule__ExpressionDeclaration__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__2__Impl_in_rule__ExpressionDeclaration__Group_4__24736);
            rule__ExpressionDeclaration__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__3_in_rule__ExpressionDeclaration__Group_4__24739);
            rule__ExpressionDeclaration__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__2"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2437:1: rule__ExpressionDeclaration__Group_4__2__Impl : ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) ) ;
    public final void rule__ExpressionDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2441:1: ( ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2442:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2442:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2443:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2444:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2444:2: rule__ExpressionDeclaration__FormalParametersAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__FormalParametersAssignment_4_2_in_rule__ExpressionDeclaration__Group_4__2__Impl4766);
            rule__ExpressionDeclaration__FormalParametersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__2__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2454:1: rule__ExpressionDeclaration__Group_4__3 : rule__ExpressionDeclaration__Group_4__3__Impl rule__ExpressionDeclaration__Group_4__4 ;
    public final void rule__ExpressionDeclaration__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2458:1: ( rule__ExpressionDeclaration__Group_4__3__Impl rule__ExpressionDeclaration__Group_4__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2459:2: rule__ExpressionDeclaration__Group_4__3__Impl rule__ExpressionDeclaration__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__3__Impl_in_rule__ExpressionDeclaration__Group_4__34796);
            rule__ExpressionDeclaration__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__4_in_rule__ExpressionDeclaration__Group_4__34799);
            rule__ExpressionDeclaration__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__3"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2466:1: rule__ExpressionDeclaration__Group_4__3__Impl : ( ( rule__ExpressionDeclaration__Group_4_3__0 )* ) ;
    public final void rule__ExpressionDeclaration__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2470:1: ( ( ( rule__ExpressionDeclaration__Group_4_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2471:1: ( ( rule__ExpressionDeclaration__Group_4_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2471:1: ( ( rule__ExpressionDeclaration__Group_4_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2472:1: ( rule__ExpressionDeclaration__Group_4_3__0 )*
            {
             before(grammarAccess.getExpressionDeclarationAccess().getGroup_4_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2473:1: ( rule__ExpressionDeclaration__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2473:2: rule__ExpressionDeclaration__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4_3__0_in_rule__ExpressionDeclaration__Group_4__3__Impl4826);
            	    rule__ExpressionDeclaration__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExpressionDeclarationAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__3__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2483:1: rule__ExpressionDeclaration__Group_4__4 : rule__ExpressionDeclaration__Group_4__4__Impl ;
    public final void rule__ExpressionDeclaration__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2487:1: ( rule__ExpressionDeclaration__Group_4__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2488:2: rule__ExpressionDeclaration__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4__4__Impl_in_rule__ExpressionDeclaration__Group_4__44857);
            rule__ExpressionDeclaration__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__4"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2494:1: rule__ExpressionDeclaration__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ExpressionDeclaration__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2498:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2499:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2499:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2500:1: '}'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__ExpressionDeclaration__Group_4__4__Impl4885); 
             after(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__4__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2523:1: rule__ExpressionDeclaration__Group_4_3__0 : rule__ExpressionDeclaration__Group_4_3__0__Impl rule__ExpressionDeclaration__Group_4_3__1 ;
    public final void rule__ExpressionDeclaration__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2527:1: ( rule__ExpressionDeclaration__Group_4_3__0__Impl rule__ExpressionDeclaration__Group_4_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2528:2: rule__ExpressionDeclaration__Group_4_3__0__Impl rule__ExpressionDeclaration__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4_3__0__Impl_in_rule__ExpressionDeclaration__Group_4_3__04926);
            rule__ExpressionDeclaration__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4_3__1_in_rule__ExpressionDeclaration__Group_4_3__04929);
            rule__ExpressionDeclaration__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4_3__0"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2535:1: rule__ExpressionDeclaration__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ExpressionDeclaration__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2539:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2540:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2540:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2541:1: ','
            {
             before(grammarAccess.getExpressionDeclarationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__ExpressionDeclaration__Group_4_3__0__Impl4957); 
             after(grammarAccess.getExpressionDeclarationAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4_3__0__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2554:1: rule__ExpressionDeclaration__Group_4_3__1 : rule__ExpressionDeclaration__Group_4_3__1__Impl ;
    public final void rule__ExpressionDeclaration__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2558:1: ( rule__ExpressionDeclaration__Group_4_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2559:2: rule__ExpressionDeclaration__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__Group_4_3__1__Impl_in_rule__ExpressionDeclaration__Group_4_3__14988);
            rule__ExpressionDeclaration__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4_3__1"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2565:1: rule__ExpressionDeclaration__Group_4_3__1__Impl : ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) ) ;
    public final void rule__ExpressionDeclaration__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2569:1: ( ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2570:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2570:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2571:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2572:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2572:2: rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1_in_rule__ExpressionDeclaration__Group_4_3__1__Impl5015);
            rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4_3__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__NameAssignment_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2587:1: rule__BCoolLibrary__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BCoolLibrary__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2591:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2592:1: ( ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2592:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2593:1: ruleEString
            {
             before(grammarAccess.getBCoolLibraryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BCoolLibrary__NameAssignment_25054);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__NameAssignment_2"


    // $ANTLR start "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2602:1: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 : ( ruleExpressionDefinition ) ;
    public final void rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2606:1: ( ( ruleExpressionDefinition ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2607:1: ( ruleExpressionDefinition )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2607:1: ( ruleExpressionDefinition )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2608:1: ruleExpressionDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionDefinition_in_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_25085);
            ruleExpressionDefinition();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2"


    // $ANTLR start "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2617:1: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 : ( ruleExpressionDefinition ) ;
    public final void rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2621:1: ( ( ruleExpressionDefinition ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2622:1: ( ruleExpressionDefinition )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2622:1: ( ruleExpressionDefinition )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2623:1: ruleExpressionDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionDefinition_in_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_15116);
            ruleExpressionDefinition();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1"


    // $ANTLR start "rule__BCoolLibrary__RelationDefinitionsAssignment_5_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2632:1: rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 : ( ruleRelationDefinition ) ;
    public final void rule__BCoolLibrary__RelationDefinitionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2636:1: ( ( ruleRelationDefinition ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2637:1: ( ruleRelationDefinition )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2637:1: ( ruleRelationDefinition )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2638:1: ruleRelationDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationDefinition_in_rule__BCoolLibrary__RelationDefinitionsAssignment_5_25147);
            ruleRelationDefinition();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__RelationDefinitionsAssignment_5_2"


    // $ANTLR start "rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2647:1: rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 : ( ruleRelationDefinition ) ;
    public final void rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2651:1: ( ( ruleRelationDefinition ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2652:1: ( ruleRelationDefinition )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2652:1: ( ruleRelationDefinition )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2653:1: ruleRelationDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationDefinition_in_rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_15178);
            ruleRelationDefinition();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1"


    // $ANTLR start "rule__BCoolLibrary__RelationDeclarationsAssignment_6_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2662:1: rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 : ( ruleRelationDeclaration ) ;
    public final void rule__BCoolLibrary__RelationDeclarationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2666:1: ( ( ruleRelationDeclaration ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2667:1: ( ruleRelationDeclaration )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2667:1: ( ruleRelationDeclaration )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2668:1: ruleRelationDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationDeclaration_in_rule__BCoolLibrary__RelationDeclarationsAssignment_6_25209);
            ruleRelationDeclaration();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__RelationDeclarationsAssignment_6_2"


    // $ANTLR start "rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2677:1: rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 : ( ruleRelationDeclaration ) ;
    public final void rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2681:1: ( ( ruleRelationDeclaration ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2682:1: ( ruleRelationDeclaration )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2682:1: ( ruleRelationDeclaration )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2683:1: ruleRelationDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationDeclaration_in_rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_15240);
            ruleRelationDeclaration();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1"


    // $ANTLR start "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2692:1: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 : ( ruleExpressionDeclaration ) ;
    public final void rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2696:1: ( ( ruleExpressionDeclaration ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2697:1: ( ruleExpressionDeclaration )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2697:1: ( ruleExpressionDeclaration )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2698:1: ruleExpressionDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionDeclaration_in_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_25271);
            ruleExpressionDeclaration();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2"


    // $ANTLR start "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2707:1: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 : ( ruleExpressionDeclaration ) ;
    public final void rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2711:1: ( ( ruleExpressionDeclaration ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2712:1: ( ruleExpressionDeclaration )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2712:1: ( ruleExpressionDeclaration )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2713:1: ruleExpressionDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionDeclaration_in_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_15302);
            ruleExpressionDeclaration();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1"


    // $ANTLR start "rule__ExpressionDefinition__DefinitionAssignment_3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2722:1: rule__ExpressionDefinition__DefinitionAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExpressionDefinition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2726:1: ( ( ( ruleEString ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2727:1: ( ( ruleEString ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2727:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2728:1: ( ruleEString )
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationCrossReference_3_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2729:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2730:1: ruleEString
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExpressionDefinition__DefinitionAssignment_35337);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__DefinitionAssignment_3"


    // $ANTLR start "rule__RelationDefinition__DefinitionAssignment_3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2741:1: rule__RelationDefinition__DefinitionAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__RelationDefinition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2745:1: ( ( ( ruleEString ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2746:1: ( ( ruleEString ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2746:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2747:1: ( ruleEString )
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationCrossReference_3_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2748:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2749:1: ruleEString
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RelationDefinition__DefinitionAssignment_35376);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__DefinitionAssignment_3"


    // $ANTLR start "rule__RelationDeclaration__NameAssignment_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2760:1: rule__RelationDeclaration__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RelationDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2764:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2765:1: ( ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2765:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2766:1: ruleEString
            {
             before(grammarAccess.getRelationDeclarationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RelationDeclaration__NameAssignment_25411);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationDeclarationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__NameAssignment_2"


    // $ANTLR start "rule__RelationDeclaration__FormalParametersAssignment_4_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2775:1: rule__RelationDeclaration__FormalParametersAssignment_4_2 : ( ruleEString ) ;
    public final void rule__RelationDeclaration__FormalParametersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2779:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2780:1: ( ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2780:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2781:1: ruleEString
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RelationDeclaration__FormalParametersAssignment_4_25442);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__FormalParametersAssignment_4_2"


    // $ANTLR start "rule__RelationDeclaration__FormalParametersAssignment_4_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2790:1: rule__RelationDeclaration__FormalParametersAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__RelationDeclaration__FormalParametersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2794:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2795:1: ( ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2795:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2796:1: ruleEString
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RelationDeclaration__FormalParametersAssignment_4_3_15473);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEStringParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__FormalParametersAssignment_4_3_1"


    // $ANTLR start "rule__ExpressionDeclaration__NameAssignment_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2805:1: rule__ExpressionDeclaration__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ExpressionDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2809:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2810:1: ( ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2810:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2811:1: ruleEString
            {
             before(grammarAccess.getExpressionDeclarationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExpressionDeclaration__NameAssignment_25504);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionDeclarationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ExpressionDeclaration__FormalParametersAssignment_4_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2820:1: rule__ExpressionDeclaration__FormalParametersAssignment_4_2 : ( ruleEString ) ;
    public final void rule__ExpressionDeclaration__FormalParametersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2824:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2825:1: ( ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2825:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2826:1: ruleEString
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExpressionDeclaration__FormalParametersAssignment_4_25535);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__FormalParametersAssignment_4_2"


    // $ANTLR start "rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2835:1: rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2839:1: ( ( ruleEString ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2840:1: ( ruleEString )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2840:1: ( ruleEString )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2841:1: ruleEString
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExpressionDeclaration__FormalParametersAssignment_4_3_15566);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEStringParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBCoolLibrary_in_entryRuleBCoolLibrary61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBCoolLibrary68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__0_in_ruleBCoolLibrary94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionDefinition_in_entryRuleExpressionDefinition181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionDefinition188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__0_in_ruleExpressionDefinition214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationDefinition_in_entryRuleRelationDefinition241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationDefinition248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__0_in_ruleRelationDefinition274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationDeclaration_in_entryRuleRelationDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__0_in_ruleRelationDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionDeclaration_in_entryRuleExpressionDeclaration361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionDeclaration368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__0_in_ruleExpressionDeclaration394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__0__Impl_in_rule__BCoolLibrary__Group__0477 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__1_in_rule__BCoolLibrary__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__1__Impl_in_rule__BCoolLibrary__Group__1538 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__2_in_rule__BCoolLibrary__Group__1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__BCoolLibrary__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__2__Impl_in_rule__BCoolLibrary__Group__2600 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__3_in_rule__BCoolLibrary__Group__2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__NameAssignment_2_in_rule__BCoolLibrary__Group__2__Impl630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__3__Impl_in_rule__BCoolLibrary__Group__3660 = new BitSet(new long[]{0x0000000000076000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__4_in_rule__BCoolLibrary__Group__3663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group__3__Impl691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__4__Impl_in_rule__BCoolLibrary__Group__4722 = new BitSet(new long[]{0x0000000000076000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__5_in_rule__BCoolLibrary__Group__4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__0_in_rule__BCoolLibrary__Group__4__Impl752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__5__Impl_in_rule__BCoolLibrary__Group__5783 = new BitSet(new long[]{0x0000000000076000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__6_in_rule__BCoolLibrary__Group__5786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__0_in_rule__BCoolLibrary__Group__5__Impl813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__6__Impl_in_rule__BCoolLibrary__Group__6844 = new BitSet(new long[]{0x0000000000076000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__7_in_rule__BCoolLibrary__Group__6847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__0_in_rule__BCoolLibrary__Group__6__Impl874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__7__Impl_in_rule__BCoolLibrary__Group__7905 = new BitSet(new long[]{0x0000000000076000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__8_in_rule__BCoolLibrary__Group__7908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__0_in_rule__BCoolLibrary__Group__7__Impl935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group__8__Impl_in_rule__BCoolLibrary__Group__8966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group__8__Impl994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__0__Impl_in_rule__BCoolLibrary__Group_4__01043 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__1_in_rule__BCoolLibrary__Group_4__01046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__BCoolLibrary__Group_4__0__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__1__Impl_in_rule__BCoolLibrary__Group_4__11105 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__2_in_rule__BCoolLibrary__Group_4__11108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group_4__1__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__2__Impl_in_rule__BCoolLibrary__Group_4__21167 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__3_in_rule__BCoolLibrary__Group_4__21170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2_in_rule__BCoolLibrary__Group_4__2__Impl1197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__3__Impl_in_rule__BCoolLibrary__Group_4__31227 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__4_in_rule__BCoolLibrary__Group_4__31230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4_3__0_in_rule__BCoolLibrary__Group_4__3__Impl1257 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__4__Impl_in_rule__BCoolLibrary__Group_4__41288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group_4__4__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4_3__0__Impl_in_rule__BCoolLibrary__Group_4_3__01357 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4_3__1_in_rule__BCoolLibrary__Group_4_3__01360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BCoolLibrary__Group_4_3__0__Impl1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4_3__1__Impl_in_rule__BCoolLibrary__Group_4_3__11419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1_in_rule__BCoolLibrary__Group_4_3__1__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__0__Impl_in_rule__BCoolLibrary__Group_5__01480 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__1_in_rule__BCoolLibrary__Group_5__01483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__BCoolLibrary__Group_5__0__Impl1511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__1__Impl_in_rule__BCoolLibrary__Group_5__11542 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__2_in_rule__BCoolLibrary__Group_5__11545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group_5__1__Impl1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__2__Impl_in_rule__BCoolLibrary__Group_5__21604 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__3_in_rule__BCoolLibrary__Group_5__21607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__RelationDefinitionsAssignment_5_2_in_rule__BCoolLibrary__Group_5__2__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__3__Impl_in_rule__BCoolLibrary__Group_5__31664 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__4_in_rule__BCoolLibrary__Group_5__31667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5_3__0_in_rule__BCoolLibrary__Group_5__3__Impl1694 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__4__Impl_in_rule__BCoolLibrary__Group_5__41725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group_5__4__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5_3__0__Impl_in_rule__BCoolLibrary__Group_5_3__01794 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5_3__1_in_rule__BCoolLibrary__Group_5_3__01797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BCoolLibrary__Group_5_3__0__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5_3__1__Impl_in_rule__BCoolLibrary__Group_5_3__11856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1_in_rule__BCoolLibrary__Group_5_3__1__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__0__Impl_in_rule__BCoolLibrary__Group_6__01917 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__1_in_rule__BCoolLibrary__Group_6__01920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BCoolLibrary__Group_6__0__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__1__Impl_in_rule__BCoolLibrary__Group_6__11979 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__2_in_rule__BCoolLibrary__Group_6__11982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group_6__1__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__2__Impl_in_rule__BCoolLibrary__Group_6__22041 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__3_in_rule__BCoolLibrary__Group_6__22044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__RelationDeclarationsAssignment_6_2_in_rule__BCoolLibrary__Group_6__2__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__3__Impl_in_rule__BCoolLibrary__Group_6__32101 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__4_in_rule__BCoolLibrary__Group_6__32104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6_3__0_in_rule__BCoolLibrary__Group_6__3__Impl2131 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__4__Impl_in_rule__BCoolLibrary__Group_6__42162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group_6__4__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6_3__0__Impl_in_rule__BCoolLibrary__Group_6_3__02231 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6_3__1_in_rule__BCoolLibrary__Group_6_3__02234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BCoolLibrary__Group_6_3__0__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6_3__1__Impl_in_rule__BCoolLibrary__Group_6_3__12293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1_in_rule__BCoolLibrary__Group_6_3__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__0__Impl_in_rule__BCoolLibrary__Group_7__02354 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__1_in_rule__BCoolLibrary__Group_7__02357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BCoolLibrary__Group_7__0__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__1__Impl_in_rule__BCoolLibrary__Group_7__12416 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__2_in_rule__BCoolLibrary__Group_7__12419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group_7__1__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__2__Impl_in_rule__BCoolLibrary__Group_7__22478 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__3_in_rule__BCoolLibrary__Group_7__22481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2_in_rule__BCoolLibrary__Group_7__2__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__3__Impl_in_rule__BCoolLibrary__Group_7__32538 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__4_in_rule__BCoolLibrary__Group_7__32541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7_3__0_in_rule__BCoolLibrary__Group_7__3__Impl2568 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__4__Impl_in_rule__BCoolLibrary__Group_7__42599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group_7__4__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7_3__0__Impl_in_rule__BCoolLibrary__Group_7_3__02668 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7_3__1_in_rule__BCoolLibrary__Group_7_3__02671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BCoolLibrary__Group_7_3__0__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7_3__1__Impl_in_rule__BCoolLibrary__Group_7_3__12730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1_in_rule__BCoolLibrary__Group_7_3__1__Impl2757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__0__Impl_in_rule__ExpressionDefinition__Group__02791 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__1_in_rule__ExpressionDefinition__Group__02794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ExpressionDefinition__Group__0__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__1__Impl_in_rule__ExpressionDefinition__Group__12853 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__2_in_rule__ExpressionDefinition__Group__12856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ExpressionDefinition__Group__1__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__2__Impl_in_rule__ExpressionDefinition__Group__22915 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__3_in_rule__ExpressionDefinition__Group__22918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ExpressionDefinition__Group__2__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__3__Impl_in_rule__ExpressionDefinition__Group__32977 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__4_in_rule__ExpressionDefinition__Group__32980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__DefinitionAssignment_3_in_rule__ExpressionDefinition__Group__3__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__4__Impl_in_rule__ExpressionDefinition__Group__43037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ExpressionDefinition__Group__4__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__0__Impl_in_rule__RelationDefinition__Group__03106 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__1_in_rule__RelationDefinition__Group__03109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__RelationDefinition__Group__0__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__1__Impl_in_rule__RelationDefinition__Group__13168 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__2_in_rule__RelationDefinition__Group__13171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RelationDefinition__Group__1__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__2__Impl_in_rule__RelationDefinition__Group__23230 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__3_in_rule__RelationDefinition__Group__23233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__RelationDefinition__Group__2__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__3__Impl_in_rule__RelationDefinition__Group__33292 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__4_in_rule__RelationDefinition__Group__33295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDefinition__DefinitionAssignment_3_in_rule__RelationDefinition__Group__3__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDefinition__Group__4__Impl_in_rule__RelationDefinition__Group__43352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RelationDefinition__Group__4__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__0__Impl_in_rule__RelationDeclaration__Group__03421 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__1_in_rule__RelationDeclaration__Group__03424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__1__Impl_in_rule__RelationDeclaration__Group__13482 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__2_in_rule__RelationDeclaration__Group__13485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__RelationDeclaration__Group__1__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__2__Impl_in_rule__RelationDeclaration__Group__23544 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__3_in_rule__RelationDeclaration__Group__23547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__NameAssignment_2_in_rule__RelationDeclaration__Group__2__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__3__Impl_in_rule__RelationDeclaration__Group__33604 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__4_in_rule__RelationDeclaration__Group__33607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RelationDeclaration__Group__3__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__4__Impl_in_rule__RelationDeclaration__Group__43666 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__5_in_rule__RelationDeclaration__Group__43669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__0_in_rule__RelationDeclaration__Group__4__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group__5__Impl_in_rule__RelationDeclaration__Group__53727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RelationDeclaration__Group__5__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__0__Impl_in_rule__RelationDeclaration__Group_4__03798 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__1_in_rule__RelationDeclaration__Group_4__03801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__RelationDeclaration__Group_4__0__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__1__Impl_in_rule__RelationDeclaration__Group_4__13860 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__2_in_rule__RelationDeclaration__Group_4__13863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RelationDeclaration__Group_4__1__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__2__Impl_in_rule__RelationDeclaration__Group_4__23922 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__3_in_rule__RelationDeclaration__Group_4__23925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__FormalParametersAssignment_4_2_in_rule__RelationDeclaration__Group_4__2__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__3__Impl_in_rule__RelationDeclaration__Group_4__33982 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__4_in_rule__RelationDeclaration__Group_4__33985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4_3__0_in_rule__RelationDeclaration__Group_4__3__Impl4012 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__4__Impl_in_rule__RelationDeclaration__Group_4__44043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RelationDeclaration__Group_4__4__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4_3__0__Impl_in_rule__RelationDeclaration__Group_4_3__04112 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4_3__1_in_rule__RelationDeclaration__Group_4_3__04115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RelationDeclaration__Group_4_3__0__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4_3__1__Impl_in_rule__RelationDeclaration__Group_4_3__14174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationDeclaration__FormalParametersAssignment_4_3_1_in_rule__RelationDeclaration__Group_4_3__1__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__0__Impl_in_rule__ExpressionDeclaration__Group__04235 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__1_in_rule__ExpressionDeclaration__Group__04238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__1__Impl_in_rule__ExpressionDeclaration__Group__14296 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__2_in_rule__ExpressionDeclaration__Group__14299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ExpressionDeclaration__Group__1__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__2__Impl_in_rule__ExpressionDeclaration__Group__24358 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__3_in_rule__ExpressionDeclaration__Group__24361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__NameAssignment_2_in_rule__ExpressionDeclaration__Group__2__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__3__Impl_in_rule__ExpressionDeclaration__Group__34418 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__4_in_rule__ExpressionDeclaration__Group__34421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ExpressionDeclaration__Group__3__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__4__Impl_in_rule__ExpressionDeclaration__Group__44480 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__5_in_rule__ExpressionDeclaration__Group__44483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__0_in_rule__ExpressionDeclaration__Group__4__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__5__Impl_in_rule__ExpressionDeclaration__Group__54541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ExpressionDeclaration__Group__5__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__0__Impl_in_rule__ExpressionDeclaration__Group_4__04612 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__1_in_rule__ExpressionDeclaration__Group_4__04615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ExpressionDeclaration__Group_4__0__Impl4643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__1__Impl_in_rule__ExpressionDeclaration__Group_4__14674 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__2_in_rule__ExpressionDeclaration__Group_4__14677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ExpressionDeclaration__Group_4__1__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__2__Impl_in_rule__ExpressionDeclaration__Group_4__24736 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__3_in_rule__ExpressionDeclaration__Group_4__24739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__FormalParametersAssignment_4_2_in_rule__ExpressionDeclaration__Group_4__2__Impl4766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__3__Impl_in_rule__ExpressionDeclaration__Group_4__34796 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__4_in_rule__ExpressionDeclaration__Group_4__34799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4_3__0_in_rule__ExpressionDeclaration__Group_4__3__Impl4826 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__4__Impl_in_rule__ExpressionDeclaration__Group_4__44857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ExpressionDeclaration__Group_4__4__Impl4885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4_3__0__Impl_in_rule__ExpressionDeclaration__Group_4_3__04926 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4_3__1_in_rule__ExpressionDeclaration__Group_4_3__04929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ExpressionDeclaration__Group_4_3__0__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4_3__1__Impl_in_rule__ExpressionDeclaration__Group_4_3__14988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1_in_rule__ExpressionDeclaration__Group_4_3__1__Impl5015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BCoolLibrary__NameAssignment_25054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionDefinition_in_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_25085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionDefinition_in_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_15116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationDefinition_in_rule__BCoolLibrary__RelationDefinitionsAssignment_5_25147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationDefinition_in_rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_15178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationDeclaration_in_rule__BCoolLibrary__RelationDeclarationsAssignment_6_25209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationDeclaration_in_rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_15240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionDeclaration_in_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_25271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionDeclaration_in_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_15302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExpressionDefinition__DefinitionAssignment_35337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RelationDefinition__DefinitionAssignment_35376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RelationDeclaration__NameAssignment_25411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RelationDeclaration__FormalParametersAssignment_4_25442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RelationDeclaration__FormalParametersAssignment_4_3_15473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExpressionDeclaration__NameAssignment_25504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExpressionDeclaration__FormalParametersAssignment_4_25535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExpressionDeclaration__FormalParametersAssignment_4_3_15566 = new BitSet(new long[]{0x0000000000000002L});
    }


}