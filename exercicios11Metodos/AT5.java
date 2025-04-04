/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Júlia
 */
public class AT5_31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("## Programa para contar vogais em uma string ##");
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        
        int resultado = contarVogais(texto);
        
        System.out.println("O texto contem "+resultado+" vogais");
    }

    public static int contarVogais(String texto) {
        int cont = 0;
        for(int i = 0; i < texto.length(); i++) {
            char vogal = texto.charAt(i);
            if(vogal == 'a' || vogal == 'e' || vogal == 'i'|| vogal == 'o'|| vogal == 'u'){
                cont++;
            }
        }
        return cont;
    }                                    
}
