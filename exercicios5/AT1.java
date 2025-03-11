/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author Júlia
 */
public class AT1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int soma = 0;
        int cont = 0;
        
        System.out.println("Escreva sua idade: ");
        int idade = teclado.nextInt();
        
        while(idade >= 0) {
            soma += idade;
            cont++;
            System.out.println("Escreva sua idade (digite -1 para encerrar)");
            idade = teclado.nextInt();
        }
        if(cont >= 0) {
            double media = soma/cont;
            System.out.println("A media da idade e: "+media);
        }else{
            System.out.println("Nenhuma idade informada");
        }
        
    }
}
