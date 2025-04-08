package exercicio13_Matrizes;

public class AT3 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
    
        for(int linha = 0; linha < 3; linha++){
            System.out.println("");    
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[coluna][linha]+ "|");
            }
    
}
    }

}
