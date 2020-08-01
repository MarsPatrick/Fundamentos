package grafo;

import java.util.Scanner;

/**
 * @author Jorge Fernandez
 * @author Patricio Labra
 */
public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Automata au = new Automata();
        String Linea1=sc.nextLine();
        String Linea2=sc.nextLine();
        String Linea3=sc.nextLine();
        String Linea4=sc.nextLine();
        String Linea5=sc.nextLine();
        String Linea6=sc.nextLine();
        //String Linea7=sc.nextLine();
        //String Linea8=sc.nextLine();
       
        au.AgregarEstados(Separador(Linea1," ","(\\w.*)",1));
        au.AgregarSimbolos(Separador(Linea2," ","(\\w.*)",2));
        
        //Verificar que sea solo uno
        au.AgregarAlfabetoPila(Separador(Linea3," ","(\\w.*)",3));
        
        //Verificar que sea solo uno
        au.setInicial(Linea4);
        
        //Cambiar a String[] y que lo o los agregue en el automata
        au.setFinal(Linea5);
        
        //au.AgregarUnAlfabetoPila(Linea6);
    }
    
    public static String[] Separador(String palabra,String separador,String regla,int linea){
        String[] separada=palabra.split(separador);
        for(String item : separada)
            Verificador(item,regla,linea);
        return separada;
    }
    
    public static void Verificador(String palabra,String regla,int linea){
        if(!palabra.matches(regla)){
            System.out.println("Error encontrado en "+linea);
            System.exit(0);
        }
    }
}
