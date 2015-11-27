package API;

import org.antlr.v4.runtime.Parser;

/**
 *
 * @author JesusDavid
 */
public class ErrorsHandler {
    
    public static enum ERROR{
        GENERAL,
        OVERFLOW,
        CANNOT_CREATE_VAR,
        MEMORY_CAP_REACHED,
        WRONG_DATA_TYPE,
        WRONG_MEMORY_ACCESS,
        UNDECLARED_VARIABLE,
        ALREADY_DECLARED,
        INVALID_OPERATION,
        INVALID_DIMENTION,
        INDEX_OUT_OF_BOUNDS
    }
    
    public static void SPAWN_ERROR(ERROR type){
        SPAWN_ERROR(type,"");
    }
    
    public static void SPAWN_ERROR(ERROR type, String message){
        try{
            switch(type){
                case GENERAL:
                    throw new Exception(message);
                case OVERFLOW:
                    throw new Exception("OVERFLOW: Direccion ilegal!");
                case WRONG_DATA_TYPE:
                    throw new Exception("WRONG_DATA_TYPE: Tipo de variable esperado incorrecto");
                case WRONG_MEMORY_ACCESS:
                    throw new Exception("WRONG_MEMORY_ACCESS: Acceso a memoria de manera equivocada");
                case INVALID_OPERATION:
                    throw new Exception("INVALID_OPERATION: Operacion invalida entre variables");
                case INVALID_DIMENTION:
                    throw new Exception("INVALID_DIMENTION: La variable " + message + " no tiene dimension a tratar");
                case INDEX_OUT_OF_BOUNDS:
                    throw new Exception("INDEX_OUT_OF_BOUNDS: El index " + message + " se encuentra fuera de rango de la variable");
                case CANNOT_CREATE_VAR:
                    throw new Exception("CANNOT_CREATE_VAR: No se pudo declarar la variable: " +  message);
                case MEMORY_CAP_REACHED:
                    throw new Exception("MEMORY_CAP_REACHED: Se alcanzo el limite de la memoria de tipo: " + message);
                case UNDECLARED_VARIABLE:
                    throw new Exception("UNDECLARED_VARIABLE: Variable no declarada: " + message);
                case ALREADY_DECLARED:
                    throw new Exception("ALREADY_DECLARED: Variable ya declarada: " + message);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
