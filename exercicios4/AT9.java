package Exercicios4;

import java.util.Scanner;

public class AT9 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner (System.in);
        
            System.out.println("Digite um numero:");
            double numero = teclado.nextDouble();
            double maior = numero;
            double menor = numero;
            
            for(int i=2; i<=7; i++) {
            System.out.println("Digite o numero "+i+ ": ");
            numero =teclado.nextDouble();
            if(numero>= maior) {
                maior = numero;
            }
            if(numero <= menor){
                menor = numero;
            }
            System.out.println("O maior valor e: "+maior);
            System.out.println("O menor valor e: "+menor);
            
            }
    
    }
}


