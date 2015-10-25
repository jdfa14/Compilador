package Entrega4;

import java.util.HashMap; 

public class TablaProc {
    private static final TablaProc instance = new TablaProc();
    private String lastError = "";
    private HashMap<String,HashMap> procedures;
    
    public TablaProc(){
        procedures = new HashMap<>();
    }
    
    private static void setError(String err){
        instance.lastError = err;
    }
    
    public static String getLastError(){
        return instance.lastError;
    } 
    
    public static int saveProc(String key, HashMap<String,Integer> value){
        if(instance.procedures.containsKey(key)){
            setError("Proceso doblemente declarado: " + key);
            return -1;
        }
        instance.procedures.put(key, value);
        return 0;
    }
    
    public static HashMap<String, Integer> getProc(String key){
        if(instance.procedures.containsKey(key)){
            return instance.procedures.get(key);
        }
        setError("Undeclared procedure: " + key);
        return null;
    }
}
