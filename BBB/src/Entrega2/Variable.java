package Entrega2;

import API.VarType;
import java.util.ArrayList;

public class Variable {
    public String nombre;           // Nombre de la variable
    public int tipo;                // Tipo de variable (INT STRING BOOLEAN FLOAT)
    public VarType varDir;
    //public int dir;                 // Direccion de la variable
    public int m0;                  // Dimension de la variable
    public boolean tieneDim;        // Bandera para saber si es multidimencional
    public ArrayList<Dimension> dim;// Arreglo con los datos de sus dimenciones
    
    public Variable(String nombre,int tipo,VarType varDir){
        this.nombre = nombre;
        this.tipo = tipo;
        this.varDir = varDir;
        this.tieneDim = false;
        this.dim = null;
        this.m0 = 1;
    }
    
    public Variable(int tipo){
        this.nombre = "";
        this.tipo = tipo;
        this.varDir = null;
        this.tieneDim = false;
        this.dim = null;
        this.m0 = 1;
    }
    
    public Variable(Variable original){
        this.nombre = original.nombre;
        this.tipo = original.tipo;
        this.varDir = original.varDir;
        this.tieneDim = original.tieneDim;
        this.dim = (ArrayList<Dimension>) original.dim.clone();
        this.m0 = original.m0;
    }
    
    /* Prototipo
    public Variable(String nombre, int tipo, int dir, ArrayList<Dimension> dim){
        this.nombre = nombre;
        this.tipo = tipo;
        this.dir = dir;
        this.tieneDim = true;
        this.dim = dim;
    }
    */
    // No necesaria si se agrega constructor anterior
    public void agregaDim(int newDim){
        if(!tieneDim){
            tieneDim = true;
            dim = new ArrayList<>();
        }
        m0 *= newDim;
        this.dim.add(new Dimension(newDim,1));
    }

    public void setMS(){
        int auxDim = m0;
        for(Dimension od : this.dim){
            od.m = auxDim/od.tam;
            auxDim = od.m;
        }
    }

    public class Dimension{
        public int tam;
        public int m;

        public Dimension(int t, int m){
            this.tam = t;
            this.m = m;        
        }
    }
}
