
package grafo;

import java.util.ArrayList;
import java.util.Scanner;


public class Grafo {
    public static void mostrardatos(String[] estados, String[] simbolos,String linea3, String[] finales, ArrayList<String[]> otro){
        for (int i = 0; i < estados.length; i++) {
            System.out.println("Los estados son "+estados[i]);
        }
        for (int i = 0; i < simbolos.length; i++) {
            System.out.println("Los simbolos del lenguaje son "+simbolos[i]);
            
        }
        System.out.println("El estado inicial es "+linea3);
        
        for (int i = 0; i < finales.length; i++) {
            System.out.println("Los estados finales son "+finales[i]);
            
        }
        for (int i = 0; i < otro.size(); i++) {
            System.out.println("La trancision "+(i+1));
            System.out.println("Va Desde "+otro.get(i)[0]);
            System.out.println("Hasta "+otro.get(i)[2]);
            System.out.println("y vale "+otro.get(i)[1]);
        }
    }

    
    public static void main(String[] args) {
        String linea1;
        Scanner s= new Scanner(System.in);
        //System.out.println("soy 1");
        linea1=s.nextLine();
        String estados[]=linea1.split(" ");
        String linea2 = "";
        //System.out.println("soy 2");
        linea2=s.nextLine();
            
        //}while(!linea2.matches("^[a-zA-Z0-9]*$") && !linea2.contains(" ") );
        String simbolos[]=linea2.split(" ");
        //System.out.println("soy 3");
        String linea3;
        linea3=s.nextLine();
        //System.out.println("soy 4");
        
        String linea4;
        linea4=s.nextLine();
        String finales[]=linea4.split(" ");
        //System.out.println("soy 5");
        String linea5=s.nextLine();
        String tranciciones[]=linea5.split(" ");
        ArrayList<String[]> otro=new  ArrayList();
        
        for (String a : tranciciones ) {
            otro.add(a.split(","));    
        }
        for (String[] b : otro ) {
            b[0]=b[0].substring(1);
            b[2]=b[2].substring(0, 1);
            //System.out.println(b[0]);
            //System.out.println(b[2]);
        }
        //mostrardatos(estados, simbolos, linea3, finales, otro);
        
        ArrayList<Nodo> nodos = new ArrayList();
        
        for (int i = 0; i < estados.length; i++) {
            Nodo n = new Nodo(estados[i]);
            nodos.add(n);
        }
        for (int i = 0; i < nodos.size(); i++) {
            for (int j = 0; j < otro.size(); j++) {
                if(nodos.get(i).getCity().equalsIgnoreCase(otro.get(j)[0].toString())){
                Nodo ori =nodos.get(i);
                Nodo des = new Nodo("");
                    for (int k = 0; k < otro.size(); k++) {
                        if(nodos.get(k).getCity().equalsIgnoreCase(otro.get(j)[2].toString())){
                            des.setCity(nodos.get(k).getCity());
                        }
                    }
                
                Edge es = new Edge(ori, des, Integer.parseInt(otro.get(j)[1]));
                nodos.get(i).addEdge(es);
            }
                
            }
            
            
            
        }
        Automata au = new Automata();
        for (int i = 0; i < nodos.size(); i++) {
            au.addNode(nodos.get(i));
            
        }
        
        
        for (int i = 0; i < nodos.size(); i++) {
            if(nodos.get(i).getCity().equalsIgnoreCase(linea3)){
            nodos.get(i).setInicial(Boolean.TRUE);
            }
        }
        for (String fin : finales) {
            for (Nodo nodo : nodos) {
                if(nodo.getCity().equalsIgnoreCase(fin)){
                nodo.setFinall(Boolean.TRUE);
            }
            }
        }
        //System.out.println(au.toString());
        //             (A,0,A) (A,1,B) (B,1,C)
        //(estado2,0,estado1) (estado2,1,estado3) (estado3,2,estado3) (estado1,2,estado1)
        String linea6 = s.nextLine();
        Boolean acep=false;
        for (Nodo nodo : au.getNodes()) {
//            System.out.println("Nodo "+nodo.getCity());
            if (nodo.getInicial()==true) {
                
                for (int i = 0; i < linea6.length(); i++) {
                    String temp=linea6.substring(i, i+1);
                    //System.out.println("PALABRA "+temp);
                    //System.out.println("Nodo "+nodo.getCity());
                    if(nodo.getFinall()==true && nodo.getEdges()==null){
                        break;
                    }
                    for (Edge tran : nodo.getEdges()) {
                        if(Integer.parseInt(temp)==tran.getDistance()){
                            //System.out.println("pase");
                            
                            //System.out.println(nodo.getEdges().toString());
                            for (int j = 0; j < nodos.size(); j++) {
                                if(nodos.get(j).getCity().equalsIgnoreCase(tran.getDestination().getCity()))
                                    nodo=nodos.get(j);
                                    
                            }
                            if(nodo.getFinall()==true && (i+1)==linea6.length()){
                                System.out.println("Aceptado");
                                acep=true;
                                break;
                            }
                        }
                    } 
                    
                }
                
            }
            
        }
        if(acep==false){
            System.out.println("Rechazado");
        }
        
        
        
        
        
        }
        
    }

   



    

