
import java.util.Scanner;

public class AT37 {
    public class SistemaDeCompra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Digite a quantidade de produtos: ");
        int quantidadeProdutos = sc.nextInt();
        
        double total = 0;
       
        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.print("Digite o preço do produto " + i + ": R$ ");
            double preco = sc.nextDouble();
            total += preco; 
        }
        System.out.printf("Total a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
}
