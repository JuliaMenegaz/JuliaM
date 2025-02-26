
package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT3 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        double numero = teclado.nextDouble();
        
        double dobro = numero * 2;
        
        double terca = numero / 3;
                
        System.out.println("O dobro do numero e: "+ dobro + " e a terca parte e : " + String.format("%.4f", terca));
    }
    
}
