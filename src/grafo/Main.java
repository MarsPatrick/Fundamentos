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
    
    public static boolean Agregar(String palabra,int linea){
        boolean agregado=false;
        
        //De aca tomar string Linea y usar las dos de abajo para ver si se manda al grafo
        
        if(agregado==false){
            System.out.println("Error en "+linea);
        }else{
            //Lo dejare porsia
        }
        return agregado;
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
