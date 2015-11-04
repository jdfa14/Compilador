package Entrega2;

import java.util.ArrayList;
import java.util.HashMap;

public class Funciones {
    private HashMap<String,Funcion> funciones;
    
    public Funciones(){
        funciones = new HashMap<>();
    }
    
    public boolean add(Funcion var){
        if(!funciones.containsKey(var.getNombre())){
            funciones.put(var.getNombre(), var);
            return true;
        }
        return false;
    }
    
    public boolean isDeclared(String name){
        return funciones.containsKey(name);
    }
}
