
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Júlia
 */
public class AT3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;
        
        System.out.println("Digite um numero inteiro positivo: ");
        numero = teclado.nextInt();
        
        while(numero <=0){
            System.out.println("Numero invalido \n Digite um numero positivo:");
            numero = teclado.nextInt();
        }
        int cont = 1;
        while(cont <= 10){
            System.out.println(numero + "X" +cont+ " = "+ (numero*cont));
            cont++;
        }
        
    }
    
}
