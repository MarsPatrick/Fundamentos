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
        String Linea1=sc.nextLine(); // (Estados)
        //q1 q2
        String Linea2=sc.nextLine(); // (Simbolos de Transiciones)
        //0 1
        String Linea3=sc.nextLine(); // (Alfabeto)
        //A L
        String Linea4=sc.nextLine(); // (Estado Inicial)
        //q1
        String Linea5=sc.nextLine(); // (Estado Final)
        //q2
        String Linea6=sc.nextLine(); // (Alfabeto Inicial)
        //L
        String Linea7=sc.nextLine(); // (Transiciones)
        //(q1,0,L=q1,AL) (q1,0,A=q1,AA) (q1,1,A=q2,#) (q2,1,A=q2,#)
        String Linea8=sc.nextLine(); // (Palabra a reconocer)
        //000111
       
        au.AgregarEstados(Separador(Linea1," ","(\\w.*)",1));
        au.AgregarSimbolos(Separador(Linea2," ","(\\w.*)",2));
        
        //Verificar que sea solo uno
        au.AgregarAlfabetoPila(Separador(Linea3," ","(\\w.*)",3));
        
        //Verificar que sea solo uno
        au.setInicial(Linea4);
        
        //Cambiar a String[] y que lo o los agregue en el automata
        au.setFinal(Linea5);
        
        //Verificar el String
        au.IniciarPila(Linea6);
        
        au.AgregarTransiciones(Separador(Linea7," ","(\\w.*)",7));
        
        au.recorrer(Linea8);
    }
    
    public static String[] Separador(String palabra,String separador,String regla,int linea){
        String[] separada=palabra.split(separador);
        for(String item : separada){
            if(linea!=7){
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