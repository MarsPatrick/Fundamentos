
package javaapplication1;


public class Transicion {
    private Nodo Origen;
    private Nodo Destino;
    private int Valor;
 
    public Transicion(Nodo Origen, Nodo Destino, int Valor) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.Valor = Valor;
    }
 
    public Nodo getOrigen() {
        return Origen;
    }
 
    public void setOrigen(Nodo origen) {
        this.Origen = origen;
    }
 
    public Nodo getDestino() {
        return Destino;
    }
 
    public void setDestino(Nodo destino) {
        this.Destino = destino;
    }
 
    public int getValor() {
        return Valor;
    }
 
    public void setValor(int Valor) {
        this.Valor = Valor;
    }
 
    @Override
    public String toString() {
        return "\n Linea [ Estado original = " + Origen.getEstado() + ", Estado donde llega =" + Destino.getEstado() + ", Valor="
                + Valor + "]";
    }
    
}
