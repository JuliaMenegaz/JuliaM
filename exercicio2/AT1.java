package Exercicios2;

import java.util.Scanner;

public class AT1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("PAR OU IMPAR");
        System.out.println("Digite um numero: ");
        double numero = teclado.nextDouble();
        
        boolean par = (numero % 2 == 0);
        
        System.out.println("O numero e: " + par);
        
    }
    
}
