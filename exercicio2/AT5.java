package Exercicios2;

import java.util.Scanner;

public class AT5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        double numero = teclado.nextDouble();
        
        boolean resultado = (numero>= 10) && (numero <20);
        
        System.out.println("O numero: "+ resultado);
    }
    
}
