
package grafo;

import java.util.ArrayList;
import java.util.List;


public class Automata {
    private List<Nodo> nodes;
    
 
    public void addNode(Nodo node) {
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        nodes.add(node);
    }
 
    public List<Nodo> getNodes() {
        return nodes;
    }
    @Override
    public String toString() {
        return "Graph [nodes=" + nodes + "]";
    }
    
}
