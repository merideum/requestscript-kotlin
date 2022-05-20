// Generated from Merit.g4 by ANTLR 4.10.1
package org.merideum.merit.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeritParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, ASSIGN=2, DOT=3, OUTPUT=4, CONST=5, VAR=6, DEPENDENCY_NAME=7, 
		IDENTIFIER=8, COLON=9, CAPITAL_LETTER=10, LETTER=11, INTEGER=12, WS=13;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_importDependency = 2, RULE_statement = 3, 
		RULE_outputAssignment = 4, RULE_variableAssignment = 5, RULE_assignment = 6, 
		RULE_expression = 7, RULE_variableModifier = 8, RULE_dependencyPathIdentifier = 9, 
		RULE_simpleIdentifier = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "importDependency", "statement", "outputAssignment", 
			"variableAssignment", "assignment", "expression", "variableModifier", 
			"dependencyPathIdentifier", "simpleIdentifier"
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

	@Override
	public String getGrammarFileName() { return "Merit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MeritParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MeritParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			block();
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<ImportDependencyContext> importDependency() {
			return getRuleContexts(ImportDependencyContext.class);
		}
		public ImportDependencyContext importDependency(int i) {
			return getRuleContext(ImportDependencyContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(25);
				importDependency();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(31);
					match(WS);
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << CONST) | (1L << VAR) | (1L << IDENTIFIER) | (1L << WS))) != 0)) {
				{
				{
				setState(37);
				statement();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDependencyContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MeritParser.IMPORT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MeritParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MeritParser.COLON, 0); }
		public TerminalNode DEPENDENCY_NAME() { return getToken(MeritParser.DEPENDENCY_NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public DependencyPathIdentifierContext dependencyPathIdentifier() {
			return getRuleContext(DependencyPathIdentifierContext.class,0);
		}
		public ImportDependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDependency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterImportDependency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitImportDependency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitImportDependency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDependencyContext importDependency() throws RecognitionException {
		ImportDependencyContext _localctx = new ImportDependencyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDependency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(IMPORT);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(44);
				match(WS);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(IDENTIFIER);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(51);
				match(WS);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(COLON);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(58);
				match(WS);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(64);
				dependencyPathIdentifier();
				}
			}

			{
			setState(67);
			match(DEPENDENCY_NAME);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public OutputAssignmentContext outputAssignment() {
			return getRuleContext(OutputAssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VAR:
			case IDENTIFIER:
			case WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				variableAssignment();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				outputAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputAssignmentContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(MeritParser.OUTPUT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public OutputAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterOutputAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitOutputAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitOutputAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputAssignmentContext outputAssignment() throws RecognitionException {
		OutputAssignmentContext _localctx = new OutputAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_outputAssignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(OUTPUT);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(74);
				match(WS);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			simpleIdentifier();
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(WS);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(87);
				assignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableAssignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || _la==VAR) {
				{
				setState(90);
				variableModifier();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(93);
				match(WS);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			simpleIdentifier();
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(WS);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(106);
				assignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MeritParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(109);
			match(ASSIGN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(110);
				match(WS);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerExpressionContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(MeritParser.INTEGER, 0); }
		public IntegerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			_localctx = new IntegerExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(MeritParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(MeritParser.VAR, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==CONST || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DependencyPathIdentifierContext extends ParserRuleContext {
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(MeritParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MeritParser.DOT, i);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public DependencyPathIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencyPathIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterDependencyPathIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitDependencyPathIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitDependencyPathIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyPathIdentifierContext dependencyPathIdentifier() throws RecognitionException {
		DependencyPathIdentifierContext _localctx = new DependencyPathIdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dependencyPathIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			simpleIdentifier();
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(123);
						match(WS);
						}
						}
						setState(128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(129);
					match(DOT);
					setState(130);
					simpleIdentifier();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(136);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MeritParser.IDENTIFIER, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitSimpleIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitSimpleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\r\u008d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001\f\u0001\u001e\t\u0001"+
		"\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001\u0001"+
		"\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00025\b\u0002\n\u0002\f\u00028\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t\u0002\u0001\u0002\u0003\u0002"+
		"B\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"H\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004L\b\u0004\n\u0004\f\u0004"+
		"O\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004S\b\u0004\n\u0004\f\u0004"+
		"V\t\u0004\u0001\u0004\u0003\u0004Y\b\u0004\u0001\u0005\u0003\u0005\\\b"+
		"\u0005\u0001\u0005\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005\u0001"+
		"\u0005\u0003\u0005l\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006p\b\u0006"+
		"\n\u0006\f\u0006s\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t}\b\t\n\t\f\t\u0080\t\t\u0001"+
		"\t\u0001\t\u0005\t\u0084\b\t\n\t\f\t\u0087\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0001\u0001\u0000\u0005\u0006\u0093\u0000\u0016"+
		"\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004+\u0001"+
		"\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000"+
		"\u0000\n[\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000ev\u0001"+
		"\u0000\u0000\u0000\u0010x\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000"+
		"\u0000\u0014\u008a\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001"+
		"\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000"+
		"\u0000\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\"\u0001\u0000\u0000\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001f!\u0005\r\u0000\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#(\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000%\'\u0003\u0006\u0003\u0000&%\u0001\u0000\u0000\u0000\'*\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")\u0003\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+/\u0005\u0001"+
		"\u0000\u0000,.\u0005\r\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000026\u0005\b\u0000\u000035\u0005"+
		"\r\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u00009=\u0005\t\u0000\u0000:<\u0005\r\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000@B\u0003\u0012\t\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0007\u0000\u0000D\u0005"+
		"\u0001\u0000\u0000\u0000EH\u0003\n\u0005\u0000FH\u0003\b\u0004\u0000G"+
		"E\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0007\u0001\u0000"+
		"\u0000\u0000IM\u0005\u0004\u0000\u0000JL\u0005\r\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PT\u0003\u0014\n\u0000QS\u0005\r\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0003\f\u0006"+
		"\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\t\u0001\u0000"+
		"\u0000\u0000Z\\\u0003\u0010\b\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\`\u0001\u0000\u0000\u0000]_\u0005\r\u0000\u0000^]"+
		"\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000cg\u0003\u0014\n\u0000df\u0005\r\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jl\u0003\f\u0006\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"l\u000b\u0001\u0000\u0000\u0000mq\u0005\u0002\u0000\u0000np\u0005\r\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tu\u0003\u000e\u0007\u0000u\r\u0001\u0000\u0000\u0000"+
		"vw\u0005\f\u0000\u0000w\u000f\u0001\u0000\u0000\u0000xy\u0007\u0000\u0000"+
		"\u0000y\u0011\u0001\u0000\u0000\u0000z\u0085\u0003\u0014\n\u0000{}\u0005"+
		"\r\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\u0003\u0000\u0000\u0082\u0084\u0003\u0014\n\u0000\u0083~\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0003"+
		"\u0000\u0000\u0089\u0013\u0001\u0000\u0000\u0000\u008a\u008b\u0005\b\u0000"+
		"\u0000\u008b\u0015\u0001\u0000\u0000\u0000\u0012\u001c\"(/6=AGMTX[`gk"+
		"q~\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}