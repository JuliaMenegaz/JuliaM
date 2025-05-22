package Ex04_Triangulo;

public class Triangulo {
    double base;
    double altura;
    double calcularArea;
    double calcularPerimetro;
    
    void calcularArea(){
        if(calcularArea == base * altura){
            System.out.println("A area do retangulo é "+calcularArea);
        }
    }
        void calcularPerimetro(){
        if(calcularPerimetro == base + altura * 2){
            System.out.println("O perimetro é "+calcularPerimetro);
        }
    }
}
