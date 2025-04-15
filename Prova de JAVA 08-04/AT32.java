
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AT32 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];
        
        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("digite um numero "+(i+1));
            numeros[i] = sc.nextInt();
        }
        
        int[] duplicados = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            duplicados[i] = numeros[i];
        }
        System.out.println("Os numeros duplicados sao: "+Arrays.toString(duplicados));
    }

}
    

