
package grafo;


public class Transicion {
    private Nodo Origen;
    private Nodo Destino;
    private int Simbolo;
 
    public Transicion(Nodo Origen, Nodo Destino, int Simbolo) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.Simbolo = Simbolo;
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
 
    public int getSimbolo() {
        return Simbolo;
    }
 
    public void setSimbolo(int simbolo) {
        this.Simbolo = simbolo;
    }
    @Override
    public String toString() {
        return "\n Linea [ Estado original = " + Origen.getCity()+ ", Estado donde llega =" + Destino.getCity() + ", Valor="
                + Simbolo + "]";
    }
 
    
}
