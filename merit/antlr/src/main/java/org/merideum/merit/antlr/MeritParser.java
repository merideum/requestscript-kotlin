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
		IMPORT=1, ASSIGN=2, DOT=3, OUTPUT=4, CONST=5, VAR=6, RESOURCE_NAME=7, 
		IDENTIFIER=8, COLON=9, COMMA=10, PAREN_L=11, PAREN_R=12, CAPITAL_LETTER=13, 
		LETTER=14, INTEGER=15, WS=16;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_importResource = 2, RULE_statement = 3, 
		RULE_outputAssignment = 4, RULE_variableAssignment = 5, RULE_assignment = 6, 
		RULE_expression = 7, RULE_functionCall = 8, RULE_functionParameters = 9, 
		RULE_variableModifier = 10, RULE_resourcePathIdentifier = 11, RULE_simpleIdentifier = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "importResource", "statement", "outputAssignment", 
			"variableAssignment", "assignment", "expression", "functionCall", "functionParameters", 
			"variableModifier", "resourcePathIdentifier", "simpleIdentifier"
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
			setState(26);
			block();
			setState(27);
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
		public List<ImportResourceContext> importResource() {
			return getRuleContexts(ImportResourceContext.class);
		}
		public ImportResourceContext importResource(int i) {
			return getRuleContext(ImportResourceContext.class,i);
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
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(29);
				importResource();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					match(WS);
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << CONST) | (1L << VAR) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << WS))) != 0)) {
				{
				{
				setState(41);
				statement();
				}
				}
				setState(46);
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

	public static class ImportResourceContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MeritParser.IMPORT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MeritParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MeritParser.COLON, 0); }
		public TerminalNode RESOURCE_NAME() { return getToken(MeritParser.RESOURCE_NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ResourcePathIdentifierContext resourcePathIdentifier() {
			return getRuleContext(ResourcePathIdentifierContext.class,0);
		}
		public ImportResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importResource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterImportResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitImportResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitImportResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportResourceContext importResource() throws RecognitionException {
		ImportResourceContext _localctx = new ImportResourceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importResource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IMPORT);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(48);
				match(WS);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(IDENTIFIER);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(55);
				match(WS);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(COLON);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(62);
				match(WS);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(68);
				resourcePathIdentifier();
				}
			}

			{
			setState(71);
			match(RESOURCE_NAME);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				expression(0);
				setState(74);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				variableAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				outputAssignment();
				}
				break;
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
			setState(80);
			match(OUTPUT);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(81);
				match(WS);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			simpleIdentifier();
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(WS);
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(94);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || _la==VAR) {
				{
				setState(97);
				variableModifier();
				}
			}

			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(100);
				match(WS);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			simpleIdentifier();
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(WS);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(113);
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
			setState(116);
			match(ASSIGN);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(117);
				match(WS);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			expression(0);
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
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleIdentifierExpressionContext extends ExpressionContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public SimpleIdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterSimpleIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitSimpleIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitSimpleIdentifierExpression(this);
			else return visitor.visitChildren(this);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(126);
				match(INTEGER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new SimpleIdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				simpleIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(130);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(131);
					functionCall();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MeritParser.DOT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode PAREN_L() { return getToken(MeritParser.PAREN_L, 0); }
		public TerminalNode PAREN_R() { return getToken(MeritParser.PAREN_R, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DOT);
			setState(138);
			simpleIdentifier();
			setState(139);
			match(PAREN_L);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==INTEGER) {
				{
				setState(140);
				functionParameters();
				}
			}

			setState(143);
			match(PAREN_R);
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MeritParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MeritParser.COMMA, i);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			expression(0);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(146);
					match(COMMA);
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(147);
						match(WS);
						}
						}
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(153);
					expression(0);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 20, RULE_variableModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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

	public static class ResourcePathIdentifierContext extends ParserRuleContext {
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
		public ResourcePathIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourcePathIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).enterResourcePathIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritListener ) ((MeritListener)listener).exitResourcePathIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritVisitor ) return ((MeritVisitor<? extends T>)visitor).visitResourcePathIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcePathIdentifierContext resourcePathIdentifier() throws RecognitionException {
		ResourcePathIdentifierContext _localctx = new ResourcePathIdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_resourcePathIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			simpleIdentifier();
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(162);
						match(WS);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(168);
					match(DOT);
					setState(169);
					simpleIdentifier();
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(175);
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
		enterRule(_localctx, 24, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010\u00b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005"+
		"\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0001\u0005\u0001"+
		"%\b\u0001\n\u0001\f\u0001(\t\u0001\u0001\u0001\u0005\u0001+\b\u0001\n"+
		"\u0001\f\u0001.\t\u0001\u0001\u0002\u0001\u0002\u0005\u00022\b\u0002\n"+
		"\u0002\f\u00025\t\u0002\u0001\u0002\u0001\u0002\u0005\u00029\b\u0002\n"+
		"\u0002\f\u0002<\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002@\b\u0002\n"+
		"\u0002\f\u0002C\t\u0002\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003O\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004S\b\u0004\n\u0004\f"+
		"\u0004V\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004Z\b\u0004\n\u0004\f"+
		"\u0004]\t\u0004\u0001\u0004\u0003\u0004`\b\u0004\u0001\u0005\u0003\u0005"+
		"c\b\u0005\u0001\u0005\u0005\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005\u0001"+
		"\u0005\u0003\u0005s\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006w\b\u0006"+
		"\n\u0006\f\u0006z\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0085\b\u0007\n\u0007\f\u0007\u0088\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u008e\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0095"+
		"\b\t\n\t\f\t\u0098\t\t\u0001\t\u0005\t\u009b\b\t\n\t\f\t\u009e\t\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u00a4\b\u000b\n\u000b\f"+
		"\u000b\u00a7\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ab\b\u000b"+
		"\n\u000b\f\u000b\u00ae\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\u009c\u0001\u000e\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0005\u0006\u00be"+
		"\u0000\u001a\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004"+
		"/\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bP\u0001\u0000"+
		"\u0000\u0000\nb\u0001\u0000\u0000\u0000\ft\u0001\u0000\u0000\u0000\u000e"+
		"\u0080\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000\u0000\u0000\u0012"+
		"\u0091\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000\u0000\u0000\u0016"+
		"\u00a1\u0001\u0000\u0000\u0000\u0018\u00b1\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c"+
		"\u0001\u0001\u0000\u0000\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e"+
		"\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!&\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000#%\u0005\u0010\u0000\u0000$#\u0001\u0000"+
		"\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\',\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		")+\u0003\u0006\u0003\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0003\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/3\u0005\u0001\u0000\u0000"+
		"02\u0005\u0010\u0000\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u00006:\u0005\b\u0000\u000079\u0005\u0010"+
		"\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000=A\u0005\t\u0000\u0000>@\u0005\u0010\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DF\u0003\u0016\u000b\u0000ED\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u0007\u0000\u0000"+
		"H\u0005\u0001\u0000\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0003\u0010"+
		"\b\u0000KO\u0001\u0000\u0000\u0000LO\u0003\n\u0005\u0000MO\u0003\b\u0004"+
		"\u0000NI\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PT\u0005\u0004\u0000\u0000"+
		"QS\u0005\u0010\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000W[\u0003\u0018\f\u0000XZ\u0005\u0010"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^`\u0003\f\u0006\u0000_^\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`\t\u0001\u0000\u0000\u0000ac\u0003\u0014\n"+
		"\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cg\u0001\u0000"+
		"\u0000\u0000df\u0005\u0010\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jn\u0003\u0018\f\u0000"+
		"km\u0005\u0010\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000qs\u0003\f\u0006\u0000rq\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000s\u000b\u0001\u0000\u0000\u0000"+
		"tx\u0005\u0002\u0000\u0000uw\u0005\u0010\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0003"+
		"\u000e\u0007\u0000|\r\u0001\u0000\u0000\u0000}~\u0006\u0007\uffff\uffff"+
		"\u0000~\u0081\u0005\u000f\u0000\u0000\u007f\u0081\u0003\u0018\f\u0000"+
		"\u0080}\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0086\u0001\u0000\u0000\u0000\u0082\u0083\n\u0003\u0000\u0000\u0083\u0085"+
		"\u0003\u0010\b\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u000f\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0003"+
		"\u0018\f\u0000\u008b\u008d\u0005\u000b\u0000\u0000\u008c\u008e\u0003\u0012"+
		"\t\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\f\u0000\u0000"+
		"\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u009c\u0003\u000e\u0007\u0000"+
		"\u0092\u0096\u0005\n\u0000\u0000\u0093\u0095\u0005\u0010\u0000\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u009b\u0003\u000e\u0007\u0000\u009a\u0092\u0001\u0000\u0000\u0000\u009b"+
		"\u009e\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009d\u0013\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0000\u0000\u0000\u00a0"+
		"\u0015\u0001\u0000\u0000\u0000\u00a1\u00ac\u0003\u0018\f\u0000\u00a2\u00a4"+
		"\u0005\u0010\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00ab"+
		"\u0003\u0018\f\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005\u0003\u0000\u0000\u00b0\u0017\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u0019\u0001\u0000"+
		"\u0000\u0000\u0017 &,3:AENT[_bgnrx\u0080\u0086\u008d\u0096\u009c\u00a5"+
		"\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}