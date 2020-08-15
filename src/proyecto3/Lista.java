package proyecto3;
/**
 * @author Rolando Campos
 * @author Jorge Fernandez
 * @author Patricio Labra
 * @author Leonardo Sanhueza
 * @author Luis Vasquez
 */
public class Lista {
    private Nodo ini;
    private Nodo fin;

    public Lista(String[] lista){
        this.ini=null;
        this.fin=null;
        for(String n : lista){
            Nodo nuevoNodo=new Nodo(n);
            if(this.ini==null){
                this.ini=nuevoNodo;
                this.fin=nuevoNodo;
            }else{
                nuevoNodo.setAnterior(this.fin);
                this.fin.setSiguiente(nuevoNodo);
                this.fin=nuevoNodo;
            }
        }
    }
}
