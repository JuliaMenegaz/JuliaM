
package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o valor em real: ");
        double real = teclado.nextDouble();
        
        double dolar = real / 5.45;
        
        System.out.printf("A convercao em Dolares e: %.2f", dolar);
        
    }
    
}
