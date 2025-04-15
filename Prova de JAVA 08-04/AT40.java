
import java.util.Scanner;

public class AT40 {
    public class FraseMaisLonga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fraseMaisLonga = "";
        
        while (true) {
            System.out.print("Digite uma frase (ou 'sair' para finalizar): ");
            String frase = scanner.nextLine();

            if (frase.equalsIgnoreCase("sair")) {
                break;
            }
            if (frase.length() > fraseMaisLonga.length()) {
                fraseMaisLonga = frase;
            }
        }
        if (!fraseMaisLonga.isEmpty()) {
            System.out.println("A frase mais longa digitada foi:");
            System.out.println(fraseMaisLonga);
        } else {
            System.out.println("Nenhuma frase foi digitada.");
        }
        scanner.close();
    }
}
}
