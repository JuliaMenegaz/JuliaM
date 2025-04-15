
import java.util.Scanner;

public class AT23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maior;
        
        System.out.println("Quantos valore voce quer digitar: ");
        int total = sc.nextInt();
        
        for (int i = 0; i < total; i++) {
            System.out.println("Numero "+(i+1));
            int numero = sc.nextInt();
            maior = numero;
            if(maior >= numero){
                System.out.println("O maior numero e: "+maior);
            }
            sc.close();
        }
    }
}
