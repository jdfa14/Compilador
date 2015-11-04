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
        MemoriaVirtual mv = new MemoriaVirtual();
        ArrayList<Cuadruplo> cuadruplos = new ArrayList<>();
             
        String fileName = "/Users/taniagarridosalido/Dropbox/ITESM-ITC Noveno Semestre/Análisis y Diseño de Compiladores/Compilador/BBB/src/cuadruplos.txt";
        String line = null;
        
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                        
            while((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split("\\s+");
                cuadruplos.add(new Cuadruplo(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), Integer.parseInt(lineArray[2]), Integer.parseInt(lineArray[3])));
            }   
            int i = 0;
            while (true) {
                System.out.println(cuadruplos.get(i).getOperador() + " " + cuadruplos.get(i).getOperando1() + " " + cuadruplos.get(i).getOperando2() + " " + cuadruplos.get(i).getResultado());
                Cuadruplo cuad = cuadruplos.get(i);
                Memoria.DATA_TYPE t1;
                Memoria.DATA_TYPE t2;
                
                if (cuad.getOperador() == DATA.EOF)
                    break;
                switch(cuadruplos.get(i).getOperador()){
                    case DATA.ADD:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) + mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) + mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) + mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) + mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.SUB:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) - mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) - mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) - mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) - mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.DIV:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) / mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) / mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) / mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) / mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.MUL:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) * mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) * mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) * mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) * mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.MOD:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) % mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) % mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) % mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) % mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.AND:
                        mv.saveVar(cuad.getResultado(), mv.getBoolean(cuad.getOperando1()) && mv.getBoolean(cuad.getOperando2()));
                        break;
                    case DATA.OOR:
                        mv.saveVar(cuad.getResultado(), mv.getBoolean(cuad.getOperando1()) || mv.getBoolean(cuad.getOperando2()));
                        break;
                    case DATA.OLT:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) < mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) < mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) < mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) < mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.OGT:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) > mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) > mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) > mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) > mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.EQT:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) == mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) == mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) == mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) == mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.DIF:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) != mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) != mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) != mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) != mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.GOE:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) >= mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) >= mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) >= mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) >= mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.LOE:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                        
                        if (t1 == Memoria.DATA_TYPE.INT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                               mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) <= mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()) <= mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        else if (t1 == Memoria.DATA_TYPE.FLOAT){
                            if (t2 == Memoria.DATA_TYPE.INT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) <= mv.getInt(cuad.getOperando2()));
                            }
                            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()) <= mv.getFloat(cuad.getOperando2()));
                            }
                        }
                        break;
                    case DATA.EQS:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        
                        if (t1 == Memoria.DATA_TYPE.INT)
                            mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()));
                        else if (t1 == Memoria.DATA_TYPE.FLOAT)
                            mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()));
                        else if (t1 == Memoria.DATA_TYPE.STRING)
                            mv.saveVar(cuad.getResultado(), mv.getString(cuad.getOperando1()));
                        else if (t1 == Memoria.DATA_TYPE.BOOLEAN)
                            mv.saveVar(cuad.getResultado(), mv.getBoolean(cuad.getOperando1()));
                        break;
                    case DATA.GOT:
                        i = mv.getInt(cuad.getResultado()) - 1;
                        break;
                    case DATA.GTF:
                        if (!mv.getBoolean(cuad.getOperando1()))
                            i = mv.getInt(cuad.getResultado()) - 1;
                        break;
                    case DATA.GTT:
                        if (mv.getBoolean(cuad.getOperando1()))
                            i = mv.getInt(cuad.getResultado()) - 1;
                        break;
                    case DATA.ACTE:
                        mv.saveVar(cuad.getResultado(), cuad.getOperando1());
                        break;
                }
            i++;    
            }
            System.out.println(mv.getBoolean(18000));
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
