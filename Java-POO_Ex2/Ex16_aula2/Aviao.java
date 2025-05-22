package EX2_EX16_Aviao;

/**
 *
 * @author ADM
 */
public class Aviao {

     String modelo;
    int capacidade;
    int velocidade;
    
    
     public Aviao (String m, int c , int v){
    
        this.modelo=m; 
        this.capacidade=c;
        this.velocidade=v;
        
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a televisao ");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Capacidade: "+ this.getCapacidade());
        System.out.println("Velocidade: "+ this.getVelocidade());
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
}
