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
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Main main = new Main();
        Automata automata= new Automata();
        main.Linea1();

    }

    public void Linea1(){
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        for(String item : aa){
            //La idea es agregar aqui los estados al automata
        }
    }
    
    public void Linea2(){
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        for(String item : aa){
            //La idea es agregar aqui los simbolos al automata
        }
    }
    
    public void Linea3(){
        String a=sc.next();
        //La idea es agregar aqui estado inicial al automata
    }
    
    public void Linea4(){
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        for(String item : aa){
            //La idea es agregar aqui los estados finales al automata
        }
    }
    
    public void Linea5(){
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        for(String item : aa){
            //La idea es agregar aqui las transiciones al automata
        }
    }
    
    public void Linea6(){
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        for(String item : aa){
            //La idea es agregar aqui la palabra
        }
    }
}

