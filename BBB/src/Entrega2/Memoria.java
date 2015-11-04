/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega2;
import Entrega3.Data;
import Entrega4.Cuadruplo;
import java.util.HashMap;

/**
 *
 * @author JesusDavid
 */
public class Memoria{
    public static enum TYPE{
        UNKNOWN,
        GLOBAL_INT,
        GLOBAL_FLOAT,
        GLOBAL_STRING,
        GLOBAL_BOOLEAN,
        TEMPORAL_INT,
        TEMPORAL_FLOAT,
        TEMPORAL_STRING,
        TEMPORAL_BOOLEAN,
        LOCAL_INT,
        LOCAL_FLOAT,
        LOCAL_STRING,
        LOCAL_BOOLEAN,
        CONSTANT_INT,
        CONSTANT_FLOAT,
        CONSTANT_STRING,
        CONSTANT_BOOLEAN
    }
    
    private HashMap<Integer,Object> memData;    // Conjunto de variables globales, locales y temporales
    
    //3000
    private static final int igi = 0;       // Init Global Int
    private static final int fgi = 2999;    // Final Global Int
    
    //3000
    private static final int igf = 3000;    // Init Global Float
    private static final int fgf = 5999;    // Final Global Float
    
    //2000
    private static final int igs = 6000;    // Init Global String
    private static final int fgs = 7999;    // Final Global String
    
    //1000
    private static final int igb = 8000;    // Init Global Boolean
    private static final int fgb = 8999;    // Final Global Boolean

    //3000
    private static final int ili = 9000;    // Init Local Int
    private static final int fli = 11999;   // Final Local Int
    
    //3000
    private static final int ilf = 12000;   // Init Local Float
    private static final int flf = 14999;   // Final Local Float
    
    //2000
    private static final int ils = 15000;   // Init Local String
    private static final int fls = 16999;   // Final Local String
    
    //1000
    private static final int ilb = 17000;   // Init Local Boolean
    private static final int flb = 17999;   // Final Local Boolean
    
    //3000
    private static final int iti = 18000; // Init Temporal Int
    private static final int fti = 20999; // Final Temporal Int
    
    //3000
    private static final int itf = 21000; // Init Temporal Float
    private static final int ftf = 23999; // Final Temporal Float
    
    //2000
    private static final int its = 24000; // Init Temporal String
    private static final int fts = 25999; // Final Temporal String
    
    //1000
    private static final int itb = 26000; // Init Temporal Boolean
    private static final int ftb = 26999; // Final Temporal Boolean
    
    //3000
    private static final int ici = 27000; // Init Constant Int
    private static final int fci = 29999; // Final Constant Int
    
    //3000
    private static final int icf = 30000; // Init Constant Float
    private static final int fcf = 32999; // Final Constant Float
    
    //2000
    private static final int ics = 33000; // Init Constant String
    private static final int fcs = 34999; // Final Constant String
    
    //1000
    private static final int icb = 35000; // Init Constant Boolean
    private static final int fcb = 35999; // Final Constant Boolean
    
    public Memoria(){
        memData = new HashMap<>();
    }
    
    public void saveInt(int key, int value){
        memData.put(key, value);
    }
    
    public void saveFloat(int key, double value){
        memData.put(key, value);
    }
    
    public void saveString(int key, String value){
        memData.put(key, value);
    }
    
    public void saveBoolean(int key, Boolean value){
        memData.put(key, value);
    }
    
    public int getInt(int key){
        return (int)memData.get(key);
    }
    
    public double getFloat(int key){        
        return (double)memData.get(key);
    }
    
    public String getString(int key){
        return (String)memData.get(key);
    }
    
    public Boolean getBoolean(int key){
        return (Boolean)memData.get(key);
    }
    
    public void wipeMemory(){
        memData.clear();
    }
    
    public static TYPE getType(int dir){
        if(dir <= fcb && dir >= igi){
            if(dir >= icb)
                return TYPE.CONSTANT_BOOLEAN;
            if(dir >= ics)
                return TYPE.CONSTANT_STRING;
            if(dir >= icf)
                return TYPE.CONSTANT_FLOAT;
            if(dir >= ici)
                return TYPE.CONSTANT_INT;
            if(dir >= itb)
                return TYPE.TEMPORAL_BOOLEAN;
            if(dir >= its)
                return TYPE.TEMPORAL_STRING;
            if(dir >= itf)
                return TYPE.TEMPORAL_FLOAT;
            if(dir >= iti)
                return TYPE.TEMPORAL_INT;
            if(dir >= ilb)
                return TYPE.LOCAL_BOOLEAN;
            if(dir >= ils)
                return TYPE.LOCAL_STRING;
            if(dir >= ilf)
                return TYPE.LOCAL_FLOAT;
            if(dir >= ili)
                return TYPE.LOCAL_INT;
            if(dir >= igb)
                return TYPE.GLOBAL_BOOLEAN;
            if(dir >= igs)
                return TYPE.GLOBAL_STRING;
            if(dir >= igf)
                return TYPE.GLOBAL_FLOAT;
            if(dir >= igi)
                return TYPE.GLOBAL_INT;
        }
        return TYPE.UNKNOWN;
    }
 }
