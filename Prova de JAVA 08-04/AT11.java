
import java.util.Scanner;

public class AT11 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite um numero: ");
         int numero = sc.nextInt();
         
         double raiz = Math.sqrt(numero);
         int raizInteira = (int) raiz;
         
         if(raizInteira * raizInteira == numero){
             System.out.println(numero+" e um quadrado perfeito");
         }else{
             System.out.println(numero+" nao e um quadrado perfeito");
         }
         sc.close();
    }
}
