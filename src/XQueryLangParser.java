// Generated from src/XQueryLang.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FOR=2, LET=3, IN=4, RETURN=5, JOIN=6, IS=7, EMPTY=8, SOME=9, SATISFIES=10, 
		EQ=11, WHERE=12, DOC=13, TEXT=14, AND=15, OR=16, NOT=17, NAMESTRING=18, 
		VARSTRING=19, LPAREN=20, RPAREN=21, LBRACKET=22, RBRACKET=23, LBRACE=24, 
		RBRACE=25, LESS=26, GREATER=27, DEQUAL=28, ASSIGN=29, EQUAL=30, AT=31, 
		DOT=32, COMMA=33, STAR=34, LSLASH=35, COMMENT=36, SPACE=37, PATHSTRING=38, 
		STRING=39;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_filter = 2, RULE_fileName = 3, RULE_tagName = 4, 
		RULE_attName = 5, RULE_commaStat = 6, RULE_slashStat = 7, RULE_statement = 8, 
		RULE_forStatement = 9, RULE_letStatement = 10, RULE_joinStatement = 11, 
		RULE_varListClause = 12, RULE_forClause = 13, RULE_returnClause = 14, 
		RULE_letClause = 15, RULE_whereClause = 16, RULE_condition = 17, RULE_variable = 18, 
		RULE_stringConstant = 19;
	public static final String[] ruleNames = {
		"ap", "rp", "filter", "fileName", "tagName", "attName", "commaStat", "slashStat", 
		"statement", "forStatement", "letStatement", "joinStatement", "varListClause", 
		"forClause", "returnClause", "letClause", "whereClause", "condition", 
		"variable", "stringConstant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'for'", "'let'", "'in'", "'return'", "'join'", "'is'", "'empty'", 
		"'some'", "'satisfies'", "'eq'", "'where'", "'doc'", "'text'", "'and'", 
		"'or'", "'not'", null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'<'", "'>'", "'=='", "':='", "'='", "'@'", "'.'", "','", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "FOR", "LET", "IN", "RETURN", "JOIN", "IS", "EMPTY", "SOME", 
		"SATISFIES", "EQ", "WHERE", "DOC", "TEXT", "AND", "OR", "NOT", "NAMESTRING", 
		"VARSTRING", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", 
		"LESS", "GREATER", "DEQUAL", "ASSIGN", "EQUAL", "AT", "DOT", "COMMA", 
		"STAR", "LSLASH", "COMMENT", "SPACE", "PATHSTRING", "STRING"
	};
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
	public String getGrammarFileName() { return "XQueryLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ApContext extends ParserRuleContext {
		public TerminalNode DOC() { return getToken(XQueryLangParser.DOC, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryLangParser.LPAREN, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryLangParser.RPAREN, 0); }
		public List<TerminalNode> LSLASH() { return getTokens(XQueryLangParser.LSLASH); }
		public TerminalNode LSLASH(int i) {
			return getToken(XQueryLangParser.LSLASH, i);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(DOC);
			setState(41);
			match(LPAREN);
			setState(42);
			fileName();
			setState(43);
			match(RPAREN);
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(44);
				match(LSLASH);
				}
				break;
			}
			setState(47);
			match(LSLASH);
			setState(48);
			rp(0);
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rp_dotdotContext extends RpContext {
		public List<TerminalNode> DOT() { return getTokens(XQueryLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(XQueryLangParser.DOT, i);
		}
		public Rp_dotdotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_dotdot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_dotdot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_dotdot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_starContext extends RpContext {
		public TerminalNode STAR() { return getToken(XQueryLangParser.STAR, 0); }
		public Rp_starContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_star(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_star(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_star(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_dotContext extends RpContext {
		public TerminalNode DOT() { return getToken(XQueryLangParser.DOT, 0); }
		public Rp_dotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_dot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_commaContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(XQueryLangParser.COMMA, 0); }
		public Rp_commaContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_comma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_textContext extends RpContext {
		public TerminalNode TEXT() { return getToken(XQueryLangParser.TEXT, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryLangParser.RPAREN, 0); }
		public Rp_textContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_text(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_tagNameContext extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public Rp_tagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_tagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_tagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_tagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_filterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(XQueryLangParser.LBRACKET, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(XQueryLangParser.RBRACKET, 0); }
		public Rp_filterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_parenContext extends RpContext {
		public TerminalNode LPAREN() { return getToken(XQueryLangParser.LPAREN, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryLangParser.RPAREN, 0); }
		public Rp_parenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_atContext extends RpContext {
		public TerminalNode AT() { return getToken(XQueryLangParser.AT, 0); }
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public Rp_atContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_at(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_at(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_at(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_slashContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<TerminalNode> LSLASH() { return getTokens(XQueryLangParser.LSLASH); }
		public TerminalNode LSLASH(int i) {
			return getToken(XQueryLangParser.LSLASH, i);
		}
		public Rp_slashContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterRp_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitRp_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitRp_slash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new Rp_tagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				tagName();
				}
				break;
			case 2:
				{
				_localctx = new Rp_starContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(STAR);
				}
				break;
			case 3:
				{
				_localctx = new Rp_dotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(DOT);
				}
				break;
			case 4:
				{
				_localctx = new Rp_dotdotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(DOT);
				setState(55);
				match(DOT);
				}
				break;
			case 5:
				{
				_localctx = new Rp_textContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(TEXT);
				setState(57);
				match(LPAREN);
				setState(58);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new Rp_atContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(AT);
				setState(60);
				attName();
				}
				break;
			case 7:
				{
				_localctx = new Rp_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(LPAREN);
				setState(62);
				rp(0);
				setState(63);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_slashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(67);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(68);
							match(LSLASH);
							}
							break;
						}
						setState(71);
						match(LSLASH);
						setState(72);
						rp(4);
						}
						break;
					case 2:
						{
						_localctx = new Rp_commaContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(73);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(74);
						match(COMMA);
						setState(75);
						rp(2);
						}
						break;
					case 3:
						{
						_localctx = new Rp_filterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(76);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(77);
						match(LBRACKET);
						setState(78);
						filter(0);
						setState(79);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Filter_rpContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Filter_rpContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterFilter_rp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitFilter_rp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitFilter_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_eqContext extends FilterContext {
		public Token op;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(XQueryLangParser.EQUAL, 0); }
		public TerminalNode EQ() { return getToken(XQueryLangParser.EQ, 0); }
		public Filter_eqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterFilter_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitFilter_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitFilter_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_andOrContext extends FilterContext {
		public Token op;
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public TerminalNode AND() { return getToken(XQueryLangParser.AND, 0); }
		public TerminalNode OR() { return getToken(XQueryLangParser.OR, 0); }
		public Filter_andOrContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterFilter_andOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitFilter_andOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitFilter_andOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_isContext extends FilterContext {
		public Token op;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode DEQUAL() { return getToken(XQueryLangParser.DEQUAL, 0); }
		public TerminalNode IS() { return getToken(XQueryLangParser.IS, 0); }
		public Filter_isContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterFilter_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitFilter_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitFilter_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_parenContext extends FilterContext {
		public TerminalNode LPAREN() { return getToken(XQueryLangParser.LPAREN, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryLangParser.RPAREN, 0); }
		public Filter_parenContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterFilter_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitFilter_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitFilter_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_notContext extends FilterContext {
		public TerminalNode NOT() { return getToken(XQueryLangParser.NOT, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Filter_notContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterFilter_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitFilter_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitFilter_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_filter, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(87);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Filter_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				rp(0);
				setState(89);
				((Filter_eqContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==EQUAL) ) {
					((Filter_eqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				rp(0);
				setState(93);
				((Filter_isContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IS || _la==DEQUAL) ) {
					((Filter_isContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Filter_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(LPAREN);
				setState(97);
				filter(0);
				setState(98);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(NOT);
				setState(101);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Filter_andOrContext(new FilterContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_filter);
					setState(104);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(105);
					((Filter_andOrContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((Filter_andOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(106);
					filter(3);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode PATHSTRING() { return getToken(XQueryLangParser.PATHSTRING, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PATHSTRING);
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

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode NAMESTRING() { return getToken(XQueryLangParser.NAMESTRING, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(NAMESTRING);
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

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode NAMESTRING() { return getToken(XQueryLangParser.NAMESTRING, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(NAMESTRING);
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

	public static class CommaStatContext extends ParserRuleContext {
		public CommaStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaStat; }
	 
		public CommaStatContext() { }
		public void copyFrom(CommaStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stat_commaaContext extends CommaStatContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(XQueryLangParser.COMMA, 0); }
		public Stat_commaaContext(CommaStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_commaa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_commaa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_commaa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaStatContext commaStat() throws RecognitionException {
		CommaStatContext _localctx = new CommaStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commaStat);
		try {
			_localctx = new Stat_commaaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			statement(0);
			setState(119);
			match(COMMA);
			setState(120);
			statement(0);
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

	public static class SlashStatContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> LSLASH() { return getTokens(XQueryLangParser.LSLASH); }
		public TerminalNode LSLASH(int i) {
			return getToken(XQueryLangParser.LSLASH, i);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public SlashStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slashStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterSlashStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitSlashStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitSlashStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlashStatContext slashStat() throws RecognitionException {
		SlashStatContext _localctx = new SlashStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_slashStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			statement(0);
			setState(123);
			match(LSLASH);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSLASH) {
				{
				setState(124);
				match(LSLASH);
				}
			}

			setState(127);
			rp(0);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stat_tagContext extends StatementContext {
		public List<TerminalNode> LESS() { return getTokens(XQueryLangParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(XQueryLangParser.LESS, i);
		}
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> GREATER() { return getTokens(XQueryLangParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(XQueryLangParser.GREATER, i);
		}
		public TerminalNode LBRACE() { return getToken(XQueryLangParser.LBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(XQueryLangParser.RBRACE, 0); }
		public TerminalNode LSLASH() { return getToken(XQueryLangParser.LSLASH, 0); }
		public Stat_tagContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_tag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_apContext extends StatementContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public Stat_apContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_ap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_ap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_ap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_forContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public Stat_forContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_for(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_commaContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(XQueryLangParser.COMMA, 0); }
		public Stat_commaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_comma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_variableContext extends StatementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Stat_variableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_joinContext extends StatementContext {
		public JoinStatementContext joinStatement() {
			return getRuleContext(JoinStatementContext.class,0);
		}
		public Stat_joinContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_join(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_parenContext extends StatementContext {
		public TerminalNode LPAREN() { return getToken(XQueryLangParser.LPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryLangParser.RPAREN, 0); }
		public Stat_parenContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_constantContext extends StatementContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public Stat_constantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_constant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_slashContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> LSLASH() { return getTokens(XQueryLangParser.LSLASH); }
		public TerminalNode LSLASH(int i) {
			return getToken(XQueryLangParser.LSLASH, i);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Stat_slashContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stat_letContext extends StatementContext {
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public Stat_letContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStat_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStat_let(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStat_let(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PATHSTRING:
			case STRING:
				{
				_localctx = new Stat_constantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(130);
				stringConstant();
				}
				break;
			case T__0:
				{
				_localctx = new Stat_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				variable();
				}
				break;
			case DOC:
				{
				_localctx = new Stat_apContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				ap();
				}
				break;
			case LESS:
				{
				_localctx = new Stat_tagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(LESS);
				setState(134);
				tagName();
				setState(135);
				match(GREATER);
				setState(136);
				match(LBRACE);
				setState(137);
				statement(0);
				setState(138);
				match(RBRACE);
				setState(139);
				match(LESS);
				setState(140);
				match(LSLASH);
				setState(141);
				tagName();
				setState(142);
				match(GREATER);
				}
				break;
			case LPAREN:
				{
				_localctx = new Stat_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(LPAREN);
				setState(145);
				statement(0);
				setState(146);
				match(RPAREN);
				}
				break;
			case FOR:
				{
				_localctx = new Stat_forContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				forStatement();
				}
				break;
			case LET:
				{
				_localctx = new Stat_letContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				letStatement();
				}
				break;
			case JOIN:
				{
				_localctx = new Stat_joinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				joinStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Stat_commaContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(153);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(154);
						match(COMMA);
						setState(155);
						statement(5);
						}
						break;
					case 2:
						{
						_localctx = new Stat_slashContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(156);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(157);
						match(LSLASH);
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LSLASH) {
							{
							setState(158);
							match(LSLASH);
							}
						}

						setState(161);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(166);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			forClause();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(168);
				letClause();
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(171);
				whereClause();
				}
			}

			setState(174);
			returnClause();
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

	public static class LetStatementContext extends ParserRuleContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterLetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitLetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_letStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			letClause();
			setState(177);
			statement(0);
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

	public static class JoinStatementContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(XQueryLangParser.JOIN, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryLangParser.LPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryLangParser.COMMA, i);
		}
		public List<VarListClauseContext> varListClause() {
			return getRuleContexts(VarListClauseContext.class);
		}
		public VarListClauseContext varListClause(int i) {
			return getRuleContext(VarListClauseContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(XQueryLangParser.RPAREN, 0); }
		public JoinStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterJoinStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitJoinStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitJoinStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinStatementContext joinStatement() throws RecognitionException {
		JoinStatementContext _localctx = new JoinStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_joinStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(JOIN);
			setState(180);
			match(LPAREN);
			setState(181);
			statement(0);
			setState(182);
			match(COMMA);
			setState(183);
			statement(0);
			setState(184);
			match(COMMA);
			setState(185);
			varListClause();
			setState(186);
			match(COMMA);
			setState(187);
			varListClause();
			setState(188);
			match(RPAREN);
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

	public static class VarListClauseContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(XQueryLangParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(XQueryLangParser.RBRACKET, 0); }
		public List<TerminalNode> NAMESTRING() { return getTokens(XQueryLangParser.NAMESTRING); }
		public TerminalNode NAMESTRING(int i) {
			return getToken(XQueryLangParser.NAMESTRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryLangParser.COMMA, i);
		}
		public VarListClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varListClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterVarListClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitVarListClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitVarListClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListClauseContext varListClause() throws RecognitionException {
		VarListClauseContext _localctx = new VarListClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varListClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(LBRACKET);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					match(NAMESTRING);
					setState(192);
					match(COMMA);
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMESTRING) {
				{
				setState(198);
				match(NAMESTRING);
				}
			}

			setState(201);
			match(RBRACKET);
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

	public static class ForClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(XQueryLangParser.FOR, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(XQueryLangParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(XQueryLangParser.IN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryLangParser.COMMA, i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(FOR);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					variable();
					setState(205);
					match(IN);
					setState(206);
					statement(0);
					setState(207);
					match(COMMA);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(214);
			variable();
			setState(215);
			match(IN);
			setState(216);
			statement(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(XQueryLangParser.RETURN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(RETURN);
			setState(219);
			statement(0);
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

	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(XQueryLangParser.LET, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(XQueryLangParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(XQueryLangParser.ASSIGN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryLangParser.COMMA, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_letClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LET);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					variable();
					setState(223);
					match(ASSIGN);
					setState(224);
					statement(0);
					setState(225);
					match(COMMA);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(232);
			variable();
			setState(233);
			match(ASSIGN);
			setState(234);
			statement(0);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(XQueryLangParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(WHERE);
			setState(237);
			condition(0);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cond_andContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(XQueryLangParser.AND, 0); }
		public Cond_andContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterCond_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitCond_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitCond_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_emptyContext extends ConditionContext {
		public TerminalNode EMPTY() { return getToken(XQueryLangParser.EMPTY, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryLangParser.LPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryLangParser.RPAREN, 0); }
		public Cond_emptyContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterCond_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitCond_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitCond_empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_equalContext extends ConditionContext {
		public Token op;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(XQueryLangParser.EQUAL, 0); }
		public TerminalNode EQ() { return getToken(XQueryLangParser.EQ, 0); }
		public Cond_equalContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterCond_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitCond_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitCond_equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_isContext extends ConditionContext {
		public Token op;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DEQUAL() { return getToken(XQueryLangParser.DEQUAL, 0); }
		public TerminalNode IS() { return getToken(XQueryLangParser.IS, 0); }
		public Cond_isContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterCond_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitCond_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitCond_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_parenContext extends ConditionContext {
		public TerminalNode LPAREN() { return getToken(XQueryLangParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryLangParser.RPAREN, 0); }
		public Cond_parenContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterCond_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitCond_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitCond_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_someContext extends ConditionContext {
		public TerminalNode SOME() { return getToken(XQueryLangParser.SOME, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(XQueryLangParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(XQueryLangParser.IN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SATISFIES() { return getToken(XQueryLangParser.SATISFIES, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryLangParser.COMMA, i);
		}
		public Cond_someContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterCond_some(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitCond_some(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitCond_some(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_notContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(XQueryLangParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Cond_notContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterCond_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitCond_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitCond_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_orContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(XQueryLangParser.OR, 0); }
		public Cond_orContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterCond_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitCond_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitCond_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(240);
				statement(0);
				setState(241);
				((Cond_equalContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==EQUAL) ) {
					((Cond_equalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				statement(0);
				}
				break;
			case 2:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				statement(0);
				setState(245);
				((Cond_isContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IS || _la==DEQUAL) ) {
					((Cond_isContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				statement(0);
				}
				break;
			case 3:
				{
				_localctx = new Cond_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(LPAREN);
				setState(249);
				condition(0);
				setState(250);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new Cond_emptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(EMPTY);
				setState(253);
				match(LPAREN);
				setState(254);
				statement(0);
				setState(255);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new Cond_someContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(SOME);
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						variable();
						setState(259);
						match(IN);
						setState(260);
						statement(0);
						setState(261);
						match(COMMA);
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(268);
				variable();
				setState(269);
				match(IN);
				setState(270);
				statement(0);
				setState(271);
				match(SATISFIES);
				setState(272);
				condition(4);
				}
				break;
			case 6:
				{
				_localctx = new Cond_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(NOT);
				setState(275);
				condition(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_andContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(278);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(279);
						match(AND);
						setState(280);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new Cond_orContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
						match(OR);
						setState(283);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode NAMESTRING() { return getToken(XQueryLangParser.NAMESTRING, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__0);
			setState(290);
			match(NAMESTRING);
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

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XQueryLangParser.STRING, 0); }
		public TerminalNode PATHSTRING() { return getToken(XQueryLangParser.PATHSTRING, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryLangListener ) ((XQueryLangListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryLangVisitor ) return ((XQueryLangVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(_la==PATHSTRING || _la==STRING) ) {
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
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return filter_sempred((FilterContext)_localctx, predIndex);
		case 8:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 17:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D"+
		"\n\3\3\3\3\3\5\3H\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3T\n\3"+
		"\f\3\16\3W\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4i\n\4\3\4\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0080\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u009a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\n\7\n\u00a5"+
		"\n\n\f\n\16\n\u00a8\13\n\3\13\3\13\5\13\u00ac\n\13\3\13\5\13\u00af\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\7\16\u00c4\n\16\f\16\16\16\u00c7\13\16\3\16\5\16\u00ca\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d4\n\17\f\17\16\17\u00d7"+
		"\13\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u00e6\n\21\f\21\16\21\u00e9\13\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u010a\n\23"+
		"\f\23\16\23\u010d\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0117"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u011f\n\23\f\23\16\23\u0122\13"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\2\6\4\6\22$\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\6\4\2\r\r  \4\2\t\t\36\36\3\2\21\22\3\2()\u013d"+
		"\2*\3\2\2\2\4C\3\2\2\2\6h\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\fv\3\2\2\2\16"+
		"x\3\2\2\2\20|\3\2\2\2\22\u0099\3\2\2\2\24\u00a9\3\2\2\2\26\u00b2\3\2\2"+
		"\2\30\u00b5\3\2\2\2\32\u00c0\3\2\2\2\34\u00cd\3\2\2\2\36\u00dc\3\2\2\2"+
		" \u00df\3\2\2\2\"\u00ee\3\2\2\2$\u0116\3\2\2\2&\u0123\3\2\2\2(\u0126\3"+
		"\2\2\2*+\7\17\2\2+,\7\26\2\2,-\5\b\5\2-/\7\27\2\2.\60\7%\2\2/.\3\2\2\2"+
		"/\60\3\2\2\2\60\61\3\2\2\2\61\62\7%\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64"+
		"\65\b\3\1\2\65D\5\n\6\2\66D\7$\2\2\67D\7\"\2\289\7\"\2\29D\7\"\2\2:;\7"+
		"\20\2\2;<\7\26\2\2<D\7\27\2\2=>\7!\2\2>D\5\f\7\2?@\7\26\2\2@A\5\4\3\2"+
		"AB\7\27\2\2BD\3\2\2\2C\64\3\2\2\2C\66\3\2\2\2C\67\3\2\2\2C8\3\2\2\2C:"+
		"\3\2\2\2C=\3\2\2\2C?\3\2\2\2DU\3\2\2\2EG\f\5\2\2FH\7%\2\2GF\3\2\2\2GH"+
		"\3\2\2\2HI\3\2\2\2IJ\7%\2\2JT\5\4\3\6KL\f\3\2\2LM\7#\2\2MT\5\4\3\4NO\f"+
		"\4\2\2OP\7\30\2\2PQ\5\6\4\2QR\7\31\2\2RT\3\2\2\2SE\3\2\2\2SK\3\2\2\2S"+
		"N\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\5\3\2\2\2WU\3\2\2\2XY\b\4\1\2"+
		"Yi\5\4\3\2Z[\5\4\3\2[\\\t\2\2\2\\]\5\4\3\2]i\3\2\2\2^_\5\4\3\2_`\t\3\2"+
		"\2`a\5\4\3\2ai\3\2\2\2bc\7\26\2\2cd\5\6\4\2de\7\27\2\2ei\3\2\2\2fg\7\23"+
		"\2\2gi\5\6\4\3hX\3\2\2\2hZ\3\2\2\2h^\3\2\2\2hb\3\2\2\2hf\3\2\2\2io\3\2"+
		"\2\2jk\f\4\2\2kl\t\4\2\2ln\5\6\4\5mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2p\7\3\2\2\2qo\3\2\2\2rs\7(\2\2s\t\3\2\2\2tu\7\24\2\2u\13\3\2\2\2v"+
		"w\7\24\2\2w\r\3\2\2\2xy\5\22\n\2yz\7#\2\2z{\5\22\n\2{\17\3\2\2\2|}\5\22"+
		"\n\2}\177\7%\2\2~\u0080\7%\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\5\4\3\2\u0082\21\3\2\2\2\u0083\u0084\b\n\1\2\u0084"+
		"\u009a\5(\25\2\u0085\u009a\5&\24\2\u0086\u009a\5\2\2\2\u0087\u0088\7\34"+
		"\2\2\u0088\u0089\5\n\6\2\u0089\u008a\7\35\2\2\u008a\u008b\7\32\2\2\u008b"+
		"\u008c\5\22\n\2\u008c\u008d\7\33\2\2\u008d\u008e\7\34\2\2\u008e\u008f"+
		"\7%\2\2\u008f\u0090\5\n\6\2\u0090\u0091\7\35\2\2\u0091\u009a\3\2\2\2\u0092"+
		"\u0093\7\26\2\2\u0093\u0094\5\22\n\2\u0094\u0095\7\27\2\2\u0095\u009a"+
		"\3\2\2\2\u0096\u009a\5\24\13\2\u0097\u009a\5\26\f\2\u0098\u009a\5\30\r"+
		"\2\u0099\u0083\3\2\2\2\u0099\u0085\3\2\2\2\u0099\u0086\3\2\2\2\u0099\u0087"+
		"\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u00a6\3\2\2\2\u009b\u009c\f\6\2\2\u009c\u009d\7#"+
		"\2\2\u009d\u00a5\5\22\n\7\u009e\u009f\f\7\2\2\u009f\u00a1\7%\2\2\u00a0"+
		"\u00a2\7%\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\5\4\3\2\u00a4\u009b\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\23\3\2\2"+
		"\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\5\34\17\2\u00aa\u00ac\5 \21\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00af\5\""+
		"\22\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\5\36\20\2\u00b1\25\3\2\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\5\22"+
		"\n\2\u00b4\27\3\2\2\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8"+
		"\5\22\n\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7#\2\2\u00bb"+
		"\u00bc\5\32\16\2\u00bc\u00bd\7#\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf"+
		"\7\27\2\2\u00bf\31\3\2\2\2\u00c0\u00c5\7\30\2\2\u00c1\u00c2\7\24\2\2\u00c2"+
		"\u00c4\7#\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00ca\7\24\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\33\3\2\2\2\u00cd\u00d5\7\4\2\2\u00ce"+
		"\u00cf\5&\24\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\5\22\n\2\u00d1\u00d2\7"+
		"#\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da\7\6\2\2\u00da\u00db\5\22\n\2\u00db"+
		"\35\3\2\2\2\u00dc\u00dd\7\7\2\2\u00dd\u00de\5\22\n\2\u00de\37\3\2\2\2"+
		"\u00df\u00e7\7\5\2\2\u00e0\u00e1\5&\24\2\u00e1\u00e2\7\37\2\2\u00e2\u00e3"+
		"\5\22\n\2\u00e3\u00e4\7#\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5&\24\2\u00eb\u00ec\7\37\2\2\u00ec"+
		"\u00ed\5\22\n\2\u00ed!\3\2\2\2\u00ee\u00ef\7\16\2\2\u00ef\u00f0\5$\23"+
		"\2\u00f0#\3\2\2\2\u00f1\u00f2\b\23\1\2\u00f2\u00f3\5\22\n\2\u00f3\u00f4"+
		"\t\2\2\2\u00f4\u00f5\5\22\n\2\u00f5\u0117\3\2\2\2\u00f6\u00f7\5\22\n\2"+
		"\u00f7\u00f8\t\3\2\2\u00f8\u00f9\5\22\n\2\u00f9\u0117\3\2\2\2\u00fa\u00fb"+
		"\7\26\2\2\u00fb\u00fc\5$\23\2\u00fc\u00fd\7\27\2\2\u00fd\u0117\3\2\2\2"+
		"\u00fe\u00ff\7\n\2\2\u00ff\u0100\7\26\2\2\u0100\u0101\5\22\n\2\u0101\u0102"+
		"\7\27\2\2\u0102\u0117\3\2\2\2\u0103\u010b\7\13\2\2\u0104\u0105\5&\24\2"+
		"\u0105\u0106\7\6\2\2\u0106\u0107\5\22\n\2\u0107\u0108\7#\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u0104\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5&"+
		"\24\2\u010f\u0110\7\6\2\2\u0110\u0111\5\22\n\2\u0111\u0112\7\f\2\2\u0112"+
		"\u0113\5$\23\6\u0113\u0117\3\2\2\2\u0114\u0115\7\23\2\2\u0115\u0117\5"+
		"$\23\3\u0116\u00f1\3\2\2\2\u0116\u00f6\3\2\2\2\u0116\u00fa\3\2\2\2\u0116"+
		"\u00fe\3\2\2\2\u0116\u0103\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0120\3\2"+
		"\2\2\u0118\u0119\f\5\2\2\u0119\u011a\7\21\2\2\u011a\u011f\5$\23\6\u011b"+
		"\u011c\f\4\2\2\u011c\u011d\7\22\2\2\u011d\u011f\5$\23\5\u011e\u0118\3"+
		"\2\2\2\u011e\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121%\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\3\2\2"+
		"\u0124\u0125\7\24\2\2\u0125\'\3\2\2\2\u0126\u0127\t\5\2\2\u0127)\3\2\2"+
		"\2\30/CGSUho\177\u0099\u00a1\u00a4\u00a6\u00ab\u00ae\u00c5\u00c9\u00d5"+
		"\u00e7\u010b\u0116\u011e\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}