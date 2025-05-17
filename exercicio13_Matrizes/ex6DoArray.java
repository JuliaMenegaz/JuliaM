package exercicio13_Matrizes;

import java.util.Arrays;

public class ex6DoArray {
    public static void main(String[] args) {
        int[][] matriz1 = {{1,2,3},{4,5,6}};
        int[][] matriz2 = {{7,8,9},{10,11,12}};
        
        int[][] resultado = new int[2][3];
        
        for(int linha = 0; linha < 2; linha++) {
            for(int coluna = 0; coluna < 3; coluna++){
                resultado[linha] [coluna] = matriz1[linha][coluna] + matriz2 [linha][coluna];
                
            }
        }
        System.out.println(Arrays.deepToString(resultado));
    }
}
