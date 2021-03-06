package fr.mines_nantes.atlanmod.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGiraffeDSLLexer extends Lexer {
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalGiraffeDSLLexer() {;} 
    public InternalGiraffeDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGiraffeDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:11:7: ( 'Linux1-CloudTest' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:11:9: 'Linux1-CloudTest'
            {
            match("Linux1-CloudTest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:12:7: ( 'Small' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:12:9: 'Small'
            {
            match("Small"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:13:7: ( 'G5000' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:13:9: 'G5000'
            {
            match("G5000"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:14:7: ( 'AmazonEC2' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:14:9: 'AmazonEC2'
            {
            match("AmazonEC2"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:15:7: ( 'Google' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:15:9: 'Google'
            {
            match("Google"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:16:7: ( 'VirtualBox' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:16:9: 'VirtualBox'
            {
            match("VirtualBox"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:17:7: ( 'reactive' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:17:9: 'reactive'
            {
            match("reactive"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:18:7: ( 'predictive' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:18:9: 'predictive'
            {
            match("predictive"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:19:7: ( 'create' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:19:9: 'create'
            {
            match("create"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:20:7: ( '{' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:20:9: '{'
            {
            match('{'); 

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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:21:7: ( '}' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:21:9: '}'
            {
            match('}'); 

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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:22:7: ( ':' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:22:9: ':'
            {
            match(':'); 

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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:23:7: ( 'virtualMachine' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:23:9: 'virtualMachine'
            {
            match("virtualMachine"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:24:7: ( 'cloudProvider' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:24:9: 'cloudProvider'
            {
            match("cloudProvider"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:25:7: ( 'deploy' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:25:9: 'deploy'
            {
            match("deploy"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:26:7: ( 'deployType' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:26:9: 'deployType'
            {
            match("deployType"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:27:7: ( 'deployApp' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:27:9: 'deployApp'
            {
            match("deployApp"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:28:7: ( 'monitor' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:28:9: 'monitor'
            {
            match("monitor"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:29:7: ( 'stress' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:29:9: 'stress'
            {
            match("stress"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:30:7: ( 'action' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:30:9: 'action'
            {
            match("action"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:31:7: ( 'many' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:31:9: 'many'
            {
            match("many"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:32:7: ( 'initialMachines' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:32:9: 'initialMachines'
            {
            match("initialMachines"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:33:7: ( 'initialIncrement' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:33:9: 'initialIncrement'
            {
            match("initialIncrement"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:34:7: ( 'vMachine' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:34:9: 'vMachine'
            {
            match("vMachine"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:35:7: ( 'vM' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:35:9: 'vM'
            {
            match("vM"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:36:7: ( 'cloudType' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:36:9: 'cloudType'
            {
            match("cloudType"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:37:7: ( 'newMachinesScript' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:37:9: 'newMachinesScript'
            {
            match("newMachinesScript"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:38:7: ( 'geoZone' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:38:9: 'geoZone'
            {
            match("geoZone"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:39:7: ( 'cloudMgmAddress' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:39:9: 'cloudMgmAddress'
            {
            match("cloudMgmAddress"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:40:7: ( 'cloudCredential' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:40:9: 'cloudCredential'
            {
            match("cloudCredential"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:41:7: ( 'cloudUser' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:41:9: 'cloudUser'
            {
            match("cloudUser"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:42:7: ( 'cloudPassword' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:42:9: 'cloudPassword'
            {
            match("cloudPassword"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:43:7: ( 'range' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:43:9: 'range'
            {
            match("range"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:44:7: ( 'class' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:44:9: 'class'
            {
            match("class"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:45:7: ( 'deployMasterMethod' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:45:9: 'deployMasterMethod'
            {
            match("deployMasterMethod"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:46:7: ( 'deploySlaveMethod' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:46:9: 'deploySlaveMethod'
            {
            match("deploySlaveMethod"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:47:7: ( 'monitoringType' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:47:9: 'monitoringType'
            {
            match("monitoringType"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:48:7: ( 'stressClass' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:48:9: 'stressClass'
            {
            match("stressClass"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:49:7: ( 'stressMethod' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:49:9: 'stressMethod'
            {
            match("stressMethod"); 


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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:50:7: ( 'method' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:50:9: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8552:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8552:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8552:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8552:11: '^'
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

            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8552:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:
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
            	    break loop2;
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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8554:10: ( ( '0' .. '9' )+ )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8554:12: ( '0' .. '9' )+
            {
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8554:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8554:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8556:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8558:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8558:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8558:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8558:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8560:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8560:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8560:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8560:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8560:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8560:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8560:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8560:41: '\\r'
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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8562:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8562:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8562:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8564:16: ( . )
            // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:8564:18: .
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
        // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=47;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:250: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:258: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 43 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:267: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:279: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:295: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:311: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // ../fr.mines_nantes.atlanmod.dsl.GiraffeDSL.ui/src-gen/fr/mines_nantes/atlanmod/dsl/ui/contentassist/antlr/internal/InternalGiraffeDSL.g:1:319: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\10\35\3\uffff\10\35\1\33\2\uffff\3\33\2\uffff\1\35\1\uffff"+
        "\12\35\3\uffff\1\35\1\111\11\35\5\uffff\16\35\1\uffff\31\35\1\172"+
        "\7\35\1\u0082\1\u0083\4\35\1\u0088\3\35\1\u0090\4\35\1\uffff\7\35"+
        "\2\uffff\1\u009c\3\35\1\uffff\1\35\1\u00a1\5\35\1\uffff\2\35\1\u00ae"+
        "\1\35\1\u00b0\1\u00b3\1\u00b4\3\35\2\uffff\4\35\1\uffff\14\35\1"+
        "\uffff\1\u00c9\1\uffff\2\35\2\uffff\2\35\1\u00cf\2\35\1\u00d2\10"+
        "\35\1\u00db\5\35\1\uffff\5\35\1\uffff\1\u00e6\1\35\1\uffff\3\35"+
        "\1\u00eb\2\35\1\u00ee\1\35\1\uffff\1\35\1\u00f1\10\35\1\uffff\1"+
        "\u00fa\1\u00fb\2\35\1\uffff\2\35\1\uffff\1\35\1\u0101\1\uffff\10"+
        "\35\2\uffff\5\35\1\uffff\3\35\1\u0112\14\35\1\uffff\1\u011f\3\35"+
        "\1\u0123\1\u0124\6\35\1\uffff\3\35\2\uffff\2\35\1\u0130\2\35\1\u0133"+
        "\3\35\1\u0137\1\u0138\1\uffff\2\35\1\uffff\1\u013b\2\35\2\uffff"+
        "\2\35\1\uffff\1\u0140\2\35\1\u0143\1\uffff\1\u0144\1\u0145\3\uffff";
    static final String DFA12_eofS =
        "\u0146\uffff";
    static final String DFA12_minS =
        "\1\0\1\151\1\155\1\65\1\155\1\151\1\141\1\162\1\154\3\uffff\1\115"+
        "\1\145\1\141\1\164\1\143\1\156\2\145\1\101\2\uffff\2\0\1\52\2\uffff"+
        "\1\156\1\uffff\1\141\1\60\1\157\1\141\1\162\1\141\1\156\2\145\1"+
        "\141\3\uffff\1\162\1\60\1\160\2\156\1\164\1\162\1\164\1\151\1\167"+
        "\1\157\5\uffff\1\165\1\154\1\60\1\147\1\172\1\164\1\143\1\147\1"+
        "\144\1\141\1\165\1\163\1\164\1\143\1\uffff\1\154\1\151\1\171\1\150"+
        "\1\145\1\151\1\164\1\115\1\132\1\170\1\154\1\60\1\154\1\157\1\165"+
        "\1\164\1\145\1\151\1\164\1\144\1\163\1\165\1\150\1\157\1\164\1\60"+
        "\1\157\1\163\1\157\1\151\1\141\1\157\1\61\2\60\1\145\1\156\1\141"+
        "\1\151\1\60\1\143\1\145\1\103\1\60\1\141\1\151\1\171\1\157\1\uffff"+
        "\1\144\1\163\1\156\1\141\1\143\1\156\1\55\2\uffff\1\60\1\105\1\154"+
        "\1\166\1\uffff\1\164\1\60\1\141\1\171\1\147\1\162\1\163\1\uffff"+
        "\1\154\1\156\1\60\1\162\3\60\1\154\1\150\1\145\2\uffff\1\103\1\102"+
        "\1\145\1\151\1\uffff\1\157\1\163\1\160\1\155\2\145\1\115\1\145\1"+
        "\171\1\160\1\141\1\154\1\uffff\1\60\1\uffff\1\154\1\145\2\uffff"+
        "\1\111\1\151\1\60\1\62\1\157\1\60\2\166\1\163\1\145\1\101\1\144"+
        "\1\162\1\141\1\60\2\160\1\163\1\141\1\156\1\uffff\1\141\1\164\1"+
        "\141\2\156\1\uffff\1\60\1\170\1\uffff\1\145\1\151\1\167\1\60\1\144"+
        "\1\145\1\60\1\143\1\uffff\1\145\1\60\1\164\1\166\1\147\1\163\1\150"+
        "\2\143\1\145\1\uffff\2\60\1\144\1\157\1\uffff\1\144\1\156\1\uffff"+
        "\1\150\1\60\1\uffff\2\145\1\124\1\163\1\157\1\150\1\162\1\163\2"+
        "\uffff\1\145\2\162\1\164\1\151\1\uffff\1\162\1\115\1\171\1\60\1"+
        "\144\1\151\1\145\1\123\1\162\1\144\1\145\1\151\1\156\1\115\1\145"+
        "\1\160\1\uffff\1\60\1\156\1\155\1\143\2\60\1\163\1\141\2\145\1\164"+
        "\1\145\1\uffff\2\145\1\162\2\uffff\1\163\1\154\1\60\1\164\1\150"+
        "\1\60\1\163\1\156\1\151\2\60\1\uffff\1\150\1\157\1\uffff\1\60\1"+
        "\164\1\160\2\uffff\1\157\1\144\1\uffff\1\60\1\164\1\144\1\60\1\uffff"+
        "\2\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\151\1\155\1\157\1\155\1\151\1\145\2\162\3\uffff\1\151"+
        "\1\145\1\157\1\164\1\143\1\156\2\145\1\172\2\uffff\2\uffff\1\57"+
        "\2\uffff\1\156\1\uffff\1\141\1\60\1\157\1\141\1\162\1\141\1\156"+
        "\2\145\1\157\3\uffff\1\162\1\172\1\160\2\156\1\164\1\162\1\164\1"+
        "\151\1\167\1\157\5\uffff\1\165\1\154\1\60\1\147\1\172\1\164\1\143"+
        "\1\147\1\144\1\141\1\165\1\163\1\164\1\143\1\uffff\1\154\1\151\1"+
        "\171\1\150\1\145\1\151\1\164\1\115\1\132\1\170\1\154\1\60\1\154"+
        "\1\157\1\165\1\164\1\145\1\151\1\164\1\144\1\163\1\165\1\150\1\157"+
        "\1\164\1\172\1\157\1\163\1\157\1\151\1\141\1\157\1\61\2\172\1\145"+
        "\1\156\1\141\1\151\1\172\1\143\1\145\1\125\1\172\1\141\1\151\1\171"+
        "\1\157\1\uffff\1\144\1\163\1\156\1\141\1\143\1\156\1\55\2\uffff"+
        "\1\172\1\105\1\154\1\166\1\uffff\1\164\1\172\1\162\1\171\1\147\1"+
        "\162\1\163\1\uffff\1\154\1\156\1\172\1\162\3\172\1\154\1\150\1\145"+
        "\2\uffff\1\103\1\102\1\145\1\151\1\uffff\1\157\1\163\1\160\1\155"+
        "\2\145\1\115\1\145\1\171\1\160\1\141\1\154\1\uffff\1\172\1\uffff"+
        "\1\154\1\145\2\uffff\1\115\1\151\1\172\1\62\1\157\1\172\2\166\1"+
        "\163\1\145\1\101\1\144\1\162\1\141\1\172\2\160\1\163\1\141\1\156"+
        "\1\uffff\1\141\1\164\1\141\2\156\1\uffff\1\172\1\170\1\uffff\1\145"+
        "\1\151\1\167\1\172\1\144\1\145\1\172\1\143\1\uffff\1\145\1\172\1"+
        "\164\1\166\1\147\1\163\1\150\2\143\1\145\1\uffff\2\172\1\144\1\157"+
        "\1\uffff\1\144\1\156\1\uffff\1\150\1\172\1\uffff\2\145\1\124\1\163"+
        "\1\157\1\150\1\162\1\163\2\uffff\1\145\2\162\1\164\1\151\1\uffff"+
        "\1\162\1\115\1\171\1\172\1\144\1\151\1\145\1\123\1\162\1\144\1\145"+
        "\1\151\1\156\1\115\1\145\1\160\1\uffff\1\172\1\156\1\155\1\143\2"+
        "\172\1\163\1\141\2\145\1\164\1\145\1\uffff\2\145\1\162\2\uffff\1"+
        "\163\1\154\1\172\1\164\1\150\1\172\1\163\1\156\1\151\2\172\1\uffff"+
        "\1\150\1\157\1\uffff\1\172\1\164\1\160\2\uffff\1\157\1\144\1\uffff"+
        "\1\172\1\164\1\144\1\172\1\uffff\2\172\3\uffff";
    static final String DFA12_acceptS =
        "\11\uffff\1\12\1\13\1\14\11\uffff\1\51\1\52\3\uffff\1\56\1\57\1"+
        "\uffff\1\51\12\uffff\1\12\1\13\1\14\13\uffff\1\52\1\53\1\54\1\55"+
        "\1\56\16\uffff\1\31\60\uffff\1\25\7\uffff\1\2\1\3\4\uffff\1\41\7"+
        "\uffff\1\42\12\uffff\1\1\1\5\4\uffff\1\11\14\uffff\1\17\1\uffff"+
        "\1\50\2\uffff\1\23\1\24\24\uffff\1\22\5\uffff\1\34\2\uffff\1\7\10"+
        "\uffff\1\30\12\uffff\1\4\4\uffff\1\32\2\uffff\1\37\2\uffff\1\21"+
        "\10\uffff\1\6\1\10\5\uffff\1\20\20\uffff\1\46\14\uffff\1\47\3\uffff"+
        "\1\16\1\40\13\uffff\1\15\2\uffff\1\45\3\uffff\1\35\1\36\2\uffff"+
        "\1\26\4\uffff\1\27\2\uffff\1\44\1\33\1\43";
    static final String DFA12_specialS =
        "\1\2\26\uffff\1\1\1\0\u012d\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\7\33\1"+
            "\31\12\26\1\13\6\33\1\4\5\25\1\3\4\25\1\1\6\25\1\2\2\25\1\5"+
            "\4\25\3\33\1\24\1\25\1\33\1\20\1\25\1\10\1\15\2\25\1\23\1\25"+
            "\1\21\3\25\1\16\1\22\1\25\1\7\1\25\1\6\1\17\2\25\1\14\4\25\1"+
            "\11\1\33\1\12\uff82\33",
            "\1\34",
            "\1\36",
            "\1\37\71\uffff\1\40",
            "\1\41",
            "\1\42",
            "\1\44\3\uffff\1\43",
            "\1\45",
            "\1\47\5\uffff\1\46",
            "",
            "",
            "",
            "\1\54\33\uffff\1\53",
            "\1\55",
            "\1\57\3\uffff\1\60\11\uffff\1\56",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\67",
            "\0\67",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106\15\uffff\1\105",
            "",
            "",
            "",
            "\1\107",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\110\31\35",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0089",
            "\1\u008a",
            "\1\u008e\11\uffff\1\u008d\2\uffff\1\u008b\3\uffff\1\u008c\1"+
            "\u008f",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00a3\20\uffff\1\u00a2",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\12\35\7\uffff\1\u00ab\13\35\1\u00ac\5\35\1\u00ad\1\u00aa\6"+
            "\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00af",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\2\35\1\u00b1\11\35\1\u00b2\15\35\4\uffff\1\35"+
            "\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\u00c8\21"+
            "\35",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "",
            "\1\u00cd\3\uffff\1\u00cc",
            "\1\u00ce",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00d0",
            "\1\u00d1",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00ec",
            "\1\u00ed",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "",
            "\1\u012e",
            "\1\u012f",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0131",
            "\1\u0132",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u0139",
            "\1\u013a",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u013c",
            "\1\u013d",
            "",
            "",
            "\1\u013e",
            "\1\u013f",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0141",
            "\1\u0142",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFF')) ) {s = 55;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 55;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='L') ) {s = 1;}

                        else if ( (LA12_0=='S') ) {s = 2;}

                        else if ( (LA12_0=='G') ) {s = 3;}

                        else if ( (LA12_0=='A') ) {s = 4;}

                        else if ( (LA12_0=='V') ) {s = 5;}

                        else if ( (LA12_0=='r') ) {s = 6;}

                        else if ( (LA12_0=='p') ) {s = 7;}

                        else if ( (LA12_0=='c') ) {s = 8;}

                        else if ( (LA12_0=='{') ) {s = 9;}

                        else if ( (LA12_0=='}') ) {s = 10;}

                        else if ( (LA12_0==':') ) {s = 11;}

                        else if ( (LA12_0=='v') ) {s = 12;}

                        else if ( (LA12_0=='d') ) {s = 13;}

                        else if ( (LA12_0=='m') ) {s = 14;}

                        else if ( (LA12_0=='s') ) {s = 15;}

                        else if ( (LA12_0=='a') ) {s = 16;}

                        else if ( (LA12_0=='i') ) {s = 17;}

                        else if ( (LA12_0=='n') ) {s = 18;}

                        else if ( (LA12_0=='g') ) {s = 19;}

                        else if ( (LA12_0=='^') ) {s = 20;}

                        else if ( ((LA12_0>='B' && LA12_0<='F')||(LA12_0>='H' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='U')||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='e' && LA12_0<='f')||LA12_0=='h'||(LA12_0>='j' && LA12_0<='l')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='t' && LA12_0<='u')||(LA12_0>='w' && LA12_0<='z')) ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='\"') ) {s = 23;}

                        else if ( (LA12_0=='\'') ) {s = 24;}

                        else if ( (LA12_0=='/') ) {s = 25;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 26;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}