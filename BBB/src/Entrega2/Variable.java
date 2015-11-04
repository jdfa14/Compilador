package Entrega2;

import java.util.ArrayList;

public class Variable {
    public String nombre;
        public int tipo;
        public int dir;
        public int m0;
        public boolean tieneDim;
        public ArrayList<Dimension> dim;
        
        public Variable(String nombre, int tipo, int dir){
            this.nombre = nombre;
            this.tipo = tipo;
            this.dir = dir;
            this.tieneDim = false;
            this.dim = null;
            this.m0 = 1;
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
        
        private class Dimension{
            public int tam;
            public int m;

            public Dimension(int t, int m){
                this.tam = t;
                this.m = m;        
            }
        }
}
