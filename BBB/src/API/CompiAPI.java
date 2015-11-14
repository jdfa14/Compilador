/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import Entrega2.ManejadorDeMemoria;
import Entrega2.Memoria;
import Entrega2.Variable;
import Entrega2.Variables;
import Entrega3.DATA;
import Entrega4.Cuadruplo;
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
    
    private Stack<Integer> saltos;
    private int main = -1;
    
    private Variables globalV;      // Variables globales
    private Variables localV;       // Variables locales
    private Variable newVar;
    
    private boolean localThread = false;        // Bandera para diferenciar contexto Global o Local
    private boolean declarating = false;        // Bandera para definir estado de declaracion de variable (Quizas no se necesite)
    
    private int dirExpResult = -1;               // Direccion de la variable del resultado de la ultima expresion resuelta;
    
    public CompiAPI(){
        memoryManager = new ManejadorDeMemoria();
        cuadruplos = new LinkedList<>();
        saltos = new Stack<>();
        globalV = new Variables();
        localV = new Variables();
    }
    
    public void startLocalThread(){
        instance.localV.wipe();     // Cada que empezamos un nuevo contexto local borrar memoria
        localThread = true;         // Encender bandera
    }
    
    public void stopLocalThread(){
        localThread = false;
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
    
    public static void reserveDirs(int type, int cant){
       switch(type){
            case DATA.INT:
                if(instance.localThread){
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.INT,cant);
                }else{
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.INT,cant);
                }
            case DATA.DBL:
                if(instance.localThread){
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.FLOAT,cant);
                }else{
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.FLOAT,cant);
                }
            case DATA.STR:
                if(instance.localThread){
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.STRING,cant);
                }else{
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.STRING,cant);
                }
            case DATA.BOL:
                if(instance.localThread){
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.BOOLEAN,cant);
                }else{
                    instance.memoryManager.gapDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.BOOLEAN,cant);
                }
        }
    }
    
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
    
    public static class INIT{
        public static void ins1(){
            addSalto(instance.cuadruplos.size());
            addCuadruplo(DATA.GOT,-1,-1,-1);
        }
        
        public static void ins2(){
            addCuadruplo(DATA.EOF,-1,-1,-1);
            refillSalto(getSalto(),instance.cuadruplos.size());
            instance.constantes.stream().forEach((Cuadruplo cuad) -> {
                addCuadruplo(cuad);
            });
            if(instance.main == -1){
                //TODO ERROR
            }
            addCuadruplo(DATA.GOT,-1,-1,instance.main);
        }
    }
    
    public static class DECL{
        private static int type;
        private static Variable var;
        private static boolean asignation;
        
        public static void ins1(int type){  // Instrucion de declaracion de tipo
            DECL.type = type;
            
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
        
        public static void ins4(){
            if(DECL.asignation){
                addCuadruplo(DATA.DECL,instance.dirExpResult,-1,var.dir);
            }else{
                addCuadruplo(DATA.DECL,-1,-1,var.dir);
            }
            if(DECL.var.tieneDim){
                addCuadruplo(DATA.GAP,var.dir,-1,var.m0 - 1);
            }
        }
        
        public static void ins5(int dim){
            DECL.var.agregaDim(dim);
        }
        
        public static void ins6(){
            DECL.var.setMS();
            reserveDirs(type, DECL.var.m0 - 1);
        }
    }

    // Variable Stuff
    // Validamos su nombre
    
}
