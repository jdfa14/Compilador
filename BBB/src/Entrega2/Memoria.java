/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega2;
import java.util.HashMap; 
/**
 *
 * @author JesusDavid
 */
public class Memoria{
    private static final Memoria instance = new Memoria();

    private HashMap<Integer,String> memS;
    private HashMap<Integer,String> memI;
    private HashMap<Integer,String> memA;
    private HashMap<Integer,String> memT;

    private static final int igi = 0; // Init Global Int
    private static final int igf = 3000; // Init Global Float
    private static final int igs = 6000; // Init Global String
    private static final int igb = 8000; // Init Global Boolean

    private static final int ili = 9000; // Init Local Int
    private static final int ilf = 12000; // Init Local Float
    private static final int ils = 15000; // Init Local String
    private static final int ilb = 17000; // Init Local Boolean

    private static final int iti = 18000; // Init Temporal Int
    private static final int itf = 21000; // Init Temporal Float
    private static final int its = 24000; // Init Temporal String
    private static final int itb = 26000; // Init Temporal Boolean

    private static final int ici = 27000; // Init Constant Int
    private static final int icf = 30000; // Init Constant Float
    private static final int ics = 33000; // Init Constant String
    private static final int icb = 35000; // Init Constant Boolean

    private static final int itp = 36000; // Init Global Int
    private static final int imo = 37000; // Init Global Float

    private static final int fgi = 2999; // Final Global Int
    private static final int fgf = 5999; // Final Global Float
    private static final int fgs = 7999; // Final Global String
    private static final int fgb = 8999; // Final Global Boolean

    private static final int fli = 11999; // Final Local Int
    private static final int flf = 14999; // Final Local Float
    private static final int fls = 16999; // Final Local String
    private static final int flb = 17999; // Final Local Boolean

    private static final int fti = 20999; // Final Global Int
    private static final int ftf = 23999; // Final Global Float
    private static final int fts = 25999; // Final Global String
    private static final int ftb = 26999; // Final Global Boolean

    private static final int fci = 29999; // Final Global Int
    private static final int fcf = 32999; // Final Global Float
    private static final int fcs = 34999; // Final Global String
    private static final int fcb = 35999; // Final Global Boolean

    private static final int ftp = 36999; // Final Global Int
    private static final int fmo = 37999; // Final Global Float

    public Memoria(){
            memS = new HashMap<>();
            memI = new HashMap<>();
            memA = new HashMap<>();
            memT = new HashMap<>();
    }
 }
