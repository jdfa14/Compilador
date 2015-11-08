 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega3;

import java.util.LinkedList;
import java.util.Stack;

public class AritmeticaParser {
    
    private LinkedList<Integer> fila;
    private Stack<Integer> poper;
    
    public AritmeticaParser(){
        fila = new LinkedList<>();
        poper = new Stack<>();
    }
    
    public void addID(int ID){// Add ID
        fila.add(ID);
    }
    
    public void addOpP1(int OPER){
        
    }
    
}
