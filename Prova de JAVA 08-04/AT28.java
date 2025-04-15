public class AT28 {
     public static void main(String[] args) {
        int primaria = 0;
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
            if(linha == coluna){
                primaria = primaria+matriz[linha][coluna];
            }
            
            }
        }
        System.out.println(primaria);
     }
}
            
