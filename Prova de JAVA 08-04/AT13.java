
import java.util.Scanner;

public class AT13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite uma frase: ");
         String frase = sc.nextLine();
         
         if (frase.toLowerCase().contains("java")) {
             System.out.println("A frase comtem a palavra 'java'");
         }else{
             System.out.println("A frase nao comtem a palavra 'java'");
            
        }
    }
}
