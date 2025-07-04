package Ex1_FormasGeometricas;

public class Retangulo extends Forma{
    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    

    @Override
    public double calcilarArea() {
        return largura * altura;
    }
    
}
