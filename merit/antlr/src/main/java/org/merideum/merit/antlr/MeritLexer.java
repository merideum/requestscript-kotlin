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
		IMPORT=1, ASSIGN=2, DOT=3, OUTPUT=4, CONST=5, VAR=6, RESOURCE_NAME=7, 
		IDENTIFIER=8, COLON=9, COMMA=10, PAREN_L=11, PAREN_R=12, CAPITAL_LETTER=13, 
		LETTER=14, INTEGER=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "ASSIGN", "DOT", "OUTPUT", "CONST", "VAR", "RESOURCE_NAME", 
			"IDENTIFIER", "COLON", "COMMA", "PAREN_L", "PAREN_R", "CAPITAL_LETTER", 
			"LETTER", "INTEGER", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'='", "'.'", "'output'", "'const'", "'var'", null, 
			null, "':'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "ASSIGN", "DOT", "OUTPUT", "CONST", "VAR", "RESOURCE_NAME", 
			"IDENTIFIER", "COLON", "COMMA", "PAREN_L", "PAREN_R", "CAPITAL_LETTER", 
			"LETTER", "INTEGER", "WS"
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
		"\u0004\u0000\u0010s\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007K\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007P\b\u0007"+
		"\n\u0007\f\u0007S\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000ec\b\u000e\n\u000e\f\u000ef\t\u000e\u0001\u000e"+
		"\u0003\u000ei\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"n\b\u0010\u000b\u0010\f\u0010o\u0001\u0010\u0001\u0010\u0000\u0000\u0011"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0000!\u0010\u0001\u0000\u0005\u0001\u0000AZ\u0002"+
		"\u0000AZaz\u0001\u000019\u0001\u000009\u0003\u0000\t\n\r\r  {\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000"+
		"\u0003*\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u0007."+
		"\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b;\u0001\u0000"+
		"\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000"+
		"\u0011T\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015X"+
		"\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\\u0001"+
		"\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001dh\u0001\u0000\u0000"+
		"\u0000\u001fj\u0001\u0000\u0000\u0000!m\u0001\u0000\u0000\u0000#$\u0005"+
		"i\u0000\u0000$%\u0005m\u0000\u0000%&\u0005p\u0000\u0000&\'\u0005o\u0000"+
		"\u0000\'(\u0005r\u0000\u0000()\u0005t\u0000\u0000)\u0002\u0001\u0000\u0000"+
		"\u0000*+\u0005=\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005.\u0000"+
		"\u0000-\u0006\u0001\u0000\u0000\u0000./\u0005o\u0000\u0000/0\u0005u\u0000"+
		"\u000001\u0005t\u0000\u000012\u0005p\u0000\u000023\u0005u\u0000\u0000"+
		"34\u0005t\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005c\u0000\u0000"+
		"67\u0005o\u0000\u000078\u0005n\u0000\u000089\u0005s\u0000\u00009:\u0005"+
		"t\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005v\u0000\u0000<=\u0005"+
		"a\u0000\u0000=>\u0005r\u0000\u0000>\f\u0001\u0000\u0000\u0000?E\u0003"+
		"\u0019\f\u0000@D\u0003\u001b\r\u0000AD\u0005_\u0000\u0000BD\u0003\u001f"+
		"\u000f\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000HK\u0003\u001b\r\u0000IK\u0005_\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000KQ\u0001\u0000\u0000\u0000LP\u0003"+
		"\u001b\r\u0000MP\u0005_\u0000\u0000NP\u0003\u001f\u000f\u0000OL\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000R\u0010\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005"+
		":\u0000\u0000U\u0012\u0001\u0000\u0000\u0000VW\u0005,\u0000\u0000W\u0014"+
		"\u0001\u0000\u0000\u0000XY\u0005(\u0000\u0000Y\u0016\u0001\u0000\u0000"+
		"\u0000Z[\u0005)\u0000\u0000[\u0018\u0001\u0000\u0000\u0000\\]\u0007\u0000"+
		"\u0000\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0007\u0001\u0000\u0000"+
		"_\u001c\u0001\u0000\u0000\u0000`d\u0007\u0002\u0000\u0000ac\u0003\u001f"+
		"\u000f\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ei\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000gi\u00050\u0000\u0000h`\u0001\u0000\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000i\u001e\u0001\u0000\u0000\u0000jk\u0007\u0003"+
		"\u0000\u0000k \u0001\u0000\u0000\u0000ln\u0007\u0004\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0006\u0010\u0000"+
		"\u0000r\"\u0001\u0000\u0000\u0000\t\u0000CEJOQdho\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}