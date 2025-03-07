package Exercicios4;

import java.util.Scanner;

public class AT8 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner (System.in);
        int media = 0;
        
        for(int i = 1; i <=5; i++) {
            System.out.println("Digite uma idade:");
            int idade = teclado.nextInt();
            media += idade;
            
            System.out.println("A media das idades e: "+media/5);
    }

}}
