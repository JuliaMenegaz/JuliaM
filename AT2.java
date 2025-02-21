
package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT2 {
    
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner (System.in);
       
        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();
        
        System.out.println("O Antecessor e:" + (numero - 1) );
        System.out.println("O sucessor e: " + (numero + 1));
        
                
       
    }
    
}
