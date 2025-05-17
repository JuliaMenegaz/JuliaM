
import java.util.Scanner;

public class AT24 {
    public class SubstituiVogais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (ehVogal(c)) {
                resultado.append('*');
            } else {
                resultado.append(c);
            }
        }

        System.out.println("Texto com vogais substituidas:");
        System.out.println(resultado.toString());

        sc.close();
    }

    public static boolean ehVogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
}
