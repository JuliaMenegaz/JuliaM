package Exercicio12Array;

import java.util.Scanner;

public class AT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        char[] carac = palavra.toCharArray();
        
        for(int i = 0; i < carac.length / 2; i++){
            char temp = carac[i];
            carac[i] = carac[carac.length - 1 -i];
            carac[carac.length - 1 -i] = temp;
        }
        String palavraInvertida = new String(carac);
        System.out.println("Palavra invertida: "+palavraInvertida);
    }

    }

