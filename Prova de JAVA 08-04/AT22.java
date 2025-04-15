
import java.util.Scanner;

public class AT22 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("\nMaior numero de cada coluna:");
        for (int j = 0; j < 4; j++) {
            int maior = matriz[0][j];
            for (int i = 1; i < 4; i++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("Coluna " + j + ": " + maior);
        }

        sc.close();
    }
}

