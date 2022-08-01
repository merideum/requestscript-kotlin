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
		WS=1, REQUEST=2, CONTRACT=3, TYPE_INT=4, TYPE_STRING=5, TYPE_OBJECT=6, 
		IDENTIFIER=7, COLON=8, COMMA=9, PAREN_L=10, PAREN_R=11, CURLY_L=12, SC_WS=13, 
		IMPORT=14, ASSIGN=15, MINUS=16, DOT=17, RETURN=18, CONST=19, VAR=20, RESOURCE_NAME=21, 
		SC_CURLY_L=22, CAPITAL_LETTER=23, LETTER=24, INTEGER=25, QUOTE_DOUBLE=26, 
		DOLLAR_CURLY_L=27, ESCAPE_SEQUENCE=28, TEXT=29, CURLY_R=30, BRACKET_L=31, 
		BRACKET_R=32;
	public static final int
		RULE_parse = 0, RULE_scriptDefinition = 1, RULE_scriptType = 2, RULE_scriptParameterBlock = 3, 
		RULE_scriptParameters = 4, RULE_block = 5, RULE_importResource = 6, RULE_statement = 7, 
		RULE_returnStatement = 8, RULE_variableDeclaration = 9, RULE_variableDeclarationAssignment = 10, 
		RULE_variableReassignment = 11, RULE_objectFieldAssignment = 12, RULE_elementIndexAssignment = 13, 
		RULE_assignment = 14, RULE_expression = 15, RULE_functionCall = 16, RULE_functionParameters = 17, 
		RULE_variableModifier = 18, RULE_resourcePathIdentifier = 19, RULE_simpleIdentifier = 20, 
		RULE_typeDeclaration = 21, RULE_type = 22, RULE_listType = 23, RULE_innerType = 24, 
		RULE_basicType = 25, RULE_objectFields = 26, RULE_objectField = 27, RULE_listElementAssignments = 28, 
		RULE_listElementAssignment = 29, RULE_elementIndex = 30, RULE_stringContent = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "scriptDefinition", "scriptType", "scriptParameterBlock", "scriptParameters", 
			"block", "importResource", "statement", "returnStatement", "variableDeclaration", 
			"variableDeclarationAssignment", "variableReassignment", "objectFieldAssignment", 
			"elementIndexAssignment", "assignment", "expression", "functionCall", 
			"functionParameters", "variableModifier", "resourcePathIdentifier", "simpleIdentifier", 
			"typeDeclaration", "type", "listType", "innerType", "basicType", "objectFields", 
			"objectField", "listElementAssignments", "listElementAssignment", "elementIndex", 
			"stringContent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'request'", "'contract'", null, null, null, null, null, 
			null, null, null, null, null, "'import'", "'='", null, null, "'return'", 
			"'const'", "'var'", null, null, null, null, null, null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "REQUEST", "CONTRACT", "TYPE_INT", "TYPE_STRING", "TYPE_OBJECT", 
			"IDENTIFIER", "COLON", "COMMA", "PAREN_L", "PAREN_R", "CURLY_L", "SC_WS", 
			"IMPORT", "ASSIGN", "MINUS", "DOT", "RETURN", "CONST", "VAR", "RESOURCE_NAME", 
			"SC_CURLY_L", "CAPITAL_LETTER", "LETTER", "INTEGER", "QUOTE_DOUBLE", 
			"DOLLAR_CURLY_L", "ESCAPE_SEQUENCE", "TEXT", "CURLY_R", "BRACKET_L", 
			"BRACKET_R"
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
			setState(64);
			scriptDefinition();
			setState(65);
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
			setState(67);
			scriptType();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(68);
				match(WS);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			simpleIdentifier();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(75);
				match(WS);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_L) {
				{
				setState(81);
				scriptParameterBlock();
				}
			}

			setState(84);
			match(CURLY_L);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(WS);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(91);
			block();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(92);
				match(WS);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
			setState(100);
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
			setState(102);
			match(PAREN_L);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(WS);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(109);
				scriptParameters();
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(112);
				match(WS);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
			setState(120);
			simpleIdentifier();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(121);
				match(WS);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			typeDeclaration();
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					match(WS);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(134);
					match(COMMA);
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(135);
						match(WS);
						}
						}
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(141);
					simpleIdentifier();
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(142);
						match(WS);
						}
						}
						setState(147);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(148);
					typeDeclaration();
					}
					} 
				}
				setState(154);
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
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(155);
				importResource();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					match(WS);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << MINUS) | (1L << RETURN) | (1L << CONST) | (1L << VAR) | (1L << SC_CURLY_L) | (1L << INTEGER) | (1L << QUOTE_DOUBLE) | (1L << BRACKET_L))) != 0)) {
				{
				{
				setState(167);
				statement();
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
		public ElementIndexAssignmentContext elementIndexAssignment() {
			return getRuleContext(ElementIndexAssignmentContext.class,0);
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
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
				elementIndexAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(RETURN);
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
			expression(0);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(WS);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(VAR);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(223);
				match(WS);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			simpleIdentifier();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(230);
				match(WS);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			typeDeclaration();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					match(WS);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			setState(243);
			variableModifier();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(244);
				match(WS);
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			simpleIdentifier();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					match(WS);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(257);
				typeDeclaration();
				}
			}

			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(260);
				match(WS);
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			assignment();
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					match(WS);
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			simpleIdentifier();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(274);
				match(WS);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			assignment();
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					match(WS);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(287);
			((ObjectFieldAssignmentContext)_localctx).variableName = simpleIdentifier();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(288);
				match(WS);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(DOT);
			setState(295);
			((ObjectFieldAssignmentContext)_localctx).fieldName = simpleIdentifier();
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					match(WS);
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(302);
				typeDeclaration();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(305);
				match(WS);
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			assignment();
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(WS);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class ElementIndexAssignmentContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ElementIndexContext elementIndex() {
			return getRuleContext(ElementIndexContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ElementIndexAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementIndexAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterElementIndexAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitElementIndexAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitElementIndexAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementIndexAssignmentContext elementIndexAssignment() throws RecognitionException {
		ElementIndexAssignmentContext _localctx = new ElementIndexAssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elementIndexAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			simpleIdentifier();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(319);
				match(WS);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			elementIndex();
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
		enterRule(_localctx, 28, RULE_assignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ASSIGN);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(335);
				match(WS);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			expression(0);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					match(WS);
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class ElementIndexExpressionContext extends ExpressionContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ElementIndexContext elementIndex() {
			return getRuleContext(ElementIndexContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ElementIndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterElementIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitElementIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitElementIndexExpression(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleIdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(349);
				simpleIdentifier();
				}
				break;
			case 2:
				{
				_localctx = new ObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				match(SC_CURLY_L);
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(351);
						match(WS);
						}
						} 
					}
					setState(356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(357);
					objectFields();
					}
				}

				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(360);
					match(WS);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				match(CURLY_R);
				}
				break;
			case 3:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				match(BRACKET_L);
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(368);
						match(WS);
						}
						} 
					}
					setState(373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << MINUS) | (1L << SC_CURLY_L) | (1L << INTEGER) | (1L << QUOTE_DOUBLE) | (1L << BRACKET_L))) != 0)) {
					{
					setState(374);
					listElementAssignments();
					}
				}

				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(377);
					match(WS);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(BRACKET_R);
				}
				break;
			case 4:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(384);
					match(MINUS);
					}
				}

				setState(387);
				match(INTEGER);
				}
				break;
			case 5:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(388);
				match(QUOTE_DOUBLE);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOLLAR_CURLY_L) | (1L << ESCAPE_SEQUENCE) | (1L << TEXT))) != 0)) {
					{
					{
					setState(389);
					stringContent();
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				match(QUOTE_DOUBLE);
				}
				break;
			case 6:
				{
				_localctx = new ElementIndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(396);
				simpleIdentifier();
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
				elementIndex();
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(404);
						match(WS);
						}
						} 
					}
					setState(409);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new ObjectFieldReferenceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(412);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(416);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(413);
							match(WS);
							}
							}
							setState(418);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(419);
						match(DOT);
						setState(420);
						simpleIdentifier();
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(421);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(422);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		enterRule(_localctx, 32, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(DOT);
			setState(429);
			simpleIdentifier();
			setState(430);
			match(PAREN_L);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << MINUS) | (1L << SC_CURLY_L) | (1L << INTEGER) | (1L << QUOTE_DOUBLE) | (1L << BRACKET_L))) != 0)) {
				{
				setState(431);
				functionParameters();
				}
			}

			setState(434);
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
		enterRule(_localctx, 34, RULE_functionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			expression(0);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(437);
					match(COMMA);
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(438);
						match(WS);
						}
						}
						setState(443);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(444);
					expression(0);
					}
					} 
				}
				setState(449);
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
		enterRule(_localctx, 36, RULE_variableModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
		enterRule(_localctx, 38, RULE_resourcePathIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			simpleIdentifier();
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(453);
						match(WS);
						}
						}
						setState(458);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(459);
					match(DOT);
					setState(460);
					simpleIdentifier();
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(466);
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
		enterRule(_localctx, 40, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
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
		enterRule(_localctx, 42, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(COLON);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(471);
				match(WS);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
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
		enterRule(_localctx, 44, RULE_type);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_STRING:
			case TYPE_OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				basicType();
				}
				break;
			case BRACKET_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
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
		public TerminalNode BRACKET_L() { return getToken(MeritParser.BRACKET_L, 0); }
		public InnerTypeContext innerType() {
			return getRuleContext(InnerTypeContext.class,0);
		}
		public TerminalNode BRACKET_R() { return getToken(MeritParser.BRACKET_R, 0); }
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
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
		enterRule(_localctx, 46, RULE_listType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(BRACKET_L);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(484);
				match(WS);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			innerType();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(491);
				match(WS);
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
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

	public static class InnerTypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public InnerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterInnerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitInnerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitInnerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerTypeContext innerType() throws RecognitionException {
		InnerTypeContext _localctx = new InnerTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_innerType);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_STRING:
			case TYPE_OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				basicType();
				}
				break;
			case BRACKET_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
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
		enterRule(_localctx, 50, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
		enterRule(_localctx, 52, RULE_objectFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			objectField();
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506);
					match(WS);
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(512);
					match(COMMA);
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(513);
						match(WS);
						}
						}
						setState(518);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(519);
					objectField();
					setState(523);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(520);
							match(WS);
							}
							} 
						}
						setState(525);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
					}
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 54, RULE_objectField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			simpleIdentifier();
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(532);
					match(WS);
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(538);
				typeDeclaration();
				}
			}

			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(541);
				match(WS);
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
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
		enterRule(_localctx, 56, RULE_listElementAssignments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			listElementAssignment();
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(550);
					match(WS);
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(556);
					match(COMMA);
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(557);
						match(WS);
						}
						}
						setState(562);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(563);
					listElementAssignment();
					setState(567);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(564);
							match(WS);
							}
							} 
						}
						setState(569);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					}
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		enterRule(_localctx, 58, RULE_listElementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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

	public static class ElementIndexContext extends ParserRuleContext {
		public TerminalNode BRACKET_L() { return getToken(MeritParser.BRACKET_L, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_R() { return getToken(MeritParser.BRACKET_R, 0); }
		public List<TerminalNode> WS() { return getTokens(MeritParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MeritParser.WS, i);
		}
		public ElementIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).enterElementIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeritParserListener ) ((MeritParserListener)listener).exitElementIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeritParserVisitor ) return ((MeritParserVisitor<? extends T>)visitor).visitElementIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementIndexContext elementIndex() throws RecognitionException {
		ElementIndexContext _localctx = new ElementIndexContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elementIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(BRACKET_L);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(578);
				match(WS);
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(584);
			expression(0);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(585);
				match(WS);
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(591);
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
		enterRule(_localctx, 62, RULE_stringContent);
		try {
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_CURLY_L:
				_localctx = new EmbeddedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(DOLLAR_CURLY_L);
				setState(594);
				expression(0);
				setState(595);
				match(CURLY_R);
				}
				break;
			case TEXT:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(TEXT);
				}
				break;
			case ESCAPE_SEQUENCE:
				_localctx = new EscapeSequenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u025a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001M\b\u0001\n\u0001\f\u0001P\t\u0001\u0001\u0001"+
		"\u0003\u0001S\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001W\b\u0001\n\u0001"+
		"\f\u0001Z\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001^\b\u0001\n\u0001"+
		"\f\u0001a\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0005\u0003i\b\u0003\n\u0003\f\u0003l\t\u0003\u0001"+
		"\u0003\u0003\u0003o\b\u0003\u0001\u0003\u0005\u0003r\b\u0003\n\u0003\f"+
		"\u0003u\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u0004{\b\u0004\n\u0004\f\u0004~\t\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0082\b\u0004\n\u0004\f\u0004\u0085\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0089\b\u0004\n\u0004\f\u0004\u008c\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0090\b\u0004\n\u0004\f\u0004\u0093\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0097\b\u0004\n\u0004\f\u0004\u009a\t\u0004\u0001"+
		"\u0005\u0005\u0005\u009d\b\u0005\n\u0005\f\u0005\u00a0\t\u0005\u0001\u0005"+
		"\u0005\u0005\u00a3\b\u0005\n\u0005\f\u0005\u00a6\t\u0005\u0001\u0005\u0005"+
		"\u0005\u00a9\b\u0005\n\u0005\f\u0005\u00ac\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00b0\b\u0006\n\u0006\f\u0006\u00b3\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00b7\b\u0006\n\u0006\f\u0006\u00ba\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00be\b\u0006\n\u0006\f\u0006\u00c1\t\u0006\u0001"+
		"\u0006\u0003\u0006\u00c4\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00cf\b\u0007\u0001\b\u0001\b\u0005\b\u00d3\b\b\n\b\f\b\u00d6\t"+
		"\b\u0001\b\u0001\b\u0005\b\u00da\b\b\n\b\f\b\u00dd\t\b\u0001\t\u0001\t"+
		"\u0005\t\u00e1\b\t\n\t\f\t\u00e4\t\t\u0001\t\u0001\t\u0005\t\u00e8\b\t"+
		"\n\t\f\t\u00eb\t\t\u0001\t\u0001\t\u0005\t\u00ef\b\t\n\t\f\t\u00f2\t\t"+
		"\u0001\n\u0001\n\u0005\n\u00f6\b\n\n\n\f\n\u00f9\t\n\u0001\n\u0001\n\u0005"+
		"\n\u00fd\b\n\n\n\f\n\u0100\t\n\u0001\n\u0003\n\u0103\b\n\u0001\n\u0005"+
		"\n\u0106\b\n\n\n\f\n\u0109\t\n\u0001\n\u0001\n\u0005\n\u010d\b\n\n\n\f"+
		"\n\u0110\t\n\u0001\u000b\u0001\u000b\u0005\u000b\u0114\b\u000b\n\u000b"+
		"\f\u000b\u0117\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u011b\b\u000b"+
		"\n\u000b\f\u000b\u011e\t\u000b\u0001\f\u0001\f\u0005\f\u0122\b\f\n\f\f"+
		"\f\u0125\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u012a\b\f\n\f\f\f\u012d\t"+
		"\f\u0001\f\u0003\f\u0130\b\f\u0001\f\u0005\f\u0133\b\f\n\f\f\f\u0136\t"+
		"\f\u0001\f\u0001\f\u0005\f\u013a\b\f\n\f\f\f\u013d\t\f\u0001\r\u0001\r"+
		"\u0005\r\u0141\b\r\n\r\f\r\u0144\t\r\u0001\r\u0001\r\u0005\r\u0148\b\r"+
		"\n\r\f\r\u014b\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0151\b\u000e\n\u000e\f\u000e\u0154\t\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0158\b\u000e\n\u000e\f\u000e\u015b\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0161\b\u000f\n\u000f\f\u000f\u0164"+
		"\t\u000f\u0001\u000f\u0003\u000f\u0167\b\u000f\u0001\u000f\u0005\u000f"+
		"\u016a\b\u000f\n\u000f\f\u000f\u016d\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0172\b\u000f\n\u000f\f\u000f\u0175\t\u000f\u0001\u000f"+
		"\u0003\u000f\u0178\b\u000f\u0001\u000f\u0005\u000f\u017b\b\u000f\n\u000f"+
		"\f\u000f\u017e\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0182\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0187\b\u000f\n\u000f"+
		"\f\u000f\u018a\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u018f\b\u000f\n\u000f\f\u000f\u0192\t\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0196\b\u000f\n\u000f\f\u000f\u0199\t\u000f\u0003\u000f\u019b\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u019f\b\u000f\n\u000f\f\u000f"+
		"\u01a2\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u01a8\b\u000f\n\u000f\f\u000f\u01ab\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u01b1\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01b8\b\u0011\n\u0011\f\u0011"+
		"\u01bb\t\u0011\u0001\u0011\u0005\u0011\u01be\b\u0011\n\u0011\f\u0011\u01c1"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u01c7"+
		"\b\u0013\n\u0013\f\u0013\u01ca\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u01ce\b\u0013\n\u0013\f\u0013\u01d1\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u01d9\b\u0015\n"+
		"\u0015\f\u0015\u01dc\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01e2\b\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u01e6"+
		"\b\u0017\n\u0017\f\u0017\u01e9\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u01ed\b\u0017\n\u0017\f\u0017\u01f0\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01f6\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u01fc\b\u001a\n\u001a\f\u001a\u01ff\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0203\b\u001a\n\u001a\f\u001a\u0206"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u020a\b\u001a\n\u001a\f\u001a"+
		"\u020d\t\u001a\u0005\u001a\u020f\b\u001a\n\u001a\f\u001a\u0212\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0216\b\u001b\n\u001b\f\u001b\u0219"+
		"\t\u001b\u0001\u001b\u0003\u001b\u021c\b\u001b\u0001\u001b\u0005\u001b"+
		"\u021f\b\u001b\n\u001b\f\u001b\u0222\t\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0228\b\u001c\n\u001c\f\u001c\u022b\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u022f\b\u001c\n\u001c\f\u001c\u0232"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0236\b\u001c\n\u001c\f\u001c"+
		"\u0239\t\u001c\u0005\u001c\u023b\b\u001c\n\u001c\f\u001c\u023e\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u0244\b\u001e"+
		"\n\u001e\f\u001e\u0247\t\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u024b"+
		"\b\u001e\n\u001e\f\u001e\u024e\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0258\b\u001f\u0001\u001f\u0004\u0098\u01bf\u0210\u023c\u0001\u001e "+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>\u0000\u0003\u0001\u0000\u0002\u0003\u0001"+
		"\u0000\u0013\u0014\u0001\u0000\u0004\u0006\u0293\u0000@\u0001\u0000\u0000"+
		"\u0000\u0002C\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006"+
		"f\u0001\u0000\u0000\u0000\bx\u0001\u0000\u0000\u0000\n\u009e\u0001\u0000"+
		"\u0000\u0000\f\u00ad\u0001\u0000\u0000\u0000\u000e\u00ce\u0001\u0000\u0000"+
		"\u0000\u0010\u00d0\u0001\u0000\u0000\u0000\u0012\u00de\u0001\u0000\u0000"+
		"\u0000\u0014\u00f3\u0001\u0000\u0000\u0000\u0016\u0111\u0001\u0000\u0000"+
		"\u0000\u0018\u011f\u0001\u0000\u0000\u0000\u001a\u013e\u0001\u0000\u0000"+
		"\u0000\u001c\u014e\u0001\u0000\u0000\u0000\u001e\u019a\u0001\u0000\u0000"+
		"\u0000 \u01ac\u0001\u0000\u0000\u0000\"\u01b4\u0001\u0000\u0000\u0000"+
		"$\u01c2\u0001\u0000\u0000\u0000&\u01c4\u0001\u0000\u0000\u0000(\u01d4"+
		"\u0001\u0000\u0000\u0000*\u01d6\u0001\u0000\u0000\u0000,\u01e1\u0001\u0000"+
		"\u0000\u0000.\u01e3\u0001\u0000\u0000\u00000\u01f5\u0001\u0000\u0000\u0000"+
		"2\u01f7\u0001\u0000\u0000\u00004\u01f9\u0001\u0000\u0000\u00006\u0213"+
		"\u0001\u0000\u0000\u00008\u0225\u0001\u0000\u0000\u0000:\u023f\u0001\u0000"+
		"\u0000\u0000<\u0241\u0001\u0000\u0000\u0000>\u0257\u0001\u0000\u0000\u0000"+
		"@A\u0003\u0002\u0001\u0000AB\u0005\u0000\u0000\u0001B\u0001\u0001\u0000"+
		"\u0000\u0000CG\u0003\u0004\u0002\u0000DF\u0005\u0001\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JN\u0003(\u0014\u0000KM\u0005\u0001\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0003"+
		"\u0006\u0003\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TX\u0005\f\u0000\u0000UW\u0005\u0001\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[_\u0003\n\u0005\u0000\\^\u0005\u0001\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bc\u0005\u001e\u0000\u0000c\u0003\u0001\u0000\u0000\u0000de\u0007"+
		"\u0000\u0000\u0000e\u0005\u0001\u0000\u0000\u0000fj\u0005\n\u0000\u0000"+
		"gi\u0005\u0001\u0000\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0003\b\u0004\u0000nm\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000os\u0001\u0000\u0000\u0000pr\u0005"+
		"\u0001\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vw\u0005\u000b\u0000\u0000w\u0007\u0001"+
		"\u0000\u0000\u0000x|\u0003(\u0014\u0000y{\u0005\u0001\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0083\u0003*\u0015\u0000\u0080\u0082\u0005\u0001\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0098\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u008a\u0005\t\u0000\u0000\u0087\u0089\u0005\u0001\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008d\u0091\u0003(\u0014\u0000\u008e\u0090\u0005\u0001\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0003*\u0015\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0086"+
		"\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\t\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0003"+
		"\f\u0006\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a4\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0005\u0001\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003\u000e"+
		"\u0007\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u000b\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b1\u0005\u000e\u0000\u0000\u00ae\u00b0\u0005\u0001"+
		"\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b8\u0005\u0007\u0000\u0000\u00b5\u00b7\u0005\u0001"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bf\u0005\b\u0000\u0000\u00bc\u00be\u0005\u0001\u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0003&\u0013\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0015\u0000\u0000\u00c6\r\u0001\u0000\u0000\u0000\u00c7"+
		"\u00cf\u0003\u001e\u000f\u0000\u00c8\u00cf\u0003\u0012\t\u0000\u00c9\u00cf"+
		"\u0003\u0014\n\u0000\u00ca\u00cf\u0003\u0016\u000b\u0000\u00cb\u00cf\u0003"+
		"\u0018\f\u0000\u00cc\u00cf\u0003\u001a\r\u0000\u00cd\u00cf\u0003\u0010"+
		"\b\u0000\u00ce\u00c7\u0001\u0000\u0000\u0000\u00ce\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ce\u00c9\u0001\u0000\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u000f\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d4\u0005\u0012\u0000\u0000\u00d1\u00d3\u0005\u0001\u0000"+
		"\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00db\u0003\u001e\u000f\u0000\u00d8\u00da\u0005\u0001\u0000"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u0011\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00e2\u0005\u0014\u0000\u0000\u00df\u00e1\u0005\u0001\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e9\u0003(\u0014\u0000\u00e6\u00e8\u0005\u0001\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ec\u00f0\u0003*\u0015\u0000\u00ed\u00ef\u0005\u0001\u0000\u0000\u00ee"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u0013\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f7\u0003$\u0012\u0000\u00f4\u00f6\u0005\u0001\u0000\u0000\u00f5\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fe"+
		"\u0003(\u0014\u0000\u00fb\u00fd\u0005\u0001\u0000\u0000\u00fc\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0102\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0103\u0003"+
		"*\u0015\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u0107\u0001\u0000\u0000\u0000\u0104\u0106\u0005\u0001"+
		"\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u010e\u0003\u001c\u000e\u0000\u010b\u010d\u0005\u0001"+
		"\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u0015\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0111\u0115\u0003(\u0014\u0000\u0112\u0114\u0005\u0001\u0000"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u011c\u0003\u001c\u000e\u0000\u0119\u011b\u0005\u0001\u0000"+
		"\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000"+
		"\u0000\u011d\u0017\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011f\u0123\u0003(\u0014\u0000\u0120\u0122\u0005\u0001\u0000\u0000"+
		"\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005\u0011\u0000\u0000\u0127\u012b\u0003(\u0014\u0000\u0128"+
		"\u012a\u0005\u0001\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a"+
		"\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d"+
		"\u012b\u0001\u0000\u0000\u0000\u012e\u0130\u0003*\u0015\u0000\u012f\u012e"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0134"+
		"\u0001\u0000\u0000\u0000\u0131\u0133\u0005\u0001\u0000\u0000\u0132\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0137"+
		"\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u013b"+
		"\u0003\u001c\u000e\u0000\u0138\u013a\u0005\u0001\u0000\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0019"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0142"+
		"\u0003(\u0014\u0000\u013f\u0141\u0005\u0001\u0000\u0000\u0140\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001"+
		"\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0149\u0003"+
		"<\u001e\u0000\u0146\u0148\u0005\u0001\u0000\u0000\u0147\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014d\u0003\u001c"+
		"\u000e\u0000\u014d\u001b\u0001\u0000\u0000\u0000\u014e\u0152\u0005\u000f"+
		"\u0000\u0000\u014f\u0151\u0005\u0001\u0000\u0000\u0150\u014f\u0001\u0000"+
		"\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0159\u0003\u001e"+
		"\u000f\u0000\u0156\u0158\u0005\u0001\u0000\u0000\u0157\u0156\u0001\u0000"+
		"\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u001d\u0001\u0000"+
		"\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0006\u000f"+
		"\uffff\uffff\u0000\u015d\u019b\u0003(\u0014\u0000\u015e\u0162\u0005\u0016"+
		"\u0000\u0000\u015f\u0161\u0005\u0001\u0000\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0167\u00034\u001a"+
		"\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u016b\u0001\u0000\u0000\u0000\u0168\u016a\u0005\u0001\u0000"+
		"\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000"+
		"\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000"+
		"\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000"+
		"\u0000\u016e\u019b\u0005\u001e\u0000\u0000\u016f\u0173\u0005\u001f\u0000"+
		"\u0000\u0170\u0172\u0005\u0001\u0000\u0000\u0171\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0178\u00038\u001c\u0000"+
		"\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u017c\u0001\u0000\u0000\u0000\u0179\u017b\u0005\u0001\u0000\u0000"+
		"\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000"+
		"\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000"+
		"\u017f\u019b\u0005 \u0000\u0000\u0180\u0182\u0005\u0010\u0000\u0000\u0181"+
		"\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u019b\u0005\u0019\u0000\u0000\u0184"+
		"\u0188\u0005\u001a\u0000\u0000\u0185\u0187\u0003>\u001f\u0000\u0186\u0185"+
		"\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b"+
		"\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u019b"+
		"\u0005\u001a\u0000\u0000\u018c\u0190\u0003(\u0014\u0000\u018d\u018f\u0005"+
		"\u0001\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0190\u0001"+
		"\u0000\u0000\u0000\u0193\u0197\u0003<\u001e\u0000\u0194\u0196\u0005\u0001"+
		"\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000"+
		"\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u019a\u015c\u0001\u0000\u0000\u0000\u019a\u015e\u0001\u0000"+
		"\u0000\u0000\u019a\u016f\u0001\u0000\u0000\u0000\u019a\u0181\u0001\u0000"+
		"\u0000\u0000\u019a\u0184\u0001\u0000\u0000\u0000\u019a\u018c\u0001\u0000"+
		"\u0000\u0000\u019b\u01a9\u0001\u0000\u0000\u0000\u019c\u01a0\n\b\u0000"+
		"\u0000\u019d\u019f\u0005\u0001\u0000\u0000\u019e\u019d\u0001\u0000\u0000"+
		"\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u0011\u0000"+
		"\u0000\u01a4\u01a8\u0003(\u0014\u0000\u01a5\u01a6\n\u0007\u0000\u0000"+
		"\u01a6\u01a8\u0003 \u0010\u0000\u01a7\u019c\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u001f\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0005\u0011\u0000\u0000\u01ad\u01ae\u0003(\u0014\u0000\u01ae\u01b0"+
		"\u0005\n\u0000\u0000\u01af\u01b1\u0003\"\u0011\u0000\u01b0\u01af\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0005\u000b\u0000\u0000\u01b3!\u0001\u0000"+
		"\u0000\u0000\u01b4\u01bf\u0003\u001e\u000f\u0000\u01b5\u01b9\u0005\t\u0000"+
		"\u0000\u01b6\u01b8\u0005\u0001\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01be\u0003\u001e\u000f"+
		"\u0000\u01bd\u01b5\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c0#\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0007\u0001\u0000\u0000\u01c3%\u0001\u0000\u0000\u0000\u01c4"+
		"\u01cf\u0003(\u0014\u0000\u01c5\u01c7\u0005\u0001\u0000\u0000\u01c6\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0005\u0011\u0000\u0000\u01cc\u01ce\u0003(\u0014\u0000\u01cd\u01c8\u0001"+
		"\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005"+
		"\u0011\u0000\u0000\u01d3\'\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005\u0007"+
		"\u0000\u0000\u01d5)\u0001\u0000\u0000\u0000\u01d6\u01da\u0005\b\u0000"+
		"\u0000\u01d7\u01d9\u0005\u0001\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01de\u0003,\u0016\u0000"+
		"\u01de+\u0001\u0000\u0000\u0000\u01df\u01e2\u00032\u0019\u0000\u01e0\u01e2"+
		"\u0003.\u0017\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e2-\u0001\u0000\u0000\u0000\u01e3\u01e7\u0005\u001f"+
		"\u0000\u0000\u01e4\u01e6\u0005\u0001\u0000\u0000\u01e5\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000"+
		"\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01ee\u00030\u0018"+
		"\u0000\u01eb\u01ed\u0005\u0001\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005 \u0000\u0000"+
		"\u01f2/\u0001\u0000\u0000\u0000\u01f3\u01f6\u00032\u0019\u0000\u01f4\u01f6"+
		"\u0003.\u0017\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f61\u0001\u0000\u0000\u0000\u01f7\u01f8\u0007\u0002"+
		"\u0000\u0000\u01f83\u0001\u0000\u0000\u0000\u01f9\u01fd\u00036\u001b\u0000"+
		"\u01fa\u01fc\u0005\u0001\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0210\u0001\u0000\u0000\u0000"+
		"\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0204\u0005\t\u0000\u0000\u0201"+
		"\u0203\u0005\u0001\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203"+
		"\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206"+
		"\u0204\u0001\u0000\u0000\u0000\u0207\u020b\u00036\u001b\u0000\u0208\u020a"+
		"\u0005\u0001\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u020d"+
		"\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0001\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b"+
		"\u0001\u0000\u0000\u0000\u020e\u0200\u0001\u0000\u0000\u0000\u020f\u0212"+
		"\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0210\u020e"+
		"\u0001\u0000\u0000\u0000\u02115\u0001\u0000\u0000\u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0213\u0217\u0003(\u0014\u0000\u0214\u0216\u0005\u0001"+
		"\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000"+
		"\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000"+
		"\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000"+
		"\u0000\u0000\u021a\u021c\u0003*\u0015\u0000\u021b\u021a\u0001\u0000\u0000"+
		"\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u0220\u0001\u0000\u0000"+
		"\u0000\u021d\u021f\u0005\u0001\u0000\u0000\u021e\u021d\u0001\u0000\u0000"+
		"\u0000\u021f\u0222\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0223\u0001\u0000\u0000"+
		"\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223\u0224\u0003\u001c\u000e"+
		"\u0000\u02247\u0001\u0000\u0000\u0000\u0225\u0229\u0003:\u001d\u0000\u0226"+
		"\u0228\u0005\u0001\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228"+
		"\u022b\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0001\u0000\u0000\u0000\u022a\u023c\u0001\u0000\u0000\u0000\u022b"+
		"\u0229\u0001\u0000\u0000\u0000\u022c\u0230\u0005\t\u0000\u0000\u022d\u022f"+
		"\u0005\u0001\u0000\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022f\u0232"+
		"\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u0230"+
		"\u0001\u0000\u0000\u0000\u0233\u0237\u0003:\u001d\u0000\u0234\u0236\u0005"+
		"\u0001\u0000\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0236\u0239\u0001"+
		"\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001"+
		"\u0000\u0000\u0000\u0238\u023b\u0001\u0000\u0000\u0000\u0239\u0237\u0001"+
		"\u0000\u0000\u0000\u023a\u022c\u0001\u0000\u0000\u0000\u023b\u023e\u0001"+
		"\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023c\u023a\u0001"+
		"\u0000\u0000\u0000\u023d9\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0003\u001e\u000f\u0000\u0240;\u0001\u0000\u0000"+
		"\u0000\u0241\u0245\u0005\u001f\u0000\u0000\u0242\u0244\u0005\u0001\u0000"+
		"\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000\u0000"+
		"\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246\u0248\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000"+
		"\u0000\u0248\u024c\u0003\u001e\u000f\u0000\u0249\u024b\u0005\u0001\u0000"+
		"\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000"+
		"\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000"+
		"\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0005 \u0000\u0000\u0250=\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0005\u001b\u0000\u0000\u0252\u0253\u0003\u001e\u000f\u0000\u0253"+
		"\u0254\u0005\u001e\u0000\u0000\u0254\u0258\u0001\u0000\u0000\u0000\u0255"+
		"\u0258\u0005\u001d\u0000\u0000\u0256\u0258\u0005\u001c\u0000\u0000\u0257"+
		"\u0251\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257"+
		"\u0256\u0001\u0000\u0000\u0000\u0258?\u0001\u0000\u0000\u0000PGNRX_jn"+
		"s|\u0083\u008a\u0091\u0098\u009e\u00a4\u00aa\u00b1\u00b8\u00bf\u00c3\u00ce"+
		"\u00d4\u00db\u00e2\u00e9\u00f0\u00f7\u00fe\u0102\u0107\u010e\u0115\u011c"+
		"\u0123\u012b\u012f\u0134\u013b\u0142\u0149\u0152\u0159\u0162\u0166\u016b"+
		"\u0173\u0177\u017c\u0181\u0188\u0190\u0197\u019a\u01a0\u01a7\u01a9\u01b0"+
		"\u01b9\u01bf\u01c8\u01cf\u01da\u01e1\u01e7\u01ee\u01f5\u01fd\u0204\u020b"+
		"\u0210\u0217\u021b\u0220\u0229\u0230\u0237\u023c\u0245\u024c\u0257";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}