
package Entrega2;

import java.util.ArrayList;
import java.util.HashMap;

public class Variables {
    private HashMap<String,Variable> variables;
    
    public Variables(){
        variables = new HashMap<>();
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
    
}
