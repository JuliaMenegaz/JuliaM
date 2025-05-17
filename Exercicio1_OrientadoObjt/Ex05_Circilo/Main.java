package Ex05_Circilo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Circulo circulo1 = new Circulo();
        double area = circulo1.calcularArea;
        double circunferencia = circulo1.calcularCircunferencia;
        
        System.out.println("Qual o raio do circulo?");
        circulo1.raio = sc.nextDouble();
        
        System.out.println("A area do circulo e: "+area);
        
        System.out.println("A circunferencia do circulo e: "+circunferencia);
    }
    
}
