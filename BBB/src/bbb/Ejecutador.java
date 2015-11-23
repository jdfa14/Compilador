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
        
        Game game = new Game();
        game.play();
   
        String fileName = "/Users/taniagarridosalido/Dropbox/ITESM-ITC Noveno Semestre/Análisis y Diseño de Compiladores/Compilador/BBB/src/cuadruplos.txt";
        String line = null;
        Stack <Integer> pila;
        pila = new Stack<>();
        
        
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                        
            while((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split("\\s+");
                cuadruplos.add(new Cuadruplo(Long.parseLong(lineArray[0]), Long.parseLong(lineArray[1]), Long.parseLong(lineArray[2]), (int) Long.parseLong(lineArray[3])));
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
                        else if ( t1 == Memoria.DATA_TYPE.STRING && t2 == Memoria.DATA_TYPE.STRING){
                            mv.saveVar(cuad.getResultado(), mv.getString(cuad.getOperando1()) + mv.getString(cuad.getOperando2()));
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
                        i = cuad.getResultado() - 1;
                        break;
                    case DATA.GTF:
                        if (!mv.getBoolean(cuad.getOperando1()))
                            i = cuad.getResultado() - 1;
                        break;
                    case DATA.GTT:
                        if (mv.getBoolean(cuad.getOperando1()))
                            i = cuad.getResultado() - 1;
                        break;
                    case DATA.ACTE:
                        t1 = Memoria.getDataType(cuad.getResultado());
                        
                        if (t1 == Memoria.DATA_TYPE.FLOAT)
                            mv.saveVar(cuad.getResultado(), cuad.getLongOperando1());
                        else
                            mv.saveVar(cuad.getResultado(), cuad.getOperando1());
                        break;
                    case DATA.PC:
                        mv.prepararCambio();
                        break;
                    case DATA.CC:
                        mv.cambiarContexto();
                        pila.push(i+1);
                        break;
                    case DATA.TC:
                        mv.terminarCambio();
                        break;
                    case DATA.RET:
                        
                        if (cuad.getOperando1() == -1 ){
                            mv.terminarCambio();
                            i = pila.pop();
                        }
                        else{
                            Object value = 0;

                            t1 = Memoria.getDataType(cuad.getOperando1());

                            if (t1 == Memoria.DATA_TYPE.INT)
                                value = mv.getInt(cuad.getOperando1());
                            else if (t1 == Memoria.DATA_TYPE.FLOAT)
                                value = mv.getFloat(cuad.getOperando1());
                            else if (t1 == Memoria.DATA_TYPE.STRING)
                                value = mv.getString(cuad.getOperando1());
                            else if (t1 == Memoria.DATA_TYPE.BOOLEAN)
                                value = mv.getBoolean(cuad.getOperando1());

                            mv.terminarCambio();
                            mv.saveVar(cuad.getResultado(),value);
                            i = pila.pop();
                        }
                        break;
                    case DATA.PARAM:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        
                        if (t1 == Memoria.DATA_TYPE.INT)
                            mv.saveParam(cuad.getResultado(), mv.getInt(cuad.getOperando1()));
                        else if (t1 == Memoria.DATA_TYPE.FLOAT)
                            mv.saveParam(cuad.getResultado(), mv.getFloat(cuad.getOperando1()));
                        else if (t1 == Memoria.DATA_TYPE.STRING)
                            mv.saveParam(cuad.getResultado(), mv.getString(cuad.getOperando1()));
                        else if (t1 == Memoria.DATA_TYPE.BOOLEAN)
                            mv.saveParam(cuad.getResultado(), mv.getBoolean(cuad.getOperando1()));
                        
                        break;
                    case DATA.DECL:
                        if ( cuad.getOperando1() == -1 ){
                            mv.saveVar(cuad.getResultado(), null);
                        }
                        else{
                            t1 = Memoria.getDataType(cuad.getOperando1());

                            if (t1 == Memoria.DATA_TYPE.INT)
                                mv.saveVar(cuad.getResultado(), mv.getInt(cuad.getOperando1()));
                            else if (t1 == Memoria.DATA_TYPE.FLOAT)
                                mv.saveVar(cuad.getResultado(), mv.getFloat(cuad.getOperando1()));
                            else if (t1 == Memoria.DATA_TYPE.STRING)
                                mv.saveVar(cuad.getResultado(), mv.getString(cuad.getOperando1()));
                            else if (t1 == Memoria.DATA_TYPE.BOOLEAN)
                                mv.saveVar(cuad.getResultado(), mv.getBoolean(cuad.getOperando1()));
                        }
                        break;
                    case DATA.STR1:
                        mv.str1(cuad.getOperando1(), cuad.getResultado());
                        break;
                    case DATA.STR2:
                        mv.str2(cuad.getOperando1(), cuad.getResultado());
                        break;
                    case DATA.PRNT:
                        t1 = Memoria.getDataType(cuad.getResultado());

                        if (t1 == Memoria.DATA_TYPE.INT)
                            System.out.print(mv.getInt(cuad.getResultado()));
                        else if (t1 == Memoria.DATA_TYPE.FLOAT)
                            System.out.print(mv.getFloat(cuad.getResultado()));
                        else if (t1 == Memoria.DATA_TYPE.STRING)
                            System.out.print(mv.getInt(cuad.getResultado()));
                        else if (t1 == Memoria.DATA_TYPE.BOOLEAN)
                            System.out.print(mv.getBoolean(cuad.getResultado()));

                        break;
                    case DATA.PNTL:
                        System.out.println(mv.getString(cuad.getResultado()));
                        break;
                    case DATA.GAP:
                        int memoria = cuad.getOperando1();
                        for (int j = cuad.getResultado(); j > 0 ; j--,memoria++){
                            mv.saveVar(memoria, null);
                        }
                        break;
                    case DATA.PIN:
                        if(cuad.getResultado() == 1)
                            game.pinUp();
                        else
                            game.pinDown();
                        break;
                    case DATA.MVE:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                        t2 = Memoria.getDataType(cuad.getOperando2());
                            
                            if (t1 == Memoria.DATA_TYPE.INT && t2 == Memoria.DATA_TYPE.INT)
                                game.move((float)mv.getInt(cuad.getOperando1()), (float)mv.getInt(cuad.getOperando2()));
                            else if (t1 == Memoria.DATA_TYPE.FLOAT && t2 == Memoria.DATA_TYPE.FLOAT)
                                game.move((float)mv.getFloat(cuad.getOperando1()),(float)mv.getFloat(cuad.getOperando2()));
                        break;
                    case DATA.COL:
                        t1 = Memoria.getDataType(cuad.getOperando1());
                            
                            if (t1 == Memoria.DATA_TYPE.INT)
                                game.changeColor(cuad.getResultado(), (float)mv.getInt(cuad.getOperando1()));
                            else if (t1 == Memoria.DATA_TYPE.FLOAT)
                                game.changeColor(cuad.getResultado(),(float)mv.getFloat(cuad.getOperando1()));
                        
                        break;
                }
            i++;    
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
