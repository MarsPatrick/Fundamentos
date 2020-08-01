
package grafo;

import java.util.ArrayList;
import java.util.List;


public class Automata {
    public List<Nodo> nodos;
    public List<Transicion> transiciones;
    public String[] Simbolos;
    
    public void AgregarEstados(String[] Estados){
        for(String item : Estados){
            Nodo n = new Nodo();
            n.setEstado(item);
            this.nodos.add(n);
        }
    }
    
    public void AgregarSimbolo(String[] Simbolo){
        this.Simbolos=Simbolo;
    }
    
    public void AgregarTransicion(String origen,String Simbolo,String destino){
        if(this.transiciones==null){
            this.transiciones=new ArrayList<>();
        }
        Transicion t=new Transicion(this.BuscarNodo(origen),this.BuscarNodo(destino),Simbolo);
        this.transiciones.add(t);
    }
    
    public Nodo BuscarNodo(String Nodo){
        for(Nodo n:nodos){
            if(n.getEstado().equalsIgnoreCase(Nodo))
                return n;
        }
        return null;
    }
    
    public void addNode(Nodo node) {
        if (nodos == null) {
            nodos = new ArrayList<>();
        }
        nodos.add(node);
    }
 
    public List<Nodo> getNodes() {
        return nodos;
    }
    @Override
    public String toString() {
        return "Graph [nodes=" + nodos + "]";
    }
    
}
