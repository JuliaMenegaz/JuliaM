package Ex9_Desenho;

public class Quadrado extends Desenho{
    private String desenhar;

    public Quadrado() {
        this.desenhar = desenhar;
    }
    
    @Override
    public String desenhar() {
        System.out.println("Quadrado: ◻ ");
        return desenhar;
    }

}
