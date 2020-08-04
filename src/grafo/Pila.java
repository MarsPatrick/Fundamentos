package grafo;

import java.util.Stack;

public class Pila {
    
    public Stack pila;
    
    public Pila(){
        this.pila= new Stack();
    }
    
    public void Agregar(String Simbolo){
        this.pila.push(Simbolo);
    }
    
    public Object EliminarUltimo(){
        return this.pila.pop();
    }
    
    public void DarVuelta(){
        Stack PilaNueva = new Stack();
        while(!this.pila.empty()){
            PilaNueva.push(pila.pop());
        }
        this.pila=PilaNueva;
    }
    
}
