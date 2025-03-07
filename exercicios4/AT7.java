package Exercicios4;

import java.util.Scanner;

public class AT7 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
         Scanner teclado2 = new Scanner (System.in);
         
        System.out.println("Digite o numero inicial:");
        int n1 = teclado.nextInt();
        
        System.out.println("Digite o numero final:");
        int n2 = teclado.nextInt();
        
        System.out.println("Digite um caractere:");
        String c = teclado2.nextLine();
        
        for(int i = n1; i <= n2; i++) {
            
        }
        System.out.println(c+ " e o caractere e a soma e:"+ (n1 + n2));
    }

}
