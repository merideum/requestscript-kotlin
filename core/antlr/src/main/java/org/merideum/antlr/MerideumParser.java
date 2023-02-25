// Generated from java-escape by ANTLR 4.11.1
package org.merideum.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MerideumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ASSIGN=2, BRACE_L=3, BRACE_R=4, BRACKET_L=5, BRACKET_R=6, COLON=7, 
		COMMA=8, CONST=9, CONTRACT=10, DOT=11, DOUBLE_QUOTE=12, MINUS=13, PAREN_L=14, 
		PAREN_R=15, REQUEST=16, RETURN=17, USE=18, VAR=19, IDENTIFIER=20, INT=21, 
		RESOURCE_NAME=22, TYPE=23, TYPE_LIST=24, USE_PATH=25, TEXT=26, S_EMBEDDED=27;
	public static final int
		RULE_request = 0, RULE_script = 1, RULE_scriptDefinition = 2, RULE_requestDefinition = 3, 
		RULE_contractDefinition = 4, RULE_contractParameters = 5, RULE_parameterDeclaration = 6, 
		RULE_statement = 7, RULE_returnStatement = 8, RULE_useStatement = 9, RULE_variableDeclarationAssignment = 10, 
		RULE_variableAssignment = 11, RULE_objectFieldAssignment = 12, RULE_expression = 13, 
		RULE_stringContents = 14, RULE_modifier = 15, RULE_typeDeclaration = 16, 
		RULE_functionCall = 17, RULE_functionParameters = 18, RULE_functionParameter = 19, 
		RULE_functionVariableParameter = 20, RULE_functionNamedParameter = 21, 
		RULE_objectDeclaration = 22, RULE_objectFields = 23, RULE_objectField = 24, 
		RULE_objectFieldValueAssignment = 25, RULE_listDeclaration = 26, RULE_listElements = 27, 
		RULE_listElement = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"request", "script", "scriptDefinition", "requestDefinition", "contractDefinition", 
			"contractParameters", "parameterDeclaration", "statement", "returnStatement", 
			"useStatement", "variableDeclarationAssignment", "variableAssignment", 
			"objectFieldAssignment", "expression", "stringContents", "modifier", 
			"typeDeclaration", "functionCall", "functionParameters", "functionParameter", 
			"functionVariableParameter", "functionNamedParameter", "objectDeclaration", 
			"objectFields", "objectField", "objectFieldValueAssignment", "listDeclaration", 
			"listElements", "listElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'{'", null, "'['", "']'", "':'", "','", "'const'", 
			"'contract'", "'.'", null, "'-'", "'('", "')'", "'request'", "'return'", 
			"'use'", "'var'", null, null, null, null, null, null, null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "ASSIGN", "BRACE_L", "BRACE_R", "BRACKET_L", "BRACKET_R", 
			"COLON", "COMMA", "CONST", "CONTRACT", "DOT", "DOUBLE_QUOTE", "MINUS", 
			"PAREN_L", "PAREN_R", "REQUEST", "RETURN", "USE", "VAR", "IDENTIFIER", 
			"INT", "RESOURCE_NAME", "TYPE", "TYPE_LIST", "USE_PATH", "TEXT", "S_EMBEDDED"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MerideumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestContext extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MerideumParser.EOF, 0); }
		public RequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_request; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitRequest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestContext request() throws RecognitionException {
		RequestContext _localctx = new RequestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_request);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			script();
			setState(59);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public ScriptDefinitionContext scriptDefinition() {
			return getRuleContext(ScriptDefinitionContext.class,0);
		}
		public TerminalNode BRACE_L() { return getToken(MerideumParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(MerideumParser.BRACE_R, 0); }
		public TerminalNode EOF() { return getToken(MerideumParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(MerideumParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MerideumParser.WS, i);
		}
		public List<UseStatementContext> useStatement() {
			return getRuleContexts(UseStatementContext.class);
		}
		public UseStatementContext useStatement(int i) {
			return getRuleContext(UseStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			scriptDefinition();
			setState(62);
			match(BRACE_L);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					match(WS);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USE) {
				{
				{
				setState(69);
				useStatement();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					match(WS);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3805736L) != 0) {
				{
				{
				setState(81);
				statement();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(87);
				match(WS);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(BRACE_R);
			setState(94);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptDefinitionContext extends ParserRuleContext {
		public RequestDefinitionContext requestDefinition() {
			return getRuleContext(RequestDefinitionContext.class,0);
		}
		public ContractDefinitionContext contractDefinition() {
			return getRuleContext(ContractDefinitionContext.class,0);
		}
		public ScriptDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterScriptDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitScriptDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitScriptDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptDefinitionContext scriptDefinition() throws RecognitionException {
		ScriptDefinitionContext _localctx = new ScriptDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scriptDefinition);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUEST:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				requestDefinition();
				}
				break;
			case CONTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				contractDefinition();
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
	public static class RequestDefinitionContext extends ParserRuleContext {
		public TerminalNode REQUEST() { return getToken(MerideumParser.REQUEST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public RequestDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterRequestDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitRequestDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitRequestDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestDefinitionContext requestDefinition() throws RecognitionException {
		RequestDefinitionContext _localctx = new RequestDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_requestDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(REQUEST);
			setState(101);
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
	public static class ContractDefinitionContext extends ParserRuleContext {
		public TerminalNode CONTRACT() { return getToken(MerideumParser.CONTRACT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public ContractParametersContext contractParameters() {
			return getRuleContext(ContractParametersContext.class,0);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(CONTRACT);
			setState(104);
			match(IDENTIFIER);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_L) {
				{
				setState(105);
				contractParameters();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContractParametersContext extends ParserRuleContext {
		public TerminalNode PAREN_L() { return getToken(MerideumParser.PAREN_L, 0); }
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public TerminalNode PAREN_R() { return getToken(MerideumParser.PAREN_R, 0); }
		public List<TerminalNode> WS() { return getTokens(MerideumParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MerideumParser.WS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MerideumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerideumParser.COMMA, i);
		}
		public ContractParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterContractParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitContractParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitContractParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractParametersContext contractParameters() throws RecognitionException {
		ContractParametersContext _localctx = new ContractParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contractParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PAREN_L);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(109);
				match(WS);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			parameterDeclaration();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				parameterDeclaration();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MerideumParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(MerideumParser.TYPE, 0); }
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(COLON);
			setState(133);
			match(TYPE);
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
		public VariableDeclarationAssignmentContext variableDeclarationAssignment() {
			return getRuleContext(VariableDeclarationAssignmentContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ObjectFieldAssignmentContext objectFieldAssignment() {
			return getRuleContext(ObjectFieldAssignmentContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				variableDeclarationAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				variableAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				objectFieldAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MerideumParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(RETURN);
			setState(143);
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
	public static class UseStatementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MerideumParser.USE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MerideumParser.COLON, 0); }
		public TerminalNode USE_PATH() { return getToken(MerideumParser.USE_PATH, 0); }
		public TerminalNode DOT() { return getToken(MerideumParser.DOT, 0); }
		public TerminalNode RESOURCE_NAME() { return getToken(MerideumParser.RESOURCE_NAME, 0); }
		public UseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterUseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitUseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitUseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStatementContext useStatement() throws RecognitionException {
		UseStatementContext _localctx = new UseStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_useStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(USE);
			setState(146);
			match(IDENTIFIER);
			setState(147);
			match(COLON);
			setState(148);
			match(USE_PATH);
			setState(149);
			match(DOT);
			setState(150);
			match(RESOURCE_NAME);
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
	public static class VariableDeclarationAssignmentContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MerideumParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public VariableDeclarationAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterVariableDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitVariableDeclarationAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitVariableDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationAssignmentContext variableDeclarationAssignment() throws RecognitionException {
		VariableDeclarationAssignmentContext _localctx = new VariableDeclarationAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarationAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			modifier();
			setState(153);
			match(IDENTIFIER);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(154);
				typeDeclaration();
				}
			}

			setState(157);
			match(ASSIGN);
			setState(158);
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
	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MerideumParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(ASSIGN);
			setState(162);
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
	public static class ObjectFieldAssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MerideumParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public ObjectFieldValueAssignmentContext objectFieldValueAssignment() {
			return getRuleContext(ObjectFieldValueAssignmentContext.class,0);
		}
		public ObjectFieldAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFieldAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterObjectFieldAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitObjectFieldAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitObjectFieldAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldAssignmentContext objectFieldAssignment() throws RecognitionException {
		ObjectFieldAssignmentContext _localctx = new ObjectFieldAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objectFieldAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			expression(0);
			setState(165);
			match(DOT);
			setState(166);
			match(IDENTIFIER);
			setState(167);
			objectFieldValueAssignment();
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
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public IdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpressionContext {
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(MerideumParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(MerideumParser.DOUBLE_QUOTE, i);
		}
		public List<StringContentsContext> stringContents() {
			return getRuleContexts(StringContentsContext.class);
		}
		public StringContentsContext stringContents(int i) {
			return getRuleContext(StringContentsContext.class,i);
		}
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectFieldCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MerideumParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public ObjectFieldCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterObjectFieldCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitObjectFieldCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitObjectFieldCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ExpressionContext {
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public ListContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(MerideumParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ExpressionContext {
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ObjectContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitObject(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACE_L:
				{
				_localctx = new ObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(170);
				objectDeclaration();
				}
				break;
			case BRACKET_L:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				listDeclaration();
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(INT);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(IDENTIFIER);
				}
				break;
			case DOUBLE_QUOTE:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(DOUBLE_QUOTE);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT || _la==S_EMBEDDED) {
					{
					{
					setState(175);
					stringContents();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(DOUBLE_QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new FunctionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(185);
						functionCall();
						}
						break;
					case 2:
						{
						_localctx = new ObjectFieldCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
						match(DOT);
						setState(188);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class StringContentsContext extends ParserRuleContext {
		public StringContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContents; }
	 
		public StringContentsContext() { }
		public void copyFrom(StringContentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmbeddedIdentifierContext extends StringContentsContext {
		public TerminalNode S_EMBEDDED() { return getToken(MerideumParser.S_EMBEDDED, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public TerminalNode BRACE_R() { return getToken(MerideumParser.BRACE_R, 0); }
		public EmbeddedIdentifierContext(StringContentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterEmbeddedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitEmbeddedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitEmbeddedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends StringContentsContext {
		public TerminalNode TEXT() { return getToken(MerideumParser.TEXT, 0); }
		public TextContext(StringContentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContentsContext stringContents() throws RecognitionException {
		StringContentsContext _localctx = new StringContentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringContents);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case S_EMBEDDED:
				_localctx = new EmbeddedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(S_EMBEDDED);
				setState(195);
				match(IDENTIFIER);
				setState(196);
				match(BRACE_R);
				}
				break;
			case TEXT:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(TEXT);
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
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(MerideumParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(MerideumParser.VAR, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MerideumParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(MerideumParser.TYPE, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(COLON);
			setState(203);
			match(TYPE);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MerideumParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_L() { return getToken(MerideumParser.PAREN_L, 0); }
		public TerminalNode PAREN_R() { return getToken(MerideumParser.PAREN_R, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(DOT);
			setState(206);
			match(IDENTIFIER);
			setState(207);
			match(PAREN_L);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(208);
				functionParameters();
				}
			}

			setState(211);
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
	public static class FunctionParametersContext extends ParserRuleContext {
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MerideumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerideumParser.COMMA, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			functionParameter();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				functionParameter();
				}
				}
				setState(220);
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
	public static class FunctionParameterContext extends ParserRuleContext {
		public FunctionVariableParameterContext functionVariableParameter() {
			return getRuleContext(FunctionVariableParameterContext.class,0);
		}
		public FunctionNamedParameterContext functionNamedParameter() {
			return getRuleContext(FunctionNamedParameterContext.class,0);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionParameter);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				functionVariableParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				functionNamedParameter();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionVariableParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public FunctionVariableParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionVariableParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterFunctionVariableParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitFunctionVariableParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitFunctionVariableParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionVariableParameterContext functionVariableParameter() throws RecognitionException {
		FunctionVariableParameterContext _localctx = new FunctionVariableParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionVariableParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
	public static class FunctionNamedParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MerideumParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionNamedParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNamedParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterFunctionNamedParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitFunctionNamedParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitFunctionNamedParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNamedParameterContext functionNamedParameter() throws RecognitionException {
		FunctionNamedParameterContext _localctx = new FunctionNamedParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionNamedParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IDENTIFIER);
			setState(228);
			match(ASSIGN);
			setState(229);
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
	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(MerideumParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(MerideumParser.BRACE_R, 0); }
		public ObjectFieldsContext objectFields() {
			return getRuleContext(ObjectFieldsContext.class,0);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_objectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(BRACE_L);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1048708L) != 0) {
				{
				setState(232);
				objectFields();
				}
			}

			setState(235);
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
	public static class ObjectFieldsContext extends ParserRuleContext {
		public List<ObjectFieldContext> objectField() {
			return getRuleContexts(ObjectFieldContext.class);
		}
		public ObjectFieldContext objectField(int i) {
			return getRuleContext(ObjectFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MerideumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerideumParser.COMMA, i);
		}
		public ObjectFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterObjectFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitObjectFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitObjectFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldsContext objectFields() throws RecognitionException {
		ObjectFieldsContext _localctx = new ObjectFieldsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_objectFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			objectField();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				objectField();
				}
				}
				setState(244);
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
	public static class ObjectFieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MerideumParser.IDENTIFIER, 0); }
		public ObjectFieldValueAssignmentContext objectFieldValueAssignment() {
			return getRuleContext(ObjectFieldValueAssignmentContext.class,0);
		}
		public ObjectFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterObjectField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitObjectField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitObjectField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldContext objectField() throws RecognitionException {
		ObjectFieldContext _localctx = new ObjectFieldContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_objectField);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(IDENTIFIER);
				}
				break;
			case ASSIGN:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				objectFieldValueAssignment();
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
	public static class ObjectFieldValueAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MerideumParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ObjectFieldValueAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFieldValueAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterObjectFieldValueAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitObjectFieldValueAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitObjectFieldValueAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldValueAssignmentContext objectFieldValueAssignment() throws RecognitionException {
		ObjectFieldValueAssignmentContext _localctx = new ObjectFieldValueAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_objectFieldValueAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(249);
				typeDeclaration();
				}
			}

			setState(252);
			match(ASSIGN);
			setState(253);
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
	public static class ListDeclarationContext extends ParserRuleContext {
		public TerminalNode BRACKET_L() { return getToken(MerideumParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(MerideumParser.BRACKET_R, 0); }
		public ListElementsContext listElements() {
			return getRuleContext(ListElementsContext.class,0);
		}
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(BRACKET_L);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3149864L) != 0) {
				{
				setState(256);
				listElements();
				}
			}

			setState(259);
			match(BRACKET_R);
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
	public static class ListElementsContext extends ParserRuleContext {
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MerideumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerideumParser.COMMA, i);
		}
		public ListElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterListElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitListElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitListElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementsContext listElements() throws RecognitionException {
		ListElementsContext _localctx = new ListElementsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			listElement();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(262);
				match(COMMA);
				setState(263);
				listElement();
				}
				}
				setState(268);
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
	public static class ListElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).enterListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerideumListener ) ((MerideumListener)listener).exitListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerideumVisitor ) return ((MerideumVisitor<? extends T>)visitor).visitListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u0110\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t"+
		"\u0001\u0001\u0001\u0005\u0001G\b\u0001\n\u0001\f\u0001J\t\u0001\u0001"+
		"\u0001\u0005\u0001M\b\u0001\n\u0001\f\u0001P\t\u0001\u0001\u0001\u0005"+
		"\u0001S\b\u0001\n\u0001\f\u0001V\t\u0001\u0001\u0001\u0005\u0001Y\b\u0001"+
		"\n\u0001\f\u0001\\\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002c\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004k\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005w\b\u0005\n\u0005\f\u0005z\t\u0005"+
		"\u0001\u0005\u0005\u0005}\b\u0005\n\u0005\f\u0005\u0080\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008d"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u009c\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00b1\b\r\n\r\f\r\u00b4\t\r\u0001\r\u0003\r\u00b7\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00be\b\r\n\r\f\r\u00c1"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c7"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d2\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00d9"+
		"\b\u0012\n\u0012\f\u0012\u00dc\t\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00e0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00ea\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00f1\b\u0017"+
		"\n\u0017\f\u0017\u00f4\t\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00f8"+
		"\b\u0018\u0001\u0019\u0003\u0019\u00fb\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0102\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0109\b\u001b"+
		"\n\u001b\f\u001b\u010c\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0000"+
		"\u0001\u001a\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0001\u0002\u0000\t"+
		"\t\u0013\u0013\u0112\u0000:\u0001\u0000\u0000\u0000\u0002=\u0001\u0000"+
		"\u0000\u0000\u0004b\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000"+
		"\bg\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\f\u0083\u0001\u0000"+
		"\u0000\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u008e\u0001\u0000"+
		"\u0000\u0000\u0012\u0091\u0001\u0000\u0000\u0000\u0014\u0098\u0001\u0000"+
		"\u0000\u0000\u0016\u00a0\u0001\u0000\u0000\u0000\u0018\u00a4\u0001\u0000"+
		"\u0000\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c\u00c6\u0001\u0000"+
		"\u0000\u0000\u001e\u00c8\u0001\u0000\u0000\u0000 \u00ca\u0001\u0000\u0000"+
		"\u0000\"\u00cd\u0001\u0000\u0000\u0000$\u00d5\u0001\u0000\u0000\u0000"+
		"&\u00df\u0001\u0000\u0000\u0000(\u00e1\u0001\u0000\u0000\u0000*\u00e3"+
		"\u0001\u0000\u0000\u0000,\u00e7\u0001\u0000\u0000\u0000.\u00ed\u0001\u0000"+
		"\u0000\u00000\u00f7\u0001\u0000\u0000\u00002\u00fa\u0001\u0000\u0000\u0000"+
		"4\u00ff\u0001\u0000\u0000\u00006\u0105\u0001\u0000\u0000\u00008\u010d"+
		"\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005\u0000\u0000"+
		"\u0001<\u0001\u0001\u0000\u0000\u0000=>\u0003\u0004\u0002\u0000>B\u0005"+
		"\u0003\u0000\u0000?A\u0005\u0001\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CH\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EG\u0003\u0012"+
		"\t\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IN\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KM\u0005\u0001\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OT\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0003\u000e"+
		"\u0007\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UZ\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WY\u0005\u0001\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005"+
		"\u0004\u0000\u0000^_\u0005\u0000\u0000\u0001_\u0003\u0001\u0000\u0000"+
		"\u0000`c\u0003\u0006\u0003\u0000ac\u0003\b\u0004\u0000b`\u0001\u0000\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000c\u0005\u0001\u0000\u0000\u0000de\u0005"+
		"\u0010\u0000\u0000ef\u0005\u0014\u0000\u0000f\u0007\u0001\u0000\u0000"+
		"\u0000gh\u0005\n\u0000\u0000hj\u0005\u0014\u0000\u0000ik\u0003\n\u0005"+
		"\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\t\u0001\u0000"+
		"\u0000\u0000lp\u0005\u000e\u0000\u0000mo\u0005\u0001\u0000\u0000nm\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000sx\u0003\f\u0006\u0000tu\u0005\b\u0000\u0000uw\u0003\f\u0006\u0000"+
		"vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y~\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{}\u0005\u0001\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005\u000f\u0000\u0000\u0082\u000b\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0014\u0000\u0000\u0084\u0085\u0005\u0007\u0000"+
		"\u0000\u0085\u0086\u0005\u0017\u0000\u0000\u0086\r\u0001\u0000\u0000\u0000"+
		"\u0087\u008d\u0003\u0014\n\u0000\u0088\u008d\u0003\u0016\u000b\u0000\u0089"+
		"\u008d\u0003\u0018\f\u0000\u008a\u008d\u0003\u0010\b\u0000\u008b\u008d"+
		"\u0003\u001a\r\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008c\u0088\u0001"+
		"\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u000f\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0011\u0000\u0000\u008f\u0090\u0003"+
		"\u001a\r\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0012"+
		"\u0000\u0000\u0092\u0093\u0005\u0014\u0000\u0000\u0093\u0094\u0005\u0007"+
		"\u0000\u0000\u0094\u0095\u0005\u0019\u0000\u0000\u0095\u0096\u0005\u000b"+
		"\u0000\u0000\u0096\u0097\u0005\u0016\u0000\u0000\u0097\u0013\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0003\u001e\u000f\u0000\u0099\u009b\u0005\u0014"+
		"\u0000\u0000\u009a\u009c\u0003 \u0010\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u0002\u0000\u0000\u009e\u009f\u0003\u001a\r\u0000"+
		"\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000"+
		"\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a3\u0003\u001a\r\u0000\u00a3"+
		"\u0017\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u001a\r\u0000\u00a5\u00a6"+
		"\u0005\u000b\u0000\u0000\u00a6\u00a7\u0005\u0014\u0000\u0000\u00a7\u00a8"+
		"\u00032\u0019\u0000\u00a8\u0019\u0001\u0000\u0000\u0000\u00a9\u00aa\u0006"+
		"\r\uffff\uffff\u0000\u00aa\u00b7\u0003,\u0016\u0000\u00ab\u00b7\u0003"+
		"4\u001a\u0000\u00ac\u00b7\u0005\u0015\u0000\u0000\u00ad\u00b7\u0005\u0014"+
		"\u0000\u0000\u00ae\u00b2\u0005\f\u0000\u0000\u00af\u00b1\u0003\u001c\u000e"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0005\f\u0000\u0000\u00b6\u00a9\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ab\u0001\u0000\u0000\u0000\u00b6\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b7\u00bf\u0001\u0000\u0000\u0000\u00b8\u00b9\n\u0007\u0000\u0000\u00b9"+
		"\u00be\u0003\"\u0011\u0000\u00ba\u00bb\n\u0006\u0000\u0000\u00bb\u00bc"+
		"\u0005\u000b\u0000\u0000\u00bc\u00be\u0005\u0014\u0000\u0000\u00bd\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u001b\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u001b\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0014\u0000\u0000\u00c4\u00c7\u0005\u0004\u0000\u0000\u00c5\u00c7"+
		"\u0005\u001a\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u001d\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0007\u0000\u0000\u0000\u00c9\u001f\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0007\u0000\u0000\u00cb\u00cc\u0005\u0017\u0000\u0000\u00cc!\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005\u000b\u0000\u0000\u00ce\u00cf\u0005"+
		"\u0014\u0000\u0000\u00cf\u00d1\u0005\u000e\u0000\u0000\u00d0\u00d2\u0003"+
		"$\u0012\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u000f"+
		"\u0000\u0000\u00d4#\u0001\u0000\u0000\u0000\u00d5\u00da\u0003&\u0013\u0000"+
		"\u00d6\u00d7\u0005\b\u0000\u0000\u00d7\u00d9\u0003&\u0013\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"%\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e0"+
		"\u0003(\u0014\u0000\u00de\u00e0\u0003*\u0015\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\'\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0014\u0000\u0000\u00e2)\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\u0014\u0000\u0000\u00e4\u00e5\u0005\u0002\u0000\u0000"+
		"\u00e5\u00e6\u0003\u001a\r\u0000\u00e6+\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e9\u0005\u0003\u0000\u0000\u00e8\u00ea\u0003.\u0017\u0000\u00e9\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0004\u0000\u0000\u00ec-\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f2\u00030\u0018\u0000\u00ee\u00ef\u0005\b"+
		"\u0000\u0000\u00ef\u00f1\u00030\u0018\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3/\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0005\u0014\u0000\u0000"+
		"\u00f6\u00f8\u00032\u0019\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f81\u0001\u0000\u0000\u0000\u00f9\u00fb"+
		"\u0003 \u0010\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005"+
		"\u0002\u0000\u0000\u00fd\u00fe\u0003\u001a\r\u0000\u00fe3\u0001\u0000"+
		"\u0000\u0000\u00ff\u0101\u0005\u0005\u0000\u0000\u0100\u0102\u00036\u001b"+
		"\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0006\u0000"+
		"\u0000\u01045\u0001\u0000\u0000\u0000\u0105\u010a\u00038\u001c\u0000\u0106"+
		"\u0107\u0005\b\u0000\u0000\u0107\u0109\u00038\u001c\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b7\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0003"+
		"\u001a\r\u0000\u010e9\u0001\u0000\u0000\u0000\u001aBHNTZbjpx~\u008c\u009b"+
		"\u00b2\u00b6\u00bd\u00bf\u00c6\u00d1\u00da\u00df\u00e9\u00f2\u00f7\u00fa"+
		"\u0101\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}