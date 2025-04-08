package com.mycompany.aula1.aula;

public class Matriz1dificil {
    public static void main (String[] args) {
        
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}                
        };
        
        int soma = calcularSoma(matriz);
        System.out.println("Soma dos elementos da matriz: " + soma);       
    }
    
    public static int calcularSoma(int[][] matriz) {
        int soma = 0;
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j ++) {
                soma += matriz1[j];
            }
        }
        return soma;
    }
}