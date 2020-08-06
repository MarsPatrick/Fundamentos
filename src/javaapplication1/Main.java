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
        Automata au= new Automata();
        Scanner sc = new Scanner(System.in);
        
        String Linea1=sc.nextLine();
        String Linea2=sc.nextLine();
        String Linea3=sc.nextLine();
        String Linea4=sc.nextLine();
        String Linea5=sc.nextLine();
        String Linea6=sc.nextLine();
        
        au.AgregarEstados(Separador(Linea1," ","(\\w.*)",1));
        au.AgregarSimbolos(Separador(Linea2," ","(\\w.*)",2));
        au.setInicial(Linea3);
        au.setFinal(Separador(Linea4," ","(\\w.*)",4));
        au.AgregarTransiciones(Separador(Linea5," ","(\\w.*)",5));
        
        //Falta AFND->AFD
        //Falta que revise la palabra
        //au.RevisarPalabra(Linea6);
        
        au.recorrer(Linea6);
        
    }

    public static String[] Separador(String palabra,String separador,String regla,int linea){
        String[] separada=palabra.split(separador);
        for(String item : separada){
            if(linea!=5){
                Verificador(item,regla,linea);
            }
        }
        return separada;
    }
    
    public static void Verificador(String palabra,String regla,int linea){
        if(!palabra.matches(regla)){
            System.out.println("Error encontrado en "+linea);
            System.exit(0);
        }
    }
}