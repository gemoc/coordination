package org.gemoc.bcool.model.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBCOoLLexer extends Lexer {
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
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=12;
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
    public static final int T__32=32;
    public static final int RULE_STRING=5;
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

    public InternalBCOoLLexer() {;} 
    public InternalBCOoLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBCOoLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:11:7: ( 'Spec' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:11:9: 'Spec'
            {
            match("Spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:12:7: ( 'Global Event' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:12:9: 'Global Event'
            {
            match("Global Event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:13:7: ( ';' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:14:7: ( 'let' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:14:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:15:7: ( 'Operator' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:15:9: 'Operator'
            {
            match("Operator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:16:7: ( '(' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:17:7: ( ',' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:18:7: ( ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:19:7: ( 'MatchingCorrespondance:' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:19:9: 'MatchingCorrespondance:'
            {
            match("MatchingCorrespondance:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:20:7: ( 'end operator;' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:20:9: 'end operator;'
            {
            match("end operator;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:21:7: ( ' : ' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:21:9: ' : '
            {
            match(" : "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:22:7: ( '::' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:22:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:23:7: ( 'when' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:23:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:24:7: ( 'CoordinationRule:' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:24:9: 'CoordinationRule:'
            {
            match("CoordinationRule:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:25:7: ( 'Local Event' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:25:9: 'Local Event'
            {
            match("Local Event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:26:7: ( '=' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:27:7: ( 'ImportLib' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:27:9: 'ImportLib'
            {
            match("ImportLib"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:28:7: ( 'ImportInterface' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:28:9: 'ImportInterface'
            {
            match("ImportInterface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:29:7: ( 'as' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:29:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:30:7: ( 'import' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:30:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:31:7: ( '#' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:31:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:32:7: ( 'if' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:32:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:33:7: ( 'then' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:33:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:34:7: ( 'else' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:34:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:35:7: ( 'endif' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:35:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:36:7: ( '.' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:36:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:37:7: ( '->' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:37:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:38:7: ( 'and' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:38:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:39:7: ( 'xor' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:39:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:40:7: ( 'or' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:40:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:41:7: ( '<>' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:41:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:42:7: ( '<' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:42:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:43:7: ( '>' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:43:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:44:7: ( '<=' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:44:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:45:7: ( '>=' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:45:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:46:7: ( '+' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:46:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:47:7: ( '-' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:47:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:48:7: ( '*' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:48:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:49:7: ( '/' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:49:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:50:7: ( 'not' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:50:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:51:7: ( '~' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:51:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2424:14: ( ( 'true' | 'false' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2424:16: ( 'true' | 'false' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2424:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2424:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2424:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2426:13: ( ( '-' | '+' )? ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' ) ( 'e' ( '-' | '+' ) RULE_INT )? )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2426:15: ( '-' | '+' )? ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' ) ( 'e' ( '-' | '+' ) RULE_INT )?
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2426:15: ( '-' | '+' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2426:26: ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2426:27: RULE_INT '.' RULE_INT
                    {
                    mRULE_INT(); 
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2426:49: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;
                case 3 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2426:62: RULE_INT '.'
                    {
                    mRULE_INT(); 
                    match('.'); 

                    }
                    break;

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2426:76: ( 'e' ( '-' | '+' ) RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2426:77: 'e' ( '-' | '+' ) RULE_INT
                    {
                    match('e'); 
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2428:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2428:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2428:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2428:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2428:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2430:10: ( ( '0' .. '9' )+ )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2430:12: ( '0' .. '9' )+
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2430:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2430:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2432:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2434:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2434:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2434:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2434:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2436:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2436:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2436:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2436:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2436:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2436:41: ( '\\r' )? '\\n'
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2436:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2436:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2438:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2438:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2438:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2440:16: ( . )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2440:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_BOOLEAN | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=50;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:256: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 43 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:269: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 44 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:281: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:289: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 46 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:298: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:310: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:326: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:342: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1:350: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA3_eotS =
        "\3\uffff\1\4\2\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\2\56\1\uffff\1\60\2\uffff";
    static final String DFA3_maxS =
        "\2\71\1\uffff\1\71\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\uffff\1\3\1\1";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "\12\5",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "2426:26: ( RULE_INT '.' RULE_INT | '.' RULE_INT | RULE_INT '.' )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\2\52\1\uffff\2\52\3\uffff\2\52\1\66\1\50\3\52\1\uffff\3\52\1\uffff\1\52\1\104\1\107\2\52\1\114\1\116\1\117\1\uffff\1\123\1\52\1\uffff\1\52\1\127\1\50\1\uffff\2\50\2\uffff\1\52\1\uffff\1\52\1\uffff\2\52\3\uffff\3\52\3\uffff\3\52\1\uffff\1\52\1\145\2\52\1\150\1\uffff\2\52\4\uffff\1\52\1\154\12\uffff\1\52\1\uffff\1\52\1\uffff\1\127\1\uffff\2\52\1\161\10\52\1\uffff\1\173\1\52\1\uffff\2\52\1\177\1\uffff\1\u0080\1\52\1\u0082\1\52\1\uffff\2\52\1\uffff\1\52\1\u0087\1\u0088\3\52\1\uffff\1\52\1\u008d\1\u008e\2\uffff\1\52\1\uffff\3\52\1\u0093\2\uffff\4\52\2\uffff\1\u008e\3\52\1\uffff\1\52\1\uffff\1\52\1\u009e\1\uffff\5\52\1\uffff\1\u00a4\4\52\1\uffff\2\52\1\u00ab\3\52\1\uffff\17\52\1\u00be\2\52\1\uffff\1\52\1\uffff\5\52\1\uffff";
    static final String DFA16_eofS =
        "\u00c7\uffff";
    static final String DFA16_minS =
        "\1\0\1\160\1\154\1\uffff\1\145\1\160\3\uffff\1\141\1\154\2\72\1\150\2\157\1\uffff\1\155\1\156\1\146\1\uffff\1\150\1\60\1\56\1\157\1\162\2\75\1\56\1\uffff\1\52\1\157\1\uffff\1\141\1\56\1\101\1\uffff\2\0\2\uffff\1\145\1\uffff\1\157\1\uffff\1\164\1\145\3\uffff\1\164\1\144\1\163\3\uffff\1\145\1\157\1\143\1\uffff\1\160\1\60\1\144\1\160\1\60\1\uffff\1\145\1\165\4\uffff\1\162\1\60\12\uffff\1\164\1\uffff\1\154\1\uffff\1\56\1\uffff\1\143\1\142\1\60\1\162\1\143\1\40\1\145\1\156\1\162\1\141\1\157\1\uffff\1\60\1\157\1\uffff\1\156\1\145\1\60\1\uffff\1\60\1\163\1\60\1\141\1\uffff\1\141\1\150\1\uffff\1\146\2\60\1\144\1\154\1\162\1\uffff\1\162\2\60\2\uffff\1\145\1\uffff\1\154\1\164\1\151\1\60\2\uffff\1\151\1\40\2\164\2\uffff\1\60\1\40\1\157\1\156\1\uffff\1\156\1\uffff\1\111\1\60\1\uffff\1\162\1\147\1\141\1\151\1\156\1\uffff\1\60\1\103\1\164\1\142\1\164\1\uffff\1\157\1\151\1\60\1\145\1\162\1\157\1\uffff\2\162\1\156\1\146\1\145\1\122\1\141\1\163\1\165\1\143\1\160\1\154\1\145\1\157\1\145\1\60\1\156\1\72\1\uffff\1\144\1\uffff\1\141\1\156\1\143\1\145\1\72\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\160\1\154\1\uffff\1\145\1\160\3\uffff\1\141\1\156\2\72\1\150\2\157\1\uffff\1\155\1\163\1\155\1\uffff\1\162\1\71\1\76\1\157\1\162\1\76\1\75\1\71\1\uffff\1\57\1\157\1\uffff\1\141\1\71\1\172\1\uffff\2\uffff\2\uffff\1\145\1\uffff\1\157\1\uffff\1\164\1\145\3\uffff\1\164\1\144\1\163\3\uffff\1\145\1\157\1\143\1\uffff\1\160\1\172\1\144\1\160\1\172\1\uffff\1\145\1\165\4\uffff\1\162\1\172\12\uffff\1\164\1\uffff\1\154\1\uffff\1\71\1\uffff\1\143\1\142\1\172\1\162\1\143\1\151\1\145\1\156\1\162\1\141\1\157\1\uffff\1\172\1\157\1\uffff\1\156\1\145\1\172\1\uffff\1\172\1\163\1\172\1\141\1\uffff\1\141\1\150\1\uffff\1\146\2\172\1\144\1\154\1\162\1\uffff\1\162\2\172\2\uffff\1\145\1\uffff\1\154\1\164\1\151\1\172\2\uffff\1\151\1\40\2\164\2\uffff\1\172\1\40\1\157\1\156\1\uffff\1\156\1\uffff\1\114\1\172\1\uffff\1\162\1\147\1\141\1\151\1\156\1\uffff\1\172\1\103\1\164\1\142\1\164\1\uffff\1\157\1\151\1\172\1\145\1\162\1\157\1\uffff\2\162\1\156\1\146\1\145\1\122\1\141\1\163\1\165\1\143\1\160\1\154\1\145\1\157\1\145\1\172\1\156\1\72\1\uffff\1\144\1\uffff\1\141\1\156\1\143\1\145\1\72\1\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\3\2\uffff\1\6\1\7\1\10\7\uffff\1\20\3\uffff\1\25\10\uffff\1\46\2\uffff\1\51\3\uffff\1\54\2\uffff\1\61\1\62\1\uffff\1\54\1\uffff\1\3\2\uffff\1\6\1\7\1\10\3\uffff\1\13\1\61\1\14\3\uffff\1\20\5\uffff\1\25\2\uffff\1\32\1\53\1\33\1\45\2\uffff\1\37\1\42\1\40\1\43\1\41\1\44\1\46\1\57\1\60\1\47\1\uffff\1\51\1\uffff\1\55\1\uffff\1\56\13\uffff\1\23\2\uffff\1\26\3\uffff\1\36\4\uffff\1\4\2\uffff\1\12\6\uffff\1\34\3\uffff\1\35\1\50\1\uffff\1\1\4\uffff\1\30\1\15\4\uffff\1\27\1\52\4\uffff\1\31\1\uffff\1\17\2\uffff\1\2\5\uffff\1\24\5\uffff\1\5\6\uffff\1\21\22\uffff\1\22\1\uffff\1\16\5\uffff\1\11";
    static final String DFA16_specialS =
        "\1\2\44\uffff\1\0\1\1\u00a0\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\13\1\50\1\45\1\24\3\50\1\46\1\6\1\10\1\35\1\34\1\7\1\27\1\26\1\36\12\42\1\14\1\3\1\32\1\20\1\33\2\50\2\44\1\16\3\44\1\2\1\44\1\21\2\44\1\17\1\11\1\44\1\5\3\44\1\1\7\44\3\50\1\43\1\44\1\50\1\22\3\44\1\12\1\41\2\44\1\23\2\44\1\4\1\44\1\37\1\31\4\44\1\25\2\44\1\15\1\30\2\44\3\50\1\40\uff81\50",
            "\1\51",
            "\1\53",
            "",
            "\1\55",
            "\1\56",
            "",
            "",
            "",
            "\1\62",
            "\1\64\1\uffff\1\63",
            "\1\65",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\1\74",
            "\1\76\4\uffff\1\75",
            "\1\100\6\uffff\1\77",
            "",
            "\1\102\11\uffff\1\103",
            "\12\105",
            "\1\105\1\uffff\12\105\4\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\113\1\112",
            "\1\115",
            "\1\105\1\uffff\12\105",
            "",
            "\1\121\4\uffff\1\122",
            "\1\124",
            "",
            "\1\126",
            "\1\105\1\uffff\12\130",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\131",
            "\0\131",
            "",
            "",
            "\1\132",
            "",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\146",
            "\1\147",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "\1\153",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\155",
            "",
            "\1\156",
            "",
            "\1\105\1\uffff\12\130",
            "",
            "\1\157",
            "\1\160",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\162",
            "\1\163",
            "\1\164\110\uffff\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0081",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "",
            "\1\u009d\2\uffff\1\u009c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_BOOLEAN | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_37 = input.LA(1);

                        s = -1;
                        if ( ((LA16_37>='\u0000' && LA16_37<='\uFFFF')) ) {s = 89;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_38 = input.LA(1);

                        s = -1;
                        if ( ((LA16_38>='\u0000' && LA16_38<='\uFFFF')) ) {s = 89;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='S') ) {s = 1;}

                        else if ( (LA16_0=='G') ) {s = 2;}

                        else if ( (LA16_0==';') ) {s = 3;}

                        else if ( (LA16_0=='l') ) {s = 4;}

                        else if ( (LA16_0=='O') ) {s = 5;}

                        else if ( (LA16_0=='(') ) {s = 6;}

                        else if ( (LA16_0==',') ) {s = 7;}

                        else if ( (LA16_0==')') ) {s = 8;}

                        else if ( (LA16_0=='M') ) {s = 9;}

                        else if ( (LA16_0=='e') ) {s = 10;}

                        else if ( (LA16_0==' ') ) {s = 11;}

                        else if ( (LA16_0==':') ) {s = 12;}

                        else if ( (LA16_0=='w') ) {s = 13;}

                        else if ( (LA16_0=='C') ) {s = 14;}

                        else if ( (LA16_0=='L') ) {s = 15;}

                        else if ( (LA16_0=='=') ) {s = 16;}

                        else if ( (LA16_0=='I') ) {s = 17;}

                        else if ( (LA16_0=='a') ) {s = 18;}

                        else if ( (LA16_0=='i') ) {s = 19;}

                        else if ( (LA16_0=='#') ) {s = 20;}

                        else if ( (LA16_0=='t') ) {s = 21;}

                        else if ( (LA16_0=='.') ) {s = 22;}

                        else if ( (LA16_0=='-') ) {s = 23;}

                        else if ( (LA16_0=='x') ) {s = 24;}

                        else if ( (LA16_0=='o') ) {s = 25;}

                        else if ( (LA16_0=='<') ) {s = 26;}

                        else if ( (LA16_0=='>') ) {s = 27;}

                        else if ( (LA16_0=='+') ) {s = 28;}

                        else if ( (LA16_0=='*') ) {s = 29;}

                        else if ( (LA16_0=='/') ) {s = 30;}

                        else if ( (LA16_0=='n') ) {s = 31;}

                        else if ( (LA16_0=='~') ) {s = 32;}

                        else if ( (LA16_0=='f') ) {s = 33;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 34;}

                        else if ( (LA16_0=='^') ) {s = 35;}

                        else if ( ((LA16_0>='A' && LA16_0<='B')||(LA16_0>='D' && LA16_0<='F')||LA16_0=='H'||(LA16_0>='J' && LA16_0<='K')||LA16_0=='N'||(LA16_0>='P' && LA16_0<='R')||(LA16_0>='T' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='b' && LA16_0<='d')||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||LA16_0=='m'||(LA16_0>='p' && LA16_0<='s')||(LA16_0>='u' && LA16_0<='v')||(LA16_0>='y' && LA16_0<='z')) ) {s = 36;}

                        else if ( (LA16_0=='\"') ) {s = 37;}

                        else if ( (LA16_0=='\'') ) {s = 38;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r') ) {s = 39;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='$' && LA16_0<='&')||(LA16_0>='?' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='}')||(LA16_0>='\u007F' && LA16_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}