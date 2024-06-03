// Generated from Merideum.g4 by ANTLR 4.13.1
package org.merideum.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MerideumLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, RETURN=2, COLON=3, COMMA=4, DOT=5, PAREN_L=6, PAREN_R=7, RESOURCE_IDENTIFIER=8, 
		IDENTIFIER=9, CAPITAL_LETTER=10, LOWERCASE_LETTER=11, LETTER=12, INTEGER=13, 
		WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "RETURN", "COLON", "COMMA", "DOT", "PAREN_L", "PAREN_R", "RESOURCE_IDENTIFIER", 
			"IDENTIFIER", "CAPITAL_LETTER", "LOWERCASE_LETTER", "LETTER", "INTEGER", 
			"WS", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'return'", "':'", "','", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "RETURN", "COLON", "COMMA", "DOT", "PAREN_L", "PAREN_R", 
			"RESOURCE_IDENTIFIER", "IDENTIFIER", "CAPITAL_LETTER", "LOWERCASE_LETTER", 
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


	public MerideumLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Merideum.g4"; }

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
		"\u0004\u0000\u000ec\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0005\u0007:\b\u0007\n\u0007\f\u0007=\t\u0007\u0001"+
		"\b\u0001\b\u0003\bA\b\b\u0001\b\u0001\b\u0001\b\u0005\bF\b\b\n\b\f\bI"+
		"\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0005\fS\b\f\n\f\f\fV\t\f\u0001\f\u0003\fY\b\f\u0001\r\u0004\r\\\b"+
		"\r\u000b\r\f\r]\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u0000\u0001\u0000\u0006\u0001\u0000AZ\u0001\u0000az\u0002\u0000"+
		"AZaz\u0001\u000019\u0003\u0000\t\n\r\r  \u0001\u000009i\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000"+
		"\u0000\u0003&\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007"+
		"/\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000"+
		"\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000"+
		"\u0011@\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015L"+
		"\u0001\u0000\u0000\u0000\u0017N\u0001\u0000\u0000\u0000\u0019X\u0001\u0000"+
		"\u0000\u0000\u001b[\u0001\u0000\u0000\u0000\u001da\u0001\u0000\u0000\u0000"+
		"\u001f \u0005i\u0000\u0000 !\u0005m\u0000\u0000!\"\u0005p\u0000\u0000"+
		"\"#\u0005o\u0000\u0000#$\u0005r\u0000\u0000$%\u0005t\u0000\u0000%\u0002"+
		"\u0001\u0000\u0000\u0000&\'\u0005r\u0000\u0000\'(\u0005e\u0000\u0000("+
		")\u0005t\u0000\u0000)*\u0005u\u0000\u0000*+\u0005r\u0000\u0000+,\u0005"+
		"n\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005:\u0000\u0000.\u0006"+
		"\u0001\u0000\u0000\u0000/0\u0005,\u0000\u00000\b\u0001\u0000\u0000\u0000"+
		"12\u0005.\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005(\u0000\u0000"+
		"4\f\u0001\u0000\u0000\u000056\u0005)\u0000\u00006\u000e\u0001\u0000\u0000"+
		"\u00007;\u0003\u0013\t\u00008:\u0003\u0017\u000b\u000098\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">A\u0003\u0017\u000b\u0000?A\u0005_\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000AG\u0001\u0000\u0000\u0000BF\u0003\u0017\u000b"+
		"\u0000CF\u0005_\u0000\u0000DF\u0003\u001d\u000e\u0000EB\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0012"+
		"\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0007\u0000\u0000"+
		"\u0000K\u0014\u0001\u0000\u0000\u0000LM\u0007\u0001\u0000\u0000M\u0016"+
		"\u0001\u0000\u0000\u0000NO\u0007\u0002\u0000\u0000O\u0018\u0001\u0000"+
		"\u0000\u0000PT\u0007\u0003\u0000\u0000QS\u0003\u001d\u000e\u0000RQ\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UY\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000WY\u00050\u0000\u0000XP\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000Y\u001a\u0001\u0000\u0000\u0000Z\\\u0007\u0004\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0006\r\u0000\u0000"+
		"`\u001c\u0001\u0000\u0000\u0000ab\u0007\u0005\u0000\u0000b\u001e\u0001"+
		"\u0000\u0000\u0000\b\u0000;@EGTX]\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}