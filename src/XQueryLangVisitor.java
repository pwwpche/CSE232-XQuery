// Generated from src/XQueryLang.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp(XQueryLangParser.ApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_dotdot}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_dotdot(XQueryLangParser.Rp_dotdotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_star(XQueryLangParser.Rp_starContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_dot}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_dot(XQueryLangParser.Rp_dotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_comma}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_comma(XQueryLangParser.Rp_commaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_text(XQueryLangParser.Rp_textContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_tagName(XQueryLangParser.Rp_tagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_filter(XQueryLangParser.Rp_filterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_paren}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_paren(XQueryLangParser.Rp_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_at(XQueryLangParser.Rp_atContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_slash}
	 * labeled alternative in {@link XQueryLangParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_slash(XQueryLangParser.Rp_slashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_rp}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_rp(XQueryLangParser.Filter_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_eq(XQueryLangParser.Filter_eqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_andOr}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_andOr(XQueryLangParser.Filter_andOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_is}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_is(XQueryLangParser.Filter_isContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_paren}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_paren(XQueryLangParser.Filter_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryLangParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_not(XQueryLangParser.Filter_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(XQueryLangParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XQueryLangParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(XQueryLangParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_commaa}
	 * labeled alternative in {@link XQueryLangParser#commaStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_commaa(XQueryLangParser.Stat_commaaContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#slashStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashStat(XQueryLangParser.SlashStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_tag}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_tag(XQueryLangParser.Stat_tagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_ap}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_ap(XQueryLangParser.Stat_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_for}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_for(XQueryLangParser.Stat_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_comma}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_comma(XQueryLangParser.Stat_commaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_variable}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_variable(XQueryLangParser.Stat_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_join}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_join(XQueryLangParser.Stat_joinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_paren}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_paren(XQueryLangParser.Stat_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_constant}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_constant(XQueryLangParser.Stat_constantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_slash}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_slash(XQueryLangParser.Stat_slashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stat_let}
	 * labeled alternative in {@link XQueryLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_let(XQueryLangParser.Stat_letContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(XQueryLangParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#letStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatement(XQueryLangParser.LetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#joinStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinStatement(XQueryLangParser.JoinStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#varListClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarListClause(XQueryLangParser.VarListClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XQueryLangParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XQueryLangParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XQueryLangParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XQueryLangParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_and(XQueryLangParser.Cond_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_empty(XQueryLangParser.Cond_emptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_equal}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_equal(XQueryLangParser.Cond_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_is(XQueryLangParser.Cond_isContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_paren}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_paren(XQueryLangParser.Cond_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_some}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_some(XQueryLangParser.Cond_someContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_not(XQueryLangParser.Cond_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_or(XQueryLangParser.Cond_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(XQueryLangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryLangParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(XQueryLangParser.StringConstantContext ctx);
}