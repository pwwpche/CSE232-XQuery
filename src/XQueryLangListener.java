// Generated from src/XQueryLang.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryLangParser}.
 */
public interface XQueryLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(XQueryLangParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(XQueryLangParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dotdot(XQueryLangParser.Rp_dotdotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dotdot(XQueryLangParser.Rp_dotdotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_star(XQueryLangParser.Rp_starContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_star(XQueryLangParser.Rp_starContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_dot(XQueryLangParser.Rp_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_dot(XQueryLangParser.Rp_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_comma(XQueryLangParser.Rp_commaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_comma(XQueryLangParser.Rp_commaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_text(XQueryLangParser.Rp_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_text(XQueryLangParser.Rp_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_tagName(XQueryLangParser.Rp_tagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_tagName(XQueryLangParser.Rp_tagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_filter(XQueryLangParser.Rp_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_filter(XQueryLangParser.Rp_filterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_paren(XQueryLangParser.Rp_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_paren(XQueryLangParser.Rp_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_at(XQueryLangParser.Rp_atContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_at(XQueryLangParser.Rp_atContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_slash(XQueryLangParser.Rp_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_slash(XQueryLangParser.Rp_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rp(XQueryLangParser.Filter_rpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rp(XQueryLangParser.Filter_rpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eq(XQueryLangParser.Filter_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eq(XQueryLangParser.Filter_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_andOr}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_andOr(XQueryLangParser.Filter_andOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_andOr}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_andOr(XQueryLangParser.Filter_andOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_is(XQueryLangParser.Filter_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_is(XQueryLangParser.Filter_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_paren(XQueryLangParser.Filter_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_paren(XQueryLangParser.Filter_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(XQueryLangParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(XQueryLangParser.Filter_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(XQueryLangParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(XQueryLangParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XQueryLangParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XQueryLangParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XQueryLangParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XQueryLangParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_tag}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_tag(XQueryLangParser.Stat_tagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_tag}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_tag(XQueryLangParser.Stat_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_ap}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_ap(XQueryLangParser.Stat_apContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_ap}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_ap(XQueryLangParser.Stat_apContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_for}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_for(XQueryLangParser.Stat_forContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_for}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_for(XQueryLangParser.Stat_forContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_comma}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_comma(XQueryLangParser.Stat_commaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_comma}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_comma(XQueryLangParser.Stat_commaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_variable}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_variable(XQueryLangParser.Stat_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_variable}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_variable(XQueryLangParser.Stat_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_join}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_join(XQueryLangParser.Stat_joinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_join}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_join(XQueryLangParser.Stat_joinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_paren}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_paren(XQueryLangParser.Stat_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_paren}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_paren(XQueryLangParser.Stat_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_constant}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_constant(XQueryLangParser.Stat_constantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_constant}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_constant(XQueryLangParser.Stat_constantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_slash}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_slash(XQueryLangParser.Stat_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_slash}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_slash(XQueryLangParser.Stat_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stat_let}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStat_let(XQueryLangParser.Stat_letContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stat_let}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStat_let(XQueryLangParser.Stat_letContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(XQueryLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(XQueryLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#letStatement}.
	 * @param ctx the parse tree
	 */
	void enterLetStatement(XQueryLangParser.LetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#letStatement}.
	 * @param ctx the parse tree
	 */
	void exitLetStatement(XQueryLangParser.LetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#joinStatement}.
	 * @param ctx the parse tree
	 */
	void enterJoinStatement(XQueryLangParser.JoinStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#joinStatement}.
	 * @param ctx the parse tree
	 */
	void exitJoinStatement(XQueryLangParser.JoinStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#varListClause}.
	 * @param ctx the parse tree
	 */
	void enterVarListClause(XQueryLangParser.VarListClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#varListClause}.
	 * @param ctx the parse tree
	 */
	void exitVarListClause(XQueryLangParser.VarListClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryLangParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryLangParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryLangParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryLangParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryLangParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryLangParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryLangParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryLangParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_and(XQueryLangParser.Cond_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_and(XQueryLangParser.Cond_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_empty(XQueryLangParser.Cond_emptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_empty(XQueryLangParser.Cond_emptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_equal}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_equal(XQueryLangParser.Cond_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_equal}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_equal(XQueryLangParser.Cond_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_is(XQueryLangParser.Cond_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_is(XQueryLangParser.Cond_isContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_paren(XQueryLangParser.Cond_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_paren(XQueryLangParser.Cond_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_some}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_some(XQueryLangParser.Cond_someContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_some}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_some(XQueryLangParser.Cond_someContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_not(XQueryLangParser.Cond_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_not(XQueryLangParser.Cond_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_or(XQueryLangParser.Cond_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_or(XQueryLangParser.Cond_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(XQueryLangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(XQueryLangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryLangParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(XQueryLangParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryLangParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(XQueryLangParser.StringConstantContext ctx);
}