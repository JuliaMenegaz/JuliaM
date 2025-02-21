
package com.mycompany.exercicio1;

import java.util.Scanner;

public class AT8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o valor da compra: ");
        double valor = teclado.nextDouble();
        
        double desconto = (valor*0.05);
        
        double desconto2 = valor-desconto;
        
        System.out.printf("O valor com desconto ficou: R$ %.2f",desconto2);
    }
    
}
