package Exercicios4;

import java.util.Scanner;

public class AT1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um numero:");
        int numero = teclado.nextInt();
        
         for (int i = 1; i <= 10; i++) {
             System.out.println(numero +" x " +i+ "="+numero*i);
         }
        
    }

}
