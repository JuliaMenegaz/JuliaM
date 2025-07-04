package Ex4_FormasGeomatricas;

public class Main {
    public static void main(String[] args) {
       FormaGeometrica c1 = new Circulo(5, 5);
       FormaGeometrica r1 = new Retangulo(4, 4);
       FormaGeometrica t1 = new Triangulo(3, 3);
       
        System.out.println("Area do Circulo: "+c1.getCalcularArea());
        System.out.println("Area do Retangulo: "+r1.getCalcularArea());
        System.out.println("Area do Triangulo: "+t1.getCalcularArea());
    }
}
