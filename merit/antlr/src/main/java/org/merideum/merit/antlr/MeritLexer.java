// Generated from Merit.g4 by ANTLR 4.10.1
package org.merideum.merit.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeritLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, ASSIGN=2, DOT=3, DOUBLE_QUOTE=4, OUTPUT=5, CONST=6, VAR=7, TYPE_INT=8, 
		TYPE_STRING=9, RESOURCE_NAME=10, IDENTIFIER=11, STRING=12, COLON=13, COMMA=14, 
		PAREN_L=15, PAREN_R=16, CAPITAL_LETTER=17, LETTER=18, INTEGER=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "ASSIGN", "DOT", "DOUBLE_QUOTE", "OUTPUT", "CONST", "VAR", 
			"TYPE_INT", "TYPE_STRING", "RESOURCE_NAME", "IDENTIFIER", "STRING", "COLON", 
			"COMMA", "PAREN_L", "PAREN_R", "CAPITAL_LETTER", "LETTER", "INTEGER", 
			"DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'='", "'.'", "'\"'", "'output'", "'const'", "'var'", 
			"'int'", "'string'", null, null, null, "':'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "ASSIGN", "DOT", "DOUBLE_QUOTE", "OUTPUT", "CONST", "VAR", 
			"TYPE_INT", "TYPE_STRING", "RESOURCE_NAME", "IDENTIFIER", "STRING", "COLON", 
			"COMMA", "PAREN_L", "PAREN_R", "CAPITAL_LETTER", "LETTER", "INTEGER", 
			"WS"
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


	public MeritLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Merit.g4"; }

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
		"\u0004\u0000\u0014\u0093\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tY\b\t\n\t\f\t\\\t\t\u0001\n\u0001\n\u0003\n`\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\ne\b\n\n\n\f\nh\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000bn\b\u000b\n\u000b\f\u000bq\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0083\b\u0012\n\u0012\f\u0012\u0086\t\u0012\u0001"+
		"\u0012\u0003\u0012\u0089\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0004"+
		"\u0014\u008e\b\u0014\u000b\u0014\f\u0014\u008f\u0001\u0014\u0001\u0014"+
		"\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0000)\u0014"+
		"\u0001\u0000\u0007\u0004\u0000\n\n\r\r\"\"\\\\\u0002\u0000\n\n\r\r\u0001"+
		"\u0000AZ\u0002\u0000AZaz\u0001\u000019\u0001\u000009\u0003\u0000\t\n\r"+
		"\r  \u009d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000"+
		"\u0000\u0000\u00032\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000\u0000"+
		"\u00076\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b?\u0001"+
		"\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fI\u0001\u0000\u0000"+
		"\u0000\u0011M\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000\u0015"+
		"_\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019t\u0001"+
		"\u0000\u0000\u0000\u001bv\u0001\u0000\u0000\u0000\u001dx\u0001\u0000\u0000"+
		"\u0000\u001fz\u0001\u0000\u0000\u0000!|\u0001\u0000\u0000\u0000#~\u0001"+
		"\u0000\u0000\u0000%\u0088\u0001\u0000\u0000\u0000\'\u008a\u0001\u0000"+
		"\u0000\u0000)\u008d\u0001\u0000\u0000\u0000+,\u0005i\u0000\u0000,-\u0005"+
		"m\u0000\u0000-.\u0005p\u0000\u0000./\u0005o\u0000\u0000/0\u0005r\u0000"+
		"\u000001\u0005t\u0000\u00001\u0002\u0001\u0000\u0000\u000023\u0005=\u0000"+
		"\u00003\u0004\u0001\u0000\u0000\u000045\u0005.\u0000\u00005\u0006\u0001"+
		"\u0000\u0000\u000067\u0005\"\u0000\u00007\b\u0001\u0000\u0000\u000089"+
		"\u0005o\u0000\u00009:\u0005u\u0000\u0000:;\u0005t\u0000\u0000;<\u0005"+
		"p\u0000\u0000<=\u0005u\u0000\u0000=>\u0005t\u0000\u0000>\n\u0001\u0000"+
		"\u0000\u0000?@\u0005c\u0000\u0000@A\u0005o\u0000\u0000AB\u0005n\u0000"+
		"\u0000BC\u0005s\u0000\u0000CD\u0005t\u0000\u0000D\f\u0001\u0000\u0000"+
		"\u0000EF\u0005v\u0000\u0000FG\u0005a\u0000\u0000GH\u0005r\u0000\u0000"+
		"H\u000e\u0001\u0000\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005n\u0000\u0000"+
		"KL\u0005t\u0000\u0000L\u0010\u0001\u0000\u0000\u0000MN\u0005s\u0000\u0000"+
		"NO\u0005t\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005"+
		"n\u0000\u0000RS\u0005g\u0000\u0000S\u0012\u0001\u0000\u0000\u0000TZ\u0003"+
		"!\u0010\u0000UY\u0003#\u0011\u0000VY\u0005_\u0000\u0000WY\u0003\'\u0013"+
		"\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\u0014\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]`\u0003#\u0011\u0000^`\u0005_\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000`f\u0001\u0000\u0000\u0000ae\u0003#\u0011\u0000"+
		"be\u0005_\u0000\u0000ce\u0003\'\u0013\u0000da\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0016\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000io\u0003\u0007\u0003\u0000"+
		"jn\b\u0000\u0000\u0000kl\u0005\\\u0000\u0000ln\b\u0001\u0000\u0000mj\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rs\u0003\u0007\u0003\u0000s\u0018\u0001"+
		"\u0000\u0000\u0000tu\u0005:\u0000\u0000u\u001a\u0001\u0000\u0000\u0000"+
		"vw\u0005,\u0000\u0000w\u001c\u0001\u0000\u0000\u0000xy\u0005(\u0000\u0000"+
		"y\u001e\u0001\u0000\u0000\u0000z{\u0005)\u0000\u0000{ \u0001\u0000\u0000"+
		"\u0000|}\u0007\u0002\u0000\u0000}\"\u0001\u0000\u0000\u0000~\u007f\u0007"+
		"\u0003\u0000\u0000\u007f$\u0001\u0000\u0000\u0000\u0080\u0084\u0007\u0004"+
		"\u0000\u0000\u0081\u0083\u0003\'\u0013\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0089\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089\u00050\u0000\u0000"+
		"\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089&\u0001\u0000\u0000\u0000\u008a\u008b\u0007\u0005\u0000\u0000\u008b"+
		"(\u0001\u0000\u0000\u0000\u008c\u008e\u0007\u0006\u0000\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u0014\u0000\u0000\u0092*\u0001"+
		"\u0000\u0000\u0000\u000b\u0000XZ_dfmo\u0084\u0088\u008f\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}