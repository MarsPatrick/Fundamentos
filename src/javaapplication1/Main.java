package javaapplication1;

import java.util.Scanner;

/**
 * @author Rolando Campos
 * @author Jorge Fernandez
 * @author Patricio Labra
 * @author Andres Vargas
 * @author Leonardo Sanhueza
 */
public class Main {
    
    
    public static void main(String[] args) {
        Automata automata= new Automata();
        Linea1(automata);
        //agregar aqui el boolean y mostrar el error en linea 1
        Linea2(automata);
        //agregar aqui el boolean y mostrar el error en linea 2
        Linea3(automata);
        //agregar aqui el boolean y mostrar el error en linea 3
        Linea4(automata);
        //agregar aqui el boolean y mostrar el error en linea 4
        Linea5(automata);
        //agregar aqui el boolean y mostrar el error en linea 5
        Linea6(automata);
        //agregar aqui el boolean y mostrar el error en linea 6
    }

    public static void Linea1(Automata automata){
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        if(!a.matches("^[a-zA-Z0-9]*$")){
        //Agregar el bolean    
        }else{
            String[] aa=a.split(" ");
            for(String item : aa){
                automata.AgregarEstado(item);
                Nodo nodo = new Nodo(item);
                automata.AgregarNodo(nodo);
            }
        }
    }
    
    public static void Linea2(Automata automata){
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        for(String item : aa){
            automata.AgregarSimbolo(item);
        }
    }
    
    public static void Linea3(Automata automata){
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        automata.AgregarEstadoInicial(a);
    }
    
    public static void Linea4(Automata automata){
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        for(String item : aa){
            automata.AgregarEstadoFinal(item);
        }
    }
    
    public static void Linea5(Automata automata){
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        //decir si es determinista o no porque el for es determinista
        for(String item : aa){
            String tran=item.substring(1,item.length()-1);
            String[] trans = tran.split(",");
            Transicion transicion = new Transicion(automata.getGrafo().buscarPorNombre(trans[0]),automata.getGrafo().buscarPorNombre(trans[2]),Integer.parseInt(trans[1]));
            automata.AgregarTransicion(transicion);
        }
    }
    
    public static void Linea6(Automata automata){
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        automata.setPalabra(a);
    }
}

