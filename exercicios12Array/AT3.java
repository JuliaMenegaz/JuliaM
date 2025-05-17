package Exercicio12Array;

public class AT3 {
    public static void main(String[] args) {
        int[] numeros = {5, 1, 3, 7, 15, 8, 9};
        
        int maior = 10;
        
        for(var numero : numeros){
            if(numero >= maior){
                System.out.println("O maior numero e: "+numero);
            }
    }
}}
