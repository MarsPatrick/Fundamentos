package javaapplication1;

import java.util.ArrayList;
import java.util.List;


public class Grafo {
    private List<Nodo> nodos;
 
    public void addNodo(Nodo nodo) {
        if (nodos == null) {
            nodos = new ArrayList<>();
        }
        nodos.add(nodo);
    }
 
    public List<Nodo> getNodos() {
        return nodos;
    }

    public Nodo buscarPorNombre(String Estado){
        for(Nodo nodo:this.nodos){
            if(nodo.getEstado().equalsIgnoreCase(Estado)){
                return nodo;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "Graph [nodes=" + nodos + "]";
    }
    
}
