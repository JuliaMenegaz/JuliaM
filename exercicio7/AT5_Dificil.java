package Exercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class AT5_Dificil {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];
        
        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("digite um numero"+numeros);
            numeros[i] = sc.nextInt();
        }
        
        int[] duplicados = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            duplicados[i] = numeros[i] * 2;
        }
        System.out.println("Os numeros duplicados sao: "+Arrays.toString(duplicados));
    }

}
