/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online;

import java.util.Scanner;

/**
 *
 * @author Júlia
 */
public class AT4_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero em graus celcius: ");
        int numero = sc.nextInt();
        
        int f = somar(numero);
        System.out.println("A convercao de "+numero+" em celcius e igual a: "+f);
    }
    public static int somar(int numero) {
        return numero*9/5 + 32;
}}
