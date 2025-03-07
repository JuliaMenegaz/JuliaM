package Exercicios4;

import java.util.Random;
import java.util.Scanner;

public class AT10 {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner teclado = new Scanner(System.in);
        
        int numero = rm.nextInt(100); //
        int tentativas = 0;
        int palpite = 0;
        
        System.out.println("Tente adivimhar um numero de 1 e 100!");
        
        for(tentativas = 1; tentativas <= 7; tentativas++) {
            System.out.println("Tentativas "+tentativas+": ");
            palpite = teclado.nextInt();
            
            if(palpite == numero){
                System.out.println("Parabens! voce acertou em "+tentativas+" tentativas!");
                break;
            }else if(palpite < numero) {
                System.out.println("O numero e maior");
            }else{
                System.out.println("O numero e menor");
            }
            
                
            }
            if(palpite != numero){
                System.out.println("Voce nao conseguiu adivinhar o numero.\nO numero era "+numero);
        }
    }

}
