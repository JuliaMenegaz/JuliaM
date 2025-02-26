package Exercicios2;

import java.util.Scanner;

public class AT8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        double n1 = teclado.nextDouble();
        
        boolean m7 = (n1%7==0);
        boolean m3 = (n1%3==0);
        
        System.out.println("O numero e multiplo de 3: "+ m3);
        System.out.println("O numero e multiplo de 7: "+ m7);
    }
    
}
