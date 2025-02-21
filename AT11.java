
package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT11 {
    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite sua velocidade: ");
        double velocidade = teclado.nextDouble();
        
        double multa = (velocidade-80)*5;
        
        if (velocidade>80) {
            System.out.println("Voce foi multado no valor de :R$"+ multa);
            
        }else{ 
            System.out.println("Voce nao foi multado :) ");
        }
    }
}
