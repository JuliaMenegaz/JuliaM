package Ex9_Desenho;

public class Triangulo extends Desenho{
    private String desenhar;

    public Triangulo() {
        this.desenhar = desenhar;
    }
    
    @Override
    public String desenhar() {
        System.out.println("Triangulo: △ ");
        return desenhar;
    }

}
