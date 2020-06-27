/* 
 *  Copyright (C) 2011  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package javaapplication1;

public class Transicion {
    /*
     * Atributos
     */
    private int EstadoActual;
    private int EstadoSiguiente;
    private String Letra;
    
    /**
     * Class constructor.
     */
    public Transicion() {}
    
    /**
     * Class constructor.
     * 
     * @param currentState
     * @param symbol
     * @param nextState 
     */
    public Transicion(int currentState, String symbol, int nextState){
        this.EstadoActual = currentState;
        this.Letra = symbol;
        this.EstadoSiguiente = nextState;
    }

    public int getCurrentState() {
        return EstadoActual;
    }

    public int getNextState() {
        return EstadoSiguiente;
    }

    public String getSymbol() {
        return Letra;
    }    
}
