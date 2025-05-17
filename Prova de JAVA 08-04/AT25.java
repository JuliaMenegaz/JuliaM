
import java.util.HashSet;

public class AT25 {
public class VerificaLetrasRepetidas {

    public static boolean temLetrasRepetidas(String palavra) {
        HashSet<Character> letras = new HashSet<>();

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            
            if (letras.contains(c)) {
                return true; 
            }

            letras.add(c); 
        }
        return false;     }

    public static void main(String[] args) {
        String palavra = "programa";
        if (temLetrasRepetidas(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" tem letras repetidas.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" NÃO tem letras repetidas.");
        }
    }
}
}
