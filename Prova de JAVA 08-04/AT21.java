
import java.util.Random;

public class AT21 {
    public class NumerosAleatorios {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        
        System.out.println("Numeros gerados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; 
            System.out.print(numeros[i] + " ");
        }

        
        System.out.println("\nMultiplos de 4:");
        for (var num : numeros) {
            if (num % 4 == 0) {
                System.out.println(num);
            }
        }
    }
    }
}
