
import java.util.Scanner;

public class AT19 {
    public static int contarPalavras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }

        int contador = 0;
        boolean dentroDePalavra = false;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                if (!dentroDePalavra) {
                    dentroDePalavra = true;
                    contador++;
                }
            } else {
                dentroDePalavra = false;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String entrada = sc.nextLine();

        int totalPalavras = contarPalavras(entrada);
        System.out.println("Numero de palavras: " + totalPalavras);

        sc.close();
    }
}
