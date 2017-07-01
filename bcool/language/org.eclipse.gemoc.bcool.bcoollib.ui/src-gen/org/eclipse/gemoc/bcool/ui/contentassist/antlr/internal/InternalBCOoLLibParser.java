package org.eclipse.gemoc.bcool.ui.contentassist.antlr.internal; 

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
import org.eclipse.gemoc.bcool.services.BCOoLLibGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBCOoLLibParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BCoolLibrary'", "'{'", "'}'", "'expressionDefinitions'", "','", "'relationDefinitions'", "'relationDeclarations'", "'expressionDeclarations'", "'ExpressionDefinition'", "'definition'", "'RelationDefinition'", "'RelationDeclaration'", "'formalParameters'", "'ExpressionDeclaration'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBCOoLLibParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBCOoLLibParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBCOoLLibParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBCOoLLib.g"; }


     
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
    // InternalBCOoLLib.g:60:1: entryRuleBCoolLibrary : ruleBCoolLibrary EOF ;
    public final void entryRuleBCoolLibrary() throws RecognitionException {
        try {
            // InternalBCOoLLib.g:61:1: ( ruleBCoolLibrary EOF )
            // InternalBCOoLLib.g:62:1: ruleBCoolLibrary EOF
            {
             before(grammarAccess.getBCoolLibraryRule()); 
            pushFollow(FOLLOW_1);
            ruleBCoolLibrary();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBCOoLLib.g:69:1: ruleBCoolLibrary : ( ( rule__BCoolLibrary__Group__0 ) ) ;
    public final void ruleBCoolLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:73:2: ( ( ( rule__BCoolLibrary__Group__0 ) ) )
            // InternalBCOoLLib.g:74:1: ( ( rule__BCoolLibrary__Group__0 ) )
            {
            // InternalBCOoLLib.g:74:1: ( ( rule__BCoolLibrary__Group__0 ) )
            // InternalBCOoLLib.g:75:1: ( rule__BCoolLibrary__Group__0 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup()); 
            // InternalBCOoLLib.g:76:1: ( rule__BCoolLibrary__Group__0 )
            // InternalBCOoLLib.g:76:2: rule__BCoolLibrary__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleExpressionDefinition"
    // InternalBCOoLLib.g:88:1: entryRuleExpressionDefinition : ruleExpressionDefinition EOF ;
    public final void entryRuleExpressionDefinition() throws RecognitionException {
        try {
            // InternalBCOoLLib.g:89:1: ( ruleExpressionDefinition EOF )
            // InternalBCOoLLib.g:90:1: ruleExpressionDefinition EOF
            {
             before(grammarAccess.getExpressionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionDefinition();

            state._fsp--;

             after(grammarAccess.getExpressionDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBCOoLLib.g:97:1: ruleExpressionDefinition : ( ( rule__ExpressionDefinition__Group__0 ) ) ;
    public final void ruleExpressionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:101:2: ( ( ( rule__ExpressionDefinition__Group__0 ) ) )
            // InternalBCOoLLib.g:102:1: ( ( rule__ExpressionDefinition__Group__0 ) )
            {
            // InternalBCOoLLib.g:102:1: ( ( rule__ExpressionDefinition__Group__0 ) )
            // InternalBCOoLLib.g:103:1: ( rule__ExpressionDefinition__Group__0 )
            {
             before(grammarAccess.getExpressionDefinitionAccess().getGroup()); 
            // InternalBCOoLLib.g:104:1: ( rule__ExpressionDefinition__Group__0 )
            // InternalBCOoLLib.g:104:2: rule__ExpressionDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:116:1: entryRuleRelationDefinition : ruleRelationDefinition EOF ;
    public final void entryRuleRelationDefinition() throws RecognitionException {
        try {
            // InternalBCOoLLib.g:117:1: ( ruleRelationDefinition EOF )
            // InternalBCOoLLib.g:118:1: ruleRelationDefinition EOF
            {
             before(grammarAccess.getRelationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationDefinition();

            state._fsp--;

             after(grammarAccess.getRelationDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBCOoLLib.g:125:1: ruleRelationDefinition : ( ( rule__RelationDefinition__Group__0 ) ) ;
    public final void ruleRelationDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:129:2: ( ( ( rule__RelationDefinition__Group__0 ) ) )
            // InternalBCOoLLib.g:130:1: ( ( rule__RelationDefinition__Group__0 ) )
            {
            // InternalBCOoLLib.g:130:1: ( ( rule__RelationDefinition__Group__0 ) )
            // InternalBCOoLLib.g:131:1: ( rule__RelationDefinition__Group__0 )
            {
             before(grammarAccess.getRelationDefinitionAccess().getGroup()); 
            // InternalBCOoLLib.g:132:1: ( rule__RelationDefinition__Group__0 )
            // InternalBCOoLLib.g:132:2: rule__RelationDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:144:1: entryRuleRelationDeclaration : ruleRelationDeclaration EOF ;
    public final void entryRuleRelationDeclaration() throws RecognitionException {
        try {
            // InternalBCOoLLib.g:145:1: ( ruleRelationDeclaration EOF )
            // InternalBCOoLLib.g:146:1: ruleRelationDeclaration EOF
            {
             before(grammarAccess.getRelationDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationDeclaration();

            state._fsp--;

             after(grammarAccess.getRelationDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBCOoLLib.g:153:1: ruleRelationDeclaration : ( ( rule__RelationDeclaration__Group__0 ) ) ;
    public final void ruleRelationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:157:2: ( ( ( rule__RelationDeclaration__Group__0 ) ) )
            // InternalBCOoLLib.g:158:1: ( ( rule__RelationDeclaration__Group__0 ) )
            {
            // InternalBCOoLLib.g:158:1: ( ( rule__RelationDeclaration__Group__0 ) )
            // InternalBCOoLLib.g:159:1: ( rule__RelationDeclaration__Group__0 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getGroup()); 
            // InternalBCOoLLib.g:160:1: ( rule__RelationDeclaration__Group__0 )
            // InternalBCOoLLib.g:160:2: rule__RelationDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:172:1: entryRuleExpressionDeclaration : ruleExpressionDeclaration EOF ;
    public final void entryRuleExpressionDeclaration() throws RecognitionException {
        try {
            // InternalBCOoLLib.g:173:1: ( ruleExpressionDeclaration EOF )
            // InternalBCOoLLib.g:174:1: ruleExpressionDeclaration EOF
            {
             before(grammarAccess.getExpressionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionDeclaration();

            state._fsp--;

             after(grammarAccess.getExpressionDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBCOoLLib.g:181:1: ruleExpressionDeclaration : ( ( rule__ExpressionDeclaration__Group__0 ) ) ;
    public final void ruleExpressionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:185:2: ( ( ( rule__ExpressionDeclaration__Group__0 ) ) )
            // InternalBCOoLLib.g:186:1: ( ( rule__ExpressionDeclaration__Group__0 ) )
            {
            // InternalBCOoLLib.g:186:1: ( ( rule__ExpressionDeclaration__Group__0 ) )
            // InternalBCOoLLib.g:187:1: ( rule__ExpressionDeclaration__Group__0 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getGroup()); 
            // InternalBCOoLLib.g:188:1: ( rule__ExpressionDeclaration__Group__0 )
            // InternalBCOoLLib.g:188:2: rule__ExpressionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__BCoolLibrary__Group__0"
    // InternalBCOoLLib.g:202:1: rule__BCoolLibrary__Group__0 : rule__BCoolLibrary__Group__0__Impl rule__BCoolLibrary__Group__1 ;
    public final void rule__BCoolLibrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:206:1: ( rule__BCoolLibrary__Group__0__Impl rule__BCoolLibrary__Group__1 )
            // InternalBCOoLLib.g:207:2: rule__BCoolLibrary__Group__0__Impl rule__BCoolLibrary__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BCoolLibrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:214:1: rule__BCoolLibrary__Group__0__Impl : ( () ) ;
    public final void rule__BCoolLibrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:218:1: ( ( () ) )
            // InternalBCOoLLib.g:219:1: ( () )
            {
            // InternalBCOoLLib.g:219:1: ( () )
            // InternalBCOoLLib.g:220:1: ()
            {
             before(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryAction_0()); 
            // InternalBCOoLLib.g:221:1: ()
            // InternalBCOoLLib.g:223:1: 
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
    // InternalBCOoLLib.g:233:1: rule__BCoolLibrary__Group__1 : rule__BCoolLibrary__Group__1__Impl rule__BCoolLibrary__Group__2 ;
    public final void rule__BCoolLibrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:237:1: ( rule__BCoolLibrary__Group__1__Impl rule__BCoolLibrary__Group__2 )
            // InternalBCOoLLib.g:238:2: rule__BCoolLibrary__Group__1__Impl rule__BCoolLibrary__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BCoolLibrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:245:1: rule__BCoolLibrary__Group__1__Impl : ( 'BCoolLibrary' ) ;
    public final void rule__BCoolLibrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:249:1: ( ( 'BCoolLibrary' ) )
            // InternalBCOoLLib.g:250:1: ( 'BCoolLibrary' )
            {
            // InternalBCOoLLib.g:250:1: ( 'BCoolLibrary' )
            // InternalBCOoLLib.g:251:1: 'BCoolLibrary'
            {
             before(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalBCOoLLib.g:264:1: rule__BCoolLibrary__Group__2 : rule__BCoolLibrary__Group__2__Impl rule__BCoolLibrary__Group__3 ;
    public final void rule__BCoolLibrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:268:1: ( rule__BCoolLibrary__Group__2__Impl rule__BCoolLibrary__Group__3 )
            // InternalBCOoLLib.g:269:2: rule__BCoolLibrary__Group__2__Impl rule__BCoolLibrary__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BCoolLibrary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:276:1: rule__BCoolLibrary__Group__2__Impl : ( ( rule__BCoolLibrary__NameAssignment_2 ) ) ;
    public final void rule__BCoolLibrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:280:1: ( ( ( rule__BCoolLibrary__NameAssignment_2 ) ) )
            // InternalBCOoLLib.g:281:1: ( ( rule__BCoolLibrary__NameAssignment_2 ) )
            {
            // InternalBCOoLLib.g:281:1: ( ( rule__BCoolLibrary__NameAssignment_2 ) )
            // InternalBCOoLLib.g:282:1: ( rule__BCoolLibrary__NameAssignment_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getNameAssignment_2()); 
            // InternalBCOoLLib.g:283:1: ( rule__BCoolLibrary__NameAssignment_2 )
            // InternalBCOoLLib.g:283:2: rule__BCoolLibrary__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:293:1: rule__BCoolLibrary__Group__3 : rule__BCoolLibrary__Group__3__Impl rule__BCoolLibrary__Group__4 ;
    public final void rule__BCoolLibrary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:297:1: ( rule__BCoolLibrary__Group__3__Impl rule__BCoolLibrary__Group__4 )
            // InternalBCOoLLib.g:298:2: rule__BCoolLibrary__Group__3__Impl rule__BCoolLibrary__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__BCoolLibrary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:305:1: rule__BCoolLibrary__Group__3__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:309:1: ( ( '{' ) )
            // InternalBCOoLLib.g:310:1: ( '{' )
            {
            // InternalBCOoLLib.g:310:1: ( '{' )
            // InternalBCOoLLib.g:311:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:324:1: rule__BCoolLibrary__Group__4 : rule__BCoolLibrary__Group__4__Impl rule__BCoolLibrary__Group__5 ;
    public final void rule__BCoolLibrary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:328:1: ( rule__BCoolLibrary__Group__4__Impl rule__BCoolLibrary__Group__5 )
            // InternalBCOoLLib.g:329:2: rule__BCoolLibrary__Group__4__Impl rule__BCoolLibrary__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__BCoolLibrary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:336:1: rule__BCoolLibrary__Group__4__Impl : ( ( rule__BCoolLibrary__Group_4__0 )? ) ;
    public final void rule__BCoolLibrary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:340:1: ( ( ( rule__BCoolLibrary__Group_4__0 )? ) )
            // InternalBCOoLLib.g:341:1: ( ( rule__BCoolLibrary__Group_4__0 )? )
            {
            // InternalBCOoLLib.g:341:1: ( ( rule__BCoolLibrary__Group_4__0 )? )
            // InternalBCOoLLib.g:342:1: ( rule__BCoolLibrary__Group_4__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_4()); 
            // InternalBCOoLLib.g:343:1: ( rule__BCoolLibrary__Group_4__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBCOoLLib.g:343:2: rule__BCoolLibrary__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:353:1: rule__BCoolLibrary__Group__5 : rule__BCoolLibrary__Group__5__Impl rule__BCoolLibrary__Group__6 ;
    public final void rule__BCoolLibrary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:357:1: ( rule__BCoolLibrary__Group__5__Impl rule__BCoolLibrary__Group__6 )
            // InternalBCOoLLib.g:358:2: rule__BCoolLibrary__Group__5__Impl rule__BCoolLibrary__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__BCoolLibrary__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:365:1: rule__BCoolLibrary__Group__5__Impl : ( ( rule__BCoolLibrary__Group_5__0 )? ) ;
    public final void rule__BCoolLibrary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:369:1: ( ( ( rule__BCoolLibrary__Group_5__0 )? ) )
            // InternalBCOoLLib.g:370:1: ( ( rule__BCoolLibrary__Group_5__0 )? )
            {
            // InternalBCOoLLib.g:370:1: ( ( rule__BCoolLibrary__Group_5__0 )? )
            // InternalBCOoLLib.g:371:1: ( rule__BCoolLibrary__Group_5__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_5()); 
            // InternalBCOoLLib.g:372:1: ( rule__BCoolLibrary__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBCOoLLib.g:372:2: rule__BCoolLibrary__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:382:1: rule__BCoolLibrary__Group__6 : rule__BCoolLibrary__Group__6__Impl rule__BCoolLibrary__Group__7 ;
    public final void rule__BCoolLibrary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:386:1: ( rule__BCoolLibrary__Group__6__Impl rule__BCoolLibrary__Group__7 )
            // InternalBCOoLLib.g:387:2: rule__BCoolLibrary__Group__6__Impl rule__BCoolLibrary__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__BCoolLibrary__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:394:1: rule__BCoolLibrary__Group__6__Impl : ( ( rule__BCoolLibrary__Group_6__0 )? ) ;
    public final void rule__BCoolLibrary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:398:1: ( ( ( rule__BCoolLibrary__Group_6__0 )? ) )
            // InternalBCOoLLib.g:399:1: ( ( rule__BCoolLibrary__Group_6__0 )? )
            {
            // InternalBCOoLLib.g:399:1: ( ( rule__BCoolLibrary__Group_6__0 )? )
            // InternalBCOoLLib.g:400:1: ( rule__BCoolLibrary__Group_6__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_6()); 
            // InternalBCOoLLib.g:401:1: ( rule__BCoolLibrary__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBCOoLLib.g:401:2: rule__BCoolLibrary__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:411:1: rule__BCoolLibrary__Group__7 : rule__BCoolLibrary__Group__7__Impl rule__BCoolLibrary__Group__8 ;
    public final void rule__BCoolLibrary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:415:1: ( rule__BCoolLibrary__Group__7__Impl rule__BCoolLibrary__Group__8 )
            // InternalBCOoLLib.g:416:2: rule__BCoolLibrary__Group__7__Impl rule__BCoolLibrary__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__BCoolLibrary__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:423:1: rule__BCoolLibrary__Group__7__Impl : ( ( rule__BCoolLibrary__Group_7__0 )? ) ;
    public final void rule__BCoolLibrary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:427:1: ( ( ( rule__BCoolLibrary__Group_7__0 )? ) )
            // InternalBCOoLLib.g:428:1: ( ( rule__BCoolLibrary__Group_7__0 )? )
            {
            // InternalBCOoLLib.g:428:1: ( ( rule__BCoolLibrary__Group_7__0 )? )
            // InternalBCOoLLib.g:429:1: ( rule__BCoolLibrary__Group_7__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_7()); 
            // InternalBCOoLLib.g:430:1: ( rule__BCoolLibrary__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBCOoLLib.g:430:2: rule__BCoolLibrary__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:440:1: rule__BCoolLibrary__Group__8 : rule__BCoolLibrary__Group__8__Impl ;
    public final void rule__BCoolLibrary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:444:1: ( rule__BCoolLibrary__Group__8__Impl )
            // InternalBCOoLLib.g:445:2: rule__BCoolLibrary__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:451:1: rule__BCoolLibrary__Group__8__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:455:1: ( ( '}' ) )
            // InternalBCOoLLib.g:456:1: ( '}' )
            {
            // InternalBCOoLLib.g:456:1: ( '}' )
            // InternalBCOoLLib.g:457:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:488:1: rule__BCoolLibrary__Group_4__0 : rule__BCoolLibrary__Group_4__0__Impl rule__BCoolLibrary__Group_4__1 ;
    public final void rule__BCoolLibrary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:492:1: ( rule__BCoolLibrary__Group_4__0__Impl rule__BCoolLibrary__Group_4__1 )
            // InternalBCOoLLib.g:493:2: rule__BCoolLibrary__Group_4__0__Impl rule__BCoolLibrary__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__BCoolLibrary__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:500:1: rule__BCoolLibrary__Group_4__0__Impl : ( 'expressionDefinitions' ) ;
    public final void rule__BCoolLibrary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:504:1: ( ( 'expressionDefinitions' ) )
            // InternalBCOoLLib.g:505:1: ( 'expressionDefinitions' )
            {
            // InternalBCOoLLib.g:505:1: ( 'expressionDefinitions' )
            // InternalBCOoLLib.g:506:1: 'expressionDefinitions'
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBCOoLLib.g:519:1: rule__BCoolLibrary__Group_4__1 : rule__BCoolLibrary__Group_4__1__Impl rule__BCoolLibrary__Group_4__2 ;
    public final void rule__BCoolLibrary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:523:1: ( rule__BCoolLibrary__Group_4__1__Impl rule__BCoolLibrary__Group_4__2 )
            // InternalBCOoLLib.g:524:2: rule__BCoolLibrary__Group_4__1__Impl rule__BCoolLibrary__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__BCoolLibrary__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:531:1: rule__BCoolLibrary__Group_4__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:535:1: ( ( '{' ) )
            // InternalBCOoLLib.g:536:1: ( '{' )
            {
            // InternalBCOoLLib.g:536:1: ( '{' )
            // InternalBCOoLLib.g:537:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:550:1: rule__BCoolLibrary__Group_4__2 : rule__BCoolLibrary__Group_4__2__Impl rule__BCoolLibrary__Group_4__3 ;
    public final void rule__BCoolLibrary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:554:1: ( rule__BCoolLibrary__Group_4__2__Impl rule__BCoolLibrary__Group_4__3 )
            // InternalBCOoLLib.g:555:2: rule__BCoolLibrary__Group_4__2__Impl rule__BCoolLibrary__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__BCoolLibrary__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:562:1: rule__BCoolLibrary__Group_4__2__Impl : ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) ) ;
    public final void rule__BCoolLibrary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:566:1: ( ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) ) )
            // InternalBCOoLLib.g:567:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) )
            {
            // InternalBCOoLLib.g:567:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) )
            // InternalBCOoLLib.g:568:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_2()); 
            // InternalBCOoLLib.g:569:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 )
            // InternalBCOoLLib.g:569:2: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:579:1: rule__BCoolLibrary__Group_4__3 : rule__BCoolLibrary__Group_4__3__Impl rule__BCoolLibrary__Group_4__4 ;
    public final void rule__BCoolLibrary__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:583:1: ( rule__BCoolLibrary__Group_4__3__Impl rule__BCoolLibrary__Group_4__4 )
            // InternalBCOoLLib.g:584:2: rule__BCoolLibrary__Group_4__3__Impl rule__BCoolLibrary__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__BCoolLibrary__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:591:1: rule__BCoolLibrary__Group_4__3__Impl : ( ( rule__BCoolLibrary__Group_4_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:595:1: ( ( ( rule__BCoolLibrary__Group_4_3__0 )* ) )
            // InternalBCOoLLib.g:596:1: ( ( rule__BCoolLibrary__Group_4_3__0 )* )
            {
            // InternalBCOoLLib.g:596:1: ( ( rule__BCoolLibrary__Group_4_3__0 )* )
            // InternalBCOoLLib.g:597:1: ( rule__BCoolLibrary__Group_4_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_4_3()); 
            // InternalBCOoLLib.g:598:1: ( rule__BCoolLibrary__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBCOoLLib.g:598:2: rule__BCoolLibrary__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BCoolLibrary__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalBCOoLLib.g:608:1: rule__BCoolLibrary__Group_4__4 : rule__BCoolLibrary__Group_4__4__Impl ;
    public final void rule__BCoolLibrary__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:612:1: ( rule__BCoolLibrary__Group_4__4__Impl )
            // InternalBCOoLLib.g:613:2: rule__BCoolLibrary__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:619:1: rule__BCoolLibrary__Group_4__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:623:1: ( ( '}' ) )
            // InternalBCOoLLib.g:624:1: ( '}' )
            {
            // InternalBCOoLLib.g:624:1: ( '}' )
            // InternalBCOoLLib.g:625:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:648:1: rule__BCoolLibrary__Group_4_3__0 : rule__BCoolLibrary__Group_4_3__0__Impl rule__BCoolLibrary__Group_4_3__1 ;
    public final void rule__BCoolLibrary__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:652:1: ( rule__BCoolLibrary__Group_4_3__0__Impl rule__BCoolLibrary__Group_4_3__1 )
            // InternalBCOoLLib.g:653:2: rule__BCoolLibrary__Group_4_3__0__Impl rule__BCoolLibrary__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__BCoolLibrary__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:660:1: rule__BCoolLibrary__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:664:1: ( ( ',' ) )
            // InternalBCOoLLib.g:665:1: ( ',' )
            {
            // InternalBCOoLLib.g:665:1: ( ',' )
            // InternalBCOoLLib.g:666:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBCOoLLib.g:679:1: rule__BCoolLibrary__Group_4_3__1 : rule__BCoolLibrary__Group_4_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:683:1: ( rule__BCoolLibrary__Group_4_3__1__Impl )
            // InternalBCOoLLib.g:684:2: rule__BCoolLibrary__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:690:1: rule__BCoolLibrary__Group_4_3__1__Impl : ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:694:1: ( ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) ) )
            // InternalBCOoLLib.g:695:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) )
            {
            // InternalBCOoLLib.g:695:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) )
            // InternalBCOoLLib.g:696:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_3_1()); 
            // InternalBCOoLLib.g:697:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 )
            // InternalBCOoLLib.g:697:2: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:711:1: rule__BCoolLibrary__Group_5__0 : rule__BCoolLibrary__Group_5__0__Impl rule__BCoolLibrary__Group_5__1 ;
    public final void rule__BCoolLibrary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:715:1: ( rule__BCoolLibrary__Group_5__0__Impl rule__BCoolLibrary__Group_5__1 )
            // InternalBCOoLLib.g:716:2: rule__BCoolLibrary__Group_5__0__Impl rule__BCoolLibrary__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__BCoolLibrary__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:723:1: rule__BCoolLibrary__Group_5__0__Impl : ( 'relationDefinitions' ) ;
    public final void rule__BCoolLibrary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:727:1: ( ( 'relationDefinitions' ) )
            // InternalBCOoLLib.g:728:1: ( 'relationDefinitions' )
            {
            // InternalBCOoLLib.g:728:1: ( 'relationDefinitions' )
            // InternalBCOoLLib.g:729:1: 'relationDefinitions'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBCOoLLib.g:742:1: rule__BCoolLibrary__Group_5__1 : rule__BCoolLibrary__Group_5__1__Impl rule__BCoolLibrary__Group_5__2 ;
    public final void rule__BCoolLibrary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:746:1: ( rule__BCoolLibrary__Group_5__1__Impl rule__BCoolLibrary__Group_5__2 )
            // InternalBCOoLLib.g:747:2: rule__BCoolLibrary__Group_5__1__Impl rule__BCoolLibrary__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__BCoolLibrary__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:754:1: rule__BCoolLibrary__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:758:1: ( ( '{' ) )
            // InternalBCOoLLib.g:759:1: ( '{' )
            {
            // InternalBCOoLLib.g:759:1: ( '{' )
            // InternalBCOoLLib.g:760:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:773:1: rule__BCoolLibrary__Group_5__2 : rule__BCoolLibrary__Group_5__2__Impl rule__BCoolLibrary__Group_5__3 ;
    public final void rule__BCoolLibrary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:777:1: ( rule__BCoolLibrary__Group_5__2__Impl rule__BCoolLibrary__Group_5__3 )
            // InternalBCOoLLib.g:778:2: rule__BCoolLibrary__Group_5__2__Impl rule__BCoolLibrary__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__BCoolLibrary__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:785:1: rule__BCoolLibrary__Group_5__2__Impl : ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) ) ;
    public final void rule__BCoolLibrary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:789:1: ( ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) ) )
            // InternalBCOoLLib.g:790:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) )
            {
            // InternalBCOoLLib.g:790:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) )
            // InternalBCOoLLib.g:791:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_2()); 
            // InternalBCOoLLib.g:792:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 )
            // InternalBCOoLLib.g:792:2: rule__BCoolLibrary__RelationDefinitionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:802:1: rule__BCoolLibrary__Group_5__3 : rule__BCoolLibrary__Group_5__3__Impl rule__BCoolLibrary__Group_5__4 ;
    public final void rule__BCoolLibrary__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:806:1: ( rule__BCoolLibrary__Group_5__3__Impl rule__BCoolLibrary__Group_5__4 )
            // InternalBCOoLLib.g:807:2: rule__BCoolLibrary__Group_5__3__Impl rule__BCoolLibrary__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__BCoolLibrary__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:814:1: rule__BCoolLibrary__Group_5__3__Impl : ( ( rule__BCoolLibrary__Group_5_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:818:1: ( ( ( rule__BCoolLibrary__Group_5_3__0 )* ) )
            // InternalBCOoLLib.g:819:1: ( ( rule__BCoolLibrary__Group_5_3__0 )* )
            {
            // InternalBCOoLLib.g:819:1: ( ( rule__BCoolLibrary__Group_5_3__0 )* )
            // InternalBCOoLLib.g:820:1: ( rule__BCoolLibrary__Group_5_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_5_3()); 
            // InternalBCOoLLib.g:821:1: ( rule__BCoolLibrary__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBCOoLLib.g:821:2: rule__BCoolLibrary__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BCoolLibrary__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalBCOoLLib.g:831:1: rule__BCoolLibrary__Group_5__4 : rule__BCoolLibrary__Group_5__4__Impl ;
    public final void rule__BCoolLibrary__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:835:1: ( rule__BCoolLibrary__Group_5__4__Impl )
            // InternalBCOoLLib.g:836:2: rule__BCoolLibrary__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:842:1: rule__BCoolLibrary__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:846:1: ( ( '}' ) )
            // InternalBCOoLLib.g:847:1: ( '}' )
            {
            // InternalBCOoLLib.g:847:1: ( '}' )
            // InternalBCOoLLib.g:848:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:871:1: rule__BCoolLibrary__Group_5_3__0 : rule__BCoolLibrary__Group_5_3__0__Impl rule__BCoolLibrary__Group_5_3__1 ;
    public final void rule__BCoolLibrary__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:875:1: ( rule__BCoolLibrary__Group_5_3__0__Impl rule__BCoolLibrary__Group_5_3__1 )
            // InternalBCOoLLib.g:876:2: rule__BCoolLibrary__Group_5_3__0__Impl rule__BCoolLibrary__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__BCoolLibrary__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:883:1: rule__BCoolLibrary__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:887:1: ( ( ',' ) )
            // InternalBCOoLLib.g:888:1: ( ',' )
            {
            // InternalBCOoLLib.g:888:1: ( ',' )
            // InternalBCOoLLib.g:889:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBCOoLLib.g:902:1: rule__BCoolLibrary__Group_5_3__1 : rule__BCoolLibrary__Group_5_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:906:1: ( rule__BCoolLibrary__Group_5_3__1__Impl )
            // InternalBCOoLLib.g:907:2: rule__BCoolLibrary__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:913:1: rule__BCoolLibrary__Group_5_3__1__Impl : ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:917:1: ( ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) ) )
            // InternalBCOoLLib.g:918:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) )
            {
            // InternalBCOoLLib.g:918:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) )
            // InternalBCOoLLib.g:919:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_3_1()); 
            // InternalBCOoLLib.g:920:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 )
            // InternalBCOoLLib.g:920:2: rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:934:1: rule__BCoolLibrary__Group_6__0 : rule__BCoolLibrary__Group_6__0__Impl rule__BCoolLibrary__Group_6__1 ;
    public final void rule__BCoolLibrary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:938:1: ( rule__BCoolLibrary__Group_6__0__Impl rule__BCoolLibrary__Group_6__1 )
            // InternalBCOoLLib.g:939:2: rule__BCoolLibrary__Group_6__0__Impl rule__BCoolLibrary__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__BCoolLibrary__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:946:1: rule__BCoolLibrary__Group_6__0__Impl : ( 'relationDeclarations' ) ;
    public final void rule__BCoolLibrary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:950:1: ( ( 'relationDeclarations' ) )
            // InternalBCOoLLib.g:951:1: ( 'relationDeclarations' )
            {
            // InternalBCOoLLib.g:951:1: ( 'relationDeclarations' )
            // InternalBCOoLLib.g:952:1: 'relationDeclarations'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBCOoLLib.g:965:1: rule__BCoolLibrary__Group_6__1 : rule__BCoolLibrary__Group_6__1__Impl rule__BCoolLibrary__Group_6__2 ;
    public final void rule__BCoolLibrary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:969:1: ( rule__BCoolLibrary__Group_6__1__Impl rule__BCoolLibrary__Group_6__2 )
            // InternalBCOoLLib.g:970:2: rule__BCoolLibrary__Group_6__1__Impl rule__BCoolLibrary__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__BCoolLibrary__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:977:1: rule__BCoolLibrary__Group_6__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:981:1: ( ( '{' ) )
            // InternalBCOoLLib.g:982:1: ( '{' )
            {
            // InternalBCOoLLib.g:982:1: ( '{' )
            // InternalBCOoLLib.g:983:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:996:1: rule__BCoolLibrary__Group_6__2 : rule__BCoolLibrary__Group_6__2__Impl rule__BCoolLibrary__Group_6__3 ;
    public final void rule__BCoolLibrary__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1000:1: ( rule__BCoolLibrary__Group_6__2__Impl rule__BCoolLibrary__Group_6__3 )
            // InternalBCOoLLib.g:1001:2: rule__BCoolLibrary__Group_6__2__Impl rule__BCoolLibrary__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__BCoolLibrary__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1008:1: rule__BCoolLibrary__Group_6__2__Impl : ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) ) ;
    public final void rule__BCoolLibrary__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1012:1: ( ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) ) )
            // InternalBCOoLLib.g:1013:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) )
            {
            // InternalBCOoLLib.g:1013:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) )
            // InternalBCOoLLib.g:1014:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_2()); 
            // InternalBCOoLLib.g:1015:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 )
            // InternalBCOoLLib.g:1015:2: rule__BCoolLibrary__RelationDeclarationsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1025:1: rule__BCoolLibrary__Group_6__3 : rule__BCoolLibrary__Group_6__3__Impl rule__BCoolLibrary__Group_6__4 ;
    public final void rule__BCoolLibrary__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1029:1: ( rule__BCoolLibrary__Group_6__3__Impl rule__BCoolLibrary__Group_6__4 )
            // InternalBCOoLLib.g:1030:2: rule__BCoolLibrary__Group_6__3__Impl rule__BCoolLibrary__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__BCoolLibrary__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1037:1: rule__BCoolLibrary__Group_6__3__Impl : ( ( rule__BCoolLibrary__Group_6_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1041:1: ( ( ( rule__BCoolLibrary__Group_6_3__0 )* ) )
            // InternalBCOoLLib.g:1042:1: ( ( rule__BCoolLibrary__Group_6_3__0 )* )
            {
            // InternalBCOoLLib.g:1042:1: ( ( rule__BCoolLibrary__Group_6_3__0 )* )
            // InternalBCOoLLib.g:1043:1: ( rule__BCoolLibrary__Group_6_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_6_3()); 
            // InternalBCOoLLib.g:1044:1: ( rule__BCoolLibrary__Group_6_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBCOoLLib.g:1044:2: rule__BCoolLibrary__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BCoolLibrary__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalBCOoLLib.g:1054:1: rule__BCoolLibrary__Group_6__4 : rule__BCoolLibrary__Group_6__4__Impl ;
    public final void rule__BCoolLibrary__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1058:1: ( rule__BCoolLibrary__Group_6__4__Impl )
            // InternalBCOoLLib.g:1059:2: rule__BCoolLibrary__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1065:1: rule__BCoolLibrary__Group_6__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1069:1: ( ( '}' ) )
            // InternalBCOoLLib.g:1070:1: ( '}' )
            {
            // InternalBCOoLLib.g:1070:1: ( '}' )
            // InternalBCOoLLib.g:1071:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1094:1: rule__BCoolLibrary__Group_6_3__0 : rule__BCoolLibrary__Group_6_3__0__Impl rule__BCoolLibrary__Group_6_3__1 ;
    public final void rule__BCoolLibrary__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1098:1: ( rule__BCoolLibrary__Group_6_3__0__Impl rule__BCoolLibrary__Group_6_3__1 )
            // InternalBCOoLLib.g:1099:2: rule__BCoolLibrary__Group_6_3__0__Impl rule__BCoolLibrary__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__BCoolLibrary__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1106:1: rule__BCoolLibrary__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1110:1: ( ( ',' ) )
            // InternalBCOoLLib.g:1111:1: ( ',' )
            {
            // InternalBCOoLLib.g:1111:1: ( ',' )
            // InternalBCOoLLib.g:1112:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1125:1: rule__BCoolLibrary__Group_6_3__1 : rule__BCoolLibrary__Group_6_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1129:1: ( rule__BCoolLibrary__Group_6_3__1__Impl )
            // InternalBCOoLLib.g:1130:2: rule__BCoolLibrary__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1136:1: rule__BCoolLibrary__Group_6_3__1__Impl : ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1140:1: ( ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) ) )
            // InternalBCOoLLib.g:1141:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) )
            {
            // InternalBCOoLLib.g:1141:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) )
            // InternalBCOoLLib.g:1142:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_3_1()); 
            // InternalBCOoLLib.g:1143:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 )
            // InternalBCOoLLib.g:1143:2: rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1157:1: rule__BCoolLibrary__Group_7__0 : rule__BCoolLibrary__Group_7__0__Impl rule__BCoolLibrary__Group_7__1 ;
    public final void rule__BCoolLibrary__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1161:1: ( rule__BCoolLibrary__Group_7__0__Impl rule__BCoolLibrary__Group_7__1 )
            // InternalBCOoLLib.g:1162:2: rule__BCoolLibrary__Group_7__0__Impl rule__BCoolLibrary__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__BCoolLibrary__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1169:1: rule__BCoolLibrary__Group_7__0__Impl : ( 'expressionDeclarations' ) ;
    public final void rule__BCoolLibrary__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1173:1: ( ( 'expressionDeclarations' ) )
            // InternalBCOoLLib.g:1174:1: ( 'expressionDeclarations' )
            {
            // InternalBCOoLLib.g:1174:1: ( 'expressionDeclarations' )
            // InternalBCOoLLib.g:1175:1: 'expressionDeclarations'
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1188:1: rule__BCoolLibrary__Group_7__1 : rule__BCoolLibrary__Group_7__1__Impl rule__BCoolLibrary__Group_7__2 ;
    public final void rule__BCoolLibrary__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1192:1: ( rule__BCoolLibrary__Group_7__1__Impl rule__BCoolLibrary__Group_7__2 )
            // InternalBCOoLLib.g:1193:2: rule__BCoolLibrary__Group_7__1__Impl rule__BCoolLibrary__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__BCoolLibrary__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1200:1: rule__BCoolLibrary__Group_7__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1204:1: ( ( '{' ) )
            // InternalBCOoLLib.g:1205:1: ( '{' )
            {
            // InternalBCOoLLib.g:1205:1: ( '{' )
            // InternalBCOoLLib.g:1206:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1219:1: rule__BCoolLibrary__Group_7__2 : rule__BCoolLibrary__Group_7__2__Impl rule__BCoolLibrary__Group_7__3 ;
    public final void rule__BCoolLibrary__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1223:1: ( rule__BCoolLibrary__Group_7__2__Impl rule__BCoolLibrary__Group_7__3 )
            // InternalBCOoLLib.g:1224:2: rule__BCoolLibrary__Group_7__2__Impl rule__BCoolLibrary__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__BCoolLibrary__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1231:1: rule__BCoolLibrary__Group_7__2__Impl : ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) ) ;
    public final void rule__BCoolLibrary__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1235:1: ( ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) ) )
            // InternalBCOoLLib.g:1236:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) )
            {
            // InternalBCOoLLib.g:1236:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) )
            // InternalBCOoLLib.g:1237:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_2()); 
            // InternalBCOoLLib.g:1238:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 )
            // InternalBCOoLLib.g:1238:2: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1248:1: rule__BCoolLibrary__Group_7__3 : rule__BCoolLibrary__Group_7__3__Impl rule__BCoolLibrary__Group_7__4 ;
    public final void rule__BCoolLibrary__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1252:1: ( rule__BCoolLibrary__Group_7__3__Impl rule__BCoolLibrary__Group_7__4 )
            // InternalBCOoLLib.g:1253:2: rule__BCoolLibrary__Group_7__3__Impl rule__BCoolLibrary__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__BCoolLibrary__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1260:1: rule__BCoolLibrary__Group_7__3__Impl : ( ( rule__BCoolLibrary__Group_7_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1264:1: ( ( ( rule__BCoolLibrary__Group_7_3__0 )* ) )
            // InternalBCOoLLib.g:1265:1: ( ( rule__BCoolLibrary__Group_7_3__0 )* )
            {
            // InternalBCOoLLib.g:1265:1: ( ( rule__BCoolLibrary__Group_7_3__0 )* )
            // InternalBCOoLLib.g:1266:1: ( rule__BCoolLibrary__Group_7_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_7_3()); 
            // InternalBCOoLLib.g:1267:1: ( rule__BCoolLibrary__Group_7_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBCOoLLib.g:1267:2: rule__BCoolLibrary__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BCoolLibrary__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalBCOoLLib.g:1277:1: rule__BCoolLibrary__Group_7__4 : rule__BCoolLibrary__Group_7__4__Impl ;
    public final void rule__BCoolLibrary__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1281:1: ( rule__BCoolLibrary__Group_7__4__Impl )
            // InternalBCOoLLib.g:1282:2: rule__BCoolLibrary__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1288:1: rule__BCoolLibrary__Group_7__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1292:1: ( ( '}' ) )
            // InternalBCOoLLib.g:1293:1: ( '}' )
            {
            // InternalBCOoLLib.g:1293:1: ( '}' )
            // InternalBCOoLLib.g:1294:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1317:1: rule__BCoolLibrary__Group_7_3__0 : rule__BCoolLibrary__Group_7_3__0__Impl rule__BCoolLibrary__Group_7_3__1 ;
    public final void rule__BCoolLibrary__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1321:1: ( rule__BCoolLibrary__Group_7_3__0__Impl rule__BCoolLibrary__Group_7_3__1 )
            // InternalBCOoLLib.g:1322:2: rule__BCoolLibrary__Group_7_3__0__Impl rule__BCoolLibrary__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__BCoolLibrary__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1329:1: rule__BCoolLibrary__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1333:1: ( ( ',' ) )
            // InternalBCOoLLib.g:1334:1: ( ',' )
            {
            // InternalBCOoLLib.g:1334:1: ( ',' )
            // InternalBCOoLLib.g:1335:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1348:1: rule__BCoolLibrary__Group_7_3__1 : rule__BCoolLibrary__Group_7_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1352:1: ( rule__BCoolLibrary__Group_7_3__1__Impl )
            // InternalBCOoLLib.g:1353:2: rule__BCoolLibrary__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1359:1: rule__BCoolLibrary__Group_7_3__1__Impl : ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1363:1: ( ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) ) )
            // InternalBCOoLLib.g:1364:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) )
            {
            // InternalBCOoLLib.g:1364:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) )
            // InternalBCOoLLib.g:1365:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_3_1()); 
            // InternalBCOoLLib.g:1366:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 )
            // InternalBCOoLLib.g:1366:2: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1380:1: rule__ExpressionDefinition__Group__0 : rule__ExpressionDefinition__Group__0__Impl rule__ExpressionDefinition__Group__1 ;
    public final void rule__ExpressionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1384:1: ( rule__ExpressionDefinition__Group__0__Impl rule__ExpressionDefinition__Group__1 )
            // InternalBCOoLLib.g:1385:2: rule__ExpressionDefinition__Group__0__Impl rule__ExpressionDefinition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1392:1: rule__ExpressionDefinition__Group__0__Impl : ( 'ExpressionDefinition' ) ;
    public final void rule__ExpressionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1396:1: ( ( 'ExpressionDefinition' ) )
            // InternalBCOoLLib.g:1397:1: ( 'ExpressionDefinition' )
            {
            // InternalBCOoLLib.g:1397:1: ( 'ExpressionDefinition' )
            // InternalBCOoLLib.g:1398:1: 'ExpressionDefinition'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getExpressionDefinitionKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1411:1: rule__ExpressionDefinition__Group__1 : rule__ExpressionDefinition__Group__1__Impl rule__ExpressionDefinition__Group__2 ;
    public final void rule__ExpressionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1415:1: ( rule__ExpressionDefinition__Group__1__Impl rule__ExpressionDefinition__Group__2 )
            // InternalBCOoLLib.g:1416:2: rule__ExpressionDefinition__Group__1__Impl rule__ExpressionDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ExpressionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1423:1: rule__ExpressionDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ExpressionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1427:1: ( ( '{' ) )
            // InternalBCOoLLib.g:1428:1: ( '{' )
            {
            // InternalBCOoLLib.g:1428:1: ( '{' )
            // InternalBCOoLLib.g:1429:1: '{'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1442:1: rule__ExpressionDefinition__Group__2 : rule__ExpressionDefinition__Group__2__Impl rule__ExpressionDefinition__Group__3 ;
    public final void rule__ExpressionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1446:1: ( rule__ExpressionDefinition__Group__2__Impl rule__ExpressionDefinition__Group__3 )
            // InternalBCOoLLib.g:1447:2: rule__ExpressionDefinition__Group__2__Impl rule__ExpressionDefinition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ExpressionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1454:1: rule__ExpressionDefinition__Group__2__Impl : ( 'definition' ) ;
    public final void rule__ExpressionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1458:1: ( ( 'definition' ) )
            // InternalBCOoLLib.g:1459:1: ( 'definition' )
            {
            // InternalBCOoLLib.g:1459:1: ( 'definition' )
            // InternalBCOoLLib.g:1460:1: 'definition'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1473:1: rule__ExpressionDefinition__Group__3 : rule__ExpressionDefinition__Group__3__Impl rule__ExpressionDefinition__Group__4 ;
    public final void rule__ExpressionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1477:1: ( rule__ExpressionDefinition__Group__3__Impl rule__ExpressionDefinition__Group__4 )
            // InternalBCOoLLib.g:1478:2: rule__ExpressionDefinition__Group__3__Impl rule__ExpressionDefinition__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1485:1: rule__ExpressionDefinition__Group__3__Impl : ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) ) ;
    public final void rule__ExpressionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1489:1: ( ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) ) )
            // InternalBCOoLLib.g:1490:1: ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) )
            {
            // InternalBCOoLLib.g:1490:1: ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) )
            // InternalBCOoLLib.g:1491:1: ( rule__ExpressionDefinition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionAssignment_3()); 
            // InternalBCOoLLib.g:1492:1: ( rule__ExpressionDefinition__DefinitionAssignment_3 )
            // InternalBCOoLLib.g:1492:2: rule__ExpressionDefinition__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1502:1: rule__ExpressionDefinition__Group__4 : rule__ExpressionDefinition__Group__4__Impl ;
    public final void rule__ExpressionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1506:1: ( rule__ExpressionDefinition__Group__4__Impl )
            // InternalBCOoLLib.g:1507:2: rule__ExpressionDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1513:1: rule__ExpressionDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__ExpressionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1517:1: ( ( '}' ) )
            // InternalBCOoLLib.g:1518:1: ( '}' )
            {
            // InternalBCOoLLib.g:1518:1: ( '}' )
            // InternalBCOoLLib.g:1519:1: '}'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1542:1: rule__RelationDefinition__Group__0 : rule__RelationDefinition__Group__0__Impl rule__RelationDefinition__Group__1 ;
    public final void rule__RelationDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1546:1: ( rule__RelationDefinition__Group__0__Impl rule__RelationDefinition__Group__1 )
            // InternalBCOoLLib.g:1547:2: rule__RelationDefinition__Group__0__Impl rule__RelationDefinition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RelationDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1554:1: rule__RelationDefinition__Group__0__Impl : ( 'RelationDefinition' ) ;
    public final void rule__RelationDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1558:1: ( ( 'RelationDefinition' ) )
            // InternalBCOoLLib.g:1559:1: ( 'RelationDefinition' )
            {
            // InternalBCOoLLib.g:1559:1: ( 'RelationDefinition' )
            // InternalBCOoLLib.g:1560:1: 'RelationDefinition'
            {
             before(grammarAccess.getRelationDefinitionAccess().getRelationDefinitionKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1573:1: rule__RelationDefinition__Group__1 : rule__RelationDefinition__Group__1__Impl rule__RelationDefinition__Group__2 ;
    public final void rule__RelationDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1577:1: ( rule__RelationDefinition__Group__1__Impl rule__RelationDefinition__Group__2 )
            // InternalBCOoLLib.g:1578:2: rule__RelationDefinition__Group__1__Impl rule__RelationDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RelationDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1585:1: rule__RelationDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__RelationDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1589:1: ( ( '{' ) )
            // InternalBCOoLLib.g:1590:1: ( '{' )
            {
            // InternalBCOoLLib.g:1590:1: ( '{' )
            // InternalBCOoLLib.g:1591:1: '{'
            {
             before(grammarAccess.getRelationDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1604:1: rule__RelationDefinition__Group__2 : rule__RelationDefinition__Group__2__Impl rule__RelationDefinition__Group__3 ;
    public final void rule__RelationDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1608:1: ( rule__RelationDefinition__Group__2__Impl rule__RelationDefinition__Group__3 )
            // InternalBCOoLLib.g:1609:2: rule__RelationDefinition__Group__2__Impl rule__RelationDefinition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RelationDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1616:1: rule__RelationDefinition__Group__2__Impl : ( 'definition' ) ;
    public final void rule__RelationDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1620:1: ( ( 'definition' ) )
            // InternalBCOoLLib.g:1621:1: ( 'definition' )
            {
            // InternalBCOoLLib.g:1621:1: ( 'definition' )
            // InternalBCOoLLib.g:1622:1: 'definition'
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1635:1: rule__RelationDefinition__Group__3 : rule__RelationDefinition__Group__3__Impl rule__RelationDefinition__Group__4 ;
    public final void rule__RelationDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1639:1: ( rule__RelationDefinition__Group__3__Impl rule__RelationDefinition__Group__4 )
            // InternalBCOoLLib.g:1640:2: rule__RelationDefinition__Group__3__Impl rule__RelationDefinition__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__RelationDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1647:1: rule__RelationDefinition__Group__3__Impl : ( ( rule__RelationDefinition__DefinitionAssignment_3 ) ) ;
    public final void rule__RelationDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1651:1: ( ( ( rule__RelationDefinition__DefinitionAssignment_3 ) ) )
            // InternalBCOoLLib.g:1652:1: ( ( rule__RelationDefinition__DefinitionAssignment_3 ) )
            {
            // InternalBCOoLLib.g:1652:1: ( ( rule__RelationDefinition__DefinitionAssignment_3 ) )
            // InternalBCOoLLib.g:1653:1: ( rule__RelationDefinition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionAssignment_3()); 
            // InternalBCOoLLib.g:1654:1: ( rule__RelationDefinition__DefinitionAssignment_3 )
            // InternalBCOoLLib.g:1654:2: rule__RelationDefinition__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1664:1: rule__RelationDefinition__Group__4 : rule__RelationDefinition__Group__4__Impl ;
    public final void rule__RelationDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1668:1: ( rule__RelationDefinition__Group__4__Impl )
            // InternalBCOoLLib.g:1669:2: rule__RelationDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1675:1: rule__RelationDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__RelationDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1679:1: ( ( '}' ) )
            // InternalBCOoLLib.g:1680:1: ( '}' )
            {
            // InternalBCOoLLib.g:1680:1: ( '}' )
            // InternalBCOoLLib.g:1681:1: '}'
            {
             before(grammarAccess.getRelationDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1704:1: rule__RelationDeclaration__Group__0 : rule__RelationDeclaration__Group__0__Impl rule__RelationDeclaration__Group__1 ;
    public final void rule__RelationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1708:1: ( rule__RelationDeclaration__Group__0__Impl rule__RelationDeclaration__Group__1 )
            // InternalBCOoLLib.g:1709:2: rule__RelationDeclaration__Group__0__Impl rule__RelationDeclaration__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RelationDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1716:1: rule__RelationDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__RelationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1720:1: ( ( () ) )
            // InternalBCOoLLib.g:1721:1: ( () )
            {
            // InternalBCOoLLib.g:1721:1: ( () )
            // InternalBCOoLLib.g:1722:1: ()
            {
             before(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationAction_0()); 
            // InternalBCOoLLib.g:1723:1: ()
            // InternalBCOoLLib.g:1725:1: 
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
    // InternalBCOoLLib.g:1735:1: rule__RelationDeclaration__Group__1 : rule__RelationDeclaration__Group__1__Impl rule__RelationDeclaration__Group__2 ;
    public final void rule__RelationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1739:1: ( rule__RelationDeclaration__Group__1__Impl rule__RelationDeclaration__Group__2 )
            // InternalBCOoLLib.g:1740:2: rule__RelationDeclaration__Group__1__Impl rule__RelationDeclaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RelationDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1747:1: rule__RelationDeclaration__Group__1__Impl : ( 'RelationDeclaration' ) ;
    public final void rule__RelationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1751:1: ( ( 'RelationDeclaration' ) )
            // InternalBCOoLLib.g:1752:1: ( 'RelationDeclaration' )
            {
            // InternalBCOoLLib.g:1752:1: ( 'RelationDeclaration' )
            // InternalBCOoLLib.g:1753:1: 'RelationDeclaration'
            {
             before(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1766:1: rule__RelationDeclaration__Group__2 : rule__RelationDeclaration__Group__2__Impl rule__RelationDeclaration__Group__3 ;
    public final void rule__RelationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1770:1: ( rule__RelationDeclaration__Group__2__Impl rule__RelationDeclaration__Group__3 )
            // InternalBCOoLLib.g:1771:2: rule__RelationDeclaration__Group__2__Impl rule__RelationDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RelationDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1778:1: rule__RelationDeclaration__Group__2__Impl : ( ( rule__RelationDeclaration__NameAssignment_2 ) ) ;
    public final void rule__RelationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1782:1: ( ( ( rule__RelationDeclaration__NameAssignment_2 ) ) )
            // InternalBCOoLLib.g:1783:1: ( ( rule__RelationDeclaration__NameAssignment_2 ) )
            {
            // InternalBCOoLLib.g:1783:1: ( ( rule__RelationDeclaration__NameAssignment_2 ) )
            // InternalBCOoLLib.g:1784:1: ( rule__RelationDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getNameAssignment_2()); 
            // InternalBCOoLLib.g:1785:1: ( rule__RelationDeclaration__NameAssignment_2 )
            // InternalBCOoLLib.g:1785:2: rule__RelationDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1795:1: rule__RelationDeclaration__Group__3 : rule__RelationDeclaration__Group__3__Impl rule__RelationDeclaration__Group__4 ;
    public final void rule__RelationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1799:1: ( rule__RelationDeclaration__Group__3__Impl rule__RelationDeclaration__Group__4 )
            // InternalBCOoLLib.g:1800:2: rule__RelationDeclaration__Group__3__Impl rule__RelationDeclaration__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__RelationDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1807:1: rule__RelationDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__RelationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1811:1: ( ( '{' ) )
            // InternalBCOoLLib.g:1812:1: ( '{' )
            {
            // InternalBCOoLLib.g:1812:1: ( '{' )
            // InternalBCOoLLib.g:1813:1: '{'
            {
             before(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1826:1: rule__RelationDeclaration__Group__4 : rule__RelationDeclaration__Group__4__Impl rule__RelationDeclaration__Group__5 ;
    public final void rule__RelationDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1830:1: ( rule__RelationDeclaration__Group__4__Impl rule__RelationDeclaration__Group__5 )
            // InternalBCOoLLib.g:1831:2: rule__RelationDeclaration__Group__4__Impl rule__RelationDeclaration__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__RelationDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1838:1: rule__RelationDeclaration__Group__4__Impl : ( ( rule__RelationDeclaration__Group_4__0 )? ) ;
    public final void rule__RelationDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1842:1: ( ( ( rule__RelationDeclaration__Group_4__0 )? ) )
            // InternalBCOoLLib.g:1843:1: ( ( rule__RelationDeclaration__Group_4__0 )? )
            {
            // InternalBCOoLLib.g:1843:1: ( ( rule__RelationDeclaration__Group_4__0 )? )
            // InternalBCOoLLib.g:1844:1: ( rule__RelationDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getRelationDeclarationAccess().getGroup_4()); 
            // InternalBCOoLLib.g:1845:1: ( rule__RelationDeclaration__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBCOoLLib.g:1845:2: rule__RelationDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1855:1: rule__RelationDeclaration__Group__5 : rule__RelationDeclaration__Group__5__Impl ;
    public final void rule__RelationDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1859:1: ( rule__RelationDeclaration__Group__5__Impl )
            // InternalBCOoLLib.g:1860:2: rule__RelationDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1866:1: rule__RelationDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__RelationDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1870:1: ( ( '}' ) )
            // InternalBCOoLLib.g:1871:1: ( '}' )
            {
            // InternalBCOoLLib.g:1871:1: ( '}' )
            // InternalBCOoLLib.g:1872:1: '}'
            {
             before(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1897:1: rule__RelationDeclaration__Group_4__0 : rule__RelationDeclaration__Group_4__0__Impl rule__RelationDeclaration__Group_4__1 ;
    public final void rule__RelationDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1901:1: ( rule__RelationDeclaration__Group_4__0__Impl rule__RelationDeclaration__Group_4__1 )
            // InternalBCOoLLib.g:1902:2: rule__RelationDeclaration__Group_4__0__Impl rule__RelationDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RelationDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1909:1: rule__RelationDeclaration__Group_4__0__Impl : ( 'formalParameters' ) ;
    public final void rule__RelationDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1913:1: ( ( 'formalParameters' ) )
            // InternalBCOoLLib.g:1914:1: ( 'formalParameters' )
            {
            // InternalBCOoLLib.g:1914:1: ( 'formalParameters' )
            // InternalBCOoLLib.g:1915:1: 'formalParameters'
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1928:1: rule__RelationDeclaration__Group_4__1 : rule__RelationDeclaration__Group_4__1__Impl rule__RelationDeclaration__Group_4__2 ;
    public final void rule__RelationDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1932:1: ( rule__RelationDeclaration__Group_4__1__Impl rule__RelationDeclaration__Group_4__2 )
            // InternalBCOoLLib.g:1933:2: rule__RelationDeclaration__Group_4__1__Impl rule__RelationDeclaration__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__RelationDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1940:1: rule__RelationDeclaration__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RelationDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1944:1: ( ( '{' ) )
            // InternalBCOoLLib.g:1945:1: ( '{' )
            {
            // InternalBCOoLLib.g:1945:1: ( '{' )
            // InternalBCOoLLib.g:1946:1: '{'
            {
             before(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:1959:1: rule__RelationDeclaration__Group_4__2 : rule__RelationDeclaration__Group_4__2__Impl rule__RelationDeclaration__Group_4__3 ;
    public final void rule__RelationDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1963:1: ( rule__RelationDeclaration__Group_4__2__Impl rule__RelationDeclaration__Group_4__3 )
            // InternalBCOoLLib.g:1964:2: rule__RelationDeclaration__Group_4__2__Impl rule__RelationDeclaration__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__RelationDeclaration__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1971:1: rule__RelationDeclaration__Group_4__2__Impl : ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) ) ;
    public final void rule__RelationDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1975:1: ( ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) ) )
            // InternalBCOoLLib.g:1976:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) )
            {
            // InternalBCOoLLib.g:1976:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) )
            // InternalBCOoLLib.g:1977:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_2 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_2()); 
            // InternalBCOoLLib.g:1978:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_2 )
            // InternalBCOoLLib.g:1978:2: rule__RelationDeclaration__FormalParametersAssignment_4_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:1988:1: rule__RelationDeclaration__Group_4__3 : rule__RelationDeclaration__Group_4__3__Impl rule__RelationDeclaration__Group_4__4 ;
    public final void rule__RelationDeclaration__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:1992:1: ( rule__RelationDeclaration__Group_4__3__Impl rule__RelationDeclaration__Group_4__4 )
            // InternalBCOoLLib.g:1993:2: rule__RelationDeclaration__Group_4__3__Impl rule__RelationDeclaration__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__RelationDeclaration__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2000:1: rule__RelationDeclaration__Group_4__3__Impl : ( ( rule__RelationDeclaration__Group_4_3__0 )* ) ;
    public final void rule__RelationDeclaration__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2004:1: ( ( ( rule__RelationDeclaration__Group_4_3__0 )* ) )
            // InternalBCOoLLib.g:2005:1: ( ( rule__RelationDeclaration__Group_4_3__0 )* )
            {
            // InternalBCOoLLib.g:2005:1: ( ( rule__RelationDeclaration__Group_4_3__0 )* )
            // InternalBCOoLLib.g:2006:1: ( rule__RelationDeclaration__Group_4_3__0 )*
            {
             before(grammarAccess.getRelationDeclarationAccess().getGroup_4_3()); 
            // InternalBCOoLLib.g:2007:1: ( rule__RelationDeclaration__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBCOoLLib.g:2007:2: rule__RelationDeclaration__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RelationDeclaration__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalBCOoLLib.g:2017:1: rule__RelationDeclaration__Group_4__4 : rule__RelationDeclaration__Group_4__4__Impl ;
    public final void rule__RelationDeclaration__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2021:1: ( rule__RelationDeclaration__Group_4__4__Impl )
            // InternalBCOoLLib.g:2022:2: rule__RelationDeclaration__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2028:1: rule__RelationDeclaration__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RelationDeclaration__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2032:1: ( ( '}' ) )
            // InternalBCOoLLib.g:2033:1: ( '}' )
            {
            // InternalBCOoLLib.g:2033:1: ( '}' )
            // InternalBCOoLLib.g:2034:1: '}'
            {
             before(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:2057:1: rule__RelationDeclaration__Group_4_3__0 : rule__RelationDeclaration__Group_4_3__0__Impl rule__RelationDeclaration__Group_4_3__1 ;
    public final void rule__RelationDeclaration__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2061:1: ( rule__RelationDeclaration__Group_4_3__0__Impl rule__RelationDeclaration__Group_4_3__1 )
            // InternalBCOoLLib.g:2062:2: rule__RelationDeclaration__Group_4_3__0__Impl rule__RelationDeclaration__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__RelationDeclaration__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2069:1: rule__RelationDeclaration__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RelationDeclaration__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2073:1: ( ( ',' ) )
            // InternalBCOoLLib.g:2074:1: ( ',' )
            {
            // InternalBCOoLLib.g:2074:1: ( ',' )
            // InternalBCOoLLib.g:2075:1: ','
            {
             before(grammarAccess.getRelationDeclarationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBCOoLLib.g:2088:1: rule__RelationDeclaration__Group_4_3__1 : rule__RelationDeclaration__Group_4_3__1__Impl ;
    public final void rule__RelationDeclaration__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2092:1: ( rule__RelationDeclaration__Group_4_3__1__Impl )
            // InternalBCOoLLib.g:2093:2: rule__RelationDeclaration__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2099:1: rule__RelationDeclaration__Group_4_3__1__Impl : ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) ) ;
    public final void rule__RelationDeclaration__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2103:1: ( ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) ) )
            // InternalBCOoLLib.g:2104:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) )
            {
            // InternalBCOoLLib.g:2104:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) )
            // InternalBCOoLLib.g:2105:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_3_1()); 
            // InternalBCOoLLib.g:2106:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 )
            // InternalBCOoLLib.g:2106:2: rule__RelationDeclaration__FormalParametersAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2120:1: rule__ExpressionDeclaration__Group__0 : rule__ExpressionDeclaration__Group__0__Impl rule__ExpressionDeclaration__Group__1 ;
    public final void rule__ExpressionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2124:1: ( rule__ExpressionDeclaration__Group__0__Impl rule__ExpressionDeclaration__Group__1 )
            // InternalBCOoLLib.g:2125:2: rule__ExpressionDeclaration__Group__0__Impl rule__ExpressionDeclaration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ExpressionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2132:1: rule__ExpressionDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ExpressionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2136:1: ( ( () ) )
            // InternalBCOoLLib.g:2137:1: ( () )
            {
            // InternalBCOoLLib.g:2137:1: ( () )
            // InternalBCOoLLib.g:2138:1: ()
            {
             before(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationAction_0()); 
            // InternalBCOoLLib.g:2139:1: ()
            // InternalBCOoLLib.g:2141:1: 
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
    // InternalBCOoLLib.g:2151:1: rule__ExpressionDeclaration__Group__1 : rule__ExpressionDeclaration__Group__1__Impl rule__ExpressionDeclaration__Group__2 ;
    public final void rule__ExpressionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2155:1: ( rule__ExpressionDeclaration__Group__1__Impl rule__ExpressionDeclaration__Group__2 )
            // InternalBCOoLLib.g:2156:2: rule__ExpressionDeclaration__Group__1__Impl rule__ExpressionDeclaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExpressionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2163:1: rule__ExpressionDeclaration__Group__1__Impl : ( 'ExpressionDeclaration' ) ;
    public final void rule__ExpressionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2167:1: ( ( 'ExpressionDeclaration' ) )
            // InternalBCOoLLib.g:2168:1: ( 'ExpressionDeclaration' )
            {
            // InternalBCOoLLib.g:2168:1: ( 'ExpressionDeclaration' )
            // InternalBCOoLLib.g:2169:1: 'ExpressionDeclaration'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBCOoLLib.g:2182:1: rule__ExpressionDeclaration__Group__2 : rule__ExpressionDeclaration__Group__2__Impl rule__ExpressionDeclaration__Group__3 ;
    public final void rule__ExpressionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2186:1: ( rule__ExpressionDeclaration__Group__2__Impl rule__ExpressionDeclaration__Group__3 )
            // InternalBCOoLLib.g:2187:2: rule__ExpressionDeclaration__Group__2__Impl rule__ExpressionDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2194:1: rule__ExpressionDeclaration__Group__2__Impl : ( ( rule__ExpressionDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ExpressionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2198:1: ( ( ( rule__ExpressionDeclaration__NameAssignment_2 ) ) )
            // InternalBCOoLLib.g:2199:1: ( ( rule__ExpressionDeclaration__NameAssignment_2 ) )
            {
            // InternalBCOoLLib.g:2199:1: ( ( rule__ExpressionDeclaration__NameAssignment_2 ) )
            // InternalBCOoLLib.g:2200:1: ( rule__ExpressionDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getNameAssignment_2()); 
            // InternalBCOoLLib.g:2201:1: ( rule__ExpressionDeclaration__NameAssignment_2 )
            // InternalBCOoLLib.g:2201:2: rule__ExpressionDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2211:1: rule__ExpressionDeclaration__Group__3 : rule__ExpressionDeclaration__Group__3__Impl rule__ExpressionDeclaration__Group__4 ;
    public final void rule__ExpressionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2215:1: ( rule__ExpressionDeclaration__Group__3__Impl rule__ExpressionDeclaration__Group__4 )
            // InternalBCOoLLib.g:2216:2: rule__ExpressionDeclaration__Group__3__Impl rule__ExpressionDeclaration__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ExpressionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2223:1: rule__ExpressionDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ExpressionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2227:1: ( ( '{' ) )
            // InternalBCOoLLib.g:2228:1: ( '{' )
            {
            // InternalBCOoLLib.g:2228:1: ( '{' )
            // InternalBCOoLLib.g:2229:1: '{'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:2242:1: rule__ExpressionDeclaration__Group__4 : rule__ExpressionDeclaration__Group__4__Impl rule__ExpressionDeclaration__Group__5 ;
    public final void rule__ExpressionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2246:1: ( rule__ExpressionDeclaration__Group__4__Impl rule__ExpressionDeclaration__Group__5 )
            // InternalBCOoLLib.g:2247:2: rule__ExpressionDeclaration__Group__4__Impl rule__ExpressionDeclaration__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ExpressionDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2254:1: rule__ExpressionDeclaration__Group__4__Impl : ( ( rule__ExpressionDeclaration__Group_4__0 )? ) ;
    public final void rule__ExpressionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2258:1: ( ( ( rule__ExpressionDeclaration__Group_4__0 )? ) )
            // InternalBCOoLLib.g:2259:1: ( ( rule__ExpressionDeclaration__Group_4__0 )? )
            {
            // InternalBCOoLLib.g:2259:1: ( ( rule__ExpressionDeclaration__Group_4__0 )? )
            // InternalBCOoLLib.g:2260:1: ( rule__ExpressionDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getExpressionDeclarationAccess().getGroup_4()); 
            // InternalBCOoLLib.g:2261:1: ( rule__ExpressionDeclaration__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBCOoLLib.g:2261:2: rule__ExpressionDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2271:1: rule__ExpressionDeclaration__Group__5 : rule__ExpressionDeclaration__Group__5__Impl ;
    public final void rule__ExpressionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2275:1: ( rule__ExpressionDeclaration__Group__5__Impl )
            // InternalBCOoLLib.g:2276:2: rule__ExpressionDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2282:1: rule__ExpressionDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__ExpressionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2286:1: ( ( '}' ) )
            // InternalBCOoLLib.g:2287:1: ( '}' )
            {
            // InternalBCOoLLib.g:2287:1: ( '}' )
            // InternalBCOoLLib.g:2288:1: '}'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:2313:1: rule__ExpressionDeclaration__Group_4__0 : rule__ExpressionDeclaration__Group_4__0__Impl rule__ExpressionDeclaration__Group_4__1 ;
    public final void rule__ExpressionDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2317:1: ( rule__ExpressionDeclaration__Group_4__0__Impl rule__ExpressionDeclaration__Group_4__1 )
            // InternalBCOoLLib.g:2318:2: rule__ExpressionDeclaration__Group_4__0__Impl rule__ExpressionDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2325:1: rule__ExpressionDeclaration__Group_4__0__Impl : ( 'formalParameters' ) ;
    public final void rule__ExpressionDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2329:1: ( ( 'formalParameters' ) )
            // InternalBCOoLLib.g:2330:1: ( 'formalParameters' )
            {
            // InternalBCOoLLib.g:2330:1: ( 'formalParameters' )
            // InternalBCOoLLib.g:2331:1: 'formalParameters'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBCOoLLib.g:2344:1: rule__ExpressionDeclaration__Group_4__1 : rule__ExpressionDeclaration__Group_4__1__Impl rule__ExpressionDeclaration__Group_4__2 ;
    public final void rule__ExpressionDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2348:1: ( rule__ExpressionDeclaration__Group_4__1__Impl rule__ExpressionDeclaration__Group_4__2 )
            // InternalBCOoLLib.g:2349:2: rule__ExpressionDeclaration__Group_4__1__Impl rule__ExpressionDeclaration__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__ExpressionDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2356:1: rule__ExpressionDeclaration__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ExpressionDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2360:1: ( ( '{' ) )
            // InternalBCOoLLib.g:2361:1: ( '{' )
            {
            // InternalBCOoLLib.g:2361:1: ( '{' )
            // InternalBCOoLLib.g:2362:1: '{'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBCOoLLib.g:2375:1: rule__ExpressionDeclaration__Group_4__2 : rule__ExpressionDeclaration__Group_4__2__Impl rule__ExpressionDeclaration__Group_4__3 ;
    public final void rule__ExpressionDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2379:1: ( rule__ExpressionDeclaration__Group_4__2__Impl rule__ExpressionDeclaration__Group_4__3 )
            // InternalBCOoLLib.g:2380:2: rule__ExpressionDeclaration__Group_4__2__Impl rule__ExpressionDeclaration__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionDeclaration__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2387:1: rule__ExpressionDeclaration__Group_4__2__Impl : ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) ) ;
    public final void rule__ExpressionDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2391:1: ( ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) ) )
            // InternalBCOoLLib.g:2392:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) )
            {
            // InternalBCOoLLib.g:2392:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) )
            // InternalBCOoLLib.g:2393:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_2()); 
            // InternalBCOoLLib.g:2394:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 )
            // InternalBCOoLLib.g:2394:2: rule__ExpressionDeclaration__FormalParametersAssignment_4_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2404:1: rule__ExpressionDeclaration__Group_4__3 : rule__ExpressionDeclaration__Group_4__3__Impl rule__ExpressionDeclaration__Group_4__4 ;
    public final void rule__ExpressionDeclaration__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2408:1: ( rule__ExpressionDeclaration__Group_4__3__Impl rule__ExpressionDeclaration__Group_4__4 )
            // InternalBCOoLLib.g:2409:2: rule__ExpressionDeclaration__Group_4__3__Impl rule__ExpressionDeclaration__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionDeclaration__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2416:1: rule__ExpressionDeclaration__Group_4__3__Impl : ( ( rule__ExpressionDeclaration__Group_4_3__0 )* ) ;
    public final void rule__ExpressionDeclaration__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2420:1: ( ( ( rule__ExpressionDeclaration__Group_4_3__0 )* ) )
            // InternalBCOoLLib.g:2421:1: ( ( rule__ExpressionDeclaration__Group_4_3__0 )* )
            {
            // InternalBCOoLLib.g:2421:1: ( ( rule__ExpressionDeclaration__Group_4_3__0 )* )
            // InternalBCOoLLib.g:2422:1: ( rule__ExpressionDeclaration__Group_4_3__0 )*
            {
             before(grammarAccess.getExpressionDeclarationAccess().getGroup_4_3()); 
            // InternalBCOoLLib.g:2423:1: ( rule__ExpressionDeclaration__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBCOoLLib.g:2423:2: rule__ExpressionDeclaration__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ExpressionDeclaration__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalBCOoLLib.g:2433:1: rule__ExpressionDeclaration__Group_4__4 : rule__ExpressionDeclaration__Group_4__4__Impl ;
    public final void rule__ExpressionDeclaration__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2437:1: ( rule__ExpressionDeclaration__Group_4__4__Impl )
            // InternalBCOoLLib.g:2438:2: rule__ExpressionDeclaration__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2444:1: rule__ExpressionDeclaration__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ExpressionDeclaration__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2448:1: ( ( '}' ) )
            // InternalBCOoLLib.g:2449:1: ( '}' )
            {
            // InternalBCOoLLib.g:2449:1: ( '}' )
            // InternalBCOoLLib.g:2450:1: '}'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBCOoLLib.g:2473:1: rule__ExpressionDeclaration__Group_4_3__0 : rule__ExpressionDeclaration__Group_4_3__0__Impl rule__ExpressionDeclaration__Group_4_3__1 ;
    public final void rule__ExpressionDeclaration__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2477:1: ( rule__ExpressionDeclaration__Group_4_3__0__Impl rule__ExpressionDeclaration__Group_4_3__1 )
            // InternalBCOoLLib.g:2478:2: rule__ExpressionDeclaration__Group_4_3__0__Impl rule__ExpressionDeclaration__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ExpressionDeclaration__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2485:1: rule__ExpressionDeclaration__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ExpressionDeclaration__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2489:1: ( ( ',' ) )
            // InternalBCOoLLib.g:2490:1: ( ',' )
            {
            // InternalBCOoLLib.g:2490:1: ( ',' )
            // InternalBCOoLLib.g:2491:1: ','
            {
             before(grammarAccess.getExpressionDeclarationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBCOoLLib.g:2504:1: rule__ExpressionDeclaration__Group_4_3__1 : rule__ExpressionDeclaration__Group_4_3__1__Impl ;
    public final void rule__ExpressionDeclaration__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2508:1: ( rule__ExpressionDeclaration__Group_4_3__1__Impl )
            // InternalBCOoLLib.g:2509:2: rule__ExpressionDeclaration__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2515:1: rule__ExpressionDeclaration__Group_4_3__1__Impl : ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) ) ;
    public final void rule__ExpressionDeclaration__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2519:1: ( ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) ) )
            // InternalBCOoLLib.g:2520:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) )
            {
            // InternalBCOoLLib.g:2520:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) )
            // InternalBCOoLLib.g:2521:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_3_1()); 
            // InternalBCOoLLib.g:2522:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 )
            // InternalBCOoLLib.g:2522:2: rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2537:1: rule__BCoolLibrary__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BCoolLibrary__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2541:1: ( ( RULE_ID ) )
            // InternalBCOoLLib.g:2542:1: ( RULE_ID )
            {
            // InternalBCOoLLib.g:2542:1: ( RULE_ID )
            // InternalBCOoLLib.g:2543:1: RULE_ID
            {
             before(grammarAccess.getBCoolLibraryAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBCoolLibraryAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalBCOoLLib.g:2552:1: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 : ( ruleExpressionDefinition ) ;
    public final void rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2556:1: ( ( ruleExpressionDefinition ) )
            // InternalBCOoLLib.g:2557:1: ( ruleExpressionDefinition )
            {
            // InternalBCOoLLib.g:2557:1: ( ruleExpressionDefinition )
            // InternalBCOoLLib.g:2558:1: ruleExpressionDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2567:1: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 : ( ruleExpressionDefinition ) ;
    public final void rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2571:1: ( ( ruleExpressionDefinition ) )
            // InternalBCOoLLib.g:2572:1: ( ruleExpressionDefinition )
            {
            // InternalBCOoLLib.g:2572:1: ( ruleExpressionDefinition )
            // InternalBCOoLLib.g:2573:1: ruleExpressionDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2582:1: rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 : ( ruleRelationDefinition ) ;
    public final void rule__BCoolLibrary__RelationDefinitionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2586:1: ( ( ruleRelationDefinition ) )
            // InternalBCOoLLib.g:2587:1: ( ruleRelationDefinition )
            {
            // InternalBCOoLLib.g:2587:1: ( ruleRelationDefinition )
            // InternalBCOoLLib.g:2588:1: ruleRelationDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2597:1: rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 : ( ruleRelationDefinition ) ;
    public final void rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2601:1: ( ( ruleRelationDefinition ) )
            // InternalBCOoLLib.g:2602:1: ( ruleRelationDefinition )
            {
            // InternalBCOoLLib.g:2602:1: ( ruleRelationDefinition )
            // InternalBCOoLLib.g:2603:1: ruleRelationDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2612:1: rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 : ( ruleRelationDeclaration ) ;
    public final void rule__BCoolLibrary__RelationDeclarationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2616:1: ( ( ruleRelationDeclaration ) )
            // InternalBCOoLLib.g:2617:1: ( ruleRelationDeclaration )
            {
            // InternalBCOoLLib.g:2617:1: ( ruleRelationDeclaration )
            // InternalBCOoLLib.g:2618:1: ruleRelationDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2627:1: rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 : ( ruleRelationDeclaration ) ;
    public final void rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2631:1: ( ( ruleRelationDeclaration ) )
            // InternalBCOoLLib.g:2632:1: ( ruleRelationDeclaration )
            {
            // InternalBCOoLLib.g:2632:1: ( ruleRelationDeclaration )
            // InternalBCOoLLib.g:2633:1: ruleRelationDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2642:1: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 : ( ruleExpressionDeclaration ) ;
    public final void rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2646:1: ( ( ruleExpressionDeclaration ) )
            // InternalBCOoLLib.g:2647:1: ( ruleExpressionDeclaration )
            {
            // InternalBCOoLLib.g:2647:1: ( ruleExpressionDeclaration )
            // InternalBCOoLLib.g:2648:1: ruleExpressionDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2657:1: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 : ( ruleExpressionDeclaration ) ;
    public final void rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2661:1: ( ( ruleExpressionDeclaration ) )
            // InternalBCOoLLib.g:2662:1: ( ruleExpressionDeclaration )
            {
            // InternalBCOoLLib.g:2662:1: ( ruleExpressionDeclaration )
            // InternalBCOoLLib.g:2663:1: ruleExpressionDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalBCOoLLib.g:2672:1: rule__ExpressionDefinition__DefinitionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ExpressionDefinition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2676:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoLLib.g:2677:1: ( ( RULE_ID ) )
            {
            // InternalBCOoLLib.g:2677:1: ( ( RULE_ID ) )
            // InternalBCOoLLib.g:2678:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationCrossReference_3_0()); 
            // InternalBCOoLLib.g:2679:1: ( RULE_ID )
            // InternalBCOoLLib.g:2680:1: RULE_ID
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationIDTerminalRuleCall_3_0_1()); 

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
    // InternalBCOoLLib.g:2691:1: rule__RelationDefinition__DefinitionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDefinition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2695:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoLLib.g:2696:1: ( ( RULE_ID ) )
            {
            // InternalBCOoLLib.g:2696:1: ( ( RULE_ID ) )
            // InternalBCOoLLib.g:2697:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationCrossReference_3_0()); 
            // InternalBCOoLLib.g:2698:1: ( RULE_ID )
            // InternalBCOoLLib.g:2699:1: RULE_ID
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationIDTerminalRuleCall_3_0_1()); 

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
    // InternalBCOoLLib.g:2710:1: rule__RelationDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RelationDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2714:1: ( ( RULE_ID ) )
            // InternalBCOoLLib.g:2715:1: ( RULE_ID )
            {
            // InternalBCOoLLib.g:2715:1: ( RULE_ID )
            // InternalBCOoLLib.g:2716:1: RULE_ID
            {
             before(grammarAccess.getRelationDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalBCOoLLib.g:2725:1: rule__RelationDeclaration__FormalParametersAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDeclaration__FormalParametersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2729:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoLLib.g:2730:1: ( ( RULE_ID ) )
            {
            // InternalBCOoLLib.g:2730:1: ( ( RULE_ID ) )
            // InternalBCOoLLib.g:2731:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 
            // InternalBCOoLLib.g:2732:1: ( RULE_ID )
            // InternalBCOoLLib.g:2733:1: RULE_ID
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 

            }


            }

        }
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
    // InternalBCOoLLib.g:2744:1: rule__RelationDeclaration__FormalParametersAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDeclaration__FormalParametersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2748:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoLLib.g:2749:1: ( ( RULE_ID ) )
            {
            // InternalBCOoLLib.g:2749:1: ( ( RULE_ID ) )
            // InternalBCOoLLib.g:2750:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 
            // InternalBCOoLLib.g:2751:1: ( RULE_ID )
            // InternalBCOoLLib.g:2752:1: RULE_ID
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 

            }


            }

        }
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
    // InternalBCOoLLib.g:2763:1: rule__ExpressionDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExpressionDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2767:1: ( ( RULE_ID ) )
            // InternalBCOoLLib.g:2768:1: ( RULE_ID )
            {
            // InternalBCOoLLib.g:2768:1: ( RULE_ID )
            // InternalBCOoLLib.g:2769:1: RULE_ID
            {
             before(grammarAccess.getExpressionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalBCOoLLib.g:2778:1: rule__ExpressionDeclaration__FormalParametersAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExpressionDeclaration__FormalParametersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2782:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoLLib.g:2783:1: ( ( RULE_ID ) )
            {
            // InternalBCOoLLib.g:2783:1: ( ( RULE_ID ) )
            // InternalBCOoLLib.g:2784:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 
            // InternalBCOoLLib.g:2785:1: ( RULE_ID )
            // InternalBCOoLLib.g:2786:1: RULE_ID
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 

            }


            }

        }
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
    // InternalBCOoLLib.g:2797:1: rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBCOoLLib.g:2801:1: ( ( ( RULE_ID ) ) )
            // InternalBCOoLLib.g:2802:1: ( ( RULE_ID ) )
            {
            // InternalBCOoLLib.g:2802:1: ( ( RULE_ID ) )
            // InternalBCOoLLib.g:2803:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 
            // InternalBCOoLLib.g:2804:1: ( RULE_ID )
            // InternalBCOoLLib.g:2805:1: RULE_ID
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 

            }


            }

        }
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000802000L});

}