
package com.mycompany.exercicio1;

import java.util.Scanner;


public class AT12 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite sua idade: ");
        double idade = teclado.nextDouble();
        
        if (idade>=16) {
            System.out.println("Voce pode votar!");
            
        }else{ 
            System.out.println("Voce nao pode voltar!" );
        }  
    } 
}
