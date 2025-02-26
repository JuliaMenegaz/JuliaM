package Exercicios2;

import java.util.Scanner;

public class AT2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um ano: ");
        double n1 = teclado.nextDouble();
        
        boolean bi = (n1%4==0) && (n1%100!=0) || (n1%400==0);
        boolean normal = (n1%100==0);
        
        System.out.println("O ano e bissexto: "+bi);
        System.out.println("O ano e normal: "+normal);
    }
    
}
