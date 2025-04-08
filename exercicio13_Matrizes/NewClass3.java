package com.mycompany.aula1.aula.kok;

/**
 *
 * @author Adm
 */
public class NewClass3 {
    public static void main(String[] args) {
        
        int[][] tabuada = new int [11] [11];
        
        for (int linha = 1; linha < 11; linha++){
            for (int coluna = 1; coluna < 11; coluna++){
                tabuada[linha][coluna] = linha * coluna;                
            }
        }
        System.out.println("A tabuada de 1 a 10");
        for (int linha = 1; linha < 11; linha++){
            System.out.println("\nTabuada do "+linha+"\n");
            for (int coluna = 1; coluna < 11; coluna++){
                System.out.println(linha+ " x " +coluna+ " = " +tabuada[linha][coluna]);
                
                
                
         }     
      }  
   }
}
