package API;

import Entrega1.GramBBBParser;
import Entrega2.ManejadorDeMemoria;
import Entrega2.Memoria;
import Entrega2.Variable;
import Entrega2.Variables;
import Entrega3.Cubo;
import Entrega3.DATA;
import Entrega4.Cuadruplo;
import Entrega4.Procedure;
import Entrega4.Procedures;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author JesusDavid
 */
public class CompiAPI {
    private static final CompiAPI instance = new CompiAPI();
    
    private ManejadorDeMemoria memoryManager;
    private LinkedList<Cuadruplo> cuadruplos;
    private LinkedList<Cuadruplo> constantes;
    private LinkedList<Cuadruplo> globales;
    
    private Stack<Integer> saltos;
    private int main = -1;
    
    private Variables globalV;      // Variables globales
    private Variables localV;       // Variables locales
    private Variables constantV;
    private Procedures procs;
    /** Flag that indicates if context is local */
    private boolean localThread = false;        
    private Cubo cubo;
    
    public CompiAPI(){
        memoryManager = new ManejadorDeMemoria();
        cuadruplos = new LinkedList<>();
        constantes = new LinkedList<>();
        globales = new LinkedList<>();
        saltos = new Stack<>();
        globalV = new Variables();
        localV = new Variables();
        constantV = new Variables();
        cubo = new Cubo();
        procs = new Procedures();
    }
    
    public static LinkedList<Cuadruplo> getCuadruplos(){
        return instance.cuadruplos;
    }
    
    public void startLocalThread(){
        instance.localV.wipe();     // Cada que empezamos un nuevo contexto local borrar memoria
        localThread = true;         // Encender bandera
    }
    
    public void stopLocalThread(){
        localThread = false;
    }
    
    public static int getCubeValidation(int op, int dirOper1, int dirOper2){
        return instance.cubo.parse(Memoria.getDataTypeAsInt(dirOper1),Memoria.getDataTypeAsInt(dirOper2),op);
    }
    
    // Funcion qu obtiene el indice del cuadruplo que será agregado
    public static int getNextCuadIndex(){
        return instance.cuadruplos.size();
    }
    
    public static void changeToLocalContext(){
        instance.localThread = true;
        instance.localV.wipe();
        instance.memoryManager.reset(Memoria.SCOPE_TYPE.LOCAL);
        instance.memoryManager.reset(Memoria.SCOPE_TYPE.TEMPORAL);
    }
    
    public static void changeToGlobalContext(){
        instance.localThread = false;
    }
    
    public static void addCuadruplo(int operando, int operador1, int operador2, int resultado){
        instance.cuadruplos.add(new Cuadruplo(operando,operador1,operador2,resultado));
    }
    
    public static void addCuadruplo(int operando, VarType operador1, VarType operador2, VarType resultado){
        int newOper = DATA.getExpOperator(operando, operador1.getType(), operador2.getType(),resultado.getType());
        instance.cuadruplos.add(new Cuadruplo(newOper,operador1.getDir(),operador2.getDir(),resultado.getDir()));
    }
    
    public static void addCuadruplo(Cuadruplo cuadruplo){
        instance.cuadruplos.add(cuadruplo);
    }
    
    public static void addSalto(int salto){
        instance.saltos.add(salto);
    }
    
    public static int getSalto(){
        return instance.saltos.pop();
    }
    
    public static void refillSalto(int gotoCuad, int gotoDir){
        instance.cuadruplos.get(gotoCuad).setResultado(gotoDir);
    }
    
    public static void declareVar(Variable var){
        if(instance.localThread){
            instance.localV.add(var);
        }else{
            instance.globalV.add(var);
        }
    }
    
    public static boolean isDeclared(String id){
        if(instance.localThread){
            return instance.localV.has(id);
        }else{
            return instance.globalV.has(id);
        }
    }
    
    public static boolean isDeclaredSomewhere(String id){
        if(instance.localThread && instance.localV.has(id)){ // se buscara en locales si y solo si se encuentra en local Thread
            return true;
        }
        if(instance.globalV.has(id)){
            return true;
        }
        return false;
    }
    
    public static VarType whereIsDeclared(String id){
        if(instance.localThread && instance.localV.has(id)){ // se buscara en locales si y solo si se encuentra en local Thread
            return instance.localV.getDir(id);
        }
        if(instance.globalV.has(id)){
            return instance.globalV.getDir(id);
        }
        return null;
    }
    
    public static Variable getDeclaredVar(String id){
        if(instance.localThread && instance.localV.has(id)){ // se buscara en locales si y solo si se encuentra en local Thread
            return instance.localV.getVar(id);
        }
        if(instance.globalV.has(id)){
            return instance.globalV.getVar(id);
        }
        return null;
    }
    
    public static void reserveDirs(int type, int cant){
       switch(type){
            case DATA.INT:
                if(instance.localThread){
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.INT,cant);
                }else{
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.INT,cant);
                }
                break;
            case DATA.DBL:
                if(instance.localThread){
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.FLOAT,cant);
                }else{
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.FLOAT,cant);
                }
                break;
            case DATA.STR:
                if(instance.localThread){
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.STRING,cant);
                }else{
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.STRING,cant);
                }
                break;
            case DATA.BOL:
                if(instance.localThread){
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.BOOLEAN,cant);
                }else{
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.BOOLEAN,cant);
                }
                break;
        }
    }
    
    /**
     * Function to ask for a directory for a new variable
     * @param paramType Type of the param (Normal, Referenced)
     * @param type Data Type (int, string, boolean, etc)
     * @return VarType Object with dir and ParamType
     */
    public static VarType requestDir(DATA.PARAM_TYPE paramType, int type){
        switch(type){
            case DATA.INT:
                if(instance.localThread){
                    return new VarType(paramType,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.INT));
                }else{
                    return new VarType(paramType,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.INT));
                }
            case DATA.DBL:
                if(instance.localThread){
                    return new VarType(paramType,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.FLOAT));
                }else{
                    return new VarType(paramType,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.FLOAT));
                }
            case DATA.STR:
                if(instance.localThread){
                    return new VarType(paramType,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.STRING));
                }else{
                    return new VarType(paramType,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.STRING));
                }
            case DATA.BOL:
                if(instance.localThread){
                    return new VarType(paramType,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.BOOLEAN));
                }else{
                    return new VarType(paramType,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.BOOLEAN));
                }
        }
        return null;
    }
    
    public static VarType requestConstantDir(int type){
        switch(type){
            case DATA.INT:
                return new VarType(DATA.PARAM_TYPE.NORMAL,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.CONSTANTE, Memoria.DATA_TYPE.INT));
            case DATA.DBL:
                return new VarType(DATA.PARAM_TYPE.NORMAL,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.CONSTANTE, Memoria.DATA_TYPE.FLOAT));
            case DATA.STR:
                return new VarType(DATA.PARAM_TYPE.NORMAL,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.CONSTANTE, Memoria.DATA_TYPE.STRING));
            case DATA.BOL:
                return new VarType(DATA.PARAM_TYPE.NORMAL,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.CONSTANTE, Memoria.DATA_TYPE.BOOLEAN));
        }
        ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.CANNOT_CREATE_VAR, "Tipo de variable desconocida @requestConstantDir");
        return null;
    }
    
    public static VarType saveConstant(int type, String value){
        String id = value; // el ID es el mismo valor
        if(instance.constantV.has(id)){
            return instance.constantV.getDir(id);
        }
        VarType dirType = requestConstantDir(type);
        int dir = dirType.getDir();// Una constante siempre será normal
        switch(type){
            case DATA.INT:
                instance.constantes.add(new Cuadruplo(DATA.ACTE,Integer.parseInt(value),-1,dir));
                break;
            case DATA.STR:
                String str = (String) value;
                if(str.length() > 2){ // if not Empty
                    instance.constantes.add(new Cuadruplo(DATA.STR1,(long)str.charAt(1),-1,dir)); // DECLARA variable tipo String
                    int len = str.length();
                    for(int i = 2; i < len-1; i++){
                        instance.constantes.add(new Cuadruplo(DATA.STR2,(long)str.charAt(i),-1,dir)); // DECLARA variable tipo String
                    }
                }
                break;
            case DATA.DBL:
                long bigNumber = Double.doubleToLongBits(Double.parseDouble(value));
                instance.constantes.add(new Cuadruplo(DATA.ACTE,bigNumber,-1,dir));
                break;
            case DATA.BOL:
                instance.constantes.add(new Cuadruplo(DATA.ACTE,Integer.parseInt(value),-1,dir));
                break;
        }
        instance.constantV.add(new Variable((String)value,type,dirType));
        return dirType;
    }
    
    public static class TEMPORAL{
        public static VarType dirLastTemp = null;
        
        public static VarType creaTemporal(int type){
            VarType dir = null;
            switch(type){
                case DATA.INT:
                    dir = new VarType(DATA.PARAM_TYPE.NORMAL,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.TEMPORAL, Memoria.DATA_TYPE.INT));
                    break;
                case DATA.DBL:
                    dir = new VarType(DATA.PARAM_TYPE.NORMAL,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.TEMPORAL, Memoria.DATA_TYPE.FLOAT));
                    break;
                case DATA.STR:
                    dir = new VarType(DATA.PARAM_TYPE.NORMAL,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.TEMPORAL, Memoria.DATA_TYPE.STRING));
                    break;
                case DATA.BOL:
                    dir = new VarType(DATA.PARAM_TYPE.NORMAL,instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.TEMPORAL, Memoria.DATA_TYPE.BOOLEAN));
                    break;
            }
            dirLastTemp = dir;
            return dir;
        }   
    }
    
    public static class MAINDECL{
        public static void ins1(){
            instance.main = CompiAPI.getNextCuadIndex();
            CompiAPI.changeToLocalContext();
        }
        public static void ins2(){
            addCuadruplo(DATA.EOF,-1,-1,-1);
            CompiAPI.changeToGlobalContext();
        }
    }
    
    public static class INIT{
        public static void ins1(){
            addSalto(instance.cuadruplos.size()+1);
            addSalto(instance.cuadruplos.size());
            addCuadruplo(DATA.GOT,-1,-1,-1);
            
        }
        
        public static void ins2(){
            refillSalto(getSalto(),instance.cuadruplos.size());
            instance.constantes.stream().forEach((Cuadruplo cuad) -> {
                addCuadruplo(cuad);
            });
            instance.globales.stream().forEach((Cuadruplo cuad) -> {
                addCuadruplo(cuad);
            });
            if(instance.main == -1){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.GENERAL,"Funcion main no declarada");
            }
            addCuadruplo(DATA.GOT,-1,-1,getSalto());
        }
    }
    
    public static class INSTRUCTIONS{
        private static String auxCtei;
        
        public static void ins1(){
            addCuadruplo(DATA.PIN,-1,-1,0);
        }
        
        public static void ins2(){
            addCuadruplo(DATA.PIN,-1,-1,1);
        }
        
        public static void ins3(String ctei){
            VarType valor = CompiAPI.saveConstant(DATA.INT, ctei);
            addCuadruplo(DATA.COL,valor.getDir(),-1,DATA.RED);
        }
        public static void ins4(String ctei){
            VarType valor = CompiAPI.saveConstant(DATA.INT, ctei);
            addCuadruplo(DATA.COL,valor.getDir(),-1,DATA.GRN);
        }
        public static void ins5(String ctei){
            VarType valor = CompiAPI.saveConstant(DATA.INT, ctei);
            addCuadruplo(DATA.COL,valor.getDir(),-1,DATA.BLU);
        }
        public static void ins6(String ctei){
            auxCtei = ctei;
        }
        public static void ins7(String ctei){
            VarType valor1 = CompiAPI.saveConstant(DATA.INT, auxCtei);
            VarType valor2 = CompiAPI.saveConstant(DATA.INT, ctei);
            addCuadruplo(DATA.MVE,valor1.getDir(),valor2.getDir(),-1);
        }
    }
    
    public static class DECL{
        private static int type;
        private static Variable var;
        private static boolean asignation;
        
        public static Variable getLastVar(){
            return var;
        }
        
        public static void ins1(){  // Instrucion de declaracion de tipo
            DECL.type = TYPE.lastTypeUsed;
        }
        
        public static void ins2(String name){   // Nombre de la variable
            if(!isDeclared(name)){
                DECL.var = new Variable(DECL.type);
                DECL.var.varDir = CompiAPI.requestDir(DATA.PARAM_TYPE.NORMAL,DECL.type);
                DECL.var.nombre = name;
                CompiAPI.declareVar(DECL.var);
            } else {
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.ALREADY_DECLARED, name);
            }
            
            DECL.asignation = false;
        }
        
        public static void ins3(){// Asignacion de valor default de la variable
            DECL.asignation = true;
        }
        
        public static void ins4(){ // Declaras las variables y construyes su caudruplo
            Memoria.SCOPE_TYPE scope = Memoria.getScopeType(type);
 
            if(DECL.asignation){
                addCuadruplo(DATA.DECL,EXP.getLastEXP(),new VarType(DATA.PARAM_TYPE.MYSTERY,-1),var.varDir);
            }else{
                addCuadruplo(DATA.DECL,-1,-1,var.varDir.getDir());
            }
            if(DECL.var.tieneDim){
                addCuadruplo(DATA.GAP,var.varDir.getDir(),-1,var.m0);
            }
        }
        
        public static void ins5(){
            DECL.var.agregaDim(CTE.lastRawConstantInt);
        }
        
        public static void ins6(){
            DECL.var.setMS();
            reserveDirs(type, DECL.var.m0 - 1);
        }
    }
    
    public static class EXP{
        private static VarType lastExpResult = null;
        private static Stack<VarType> ArraysDirs = new Stack<>();
        
        private static Stack<EXP> pExp = new Stack<>();
        
        private Stack<VarType> pOper;
        private LinkedList<VarType> vP;
        private boolean negative;
        private int deep;
        private boolean isNew = true;
        
        public EXP(){
            pOper = new Stack<>();
            vP = new LinkedList<>();
            negative = false;
            int deep = 0;
        }
        
        public static void saveArrDir(){
                
        }
        
        public static void ins0(){
            if(pExp.size() == 0 || pExp.peek().isNew){
                pExp.add(new EXP());
            }
        }
        
        public static void ins1(){
            pExp.peek().pOper.add(new VarType(DATA.PARAM_TYPE.OPERATOR,DATA.OP));
            pExp.peek().deep++;
            pExp.peek().isNew = false;
        }
        
        public static VarType getLastEXP(){
            return lastExpResult;
        }
        
        public static void ins2(){
            while(pExp.peek().pOper.peek().getDir() != DATA.OP){
                pExp.peek().vP.add(pExp.peek().pOper.pop());
            }
            pExp.peek().pOper.pop();
            pExp.peek().deep--;
            }
        
        public static void ins3(){
            if(!pExp.peek().negative){
                pExp.peek().vP.add(VAR.lastVarDir);
            }else{
                int type = Memoria.getDataTypeAsInt(VAR.lastVarDir.getDir());
                pExp.peek().negative = false;
                VarType constMenosUnoDir = CompiAPI.saveConstant(DATA.INT, "-1");
                VarType newTempDir = CompiAPI.TEMPORAL.creaTemporal(type);
                
                CompiAPI.addCuadruplo(DATA.MUL, VAR.lastVarDir, constMenosUnoDir, newTempDir);
                pExp.peek().vP.add(newTempDir);
            }
        }
        
        public static void ins4(){
            pExp.peek().negative = true;
        }
        
        public static void ins5(int oper){
            if(pExp.peek().pOper.size() > 0 && (pExp.peek().pOper.peek().getDir() == DATA.MUL
                    || pExp.peek().pOper.peek().getDir() == DATA.DIV)){
                pExp.peek().vP.add(pExp.peek().pOper.pop());
            }
            pExp.peek().pOper.add(new VarType(DATA.PARAM_TYPE.OPERATOR,oper));
        }
        
        public static void ins6(){
            if(pExp.peek().pOper.size() > 0 && (pExp.peek().pOper.peek().getDir() == DATA.MUL
                    || pExp.peek().pOper.peek().getDir() == DATA.DIV)){
                pExp.peek().vP.add(pExp.peek().pOper.pop());
            }
        }
            
        
        
        public static void ins7(int oper){
            if(pExp.peek().pOper.size() > 0 && (pExp.peek().pOper.peek().getDir() == DATA.ADD
                    || pExp.peek().pOper.peek().getDir() == DATA.SUB)){
                pExp.peek().vP.add(pExp.peek().pOper.pop());
            }
            pExp.peek().pOper.add(new VarType(DATA.PARAM_TYPE.OPERATOR,oper));
        }
        
        public static void ins8(){
            if(pExp.peek().pOper.size() > 0 && (pExp.peek().pOper.peek().getDir() == DATA.ADD
                    || pExp.peek().pOper.peek().getDir() == DATA.SUB)){
                pExp.peek().vP.add(pExp.peek().pOper.pop());
            }
        }
        
        public static void ins9(int oper){
            pExp.peek().pOper.add(new VarType(DATA.PARAM_TYPE.OPERATOR,oper));
        }
        
        public static void ins10(){
            pExp.peek().vP.add(pExp.peek().pOper.pop());
        }
        
        public static void evaluate(){
            if(pExp.peek().deep == 0){
                Stack<VarType> vars = new Stack<>();
                VarType op;
                while(pExp.peek().vP.size() > 0){
                    op = pExp.peek().vP.pop();
                    
                    switch(op.getType()){
                        case OPERATOR:
                            if(vars.size() < 2){
                                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.GENERAL,"Expresion mal construida");
                                return;
                            }else{

                                VarType oper2 = vars.pop();
                                VarType oper1 = vars.pop();
                                int type = CompiAPI.getCubeValidation(op.getDir(), oper1.getDir(), oper2.getDir());
                                if(type == DATA.ERR){
                                    ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.GENERAL,"Tipos de datos mal construida");
                                    return;
                                }
                                
                                switch(op.getDir()){
                                    case DATA.ADD:
                                    case DATA.SUB:
                                    case DATA.DIV:
                                    case DATA.MUL:
                                    case DATA.MOD:
                                    case DATA.EQS:
                                        VarType dirNewTemp2 = CompiAPI.TEMPORAL.creaTemporal(type);
                                        CompiAPI.addCuadruplo(op.getDir(), oper1, oper2, dirNewTemp2);
                                        vars.push(dirNewTemp2);
                                        break;
                                    default:// Generamos el cuadruplo normal
                                        VarType dirNewTemp = CompiAPI.TEMPORAL.creaTemporal(type);
                                        CompiAPI.addCuadruplo(op.getDir(), oper1.getDir(), oper2.getDir(), dirNewTemp.getDir());
                                        vars.push(dirNewTemp);
                                        
                                        
                                }
                            }
                            break;
                        default:
                            vars.push(op);
                            break;
                    }
                }
                //vP.clear();
                if(vars.size() != 1){
                    ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.GENERAL, "Expresion mal construida");
                    return;
                }
                lastExpResult = vars.pop();
                pExp.pop();
            }
        }
    }
    
    public static class VAR{
        public static VarType lastVarDir = null;
        public static String id;
        public static void ins1(){
            lastVarDir = CTE.lastConstant;
        }
        
        public static void ins2(String id){
            if(CompiAPI.isDeclaredSomewhere(id)){
                lastVarDir = CompiAPI.whereIsDeclared(id);
                VAR.id = id;
            }else{
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.UNDECLARED_VARIABLE, id);
            }
        }
        
        public static void ins3(){
            lastVarDir = FUNCTIONCALL.dirTempReturn;
        }
        
        public static void ins4(){
            DIMENTIONAL.ins1(id);
        }
        
        public static void ins5(){
            DIMENTIONAL.ins2();
        }
        
        public static void ins6(){
            DIMENTIONAL.ins3();
            lastVarDir = DIMENTIONAL.lastDirOfDir;
        }
    }
    
    public static class PARAMS{
        private static LinkedList<Variable> vars = new LinkedList<>();
        
        public static void ins1(String ID){
            if(CompiAPI.isDeclared(ID)){
                //throw new Exception("Error: Variable ya declarada");
            }
            Variable var = new Variable(TYPE.lastTypeUsed);
            var.varDir = CompiAPI.requestDir(DATA.PARAM_TYPE.NORMAL,var.tipo);
            var.nombre = ID;
            CompiAPI.declareVar(var);
            vars.add(var);
        }
        
        public static int getCant(){
            return vars.size();
        }
        
        public static Variable popVar(){
            return vars.pop();
        }
    }
    
    public static class FUNCTIONDECL{
        private static int typeDeclared = DATA.ERR;
        private static Procedure procedure;
        
        public static void ins1(){
            typeDeclared = TYPE.lastTypeUsed;
        }
        
        public static void ins2(String ID){
            procedure = new Procedure(ID,typeDeclared);
            changeToLocalContext();
        }
        
        public static void ins3(){
            addSalto(getNextCuadIndex());
            addCuadruplo(DATA.GOT,-1,-1,-1);
            while(PARAMS.getCant() != 0){
                procedure.addVar(PARAMS.popVar());
            }
            if(instance.procs.has(procedure)){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.ALREADY_DECLARED, procedure.procID+"/"+procedure.vars.size());
                return;
            }
            procedure.dirCuadruplo = CompiAPI.getNextCuadIndex();
            instance.procs.add(procedure);
        }
        
        public static void ins4(){
            addCuadruplo(DATA.RET,-1,-1,-1);
            refillSalto(getSalto(), getNextCuadIndex());
            CompiAPI.changeToGlobalContext();
        }
        
        public static void ins5(){
            addCuadruplo(DATA.RET,EXP.getLastEXP(),new VarType(),new VarType());
        }
    }
    
    public static class CTE{
        public static VarType lastConstant = null;
        public static int lastRawConstantInt;
        
        public static void ins1(int type, String constant){
            int dataType = -1;
            switch (type){
                case GramBBBParser.CTES:
                    dataType = DATA.STR; break;
                case GramBBBParser.CTEI:
                    dataType = DATA.INT;
                    lastRawConstantInt = Integer.parseInt(constant);
                    break;
                case GramBBBParser.CTEF:
                    dataType = DATA.DBL; break;
                default:
                    dataType = -1; break;
            }
            lastConstant = CompiAPI.saveConstant(dataType, constant);
        }
    }
    
    public static class PRINT{
        public static void ins1(){
            CompiAPI.addCuadruplo(DATA.PRNT, new VarType(), new VarType(), CompiAPI.EXP.getLastEXP());
        }
    }
    
    public static class TYPE{
        public static int lastTypeUsed = -1;
        
        // Retiene el tipo de variable de la ultima instancia
        public static void ins1(int type){
            switch (type){
                case GramBBBParser.INT:
                    lastTypeUsed = DATA.INT; break;
                case GramBBBParser.FLT:
                    lastTypeUsed = DATA.DBL; break;
                case GramBBBParser.BOL:
                    lastTypeUsed = DATA.BOL; break;
                case GramBBBParser.STR:
                    lastTypeUsed = DATA.STR; break;
                case GramBBBParser.VOID:
                    lastTypeUsed = -1; break;
            }
        }
    }
    
    public static class VALIDATOR{
        public static boolean isBoolean(int dir){
            Memoria.DATA_TYPE type = Memoria.getDataType(dir);
            return type == Memoria.DATA_TYPE.BOOLEAN;
        }
    }
    
    public static class IF{
        public static void ins1(){
            int dirLastExp = EXP.getLastEXP().getDir();
            if(!VALIDATOR.isBoolean(dirLastExp)){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.WRONG_DATA_TYPE);
                return;
            }
            addSalto(instance.cuadruplos.size());
            CompiAPI.addCuadruplo(DATA.GTF,dirLastExp, -1, -1);// Cuadruplo que será rellenado
        }
        
        public static void ins2(){
            int salt = CompiAPI.getSalto();
            CompiAPI.addSalto(instance.cuadruplos.size());
            CompiAPI.addCuadruplo(DATA.GOT,-1,-1,-1);
            CompiAPI.refillSalto(salt, instance.cuadruplos.size());
        }
        
        public static void ins3(){
            CompiAPI.refillSalto(CompiAPI.getSalto(), instance.cuadruplos.size());
        }
    }
    
    public static class WHILE{
        public static void ins1(){
            addSalto(getNextCuadIndex());
        }
        
        public static void ins2(){
            int dirLastExp = EXP.getLastEXP().getDir();
            if(!VALIDATOR.isBoolean(dirLastExp)){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.WRONG_DATA_TYPE);
                return;
            }
            int aux = getSalto();
            addSalto(getNextCuadIndex());
            addSalto(aux);
            addCuadruplo(DATA.GTF,dirLastExp,-1,-1);
        }
        
        public static void ins3(){
            addCuadruplo(DATA.GOT,-1,-1,getSalto());
            refillSalto(getSalto(), getNextCuadIndex());
        }
    }
    
    public static class DOWHILE{
        public static void ins1(){
            addSalto(instance.cuadruplos.size());
        }
        public static void ins2(){
            int dirLastExp = EXP.getLastEXP().getDir();
            if(!VALIDATOR.isBoolean(dirLastExp)){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.WRONG_DATA_TYPE);
                return;
            }
            addCuadruplo(DATA.GTT,dirLastExp,-1,getSalto());
        }
    }
    
    public static class FOR{
        public static void ins1(){
            addSalto(getNextCuadIndex());
        }
        
        public static void ins2(){
            int dirLastExp = EXP.getLastEXP().getDir();
            if(!VALIDATOR.isBoolean(dirLastExp)){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.WRONG_DATA_TYPE);
                return;
            }
            addSalto(getNextCuadIndex());       // DIr de GOTF
            addCuadruplo(DATA.GTF,dirLastExp,-1,-1);
            addSalto(getNextCuadIndex());       // Dir de GOTO
            addCuadruplo(DATA.GOT,-1,-1,-1);
            addSalto(getNextCuadIndex());       // DIR de asignaciones incremento y asi
        }
        
        public static void ins3(){
            int assign = getSalto();
            int gotod = getSalto();
            int gotof = getSalto();
            int dirExp = getSalto();
            addCuadruplo(DATA.GOT,-1,-1,dirExp);
            refillSalto(gotod, getNextCuadIndex());
            addSalto(gotof);
            addSalto(assign);
        }
        
        public static void ins4(){
            addCuadruplo(DATA.GOT,-1,-1,getSalto());
            refillSalto(getSalto(),getNextCuadIndex());
        }
    }
    
    public static class DIMENTIONAL{
        private static VarType lastDirOfDir = null;

        public static VarType getLastdirOfDir() {
            if(dimIndex != dims.size()){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.WRONG_MEMORY_ACCESS);
                return null;
            }
            return lastDirOfDir;
        }
        
        private static Variable var;
        private static Variable.Dimension actualDim;
        private static int dimIndex = 0;
        private static ArrayList<Variable.Dimension> dims; 
        private static Stack<VarType> toAcum = new Stack<>();
        
        public static void ins1(String id){ // Cuando encontramos un bracket
            if(!isDeclaredSomewhere(id)){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.UNDECLARED_VARIABLE);
                return;
            }
            var = getDeclaredVar(id);
            dims = var.dim;
            dimIndex = 0;
            lastDirOfDir = null;
        }
        public static void ins2(){// Despues de capturar una dimension
            VarType dirLastExp = EXP.getLastEXP();
            int type = Memoria.getDataTypeAsInt(dirLastExp.getDir());
            if(type != DATA.INT && type != DATA.DBL){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.WRONG_DATA_TYPE);
                return;
            }
            if(!var.tieneDim){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.INVALID_DIMENTION, var.nombre);
                return;
            }
            
            if(dimIndex >= dims.size()){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.GENERAL, dimIndex+"");
                return;
            }
            actualDim = dims.get(dimIndex);
            dimIndex++;
            
            addCuadruplo(DATA.VRG,new VarType(DATA.PARAM_TYPE.NORMAL,0),new VarType(DATA.PARAM_TYPE.NORMAL,actualDim.tam),dirLastExp);
            VarType newTemp = CompiAPI.TEMPORAL.creaTemporal(DATA.INT); // Direccion de memoria donde se guardará la nueva temp
            VarType dirM = saveConstant(DATA.INT,actualDim.m+"");
            addCuadruplo(DATA.MUL,dirLastExp,dirM,newTemp);
            toAcum.add(newTemp);
        }
        
        public static void ins3(){
            while(toAcum.size() > 1){
                VarType newTemp = CompiAPI.TEMPORAL.creaTemporal(DATA.INT);
                VarType oper1 = toAcum.pop();
                VarType oper2 = toAcum.pop();
                addCuadruplo(DATA.ADD,oper1,oper2,newTemp);
                toAcum.add(newTemp);
            }
            VarType dirVar = saveConstant(DATA.INT,(var.varDir.getDir())+"");
            VarType newTemp = CompiAPI.TEMPORAL.creaTemporal(DATA.INT);
            addCuadruplo(DATA.ADD,toAcum.pop(),dirVar,newTemp);
            lastDirOfDir = new VarType(DATA.PARAM_TYPE.REFERENCED,newTemp.getDir());
        }
    }
    
    public static class ASIGNATION{
        public static Variable var;
        
        public static void ins1(String ID){
            if(!CompiAPI.isDeclaredSomewhere(ID)){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.UNDECLARED_VARIABLE, ID);
                return;
            }
            var = CompiAPI.getDeclaredVar(ID);
        }
        
        public static void ins2(){
            VarType dirLastExp = EXP.getLastEXP();
            int typeOfExp = Memoria.getDataTypeAsInt(dirLastExp.getDir());
            int validation = CompiAPI.getCubeValidation(DATA.EQS, var.tipo, typeOfExp);
            if(validation == DATA.ERR){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.INVALID_OPERATION);
                return;
            }
            addCuadruplo(DATA.EQS,dirLastExp,new VarType(),var.varDir);
        }
        
        public static void ins3(){
            DIMENTIONAL.ins1(var.nombre);
        }
        
        public static void ins4(){
            DIMENTIONAL.ins2();
        }
        
        public static void ins5(){
            DIMENTIONAL.ins3();
        }
        
        public static void ins6(){
            VarType dirLastExp = EXP.getLastEXP();
            int typeOfExp = Memoria.getDataTypeAsInt(dirLastExp.getDir());
            int validation = CompiAPI.getCubeValidation(DATA.EQS, var.tipo, typeOfExp);
            if(validation == DATA.ERR){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.INVALID_OPERATION);
                return;
            }
            VarType destinationDir = DIMENTIONAL.getLastdirOfDir();
            if(destinationDir == null){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.GENERAL,"Error desconocido 1");
                return;
            }
            addCuadruplo(DATA.EQS,dirLastExp,new VarType(),destinationDir);
        }
    }
    
    /** Class to control function calls */
    public static class FUNCTIONCALL{
        private static String idName;
        private static VarType dirTempReturn = null;
        
        public static void ins1(String ID){
            idName  = ID;
        }
        
        public static void ins2(){
            int paramCant = PARAMSCALL.size();
            if(!instance.procs.has(FUNCTIONCALL.idName, paramCant)){
                ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.UNDECLARED_VARIABLE, idName +"/"+paramCant);
                
            }
            Procedure procedure = instance.procs.getProc(idName, paramCant);
            ArrayList<String> keys = procedure.varKeys;
            
            dirTempReturn = CompiAPI.TEMPORAL.creaTemporal(procedure.type);
            addCuadruplo(DATA.RTVAL,-1,-1,dirTempReturn.getDir());
            addCuadruplo(DATA.PC,-1,-1,-1);
            for(String key : keys){
                addCuadruplo(DATA.PARAM,PARAMSCALL.pop(),new VarType(DATA.PARAM_TYPE.MYSTERY,-1),procedure.getDirOfVar(key));
            }
            addCuadruplo(DATA.CC,-1,-1,procedure.dirCuadruplo);
            
        }
    }
    /** Class to control params variables */
    public static class PARAMSCALL{
        private static LinkedList<VarType> exps = new LinkedList<>();
        public static void ins1(){
            exps.add(EXP.getLastEXP());
        }
        
        public static int size(){
            return exps.size();
        }
        
        public static VarType pop(){
            return exps.pop();
        }
    }
}
