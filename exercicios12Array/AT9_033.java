/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online;

import java.util.Arrays;

/**
 *
 * @author Júlia
 */
public class AT9_033 {
    public static void main(String[] args) {
         String[] nomes = {"Maria", "Joao", "Ana", "Pedro", "Lucas", "Carlos"};
         
        Arrays.sort(nomes);
         System.out.println("Array ordenado:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
