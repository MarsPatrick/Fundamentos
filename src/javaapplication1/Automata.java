package javaapplication1;

import java.util.ArrayList;
import java.util.HashSet;

public class Automata {

    private final ArrayList<Integer> estados;
    private final HashSet<Integer> estadosfinales;
    private final ArrayList<Transicion> transiciones;

    public Automata(){
        this.estados = new ArrayList<Integer>();
        this.estadosfinales = new HashSet<Integer>();
        this.transiciones = new ArrayList<Transicion>();  
    }
    
    public void AgregarEstado(int estado){
        this.estados.add(estado);
    }
    
    public void AgregarEstadoFinal(int estadofinal){
        this.estadosfinales.add(estadofinal);
    }
    
    public void AgregarTransicion(Transicion transicion){
        this.transiciones.add(transicion);
    }
    
    public ArrayList<Integer> getEstados() {
        return estados;
    }

    public HashSet<Integer> getEstadosfinales() {
        return estadosfinales;
    }

    public ArrayList<Transicion> getTransiciones() {
        return transiciones;
    }




}
