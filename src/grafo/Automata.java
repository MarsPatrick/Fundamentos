
package grafo;

import java.util.ArrayList;
import java.util.List;


public class Automata {
    public List<Nodo> nodos;
    public List<Transicion> transiciones;
    public String[] Simbolos;
    public String[] AlfabetoPila;
    
    public void AgregarEstados(String[] Estados){
        if (nodos == null) {
            nodos = new ArrayList<>();
        }
        for(String item : Estados){
            Nodo n = new Nodo();
            n.setEstado(item);
            this.nodos.add(n);
        }
    }
    
    public void AgregarSimbolos(String[] Simbolo){
        this.Simbolos=Simbolo;
    }
    
    public void AgregarAlfabetoPila(String[] Simbolo){
        this.Simbolos=Simbolo;
    }
    
    public void AgregarUnAlfabetoPila(String Simbolo){
        //Hacer la wea pajaaaaaaaaaaaaaaaaaa
    }
    
    public void AgregarTransicion(String origen,String Simbolo,String destino){
        if(this.transiciones==null){
            this.transiciones=new ArrayList<>();
        }
        Transicion t=new Transicion(this.BuscarNodo(origen),this.BuscarNodo(destino),Simbolo);
        this.transiciones.add(t);
    }
    
    public Nodo BuscarNodo(String ABuscar){
        for(Nodo n:nodos){
            if(n.getEstado().equalsIgnoreCase(ABuscar))
                return n;
        }
        return null;
    }
    
    public void setInicial(String Inicial){
        //Arreglar String
        if(this.BuscarNodo(Inicial)!=null){
            this.BuscarNodo(Inicial).setInicial(true);
        }else{
            System.out.println("Error encontrado en 4");
            System.exit(0);
        }
    }
    
    public void setFinal(String Final){
        //Arreglar string y cantidad de finales
        if(this.BuscarNodo(Final)!=null){
            this.BuscarNodo(Final).setFinall(true);
        }else{
            System.out.println("Error encontrado en 5");
            System.exit(0);
        }
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
