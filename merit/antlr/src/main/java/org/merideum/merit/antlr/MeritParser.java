// Generated from MeritParser.g4 by ANTLR 4.10.1
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
		WS=1, REQUEST=2, CONTRACT=3, TYPE_INT=4, TYPE_STRING=5, IDENTIFIER=6, 
		COLON=7, COMMA=8, PAREN_L=9, PAREN_R=10, CURLY_L=11, SC_WS=12, IMPORT=13, 
		ASSIGN=14, MINUS=15, DOT=16, OUTPUT=17, CONST=18, VAR=19, RESOURCE_NAME=20, 
		CAPITAL_LETTER=21, LETTER=22, INTEGER=23, QUOTE_DOUBLE=24, DOLLAR_CURLY_L=25, 
		ESCAPE_SEQUENCE=26, TEXT=27, CURLY_R=28;
	public static final int
		RULE_parse = 0, RULE_scriptDefinition = 1, RULE_scriptType = 2, RULE_scriptParameterBlock = 3, 
		RULE_scriptParameters = 4, RULE_block = 5, RULE_importResource = 6, RULE_statement = 7, 
		RULE_outputAssignment = 8, RULE_variableDeclaration = 9, RULE_variableDeclarationAssignment = 10, 
		RULE_variableReassignment = 11, RULE_assignment = 12, RULE_expression = 13, 
		RULE_functionCall = 14, RULE_functionParameters = 15, RULE_variableModifier = 16, 
		RULE_resourcePathIdentifier = 17, RULE_simpleIdentifier = 18, RULE_typeDeclaration = 19, 
		RULE_stringContent = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "scriptDefinition", "scriptType", "scriptParameterBlock", "scriptParameters", 
			"block", "importResource", "statement", "outputAssignment", "variableDeclaration", 
			"variableDeclarationAssignment", "variableReassignment", "assignment", 
			"expression", "functionCall", "functionParameters", "variableModifier", 
			"resourcePathIdentifier", "simpleIdentifier", "typeDeclaration", "stringContent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'request'", "'contract'", null, null, null, null, null, 
			null, null, "'{'", null, "'import'", "'='", null, null, "'output'", "'const'", 
			"'var'", null, null, null, null, null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "REQUEST", "CONTRACT", "TYPE_INT", "TYPE_STRING", "IDENTIFIER", 
			"COLON", "COMMA", "PAREN_L", "PAREN_R", "CURLY_L", "SC_WS", "IMPORT", 
			"ASSIGN", "MINUS", "DOT", "OUTPUT", "CONST", "VAR", "RESOURCE_NAME", 
			"CAPITAL_LETTER", "LETTER", "INTEGER", "QUOTE_DOUBLE", "DOLLAR_CURLY_L", 
			"ESCAPE_SEQUENCE", "TEXT", "CURLY_R"
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
	public String getGrammarFileName() { return "MeritParser.g4"; }

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
		public ScriptDefinitionContext scriptDefinition() {
			return getRuleContext(ScriptDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MeritParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			scriptDefinition();
			setState(43);
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

	public static class ScriptDefinitionContext extends ParserRuleContext {
		public ScriptTypeContext scriptType() {
			return getRuleContext(ScriptTypeContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode CURLY_L() { return getToken(MeritParser.CURLY_L, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CURLY_R() { return getToken(MeritParser.CURLY_R, 0); }
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ScriptParameterBlockContext scriptParameterBlock() {
			return getRuleContext(ScriptParameterBlockContext.class,0);
		}
		public ScriptDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterScriptDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitScriptDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitScriptDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptDefinitionContext scriptDefinition() throws RecognitionException {
		ScriptDefinitionContext _localctx = new ScriptDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			scriptType();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(46);
				match(WS);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			simpleIdentifier();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(53);
				match(WS);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_L) {
				{
				setState(59);
				scriptParameterBlock();
				}
			}

			setState(62);
			match(CURLY_L);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(69);
			block();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(70);
				match(WS);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(CURLY_R);
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

	public static class ScriptTypeContext extends ParserRuleContext {
		public TerminalNode REQUEST() { return getToken(MeritParser.REQUEST, 0); }
		public TerminalNode CONTRACT() { return getToken(MeritParser.CONTRACT, 0); }
		public ScriptTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterScriptType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitScriptType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitScriptType(this);
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
			setState(78);
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

	public static class ScriptParameterBlockContext extends ParserRuleContext {
		public TerminalNode PAREN_L() { return getToken(MeritParser.PAREN_L, 0); }
		public TerminalNode PAREN_R() { return getToken(MeritParser.PAREN_R, 0); }
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ScriptParametersContext scriptParameters() {
			return getRuleContext(ScriptParametersContext.class,0);
		}
		public ScriptParameterBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptParameterBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterScriptParameterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitScriptParameterBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitScriptParameterBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptParameterBlockContext scriptParameterBlock() throws RecognitionException {
		ScriptParameterBlockContext _localctx = new ScriptParameterBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scriptParameterBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(PAREN_L);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(87);
				scriptParameters();
				}
			}

			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(90);
				match(WS);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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

	public static class ScriptParametersContext extends ParserRuleContext {
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MeritParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MeritParser.COMMA, i);
		}
		public ScriptParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterScriptParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitScriptParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitScriptParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptParametersContext scriptParameters() throws RecognitionException {
		ScriptParametersContext _localctx = new ScriptParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scriptParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			simpleIdentifier();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(99);
				match(WS);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			typeDeclaration();
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(WS);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(112);
					match(COMMA);
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(113);
						match(WS);
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(119);
					simpleIdentifier();
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(120);
						match(WS);
						}
						}
						setState(125);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(126);
					typeDeclaration();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(133);
				importResource();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(WS);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << MINUS) | (1L << OUTPUT) | (1L << CONST) | (1L << VAR) | (1L << INTEGER) | (1L << QUOTE_DOUBLE))) != 0)) {
				{
				{
				setState(145);
				statement();
				}
				}
				setState(150);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterImportResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitImportResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitImportResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportResourceContext importResource() throws RecognitionException {
		ImportResourceContext _localctx = new ImportResourceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importResource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IMPORT);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(152);
				match(WS);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(IDENTIFIER);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(159);
				match(WS);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(COLON);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(166);
				match(WS);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(172);
				resourcePathIdentifier();
				}
			}

			{
			setState(175);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationAssignmentContext variableDeclarationAssignment() {
			return getRuleContext(VariableDeclarationAssignmentContext.class,0);
		}
		public VariableReassignmentContext variableReassignment() {
			return getRuleContext(VariableReassignmentContext.class,0);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				variableDeclarationAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				variableReassignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterOutputAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitOutputAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitOutputAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputAssignmentContext outputAssignment() throws RecognitionException {
		OutputAssignmentContext _localctx = new OutputAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outputAssignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(OUTPUT);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(185);
				match(WS);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			simpleIdentifier();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					match(WS);
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(198);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MeritParser.VAR, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(VAR);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(202);
				match(WS);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			simpleIdentifier();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(209);
				match(WS);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
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

	public static class VariableDeclarationAssignmentContext extends ParserRuleContext {
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterVariableDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitVariableDeclarationAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitVariableDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationAssignmentContext variableDeclarationAssignment() throws RecognitionException {
		VariableDeclarationAssignmentContext _localctx = new VariableDeclarationAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarationAssignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			variableModifier();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(218);
				match(WS);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			simpleIdentifier();
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(WS);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(231);
				typeDeclaration();
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(234);
				match(WS);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			assignment();
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

	public static class VariableReassignmentContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public VariableReassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterVariableReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitVariableReassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitVariableReassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReassignmentContext variableReassignment() throws RecognitionException {
		VariableReassignmentContext _localctx = new VariableReassignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableReassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			simpleIdentifier();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(243);
				match(WS);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			assignment();
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(251);
			match(ASSIGN);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(252);
				match(WS);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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
	public static class StringExpressionContext extends ExpressionContext {
		public List<TerminalNode> QUOTE_DOUBLE() { return getTokens(MeritParser.QUOTE_DOUBLE); }
		public TerminalNode QUOTE_DOUBLE(int i) {
			return getToken(MeritParser.QUOTE_DOUBLE, i);
		}
		public List<StringContentContext> stringContent() {
			return getRuleContexts(StringContentContext.class);
		}
		public StringContentContext stringContent(int i) {
			return getRuleContext(StringContentContext.class,i);
		}
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterSimpleIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitSimpleIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitSimpleIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExpressionContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(MeritParser.INTEGER, 0); }
		public TerminalNode MINUS() { return getToken(MeritParser.MINUS, 0); }
		public IntegerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitIntegerExpression(this);
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
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new SimpleIdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				simpleIdentifier();
				}
				break;
			case MINUS:
			case INTEGER:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(262);
					match(MINUS);
					}
				}

				setState(265);
				match(INTEGER);
				}
				break;
			case QUOTE_DOUBLE:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(QUOTE_DOUBLE);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOLLAR_CURLY_L) | (1L << ESCAPE_SEQUENCE) | (1L << TEXT))) != 0)) {
					{
					{
					setState(267);
					stringContent();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				match(QUOTE_DOUBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(276);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(277);
					functionCall();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(DOT);
			setState(284);
			simpleIdentifier();
			setState(285);
			match(PAREN_L);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << MINUS) | (1L << INTEGER) | (1L << QUOTE_DOUBLE))) != 0)) {
				{
				setState(286);
				functionParameters();
				}
			}

			setState(289);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			expression(0);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(292);
					match(COMMA);
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(293);
						match(WS);
						}
						}
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(299);
					expression(0);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterResourcePathIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitResourcePathIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitResourcePathIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcePathIdentifierContext resourcePathIdentifier() throws RecognitionException {
		ResourcePathIdentifierContext _localctx = new ResourcePathIdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_resourcePathIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			simpleIdentifier();
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(308);
						match(WS);
						}
						}
						setState(313);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(314);
					match(DOT);
					setState(315);
					simpleIdentifier();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(321);
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
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitSimpleIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitSimpleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public Token type;
		public TerminalNode COLON() { return getToken(MeritParser.COLON, 0); }
		public TerminalNode TYPE_INT() { return getToken(MeritParser.TYPE_INT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(MeritParser.TYPE_STRING, 0); }
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(COLON);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(326);
				match(WS);
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			((TypeDeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TYPE_INT || _la==TYPE_STRING) ) {
				((TypeDeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
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

	public static class StringContentContext extends ParserRuleContext {
		public StringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContent; }
	 
		public StringContentContext() { }
		public void copyFrom(StringContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EscapeSequenceContext extends StringContentContext {
		public TerminalNode ESCAPE_SEQUENCE() { return getToken(MeritParser.ESCAPE_SEQUENCE, 0); }
		public EscapeSequenceContext(StringContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterEscapeSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitEscapeSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitEscapeSequence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmbeddedExpressionContext extends StringContentContext {
		public TerminalNode DOLLAR_CURLY_L() { return getToken(MeritParser.DOLLAR_CURLY_L, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CURLY_R() { return getToken(MeritParser.CURLY_R, 0); }
		public EmbeddedExpressionContext(StringContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterEmbeddedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitEmbeddedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitEmbeddedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends StringContentContext {
		public TerminalNode TEXT() { return getToken(MeritParser.TEXT, 0); }
		public TextContext(StringContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContentContext stringContent() throws RecognitionException {
		StringContentContext _localctx = new StringContentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stringContent);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_CURLY_L:
				_localctx = new EmbeddedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(DOLLAR_CURLY_L);
				setState(335);
				expression(0);
				setState(336);
				match(CURLY_R);
				}
				break;
			case TEXT:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(TEXT);
				}
				break;
			case ESCAPE_SEQUENCE:
				_localctx = new EscapeSequenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(ESCAPE_SEQUENCE);
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
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0157\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001"+
		"\f\u00013\t\u0001\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001\n\u0001"+
		"\f\u0001:\t\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001H\b\u0001\n\u0001\f\u0001K\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003S\b\u0003"+
		"\n\u0003\f\u0003V\t\u0003\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0003"+
		"\u0005\u0003\\\b\u0003\n\u0003\f\u0003_\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0005\u0004e\b\u0004\n\u0004\f\u0004h\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004l\b\u0004\n\u0004\f\u0004o\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004s\b\u0004\n\u0004\f\u0004v\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004z\b\u0004\n\u0004\f\u0004}\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0081\b\u0004\n\u0004\f\u0004\u0084"+
		"\t\u0004\u0001\u0005\u0005\u0005\u0087\b\u0005\n\u0005\f\u0005\u008a\t"+
		"\u0005\u0001\u0005\u0005\u0005\u008d\b\u0005\n\u0005\f\u0005\u0090\t\u0005"+
		"\u0001\u0005\u0005\u0005\u0093\b\u0005\n\u0005\f\u0005\u0096\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u009a\b\u0006\n\u0006\f\u0006\u009d\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00a1\b\u0006\n\u0006\f\u0006\u00a4"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a8\b\u0006\n\u0006\f\u0006"+
		"\u00ab\t\u0006\u0001\u0006\u0003\u0006\u00ae\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00b7\b\u0007\u0001\b\u0001\b\u0005\b\u00bb\b\b\n\b\f\b\u00be\t"+
		"\b\u0001\b\u0001\b\u0005\b\u00c2\b\b\n\b\f\b\u00c5\t\b\u0001\b\u0003\b"+
		"\u00c8\b\b\u0001\t\u0001\t\u0005\t\u00cc\b\t\n\t\f\t\u00cf\t\t\u0001\t"+
		"\u0001\t\u0005\t\u00d3\b\t\n\t\f\t\u00d6\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0005\n\u00dc\b\n\n\n\f\n\u00df\t\n\u0001\n\u0001\n\u0005\n\u00e3\b"+
		"\n\n\n\f\n\u00e6\t\n\u0001\n\u0003\n\u00e9\b\n\u0001\n\u0005\n\u00ec\b"+
		"\n\n\n\f\n\u00ef\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00f5\b\u000b\n\u000b\f\u000b\u00f8\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0005\f\u00fe\b\f\n\f\f\f\u0101\t\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u0108\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u010d"+
		"\b\r\n\r\f\r\u0110\t\r\u0001\r\u0003\r\u0113\b\r\u0001\r\u0001\r\u0005"+
		"\r\u0117\b\r\n\r\f\r\u011a\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0120\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0127\b\u000f\n\u000f\f\u000f\u012a\t\u000f"+
		"\u0001\u000f\u0005\u000f\u012d\b\u000f\n\u000f\f\u000f\u0130\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0136\b\u0011\n"+
		"\u0011\f\u0011\u0139\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u013d"+
		"\b\u0011\n\u0011\f\u0011\u0140\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0148\b\u0013\n\u0013"+
		"\f\u0013\u014b\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0155\b\u0014"+
		"\u0001\u0014\u0002\u0082\u012e\u0001\u001a\u0015\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000"+
		"\u0003\u0001\u0000\u0002\u0003\u0001\u0000\u0012\u0013\u0001\u0000\u0004"+
		"\u0005\u0171\u0000*\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000"+
		"\u0004N\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bb\u0001"+
		"\u0000\u0000\u0000\n\u0088\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000"+
		"\u0000\u0000\u000e\u00b6\u0001\u0000\u0000\u0000\u0010\u00b8\u0001\u0000"+
		"\u0000\u0000\u0012\u00c9\u0001\u0000\u0000\u0000\u0014\u00d9\u0001\u0000"+
		"\u0000\u0000\u0016\u00f2\u0001\u0000\u0000\u0000\u0018\u00fb\u0001\u0000"+
		"\u0000\u0000\u001a\u0112\u0001\u0000\u0000\u0000\u001c\u011b\u0001\u0000"+
		"\u0000\u0000\u001e\u0123\u0001\u0000\u0000\u0000 \u0131\u0001\u0000\u0000"+
		"\u0000\"\u0133\u0001\u0000\u0000\u0000$\u0143\u0001\u0000\u0000\u0000"+
		"&\u0145\u0001\u0000\u0000\u0000(\u0154\u0001\u0000\u0000\u0000*+\u0003"+
		"\u0002\u0001\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000"+
		"\u0000-1\u0003\u0004\u0002\u0000.0\u0005\u0001\u0000\u0000/.\u0001\u0000"+
		"\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"48\u0003$\u0012\u000057\u0005\u0001\u0000\u000065\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;=\u0003\u0006"+
		"\u0003\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>B\u0005\u000b\u0000\u0000?A\u0005\u0001\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000EI\u0003\n\u0005\u0000FH\u0005\u0001\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LM\u0005\u001c\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NO\u0007\u0000"+
		"\u0000\u0000O\u0005\u0001\u0000\u0000\u0000PT\u0005\t\u0000\u0000QS\u0005"+
		"\u0001\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000WY\u0003\b\u0004\u0000XW\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y]\u0001\u0000\u0000\u0000Z\\\u0005\u0001"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`a\u0005\n\u0000\u0000a\u0007\u0001\u0000\u0000"+
		"\u0000bf\u0003$\u0012\u0000ce\u0005\u0001\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000im\u0003"+
		"&\u0013\u0000jl\u0005\u0001\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"n\u0082\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pt\u0005\b\u0000"+
		"\u0000qs\u0005\u0001\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w{\u0003$\u0012\u0000xz\u0005"+
		"\u0001\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0003&\u0013\u0000\u007f\u0081"+
		"\u0001\u0000\u0000\u0000\u0080p\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\t\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0003\f\u0006\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008e\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008d\u0005\u0001\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0094\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0003\u000e\u0007\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u000b\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009b\u0005\r\u0000\u0000"+
		"\u0098\u009a\u0005\u0001\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a2\u0005\u0006\u0000\u0000"+
		"\u009f\u00a1\u0005\u0001\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a9\u0005\u0007\u0000\u0000"+
		"\u00a6\u00a8\u0005\u0001\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003\"\u0011\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0014\u0000\u0000\u00b0"+
		"\r\u0001\u0000\u0000\u0000\u00b1\u00b7\u0003\u001a\r\u0000\u00b2\u00b7"+
		"\u0003\u0012\t\u0000\u00b3\u00b7\u0003\u0014\n\u0000\u00b4\u00b7\u0003"+
		"\u0016\u000b\u0000\u00b5\u00b7\u0003\u0010\b\u0000\u00b6\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u000f\u0001\u0000\u0000\u0000\u00b8\u00bc\u0005\u0011"+
		"\u0000\u0000\u00b9\u00bb\u0005\u0001\u0000\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c3\u0003$\u0012"+
		"\u0000\u00c0\u00c2\u0005\u0001\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003\u0018\f\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u0011\u0001\u0000\u0000\u0000\u00c9\u00cd\u0005\u0013\u0000\u0000"+
		"\u00ca\u00cc\u0005\u0001\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d4\u0003$\u0012\u0000\u00d1"+
		"\u00d3\u0005\u0001\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003&\u0013\u0000\u00d8\u0013"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dd\u0003 \u0010\u0000\u00da\u00dc\u0005"+
		"\u0001\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e4\u0003$\u0012\u0000\u00e1\u00e3\u0005\u0001"+
		"\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e9\u0003&\u0013\u0000\u00e8\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ec\u0005\u0001\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003\u0018\f\u0000"+
		"\u00f1\u0015\u0001\u0000\u0000\u0000\u00f2\u00f6\u0003$\u0012\u0000\u00f3"+
		"\u00f5\u0005\u0001\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003\u0018\f\u0000\u00fa\u0017"+
		"\u0001\u0000\u0000\u0000\u00fb\u00ff\u0005\u000e\u0000\u0000\u00fc\u00fe"+
		"\u0005\u0001\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0003\u001a\r\u0000\u0103\u0019\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0006\r\uffff\uffff\u0000\u0105\u0113\u0003"+
		"$\u0012\u0000\u0106\u0108\u0005\u000f\u0000\u0000\u0107\u0106\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u0113\u0005\u0017\u0000\u0000\u010a\u010e\u0005\u0018"+
		"\u0000\u0000\u010b\u010d\u0003(\u0014\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0113\u0005\u0018\u0000"+
		"\u0000\u0112\u0104\u0001\u0000\u0000\u0000\u0112\u0107\u0001\u0000\u0000"+
		"\u0000\u0112\u010a\u0001\u0000\u0000\u0000\u0113\u0118\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\n\u0004\u0000\u0000\u0115\u0117\u0003\u001c\u000e\u0000"+
		"\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000"+
		"\u0119\u001b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0005\u0010\u0000\u0000\u011c\u011d\u0003$\u0012\u0000\u011d"+
		"\u011f\u0005\t\u0000\u0000\u011e\u0120\u0003\u001e\u000f\u0000\u011f\u011e"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0005\n\u0000\u0000\u0122\u001d\u0001"+
		"\u0000\u0000\u0000\u0123\u012e\u0003\u001a\r\u0000\u0124\u0128\u0005\b"+
		"\u0000\u0000\u0125\u0127\u0005\u0001\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012d\u0003\u001a"+
		"\r\u0000\u012c\u0124\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012f\u001f\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0007\u0001\u0000\u0000\u0132!\u0001\u0000\u0000\u0000"+
		"\u0133\u013e\u0003$\u0012\u0000\u0134\u0136\u0005\u0001\u0000\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013a\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005\u0010\u0000\u0000\u013b\u013d\u0003$\u0012\u0000\u013c\u0137"+
		"\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0005\u0010\u0000\u0000\u0142#\u0001\u0000\u0000\u0000\u0143\u0144\u0005"+
		"\u0006\u0000\u0000\u0144%\u0001\u0000\u0000\u0000\u0145\u0149\u0005\u0007"+
		"\u0000\u0000\u0146\u0148\u0005\u0001\u0000\u0000\u0147\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014d\u0007\u0002"+
		"\u0000\u0000\u014d\'\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0019\u0000"+
		"\u0000\u014f\u0150\u0003\u001a\r\u0000\u0150\u0151\u0005\u001c\u0000\u0000"+
		"\u0151\u0155\u0001\u0000\u0000\u0000\u0152\u0155\u0005\u001b\u0000\u0000"+
		"\u0153\u0155\u0005\u001a\u0000\u0000\u0154\u014e\u0001\u0000\u0000\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000"+
		"\u0155)\u0001\u0000\u0000\u0000+18<BITX]fmt{\u0082\u0088\u008e\u0094\u009b"+
		"\u00a2\u00a9\u00ad\u00b6\u00bc\u00c3\u00c7\u00cd\u00d4\u00dd\u00e4\u00e8"+
		"\u00ed\u00f6\u00ff\u0107\u010e\u0112\u0118\u011f\u0128\u012e\u0137\u013e"+
		"\u0149\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}