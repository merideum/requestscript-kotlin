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
		WS=1, REQUEST=2, CONTRACT=3, TYPE_INT=4, TYPE_LIST_INT=5, TYPE_STRING=6, 
		TYPE_LIST_STRING=7, TYPE_OBJECT=8, TYPE_LIST_OBJECT=9, IDENTIFIER=10, 
		COLON=11, COMMA=12, PAREN_L=13, PAREN_R=14, BRACKET_L=15, BRACKET_R=16, 
		CURLY_L=17, SC_WS=18, IMPORT=19, ASSIGN=20, MINUS=21, DOT=22, RETURN=23, 
		CONST=24, VAR=25, RESOURCE_NAME=26, SC_CURLY_L=27, CAPITAL_LETTER=28, 
		LETTER=29, INTEGER=30, QUOTE_DOUBLE=31, DOLLAR_CURLY_L=32, ESCAPE_SEQUENCE=33, 
		TEXT=34, CURLY_R=35;
	public static final int
		RULE_parse = 0, RULE_scriptDefinition = 1, RULE_scriptType = 2, RULE_scriptParameterBlock = 3, 
		RULE_scriptParameters = 4, RULE_block = 5, RULE_importResource = 6, RULE_statement = 7, 
		RULE_returnStatement = 8, RULE_variableDeclaration = 9, RULE_variableDeclarationAssignment = 10, 
		RULE_variableReassignment = 11, RULE_objectFieldAssignment = 12, RULE_assignment = 13, 
		RULE_expression = 14, RULE_functionCall = 15, RULE_functionParameters = 16, 
		RULE_variableModifier = 17, RULE_resourcePathIdentifier = 18, RULE_simpleIdentifier = 19, 
		RULE_typeDeclaration = 20, RULE_type = 21, RULE_listType = 22, RULE_basicType = 23, 
		RULE_objectFields = 24, RULE_objectField = 25, RULE_listElementAssignments = 26, 
		RULE_listElementAssignment = 27, RULE_stringContent = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "scriptDefinition", "scriptType", "scriptParameterBlock", "scriptParameters", 
			"block", "importResource", "statement", "returnStatement", "variableDeclaration", 
			"variableDeclarationAssignment", "variableReassignment", "objectFieldAssignment", 
			"assignment", "expression", "functionCall", "functionParameters", "variableModifier", 
			"resourcePathIdentifier", "simpleIdentifier", "typeDeclaration", "type", 
			"listType", "basicType", "objectFields", "objectField", "listElementAssignments", 
			"listElementAssignment", "stringContent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'request'", "'contract'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'import'", 
			"'='", null, null, "'return'", "'const'", "'var'", null, null, null, 
			null, null, null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "REQUEST", "CONTRACT", "TYPE_INT", "TYPE_LIST_INT", "TYPE_STRING", 
			"TYPE_LIST_STRING", "TYPE_OBJECT", "TYPE_LIST_OBJECT", "IDENTIFIER", 
			"COLON", "COMMA", "PAREN_L", "PAREN_R", "BRACKET_L", "BRACKET_R", "CURLY_L", 
			"SC_WS", "IMPORT", "ASSIGN", "MINUS", "DOT", "RETURN", "CONST", "VAR", 
			"RESOURCE_NAME", "SC_CURLY_L", "CAPITAL_LETTER", "LETTER", "INTEGER", 
			"QUOTE_DOUBLE", "DOLLAR_CURLY_L", "ESCAPE_SEQUENCE", "TEXT", "CURLY_R"
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
			setState(58);
			scriptDefinition();
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
			setState(61);
			scriptType();
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
			setState(68);
			simpleIdentifier();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(69);
				match(WS);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_L) {
				{
				setState(75);
				scriptParameterBlock();
				}
			}

			setState(78);
			match(CURLY_L);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					match(WS);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(85);
			block();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(86);
				match(WS);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
			setState(94);
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
			setState(96);
			match(PAREN_L);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					match(WS);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(103);
				scriptParameters();
				}
			}

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(106);
				match(WS);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
			setState(114);
			simpleIdentifier();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(115);
				match(WS);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			typeDeclaration();
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					match(WS);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(128);
					match(COMMA);
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(129);
						match(WS);
						}
						}
						setState(134);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(135);
					simpleIdentifier();
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(136);
						match(WS);
						}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(142);
					typeDeclaration();
					}
					} 
				}
				setState(148);
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
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(149);
				importResource();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					match(WS);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << BRACKET_L) | (1L << MINUS) | (1L << RETURN) | (1L << CONST) | (1L << VAR) | (1L << SC_CURLY_L) | (1L << INTEGER) | (1L << QUOTE_DOUBLE))) != 0)) {
				{
				{
				setState(161);
				statement();
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(162);
						match(WS);
						}
						} 
					}
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				}
				setState(172);
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
			setState(173);
			match(IMPORT);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(174);
				match(WS);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(IDENTIFIER);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(181);
				match(WS);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(COLON);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(188);
				match(WS);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(194);
				resourcePathIdentifier();
				}
			}

			{
			setState(197);
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
		public ObjectFieldAssignmentContext objectFieldAssignment() {
			return getRuleContext(ObjectFieldAssignmentContext.class,0);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				variableDeclarationAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				variableReassignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				objectFieldAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				returnStatement();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MeritParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(RETURN);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(208);
				match(WS);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
			setState(216);
			match(VAR);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(217);
				match(WS);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			simpleIdentifier();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(224);
				match(WS);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
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
			setState(232);
			variableModifier();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(233);
				match(WS);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			simpleIdentifier();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					match(WS);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(246);
				typeDeclaration();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(249);
				match(WS);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
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
			setState(257);
			simpleIdentifier();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(258);
				match(WS);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
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

	public static class ObjectFieldAssignmentContext extends ParserRuleContext {
		public SimpleIdentifierContext variableName;
		public SimpleIdentifierContext fieldName;
		public TerminalNode DOT() { return getToken(MeritParser.DOT, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ObjectFieldAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFieldAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterObjectFieldAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitObjectFieldAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitObjectFieldAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldAssignmentContext objectFieldAssignment() throws RecognitionException {
		ObjectFieldAssignmentContext _localctx = new ObjectFieldAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objectFieldAssignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			((ObjectFieldAssignmentContext)_localctx).variableName = simpleIdentifier();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(267);
				match(WS);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(DOT);
			setState(274);
			((ObjectFieldAssignmentContext)_localctx).fieldName = simpleIdentifier();
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					match(WS);
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(281);
				typeDeclaration();
				}
			}

			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(284);
				match(WS);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
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
		enterRule(_localctx, 26, RULE_assignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ASSIGN);
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
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					match(WS);
					}
					} 
				}
				setState(305);
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
	public static class ObjectExpressionContext extends ExpressionContext {
		public TerminalNode SC_CURLY_L() { return getToken(MeritParser.SC_CURLY_L, 0); }
		public TerminalNode CURLY_R() { return getToken(MeritParser.CURLY_R, 0); }
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ObjectFieldsContext objectFields() {
			return getRuleContext(ObjectFieldsContext.class,0);
		}
		public ObjectExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
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
	public static class ObjectFieldReferenceExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MeritParser.DOT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ObjectFieldReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterObjectFieldReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitObjectFieldReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitObjectFieldReferenceExpression(this);
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
	public static class ListExpressionContext extends ExpressionContext {
		public TerminalNode BRACKET_L() { return getToken(MeritParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(MeritParser.BRACKET_R, 0); }
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ListElementAssignmentsContext listElementAssignments() {
			return getRuleContext(ListElementAssignmentsContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitListExpression(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SC_CURLY_L:
				{
				_localctx = new ObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(307);
				match(SC_CURLY_L);
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						match(WS);
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(314);
					objectFields();
					}
				}

				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(317);
					match(WS);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				match(CURLY_R);
				}
				break;
			case BRACKET_L:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(BRACKET_L);
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						match(WS);
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << BRACKET_L) | (1L << MINUS) | (1L << SC_CURLY_L) | (1L << INTEGER) | (1L << QUOTE_DOUBLE))) != 0)) {
					{
					setState(331);
					listElementAssignments();
					}
				}

				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(334);
					match(WS);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				match(BRACKET_R);
				}
				break;
			case MINUS:
			case INTEGER:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(341);
					match(MINUS);
					}
				}

				setState(344);
				match(INTEGER);
				}
				break;
			case QUOTE_DOUBLE:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				match(QUOTE_DOUBLE);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOLLAR_CURLY_L) | (1L << ESCAPE_SEQUENCE) | (1L << TEXT))) != 0)) {
					{
					{
					setState(346);
					stringContent();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
				match(QUOTE_DOUBLE);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new SimpleIdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				simpleIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(367);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new ObjectFieldReferenceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(360);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(357);
							match(WS);
							}
							}
							setState(362);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(363);
						match(DOT);
						setState(364);
						simpleIdentifier();
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(366);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(DOT);
			setState(373);
			simpleIdentifier();
			setState(374);
			match(PAREN_L);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << BRACKET_L) | (1L << MINUS) | (1L << SC_CURLY_L) | (1L << INTEGER) | (1L << QUOTE_DOUBLE))) != 0)) {
				{
				setState(375);
				functionParameters();
				}
			}

			setState(378);
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
		enterRule(_localctx, 32, RULE_functionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			expression(0);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(381);
					match(COMMA);
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(382);
						match(WS);
						}
						}
						setState(387);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(388);
					expression(0);
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		enterRule(_localctx, 34, RULE_variableModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 36, RULE_resourcePathIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			simpleIdentifier();
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(397);
						match(WS);
						}
						}
						setState(402);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(403);
					match(DOT);
					setState(404);
					simpleIdentifier();
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(410);
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
		enterRule(_localctx, 38, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		public TerminalNode COLON() { return getToken(MeritParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(COLON);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(415);
				match(WS);
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
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

	public static class TypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_STRING:
			case TYPE_OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				basicType();
				}
				break;
			case TYPE_LIST_INT:
			case TYPE_LIST_STRING:
			case TYPE_LIST_OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				listType();
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

	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_LIST_INT() { return getToken(MeritParser.TYPE_LIST_INT, 0); }
		public TerminalNode TYPE_LIST_STRING() { return getToken(MeritParser.TYPE_LIST_STRING, 0); }
		public TerminalNode TYPE_LIST_OBJECT() { return getToken(MeritParser.TYPE_LIST_OBJECT, 0); }
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_LIST_INT) | (1L << TYPE_LIST_STRING) | (1L << TYPE_LIST_OBJECT))) != 0)) ) {
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(MeritParser.TYPE_INT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(MeritParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_OBJECT() { return getToken(MeritParser.TYPE_OBJECT, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << TYPE_OBJECT))) != 0)) ) {
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

	public static class ObjectFieldsContext extends ParserRuleContext {
		public List<ObjectFieldContext> objectField() {
			return getRuleContexts(ObjectFieldContext.class);
		}
		public ObjectFieldContext objectField(int i) {
			return getRuleContext(ObjectFieldContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MeritParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MeritParser.COMMA, i);
		}
		public ObjectFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterObjectFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitObjectFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitObjectFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldsContext objectFields() throws RecognitionException {
		ObjectFieldsContext _localctx = new ObjectFieldsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_objectFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			objectField();
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(432);
					match(WS);
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(438);
					match(COMMA);
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(439);
						match(WS);
						}
						}
						setState(444);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(445);
					objectField();
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(446);
							match(WS);
							}
							} 
						}
						setState(451);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					}
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class ObjectFieldContext extends ParserRuleContext {
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
		public ObjectFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterObjectField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitObjectField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitObjectField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldContext objectField() throws RecognitionException {
		ObjectFieldContext _localctx = new ObjectFieldContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_objectField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			simpleIdentifier();
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					match(WS);
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(464);
				typeDeclaration();
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(467);
				match(WS);
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(473);
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

	public static class ListElementAssignmentsContext extends ParserRuleContext {
		public List<ListElementAssignmentContext> listElementAssignment() {
			return getRuleContexts(ListElementAssignmentContext.class);
		}
		public ListElementAssignmentContext listElementAssignment(int i) {
			return getRuleContext(ListElementAssignmentContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MeritParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MeritParser.COMMA, i);
		}
		public ListElementAssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElementAssignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterListElementAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitListElementAssignments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitListElementAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementAssignmentsContext listElementAssignments() throws RecognitionException {
		ListElementAssignmentsContext _localctx = new ListElementAssignmentsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listElementAssignments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			listElementAssignment();
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(476);
					match(WS);
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(482);
					match(COMMA);
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(483);
						match(WS);
						}
						}
						setState(488);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(489);
					listElementAssignment();
					setState(493);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(490);
							match(WS);
							}
							} 
						}
						setState(495);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class ListElementAssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListElementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterListElementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitListElementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitListElementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementAssignmentContext listElementAssignment() throws RecognitionException {
		ListElementAssignmentContext _localctx = new ListElementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listElementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
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
		enterRule(_localctx, 56, RULE_stringContent);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_CURLY_L:
				_localctx = new EmbeddedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(DOLLAR_CURLY_L);
				setState(504);
				expression(0);
				setState(505);
				match(CURLY_R);
				}
				break;
			case TEXT:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(TEXT);
				}
				break;
			case ESCAPE_SEQUENCE:
				_localctx = new EscapeSequenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
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
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u0200\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001G\b\u0001\n\u0001\f\u0001J\t\u0001\u0001\u0001"+
		"\u0003\u0001M\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001Q\b\u0001\n\u0001"+
		"\f\u0001T\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001X\b\u0001\n\u0001"+
		"\f\u0001[\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0005\u0003c\b\u0003\n\u0003\f\u0003f\t\u0003\u0001"+
		"\u0003\u0003\u0003i\b\u0003\u0001\u0003\u0005\u0003l\b\u0003\n\u0003\f"+
		"\u0003o\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u0004u\b\u0004\n\u0004\f\u0004x\t\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004|\b\u0004\n\u0004\f\u0004\u007f\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0083\b\u0004\n\u0004\f\u0004\u0086\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u008a\b\u0004\n\u0004\f\u0004\u008d\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0091\b\u0004\n\u0004\f\u0004\u0094\t\u0004\u0001"+
		"\u0005\u0005\u0005\u0097\b\u0005\n\u0005\f\u0005\u009a\t\u0005\u0001\u0005"+
		"\u0005\u0005\u009d\b\u0005\n\u0005\f\u0005\u00a0\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00a4\b\u0005\n\u0005\f\u0005\u00a7\t\u0005\u0005\u0005"+
		"\u00a9\b\u0005\n\u0005\f\u0005\u00ac\t\u0005\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00b0\b\u0006\n\u0006\f\u0006\u00b3\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00b7\b\u0006\n\u0006\f\u0006\u00ba\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00be\b\u0006\n\u0006\f\u0006\u00c1\t\u0006\u0001\u0006"+
		"\u0003\u0006\u00c4\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ce\b\u0007"+
		"\u0001\b\u0001\b\u0005\b\u00d2\b\b\n\b\f\b\u00d5\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\t\u00db\b\t\n\t\f\t\u00de\t\t\u0001\t\u0001\t\u0005\t"+
		"\u00e2\b\t\n\t\f\t\u00e5\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00eb"+
		"\b\n\n\n\f\n\u00ee\t\n\u0001\n\u0001\n\u0005\n\u00f2\b\n\n\n\f\n\u00f5"+
		"\t\n\u0001\n\u0003\n\u00f8\b\n\u0001\n\u0005\n\u00fb\b\n\n\n\f\n\u00fe"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u0104\b\u000b"+
		"\n\u000b\f\u000b\u0107\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0005\f\u010d\b\f\n\f\f\f\u0110\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u0115"+
		"\b\f\n\f\f\f\u0118\t\f\u0001\f\u0003\f\u011b\b\f\u0001\f\u0005\f\u011e"+
		"\b\f\n\f\f\f\u0121\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u0127\b"+
		"\r\n\r\f\r\u012a\t\r\u0001\r\u0001\r\u0005\r\u012e\b\r\n\r\f\r\u0131\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0136\b\u000e\n\u000e"+
		"\f\u000e\u0139\t\u000e\u0001\u000e\u0003\u000e\u013c\b\u000e\u0001\u000e"+
		"\u0005\u000e\u013f\b\u000e\n\u000e\f\u000e\u0142\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0147\b\u000e\n\u000e\f\u000e\u014a\t\u000e"+
		"\u0001\u000e\u0003\u000e\u014d\b\u000e\u0001\u000e\u0005\u000e\u0150\b"+
		"\u000e\n\u000e\f\u000e\u0153\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0157\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u015c\b"+
		"\u000e\n\u000e\f\u000e\u015f\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0163\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0167\b\u000e\n\u000e"+
		"\f\u000e\u016a\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0170\b\u000e\n\u000e\f\u000e\u0173\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0179\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0180\b\u0010\n"+
		"\u0010\f\u0010\u0183\t\u0010\u0001\u0010\u0005\u0010\u0186\b\u0010\n\u0010"+
		"\f\u0010\u0189\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u018f\b\u0012\n\u0012\f\u0012\u0192\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0196\b\u0012\n\u0012\f\u0012\u0199\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01a1\b\u0014\n\u0014\f\u0014\u01a4\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u01aa\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u01b2\b\u0018\n"+
		"\u0018\f\u0018\u01b5\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01b9"+
		"\b\u0018\n\u0018\f\u0018\u01bc\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u01c0\b\u0018\n\u0018\f\u0018\u01c3\t\u0018\u0005\u0018\u01c5\b\u0018"+
		"\n\u0018\f\u0018\u01c8\t\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u01cc"+
		"\b\u0019\n\u0019\f\u0019\u01cf\t\u0019\u0001\u0019\u0003\u0019\u01d2\b"+
		"\u0019\u0001\u0019\u0005\u0019\u01d5\b\u0019\n\u0019\f\u0019\u01d8\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u01de\b\u001a"+
		"\n\u001a\f\u001a\u01e1\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01e5"+
		"\b\u001a\n\u001a\f\u001a\u01e8\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u01ec\b\u001a\n\u001a\f\u001a\u01ef\t\u001a\u0005\u001a\u01f1\b\u001a"+
		"\n\u001a\f\u001a\u01f4\t\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01fe"+
		"\b\u001c\u0001\u001c\u0004\u0092\u0187\u01c6\u01f2\u0001\u001c\u001d\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468\u0000\u0004\u0001\u0000\u0002\u0003\u0001\u0000\u0018"+
		"\u0019\u0003\u0000\u0005\u0005\u0007\u0007\t\t\u0003\u0000\u0004\u0004"+
		"\u0006\u0006\b\b\u022d\u0000:\u0001\u0000\u0000\u0000\u0002=\u0001\u0000"+
		"\u0000\u0000\u0004^\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000\u0000"+
		"\br\u0001\u0000\u0000\u0000\n\u0098\u0001\u0000\u0000\u0000\f\u00ad\u0001"+
		"\u0000\u0000\u0000\u000e\u00cd\u0001\u0000\u0000\u0000\u0010\u00cf\u0001"+
		"\u0000\u0000\u0000\u0012\u00d8\u0001\u0000\u0000\u0000\u0014\u00e8\u0001"+
		"\u0000\u0000\u0000\u0016\u0101\u0001\u0000\u0000\u0000\u0018\u010a\u0001"+
		"\u0000\u0000\u0000\u001a\u0124\u0001\u0000\u0000\u0000\u001c\u0162\u0001"+
		"\u0000\u0000\u0000\u001e\u0174\u0001\u0000\u0000\u0000 \u017c\u0001\u0000"+
		"\u0000\u0000\"\u018a\u0001\u0000\u0000\u0000$\u018c\u0001\u0000\u0000"+
		"\u0000&\u019c\u0001\u0000\u0000\u0000(\u019e\u0001\u0000\u0000\u0000*"+
		"\u01a9\u0001\u0000\u0000\u0000,\u01ab\u0001\u0000\u0000\u0000.\u01ad\u0001"+
		"\u0000\u0000\u00000\u01af\u0001\u0000\u0000\u00002\u01c9\u0001\u0000\u0000"+
		"\u00004\u01db\u0001\u0000\u0000\u00006\u01f5\u0001\u0000\u0000\u00008"+
		"\u01fd\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005\u0000"+
		"\u0000\u0001<\u0001\u0001\u0000\u0000\u0000=A\u0003\u0004\u0002\u0000"+
		">@\u0005\u0001\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DH\u0003&\u0013\u0000EG\u0005\u0001"+
		"\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KM\u0003\u0006\u0003\u0000LK\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NR\u0005\u0011"+
		"\u0000\u0000OQ\u0005\u0001\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UY\u0003\n\u0005\u0000"+
		"VX\u0005\u0001\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005#\u0000\u0000]\u0003\u0001"+
		"\u0000\u0000\u0000^_\u0007\u0000\u0000\u0000_\u0005\u0001\u0000\u0000"+
		"\u0000`d\u0005\r\u0000\u0000ac\u0005\u0001\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0003"+
		"\b\u0004\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000im\u0001"+
		"\u0000\u0000\u0000jl\u0005\u0001\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u000e"+
		"\u0000\u0000q\u0007\u0001\u0000\u0000\u0000rv\u0003&\u0013\u0000su\u0005"+
		"\u0001\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000y}\u0003(\u0014\u0000z|\u0005\u0001\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0092\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0084\u0005\f\u0000\u0000"+
		"\u0081\u0083\u0005\u0001\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008b\u0003&\u0013\u0000\u0088"+
		"\u008a\u0005\u0001\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0003(\u0014\u0000\u008f\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u0080\u0001\u0000\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\t\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u0003\f\u0006\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009e\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0005\u0001"+
		"\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00aa\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a5\u0003\u000e\u0007\u0000\u00a2\u00a4\u0005\u0001"+
		"\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u000b\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b1\u0005\u0013\u0000\u0000\u00ae\u00b0\u0005\u0001"+
		"\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b8\u0005\n\u0000\u0000\u00b5\u00b7\u0005\u0001\u0000"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bf\u0005\u000b\u0000\u0000\u00bc\u00be\u0005\u0001\u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0003$\u0012\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\u001a\u0000\u0000\u00c6\r\u0001\u0000\u0000\u0000\u00c7"+
		"\u00ce\u0003\u001c\u000e\u0000\u00c8\u00ce\u0003\u0012\t\u0000\u00c9\u00ce"+
		"\u0003\u0014\n\u0000\u00ca\u00ce\u0003\u0016\u000b\u0000\u00cb\u00ce\u0003"+
		"\u0018\f\u0000\u00cc\u00ce\u0003\u0010\b\u0000\u00cd\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u000f\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d3\u0005\u0017\u0000\u0000\u00d0\u00d2\u0005\u0001"+
		"\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0003\u001c\u000e\u0000\u00d7\u0011\u0001\u0000"+
		"\u0000\u0000\u00d8\u00dc\u0005\u0019\u0000\u0000\u00d9\u00db\u0005\u0001"+
		"\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e3\u0003&\u0013\u0000\u00e0\u00e2\u0005\u0001\u0000"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0003(\u0014\u0000\u00e7\u0013\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ec\u0003\"\u0011\u0000\u00e9\u00eb\u0005\u0001\u0000\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f3\u0003&\u0013\u0000\u00f0\u00f2\u0005\u0001\u0000\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f8"+
		"\u0003(\u0014\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fc\u0001\u0000\u0000\u0000\u00f9\u00fb\u0005"+
		"\u0001\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0003\u001a\r\u0000\u0100\u0015\u0001\u0000"+
		"\u0000\u0000\u0101\u0105\u0003&\u0013\u0000\u0102\u0104\u0005\u0001\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0003\u001a\r\u0000\u0109\u0017\u0001\u0000\u0000\u0000"+
		"\u010a\u010e\u0003&\u0013\u0000\u010b\u010d\u0005\u0001\u0000\u0000\u010c"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0005\u0016\u0000\u0000\u0112\u0116\u0003&\u0013\u0000\u0113\u0115"+
		"\u0005\u0001\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0118"+
		"\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0003(\u0014\u0000\u011a\u0119\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011f\u0001"+
		"\u0000\u0000\u0000\u011c\u011e\u0005\u0001\u0000\u0000\u011d\u011c\u0001"+
		"\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0123\u0003"+
		"\u001a\r\u0000\u0123\u0019\u0001\u0000\u0000\u0000\u0124\u0128\u0005\u0014"+
		"\u0000\u0000\u0125\u0127\u0005\u0001\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012f\u0003\u001c"+
		"\u000e\u0000\u012c\u012e\u0005\u0001\u0000\u0000\u012d\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u001b\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0006\u000e"+
		"\uffff\uffff\u0000\u0133\u0137\u0005\u001b\u0000\u0000\u0134\u0136\u0005"+
		"\u0001\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001"+
		"\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001"+
		"\u0000\u0000\u0000\u013a\u013c\u00030\u0018\u0000\u013b\u013a\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0140\u0001\u0000"+
		"\u0000\u0000\u013d\u013f\u0005\u0001\u0000\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0163\u0005#\u0000"+
		"\u0000\u0144\u0148\u0005\u000f\u0000\u0000\u0145\u0147\u0005\u0001\u0000"+
		"\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000"+
		"\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000"+
		"\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000"+
		"\u0000\u014b\u014d\u00034\u001a\u0000\u014c\u014b\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u0151\u0001\u0000\u0000\u0000"+
		"\u014e\u0150\u0005\u0001\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000"+
		"\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0163\u0005\u0010\u0000\u0000"+
		"\u0155\u0157\u0005\u0015\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158\u0163\u0005\u001e\u0000\u0000\u0159\u015d\u0005\u001f\u0000\u0000"+
		"\u015a\u015c\u00038\u001c\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u0160\u0163\u0005\u001f\u0000\u0000\u0161"+
		"\u0163\u0003&\u0013\u0000\u0162\u0132\u0001\u0000\u0000\u0000\u0162\u0144"+
		"\u0001\u0000\u0000\u0000\u0162\u0156\u0001\u0000\u0000\u0000\u0162\u0159"+
		"\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0171"+
		"\u0001\u0000\u0000\u0000\u0164\u0168\n\u0003\u0000\u0000\u0165\u0167\u0005"+
		"\u0001\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u016a\u0001"+
		"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005\u0016\u0000\u0000\u016c\u0170\u0003"+
		"&\u0013\u0000\u016d\u016e\n\u0002\u0000\u0000\u016e\u0170\u0003\u001e"+
		"\u000f\u0000\u016f\u0164\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000"+
		"\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u001d\u0001\u0000"+
		"\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0016"+
		"\u0000\u0000\u0175\u0176\u0003&\u0013\u0000\u0176\u0178\u0005\r\u0000"+
		"\u0000\u0177\u0179\u0003 \u0010\u0000\u0178\u0177\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0005\u000e\u0000\u0000\u017b\u001f\u0001\u0000\u0000\u0000"+
		"\u017c\u0187\u0003\u001c\u000e\u0000\u017d\u0181\u0005\f\u0000\u0000\u017e"+
		"\u0180\u0005\u0001\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180"+
		"\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0184\u0186\u0003\u001c\u000e\u0000\u0185"+
		"\u017d\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188"+
		"!\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0007\u0001\u0000\u0000\u018b#\u0001\u0000\u0000\u0000\u018c\u0197\u0003"+
		"&\u0013\u0000\u018d\u018f\u0005\u0001\u0000\u0000\u018e\u018d\u0001\u0000"+
		"\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000"+
		"\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u0016"+
		"\u0000\u0000\u0194\u0196\u0003&\u0013\u0000\u0195\u0190\u0001\u0000\u0000"+
		"\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u0016\u0000"+
		"\u0000\u019b%\u0001\u0000\u0000\u0000\u019c\u019d\u0005\n\u0000\u0000"+
		"\u019d\'\u0001\u0000\u0000\u0000\u019e\u01a2\u0005\u000b\u0000\u0000\u019f"+
		"\u01a1\u0005\u0001\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a6\u0003*\u0015\u0000\u01a6)\u0001"+
		"\u0000\u0000\u0000\u01a7\u01aa\u0003.\u0017\u0000\u01a8\u01aa\u0003,\u0016"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000"+
		"\u0000\u01aa+\u0001\u0000\u0000\u0000\u01ab\u01ac\u0007\u0002\u0000\u0000"+
		"\u01ac-\u0001\u0000\u0000\u0000\u01ad\u01ae\u0007\u0003\u0000\u0000\u01ae"+
		"/\u0001\u0000\u0000\u0000\u01af\u01b3\u00032\u0019\u0000\u01b0\u01b2\u0005"+
		"\u0001\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b4\u01c6\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b6\u01ba\u0005\f\u0000\u0000\u01b7\u01b9\u0005\u0001"+
		"\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000"+
		"\u0000\u0000\u01bd\u01c1\u00032\u0019\u0000\u01be\u01c0\u0005\u0001\u0000"+
		"\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c4\u01b6\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c71\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cd\u0003&\u0013\u0000\u01ca\u01cc\u0005\u0001\u0000\u0000\u01cb"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d2\u0003(\u0014\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d6\u0001\u0000\u0000\u0000\u01d3\u01d5"+
		"\u0005\u0001\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0003\u001a\r\u0000\u01da3\u0001"+
		"\u0000\u0000\u0000\u01db\u01df\u00036\u001b\u0000\u01dc\u01de\u0005\u0001"+
		"\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000"+
		"\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0\u01f2\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e6\u0005\f\u0000\u0000\u01e3\u01e5\u0005\u0001\u0000"+
		"\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ed\u00036\u001b\u0000\u01ea\u01ec\u0005\u0001\u0000\u0000"+
		"\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000"+
		"\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000"+
		"\u01f0\u01e2\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f35\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0003\u001c\u000e\u0000\u01f67\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0005 \u0000\u0000\u01f8\u01f9\u0003\u001c\u000e\u0000\u01f9\u01fa\u0005"+
		"#\u0000\u0000\u01fa\u01fe\u0001\u0000\u0000\u0000\u01fb\u01fe\u0005\""+
		"\u0000\u0000\u01fc\u01fe\u0005!\u0000\u0000\u01fd\u01f7\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fe9\u0001\u0000\u0000\u0000CAHLRYdhmv}\u0084\u008b\u0092\u0098"+
		"\u009e\u00a5\u00aa\u00b1\u00b8\u00bf\u00c3\u00cd\u00d3\u00dc\u00e3\u00ec"+
		"\u00f3\u00f7\u00fc\u0105\u010e\u0116\u011a\u011f\u0128\u012f\u0137\u013b"+
		"\u0140\u0148\u014c\u0151\u0156\u015d\u0162\u0168\u016f\u0171\u0178\u0181"+
		"\u0187\u0190\u0197\u01a2\u01a9\u01b3\u01ba\u01c1\u01c6\u01cd\u01d1\u01d6"+
		"\u01df\u01e6\u01ed\u01f2\u01fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}