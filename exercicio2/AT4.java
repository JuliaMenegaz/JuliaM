package Exercicios2;

import java.util.Scanner;

public class AT4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Qual o valor de a: ");
        double a = teclado.nextDouble();
        
        System.out.println("Qual o valor de b: ");
        double b = teclado.nextDouble();
        
        double hip = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("O resultado e: "+ hip);
    }
    
}
