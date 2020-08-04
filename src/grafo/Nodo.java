
package grafo;

public class Nodo {
    private String Estado;
    private Boolean inicial=false;
    private Boolean finall =false;

    public Nodo() {        
    }
    
    public Nodo(String Estado,boolean Inicial,boolean Final) {
        this.Estado = Estado;
        this.inicial=Inicial;
        this.finall=Final;
    }

    public Boolean getInicial() {
        return inicial;
    }

    public Boolean getFinall() {
        return finall;
    }

    public void setInicial(Boolean inicial) {
        this.inicial = inicial;
    }

    public void setFinall(Boolean finall) {
        this.finall = finall;
    }
 
    public String getEstado() {
        return Estado;
    }
 
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    @Override
    public String toString() {
        return "xd";
    }
}
