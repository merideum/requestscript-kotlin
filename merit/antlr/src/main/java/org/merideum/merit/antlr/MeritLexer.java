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
		IMPORT=1, ASSIGN=2, DOT=3, OUTPUT=4, CONST=5, VAR=6, DEPENDENCY_NAME=7, 
		IDENTIFIER=8, COLON=9, CAPITAL_LETTER=10, LETTER=11, INTEGER=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "ASSIGN", "DOT", "OUTPUT", "CONST", "VAR", "DEPENDENCY_NAME", 
			"IDENTIFIER", "COLON", "CAPITAL_LETTER", "LETTER", "INTEGER", "DIGIT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'='", "'.'", "'output'", "'const'", "'var'", null, 
			null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "ASSIGN", "DOT", "OUTPUT", "CONST", "VAR", "DEPENDENCY_NAME", 
			"IDENTIFIER", "COLON", "CAPITAL_LETTER", "LETTER", "INTEGER", "WS"
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
		"\u0004\u0000\rg\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006>\b\u0006\n\u0006\f\u0006A\t\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007E\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007J\b\u0007"+
		"\n\u0007\f\u0007M\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0005\u000bW\b\u000b\n\u000b\f\u000bZ\t\u000b"+
		"\u0001\u000b\u0003\u000b]\b\u000b\u0001\f\u0001\f\u0001\r\u0004\rb\b\r"+
		"\u000b\r\f\rc\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\u0000\u001b\r\u0001\u0000\u0005\u0001\u0000"+
		"AZ\u0002\u0000AZaz\u0001\u000019\u0001\u000009\u0003\u0000\t\n\r\r  o"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003$\u0001"+
		"\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000"+
		"\u0000\t/\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r9\u0001"+
		"\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000"+
		"\u0000\u0013P\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017"+
		"\\\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001ba\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005i\u0000\u0000\u001e\u001f\u0005m\u0000"+
		"\u0000\u001f \u0005p\u0000\u0000 !\u0005o\u0000\u0000!\"\u0005r\u0000"+
		"\u0000\"#\u0005t\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005=\u0000"+
		"\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005.\u0000\u0000\'\u0006\u0001"+
		"\u0000\u0000\u0000()\u0005o\u0000\u0000)*\u0005u\u0000\u0000*+\u0005t"+
		"\u0000\u0000+,\u0005p\u0000\u0000,-\u0005u\u0000\u0000-.\u0005t\u0000"+
		"\u0000.\b\u0001\u0000\u0000\u0000/0\u0005c\u0000\u000001\u0005o\u0000"+
		"\u000012\u0005n\u0000\u000023\u0005s\u0000\u000034\u0005t\u0000\u0000"+
		"4\n\u0001\u0000\u0000\u000056\u0005v\u0000\u000067\u0005a\u0000\u0000"+
		"78\u0005r\u0000\u00008\f\u0001\u0000\u0000\u00009?\u0003\u0013\t\u0000"+
		":>\u0003\u0015\n\u0000;>\u0005_\u0000\u0000<>\u0003\u0019\f\u0000=:\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000"+
		">A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@\u000e\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BE\u0003"+
		"\u0015\n\u0000CE\u0005_\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000EK\u0001\u0000\u0000\u0000FJ\u0003\u0015\n\u0000GJ\u0005"+
		"_\u0000\u0000HJ\u0003\u0019\f\u0000IF\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0010\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005:\u0000\u0000O\u0012\u0001"+
		"\u0000\u0000\u0000PQ\u0007\u0000\u0000\u0000Q\u0014\u0001\u0000\u0000"+
		"\u0000RS\u0007\u0001\u0000\u0000S\u0016\u0001\u0000\u0000\u0000TX\u0007"+
		"\u0002\u0000\u0000UW\u0003\u0019\f\u0000VU\u0001\u0000\u0000\u0000WZ\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y]\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u00050\u0000\u0000"+
		"\\T\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0018\u0001\u0000"+
		"\u0000\u0000^_\u0007\u0003\u0000\u0000_\u001a\u0001\u0000\u0000\u0000"+
		"`b\u0007\u0004\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0006\r\u0000\u0000f\u001c\u0001\u0000\u0000\u0000\t\u0000"+
		"=?DIKX\\c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}