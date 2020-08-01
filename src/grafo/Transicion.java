
package grafo;


public class Transicion {
    private Nodo Origen;
    private Nodo Destino;
    private String Simbolo;
 
    public Transicion(Nodo Origen, Nodo Destino, String Simbolo) {
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
 
    public String getSimbolo() {
        return Simbolo;
    }
 
    public void setSimbolo(String simbolo) {
        this.Simbolo = simbolo;
    }
    @Override
    public String toString() {
        return "\n Linea [ Estado original = " + Origen.getEstado()+ ", Estado donde llega =" + Destino.getEstado() + ", Valor="
                + Simbolo + "]";
    }
 
    
}
