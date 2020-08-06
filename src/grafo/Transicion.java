package grafo;

public class Transicion {
    private Nodo Origen;
    private Nodo Destino;
    private String Simbolo;
    private String Simbolo_Pila;
    private String Palabra_Pila;
 
   public Transicion(Nodo Origen, String Simbolo, String Simbolo_Pila, Nodo Destino, String Palabra_Pila) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.Simbolo = Simbolo;
        this.Simbolo_Pila = Simbolo_Pila;
        this.Palabra_Pila = Palabra_Pila;
    }

    public String getPalabra_Pila() {
        return Palabra_Pila;
    }

    public void setPalabra_Pila(String Palabra_Pila) {
        this.Palabra_Pila = Palabra_Pila;
    }

    public String getSimbolo_Pila() {
        return Simbolo_Pila;
    }

    public void setSimbolo_Pila(String Simbolo_Pila) {
        this.Simbolo_Pila = Simbolo_Pila;
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