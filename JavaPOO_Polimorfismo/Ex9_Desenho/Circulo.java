package Ex9_Desenho;

public class Circulo extends Desenho{
    private String desenhar;

    public Circulo() {
        this.desenhar = desenhar;
    }
    
    @Override
    public String desenhar() {
        System.out.println("Circulo: ◯ ");
        return desenhar;
    }

}
