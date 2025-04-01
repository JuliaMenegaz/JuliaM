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
public class ex1_soma2numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("## programa para somar dois numeros inteiros ##");
        
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        
        // utilizando o metodo de calcular a soma 
        int resultado = somar(n1,n2);
        
        System.out.println("A soma de "+n1+" e "+n2+" e "+resultado);
    }

    public static int somar(int n1, int n2) {
        return n1+n2;
    }
    
}
