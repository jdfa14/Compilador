/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega3;

/**
 *
 * @author JesusDavidsw
 */
public class Cubo {
    public static final Cubo instance = new Cubo();

    private int[][][] cube = new int[4][4][18];
	// Cubo[Operando1][Operando2][Operador] = TIPO

	// Operandos
    //private static final int INT = 0;	// Integer
    //private static final int DBL = 1;	// Double
    //private static final int STR = 2;	// String
    //private static final int BOL = 3;	// Boolean

    //private static final int ERR = -1;	// Error

    // Operadores
    //private static final int ADD = 4;	// Add +
    //private static final int SUB = 5;	// Subtract -
    //private static final int MUL = 6;	// Multiply *
    //private static final int DIV = 7;	// Divide /
    //private static final int MOD = 8;	// Modulus %
    //private static final int AND = 9;	// And &
    //private static final int OOR = 10;	// OR |
    //private static final int OLT = 11;	// Less Than <
    //private static final int OGT = 12;	// Greater Than >
    //private static final int EQT = 13;	// Equal to ==
    //private static final int DIF = 14;	// Different <>
    //private static final int GOE = 15;	// Greater or Equal >=
    //private static final int LOE = 16;	// Less or Equal <=
    //private static final int EQS = 17;	// Equals =

    public Cubo(){
        // Integer Operations
        cube[DATA.INT][DATA.INT][DATA.ADD] = DATA.INT;
        cube[DATA.INT][DATA.DBL][DATA.ADD] = DATA.DBL;
        cube[DATA.INT][DATA.STR][DATA.ADD] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.ADD] = DATA.ERR;

        cube[DATA.INT][DATA.INT][DATA.SUB] = DATA.INT;
        cube[DATA.INT][DATA.DBL][DATA.SUB] = DATA.DBL;
        cube[DATA.INT][DATA.STR][DATA.SUB] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.SUB] = DATA.ERR;

    	cube[DATA.INT][DATA.INT][DATA.MUL] = DATA.INT;
        cube[DATA.INT][DATA.DBL][DATA.MUL] = DATA.DBL;
        cube[DATA.INT][DATA.STR][DATA.MUL] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.MUL] = DATA.ERR;

        cube[DATA.INT][DATA.INT][DATA.DIV] = DATA.INT;
        cube[DATA.INT][DATA.DBL][DATA.DIV] = DATA.DBL;
        cube[DATA.INT][DATA.STR][DATA.DIV] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.DIV] = DATA.ERR;

    	cube[DATA.INT][DATA.INT][DATA.MOD] = DATA.INT;
        cube[DATA.INT][DATA.DBL][DATA.MOD] = DATA.DBL;
        cube[DATA.INT][DATA.STR][DATA.MOD] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.MOD] = DATA.ERR;

        cube[DATA.INT][DATA.INT][DATA.AND] = DATA.ERR;
        cube[DATA.INT][DATA.DBL][DATA.AND] = DATA.ERR;
        cube[DATA.INT][DATA.STR][DATA.AND] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.AND] = DATA.ERR;

    	cube[DATA.INT][DATA.INT][DATA.OOR] = DATA.ERR;
        cube[DATA.INT][DATA.DBL][DATA.OOR] = DATA.ERR;
        cube[DATA.INT][DATA.STR][DATA.OOR] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.OOR] = DATA.ERR;

        cube[DATA.INT][DATA.INT][DATA.OLT] = DATA.BOL;
        cube[DATA.INT][DATA.DBL][DATA.OLT] = DATA.BOL;
        cube[DATA.INT][DATA.STR][DATA.OLT] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.OLT] = DATA.ERR;

        cube[DATA.INT][DATA.INT][DATA.OGT] = DATA.BOL;
        cube[DATA.INT][DATA.DBL][DATA.OGT] = DATA.ERR;
        cube[DATA.INT][DATA.STR][DATA.OGT] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.OGT] = DATA.ERR;

        cube[DATA.INT][DATA.INT][DATA.EQT] = DATA.BOL;
        cube[DATA.INT][DATA.DBL][DATA.EQT] = DATA.BOL;
        cube[DATA.INT][DATA.STR][DATA.EQT] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.EQT] = DATA.ERR;

        cube[DATA.INT][DATA.INT][DATA.DIF] = DATA.BOL;
        cube[DATA.INT][DATA.DBL][DATA.DIF] = DATA.BOL;
        cube[DATA.INT][DATA.STR][DATA.DIF] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.DIF] = DATA.ERR;

        cube[DATA.INT][DATA.INT][DATA.GOE] = DATA.BOL;
        cube[DATA.INT][DATA.DBL][DATA.GOE] = DATA.BOL;
        cube[DATA.INT][DATA.STR][DATA.GOE] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.GOE] = DATA.ERR;

    	cube[DATA.INT][DATA.INT][DATA.LOE] = DATA.BOL;
        cube[DATA.INT][DATA.DBL][DATA.LOE] = DATA.BOL;
        cube[DATA.INT][DATA.STR][DATA.LOE] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.LOE] = DATA.ERR;

        cube[DATA.INT][DATA.INT][DATA.EQS] = DATA.INT;
        cube[DATA.INT][DATA.DBL][DATA.EQS] = DATA.INT;
        cube[DATA.INT][DATA.STR][DATA.EQS] = DATA.ERR;
        cube[DATA.INT][DATA.BOL][DATA.EQS] = DATA.ERR;

        // Double Operations
        cube[DATA.DBL][DATA.INT][DATA.ADD] = DATA.DBL;
        cube[DATA.DBL][DATA.DBL][DATA.ADD] = DATA.DBL;
        cube[DATA.DBL][DATA.STR][DATA.ADD] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.ADD] = DATA.ERR;

        cube[DATA.DBL][DATA.INT][DATA.SUB] = DATA.DBL;
        cube[DATA.DBL][DATA.DBL][DATA.SUB] = DATA.DBL;
        cube[DATA.DBL][DATA.STR][DATA.SUB] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.SUB] = DATA.ERR;

    	cube[DATA.DBL][DATA.INT][DATA.MUL] = DATA.DBL;
        cube[DATA.DBL][DATA.DBL][DATA.MUL] = DATA.DBL;
        cube[DATA.DBL][DATA.STR][DATA.MUL] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.MUL] = DATA.ERR;

        cube[DATA.DBL][DATA.INT][DATA.DIV] = DATA.DBL;
        cube[DATA.DBL][DATA.DBL][DATA.DIV] = DATA.DBL;
        cube[DATA.DBL][DATA.STR][DATA.DIV] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.DIV] = DATA.ERR;

    	cube[DATA.DBL][DATA.INT][DATA.MOD] = DATA.DBL;
        cube[DATA.DBL][DATA.DBL][DATA.MOD] = DATA.DBL;
        cube[DATA.DBL][DATA.STR][DATA.MOD] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.MOD] = DATA.ERR;

        cube[DATA.DBL][DATA.INT][DATA.AND] = DATA.ERR;
        cube[DATA.DBL][DATA.DBL][DATA.AND] = DATA.ERR;
        cube[DATA.DBL][DATA.STR][DATA.AND] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.AND] = DATA.ERR;

    	cube[DATA.DBL][DATA.INT][DATA.OOR] = DATA.ERR;
        cube[DATA.DBL][DATA.DBL][DATA.OOR] = DATA.ERR;
        cube[DATA.DBL][DATA.STR][DATA.OOR] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.OOR] = DATA.ERR;

        cube[DATA.DBL][DATA.INT][DATA.OLT] = DATA.BOL;
        cube[DATA.DBL][DATA.DBL][DATA.OLT] = DATA.BOL;
        cube[DATA.DBL][DATA.STR][DATA.OLT] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.OLT] = DATA.ERR;

        cube[DATA.DBL][DATA.INT][DATA.OGT] = DATA.ERR;
        cube[DATA.DBL][DATA.DBL][DATA.OGT] = DATA.BOL;
        cube[DATA.DBL][DATA.STR][DATA.OGT] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.OGT] = DATA.ERR;

        cube[DATA.DBL][DATA.INT][DATA.EQT] = DATA.BOL;
        cube[DATA.DBL][DATA.DBL][DATA.EQT] = DATA.BOL;
        cube[DATA.DBL][DATA.STR][DATA.EQT] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.EQT] = DATA.ERR;

        cube[DATA.DBL][DATA.INT][DATA.DIF] = DATA.BOL;
        cube[DATA.DBL][DATA.DBL][DATA.DIF] = DATA.BOL;
        cube[DATA.DBL][DATA.STR][DATA.DIF] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.DIF] = DATA.ERR;

        cube[DATA.DBL][DATA.INT][DATA.GOE] = DATA.BOL;
        cube[DATA.DBL][DATA.DBL][DATA.GOE] = DATA.BOL;
        cube[DATA.DBL][DATA.STR][DATA.GOE] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.GOE] = DATA.ERR;

    	cube[DATA.DBL][DATA.INT][DATA.LOE] = DATA.BOL;
        cube[DATA.DBL][DATA.DBL][DATA.LOE] = DATA.BOL;
        cube[DATA.DBL][DATA.STR][DATA.LOE] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.LOE] = DATA.ERR;

        cube[DATA.DBL][DATA.INT][DATA.EQS] = DATA.INT;
        cube[DATA.DBL][DATA.DBL][DATA.EQS] = DATA.DBL;
        cube[DATA.DBL][DATA.STR][DATA.EQS] = DATA.ERR;
        cube[DATA.DBL][DATA.BOL][DATA.EQS] = DATA.ERR;

        // String Operations
        cube[DATA.STR][DATA.INT][DATA.ADD] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.ADD] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.ADD] = DATA.STR;
        cube[DATA.STR][DATA.BOL][DATA.ADD] = DATA.ERR;

        cube[DATA.STR][DATA.INT][DATA.SUB] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.SUB] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.SUB] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.SUB] = DATA.ERR;

    	cube[DATA.STR][DATA.INT][DATA.MUL] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.MUL] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.MUL] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.MUL] = DATA.ERR;

        cube[DATA.STR][DATA.INT][DATA.DIV] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.DIV] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.DIV] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.DIV] = DATA.ERR;

    	cube[DATA.STR][DATA.INT][DATA.MOD] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.MOD] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.MOD] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.MOD] = DATA.ERR;

        cube[DATA.STR][DATA.INT][DATA.AND] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.AND] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.AND] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.AND] = DATA.ERR;

    	cube[DATA.STR][DATA.INT][DATA.OOR] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.OOR] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.OOR] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.OOR] = DATA.ERR;

        cube[DATA.STR][DATA.INT][DATA.OLT] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.OLT] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.OLT] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.OLT] = DATA.ERR;

        cube[DATA.STR][DATA.INT][DATA.OGT] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.OGT] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.OGT] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.OGT] = DATA.ERR;

        cube[DATA.STR][DATA.INT][DATA.EQT] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.EQT] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.EQT] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.EQT] = DATA.ERR;

        cube[DATA.STR][DATA.INT][DATA.DIF] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.DIF] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.DIF] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.DIF] = DATA.ERR;

        cube[DATA.STR][DATA.INT][DATA.GOE] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.GOE] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.GOE] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.GOE] = DATA.ERR;

    	cube[DATA.STR][DATA.INT][DATA.LOE] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.LOE] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.LOE] = DATA.ERR;
        cube[DATA.STR][DATA.BOL][DATA.LOE] = DATA.ERR;

        cube[DATA.STR][DATA.INT][DATA.EQS] = DATA.ERR;
        cube[DATA.STR][DATA.DBL][DATA.EQS] = DATA.ERR;
        cube[DATA.STR][DATA.STR][DATA.EQS] = DATA.STR;
        cube[DATA.STR][DATA.BOL][DATA.EQS] = DATA.ERR;

        // Boolean Operations
        cube[DATA.BOL][DATA.INT][DATA.ADD] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.ADD] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.ADD] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.ADD] = DATA.ERR;

        cube[DATA.BOL][DATA.INT][DATA.SUB] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.SUB] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.SUB] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.SUB] = DATA.ERR;

    	cube[DATA.BOL][DATA.INT][DATA.MUL] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.MUL] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.MUL] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.MUL] = DATA.ERR;

        cube[DATA.BOL][DATA.INT][DATA.DIV] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.DIV] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.DIV] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.DIV] = DATA.ERR;

    	cube[DATA.BOL][DATA.INT][DATA.MOD] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.MOD] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.MOD] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.MOD] = DATA.ERR;

        cube[DATA.BOL][DATA.INT][DATA.AND] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.AND] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.AND] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.AND] = DATA.BOL;

    	cube[DATA.BOL][DATA.INT][DATA.OOR] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.OOR] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.OOR] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.OOR] = DATA.BOL;

        cube[DATA.BOL][DATA.INT][DATA.OLT] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.OLT] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.OLT] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.OLT] = DATA.ERR;

        cube[DATA.BOL][DATA.INT][DATA.OGT] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.OGT] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.OGT] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.OGT] = DATA.ERR;

        cube[DATA.BOL][DATA.INT][DATA.EQT] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.EQT] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.EQT] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.EQT] = DATA.BOL;

        cube[DATA.BOL][DATA.INT][DATA.DIF] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.DIF] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.DIF] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.DIF] = DATA.BOL;

        cube[DATA.BOL][DATA.INT][DATA.GOE] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.GOE] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.GOE] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.GOE] = DATA.ERR;

    	cube[DATA.BOL][DATA.INT][DATA.LOE] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.LOE] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.LOE] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.LOE] = DATA.ERR;

        cube[DATA.BOL][DATA.INT][DATA.EQS] = DATA.ERR;
        cube[DATA.BOL][DATA.DBL][DATA.EQS] = DATA.ERR;
        cube[DATA.BOL][DATA.STR][DATA.EQS] = DATA.ERR;
        cube[DATA.BOL][DATA.BOL][DATA.EQS] = DATA.BOL;
    }

    public int parse(int op1, int op2,int operator){
        return cube[op1][op2][operator];
    }
}
