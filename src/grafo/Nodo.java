
package grafo;

import java.util.*;


public class Nodo {
    private String Estado;
    private Boolean inicial=false;
    private Boolean finall =false;

    Nodo() {
        
    }

    public Boolean getInicial() {
        return inicial;
    }

    public Boolean getFinall() {
        return finall;
    }

    public void setInicial(Boolean inicial) {
        this.inicial = inicial;
    }

    public void setFinall(Boolean finall) {
        this.finall = finall;
    }
 
    public Nodo(String Estado) {
        this.Estado = Estado;
    }
 
    public String getEstado() {
        return Estado;
    }
 
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    @Override
    public String toString() {
        return "xd";
    }
}
