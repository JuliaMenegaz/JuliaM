
import java.util.Arrays;

public class AT39 {
    public class VerificarAnagramas {
    public static boolean saoAnagramas(String palavra1, String palavra2) {
        if (palavra1.length() != palavra2.length()) {
            return false;
        }
        char[] array1 = palavra1.toLowerCase().toCharArray();
        char[] array2 = palavra2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
    public static void main(String[] args) {
        String palavra1 = "Roma";
        String palavra2 = "Amor";

        if (saoAnagramas(palavra1, palavra2)) {
            System.out.println(palavra1 + " e " + palavra2 + " sao anagramas.");
        } else {
            System.out.println(palavra1 + " e " + palavra2 + " NAO sao anagramas.");
        }
    }
}
}
