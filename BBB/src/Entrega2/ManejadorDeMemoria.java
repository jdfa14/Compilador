package Entrega2;

import API.ErrorsHandler;
import API.VarType;

public class ManejadorDeMemoria {
    
    MemoryIndex memG;
    MemoryIndex memT;
    MemoryIndex memL;
    MemoryIndex memC;
    
    public ManejadorDeMemoria(){
        memG = new MemoryIndex(Memoria.SCOPE_TYPE.GLOBAL);
        memT = new MemoryIndex(Memoria.SCOPE_TYPE.TEMPORAL);
        memL = new MemoryIndex(Memoria.SCOPE_TYPE.LOCAL);
        memC = new MemoryIndex(Memoria.SCOPE_TYPE.CONSTANTE);
    }
    
    public void gapDir(Memoria.SCOPE_TYPE scope, Memoria.DATA_TYPE data, int gap){
        switch(scope){
            case GLOBAL:
                memG.putMany(data,gap);break;
            case TEMPORAL:
                memT.putMany(data,gap);break;
            case LOCAL:
                memL.putMany(data,gap);break;
            case CONSTANTE:
                memC.putMany(data,gap);break;
        }
    }
    
    public int crearDir(Memoria.SCOPE_TYPE scope, Memoria.DATA_TYPE data){
        switch(scope){
            case GLOBAL:
                return memG.put(data);
            case TEMPORAL:
                return memT.put(data);
            case LOCAL:
                return memL.put(data);
            case CONSTANTE:
                return memC.put(data);
        }
        ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.CANNOT_CREATE_VAR, "Tipo de variable desconocido");
        return -1; // ERROR
    }
    
    public void reset(Memoria.SCOPE_TYPE scope){
        switch(scope){
            case GLOBAL:
                memG.reset();
            case TEMPORAL:
                memT.reset();
            case LOCAL:
                memL.reset();
        }
    }
    
    public void contextChange(){
        reset(Memoria.SCOPE_TYPE.TEMPORAL);
        reset(Memoria.SCOPE_TYPE.LOCAL);
    }
    
    private class MemoryIndex{
 
    private int intCi;
    private int floatCi;
    private int stringCi;
    private int booleanCi;
    
    private int intCf;
    private int floatCf;
    private int stringCf;
    private int booleanCf;
    
    private Memoria.SCOPE_TYPE tipo;
    
    MemoryIndex(Memoria.SCOPE_TYPE tipo){
        this.tipo = tipo;
        setType();
        
    }
    
    public void reset(){
        setType();
    }
    
    private void setType(){
        switch(tipo){
            case GLOBAL:
                intCi = Memoria.igi;
                floatCi = Memoria.igf;
                stringCi = Memoria.igs;
                booleanCi = Memoria.igb;
                intCf = Memoria.fgi;
                floatCf = Memoria.fgf;
                stringCf = Memoria.fgs;
                booleanCf = Memoria.fgb;
                break;
            case TEMPORAL:
                intCi = Memoria.iti;
                floatCi = Memoria.itf;
                stringCi = Memoria.its;
                booleanCi = Memoria.itb;
                intCf = Memoria.fti;
                floatCf = Memoria.ftf;
                stringCf = Memoria.fts;
                booleanCf = Memoria.ftb;
                break;
            case LOCAL:
                intCi = Memoria.ili;
                floatCi = Memoria.ilf;
                stringCi = Memoria.ils;
                booleanCi = Memoria.ilb;
                intCf = Memoria.fli;
                floatCf = Memoria.flf;
                stringCf = Memoria.fls;
                booleanCf = Memoria.flb;
                break;     
            case CONSTANTE:
                intCi = Memoria.ici;
                floatCi = Memoria.icf;
                stringCi = Memoria.ics;
                booleanCi = Memoria.icb;
                intCf = Memoria.fci;
                floatCf = Memoria.fcf;
                stringCf = Memoria.fcs;
                booleanCf = Memoria.fcb;
                break;   
        }
    }
    
    public void putMany(Memoria.DATA_TYPE dt, int cant){
        switch(dt){
            case INT:
                if(intCi + cant > intCf){
                    API.ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.MEMORY_CAP_REACHED, "Constante entera");
                }
                intCi+= cant;
                break;
            case FLOAT:
                if(floatCi + cant > floatCf){
                    API.ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.MEMORY_CAP_REACHED, "Constante flotante");
                }
                floatCi+= cant;
                break;
            case STRING:
                if(stringCi + cant> stringCf){
                    API.ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.MEMORY_CAP_REACHED, "Constante cadena");
                }
                stringCi+= cant;
                break;
            case BOOLEAN:
                if(booleanCi + cant > booleanCf){
                    API.ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.MEMORY_CAP_REACHED, "Constante booleana");
                }
                booleanCi+= cant;
                break;
        }
    }
    
    public int put(Memoria.DATA_TYPE dt){
        switch(dt){
            case INT:
                if(intCi > intCf){
                    API.ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.MEMORY_CAP_REACHED, "Constante entera");
                }
                intCi++;
                return intCi - 1;
            case FLOAT:
                if(floatCi > floatCf){
                    API.ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.MEMORY_CAP_REACHED, "Constante flotante");
                }
                floatCi++;
                return floatCi - 1;
            case STRING:
                if(stringCi > stringCf){
                    API.ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.MEMORY_CAP_REACHED, "Constante cadena");
                }
                stringCi++;
                return stringCi - 1;
            case BOOLEAN:
                if(booleanCi > booleanCf){
                    API.ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.MEMORY_CAP_REACHED, "Constante booleana");
                }
            booleanCi++;
            return booleanCi - 1;
        }
        API.ErrorsHandler.SPAWN_ERROR(ErrorsHandler.ERROR.CANNOT_CREATE_VAR, "Tipo de direccion desconocida");
        return -1;
    }
}
}

