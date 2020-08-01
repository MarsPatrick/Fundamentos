package grafo;

import java.util.Stack;

public class Pila {
    
    public Stack pila;
    
    public Pila(){
        this.pila= new Stack();
    }
    
    public void Agregar(int Algo){
        this.pila.push(Algo);
    }
    
    public void EliminarUltimo(){
        this.pila.pop();
    }
    
    public void DarVuelta(){
        Stack PilaNueva = new Stack();
        while(!this.pila.empty()){
            PilaNueva.push(pila.pop());
        }
        this.pila=PilaNueva;
    }
    
}
