
package javaapplication1;

import java.util.ArrayList;
import java.util.List;



public class Nodo {

    private String Estado;
    private List<Transicion> Transiciones;
    private boolean Inicial=false;
    private boolean Fin=false;
 
    public Nodo(String Estado) {
        this.Estado = Estado;
    }
 
    public String getEstado() {
        return Estado;
    }  
    
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
 
    public List<Transicion> getTransicion() {
        return Transiciones;
    }
 
    public void addTransicion(Transicion transicion) {
        if (Transiciones == null) {
            Transiciones = new ArrayList<>();
        }
        Transiciones.add(transicion);
    }

    public boolean isInicial() {
        return Inicial;
    }

    public void setInicial(boolean Inicial) {
        this.Inicial = Inicial;
    }

    public boolean isFin() {
        return Fin;
    }

    public void setFin(boolean Fin) {
        this.Fin = Fin;
    }
    
    
    @Override
    public String toString() {
        return "\n \tEstado [Estado = " + Estado + ", Linea = " + Transiciones + "]";
    }
    
}
