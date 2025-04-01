package Exercicio11_Metodos;

import java.util.Scanner;

public class AT3 {
    public static int somar(int n1, int f){
       
        return (n1 * 9/5) + 32;
    }
    
      public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          
          System.out.println("Digite um temperatura em Graus Celsius: ");
          int n1 = sc.nextInt();
        int f = 0;
         
          somar(n1,f);
          System.out.println("r: "+f);
          }
          
    
      
}
