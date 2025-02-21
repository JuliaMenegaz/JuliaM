package com.mycompany.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
      
        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite o seu salario: ");
        int salario = teclado.nextInt();
        
        System.out.println("Seu nome e: "+ nome);
        System.out.println("Seu salario e: "+ salario);
        
        
        
    }
}
