package Exercicios4;

import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner (System.in);
        int soma = 0;
        
         System.out.println("Digite um valor");
            int valor = teclado.nextInt();
        
        for(int i = 1; i <=10; i++) {
           
            soma += valor;
            
            System.out.println(valor+" + "+i+" = "+soma); 
    }

}}
