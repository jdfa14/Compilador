
package Entrega2;

import API.VarType;
import java.util.ArrayList;
import java.util.HashMap;

public class Variables {
    private HashMap<String,Variable> variables;
    
    public Variables(){
        variables = new HashMap<>();
    }
    
    public void wipe(){
        variables.clear();
    }
    
    public boolean has(String key){
        return variables.containsKey(key);
    }
    
    public boolean add(Variable var){
        if(!variables.containsKey(var.nombre)){
            variables.put(var.nombre, var);
            return true;
        }
        return false;
    }
    
    public boolean isDeclared(String name){
        return variables.containsKey(name);
    }
    
    public VarType getDir(String name){
        return variables.get(name).varDir;
    }
    
    public int getDataType(String name){
        return variables.get(name).tipo;
    }
    
    public Variable getVar(String name){
        return variables.get(name);
    }
    
    public int size(){
        return variables.size();
    }
}
