
package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT10 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Quantas horas voce trabalhou?");
        double horas = teclado.nextDouble();
        
        double salario = horas*25;
        
        System.out.println("Seu salario é:R$"+ salario);
        
    }
    
}
