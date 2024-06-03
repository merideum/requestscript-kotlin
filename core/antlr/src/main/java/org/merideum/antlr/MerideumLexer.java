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
		IMPORT=1, RETURN=2, COLON=3, DOT=4, RESOURCE_PATH=5, RESOURCE_PATH_SEGMENT=6, 
		RESOURCE_IDENTIFIER=7, IDENTIFIER=8, CAPITAL_LETTER=9, LOWERCASE_LETTER=10, 
		LETTER=11, INTEGER=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "RETURN", "COLON", "DOT", "RESOURCE_PATH", "RESOURCE_PATH_SEGMENT", 
			"RESOURCE_IDENTIFIER", "IDENTIFIER", "CAPITAL_LETTER", "LOWERCASE_LETTER", 
			"LETTER", "INTEGER", "WS", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'return'", "':'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "RETURN", "COLON", "DOT", "RESOURCE_PATH", "RESOURCE_PATH_SEGMENT", 
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
		"\u0004\u0000\rk\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u00041\b"+
		"\u0004\n\u0004\f\u00044\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005"+
		"\u00059\b\u0005\n\u0005\f\u0005<\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006B\b\u0006\n\u0006\f\u0006E\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007I\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007N\b\u0007\n\u0007\f\u0007Q\t\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b[\b\u000b"+
		"\n\u000b\f\u000b^\t\u000b\u0001\u000b\u0003\u000ba\b\u000b\u0001\f\u0004"+
		"\fd\b\f\u000b\f\f\fe\u0001\f\u0001\f\u0001\r\u0001\r\u0000\u0000\u000e"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000"+
		"\u0001\u0000\u0006\u0001\u0000AZ\u0001\u0000az\u0002\u0000AZaz\u0001\u0000"+
		"19\u0003\u0000\t\n\r\r  \u0001\u000009s\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001"+
		"\u001d\u0001\u0000\u0000\u0000\u0003$\u0001\u0000\u0000\u0000\u0005+\u0001"+
		"\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000"+
		"\u0000\u000b:\u0001\u0000\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000f"+
		"H\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013T\u0001"+
		"\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017`\u0001\u0000\u0000"+
		"\u0000\u0019c\u0001\u0000\u0000\u0000\u001bi\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005i\u0000\u0000\u001e\u001f\u0005m\u0000\u0000\u001f \u0005"+
		"p\u0000\u0000 !\u0005o\u0000\u0000!\"\u0005r\u0000\u0000\"#\u0005t\u0000"+
		"\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005r\u0000\u0000%&\u0005e\u0000"+
		"\u0000&\'\u0005t\u0000\u0000\'(\u0005u\u0000\u0000()\u0005r\u0000\u0000"+
		")*\u0005n\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005:\u0000\u0000"+
		",\u0006\u0001\u0000\u0000\u0000-.\u0005.\u0000\u0000.\b\u0001\u0000\u0000"+
		"\u0000/1\u0003\u000b\u0005\u00000/\u0001\u0000\u0000\u000014\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0003\r\u0006\u00006\n"+
		"\u0001\u0000\u0000\u000079\u0003\u0013\t\u000087\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0003\u0007"+
		"\u0003\u0000>\f\u0001\u0000\u0000\u0000?C\u0003\u0011\b\u0000@B\u0003"+
		"\u0015\n\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u000e\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FI\u0003\u0015\n\u0000GI\u0005_\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IO\u0001\u0000"+
		"\u0000\u0000JN\u0003\u0015\n\u0000KN\u0005_\u0000\u0000LN\u0003\u001b"+
		"\r\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RS\u0007\u0000\u0000\u0000S\u0012\u0001\u0000\u0000\u0000TU\u0007"+
		"\u0001\u0000\u0000U\u0014\u0001\u0000\u0000\u0000VW\u0007\u0002\u0000"+
		"\u0000W\u0016\u0001\u0000\u0000\u0000X\\\u0007\u0003\u0000\u0000Y[\u0003"+
		"\u001b\r\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z"+
		"\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]a\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_a\u00050\u0000\u0000`X\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000a\u0018\u0001\u0000\u0000\u0000bd\u0007"+
		"\u0004\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0006\f\u0000\u0000h\u001a\u0001\u0000\u0000\u0000ij\u0007\u0005"+
		"\u0000\u0000j\u001c\u0001\u0000\u0000\u0000\n\u00002:CHMO\\`e\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}