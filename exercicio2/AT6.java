package Exercicios2;

import java.util.Scanner;

public class AT6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double n1 = teclado.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        double n2 = teclado.nextDouble();
        
        if (n1>n2) {
            System.out.println("O primeiro numero e maior!");
            
        }else{  
            System.out.println("O segundo numero e maior!"); 
        }
    }
    
}
