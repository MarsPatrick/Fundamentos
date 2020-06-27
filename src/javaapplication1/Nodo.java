
package javaapplication1;

import java.util.ArrayList;
import java.util.List;



public class Nodo {

    private String Estado;
    private List<Transicion> Transiciones;
 
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
 
    @Override
    public String toString() {
        return "\n \tEstado [Estado = " + Estado + ", Linea = " + Transiciones + "]";
    }
    
}
