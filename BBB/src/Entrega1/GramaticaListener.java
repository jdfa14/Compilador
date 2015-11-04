// Generated from Gramatica.g4 by ANTLR 4.5.1
package Entrega1;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#includes}.
	 * @param ctx the parse tree
	 */
	void enterIncludes(GramaticaParser.IncludesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#includes}.
	 * @param ctx the parse tree
	 */
	void exitIncludes(GramaticaParser.IncludesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#params2}.
	 * @param ctx the parse tree
	 */
	void enterParams2(GramaticaParser.Params2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#params2}.
	 * @param ctx the parse tree
	 */
	void exitParams2(GramaticaParser.Params2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#params3}.
	 * @param ctx the parse tree
	 */
	void enterParams3(GramaticaParser.Params3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#params3}.
	 * @param ctx the parse tree
	 */
	void exitParams3(GramaticaParser.Params3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(GramaticaParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(GramaticaParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#functiondecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondecl(GramaticaParser.FunctiondeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#functiondecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondecl(GramaticaParser.FunctiondeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GramaticaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GramaticaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asignations}.
	 * @param ctx the parse tree
	 */
	void enterAsignations(GramaticaParser.AsignationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignations}.
	 * @param ctx the parse tree
	 */
	void exitAsignations(GramaticaParser.AsignationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asignation}.
	 * @param ctx the parse tree
	 */
	void enterAsignation(GramaticaParser.AsignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignation}.
	 * @param ctx the parse tree
	 */
	void exitAsignation(GramaticaParser.AsignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GramaticaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GramaticaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(GramaticaParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(GramaticaParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#whle}.
	 * @param ctx the parse tree
	 */
	void enterWhle(GramaticaParser.WhleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#whle}.
	 * @param ctx the parse tree
	 */
	void exitWhle(GramaticaParser.WhleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dowhle}.
	 * @param ctx the parse tree
	 */
	void enterDowhle(GramaticaParser.DowhleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dowhle}.
	 * @param ctx the parse tree
	 */
	void exitDowhle(GramaticaParser.DowhleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fr}.
	 * @param ctx the parse tree
	 */
	void enterFr(GramaticaParser.FrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fr}.
	 * @param ctx the parse tree
	 */
	void exitFr(GramaticaParser.FrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(GramaticaParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(GramaticaParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estatutos}.
	 * @param ctx the parse tree
	 */
	void enterEstatutos(GramaticaParser.EstatutosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estatutos}.
	 * @param ctx the parse tree
	 */
	void exitEstatutos(GramaticaParser.EstatutosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void enterEstatuto(GramaticaParser.EstatutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void exitEstatuto(GramaticaParser.EstatutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#opc}.
	 * @param ctx the parse tree
	 */
	void enterOpc(GramaticaParser.OpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#opc}.
	 * @param ctx the parse tree
	 */
	void exitOpc(GramaticaParser.OpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(GramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(GramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(GramaticaParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(GramaticaParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ex}.
	 * @param ctx the parse tree
	 */
	void enterEx(GramaticaParser.ExContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ex}.
	 * @param ctx the parse tree
	 */
	void exitEx(GramaticaParser.ExContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ex2}.
	 * @param ctx the parse tree
	 */
	void enterEx2(GramaticaParser.Ex2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ex2}.
	 * @param ctx the parse tree
	 */
	void exitEx2(GramaticaParser.Ex2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(GramaticaParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(GramaticaParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termino2}.
	 * @param ctx the parse tree
	 */
	void enterTermino2(GramaticaParser.Termino2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termino2}.
	 * @param ctx the parse tree
	 */
	void exitTermino2(GramaticaParser.Termino2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(GramaticaParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(GramaticaParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GramaticaParser.TypeContext ctx);
}