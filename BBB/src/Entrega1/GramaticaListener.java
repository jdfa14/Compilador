// Generated from Gramatica.g4 by ANTLR 4.5.1
package Entrega1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GramaticaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GramaticaParser.InitContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(GramaticaParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(GramaticaParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#include2}.
	 * @param ctx the parse tree
	 */
	void enterInclude2(GramaticaParser.Include2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#include2}.
	 * @param ctx the parse tree
	 */
	void exitInclude2(GramaticaParser.Include2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(GramaticaParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(GramaticaParser.FunctionsContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#maindecl}.
	 * @param ctx the parse tree
	 */
	void enterMaindecl(GramaticaParser.MaindeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#maindecl}.
	 * @param ctx the parse tree
	 */
	void exitMaindecl(GramaticaParser.MaindeclContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GramaticaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GramaticaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaration2}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration2(GramaticaParser.Declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaration2}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration2(GramaticaParser.Declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#singledim}.
	 * @param ctx the parse tree
	 */
	void enterSingledim(GramaticaParser.SingledimContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#singledim}.
	 * @param ctx the parse tree
	 */
	void exitSingledim(GramaticaParser.SingledimContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#multidim}.
	 * @param ctx the parse tree
	 */
	void enterMultidim(GramaticaParser.MultidimContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#multidim}.
	 * @param ctx the parse tree
	 */
	void exitMultidim(GramaticaParser.MultidimContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dimd}.
	 * @param ctx the parse tree
	 */
	void enterDimd(GramaticaParser.DimdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dimd}.
	 * @param ctx the parse tree
	 */
	void exitDimd(GramaticaParser.DimdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dimd2}.
	 * @param ctx the parse tree
	 */
	void enterDimd2(GramaticaParser.Dimd2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dimd2}.
	 * @param ctx the parse tree
	 */
	void exitDimd2(GramaticaParser.Dimd2Context ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#asignations2}.
	 * @param ctx the parse tree
	 */
	void enterAsignations2(GramaticaParser.Asignations2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignations2}.
	 * @param ctx the parse tree
	 */
	void exitAsignations2(GramaticaParser.Asignations2Context ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#asignation2}.
	 * @param ctx the parse tree
	 */
	void enterAsignation2(GramaticaParser.Asignation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asignation2}.
	 * @param ctx the parse tree
	 */
	void exitAsignation2(GramaticaParser.Asignation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dima}.
	 * @param ctx the parse tree
	 */
	void enterDima(GramaticaParser.DimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dima}.
	 * @param ctx the parse tree
	 */
	void exitDima(GramaticaParser.DimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dima2}.
	 * @param ctx the parse tree
	 */
	void enterDima2(GramaticaParser.Dima2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dima2}.
	 * @param ctx the parse tree
	 */
	void exitDima2(GramaticaParser.Dima2Context ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#llwhile}.
	 * @param ctx the parse tree
	 */
	void enterLlwhile(GramaticaParser.LlwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#llwhile}.
	 * @param ctx the parse tree
	 */
	void exitLlwhile(GramaticaParser.LlwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#llfor}.
	 * @param ctx the parse tree
	 */
	void enterLlfor(GramaticaParser.LlforContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#llfor}.
	 * @param ctx the parse tree
	 */
	void exitLlfor(GramaticaParser.LlforContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lldowhile}.
	 * @param ctx the parse tree
	 */
	void enterLldowhile(GramaticaParser.LldowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lldowhile}.
	 * @param ctx the parse tree
	 */
	void exitLldowhile(GramaticaParser.LldowhileContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(GramaticaParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(GramaticaParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#conditional2}.
	 * @param ctx the parse tree
	 */
	void enterConditional2(GramaticaParser.Conditional2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#conditional2}.
	 * @param ctx the parse tree
	 */
	void exitConditional2(GramaticaParser.Conditional2Context ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#exo}.
	 * @param ctx the parse tree
	 */
	void enterExo(GramaticaParser.ExoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exo}.
	 * @param ctx the parse tree
	 */
	void exitExo(GramaticaParser.ExoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exo2}.
	 * @param ctx the parse tree
	 */
	void enterExo2(GramaticaParser.Exo2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exo2}.
	 * @param ctx the parse tree
	 */
	void exitExo2(GramaticaParser.Exo2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exn}.
	 * @param ctx the parse tree
	 */
	void enterExn(GramaticaParser.ExnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exn}.
	 * @param ctx the parse tree
	 */
	void exitExn(GramaticaParser.ExnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exn2}.
	 * @param ctx the parse tree
	 */
	void enterExn2(GramaticaParser.Exn2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exn2}.
	 * @param ctx the parse tree
	 */
	void exitExn2(GramaticaParser.Exn2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exi}.
	 * @param ctx the parse tree
	 */
	void enterExi(GramaticaParser.ExiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exi}.
	 * @param ctx the parse tree
	 */
	void exitExi(GramaticaParser.ExiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exi2}.
	 * @param ctx the parse tree
	 */
	void enterExi2(GramaticaParser.Exi2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exi2}.
	 * @param ctx the parse tree
	 */
	void exitExi2(GramaticaParser.Exi2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exm}.
	 * @param ctx the parse tree
	 */
	void enterExm(GramaticaParser.ExmContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exm}.
	 * @param ctx the parse tree
	 */
	void exitExm(GramaticaParser.ExmContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exm2}.
	 * @param ctx the parse tree
	 */
	void enterExm2(GramaticaParser.Exm2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exm2}.
	 * @param ctx the parse tree
	 */
	void exitExm2(GramaticaParser.Exm2Context ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GramaticaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GramaticaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(GramaticaParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(GramaticaParser.CteContext ctx);
}