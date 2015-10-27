// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g 2015-10-27 11:56:02

  package iotsuite.parser; 
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class VocabSpecLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int WS=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public VocabSpecLexer() {} 
	public VocabSpecLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public VocabSpecLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:12:6: ( '(' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:12:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:13:6: ( ')' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:13:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:14:7: ( ',' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:14:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:15:7: ( ':' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:15:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:16:7: ( ';' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:16:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:17:7: ( 'Boolean' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:17:9: 'Boolean'
			{
			match("Boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:18:7: ( 'Button' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:18:9: 'Button'
			{
			match("Button"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:19:7: ( 'Integer' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:19:9: 'Integer'
			{
			match("Integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:20:7: ( 'String' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:20:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:21:7: ( 'TextBox' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:21:9: 'TextBox'
			{
			match("TextBox"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:22:7: ( 'TextView' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:22:9: 'TextView'
			{
			match("TextView"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:23:7: ( '_' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:23:9: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:24:7: ( 'accessed-by' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:24:9: 'accessed-by'
			{
			match("accessed-by"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:25:7: ( 'action' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:25:9: 'action'
			{
			match("action"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:26:7: ( 'actuators' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:26:9: 'actuators'
			{
			match("actuators"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:27:7: ( 'boolean' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:27:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:28:7: ( 'command' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:28:9: 'command'
			{
			match("command"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:29:7: ( 'double' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:29:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:30:7: ( 'eventdriven' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:30:9: 'eventdriven'
			{
			match("eventdriven"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:31:7: ( 'for' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:31:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:32:7: ( 'generate' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:32:9: 'generate'
			{
			match("generate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:33:7: ( 'interactions' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:33:9: 'interactions'
			{
			match("interactions"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:34:7: ( 'long' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:34:9: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:35:7: ( 'onCondition' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:35:9: 'onCondition'
			{
			match("onCondition"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:36:7: ( 'period' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:36:9: 'period'
			{
			match("period"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:37:7: ( 'periodicsensors' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:37:9: 'periodicsensors'
			{
			match("periodicsensors"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:38:7: ( 'regions' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:38:9: 'regions'
			{
			match("regions"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:39:7: ( 'request' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:39:9: 'request'
			{
			match("request"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:40:7: ( 'resources' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:40:9: 'resources'
			{
			match("resources"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:41:7: ( 'sample' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:41:9: 'sample'
			{
			match("sample"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:42:7: ( 'sensors' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:42:9: 'sensors'
			{
			match("sensors"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:43:7: ( 'storages' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:43:9: 'storages'
			{
			match("storages"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:44:7: ( 'structs' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:44:9: 'structs'
			{
			match("structs"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:45:7: ( 'with' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:45:9: 'with'
			{
			match("with"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:285:5: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:285:7: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			matchRange('a','z'); 
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:285:17: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:287:5: ( '0' .. '9' ( '0' .. '9' )* )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:287:7: '0' .. '9' ( '0' .. '9' )*
			{
			matchRange('0','9'); 
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:287:15: ( '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CAPITALIZED_ID"
	public final void mCAPITALIZED_ID() throws RecognitionException {
		try {
			int _type = CAPITALIZED_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:291:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:291:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )*
			{
			matchRange('A','Z'); 
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:291:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAPITALIZED_ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:293:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:293:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:293:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | ID | INT | CAPITALIZED_ID | WS )
		int alt5=38;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:62: T__17
				{
				mT__17(); 

				}
				break;
			case 11 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:68: T__18
				{
				mT__18(); 

				}
				break;
			case 12 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:74: T__19
				{
				mT__19(); 

				}
				break;
			case 13 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:80: T__20
				{
				mT__20(); 

				}
				break;
			case 14 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:86: T__21
				{
				mT__21(); 

				}
				break;
			case 15 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:92: T__22
				{
				mT__22(); 

				}
				break;
			case 16 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:98: T__23
				{
				mT__23(); 

				}
				break;
			case 17 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:104: T__24
				{
				mT__24(); 

				}
				break;
			case 18 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:110: T__25
				{
				mT__25(); 

				}
				break;
			case 19 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:116: T__26
				{
				mT__26(); 

				}
				break;
			case 20 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:122: T__27
				{
				mT__27(); 

				}
				break;
			case 21 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:128: T__28
				{
				mT__28(); 

				}
				break;
			case 22 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:134: T__29
				{
				mT__29(); 

				}
				break;
			case 23 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:140: T__30
				{
				mT__30(); 

				}
				break;
			case 24 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:146: T__31
				{
				mT__31(); 

				}
				break;
			case 25 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:152: T__32
				{
				mT__32(); 

				}
				break;
			case 26 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:158: T__33
				{
				mT__33(); 

				}
				break;
			case 27 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:164: T__34
				{
				mT__34(); 

				}
				break;
			case 28 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:170: T__35
				{
				mT__35(); 

				}
				break;
			case 29 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:176: T__36
				{
				mT__36(); 

				}
				break;
			case 30 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:182: T__37
				{
				mT__37(); 

				}
				break;
			case 31 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:188: T__38
				{
				mT__38(); 

				}
				break;
			case 32 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:194: T__39
				{
				mT__39(); 

				}
				break;
			case 33 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:200: T__40
				{
				mT__40(); 

				}
				break;
			case 34 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:206: T__41
				{
				mT__41(); 

				}
				break;
			case 35 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:212: ID
				{
				mID(); 

				}
				break;
			case 36 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:215: INT
				{
				mINT(); 

				}
				break;
			case 37 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:219: CAPITALIZED_ID
				{
				mCAPITALIZED_ID(); 

				}
				break;
			case 38 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\VocabSpec.g:1:234: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\6\uffff\4\33\1\uffff\16\31\4\uffff\5\33\20\31\5\33\6\31\1\127\15\31\5"+
		"\33\7\31\1\uffff\2\31\1\164\11\31\1\176\6\33\11\31\1\uffff\11\31\1\uffff"+
		"\1\33\1\u0098\1\33\1\u009a\2\33\1\31\1\u009e\3\31\1\u00a2\4\31\1\u00a8"+
		"\3\31\1\u00ac\3\31\1\u00b0\1\uffff\1\u00b1\1\uffff\1\u00b2\1\33\1\31\1"+
		"\uffff\1\31\1\u00b6\1\u00b7\1\uffff\5\31\1\uffff\1\u00bd\1\u00be\1\31"+
		"\1\uffff\1\u00c0\1\31\1\u00c2\3\uffff\1\u00c3\2\31\2\uffff\1\31\1\u00c7"+
		"\3\31\2\uffff\1\31\1\uffff\1\u00cc\3\uffff\1\u00cd\1\31\1\uffff\3\31\1"+
		"\u00d2\2\uffff\4\31\1\uffff\1\u00d7\1\31\1\u00d9\1\31\1\uffff\1\u00db"+
		"\1\uffff\1\31\1\uffff\2\31\1\u00df\1\uffff";
	static final String DFA5_eofS =
		"\u00e0\uffff";
	static final String DFA5_minS =
		"\1\11\5\uffff\1\157\1\156\1\164\1\145\1\uffff\1\143\3\157\1\166\1\157"+
		"\1\145\1\156\1\157\1\156\2\145\1\141\1\151\4\uffff\1\157\2\164\1\162\1"+
		"\170\1\143\1\157\1\155\1\165\1\145\1\162\1\156\1\164\1\156\1\103\1\162"+
		"\1\147\1\155\1\156\1\157\1\164\1\154\1\164\1\145\1\151\1\164\1\145\1\151"+
		"\1\154\1\155\1\142\1\156\1\60\2\145\1\147\1\157\2\151\1\165\1\157\1\160"+
		"\1\163\1\162\1\165\1\150\1\145\1\157\1\147\1\156\1\102\1\163\1\157\1\141"+
		"\1\145\1\141\1\154\1\164\1\uffff\2\162\1\60\1\156\2\157\1\145\1\165\1"+
		"\154\1\157\1\141\1\143\1\60\1\141\1\156\1\145\1\147\1\157\1\151\1\163"+
		"\1\156\1\164\1\141\1\156\1\145\1\144\2\141\1\uffff\2\144\1\156\1\163\1"+
		"\162\1\145\1\162\1\147\1\164\1\uffff\1\156\1\101\1\162\1\101\1\170\2\145"+
		"\1\60\1\157\1\156\1\144\1\60\1\162\1\164\1\143\1\151\1\60\1\163\1\164"+
		"\1\143\1\60\1\163\1\145\1\163\1\101\1\uffff\1\101\1\uffff\1\101\1\167"+
		"\1\144\1\uffff\1\162\2\60\1\uffff\1\151\1\145\2\164\1\143\1\uffff\2\60"+
		"\1\145\1\uffff\1\60\1\163\1\60\3\uffff\1\101\1\55\1\163\2\uffff\1\166"+
		"\1\60\2\151\1\163\2\uffff\1\163\1\uffff\1\60\3\uffff\1\60\1\145\1\uffff"+
		"\2\157\1\145\1\60\2\uffff\4\156\1\uffff\1\60\1\163\1\60\1\163\1\uffff"+
		"\1\60\1\uffff\1\157\1\uffff\1\162\1\163\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\172\5\uffff\1\165\1\156\1\164\1\145\1\uffff\1\143\3\157\1\166\1\157"+
		"\1\145\1\156\1\157\1\156\2\145\1\164\1\151\4\uffff\1\157\2\164\1\162\1"+
		"\170\1\164\1\157\1\155\1\165\1\145\1\162\1\156\1\164\1\156\1\103\1\162"+
		"\1\163\1\155\1\156\1\162\1\164\1\154\1\164\1\145\1\151\1\164\1\145\1\165"+
		"\1\154\1\155\1\142\1\156\1\172\2\145\1\147\1\157\2\151\1\165\1\157\1\160"+
		"\1\163\1\162\1\165\1\150\1\145\1\157\1\147\1\156\1\126\1\163\1\157\1\141"+
		"\1\145\1\141\1\154\1\164\1\uffff\2\162\1\172\1\156\2\157\1\145\1\165\1"+
		"\154\1\157\1\141\1\143\1\172\1\141\1\156\1\145\1\147\1\157\1\151\1\163"+
		"\1\156\1\164\1\141\1\156\1\145\1\144\2\141\1\uffff\2\144\1\156\1\163\1"+
		"\162\1\145\1\162\1\147\1\164\1\uffff\1\156\1\172\1\162\1\172\1\170\2\145"+
		"\1\172\1\157\1\156\1\144\1\172\1\162\1\164\1\143\1\151\1\172\1\163\1\164"+
		"\1\143\1\172\1\163\1\145\1\163\1\172\1\uffff\1\172\1\uffff\1\172\1\167"+
		"\1\144\1\uffff\1\162\2\172\1\uffff\1\151\1\145\2\164\1\143\1\uffff\2\172"+
		"\1\145\1\uffff\1\172\1\163\1\172\3\uffff\1\172\1\55\1\163\2\uffff\1\166"+
		"\1\172\2\151\1\163\2\uffff\1\163\1\uffff\1\172\3\uffff\1\172\1\145\1\uffff"+
		"\2\157\1\145\1\172\2\uffff\4\156\1\uffff\1\172\1\163\1\172\1\163\1\uffff"+
		"\1\172\1\uffff\1\157\1\uffff\1\162\1\163\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\4\uffff\1\14\16\uffff\1\43\1\44\1\45\1\46"+
		"\72\uffff\1\24\34\uffff\1\27\11\uffff\1\42\31\uffff\1\7\1\uffff\1\11\3"+
		"\uffff\1\16\3\uffff\1\22\5\uffff\1\31\3\uffff\1\36\3\uffff\1\6\1\10\1"+
		"\12\3\uffff\1\20\1\21\5\uffff\1\33\1\34\1\uffff\1\37\1\uffff\1\41\1\13"+
		"\1\15\2\uffff\1\25\4\uffff\1\40\1\17\4\uffff\1\35\4\uffff\1\23\1\uffff"+
		"\1\30\1\uffff\1\26\3\uffff\1\32";
	static final String DFA5_specialS =
		"\u00e0\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\34\1\uffff\2\34\22\uffff\1\34\7\uffff\1\1\1\2\2\uffff\1\3\3\uffff"+
			"\12\32\1\4\1\5\5\uffff\1\33\1\6\6\33\1\7\11\33\1\10\1\11\6\33\4\uffff"+
			"\1\12\1\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\31\1\22\2\31\1\23"+
			"\2\31\1\24\1\25\1\31\1\26\1\27\3\31\1\30\3\31",
			"",
			"",
			"",
			"",
			"",
			"\1\35\5\uffff\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56\3\uffff\1\57\16\uffff\1\60",
			"\1\61",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67\20\uffff\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103\11\uffff\1\104\1\uffff\1\105",
			"\1\106",
			"\1\107",
			"\1\110\2\uffff\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121\13\uffff\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151\23\uffff\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"",
			"\1\162",
			"\1\163",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"",
			"\1\u0097",
			"\32\33\6\uffff\32\33",
			"\1\u0099",
			"\32\33\6\uffff\32\33",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\12\31\7\uffff\32\31\6\uffff\10\31\1\u00a7\21\31",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\32\33\6\uffff\32\33",
			"",
			"\32\33\6\uffff\32\33",
			"",
			"\32\33\6\uffff\32\33",
			"\1\u00b3",
			"\1\u00b4",
			"",
			"\1\u00b5",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\u00bf",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\u00c1",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"",
			"",
			"\32\33\6\uffff\32\33",
			"\1\u00c4",
			"\1\u00c5",
			"",
			"",
			"\1\u00c6",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"",
			"",
			"\1\u00cb",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\u00ce",
			"",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\u00d8",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\u00da",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"\1\u00dc",
			"",
			"\1\u00dd",
			"\1\u00de",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | ID | INT | CAPITALIZED_ID | WS );";
		}
	}

}
