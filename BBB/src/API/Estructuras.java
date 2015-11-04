/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import Entrega4.TablaProc;

/**
 *
 * @author JesusDavid
 */
public class Estructuras {
    private static final Estructuras instance = new Estructuras();
    
    private TablaProc tablaProc;
    
    public Estructuras(){
        tablaProc = new TablaProc();
    }
}
