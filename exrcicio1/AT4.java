package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT4 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite a distancia em metros: ");
        double metro = teclado.nextDouble();
        
        double quilometros = metro / 1000;
        
        double centimetros = metro * 100;
        
        System.out.println("A convercao em Quilometros e: " + quilometros );
        System.out.println("A convercao em Centimetros e: " + centimetros );
       
    }
    
}
