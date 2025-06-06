package Ex1_FormasGeometricas;

public class Triangulo extends Forma{
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcilarArea() {
        return (base * altura) / 2;
    }

}
