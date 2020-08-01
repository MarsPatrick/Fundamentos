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
        
        if(Agregar(Linea1,1," ","(\\w.*)")==false){
        }else{
           if(Agregar(Linea2,2," ","(\\w.*)")==false){
           }else{
               if(Agregar(Linea3,3," ","(\\w.*)")==false){
               }else{
                   if(Agregar(Linea4,4," ","(\\w.*)")==false){
                       
                   }else{
                       if(Agregar(Linea5,5," ","(\\w.*)")==false){
                       }else{
                           if(Agregar(Linea6,6," ","(\\w.*)")==false){
                           }else{
                               //Ejecutar automata
                           }
                       }
                   }
               }
           }
        }
        
        
        
        
        
        
    }
    
    public static boolean Agregar(String palabra,int linea,String separador,String regla){
        boolean agregado=true;
        
        String[] palabragregar=Separador(palabra,separador);
        
        for(String item : palabragregar){
            if(Verificador(item,regla)==false)
                agregado=false;
        }
        
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
    
    public static boolean Verificador(String palabra,String regla){
        boolean Loes=false;
        if(palabra.matches(regla)){
            Loes=true;
        }
        return Loes;
    }
}
