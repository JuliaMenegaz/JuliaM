
import java.util.Scanner;

public class AT34 {
    public class MatrizMenorNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        int menorNumero = matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < menorNumero) {
                    menorNumero = matriz[i][j];
                }
            }
        }
        System.out.println("O menor numero da matriz e: " + menorNumero);

        sc.close();
    }
}
}
