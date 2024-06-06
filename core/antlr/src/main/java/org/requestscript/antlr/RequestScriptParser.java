// Generated from RequestScript.g4 by ANTLR 4.13.1
package org.requestscript.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RequestScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, RETURN=2, REQUEST=3, CONTRACT=4, INT=5, STRING=6, COLON=7, COMMA=8, 
		DOT=9, PAREN_L=10, PAREN_R=11, BRACE_L=12, BRACE_R=13, IDENTIFIER=14, 
		CAPITAL_LETTER=15, LOWERCASE_LETTER=16, LETTER=17, INTEGER=18, WS=19;
	public static final int
		RULE_parse = 0, RULE_scriptDefinition = 1, RULE_scriptType = 2, RULE_scriptParameters = 3, 
		RULE_scriptParameter = 4, RULE_statement = 5, RULE_importResourceStatement = 6, 
		RULE_returnStatement = 7, RULE_expression = 8, RULE_functionCall = 9, 
		RULE_functionCallParams = 10, RULE_functionCallParam = 11, RULE_resourcePathIdentifier = 12, 
		RULE_typeDeclaration = 13, RULE_type = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "scriptDefinition", "scriptType", "scriptParameters", "scriptParameter", 
			"statement", "importResourceStatement", "returnStatement", "expression", 
			"functionCall", "functionCallParams", "functionCallParam", "resourcePathIdentifier", 
			"typeDeclaration", "type"
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

	@Override
	public String getGrammarFileName() { return "RequestScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RequestScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public List<ScriptDefinitionContext> scriptDefinition() {
			return getRuleContexts(ScriptDefinitionContext.class);
		}
		public ScriptDefinitionContext scriptDefinition(int i) {
			return getRuleContext(ScriptDefinitionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(RequestScriptParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RequestScriptParser.WS, i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524312L) != 0)) {
				{
				{
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(30);
					match(WS);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				scriptDefinition();
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(37);
						match(WS);
						}
						} 
					}
					setState(42);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				}
				setState(47);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptDefinitionContext extends ParserRuleContext {
		public ScriptTypeContext scriptType() {
			return getRuleContext(ScriptTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(RequestScriptParser.IDENTIFIER, 0); }
		public TerminalNode BRACE_L() { return getToken(RequestScriptParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(RequestScriptParser.BRACE_R, 0); }
		public ScriptParametersContext scriptParameters() {
			return getRuleContext(ScriptParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterScriptDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitScriptDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitScriptDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptDefinitionContext scriptDefinition() throws RecognitionException {
		ScriptDefinitionContext _localctx = new ScriptDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			scriptType();
			setState(49);
			match(IDENTIFIER);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_L) {
				{
				setState(50);
				scriptParameters();
				}
			}

			setState(53);
			match(BRACE_L);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==RETURN) {
				{
				{
				setState(54);
				statement();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(BRACE_R);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptTypeContext extends ParserRuleContext {
		public TerminalNode REQUEST() { return getToken(RequestScriptParser.REQUEST, 0); }
		public TerminalNode CONTRACT() { return getToken(RequestScriptParser.CONTRACT, 0); }
		public ScriptTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterScriptType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitScriptType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitScriptType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptTypeContext scriptType() throws RecognitionException {
		ScriptTypeContext _localctx = new ScriptTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scriptType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==REQUEST || _la==CONTRACT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptParametersContext extends ParserRuleContext {
		public TerminalNode PAREN_L() { return getToken(RequestScriptParser.PAREN_L, 0); }
		public List<ScriptParameterContext> scriptParameter() {
			return getRuleContexts(ScriptParameterContext.class);
		}
		public ScriptParameterContext scriptParameter(int i) {
			return getRuleContext(ScriptParameterContext.class,i);
		}
		public TerminalNode PAREN_R() { return getToken(RequestScriptParser.PAREN_R, 0); }
		public TerminalNode COMMA() { return getToken(RequestScriptParser.COMMA, 0); }
		public ScriptParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterScriptParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitScriptParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitScriptParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptParametersContext scriptParameters() throws RecognitionException {
		ScriptParametersContext _localctx = new ScriptParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scriptParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(PAREN_L);
			setState(65);
			scriptParameter();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(66);
				match(COMMA);
				setState(67);
				scriptParameter();
				}
			}

			setState(70);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RequestScriptParser.IDENTIFIER, 0); }
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ScriptParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterScriptParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitScriptParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitScriptParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptParameterContext scriptParameter() throws RecognitionException {
		ScriptParameterContext _localctx = new ScriptParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scriptParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IDENTIFIER);
			setState(73);
			typeDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportResourceStatementContext importResourceStatement() {
			return getRuleContext(ImportResourceStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				importResourceStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				returnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportResourceStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(RequestScriptParser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(RequestScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RequestScriptParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(RequestScriptParser.COLON, 0); }
		public ResourcePathIdentifierContext resourcePathIdentifier() {
			return getRuleContext(ResourcePathIdentifierContext.class,0);
		}
		public ImportResourceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importResourceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterImportResourceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitImportResourceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitImportResourceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportResourceStatementContext importResourceStatement() throws RecognitionException {
		ImportResourceStatementContext _localctx = new ImportResourceStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importResourceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IMPORT);
			setState(80);
			match(IDENTIFIER);
			setState(81);
			match(COLON);
			setState(82);
			resourcePathIdentifier();
			setState(83);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(RequestScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(RETURN);
			setState(86);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(RequestScriptParser.IDENTIFIER, 0); }
		public IdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerExpressionContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(RequestScriptParser.INTEGER, 0); }
		public IntegerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitIntegerExpression(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89);
				match(INTEGER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(93);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(94);
					functionCall();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(RequestScriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(RequestScriptParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_L() { return getToken(RequestScriptParser.PAREN_L, 0); }
		public TerminalNode PAREN_R() { return getToken(RequestScriptParser.PAREN_R, 0); }
		public FunctionCallParamsContext functionCallParams() {
			return getRuleContext(FunctionCallParamsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(DOT);
			setState(101);
			match(IDENTIFIER);
			setState(102);
			match(PAREN_L);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(103);
				functionCallParams();
				}
			}

			setState(106);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallParamsContext extends ParserRuleContext {
		public List<FunctionCallParamContext> functionCallParam() {
			return getRuleContexts(FunctionCallParamContext.class);
		}
		public FunctionCallParamContext functionCallParam(int i) {
			return getRuleContext(FunctionCallParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RequestScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RequestScriptParser.COMMA, i);
		}
		public List<TerminalNode> WS() { return getTokens(RequestScriptParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RequestScriptParser.WS, i);
		}
		public FunctionCallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterFunctionCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitFunctionCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitFunctionCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParamsContext functionCallParams() throws RecognitionException {
		FunctionCallParamsContext _localctx = new FunctionCallParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCallParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			functionCallParam();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(109);
					match(COMMA);
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
					functionCallParam();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallParamContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RequestScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(RequestScriptParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterFunctionCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitFunctionCallParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitFunctionCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParamContext functionCallParam() throws RecognitionException {
		FunctionCallParamContext _localctx = new FunctionCallParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(COLON);
			setState(124);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResourcePathIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(RequestScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RequestScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(RequestScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RequestScriptParser.DOT, i);
		}
		public ResourcePathIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourcePathIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterResourcePathIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitResourcePathIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitResourcePathIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcePathIdentifierContext resourcePathIdentifier() throws RecognitionException {
		ResourcePathIdentifierContext _localctx = new ResourcePathIdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_resourcePathIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENTIFIER);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(DOT);
					setState(128);
					match(IDENTIFIER);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(134);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(RequestScriptParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(COLON);
			setState(137);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RequestScriptParser.INT, 0); }
		public TerminalNode STRING() { return getToken(RequestScriptParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestScriptListener ) ((RequestScriptListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestScriptVisitor ) return ((RequestScriptVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
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
		"\u0004\u0001\u0013\u008e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005"+
		"\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0005\u0000,\b\u0000\n\u0000"+
		"\f\u0000/\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00014\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u00018\b\u0001\n\u0001\f\u0001;\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"N\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\\\b\b\u0001\b\u0001\b\u0005\b`\b\b\n\b\f\bc\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\ti\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\np\b\n\n\n\f\ns\t\n\u0001\n\u0005\nv\b\n\n\n\f\ny\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0082"+
		"\b\f\n\f\f\f\u0085\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001w\u0001\u0010\u000f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0001"+
		"\u0000\u0003\u0004\u0001\u0000\u0005\u0006\u008b\u0000-\u0001\u0000\u0000"+
		"\u0000\u00020\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006"+
		"@\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000"+
		"\u0000\fO\u0001\u0000\u0000\u0000\u000eU\u0001\u0000\u0000\u0000\u0010"+
		"[\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014l\u0001"+
		"\u0000\u0000\u0000\u0016z\u0001\u0000\u0000\u0000\u0018~\u0001\u0000\u0000"+
		"\u0000\u001a\u0088\u0001\u0000\u0000\u0000\u001c\u008b\u0001\u0000\u0000"+
		"\u0000\u001e \u0005\u0013\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$(\u0003"+
		"\u0002\u0001\u0000%\'\u0005\u0013\u0000\u0000&%\u0001\u0000\u0000\u0000"+
		"\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+!\u0001\u0000"+
		"\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.\u0001\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u000001\u0003\u0004\u0002\u000013\u0005\u000e\u0000\u000024\u0003\u0006"+
		"\u0003\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000059\u0005\f\u0000\u000068\u0003\n\u0005\u000076\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<=\u0005\r\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0007\u0000"+
		"\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0005\n\u0000\u0000AD\u0003"+
		"\b\u0004\u0000BC\u0005\b\u0000\u0000CE\u0003\b\u0004\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005"+
		"\u000b\u0000\u0000G\u0007\u0001\u0000\u0000\u0000HI\u0005\u000e\u0000"+
		"\u0000IJ\u0003\u001a\r\u0000J\t\u0001\u0000\u0000\u0000KN\u0003\f\u0006"+
		"\u0000LN\u0003\u000e\u0007\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0005\u0001\u0000\u0000"+
		"PQ\u0005\u000e\u0000\u0000QR\u0005\u0007\u0000\u0000RS\u0003\u0018\f\u0000"+
		"ST\u0005\u000e\u0000\u0000T\r\u0001\u0000\u0000\u0000UV\u0005\u0002\u0000"+
		"\u0000VW\u0003\u0010\b\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0006\b"+
		"\uffff\uffff\u0000Y\\\u0005\u0012\u0000\u0000Z\\\u0005\u000e\u0000\u0000"+
		"[X\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\a\u0001\u0000\u0000"+
		"\u0000]^\n\u0003\u0000\u0000^`\u0003\u0012\t\u0000_]\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u0011\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"de\u0005\t\u0000\u0000ef\u0005\u000e\u0000\u0000fh\u0005\n\u0000\u0000"+
		"gi\u0003\u0014\n\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0005\u000b\u0000\u0000k\u0013\u0001\u0000"+
		"\u0000\u0000lw\u0003\u0016\u000b\u0000mq\u0005\b\u0000\u0000np\u0005\u0013"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tv\u0003\u0016\u000b\u0000um\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000x\u0015\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"z{\u0005\u000e\u0000\u0000{|\u0005\u0007\u0000\u0000|}\u0003\u0010\b\u0000"+
		"}\u0017\u0001\u0000\u0000\u0000~\u0083\u0005\u000e\u0000\u0000\u007f\u0080"+
		"\u0005\t\u0000\u0000\u0080\u0082\u0005\u000e\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\t\u0000\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0007"+
		"\u0000\u0000\u0089\u008a\u0003\u001c\u000e\u0000\u008a\u001b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0007\u0001\u0000\u0000\u008c\u001d\u0001\u0000"+
		"\u0000\u0000\r!(-39DM[ahqw\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}