
package grafo;

import java.util.ArrayList;
import java.util.List;

public class Automata {
    public List<Nodo> nodos;
    public List<Transicion> transiciones;
    public String[] Simbolos;
    public String[] AlfabetoPila;
    public Pila pila;
    public Nodo actual;
    
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
            if(trans[3].equalsIgnoreCase("#")){
                trans[3]=" ";
            }
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
        int y,z;
        for(Transicion tran : this.transiciones){
            if(tran.getOrigen()==actual){
                if(tran.getSimbolo().equalsIgnoreCase(Simbolo)){
                    if(tran.getSimbolo_Pila().equalsIgnoreCase(x)){
                        if(!tran.getPalabra_Pila().equalsIgnoreCase(" ")){
                            y=tran.getPalabra_Pila().length();
                            for(int cont=0;cont<y;cont++){
                                z=cont;
                                this.pila.Agregar(tran.getPalabra_Pila().substring(cont, z+1));
                            }
                        }
                        return tran.getDestino();
                    }
                }
            }
        }
        return null;
    }
    
    public void recorrer(String Palabra){
        int x=Palabra.length();
        int y;
        for(int cont=0;cont<x;cont++){
            y=cont;
            Nodo n = this.HacerTransicion(Palabra.substring(cont,y+1));
            actual = n;
            //El soout da null pointer dice
            System.out.println(Palabra.substring(0, cont)+"."+Palabra.substring(cont,x)+" "+this.actual.getEstado()+" "+this.pila.Imprimir());
        }
    }
    
    public void setInicial(String Inicial){
        //Arreglar String
        if(this.BuscarNodo(Inicial)!=null){
            this.BuscarNodo(Inicial).setInicial(true);
            this.actual=this.BuscarNodo(Inicial);
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
