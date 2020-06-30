package javaapplication1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Automata {

    private ArrayList<String> estados;
    private HashSet<String> estadosfinales;
    private ArrayList<Transicion> transiciones;
    private ArrayList<String> simbolos;
    private String estadoinicial;
    private Grafo grafo;
    private String palabra;

    public Automata(){
        this.estados = new ArrayList<String>();
        this.estadoinicial = new String();
        this.estadosfinales = new HashSet<String>();
        this.transiciones = new ArrayList<Transicion>();
        this.simbolos = new ArrayList<String>();
        this.grafo = new Grafo();
        this.palabra = new String();
    }

    public void AgregarNodo(Nodo nodo){
       grafo.addNodo(nodo);
    }
    
    
    public void AgregarSimbolo(String simbolo){
        this.simbolos.add(simbolo);
    }
    
    public void AgregarEstado(String estado){
        this.estados.add(estado);
    }
    
    public void AgregarEstadoFinal(String estadofinal){
        this.estadosfinales.add(estadofinal);
    }
    
    public void AgregarTransicion(Transicion transicion){
        this.transiciones.add(transicion);
    }
    
    public void AgregarEstadoInicial(String estadoinicial){
        this.estadoinicial=estadoinicial;
    }
    
    public ArrayList<String> getSimbolos() {
        return simbolos;
    }

    public Grafo getGrafo(){
        return grafo;
    }
    
    public ArrayList<String> getEstados() {
        return estados;
    }

    public HashSet<String> getEstadosfinales() {
        return estadosfinales;
    }

    public String getEstadoinicial() {
        return estadoinicial;
    }

    public ArrayList<Transicion> getTransiciones() {
        return transiciones;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public void Palabra(){
        int tam=this.palabra.length();
        Nodo n=this.transiciones.get(0).getOrigen();
        String av=this.palabra;
        boolean xd =false;
        boolean xd2=false;
        int i=this.getSimbolos().get(0).length();
        for(int x=0;x<tam+1;x=x+i){
            if(xd2==false){
                System.out.println(av.substring(0,x)+"_"+av.substring(x,tam)+" "+n.getEstado());
                for(Transicion tran : this.transiciones){
                    if(n.getEstado().equalsIgnoreCase(tran.getOrigen().getEstado())){
                        if(tran.getValor().equals(this.palabra.substring(x, x+i))){
                            if(xd==false){
                                n=tran.getDestino();
                                xd=true;
                            }
                        }
                    }
                }
                if(xd==false){
                    xd2=true;
                }
                xd=false;
            }
        }
    }
    
    public void Acepta(){
        String pal = this.getPalabra();
        int cont=0;
        int x=this.getSimbolos().get(cont).length();
        Boolean acep=false;
        for (Nodo nodo : this.getGrafo().getNodos()) {
            if (nodo.isInicial()==true) {
                for (int i = 0; i < pal.length(); i=i+x) {
                    String temp=pal.substring(i, i+x);
                    if(nodo.isFin()==true && nodo.getTransicion()==null){
                        break;
                    }
                    for (Transicion tran : nodo.getTransicion()) {
                        if(temp.equals(tran.getValor())){
                            List<Nodo> nodos = this.getGrafo().getNodos();
                            for (int j = 0; j < nodos.size(); j++) {
                                if(nodos.get(j).getEstado().equalsIgnoreCase(tran.getDestino().getEstado()))
                                    nodo=nodos.get(j);
                            }
                            if(nodo.isFin()==true && (i+x)==pal.length()){
                                System.out.println("Aceptado");
                                acep=true;
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        }
        if(acep==false){
            System.out.println("Rechazado");
        }
    }
}
