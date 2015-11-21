package Entrega4;

public class Cuadruplo {
    private final long operador;
    private final long operando1;
    private final long operando2;
    private int resultado;

    public Cuadruplo(long operador, long operando1, long operando2, int resultado) {
        this.operador = operador;
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = resultado;
    }

    public int getOperador() {
        return (int) operador;
    }
    
    public long getLongOperador() {
        return operador;
    }

    public int getOperando1() {
        return (int) operando1;
    }
    
    public long getLongOperando1() {
        return operando1;
    }
    
    public long getLongOperando2() {
        return operando2;
    }
    
    public int getOperando2() {
        return (int) operando2;
    }

    public int getResultado() {
        return resultado;
    }
    
    public void setResultado(int resultado){
        this.resultado = resultado;
    }
}
