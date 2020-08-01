
package grafo;

import java.util.*;


public class Nodo {
    private String city;
    private List<Transicion> edges;
    private Boolean inicial=false;
    private Boolean finall =false;

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
 
    public Nodo(String city) {
        this.city = city;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public List<Transicion> getEdges() {
        return edges;
    }
 
    public void addEdge(Transicion edge) {
        if (edges == null) {
            edges = new ArrayList<>();
        }
        edges.add(edge);
    }
    @Override
    public String toString() {
        return "\n \tEstado [Estado = " + city + ", Linea = " + edges + "]"+"final"+finall+"inicial"+inicial;
    }
}
