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
    
    public static int whereIsDeclared(String id){
        if(instance.localThread && instance.localV.has(id)){ // se buscara en locales si y solo si se encuentra en local Thread
            return instance.localV.getDir(id);
        }
        if(instance.globalV.has(id)){
            return instance.globalV.getDir(id);
        }
        return -1;
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
    
    //Funcion que te da la siguiende direccion de memoria segun el tipo y el scope en el que se encuentra
    public static int requestDir(int type){
        switch(type){
            case DATA.INT:
                if(instance.localThread){
                    return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.INT);
                }else{
                    return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.INT);
                }
            case DATA.DBL:
                if(instance.localThread){
                    return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.FLOAT);
                }else{
                    return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.FLOAT);
                }
            case DATA.STR:
                if(instance.localThread){
                    return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.STRING);
                }else{
                    return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.STRING);
                }
            case DATA.BOL:
                if(instance.localThread){
                    return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.BOOLEAN);
                }else{
                    return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.BOOLEAN);
                }
        }
        return -1;
    }
    
    public static int requestConstantDir(int type){
        switch(type){
            case DATA.INT:
               return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.CONSTANTE, Memoria.DATA_TYPE.INT);
            case DATA.DBL:
                return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.CONSTANTE, Memoria.DATA_TYPE.FLOAT);
            case DATA.STR:
               return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.CONSTANTE, Memoria.DATA_TYPE.STRING);
            case DATA.BOL:
                return instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.CONSTANTE, Memoria.DATA_TYPE.BOOLEAN);
        }
        return -1;
    }
    
    public static int saveConstant(int type, String value){
        String id = value; // el ID es el mismo valor
        if(instance.constantV.has(id)){
            return instance.constantV.getDir(id);
        }
        int dir = requestConstantDir(type);
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
        instance.constantV.add(new Variable((String)value,type,dir));
        return dir;
    }
    
    public static class TEMPORAL{
        public static int dirLastTemp = -1;
        
        public static int creaTemporal(int type){
            int dir = -1;
            switch(type){
                case DATA.INT:
                    dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.TEMPORAL, Memoria.DATA_TYPE.INT);
                    break;
                case DATA.DBL:
                    dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.TEMPORAL, Memoria.DATA_TYPE.FLOAT);
                    break;
                case DATA.STR:
                    dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.TEMPORAL, Memoria.DATA_TYPE.STRING);
                    break;
                case DATA.BOL:
                    dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.TEMPORAL, Memoria.DATA_TYPE.BOOLEAN);
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
                //TODO ERROR
                System.out.println("Funcion main no declarada");
            }
            addCuadruplo(DATA.GOT,-1,-1,getSalto());
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
                DECL.var.dir = CompiAPI.requestDir(DECL.type);
                DECL.var.nombre = name;
                CompiAPI.declareVar(DECL.var);
            } else {
                //TODO ERROR variable declarada;
            }
            
            DECL.asignation = false;
        }
        
        public static void ins3(){// Asignacion de valor default de la variable
            DECL.asignation = true;
        }
        
        public static void ins4(){ // Declaras las variables y construyes su caudruplo
            Memoria.SCOPE_TYPE scope = Memoria.getScopeType(type);
 
            if(DECL.asignation){
                addCuadruplo(DATA.DECL,EXP.getLastEXP(),-1,var.dir);
            }else{
                addCuadruplo(DATA.DECL,-1,-1,var.dir);
            }
            if(DECL.var.tieneDim){
                addCuadruplo(DATA.GAP,var.dir,-1,var.m0);
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
        private static int lastExpResult = -1;
        
        private static Stack<Integer> pOper = new Stack<>();
        private static LinkedList<Integer> vP = new LinkedList<>();
        private static boolean negative = false;
        private static int deep = 0;

        public static void ins1(){
            pOper.add(DATA.OP);
            deep++;
        }
        
        public static int getLastEXP(){
            return lastExpResult;
        }
        
        public static void ins2(){
            while(pOper.peek() != DATA.OP){
                vP.add(pOper.pop());
            }
            pOper.pop();
            deep--;
        }
        
        public static void ins3(){
            if(!negative){
                vP.add(VAR.lastVarDir);
            }else{
                int type = Memoria.getDataTypeAsInt(VAR.lastVarDir);
                negative = false;
                int constMenosUnoDir = CompiAPI.saveConstant(DATA.INT, "-1");
                int newTempDir = CompiAPI.TEMPORAL.creaTemporal(type);
                CompiAPI.addCuadruplo(DATA.MUL, VAR.lastVarDir, constMenosUnoDir, newTempDir);
                vP.add(newTempDir);
            }
        }
        
        public static void ins4(){
            negative = true;
        }
        
        public static void ins5(int oper){
            if(pOper.size() > 0 && (pOper.peek() == DATA.MUL
                    || pOper.peek() == DATA.DIV)){
                vP.add(pOper.pop());
            }
            pOper.add(oper);
        }
        
        public static void ins6(){
            if(pOper.size() > 0 && (pOper.peek() == DATA.MUL
                    || pOper.peek() == DATA.DIV)){
                vP.add(pOper.pop());
            }
        }
            
        
        
        public static void ins7(int oper){
            if(pOper.size() > 0 && (pOper.peek() == DATA.ADD
                    || pOper.peek() == DATA.SUB)){
                vP.add(pOper.pop());
            }
            pOper.add(oper);
        }
        
        public static void ins8(){
            if(pOper.size() > 0 && (pOper.peek() == DATA.ADD
                    || pOper.peek() == DATA.SUB)){
                vP.add(pOper.pop());
            }
        }
        
        public static void ins9(int oper){
            pOper.add(oper);
        }
        
        public static void ins10(){
            vP.add(pOper.pop());
        }
        
        public static void evaluate(){
            if(deep == 0){
                Stack<Integer> vars = new Stack<>();
                int op;
                while(vP.size() > 0){
                    op = vP.pop();
                    switch(op){
                        case DATA.MUL:
                        case DATA.DIV:
                        case DATA.ADD:
                        case DATA.SUB:
                        case DATA.MOD:
                        case DATA.AND:
                        case DATA.OOR:
                        case DATA.OLT:
                        case DATA.OGT:
                        case DATA.EQT:
                        case DATA.DIF:
                        case DATA.GOE:
                        case DATA.LOE:
                            if(vars.size() < 2){
                                //TODO ERROR expresion mal construida
                                System.out.println("Expresion mal construida");
                                return;
                            }else{

                                int oper2 = vars.pop();
                                int oper1 = vars.pop();
                                int type = CompiAPI.getCubeValidation(op, oper1, oper2);
                                        //cubo.parse(Memoria.getDataTypeAsInt(oper1), Memoria.getDataTypeAsInt(oper2), op);
                                if(type == DATA.ERR){
                                    //TODO error operacioninvalida
                                    System.out.println("Tipos de datos mal construida");
                                    return;
                                }

                                int dirNewTemp = CompiAPI.TEMPORAL.creaTemporal(type);
                                CompiAPI.addCuadruplo(op, oper1, oper2, dirNewTemp);
                                vars.push(dirNewTemp);
                            }
                            break;
                        default:
                            vars.push(op);
                            break;
                    }
                }
                //vP.clear();
                if(vars.size() != 1){
                    //TODO error expresion mal construida
                    System.out.println("Expresion mal construida");
                    return;
                }
                lastExpResult = vars.pop();
            
            }
        }
    }
    
    public static class VAR{
        public static int lastVarDir = -1;
        public static String id;
        public static void ins1(){
            lastVarDir = CTE.lastConstant;
        }
        
        public static void ins2(String id){
            if(CompiAPI.isDeclaredSomewhere(id)){
                lastVarDir = CompiAPI.whereIsDeclared(id);
                VAR.id = id;
            }else{
                //TODO error 
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
            // TODO aqui tienes la dir de la dir
        }
    }
    
    public static class PARAMS{
        private static LinkedList<Variable> vars = new LinkedList<>();
        
        public static void ins1(String ID){
            if(CompiAPI.isDeclared(ID)){
                //throw new Exception("Error: Variable ya declarada");
            }
            Variable var = new Variable(TYPE.lastTypeUsed);
            var.dir = CompiAPI.requestDir(var.tipo);
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
                // TODO Error procedimiento ya declarado con cantidad de parametros
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
            addCuadruplo(DATA.RET,EXP.getLastEXP(),-1,-1);
        }
    }
    
    public static class CTE{
        public static int lastConstant = -1;
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
            CompiAPI.addCuadruplo(DATA.PRNT, -1, -1, CompiAPI.EXP.getLastEXP());
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
            if(!VALIDATOR.isBoolean(EXP.getLastEXP())){
                // TODO Arrojar error de variable no booleana
                return;
            }
            addSalto(instance.cuadruplos.size());
            CompiAPI.addCuadruplo(DATA.GTF, EXP.getLastEXP(), -1, -1);// Cuadruplo que será rellenado
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
            if(!VALIDATOR.isBoolean(EXP.getLastEXP())){
                // ERROR
                return;
            }
            int aux = getSalto();
            addSalto(getNextCuadIndex());
            addSalto(aux);
            addCuadruplo(DATA.GTF,EXP.getLastEXP(),-1,-1);
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
            int dirLastExp = EXP.getLastEXP();
            if(!VALIDATOR.isBoolean(dirLastExp)){
                //TODO error tipo de dato incorrecto
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
            int dirLastExp = EXP.getLastEXP();
            if(!VALIDATOR.isBoolean(dirLastExp)){
                // TODO error de tipo de variable
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
        private static int lastDirOfDir = DATA.ERR;

        public static int getLastdirOfDir() {
            if(dimIndex != dims.size()){
                // TODO intento de acceso a una cantidad de dimencione menor
                return DATA.ERR;
            }
            return lastDirOfDir;
        }
        
        private static Variable var;
        private static Variable.Dimension actualDim;
        private static int dimIndex = 0;
        private static ArrayList<Variable.Dimension> dims; 
        private static Stack<Integer> toAcum = new Stack<>();
        
        public static void ins1(String id){ // Cuando encontramos un bracket
            if(!isDeclaredSomewhere(id)){
                // TODO arrojar error de variable no declara    da
                return;
            }
            var = getDeclaredVar(id);
            dims = var.dim;
            dimIndex = 0;
            lastDirOfDir = DATA.ERR;
        }
        public static void ins2(){// Despues de capturar una dimension
            int type = Memoria.getDataTypeAsInt(EXP.getLastEXP());
            if(type != DATA.INT && type != DATA.DBL){
                // TODO Error de tipo de dato incorrecto
                return;
            }
            if(dimIndex >= dims.size()){
                // TODO Error index out of bounds
                return;
            }
            actualDim = dims.get(dimIndex);
            dimIndex++;
            
            addCuadruplo(DATA.VRG,0,actualDim.tam,EXP.getLastEXP());
            int newTemp = CompiAPI.TEMPORAL.creaTemporal(DATA.INT); // Direccion de memoria donde se guardará la nueva temp
            int dirM = saveConstant(DATA.INT,actualDim.m+"");
            addCuadruplo(DATA.MUL,EXP.getLastEXP(),dirM,newTemp);
            toAcum.add(newTemp);
        }
        
        public static void ins3(){
            while(toAcum.size() > 1){
                int newTemp = CompiAPI.TEMPORAL.creaTemporal(DATA.INT);
                int oper1 = toAcum.pop();
                int oper2 = toAcum.pop();
                addCuadruplo(DATA.ADD,oper1,oper2,newTemp);
                toAcum.add(newTemp);
            }
            int dirVar = saveConstant(DATA.INT,var.dir+"");
            int newTemp = CompiAPI.TEMPORAL.creaTemporal(DATA.INT);
            addCuadruplo(DATA.ADD,toAcum.pop(),dirVar,newTemp);
            lastDirOfDir = newTemp;
        }
    }
    
    public static class ASIGNATION{
        public static Variable var;
        
        public static void ins1(String ID){
            if(!CompiAPI.isDeclaredSomewhere(ID)){
                // TODO error variable no declarada
                return;
            }
            var = CompiAPI.getDeclaredVar(ID);
        }
        
        public static void ins2(){
            int typeOfExp = Memoria.getDataTypeAsInt(EXP.getLastEXP());
            int validation = CompiAPI.getCubeValidation(DATA.EQS, var.tipo, typeOfExp);
            if(validation == DATA.ERR){
                //TODO error de asignacion incompatible
                return;
            }
            addCuadruplo(DATA.EQS,EXP.getLastEXP(),-1,var.dir);
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
            int typeOfExp = Memoria.getDataTypeAsInt(EXP.getLastEXP());
            int validation = CompiAPI.getCubeValidation(DATA.EQS, var.tipo, typeOfExp);
            if(validation == DATA.ERR){
                //TODO error de asignacion incompatible
                return;
            }
            int destinationDir = DIMENTIONAL.getLastdirOfDir();
            if(destinationDir == DATA.ERR){
                //TODO error de requerimientos de dimencion
                return;
            }
            addCuadruplo(DATA.TNA,EXP.getLastEXP(),-1,destinationDir);
        }
    }
    
    /** Class to control function calls */
    public static class FUNCTIONCALL{
        private static String idName;
        private static int dirTempReturn = -1;
        
        public static void ins1(String ID){
            idName  = ID;
        }
        
        public static void ins2(){
            int paramCant = PARAMSCALL.size();
            if(!instance.procs.has(FUNCTIONCALL.idName, paramCant)){
                // TODO Error funcion con tal cantidad de parametros no existe
                //throw new Exception("Funcion " + FUNCTIONCALL.idName + "/"+paramCant +" no ha sido declarada");
            }
            Procedure procedure = instance.procs.getProc(idName, paramCant);
            ArrayList<String> keys = procedure.varKeys;
            
            dirTempReturn = CompiAPI.TEMPORAL.creaTemporal(procedure.type);
            addCuadruplo(DATA.RTVAL,-1,-1,dirTempReturn);
            addCuadruplo(DATA.PC,-1,-1,-1);
            for(String key : keys){
                addCuadruplo(DATA.PARAM,PARAMSCALL.pop(),-1,procedure.getDirOfVar(key));
            }
            addCuadruplo(DATA.CC,-1,-1,procedure.dirCuadruplo);
            
        }
    }
    /** Class to control params variables */
    public static class PARAMSCALL{
        private static LinkedList<Integer> exps = new LinkedList<>();
        public static void ins1(){
            exps.add(EXP.getLastEXP());
        }
        
        public static int size(){
            return exps.size();
        }
        
        public static int pop(){
            return exps.pop();
        }
    }
}
