
package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT13 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Qual o seu nome? ");
        String nome = teclado.nextLine();
        
        System.out.println("Qual a sua primeira nota? ");
        double n1 = teclado.nextDouble();
        
        System.out.println("Qual a sua primeira nota? ");
        double n2 = teclado.nextDouble();
        
        double media = (n1+n2)/2;
        
        if (media<7) {
            System.out.println("Voce reprovou!");
        
        }else{ 
            System.out.println("Voce passou!");
        }
        
    }
    
}
