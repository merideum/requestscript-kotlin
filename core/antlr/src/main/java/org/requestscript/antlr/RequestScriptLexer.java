// Generated from RequestScriptLexer.g4 by ANTLR 4.13.1
package org.requestscript.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RequestScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, RETURN=2, REQUEST=3, CONTRACT=4, INT=5, STRING=6, COLON=7, COMMA=8, 
		DOT=9, PAREN_L=10, PAREN_R=11, BRACE_L=12, BRACE_R=13, IDENTIFIER=14, 
		CAPITAL_LETTER=15, LOWERCASE_LETTER=16, LETTER=17, INTEGER=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "RETURN", "REQUEST", "CONTRACT", "INT", "STRING", "COLON", 
			"COMMA", "DOT", "PAREN_L", "PAREN_R", "BRACE_L", "BRACE_R", "IDENTIFIER", 
			"CAPITAL_LETTER", "LOWERCASE_LETTER", "LETTER", "INTEGER", "WS", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'return'", "'request'", "'contract'", "'int'", "'string'", 
			"':'", "','", "'.'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "RETURN", "REQUEST", "CONTRACT", "INT", "STRING", "COLON", 
			"COMMA", "DOT", "PAREN_L", "PAREN_R", "BRACE_L", "BRACE_R", "IDENTIFIER", 
			"CAPITAL_LETTER", "LOWERCASE_LETTER", "LETTER", "INTEGER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public RequestScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RequestScriptLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0003\rd\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\ri\b\r\n\r\f\rl\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0005\u0011v\b\u0011\n\u0011\f\u0011y\t\u0011\u0001\u0011\u0003"+
		"\u0011|\b\u0011\u0001\u0012\u0004\u0012\u007f\b\u0012\u000b\u0012\f\u0012"+
		"\u0080\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0000\u0000\u0014"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0000\u0001\u0000\u0006"+
		"\u0001\u0000AZ\u0001\u0000az\u0002\u0000AZaz\u0001\u000019\u0003\u0000"+
		"\t\n\r\r  \u0001\u000009\u008b\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003"+
		"0\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000\u0007?\u0001"+
		"\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000"+
		"\u0000\rS\u0001\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011"+
		"W\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015[\u0001"+
		"\u0000\u0000\u0000\u0017]\u0001\u0000\u0000\u0000\u0019_\u0001\u0000\u0000"+
		"\u0000\u001bc\u0001\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000\u001f"+
		"o\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000"+
		"\u0000%~\u0001\u0000\u0000\u0000\'\u0084\u0001\u0000\u0000\u0000)*\u0005"+
		"i\u0000\u0000*+\u0005m\u0000\u0000+,\u0005p\u0000\u0000,-\u0005o\u0000"+
		"\u0000-.\u0005r\u0000\u0000./\u0005t\u0000\u0000/\u0002\u0001\u0000\u0000"+
		"\u000001\u0005r\u0000\u000012\u0005e\u0000\u000023\u0005t\u0000\u0000"+
		"34\u0005u\u0000\u000045\u0005r\u0000\u000056\u0005n\u0000\u00006\u0004"+
		"\u0001\u0000\u0000\u000078\u0005r\u0000\u000089\u0005e\u0000\u00009:\u0005"+
		"q\u0000\u0000:;\u0005u\u0000\u0000;<\u0005e\u0000\u0000<=\u0005s\u0000"+
		"\u0000=>\u0005t\u0000\u0000>\u0006\u0001\u0000\u0000\u0000?@\u0005c\u0000"+
		"\u0000@A\u0005o\u0000\u0000AB\u0005n\u0000\u0000BC\u0005t\u0000\u0000"+
		"CD\u0005r\u0000\u0000DE\u0005a\u0000\u0000EF\u0005c\u0000\u0000FG\u0005"+
		"t\u0000\u0000G\b\u0001\u0000\u0000\u0000HI\u0005i\u0000\u0000IJ\u0005"+
		"n\u0000\u0000JK\u0005t\u0000\u0000K\n\u0001\u0000\u0000\u0000LM\u0005"+
		"s\u0000\u0000MN\u0005t\u0000\u0000NO\u0005r\u0000\u0000OP\u0005i\u0000"+
		"\u0000PQ\u0005n\u0000\u0000QR\u0005g\u0000\u0000R\f\u0001\u0000\u0000"+
		"\u0000ST\u0005:\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005,\u0000"+
		"\u0000V\u0010\u0001\u0000\u0000\u0000WX\u0005.\u0000\u0000X\u0012\u0001"+
		"\u0000\u0000\u0000YZ\u0005(\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000"+
		"[\\\u0005)\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000]^\u0005{\u0000"+
		"\u0000^\u0018\u0001\u0000\u0000\u0000_`\u0005}\u0000\u0000`\u001a\u0001"+
		"\u0000\u0000\u0000ad\u0003!\u0010\u0000bd\u0005_\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cb\u0001\u0000\u0000\u0000dj\u0001\u0000\u0000\u0000ei\u0003"+
		"!\u0010\u0000fi\u0005_\u0000\u0000gi\u0003\'\u0013\u0000he\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"k\u001c\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0007\u0000"+
		"\u0000\u0000n\u001e\u0001\u0000\u0000\u0000op\u0007\u0001\u0000\u0000"+
		"p \u0001\u0000\u0000\u0000qr\u0007\u0002\u0000\u0000r\"\u0001\u0000\u0000"+
		"\u0000sw\u0007\u0003\u0000\u0000tv\u0003\'\u0013\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x|\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0005"+
		"0\u0000\u0000{s\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|$\u0001"+
		"\u0000\u0000\u0000}\u007f\u0007\u0004\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0006\u0012\u0000\u0000\u0083&\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0007\u0005\u0000\u0000\u0085(\u0001\u0000\u0000\u0000\u0007\u0000"+
		"chjw{\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}