package Entrega2;
import java.util.*;

public class MemoriaVirtual {
    Memoria memG;   // Memoria Global
    Stack <Memoria> memT;   // Memoria Temporal
    Stack <Memoria> memL;   // Memoria Local
    Memoria memC;   // Memoria Constante
    int PC = 0;     // Bandera del cambio
    Memoria tempMT;
    Memoria tempML;

    public MemoriaVirtual(){
        memG = new Memoria();
        memT = new Stack <>();
        memL = new Stack <>();
        memC = new Memoria();
        memT.push(new Memoria());
        memL.push(new Memoria());
    }
    
    public void prepararCambio(){
        tempMT = new Memoria();
        tempML = new Memoria();
    }
    
    public void saveParam(int dir, Object value){
        PC = 1;
        saveVar(dir, value);
        PC = 0;
    }
        
    public void cambiarContexto(){
        memT.push(tempMT);
        memL.push(tempML);
    }
    
    public void terminarCambio(){
        memT.pop();
        memL.pop();
    }
    
    public void str1(int value, int dir){
        char a = (char) value;
        String b = String.valueOf(a); 
        saveVar(dir, b);
    }
    
    public void str2(int value, int dir){
        char a = (char) value;
        String b = getString(dir);
        b += a;
        saveVar(dir, b);
    }
    
    public void saveVar(int dir, Object value){ // Asignaciones
        Memoria.TYPE type = Memoria.getType(dir);
        
        switch(type){
            case GLOBAL_INT:
                memG.saveInt(dir, (int)value);
                break;
            case GLOBAL_FLOAT:
                memG.saveFloat(dir, (double) value);
                break;
            case GLOBAL_STRING: 
                memG.saveString(dir, (String) value);
                break;
            case GLOBAL_BOOLEAN:
                memG.saveBoolean(dir, (boolean) value);
                break;
            case LOCAL_INT:
                if (PC == 0)
                    memL.peek().saveInt(dir, (int)value);
                else
                    tempML.saveInt(dir, (int) value);
                break;
            case LOCAL_FLOAT:
                if (PC == 0)
                    memL.peek().saveFloat(dir, (double) value);
                else
                    tempML.saveFloat(dir, (double)value);
                break;
            case LOCAL_STRING:
                if (PC == 0)
                    memL.peek().saveString(dir, (String) value);
                else
                    tempML.saveString(dir, (String) value);
                break;
            case LOCAL_BOOLEAN:
                if (PC == 0)
                    memL.peek().saveBoolean(dir, (boolean) value);
                else
                    tempML.saveBoolean(dir, (boolean)value);
                break;
            case TEMPORAL_INT:
                if (PC == 0)
                    memT.peek().saveInt(dir, (int)value);
                else
                    tempMT.saveInt(dir, (int) value);
                break;
            case TEMPORAL_FLOAT:
                if (PC == 0)
                    memT.peek().saveFloat(dir, (double) value);
                else
                    tempMT.saveFloat(dir, (double) value);
                break;
            case TEMPORAL_STRING:
                if (PC == 0)
                    memT.peek().saveString(dir, (String) value);
                else
                    tempMT.saveString(dir, (String) value);
                break;
            case TEMPORAL_BOOLEAN:
                if (PC == 0)
                    memT.peek().saveBoolean(dir, (boolean) value);
                else
                    tempMT.saveBoolean(dir, (boolean)value);
                break;
            case CONSTANT_INT:
                memC.saveInt(dir, (int)value);
                break;
            case CONSTANT_FLOAT:
                memC.saveFloat(dir, (double) value);
                break;
            case CONSTANT_STRING: 
                memC.saveString(dir, (String) value);
                break;
            case CONSTANT_BOOLEAN:
                memC.saveBoolean(dir, (boolean) value);
                break;
        }
    }
    public String getString(int dir){
        Memoria.TYPE type = Memoria.getType(dir);
        switch(type){
            case GLOBAL_STRING: 
                return memG.getString(dir);
            case LOCAL_STRING: 
                return memL.peek().getString(dir);
            case TEMPORAL_STRING: 
                return memT.peek().getString(dir);
            case CONSTANT_STRING:
                return memC.getString(dir);
        }
        return null; // ERROR
    }
    
    public int getInt(int dir){
        Memoria.TYPE type = Memoria.getType(dir);
        switch(type){
            case GLOBAL_INT: 
                return memG.getInt(dir);
            case LOCAL_INT: 
                return memL.peek().getInt(dir);
            case TEMPORAL_INT: 
                return memT.peek().getInt(dir);
            case CONSTANT_INT:
                return memC.getInt(dir);
        }
        return -1; // MOSTRAR ERROR
    }
    
    public double getFloat(int dir){
        Memoria.TYPE type = Memoria.getType(dir);
        switch(type){
            case GLOBAL_FLOAT: 
                return memG.getFloat(dir);
            case LOCAL_FLOAT: 
                return memL.peek().getFloat(dir);
            case TEMPORAL_FLOAT: 
                return memT.peek().getFloat(dir);
            case CONSTANT_FLOAT:
                return memC.getFloat(dir);
        }
        return -1; // MOSTRAR ERROR
    }
    
    public boolean getBoolean(int dir){
        Memoria.TYPE type = Memoria.getType(dir);
        switch(type){
            case GLOBAL_BOOLEAN: 
                return memG.getBoolean(dir);
            case LOCAL_BOOLEAN: 
                return memL.peek().getBoolean(dir);
            case TEMPORAL_BOOLEAN: 
                return memT.peek().getBoolean(dir);
            case CONSTANT_BOOLEAN:
                return memC.getBoolean(dir);
        }
        return false; // MOSTRAR ERROR
    }
}
