package proyecto3;
/**
 * @author Rolando Campos
 * @author Jorge Fernandez
 * @author Patricio Labra
 * @author Leonardo Sanhueza
 * @author Luis Vasquez
 */
public class Nodo {
    	private String valor;
	private Nodo siguiente;
	private Nodo anterior;

	public Nodo(String valor){
            this.valor=valor;
	} 
        
	public String getValor(){
            return this.valor;
	}
        
	public void setSiguiente(Nodo next){
            this.siguiente=next;
	}
        
	public void setAnterior(Nodo prev){
            this.anterior=prev;
	}
        
	public Nodo getSiguiente(){
            return this.siguiente;
	}
        
	public Nodo getAnterior(){
            return this.anterior;
	}
}