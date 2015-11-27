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
    public static MemoriaVirtual mv = new MemoriaVirtual();
    
    public static void add(int dir1, int dir2, int resultDir){
        Memoria.DATA_TYPE t1 = Memoria.getDataType(dir1);
        Memoria.DATA_TYPE t2 = Memoria.getDataType(dir2);

        if (t1 == Memoria.DATA_TYPE.INT){
            if (t2 == Memoria.DATA_TYPE.INT){
               mv.saveVar(resultDir, mv.getInt(dir1) + mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getInt(dir1) + mv.getFloat(dir2));
            }
        }
        else if (t1 == Memoria.DATA_TYPE.FLOAT){
            if (t2 == Memoria.DATA_TYPE.INT){
                mv.saveVar(resultDir, mv.getFloat(dir1) + mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getFloat(dir1) + mv.getFloat(dir2));
            }
        }
        else if ( t1 == Memoria.DATA_TYPE.STRING && t2 == Memoria.DATA_TYPE.STRING){
            mv.saveVar(resultDir, mv.getString(dir1) + mv.getString(dir2));
        }
    }
    
    public static void sub(int dir1, int dir2, int resultDir){
        Memoria.DATA_TYPE t1 = Memoria.getDataType(dir1);
        Memoria.DATA_TYPE t2 = Memoria.getDataType(dir2);

        if (t1 == Memoria.DATA_TYPE.INT){
            if (t2 == Memoria.DATA_TYPE.INT){
               mv.saveVar(resultDir, mv.getInt(dir1) - mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getInt(dir1) - mv.getFloat(dir2));
            }
        }
        else if (t1 == Memoria.DATA_TYPE.FLOAT){
            if (t2 == Memoria.DATA_TYPE.INT){
                mv.saveVar(resultDir, mv.getFloat(dir1) - mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getFloat(dir1) - mv.getFloat(dir2));
            }
        }
    }
    
    public static void div(int dir1, int dir2, int resultDir){
        Memoria.DATA_TYPE t1 = Memoria.getDataType(dir1);
        Memoria.DATA_TYPE t2 = Memoria.getDataType(dir2);

        if (t1 == Memoria.DATA_TYPE.INT){
            if (t2 == Memoria.DATA_TYPE.INT){
               mv.saveVar(resultDir, mv.getInt(dir1) / mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getInt(dir1) / mv.getFloat(dir2));
            }
        }
        else if (t1 == Memoria.DATA_TYPE.FLOAT){
            if (t2 == Memoria.DATA_TYPE.INT){
                mv.saveVar(resultDir, mv.getFloat(dir1) / mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getFloat(dir1) / mv.getFloat(dir2));
            }
        }
    }
    
    public static void mul(int dir1, int dir2, int resultDir){
        Memoria.DATA_TYPE t1 = Memoria.getDataType(dir1);
        Memoria.DATA_TYPE t2 = Memoria.getDataType(dir2);

        if (t1 == Memoria.DATA_TYPE.INT){
            if (t2 == Memoria.DATA_TYPE.INT){
               mv.saveVar(resultDir, mv.getInt(dir1) * mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getInt(dir1) * mv.getFloat(dir2));
            }
        }
        else if (t1 == Memoria.DATA_TYPE.FLOAT){
            if (t2 == Memoria.DATA_TYPE.INT){
                mv.saveVar(resultDir, mv.getFloat(dir1) * mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getFloat(dir1) * mv.getFloat(dir2));
            }
        }
    }
    
    public static void mod(int dir1, int dir2, int resultDir){
        Memoria.DATA_TYPE t1 = Memoria.getDataType(dir1);
        Memoria.DATA_TYPE t2 = Memoria.getDataType(dir2);

        if (t1 == Memoria.DATA_TYPE.INT){
            if (t2 == Memoria.DATA_TYPE.INT){
               mv.saveVar(resultDir, mv.getInt(dir1) % mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getInt(dir1) % mv.getFloat(dir2));
            }
        }
        else if (t1 == Memoria.DATA_TYPE.FLOAT){
            if (t2 == Memoria.DATA_TYPE.INT){
                mv.saveVar(resultDir, mv.getFloat(dir1) % mv.getInt(dir2));
            }
            else if (t2 == Memoria.DATA_TYPE.FLOAT){
                mv.saveVar(resultDir, mv.getFloat(dir1) % mv.getFloat(dir2));
            }
        }
    }
    
    public static void eqs(int dir1, int res1){
        Memoria.DATA_TYPE t1 = Memoria.getDataType(dir1);
                        
        if (t1 == Memoria.DATA_TYPE.INT)
            mv.saveVar(res1, mv.getInt(dir1));
        else if (t1 == Memoria.DATA_TYPE.FLOAT)
            mv.saveVar(res1, mv.getFloat(dir1));
        else if (t1 == Memoria.DATA_TYPE.STRING)
            mv.saveVar(res1, mv.getString(dir1));
        else if (t1 == Memoria.DATA_TYPE.BOOLEAN)
            mv.saveVar(res1, mv.getBoolean(dir1));
    }
    
    public static void prnt(int res1){
        Memoria.DATA_TYPE t1 = Memoria.getDataType(res1);

        if (t1 == Memoria.DATA_TYPE.INT)
            System.out.println(mv.getInt(res1));
        else if (t1 == Memoria.DATA_TYPE.FLOAT)
            System.out.println(mv.getFloat(res1));
        else if (t1 == Memoria.DATA_TYPE.STRING)
            System.out.println(mv.getString(res1));
        else if (t1 == Memoria.DATA_TYPE.BOOLEAN)
            System.out.println(mv.getBoolean(res1));
    }
    
    public static void main(String[] args) throws IOException {
        
        ArrayList<Cuadruplo> cuadruplos = new ArrayList<>();
        
        Game game = new Game();
        game.play();
   
        String fileName = "../BBB/src/cuadruplos.txt";
        String line = null;
        Stack <Integer> pila;
        pila = new Stack<>();
        Stack <Integer> pilaTemp;
        pilaTemp = new Stack<>();
        
        
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
                int dir1;
                int dir2;
                int dirR;
                
                if (cuad.getOperador() == DATA.EOF)
                    break;
                switch(cuadruplos.get(i).getOperador()){
                    case DATA.ADD:
                        add(cuad.getOperando1(),cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.ADD1:
                        dir1 = mv.getInt(cuad.getOperando1());
                        add(dir1,cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.ADD2:
                        dir2 = mv.getInt(cuad.getOperando2());
                        add(cuad.getOperando1(),dir2,cuad.getResultado());
                        break;
                    case DATA.ADD3:
                        dir1 = mv.getInt(cuad.getOperando1());
                        dir2 = mv.getInt(cuad.getOperando2());
                        add(dir1,dir2,cuad.getResultado());
                        break;
                        
                    case DATA.SUB:
                        sub(cuad.getOperando1(),cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.SUB1:
                        dir1 = mv.getInt(cuad.getOperando1());
                        sub(dir1,cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.SUB2:
                        dir2 = mv.getInt(cuad.getOperando2());
                        sub(cuad.getOperando1(),dir2,cuad.getResultado());
                        break;
                    case DATA.SUB3:
                        dir1 = mv.getInt(cuad.getOperando1());
                        dir2 = mv.getInt(cuad.getOperando2());
                        sub(dir1,dir2,cuad.getResultado());
                        break;
                        
                    case DATA.DIV:
                        div(cuad.getOperando1(),cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.DIV1:
                        dir1 = mv.getInt(cuad.getOperando1());
                        div(dir1,cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.DIV2:
                        dir2 = mv.getInt(cuad.getOperando2());
                        div(cuad.getOperando1(),dir2,cuad.getResultado());
                        break;
                    case DATA.DIV3:
                        dir1 = mv.getInt(cuad.getOperando1());
                        dir2 = mv.getInt(cuad.getOperando2());
                        div(dir1,dir2,cuad.getResultado());
                        break;
                        
                    case DATA.MUL:
                        mul(cuad.getOperando1(),cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.MUL1:
                        dir1 = mv.getInt(cuad.getOperando1());
                        mul(dir1,cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.MUL2:
                        dir2 = mv.getInt(cuad.getOperando2());
                        mul(cuad.getOperando1(),dir2,cuad.getResultado());
                        break;
                    case DATA.MUL3:
                        dir1 = mv.getInt(cuad.getOperando1());
                        dir2 = mv.getInt(cuad.getOperando2());
                        mul(dir1,dir2,cuad.getResultado());
                        break;
                    case DATA.MOD:
                        mod(cuad.getOperando1(),cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.MOD1:
                        dir1 = mv.getInt(cuad.getOperando1());
                        mod(dir1,cuad.getOperando2(),cuad.getResultado());
                        break;
                    case DATA.MOD2:
                        dir2 = mv.getInt(cuad.getOperando2());
                        mod(cuad.getOperando1(),dir2,cuad.getResultado());
                        break;
                    case DATA.MOD3:
                        dir1 = mv.getInt(cuad.getOperando1());
                        dir2 = mv.getInt(cuad.getOperando2());
                        mod(dir1,dir2,cuad.getResultado());
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
                        eqs(cuad.getOperando1(),cuad.getResultado());
                        break;
                    case DATA.EQS1:
                        dir1 = mv.getInt(cuad.getOperando1());
                        eqs(dir1,cuad.getResultado());
                        break;
                    case DATA.EQS2:
                        dirR = mv.getInt(cuad.getResultado());
                        eqs(cuad.getOperando1(),dirR);
                        break;
                    case DATA.EQS3:
                        dir1 = mv.getInt(cuad.getOperando1());
                        dirR = mv.getInt(cuad.getResultado());
                        eqs(dir1,dirR);
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
                        i = cuad.getResultado() - 1;
                        break;
                    case DATA.TC:
                        mv.terminarCambio();
                        break;
                    case DATA.RTVAL:
                        pilaTemp.push(cuad.getResultado());
                        break;
                    case DATA.RET:
                        if (cuad.getOperando1() == -1 ){
                            mv.terminarCambio();
                            i = pila.pop() -1;
                            pilaTemp.pop();
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
                            mv.saveVar(pilaTemp.peek(),value);
                            i = pila.pop() - 1;
                            pilaTemp.pop();
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
                        prnt(cuad.getResultado());
                        break;
                    case DATA.PRNT1:
                        dirR = mv.getInt(cuad.getResultado());
                        prnt(dirR);
                        break;
                    case DATA.PNTL:
                        System.out.println(mv.getString(cuad.getResultado()));
                        break;
                    case DATA.GAP:
                        int memoria = cuad.getOperando1();
                        for (int j = cuad.getResultado(); j >= 1 ; j--,memoria++){
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
