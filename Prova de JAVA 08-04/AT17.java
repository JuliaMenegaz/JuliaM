public class AT17 {
public static void main(String[] args) {
        int primaria = 0,secundaria = 0;
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        for (int linha = 0; linha < 3; linha++) {
            secundaria = secundaria + matriz[linha][3-1-linha];
            
        }
        System.out.println(secundaria);
}
}
