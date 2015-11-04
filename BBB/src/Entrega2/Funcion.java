package Entrega2;

import java.util.ArrayList;

public class Funcion{
    private String nombre;              // Nombre de la variable
    private int tipo;                   // Tipo de retorno (prototipo)
    private int dir;                    // Direccion del cuadruplo donde comienza
    private int cantParams;             // Cantidad de parametros para matchear
    private Variables params;           // Controlador de variables que recibe el parametro
    
    public Funcion(String nombre, int tipo, int dir){
        this.nombre = nombre;
        this.tipo = tipo;
        this.dir = dir;
        this.params = new Variables();
        cantParams = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public int getDir() {
        return dir;
    }

    public int getCantParams() {
        return cantParams;
    }

    public Variables getParams() {
        return params;
    }
    
    // Funcion que agrega una variable de parametro
    public boolean addParam(Variable var){
        return params.add(var);
    }
}
