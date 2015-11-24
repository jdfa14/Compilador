/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega4;

import Entrega3.DATA;
import java.util.HashMap;

/**
 *
 * @author JesusDavid
 */
public class Procedures {
    /** Set of declared procedures with String as Key and Procedure as value */
    private HashMap<String,Procedure> procs;
    
    /**
     * Default constructor
     */
    public Procedures(){
        procs = new HashMap<>();
    }
    /**
     * 
     * @param ID Name of the procedure
     * @param cant Quantity of variables
     * @return Constructed ID for the Hashmap
     */
    private String buildKey(String ID, int cant){
        return ID + "/" + cant;
    }
    
    /**
     * 
     * @param ID Name of the procedure
     * @param cant Quantity of variables
     * @return True if has such ID with cant variables, else otherwise
     */
    public boolean has(String ID, int cant){
        return procs.containsKey(buildKey(ID,cant));
    }
    
    /**
     * 
     * @param proc Procedure object to be checked
     * @return True if has such ID with cant variables, otherwise false
     */
    public boolean has(Procedure proc){
        return has(proc.procID,proc.getVarCant());
    }
    
    /**
     * 
     * @param proc Procedure Object to be added
     * @return True if succesfully added without errors, otherwise false
     */
    public boolean add(Procedure proc){
        if(has(proc)){
            return false;
        }
        procs.put(buildKey(proc.procID,proc.getVarCant()), proc);
        return true;
    }
    
    /**
     * 
     * @param ID Name of the procedure
     * @param cant Quantity of variables
     * @return An integer with the direction of the current ID
     */
    public int getDirOfProc(String ID, int cant){
        if(!has(ID,cant)){
            //TODO ERROR Procedimiento no declarado
            return DATA.ERR;
        }
        return procs.get(buildKey(ID,cant)).dirCuadruplo;
    }
}
