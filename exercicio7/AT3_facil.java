package Exercicio7;

import java.util.ArrayList;

public class AT3_facil {
    public static void main(String[] args) {
        
        ArrayList<Integer> Numeros = new ArrayList<>();
        
        int[] numeros = {10, 25, 5, 30, 15};
        
        int maior = 0;
        
        for(int numero : numeros) {
            if(numero > maior){
                maior = numero;
            }
        }
        System.out.println("O maior numero e: "+ maior);
    }

}
