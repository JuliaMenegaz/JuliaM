package EX2_EX12_Porta;

import EX2_EX3_Carro.Carro;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Porta Por = new Porta();

        System.out.println("\nDeseja abrir a porta?  (s/n)");

        teclado.nextLine();
        String opcao = teclado.nextLine();
        if (opcao.equalsIgnoreCase("s")) {
            opcao = teclado.nextLine();
            Por.Abrir();
        }

        System.out.println("\nDeseja fechar a porta?  (s/n)");

        String opcao2 = teclado.nextLine();
        if (opcao2.equalsIgnoreCase("s")) {
            opcao2 = teclado.nextLine();
            Por.desligar();

        }

        teclado.close();

        Por.status();

    }

}
