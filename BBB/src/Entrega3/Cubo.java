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

    private int[][][] cube = new int[4][4][14];
	// Cubo[Operando1][Operando2][Operador] = TIPO

	// Operandos
    private static final int INT = 0;	// Integer
    private static final int DBL = 1;	// Double
    private static final int STR = 2;	// String
    private static final int BOL = 3;	// Boolean

    private static final int ERR = -1;	// Error

    // Operadores
    private static final int ADD = 4;	// Add +
    private static final int SUB = 5;	// Subtract -
    private static final int MUL = 6;	// Multiply *
    private static final int DIV = 7;	// Divide /
    private static final int MOD = 8;	// Modulus %
    private static final int AND = 9;	// And &
    private static final int OOR = 10;	// OR |
    private static final int OLT = 11;	// Less Than <
    private static final int OGT = 12;	// Greater Than >
    private static final int EQT = 13;	// Equal to ==
    private static final int DIF = 14;	// Different <>
    private static final int GOE = 15;	// Greater or Equal >=
    private static final int LOE = 16;	// Less or Equal <=
    private static final int EQS = 17;	// Equals =

    public Cubo(){
        // Integer Operations
        cube[INT][INT][ADD] = INT;
        cube[INT][DBL][ADD] = DBL;
        cube[INT][STR][ADD] = ERR;
        cube[INT][BOL][ADD] = ERR;

        cube[INT][INT][SUB] = INT;
        cube[INT][DBL][SUB] = DBL;
        cube[INT][STR][SUB] = ERR;
        cube[INT][BOL][SUB] = ERR;

    	cube[INT][INT][MUL] = INT;
        cube[INT][DBL][MUL] = DBL;
        cube[INT][STR][MUL] = ERR;
        cube[INT][BOL][MUL] = ERR;

        cube[INT][INT][DIV] = INT;
        cube[INT][DBL][DIV] = DBL;
        cube[INT][STR][DIV] = ERR;
        cube[INT][BOL][DIV] = ERR;

    	cube[INT][INT][MOD] = INT;
        cube[INT][DBL][MOD] = DBL;
        cube[INT][STR][MOD] = ERR;
        cube[INT][BOL][MOD] = ERR;

        cube[INT][INT][AND] = ERR;
        cube[INT][DBL][AND] = ERR;
        cube[INT][STR][AND] = ERR;
        cube[INT][BOL][AND] = ERR;

    	cube[INT][INT][OOR] = ERR;
        cube[INT][DBL][OOR] = ERR;
        cube[INT][STR][OOR] = ERR;
        cube[INT][BOL][OOR] = ERR;

        cube[INT][INT][OLT] = BOL;
        cube[INT][DBL][OLT] = BOL;
        cube[INT][STR][OLT] = ERR;
        cube[INT][BOL][OLT] = ERR;

        cube[INT][INT][OGT] = BOL;
        cube[INT][DBL][OGT] = ERR;
        cube[INT][STR][OGT] = ERR;
        cube[INT][BOL][OGT] = ERR;

        cube[INT][INT][EQT] = BOL;
        cube[INT][DBL][EQT] = BOL;
        cube[INT][STR][EQT] = ERR;
        cube[INT][BOL][EQT] = ERR;

        cube[INT][INT][DIF] = BOL;
        cube[INT][DBL][DIF] = BOL;
        cube[INT][STR][DIF] = ERR;
        cube[INT][BOL][DIF] = ERR;

        cube[INT][INT][GOE] = BOL;
        cube[INT][DBL][GOE] = BOL;
        cube[INT][STR][GOE] = ERR;
        cube[INT][BOL][GOE] = ERR;

    	cube[INT][INT][LOE] = BOL;
        cube[INT][DBL][LOE] = BOL;
        cube[INT][STR][LOE] = ERR;
        cube[INT][BOL][LOE] = ERR;

        cube[INT][INT][EQS] = INT;
        cube[INT][DBL][EQS] = ERR;
        cube[INT][STR][EQS] = ERR;
        cube[INT][BOL][EQS] = ERR;

        // Double Operations
        cube[DBL][INT][ADD] = DBL;
        cube[DBL][DBL][ADD] = DBL;
        cube[DBL][STR][ADD] = ERR;
        cube[DBL][BOL][ADD] = ERR;

        cube[DBL][INT][SUB] = DBL;
        cube[DBL][DBL][SUB] = DBL;
        cube[DBL][STR][SUB] = ERR;
        cube[DBL][BOL][SUB] = ERR;

    	cube[DBL][INT][MUL] = DBL;
        cube[DBL][DBL][MUL] = DBL;
        cube[DBL][STR][MUL] = ERR;
        cube[DBL][BOL][MUL] = ERR;

        cube[DBL][INT][DIV] = DBL;
        cube[DBL][DBL][DIV] = DBL;
        cube[DBL][STR][DIV] = ERR;
        cube[DBL][BOL][DIV] = ERR;

    	cube[DBL][INT][MOD] = DBL;
        cube[DBL][DBL][MOD] = DBL;
        cube[DBL][STR][MOD] = ERR;
        cube[DBL][BOL][MOD] = ERR;

        cube[DBL][INT][AND] = ERR;
        cube[DBL][DBL][AND] = ERR;
        cube[DBL][STR][AND] = ERR;
        cube[DBL][BOL][AND] = ERR;

    	cube[DBL][INT][OOR] = ERR;
        cube[DBL][DBL][OOR] = ERR;
        cube[DBL][STR][OOR] = ERR;
        cube[DBL][BOL][OOR] = ERR;

        cube[DBL][INT][OLT] = BOL;
        cube[DBL][DBL][OLT] = BOL;
        cube[DBL][STR][OLT] = ERR;
        cube[DBL][BOL][OLT] = ERR;

        cube[DBL][INT][OGT] = ERR;
        cube[DBL][DBL][OGT] = BOL;
        cube[DBL][STR][OGT] = ERR;
        cube[DBL][BOL][OGT] = ERR;

        cube[DBL][INT][EQT] = BOL;
        cube[DBL][DBL][EQT] = BOL;
        cube[DBL][STR][EQT] = ERR;
        cube[DBL][BOL][EQT] = ERR;

        cube[DBL][INT][DIF] = BOL;
        cube[DBL][DBL][DIF] = BOL;
        cube[DBL][STR][DIF] = ERR;
        cube[DBL][BOL][DIF] = ERR;

        cube[DBL][INT][GOE] = BOL;
        cube[DBL][DBL][GOE] = BOL;
        cube[DBL][STR][GOE] = ERR;
        cube[DBL][BOL][GOE] = ERR;

    	cube[DBL][INT][LOE] = BOL;
        cube[DBL][DBL][LOE] = BOL;
        cube[DBL][STR][LOE] = ERR;
        cube[DBL][BOL][LOE] = ERR;

        cube[DBL][INT][EQS] = ERR;
        cube[DBL][DBL][EQS] = DBL;
        cube[DBL][STR][EQS] = ERR;
        cube[DBL][BOL][EQS] = ERR;

        // String Operations
        cube[STR][INT][ADD] = ERR;
        cube[STR][DBL][ADD] = ERR;
        cube[STR][STR][ADD] = ERR;
        cube[STR][BOL][ADD] = ERR;

        cube[STR][INT][SUB] = ERR;
        cube[STR][DBL][SUB] = ERR;
        cube[STR][STR][SUB] = ERR;
        cube[STR][BOL][SUB] = ERR;

    	cube[STR][INT][MUL] = ERR;
        cube[STR][DBL][MUL] = ERR;
        cube[STR][STR][MUL] = ERR;
        cube[STR][BOL][MUL] = ERR;

        cube[STR][INT][DIV] = ERR;
        cube[STR][DBL][DIV] = ERR;
        cube[STR][STR][DIV] = ERR;
        cube[STR][BOL][DIV] = ERR;

    	cube[STR][INT][MOD] = ERR;
        cube[STR][DBL][MOD] = ERR;
        cube[STR][STR][MOD] = ERR;
        cube[STR][BOL][MOD] = ERR;

        cube[STR][INT][AND] = ERR;
        cube[STR][DBL][AND] = ERR;
        cube[STR][STR][AND] = ERR;
        cube[STR][BOL][AND] = ERR;

    	cube[STR][INT][OOR] = ERR;
        cube[STR][DBL][OOR] = ERR;
        cube[STR][STR][OOR] = ERR;
        cube[STR][BOL][OOR] = ERR;

        cube[STR][INT][OLT] = ERR;
        cube[STR][DBL][OLT] = ERR;
        cube[STR][STR][OLT] = ERR;
        cube[STR][BOL][OLT] = ERR;

        cube[STR][INT][OGT] = ERR;
        cube[STR][DBL][OGT] = ERR;
        cube[STR][STR][OGT] = ERR;
        cube[STR][BOL][OGT] = ERR;

        cube[STR][INT][EQT] = ERR;
        cube[STR][DBL][EQT] = ERR;
        cube[STR][STR][EQT] = ERR;
        cube[STR][BOL][EQT] = ERR;

        cube[STR][INT][DIF] = ERR;
        cube[STR][DBL][DIF] = ERR;
        cube[STR][STR][DIF] = ERR;
        cube[STR][BOL][DIF] = ERR;

        cube[STR][INT][GOE] = ERR;
        cube[STR][DBL][GOE] = ERR;
        cube[STR][STR][GOE] = ERR;
        cube[STR][BOL][GOE] = ERR;

    	cube[STR][INT][LOE] = ERR;
        cube[STR][DBL][LOE] = ERR;
        cube[STR][STR][LOE] = ERR;
        cube[STR][BOL][LOE] = ERR;

        cube[STR][INT][EQS] = ERR;
        cube[STR][DBL][EQS] = ERR;
        cube[STR][STR][EQS] = STR;
        cube[STR][BOL][EQS] = ERR;

        // Boolean Operations
        cube[BOL][INT][ADD] = ERR;
        cube[BOL][DBL][ADD] = ERR;
        cube[BOL][STR][ADD] = ERR;
        cube[BOL][BOL][ADD] = ERR;

        cube[BOL][INT][SUB] = ERR;
        cube[BOL][DBL][SUB] = ERR;
        cube[BOL][STR][SUB] = ERR;
        cube[BOL][BOL][SUB] = ERR;

    	cube[BOL][INT][MUL] = ERR;
        cube[BOL][DBL][MUL] = ERR;
        cube[BOL][STR][MUL] = ERR;
        cube[BOL][BOL][MUL] = ERR;

        cube[BOL][INT][DIV] = ERR;
        cube[BOL][DBL][DIV] = ERR;
        cube[BOL][STR][DIV] = ERR;
        cube[BOL][BOL][DIV] = ERR;

    	cube[BOL][INT][MOD] = ERR;
        cube[BOL][DBL][MOD] = ERR;
        cube[BOL][STR][MOD] = ERR;
        cube[BOL][BOL][MOD] = ERR;

        cube[BOL][INT][AND] = ERR;
        cube[BOL][DBL][AND] = ERR;
        cube[BOL][STR][AND] = ERR;
        cube[BOL][BOL][AND] = BOL;

    	cube[BOL][INT][OOR] = ERR;
        cube[BOL][DBL][OOR] = ERR;
        cube[BOL][STR][OOR] = ERR;
        cube[BOL][BOL][OOR] = BOL;

        cube[BOL][INT][OLT] = ERR;
        cube[BOL][DBL][OLT] = ERR;
        cube[BOL][STR][OLT] = ERR;
        cube[BOL][BOL][OLT] = ERR;

        cube[BOL][INT][OGT] = ERR;
        cube[BOL][DBL][OGT] = ERR;
        cube[BOL][STR][OGT] = ERR;
        cube[BOL][BOL][OGT] = ERR;

        cube[BOL][INT][EQT] = ERR;
        cube[BOL][DBL][EQT] = ERR;
        cube[BOL][STR][EQT] = ERR;
        cube[BOL][BOL][EQT] = BOL;

        cube[BOL][INT][DIF] = ERR;
        cube[BOL][DBL][DIF] = ERR;
        cube[BOL][STR][DIF] = ERR;
        cube[BOL][BOL][DIF] = BOL;

        cube[BOL][INT][GOE] = ERR;
        cube[BOL][DBL][GOE] = ERR;
        cube[BOL][STR][GOE] = ERR;
        cube[BOL][BOL][GOE] = ERR;

    	cube[BOL][INT][LOE] = ERR;
        cube[BOL][DBL][LOE] = ERR;
        cube[BOL][STR][LOE] = ERR;
        cube[BOL][BOL][LOE] = ERR;

        cube[BOL][INT][EQS] = ERR;
        cube[BOL][DBL][EQS] = ERR;
        cube[BOL][STR][EQS] = ERR;
        cube[BOL][BOL][EQS] = BOL;
    }

    public int parse(int op1, int op2,int operator){
        return cube[op1][op2][operator];
    }
}
