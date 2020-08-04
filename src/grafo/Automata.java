
package grafo;

import java.util.ArrayList;
import java.util.List;

public class Automata {
    public List<Nodo> nodos;
    public List<Transicion> transiciones;
    public String[] Simbolos;
    public String[] AlfabetoPila;
    public Pila pila;
    
    public Automata(){
        this.nodos = new ArrayList();
        this.transiciones = new ArrayList();
        this.pila = new Pila();
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
    
    public void AgregarAlfabetoPila(String[] Simbolo){
        this.AlfabetoPila=Simbolo;
    }
    
    public void IniciarPila(String Simbolo){
        this.pila.Agregar(Simbolo);
    }
    
    public void AgregarTransicion(String origen,String Simbolo,String Simbolo_Pila,String destino,String Palabra_Pila){
        boolean error=true;
        if(this.BuscarNodo(origen)==null || this.BuscarNodo(destino)==null){
            this.Error(7);
        }
        for(String simb: this.Simbolos){
            if(simb.equalsIgnoreCase(Simbolo)){
                error=false;
            }
        }
        if(error==true){
            this.Error(7);
        }
        for(String simb: this.AlfabetoPila){
            if(simb.equalsIgnoreCase(Simbolo_Pila)){
                error=false;
            }
        }
        if(error==true){
            this.Error(7);
        }
        Transicion t=new Transicion(this.BuscarNodo(origen),Simbolo,Simbolo_Pila,this.BuscarNodo(destino),Palabra_Pila);
        this.transiciones.add(t);
    }
    
    public void AgregarTransiciones(String[] Transiciones){
        for(String item : Transiciones){
            String tran=item.substring(1,item.length()-1);
            String[] trans = tran.split(",");
            String[] trans1 = trans[2].split("=");
            this.AgregarTransicion(trans[0], trans[1], trans1[0], trans1[1], trans[3]);
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
        String x=this.pila.EliminarUltimo().toString();
        for(Transicion tran : this.transiciones){
            if(tran.getSimbolo().equalsIgnoreCase(Simbolo)){
                if(tran.getSimbolo_Pila().equalsIgnoreCase(x)){
                    if(!tran.getPalabra_Pila().equalsIgnoreCase(" ")){
                        this.pila.Agregar(tran.getPalabra_Pila());
                    }
                    return tran.getDestino();
                }
            }
        }
        return null;
    }
    
    public void setInicial(String Inicial){
        //Arreglar String
        if(this.BuscarNodo(Inicial)!=null){
            this.BuscarNodo(Inicial).setInicial(true);
        }else{
            this.Error(4);
        }
    }
    
    public void setFinal(String Final){
        //Arreglar string y cantidad de finales
        if(this.BuscarNodo(Final)!=null){
            this.BuscarNodo(Final).setFinall(true);
        }else{
            this.Error(5);
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
    
    private void Error(int linea){
        System.out.println("Error encontrado en "+linea);
        System.exit(0);
    }
    
}
