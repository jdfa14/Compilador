package Entrega3;

public class DATA {
    //Error
    public static final int ERR = -1;   // Error general
    public static final int ERR1 = -2;  // Error Asignacion de tipo de dato de memoria
    public static final int ERR2 = -3;  // Error de asignacion de memoria
    public static final int ERR3 = -4;  // Error direccion de variable no asignada
    
    //Tipos de dato
    /** Data type Integer */
    public static final int INT = 0;	// Integer
    /** Data type Double */
    public static final int DBL = 1;	// Double
    /** Data Type String */
    public static final int STR = 2;	// String
    /** Data type boolean */
    public static final int BOL = 3;	// Boolean
    
    /** Operator ( */
    public static final int OP = 1001;  // (
    /** @deprecated Operator ). No longer needed */
    public static final int CP = 1002;  // )
    
    // Operadores
    /** Operator + */
    public static final int ADD = 4;	// Add +
    /** Operator - */
    public static final int SUB = 5;	// Subtract -
    /** Operator * */
    public static final int MUL = 6;	// Multiply *
    /** Operator / */
    public static final int DIV = 7;	// Divide /
    /** Operator % */
    public static final int MOD = 8;	// Modulus %
    /** Operator AND */
    public static final int AND = 9;	// And &
    /** Operator OR */
    public static final int OOR = 10;	// OR |
    /** Operator < */
    public static final int OLT = 11;	// Less Than <
    /** Operator > */
    public static final int OGT = 12;	// Greater Than >
    /** Operator == */
    public static final int EQT = 13;	// Equal to ==
    /** Operator <> */
    public static final int DIF = 14;	// Different <>
    /** Operator >= */
    public static final int GOE = 15;	// Greater or Equal >=
    /** Operator <= */
    public static final int LOE = 16;	// Less or Equal <=
    /** Operator = */
    public static final int EQS = 17;	// Equals =
    
    /** Instruction GOTO */
    public static final int GOT = 18;   // GOTO
    /** Instruction GOTO True */
    public static final int GTT = 19;   // GOTO True
    /** Instruction GOTO False */
    public static final int GTF = 20;   // GOTO False
    /** Instruction Add constants */
    public static final int ACTE = 21;  // Agregar Constantes
    /** Instruction End of File */
    public static final int EOF = 22;   // End of File
    /** Instruction Prepare context */
    public static final int PC = 23;    // Prepara cambio de contexto
    /** Instruction change context */
    public static final int CC = 24;    // Cambio de contexto
    /** @deprecated Instruction Go back to context. Use RET instead*/
    public static final int TC = 25;    // Termina el cambio de contexto
    /** Instruction RETURN */
    public static final int RET = 26;   // Return de una función
    /** Instruction PARAM */
    public static final int PARAM = 27; // Declaration of parameters to function
    /** Instruction Declare variable */
    public static final int DECL = 28;  // Declare variables
    /** Instruction Declare a String */
    public static final int STR1 = 29;  // Declaration of strings
    /** Instruction Concatenate value to string */
    public static final int STR2 = 30;  // Declaration of strings
    /** Instruction print */
    public static final int PRNT = 31;  // Función print
    /** Instruction print line */
    public static final int PNTL = 32;  // Función printline
    /** Instruction Reserve a Gap of memory */
    public static final int GAP = 33;   // Reservar espacio de memoria
    /** Instruction Change pen value of graphic output */
    public static final int PIN = 34;   // Reservar espacio de memoria
    /** Instruction Move graphic object from place to place*/
    public static final int MVE = 35;   // Reservar espacio de memoria
    /** Instruction R value of RGB */
    public static final int RED = 36;   // Reservar espacio de memoria
    /** Instruction G value of RGB */
    public static final int GRN = 37;   // Reservar espacio de memoria
    /** Instruction B value of RGB */
    public static final int BLU = 38;   // Reservar espacio de memoria
    /** Instruction  */
    public static final int COL = 39;   // Reservar espacio de memoria
    /** @deprecated Instruction validate if variable is Boolean. No longer needed */
    public static final int VBL = 40;   // Verifica que una direccion sea boolean
    /** Instruction verify if variable is in range */
    public static final int VRG = 41; 
    /** Instruction to assign a value to a result pointer */
    public static final int TNA = 42;   
    /** Data type null */
    public static final int VOID = 43;
    /** Instruction to save on Stack return value */
    public static final int RTVAL = 44;
}
