package proyecto3;
/**
 * @author Rolando Campos
 * @author Jorge Fernandez
 * @author Patricio Labra
 * @author Leonardo Sanhueza
 * @author Luis Vasquez
 */
public class Turing {
    
    private String[] CintaPalabra;
    private String[] CintaRecorrer;

    public Turing() {
        //NO SE COMO INICIALIZAR LAS CINTAS, TAMPOCO SE SI SE HACE
    }
    
   public void AgregarPalabra(String[] Palabra){
       this.CintaPalabra=Palabra;
   }
   
   public void AgregarRecorrer(String[] Palabra){
       this.CintaRecorrer=Palabra;
   }
   
   public void Recorrer(){
       //ACA RECORRER Y GUARDAR EN UN STRING
       //POR LO QUE EL PRIMER # Y EL SEGUNDO # SE SEPARARA POR UN " " PARA TENER LAS DOS CINTAS 
   }
   
   
   //METODOS LISTOS
   public void Imprimir(String[] Palabra){
       for(String algo : Palabra)
           System.out.print("["+algo+"]");
       System.out.println();
   }
   
   public String[] Separador(String palabra,String separador){
        String[] separada=palabra.split(separador);
        return separada;
    }

    public String[] getCintaPalabra() {
        return CintaPalabra;
    }

    public void setCintaPalabra(String[] CintaPalabra) {
        this.CintaPalabra = CintaPalabra;
    }

    public String[] getCintaRecorrer() {
        return CintaRecorrer;
    }

    public void setCintaRecorrer(String[] CintaRecorrer) {
        this.CintaRecorrer = CintaRecorrer;
    }
}