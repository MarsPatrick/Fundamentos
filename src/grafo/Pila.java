package grafo;

import java.util.Stack;

public class Pila {
    
    public Stack pila;
    
    public Pila(){
        this.pila= new Stack();
    }
    
    public boolean isEmpty(){
        return this.pila.isEmpty();
    }
    
    public void Agregar(String Simbolo){
        this.pila.push(Simbolo);
    }
    
    public Object EliminarUltimo(){
        return this.pila.pop();
    }
    
    public Stack DarVuelta(Stack Pila){
        Stack PilaNueva = new Stack();
        while(!Pila.isEmpty()){
            PilaNueva.push(Pila.pop());
        }
        return PilaNueva;
    }
    
    public String Imprimir(){
        String x="";
        String y;
        Stack reserva = new Stack();
        while(!pila.isEmpty()){
            y=this.EliminarUltimo().toString();
            x=x+y;
            reserva.push(y);
        }
        pila=this.DarVuelta(reserva);
        return x;
    }
}