/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import Entrega3.DATA;

public class VarType {
    private DATA.PARAM_TYPE type;
    private int dir;
    
    public VarType(){
        this.type = DATA.PARAM_TYPE.MYSTERY;
        this.dir = -1;
    }
    
    public VarType(DATA.PARAM_TYPE type, int dir) {
        this.type = type;
        this.dir = dir;
    }

    public DATA.PARAM_TYPE getType() {
        return type;
    }

    public int getDir() {
        return dir;
    }
    
}
