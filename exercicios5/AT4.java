package EX5;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Fatorial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n1 = teclado.nextInt();

        while (n1 < 1) {
            System.out.println("Invalido");
            System.out.println("Digite um numero");
            n1 = teclado.nextInt();

        }

        long r1 = 1;
        for (int i = 1; i <= n1; i++) {
            r1 *= i;

        }

        System.out.println("O fatorial de " + n1 + " eh " + r1);

    }
}
