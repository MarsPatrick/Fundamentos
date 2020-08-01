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
        
        
    }
    
    public static String[] Separador(String palabra,String separador,String regla,int linea){
        String[] separada=palabra.split(separador);
        for(String item : separada)
            Verificador(item,regla,linea);
        return separada;
    }
    
    public static void Verificador(String palabra,String regla,int linea){
        if(!palabra.matches(regla)){
            System.out.println("Error en "+linea);
            System.exit(0);
        }
    }
}
