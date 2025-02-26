package Exercicios2;

import java.util.Scanner;

public class AT9 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite a sua nota: ");
        double nota = teclado.nextDouble();
        
        System.out.println("Digite a sua frequencia: ");
        double frequencia = teclado.nextDouble();
        
        if (frequencia>=75 && nota>=60) {
        System.out.println("Voce foi aprovado");
        
        }else{
        System.out.println("Voce foi reprovado");        
    }
        
                
        
    }
    
}
