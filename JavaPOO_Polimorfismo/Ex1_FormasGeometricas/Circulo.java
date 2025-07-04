package Ex1_FormasGeometricas;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    

    @Override
    public double calcilarArea() {
        return Math.PI * raio * raio;
    }
    
}
