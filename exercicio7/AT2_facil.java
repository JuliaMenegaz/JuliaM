package Exercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AT2_facil {
    public static void main(String[] args) {
      List<String> letras = new ArrayList<>();
      Scanner teclado = new Scanner (System.in);
        
        System.out.println("Palavras minusculas: ");
        for(int i = 0; i < 5; i++){
        System.out.println("Digite a "+(i+1)+" palavra em letras minusculas ");
        String palavra = teclado.nextLine().toUpperCase();
        letras.add(palavra);
        }
        
        System.out.println("Sua palavra em maiuscula fica: "+ letras); 
    }
}
