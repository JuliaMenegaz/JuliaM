package exercicio13_Matrizes;

import java.util.Scanner;

public class AT5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = scanner.nextInt();
                      matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o valor do escalar: ");
        int escalar = scanner.nextInt();

        System.out.println("Matriz apos a multiplicacao por " + escalar + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= escalar;  // Multiplica o elemento pelo escalar
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
