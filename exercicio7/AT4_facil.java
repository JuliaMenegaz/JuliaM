package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class AT4_facil {
    public static void main(String[] args) {
        
        ArrayList<Double> notas = new ArrayList<>();
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Quantos numeros voce vai somar? ");
        int tamanho = teclado.nextInt();
        
        int[] numeros = new int [tamanho];
        
        System.out.println("Digite os numero: ");
        for(int i = 0; i < tamanho; i++) {
            System.out.println("Numero "+(i+1)+": ");
            numeros[1] = teclado.nextInt();
        }
        int media = 0;
        for(int num : numeros) {
            media += num;
        }    
        
        System.out.println("A media dos numeros e: "+media);
        
    }

}
