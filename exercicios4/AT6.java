package Exercicios4;

import java.util.Scanner;

public class AT6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);
        
        System.out.println("Digite um numero:");
        int numero = teclado.nextInt();
        
        System.out.println("Digite um caractere:");
        char c = teclado2.next().charAt(0);
        
        for(int i = 1; i <= numero; i++){
            System.out.println(c);
            
    }

}}
