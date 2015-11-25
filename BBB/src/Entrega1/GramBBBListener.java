// Generated from GramBBB.g4 by ANTLR 4.5.1
package Entrega1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramBBBParser}.
 */
public interface GramBBBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GramBBBParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GramBBBParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GramBBBParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GramBBBParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#includes}.
	 * @param ctx the parse tree
	 */
	void enterIncludes(GramBBBParser.IncludesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#includes}.
	 * @param ctx the parse tree
	 */
	void exitIncludes(GramBBBParser.IncludesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(GramBBBParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(GramBBBParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#include2}.
	 * @param ctx the parse tree
	 */
	void enterInclude2(GramBBBParser.Include2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#include2}.
	 * @param ctx the parse tree
	 */
	void exitInclude2(GramBBBParser.Include2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#functiondecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondecl(GramBBBParser.FunctiondeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#functiondecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondecl(GramBBBParser.FunctiondeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#functiondecl2}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondecl2(GramBBBParser.Functiondecl2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#functiondecl2}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondecl2(GramBBBParser.Functiondecl2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#rtvalue}.
	 * @param ctx the parse tree
	 */
	void enterRtvalue(GramBBBParser.RtvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#rtvalue}.
	 * @param ctx the parse tree
	 */
	void exitRtvalue(GramBBBParser.RtvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#maindecl}.
	 * @param ctx the parse tree
	 */
	void enterMaindecl(GramBBBParser.MaindeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#maindecl}.
	 * @param ctx the parse tree
	 */
	void exitMaindecl(GramBBBParser.MaindeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GramBBBParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GramBBBParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GramBBBParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GramBBBParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#params2}.
	 * @param ctx the parse tree
	 */
	void enterParams2(GramBBBParser.Params2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#params2}.
	 * @param ctx the parse tree
	 */
	void exitParams2(GramBBBParser.Params2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#params3}.
	 * @param ctx the parse tree
	 */
	void enterParams3(GramBBBParser.Params3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#params3}.
	 * @param ctx the parse tree
	 */
	void exitParams3(GramBBBParser.Params3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GramBBBParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GramBBBParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#multivar}.
	 * @param ctx the parse tree
	 */
	void enterMultivar(GramBBBParser.MultivarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#multivar}.
	 * @param ctx the parse tree
	 */
	void exitMultivar(GramBBBParser.MultivarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#multivar2}.
	 * @param ctx the parse tree
	 */
	void enterMultivar2(GramBBBParser.Multivar2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#multivar2}.
	 * @param ctx the parse tree
	 */
	void exitMultivar2(GramBBBParser.Multivar2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#dasign}.
	 * @param ctx the parse tree
	 */
	void enterDasign(GramBBBParser.DasignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#dasign}.
	 * @param ctx the parse tree
	 */
	void exitDasign(GramBBBParser.DasignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#multidim}.
	 * @param ctx the parse tree
	 */
	void enterMultidim(GramBBBParser.MultidimContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#multidim}.
	 * @param ctx the parse tree
	 */
	void exitMultidim(GramBBBParser.MultidimContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#dimd}.
	 * @param ctx the parse tree
	 */
	void enterDimd(GramBBBParser.DimdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#dimd}.
	 * @param ctx the parse tree
	 */
	void exitDimd(GramBBBParser.DimdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#dimd2}.
	 * @param ctx the parse tree
	 */
	void enterDimd2(GramBBBParser.Dimd2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#dimd2}.
	 * @param ctx the parse tree
	 */
	void exitDimd2(GramBBBParser.Dimd2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#asignations}.
	 * @param ctx the parse tree
	 */
	void enterAsignations(GramBBBParser.AsignationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#asignations}.
	 * @param ctx the parse tree
	 */
	void exitAsignations(GramBBBParser.AsignationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#asignation}.
	 * @param ctx the parse tree
	 */
	void enterAsignation(GramBBBParser.AsignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#asignation}.
	 * @param ctx the parse tree
	 */
	void exitAsignation(GramBBBParser.AsignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#asignation2}.
	 * @param ctx the parse tree
	 */
	void enterAsignation2(GramBBBParser.Asignation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#asignation2}.
	 * @param ctx the parse tree
	 */
	void exitAsignation2(GramBBBParser.Asignation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#dima}.
	 * @param ctx the parse tree
	 */
	void enterDima(GramBBBParser.DimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#dima}.
	 * @param ctx the parse tree
	 */
	void exitDima(GramBBBParser.DimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#dima2}.
	 * @param ctx the parse tree
	 */
	void enterDima2(GramBBBParser.Dima2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#dima2}.
	 * @param ctx the parse tree
	 */
	void exitDima2(GramBBBParser.Dima2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#estatutos}.
	 * @param ctx the parse tree
	 */
	void enterEstatutos(GramBBBParser.EstatutosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#estatutos}.
	 * @param ctx the parse tree
	 */
	void exitEstatutos(GramBBBParser.EstatutosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void enterEstatuto(GramBBBParser.EstatutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void exitEstatuto(GramBBBParser.EstatutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(GramBBBParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(GramBBBParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#llwhile}.
	 * @param ctx the parse tree
	 */
	void enterLlwhile(GramBBBParser.LlwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#llwhile}.
	 * @param ctx the parse tree
	 */
	void exitLlwhile(GramBBBParser.LlwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#llfor}.
	 * @param ctx the parse tree
	 */
	void enterLlfor(GramBBBParser.LlforContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#llfor}.
	 * @param ctx the parse tree
	 */
	void exitLlfor(GramBBBParser.LlforContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#lldowhile}.
	 * @param ctx the parse tree
	 */
	void enterLldowhile(GramBBBParser.LldowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#lldowhile}.
	 * @param ctx the parse tree
	 */
	void exitLldowhile(GramBBBParser.LldowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(GramBBBParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(GramBBBParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#paramscall}.
	 * @param ctx the parse tree
	 */
	void enterParamscall(GramBBBParser.ParamscallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#paramscall}.
	 * @param ctx the parse tree
	 */
	void exitParamscall(GramBBBParser.ParamscallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#paramscall2}.
	 * @param ctx the parse tree
	 */
	void enterParamscall2(GramBBBParser.Paramscall2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#paramscall2}.
	 * @param ctx the parse tree
	 */
	void exitParamscall2(GramBBBParser.Paramscall2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#paramscall3}.
	 * @param ctx the parse tree
	 */
	void enterParamscall3(GramBBBParser.Paramscall3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#paramscall3}.
	 * @param ctx the parse tree
	 */
	void exitParamscall3(GramBBBParser.Paramscall3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(GramBBBParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(GramBBBParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#conditional2}.
	 * @param ctx the parse tree
	 */
	void enterConditional2(GramBBBParser.Conditional2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#conditional2}.
	 * @param ctx the parse tree
	 */
	void exitConditional2(GramBBBParser.Conditional2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GramBBBParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GramBBBParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(GramBBBParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(GramBBBParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(GramBBBParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(GramBBBParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(GramBBBParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(GramBBBParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exo}.
	 * @param ctx the parse tree
	 */
	void enterExo(GramBBBParser.ExoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exo}.
	 * @param ctx the parse tree
	 */
	void exitExo(GramBBBParser.ExoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exo2}.
	 * @param ctx the parse tree
	 */
	void enterExo2(GramBBBParser.Exo2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exo2}.
	 * @param ctx the parse tree
	 */
	void exitExo2(GramBBBParser.Exo2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exn}.
	 * @param ctx the parse tree
	 */
	void enterExn(GramBBBParser.ExnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exn}.
	 * @param ctx the parse tree
	 */
	void exitExn(GramBBBParser.ExnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exn2}.
	 * @param ctx the parse tree
	 */
	void enterExn2(GramBBBParser.Exn2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exn2}.
	 * @param ctx the parse tree
	 */
	void exitExn2(GramBBBParser.Exn2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exi}.
	 * @param ctx the parse tree
	 */
	void enterExi(GramBBBParser.ExiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exi}.
	 * @param ctx the parse tree
	 */
	void exitExi(GramBBBParser.ExiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exi2}.
	 * @param ctx the parse tree
	 */
	void enterExi2(GramBBBParser.Exi2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exi2}.
	 * @param ctx the parse tree
	 */
	void exitExi2(GramBBBParser.Exi2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exm}.
	 * @param ctx the parse tree
	 */
	void enterExm(GramBBBParser.ExmContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exm}.
	 * @param ctx the parse tree
	 */
	void exitExm(GramBBBParser.ExmContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#exm2}.
	 * @param ctx the parse tree
	 */
	void enterExm2(GramBBBParser.Exm2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#exm2}.
	 * @param ctx the parse tree
	 */
	void exitExm2(GramBBBParser.Exm2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#ex}.
	 * @param ctx the parse tree
	 */
	void enterEx(GramBBBParser.ExContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#ex}.
	 * @param ctx the parse tree
	 */
	void exitEx(GramBBBParser.ExContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#ex2}.
	 * @param ctx the parse tree
	 */
	void enterEx2(GramBBBParser.Ex2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#ex2}.
	 * @param ctx the parse tree
	 */
	void exitEx2(GramBBBParser.Ex2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(GramBBBParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(GramBBBParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#termino2}.
	 * @param ctx the parse tree
	 */
	void enterTermino2(GramBBBParser.Termino2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#termino2}.
	 * @param ctx the parse tree
	 */
	void exitTermino2(GramBBBParser.Termino2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GramBBBParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GramBBBParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GramBBBParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GramBBBParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#multidimv}.
	 * @param ctx the parse tree
	 */
	void enterMultidimv(GramBBBParser.MultidimvContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#multidimv}.
	 * @param ctx the parse tree
	 */
	void exitMultidimv(GramBBBParser.MultidimvContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#dimv}.
	 * @param ctx the parse tree
	 */
	void enterDimv(GramBBBParser.DimvContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#dimv}.
	 * @param ctx the parse tree
	 */
	void exitDimv(GramBBBParser.DimvContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#dimv2}.
	 * @param ctx the parse tree
	 */
	void enterDimv2(GramBBBParser.Dimv2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#dimv2}.
	 * @param ctx the parse tree
	 */
	void exitDimv2(GramBBBParser.Dimv2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramBBBParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(GramBBBParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramBBBParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(GramBBBParser.CteContext ctx);
}