
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

public class Automata {
    public List<Nodo> nodos;
    public List<Transicion> transiciones;
    public String[] Simbolos;
    public Nodo actual;
    
    public Automata(){
        this.nodos = new ArrayList();
        this.transiciones = new ArrayList();
    }
    
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
    
    public void AgregarTransicion(String origen,String destino,String Simbolo){
        boolean error=true;
        if(this.BuscarNodo(origen)==null || this.BuscarNodo(destino)==null){
            this.Error(5);
        }
        for(String simb: this.Simbolos){
            if(simb.equalsIgnoreCase(Simbolo)){
                error=false;
            }
        }
        if(error==true){
            this.Error(5);
        }
        Transicion t=new Transicion(this.BuscarNodo(origen),this.BuscarNodo(destino),Simbolo);
        this.transiciones.add(t);
    }
    
    public void AgregarTransiciones(String[] Transiciones){
        for(String item : Transiciones){
            String tran=item.substring(1,item.length()-1);
            String[] trans = tran.split(",");
            if(trans[1].equalsIgnoreCase("#")){
                this.Error(5);
            }
            this.AgregarTransicion(trans[0], trans[2], trans[1]);
        }
    }
    
    public Nodo BuscarNodo(String ABuscar){
        for(Nodo n:nodos){
            if(n.getEstado().equalsIgnoreCase(ABuscar))
                return n;
        }
        return null;
    }
    
    public Nodo HacerTransicion(String Simbolo){
        for(Transicion tran : this.transiciones){
            if(tran.getOrigen().getEstado().equalsIgnoreCase(this.actual.getEstado())){
                if(tran.getValor().equalsIgnoreCase(Simbolo)){
                    return tran.getDestino();
                }
            }
        }
        return actual;
    }
    
    public void recorrer(String Palabra){
        int x=Palabra.length();
        int y;
        for(int cont=0;cont<x;cont++){
            y=cont;
            System.out.println(Palabra.substring(0, cont)+"_"+Palabra.substring(cont,x)+" "+this.actual.getEstado()+" "+" ");
            Nodo n = this.HacerTransicion(Palabra.substring(cont,y+1));
            actual = n;            
        }
        this.Aceptado();
    }
    
    public void Aceptado(){
        for(Nodo nodo : this.getNodes()){
            if(nodo.getFinall()){
                if(nodo==actual){
                            System.out.println("Aceptado");
                            System.exit(0);
                }
            }
        }
        System.out.println("Rechazado");
        System.exit(0);
    }
    
    public void setInicial(String Inicial){
        //Arreglar String
        if(this.BuscarNodo(Inicial)!=null){
            this.BuscarNodo(Inicial).setInicial(true);
            this.actual=this.BuscarNodo(Inicial);
        }else{
            this.Error(3);
        }
    }
    
    public void setFinal(String[] Finales){
        for(String Final : Finales){
            if(this.BuscarNodo(Final)!=null){
                this.BuscarNodo(Final).setFinall(true);
            }else{
                this.Error(4);
            }
        }
    }
    
    public void addNode(Nodo node) {
        nodos.add(node);
    }
 
    public List<Nodo> getNodes() {
        return nodos;
    }
    @Override
    public String toString() {
        return "Graph [nodes=" + nodos + "]";
    }
    
    public void RevisarPalabra(String Palabra){
        boolean error;
        int y;
        for(int cont=0;cont<Palabra.length();cont++){
            y=cont;
            error=true;
            for(String simbolos : this.Simbolos){
                if(simbolos.equalsIgnoreCase(Palabra.substring(cont,y+1))){
                    error=false;
                }
            }
            if(error==true){
                this.Error(6);
            }
        }
    }
    
    private void Error(int linea){
        System.out.println("Error encontrado en "+linea);
        System.exit(0);
    }   
}