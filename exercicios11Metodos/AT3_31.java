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
public class AT3_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        
        System.out.println("O fatorial de "+numero+" e: "+calcularFatorial(numero));
        sc.close();
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for(int i = 2; i <= numero; i++){
            fatorial *= i;
        }
        return fatorial;
        
        
    }
            
    
}
