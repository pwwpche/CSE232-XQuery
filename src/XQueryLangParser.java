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
		RULE_attName = 5, RULE_statement = 6, RULE_forStatement = 7, RULE_letStatement = 8, 
		RULE_joinStatement = 9, RULE_varListClause = 10, RULE_forClause = 11, 
		RULE_returnClause = 12, RULE_letClause = 13, RULE_whereClause = 14, RULE_condition = 15, 
		RULE_variable = 16, RULE_stringConstant = 17;
	public static final String[] ruleNames = {
		"ap", "rp", "filter", "fileName", "tagName", "attName", "statement", "forStatement", 
		"letStatement", "joinStatement", "varListClause", "forClause", "returnClause", 
		"letClause", "whereClause", "condition", "variable", "stringConstant"
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
			setState(36);
			match(DOC);
			setState(37);
			match(LPAREN);
			setState(38);
			fileName();
			setState(39);
			match(RPAREN);
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(40);
				match(LSLASH);
				}
				break;
			}
			setState(43);
			match(LSLASH);
			setState(44);
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new Rp_tagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47);
				tagName();
				}
				break;
			case 2:
				{
				_localctx = new Rp_starContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(STAR);
				}
				break;
			case 3:
				{
				_localctx = new Rp_dotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(DOT);
				}
				break;
			case 4:
				{
				_localctx = new Rp_dotdotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(DOT);
				setState(51);
				match(DOT);
				}
				break;
			case 5:
				{
				_localctx = new Rp_textContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(TEXT);
				setState(53);
				match(LPAREN);
				setState(54);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new Rp_atContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(AT);
				setState(56);
				attName();
				}
				break;
			case 7:
				{
				_localctx = new Rp_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(LPAREN);
				setState(58);
				rp(0);
				setState(59);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_slashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(63);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(65);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(64);
							match(LSLASH);
							}
							break;
						}
						setState(67);
						match(LSLASH);
						setState(68);
						rp(4);
						}
						break;
					case 2:
						{
						_localctx = new Rp_commaContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(69);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(70);
						match(COMMA);
						setState(71);
						rp(2);
						}
						break;
					case 3:
						{
						_localctx = new Rp_filterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(72);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(73);
						match(LBRACKET);
						setState(74);
						filter(0);
						setState(75);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(81);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Filter_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				rp(0);
				setState(85);
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
				setState(86);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Filter_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				rp(0);
				setState(89);
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
				setState(90);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Filter_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(LPAREN);
				setState(93);
				filter(0);
				setState(94);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(NOT);
				setState(97);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
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
					setState(100);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(101);
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
					setState(102);
					filter(3);
					}
					} 
				}
				setState(107);
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
			setState(108);
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
			setState(110);
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
			setState(112);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PATHSTRING:
			case STRING:
				{
				_localctx = new Stat_constantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				stringConstant();
				}
				break;
			case T__0:
				{
				_localctx = new Stat_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				variable();
				}
				break;
			case DOC:
				{
				_localctx = new Stat_apContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				ap();
				}
				break;
			case LESS:
				{
				_localctx = new Stat_tagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(LESS);
				setState(119);
				tagName();
				setState(120);
				match(GREATER);
				setState(121);
				match(LBRACE);
				setState(122);
				statement(0);
				setState(123);
				match(RBRACE);
				setState(124);
				match(LESS);
				setState(125);
				match(LSLASH);
				setState(126);
				tagName();
				setState(127);
				match(GREATER);
				}
				break;
			case LPAREN:
				{
				_localctx = new Stat_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(LPAREN);
				setState(130);
				statement(0);
				setState(131);
				match(RPAREN);
				}
				break;
			case FOR:
				{
				_localctx = new Stat_forContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				forStatement();
				}
				break;
			case LET:
				{
				_localctx = new Stat_letContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				letStatement();
				}
				break;
			case JOIN:
				{
				_localctx = new Stat_joinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				joinStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Stat_commaContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(138);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(139);
						match(COMMA);
						setState(140);
						statement(6);
						}
						break;
					case 2:
						{
						_localctx = new Stat_slashContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(142);
						match(LSLASH);
						setState(144);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LSLASH) {
							{
							setState(143);
							match(LSLASH);
							}
						}

						setState(146);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 14, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			forClause();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(153);
				letClause();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(156);
				whereClause();
				}
			}

			setState(159);
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
		enterRule(_localctx, 16, RULE_letStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			letClause();
			setState(162);
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
		enterRule(_localctx, 18, RULE_joinStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(JOIN);
			setState(165);
			match(LPAREN);
			setState(166);
			statement(0);
			setState(167);
			match(COMMA);
			setState(168);
			statement(0);
			setState(169);
			match(COMMA);
			setState(170);
			varListClause();
			setState(171);
			match(COMMA);
			setState(172);
			varListClause();
			setState(173);
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
		enterRule(_localctx, 20, RULE_varListClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(LBRACKET);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					match(NAMESTRING);
					setState(177);
					match(COMMA);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMESTRING) {
				{
				setState(183);
				match(NAMESTRING);
				}
			}

			setState(186);
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
		enterRule(_localctx, 22, RULE_forClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(FOR);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					variable();
					setState(190);
					match(IN);
					setState(191);
					statement(0);
					setState(192);
					match(COMMA);
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(199);
			variable();
			setState(200);
			match(IN);
			setState(201);
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
		enterRule(_localctx, 24, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(RETURN);
			setState(204);
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
		enterRule(_localctx, 26, RULE_letClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LET);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					variable();
					setState(208);
					match(ASSIGN);
					setState(209);
					statement(0);
					setState(210);
					match(COMMA);
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(217);
			variable();
			setState(218);
			match(ASSIGN);
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
		enterRule(_localctx, 28, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(WHERE);
			setState(222);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_equalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(225);
				statement(0);
				setState(226);
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
				setState(227);
				statement(0);
				}
				break;
			case 2:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				statement(0);
				setState(230);
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
				setState(231);
				statement(0);
				}
				break;
			case 3:
				{
				_localctx = new Cond_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(LPAREN);
				setState(234);
				condition(0);
				setState(235);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new Cond_emptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(EMPTY);
				setState(238);
				match(LPAREN);
				setState(239);
				statement(0);
				setState(240);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new Cond_someContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(SOME);
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(243);
						variable();
						setState(244);
						match(IN);
						setState(245);
						statement(0);
						setState(246);
						match(COMMA);
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(253);
				variable();
				setState(254);
				match(IN);
				setState(255);
				statement(0);
				setState(256);
				match(SATISFIES);
				setState(257);
				condition(4);
				}
				break;
			case 6:
				{
				_localctx = new Cond_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				match(NOT);
				setState(260);
				condition(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_andContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(263);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(264);
						match(AND);
						setState(265);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new Cond_orContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(266);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(267);
						match(OR);
						setState(268);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(273);
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
		enterRule(_localctx, 32, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__0);
			setState(275);
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
		enterRule(_localctx, 34, RULE_stringConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		case 6:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 15:
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
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u011a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3\5\3D\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3\16\3S\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4e\n\4\3\4"+
		"\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u008b\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0093\n\b\3\b\7\b\u0096"+
		"\n\b\f\b\16\b\u0099\13\b\3\t\3\t\5\t\u009d\n\t\3\t\5\t\u00a0\n\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13\f\3\f\5\f\u00bb\n\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c5\n\r\f\r\16\r\u00c8\13\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d7\n\17\f"+
		"\17\16\17\u00da\13\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00fb\n\21\f\21\16\21\u00fe\13"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0108\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0110\n\21\f\21\16\21\u0113\13\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\2\6\4\6\16 \24\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$\2\6\4\2\r\r  \4\2\t\t\36\36\3\2\21\22\3\2()\u012f\2&\3\2\2\2\4"+
		"?\3\2\2\2\6d\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16\u008a\3\2\2\2"+
		"\20\u009a\3\2\2\2\22\u00a3\3\2\2\2\24\u00a6\3\2\2\2\26\u00b1\3\2\2\2\30"+
		"\u00be\3\2\2\2\32\u00cd\3\2\2\2\34\u00d0\3\2\2\2\36\u00df\3\2\2\2 \u0107"+
		"\3\2\2\2\"\u0114\3\2\2\2$\u0117\3\2\2\2&\'\7\17\2\2\'(\7\26\2\2()\5\b"+
		"\5\2)+\7\27\2\2*,\7%\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7%\2\2./\5\4"+
		"\3\2/\3\3\2\2\2\60\61\b\3\1\2\61@\5\n\6\2\62@\7$\2\2\63@\7\"\2\2\64\65"+
		"\7\"\2\2\65@\7\"\2\2\66\67\7\20\2\2\678\7\26\2\28@\7\27\2\29:\7!\2\2:"+
		"@\5\f\7\2;<\7\26\2\2<=\5\4\3\2=>\7\27\2\2>@\3\2\2\2?\60\3\2\2\2?\62\3"+
		"\2\2\2?\63\3\2\2\2?\64\3\2\2\2?\66\3\2\2\2?9\3\2\2\2?;\3\2\2\2@Q\3\2\2"+
		"\2AC\f\5\2\2BD\7%\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7%\2\2FP\5\4\3\6"+
		"GH\f\3\2\2HI\7#\2\2IP\5\4\3\4JK\f\4\2\2KL\7\30\2\2LM\5\6\4\2MN\7\31\2"+
		"\2NP\3\2\2\2OA\3\2\2\2OG\3\2\2\2OJ\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2"+
		"\2R\5\3\2\2\2SQ\3\2\2\2TU\b\4\1\2Ue\5\4\3\2VW\5\4\3\2WX\t\2\2\2XY\5\4"+
		"\3\2Ye\3\2\2\2Z[\5\4\3\2[\\\t\3\2\2\\]\5\4\3\2]e\3\2\2\2^_\7\26\2\2_`"+
		"\5\6\4\2`a\7\27\2\2ae\3\2\2\2bc\7\23\2\2ce\5\6\4\3dT\3\2\2\2dV\3\2\2\2"+
		"dZ\3\2\2\2d^\3\2\2\2db\3\2\2\2ek\3\2\2\2fg\f\4\2\2gh\t\4\2\2hj\5\6\4\5"+
		"if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\7\3\2\2\2mk\3\2\2\2no\7(\2\2"+
		"o\t\3\2\2\2pq\7\24\2\2q\13\3\2\2\2rs\7\24\2\2s\r\3\2\2\2tu\b\b\1\2u\u008b"+
		"\5$\23\2v\u008b\5\"\22\2w\u008b\5\2\2\2xy\7\34\2\2yz\5\n\6\2z{\7\35\2"+
		"\2{|\7\32\2\2|}\5\16\b\2}~\7\33\2\2~\177\7\34\2\2\177\u0080\7%\2\2\u0080"+
		"\u0081\5\n\6\2\u0081\u0082\7\35\2\2\u0082\u008b\3\2\2\2\u0083\u0084\7"+
		"\26\2\2\u0084\u0085\5\16\b\2\u0085\u0086\7\27\2\2\u0086\u008b\3\2\2\2"+
		"\u0087\u008b\5\20\t\2\u0088\u008b\5\22\n\2\u0089\u008b\5\24\13\2\u008a"+
		"t\3\2\2\2\u008av\3\2\2\2\u008aw\3\2\2\2\u008ax\3\2\2\2\u008a\u0083\3\2"+
		"\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u0097\3\2\2\2\u008c\u008d\f\7\2\2\u008d\u008e\7#\2\2\u008e\u0096\5\16"+
		"\b\b\u008f\u0090\f\6\2\2\u0090\u0092\7%\2\2\u0091\u0093\7%\2\2\u0092\u0091"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\5\4\3\2\u0095"+
		"\u008c\3\2\2\2\u0095\u008f\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\17\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c"+
		"\5\30\r\2\u009b\u009d\5\34\17\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2"+
		"\2\u009d\u009f\3\2\2\2\u009e\u00a0\5\36\20\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5\32\16\2\u00a2\21\3\2"+
		"\2\2\u00a3\u00a4\5\34\17\2\u00a4\u00a5\5\16\b\2\u00a5\23\3\2\2\2\u00a6"+
		"\u00a7\7\b\2\2\u00a7\u00a8\7\26\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7"+
		"#\2\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\5\26\f\2\u00ad"+
		"\u00ae\7#\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\7\27\2\2\u00b0\25\3\2\2"+
		"\2\u00b1\u00b6\7\30\2\2\u00b2\u00b3\7\24\2\2\u00b3\u00b5\7#\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7\24\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\31"+
		"\2\2\u00bd\27\3\2\2\2\u00be\u00c6\7\4\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1"+
		"\7\6\2\2\u00c1\u00c2\5\16\b\2\u00c2\u00c3\7#\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\5\"\22\2\u00ca"+
		"\u00cb\7\6\2\2\u00cb\u00cc\5\16\b\2\u00cc\31\3\2\2\2\u00cd\u00ce\7\7\2"+
		"\2\u00ce\u00cf\5\16\b\2\u00cf\33\3\2\2\2\u00d0\u00d8\7\5\2\2\u00d1\u00d2"+
		"\5\"\22\2\u00d2\u00d3\7\37\2\2\u00d3\u00d4\5\16\b\2\u00d4\u00d5\7#\2\2"+
		"\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\5\"\22\2\u00dc\u00dd\7\37\2\2\u00dd\u00de\5\16\b\2\u00de\35\3\2"+
		"\2\2\u00df\u00e0\7\16\2\2\u00e0\u00e1\5 \21\2\u00e1\37\3\2\2\2\u00e2\u00e3"+
		"\b\21\1\2\u00e3\u00e4\5\16\b\2\u00e4\u00e5\t\2\2\2\u00e5\u00e6\5\16\b"+
		"\2\u00e6\u0108\3\2\2\2\u00e7\u00e8\5\16\b\2\u00e8\u00e9\t\3\2\2\u00e9"+
		"\u00ea\5\16\b\2\u00ea\u0108\3\2\2\2\u00eb\u00ec\7\26\2\2\u00ec\u00ed\5"+
		" \21\2\u00ed\u00ee\7\27\2\2\u00ee\u0108\3\2\2\2\u00ef\u00f0\7\n\2\2\u00f0"+
		"\u00f1\7\26\2\2\u00f1\u00f2\5\16\b\2\u00f2\u00f3\7\27\2\2\u00f3\u0108"+
		"\3\2\2\2\u00f4\u00fc\7\13\2\2\u00f5\u00f6\5\"\22\2\u00f6\u00f7\7\6\2\2"+
		"\u00f7\u00f8\5\16\b\2\u00f8\u00f9\7#\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f5"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5\"\22\2\u0100\u0101\7"+
		"\6\2\2\u0101\u0102\5\16\b\2\u0102\u0103\7\f\2\2\u0103\u0104\5 \21\6\u0104"+
		"\u0108\3\2\2\2\u0105\u0106\7\23\2\2\u0106\u0108\5 \21\3\u0107\u00e2\3"+
		"\2\2\2\u0107\u00e7\3\2\2\2\u0107\u00eb\3\2\2\2\u0107\u00ef\3\2\2\2\u0107"+
		"\u00f4\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0111\3\2\2\2\u0109\u010a\f\5"+
		"\2\2\u010a\u010b\7\21\2\2\u010b\u0110\5 \21\6\u010c\u010d\f\4\2\2\u010d"+
		"\u010e\7\22\2\2\u010e\u0110\5 \21\5\u010f\u0109\3\2\2\2\u010f\u010c\3"+
		"\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"!\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\3\2\2\u0115\u0116\7\24\2\2"+
		"\u0116#\3\2\2\2\u0117\u0118\t\5\2\2\u0118%\3\2\2\2\27+?COQdk\u008a\u0092"+
		"\u0095\u0097\u009c\u009f\u00b6\u00ba\u00c6\u00d8\u00fc\u0107\u010f\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}