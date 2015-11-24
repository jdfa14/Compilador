/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega4;

import Entrega2.Variable;
import Entrega2.Variables;
import Entrega3.DATA;

/**
 *
 * @author JesusDavid
 */
public class Procedure {
    /** Name of procedure */
    public String procID;
    /** Set of variables declared for the procedure */
    public Variables vars = new Variables();
    /** Number of quadruple where the procedure start */
    public int dirCuadruplo;
    /** type of data return */
    public int type = DATA.VOID;
    
    /** Constructor with name of proc
     * @param procID Name of the procedure */
    public Procedure(String procID, int type){
        this.procID = procID;
        this.type = type;
    }
    
    /** This adds and validates the addition of a new Parameter Variable
     * @param var Object of variable
     * @return true if successfully added, false if the ID was already declared*/
    public boolean addVar(Variable var){
        if(vars.has(var.nombre)){
            // TODO error de variable doble declarada en funcion
            return false;
        }
        vars.add(var);
        return true;
    }
    /**
     * 
     * @return Number of elements of variables
     */
    public int getVarCant(){
        return vars.size();
    }
}
