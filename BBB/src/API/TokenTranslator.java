/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.HashMap;
import Entrega3.DATA;
/**
 *
 * @author JesusDavid
 */
public class TokenTranslator {
    private static final TokenTranslator inst = new TokenTranslator();
    
    HashMap<String,Integer> map;
    
    public TokenTranslator(){
        map = new HashMap<>();
        //Tipos de datos
        map.put("INT", DATA.INT);
        map.put("FLT", DATA.DBL);
        map.put("BOL", DATA.BOL);
        map.put("STR", DATA.STR);
        
        /*
        map.put("OP", );
        map.put("CP", );
        map.put("OK", );
        map.put("CK", );
        map.put("OB", );
        map.put("CB", );
        map.put("COM", );
        map.put("VOID", );
        map.put("INCL", );
        map.put("MAIN", );
        map.put("LWHILE", );
        map.put("LDO", );
        map.put("LFOR", );
        map.put("CIF", );
        map.put("CELSE", );
        map.put("BRK", );
        map.put("RTRN", );
        map.put("PINU", );
        map.put("PIND", );
        map.put("COL", );
        map.put("PRNT", );
        map.put("MOV", );
        map.put("OAND", );
        map.put("OOR", );
        map.put("ONOT", );
        map.put("HT", );
        map.put("IGU", );
        map.put("DEL", );
        map.put("MLT", );
        map.put("DIV", );
        map.put("MOD", );
        map.put("PLS", );
        map.put("SUB", );
        map.put("MAI", );
        map.put("MEI", );
        map.put("OIG", );
        map.put("DIF", );
        map.put("MAY", );
        map.put("MEN", );
        map.put("CTEC", );
        map.put("CTES", );
        map.put("CTEF", );
        map.put("CTEI", );
        map.put("ID", );
        */
    }
    
    public static int Translate(String token){
        return inst.map.get(token);
    }
}
