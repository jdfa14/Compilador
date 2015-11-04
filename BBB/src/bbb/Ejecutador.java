/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbb;
import java.util.*;
import java.io.*;
import java.lang.*;
import Entrega4.*;
import Entrega3.*;
import Entrega2.*;
/**
 *
 * @author taniagarridosalido
 */
public class Ejecutador {
    
    public static void main(String[] args) throws IOException {
        MemoriaVirual mv = new MemoriaVirual();
        ArrayList<Cuadruplo> cuadruplos = new ArrayList<>();
             
        String fileName = "/Users/taniagarridosalido/Dropbox/ITESM-ITC Noveno Semestre/Análisis y Diseño de Compiladores/Compilador/BBB/src/cuadruplos.txt";
        String line = null;
        
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                        
            while((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split("\\s+");
                cuadruplos.add(new Cuadruplo(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), Integer.parseInt(lineArray[2]), Integer.parseInt(lineArray[3])));
            }   
            
            for (int i = 0; i < cuadruplos.size(); i++) {
                System.out.println(cuadruplos.get(i).getOperador() + " " + cuadruplos.get(i).getOperando1() + " " + cuadruplos.get(i).getOperando2() + " " + cuadruplos.get(i).getResultado());
                Cuadruplo cuad = cuadruplos.get(i);
                
                switch(cuadruplos.get(i).getOperador()){
                    case DATA.ADD:
                        //mv.saveVar(cuad.getResultado(), mv.getVar(cuad.getOperando1()) + mv.getVar(cuad.getOperando2()));
                        
                }          
            }
            
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }
    }

}
