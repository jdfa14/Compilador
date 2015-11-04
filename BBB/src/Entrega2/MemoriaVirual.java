package Entrega2;

public class MemoriaVirual {
    Memoria memG;   // Memoria Global
    Memoria memT;   // Memoria Temporal
    Memoria memL;   // Memoria Local
    
    public MemoriaVirual(){
        memG = new Memoria();
        memT = new Memoria();
        memL = new Memoria();
    }
    
    public void wipeLocal(){
        memL.wipeMemory();
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
                memL.saveInt(dir, (int)value);
                break;
            case LOCAL_FLOAT:
                memL.saveFloat(dir, (double) value);
                break;
            case LOCAL_STRING: 
                memL.saveString(dir, (String) value);
                break;
            case LOCAL_BOOLEAN:
                memL.saveBoolean(dir, (boolean) value);
                break;
            case TEMPORAL_INT:
                memT.saveInt(dir, (int)value);
                break;
            case TEMPORAL_FLOAT:
                memT.saveFloat(dir, (double) value);
                break;
            case TEMPORAL_STRING: 
                memT.saveString(dir, (String) value);
                break;
            case TEMPORAL_BOOLEAN:
                memT.saveBoolean(dir, (boolean) value);
                break;
        }
    }
    
    public Object getVar(int dir){  // Obtener el valor de una direccion
        Memoria.TYPE type = Memoria.getType(dir);
        
        switch(type){
            case GLOBAL_INT:
                return memG.getInt(dir);
            case GLOBAL_FLOAT:
                return memG.getFloat(dir);
            case GLOBAL_STRING: 
                return memG.getString(dir);
            case GLOBAL_BOOLEAN:
                return memG.getBoolean(dir);
            case LOCAL_INT:
                return memL.getInt(dir);
            case LOCAL_FLOAT:
                return memL.getFloat(dir);
            case LOCAL_STRING: 
                return memL.getString(dir);
            case LOCAL_BOOLEAN:
                return memL.getBoolean(dir);
            case TEMPORAL_INT:
                return memT.getInt(dir);
            case TEMPORAL_FLOAT:
                return memT.getFloat(dir);
            case TEMPORAL_STRING: 
                return memT.getString(dir);
            case TEMPORAL_BOOLEAN:
                return memT.getBoolean(dir);
        }
        return null;
    }
}
