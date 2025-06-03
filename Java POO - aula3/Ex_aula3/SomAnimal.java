package Ex_aula3;

public class SomAnimal implements Animal{
    private String somCachorro;
    private String somGato;
    private String somPato;

    public SomAnimal() {
        this.somCachorro = somCachorro;
        this.somGato = somGato;
        this.somPato = somPato;
    }

    public String getSomCachorro() {
        return somCachorro;
    }

    public void setSomCachorro(String somCachorro) {
        this.somCachorro = somCachorro;
    }

    public String getSomGato() {
        return somGato;
    }

    public void setSomGato(String somGato) {
        this.somGato = somGato;
    }

    public String getSomPato() {
        return somPato;
    }

    public void setSomPato(String somPato) {
        this.somPato = somPato;
    }
    
    @Override
    public void somCachorro() {
        System.out.println("Cachorro: Au Au Au");
    }

    @Override
    public void somGato() {
        System.out.println("Gato: Miau Miau Miau");
    }

    @Override
    public void somPato() {
        System.out.println("Pato: Quac Quac Quac");
    }
   
    }
   
    
    
        
    

