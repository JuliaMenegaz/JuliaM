package Ex05_Circilo;

public class Circulo {
    double raio;
    double calcularArea;
    double calcularCircunferencia;
    
    double calcularArea(){
        return Math.PI * raio * raio;
        }
    double calcularCircunferencia(){
        return Math.PI * 2 * raio;
    }
}
