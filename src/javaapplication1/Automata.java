package javaapplication1;

import java.util.ArrayList;
import java.util.HashSet;

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
        for(int x=0;x<tam+1;x++){
            System.out.println(palabra.substring(0,x)+"_"+palabra.substring(x,tam)+" "+n.getEstado());
            //Buscar como avanzar en los nodos correspondientes
        }
    }
}
