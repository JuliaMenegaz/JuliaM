package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT9 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de dias que voce quer alugar: ");
        double dias = teclado.nextDouble();
        
        System.out.println("Digite a quilometragem que voce vai percorrer: ");
        double quilometragem = teclado.nextDouble();
        
        double total = (dias*90)+(quilometragem*0.20);
        
        System.out.println("O tota do aluguel e: "+ total);
        
    }
    
}
