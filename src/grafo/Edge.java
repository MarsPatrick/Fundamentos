
package grafo;


public class Edge {
    private Nodo origin;
    private Nodo destination;
    private int distance;
 
    public Edge(Nodo origin, Nodo destination, int distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }
 
    public Nodo getOrigin() {
        return origin;
    }
 
    public void setOrigin(Nodo origin) {
        this.origin = origin;
    }
 
    public Nodo getDestination() {
        return destination;
    }
 
    public void setDestination(Nodo destination) {
        this.destination = destination;
    }
 
    public int getDistance() {
        return distance;
    }
 
    public void setDistance(int distance) {
        this.distance = distance;
    }
    @Override
    public String toString() {
        return "\n Linea [ Estado original = " + origin.getCity()+ ", Estado donde llega =" + destination.getCity() + ", Valor="
                + distance + "]";
    }
 
    
}
