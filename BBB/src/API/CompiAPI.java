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
    private Stack<Integer> saltos;
    
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
    
    // Variable Stuff
    
    // Comenzamos la creacion de una variable
    public static void var1SetVariableType(int type){
        instance.newVar = new Variable(type);
    }
    
    public static void var2SetVariableName(String name){
        instance.newVar.nombre = name;
        
        if(instance.localThread){
            if(instance.localV.has(name)){
               //TODO ERROR aqui
                return;
            }
            switch(instance.newVar.tipo){
                case DATA.INT:
                    instance.newVar.dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.INT);
                    break;
                case DATA.BOL:
                    instance.newVar.dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.BOOLEAN);
                    break;
                case DATA.DBL:
                    instance.newVar.dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.FLOAT);
                    break;
                case DATA.STR:
                    instance.newVar.dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.STRING);
                    break;
            }
            instance.localV.add(instance.newVar);
        }else{
            if(instance.globalV.has(name)){
               //TODO ERROR aqui
                return;
            }
            switch(instance.newVar.tipo){
                case DATA.INT:
                    instance.newVar.dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.INT);
                    break;
                case DATA.BOL:
                    instance.newVar.dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.BOOLEAN);
                    break;
                case DATA.DBL:
                    instance.newVar.dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.FLOAT);
                    break;
                case DATA.STR:
                    instance.newVar.dir = instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.STRING);
                    break;
            }
            instance.globalV.add(instance.newVar);
        }
    }
    
    public static void var3addAssignation(int dim){
        instance.addCuadruplo(new Cuadruplo(DATA.EQS,instance.dirExpResult,-1,instance.newVar.dir));
    }
    
    public static void var4SetVariableMs(){
        instance.newVar.setMS();
    }
    
    public static void var5SetVariableOnMemory(){
        switch(instance.newVar.tipo){
            case DATA.INT:
                instance.newVar.dir = instance.localThread ? 
                        instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.INT):
                        instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.INT);
                break;
            case DATA.BOL:
                instance.newVar.dir = instance.localThread ? 
                        instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.BOOLEAN):
                        instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.BOOLEAN);
                break;
            case DATA.DBL:
                instance.newVar.dir = instance.localThread ? 
                        instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.FLOAT):
                        instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.FLOAT);
                break;
            case DATA.STR:
                instance.newVar.dir = instance.localThread ? 
                        instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.LOCAL, Memoria.DATA_TYPE.STRING):
                        instance.memoryManager.crearDir(Memoria.SCOPE_TYPE.GLOBAL, Memoria.DATA_TYPE.STRING);
                break;
        }
        if(instance.localThread){
            instance.localV.add(new Variable(instance.newVar));
        }else{
            instance.globalV.add(new Variable(instance.newVar));
        }
    }
    // Validamos su nombre
    
}
