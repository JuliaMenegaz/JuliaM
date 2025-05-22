package EX2_EX14_Casa;



/**
 *
 * @author ADM
 */

 public class Pessoas_casa {
     String nome;
     
      public Pessoas_casa (String n){
    
        this.nome=n ;
     
        
        
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }
      
      
      
}
        
class Casa {

   
    
    int numero;
    String cor;
    Pessoas_casa Propri;
    
    
     public Casa (int n , String c,Pessoas_casa p ){
    
        this.numero=n ;
        this.cor=c;
        this.Propri=p;
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a casa");
        System.out.println("Volume: "+this.getNumero());
        System.out.println("Canal: "+ this.getCor());
        System.out.println("Proprietario: " +this.getPropri());
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int n) {
        this.numero = n;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public Pessoas_casa getPropri() {
        return Propri;
    }

    public void setPropri(Pessoas_casa p) {
        this.Propri = p;
    }
     
    
     
}



   
 
    
    


