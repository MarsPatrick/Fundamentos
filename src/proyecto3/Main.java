package proyecto3;
public class Main {
/**
 * @author Rolando Campos
 * @author Jorge Fernandez
 * @author Patricio Labra
 * @author Leonardo Sanhueza
 * @author Luis Vasquez
 */
    public static void main(String[] args) {
        Turing t = new Turing();
        String[] Palabra;
        String[] Recorrer;
        
        String Pal="0 1 1 0 1 1 0 1 0";
        String Rec="0 # 1 0 # 1 0";
        
        //CAMBIAR LA REGLA, DEBE SER PARA LA PALABRA 0 Y 1, PARA RECORRER ADEMAS EL #
        t.AgregarPalabra(Separador(Pal," ","(\\w.*)"));
        t.AgregarRecorrer(Separador(Rec," ","(\\w.*)"));
        
    }
    
    public static String[] Separador(String palabra,String separador,String regla){
        String[] separada=palabra.split(separador);
        for(String item : separada){
            Verificador(item,regla);
        }
        return separada;
    }
    
    public static void Verificador(String palabra,String regla){
        if(!palabra.matches(regla)){
            System.exit(0);
        }
    }
}
