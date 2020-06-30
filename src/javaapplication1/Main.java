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
        
        boolean l1=Linea1(automata);
        if(l1==true){
            System.out.println("Error en 1");
            System.exit(0);
        }
        boolean l2=Linea2(automata);
        if(l2==true){
            System.out.println("Error en 2");
            System.exit(0);
        }
        boolean l3=Linea3(automata);
        if(l3==true){
            System.out.println("Error en 3");
            System.exit(0);
        }
        boolean l4=Linea4(automata);
        if(l4==true){
            System.out.println("Error en 4");
            System.exit(0);
        }
        boolean l5=Linea5(automata);
        if(l5==true){
            System.out.println("Error en 5");
            System.exit(0);
        }
        boolean l6=Linea6(automata);
        if(l6==true){
            System.out.println("Error en 6");
            System.exit(0);
        }
        automata.Palabra();
        automata.Acepta();
    }

    public static boolean Linea1(Automata automata){
        boolean ret=false;
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        for(String item : aa){
            if(!item.matches("(\\w.*)")){
                ret=true;
            }
            automata.AgregarEstado(item);
            Nodo nodo = new Nodo(item);
            automata.AgregarNodo(nodo);
            automata.getGrafo().addNodo(nodo);
        }
        return ret;
    }
    
    public static boolean Linea2(Automata automata){
        boolean ret=false;
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        for(String item : aa){
            automata.AgregarSimbolo(item);
            if(!item.matches("(\\w.*)")){
                ret=true;
            }
        }
        return ret;
    }
    
    public static boolean Linea3(Automata automata){
        boolean ret=false;
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        if(!a.matches("(\\w.*)")){
            ret=true;   
        }else{
            ret=true;
            for(String aa : automata.getEstados()){
                if(aa.equalsIgnoreCase(a)){
                    ret=false;
                    automata.getGrafo().buscarPorNombre(aa).setInicial(true);
                }
            }
            automata.AgregarEstadoInicial(a);
        }
        
        return ret;
    }
    
    public static boolean Linea4(Automata automata){
        boolean ret=false;
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        if(!a.matches("(\\w.*)")){
            ret=true;
        }else{
            String[] aa=a.split(" ");
            for(String item : aa){
                ret=true;
                for(String aaa : automata.getEstados()){
                    if(aaa.equalsIgnoreCase(item)){
                        ret=false;
                        automata.getGrafo().buscarPorNombre(aaa).setFin(true);
                    }
            }
                automata.AgregarEstadoFinal(item);
            }
        }
        return ret;
    }
    
    public static boolean Linea5(Automata automata){
        boolean ret=false;
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String[] aa=a.split(" ");
        //
        //INSERTAR ACA LA FUNCION PARA PASAR DE AFND A AFD
        //
        //
        for(String item : aa){
            if(ret==false){
                String tran=item.substring(1,item.length()-1);
                String[] trans = tran.split(",");
                boolean existe0=false;
                for(String aaaa : automata.getEstados()){
                    if(aaaa.equalsIgnoreCase(trans[0])){
                        existe0=true;
                    }
                }
                boolean existe1=false;
                for(String aaaa : automata.getSimbolos()){    
                    if(aaaa.equalsIgnoreCase(trans[1])){
                        existe1=true;
                    }
                }
                boolean existe2=false;
                for(String aaaa : automata.getEstados()){    
                    if(aaaa.equalsIgnoreCase(trans[2])){
                        existe2=true;
                    }
                }
                boolean existen=false;
                if(existe1==true && existe2==true && existe0==true){
                    existen=true;
                }else{
                    ret=true;
                }
                if(ret==false && existen==true){
                    Transicion transicion = new Transicion(automata.getGrafo().buscarPorNombre(trans[0]),automata.getGrafo().buscarPorNombre(trans[2]),Integer.parseInt(trans[1]));
                    automata.AgregarTransicion(transicion);
                    automata.getGrafo().buscarPorNombre(trans[0]).addTransicion(transicion);
                }
            }
        }
        return ret;
    }
    
    public static boolean Linea6(Automata automata){
        boolean ret=false;
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        for(int x=0;x<a.length();x++){
            if(ret==false){
                String aa=String.valueOf(a.charAt(x));
                if(!aa.matches("(\\w.*)")){
                    ret=true;  
                }else{
                    ret=true;
                    for(String aaa : automata.getSimbolos()){
                        if(aaa.equalsIgnoreCase(aa)){
                            ret=false;
                        }
                    }
                    automata.setPalabra(a);
                }
            }
        }
        return ret;
    }
}

