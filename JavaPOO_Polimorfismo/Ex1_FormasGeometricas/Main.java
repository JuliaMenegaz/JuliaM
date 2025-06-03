package Ex1_FormasGeometricas;

public class Main {
    public static void main(String[] args) {
        
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4,3);
        Forma triangulo = new Triangulo(6,2);
        
        System.out.println("Área do circulo: "+circulo.calcilarArea());
        System.out.println("Área do retangulo: "+retangulo.calcilarArea());
        System.out.println("Área do triangulo: "+triangulo.calcilarArea());
    }
}
