
package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite a altura da parede: ");
        double altura = teclado.nextDouble();
        
        System.out.println("Digite a largura da parede: ");
        double largura = teclado.nextDouble();
        
        double tinta = altura*largura / 2;
        
        System.out.println("E necessario " + tinta + " litros de tinta para pintar a parede : "  );
    }
}
