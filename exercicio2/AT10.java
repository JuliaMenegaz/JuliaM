package Exercicios2;

import java.util.Scanner;

public class AT10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        double n1 = teclado.nextDouble();
        
        boolean r = (n1>=100 || n1<=200);
        
        System.out.println("O numero esta entre [100,200]: "+ r);
       
    }
    
}
