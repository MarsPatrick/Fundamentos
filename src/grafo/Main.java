package grafo;

import java.util.Scanner;

/**
 * @author Jorge Fernandez
 * @author Patricio Labra
 */
public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Linea1=sc.nextLine();
        String Linea2=sc.nextLine();
        String Linea3=sc.nextLine();
        String Linea4=sc.nextLine();
        String Linea5=sc.nextLine();
        String Linea6=sc.nextLine();
        
    }
    
    public static String[] Separador(String palabra,String separador){
        String[] separada=palabra.split(separador);
        return separada;
    }
    
    public static boolean isAlphanumeric(String palabra){
        boolean Loes=false;
        if(palabra.matches("(\\w.*)")){
            Loes=true;
        }
        return Loes;
    }
}
