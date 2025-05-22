package EX2_EX13_Animal;

/**
 *
 * @author ADM
 */
public class Animal {

    String nome;
    String especie;
    
     public Animal (String n , String e){
    
        this.nome=n;
        this.especie=e;
        
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a televisao ");
        System.out.println("Volume: "+this.getNome());
        System.out.println("Canal: "+ this.getEspecie());
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
    
    
}
