
import java.util.Scanner;

public class AT16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         
        int desconto = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome do produto "+(i+1));
            String nome = sc.nextLine();
            
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o preco "+(i+1));
            int preco = sc.nextInt();
            desconto = preco;
            if(desconto <= 50){
                System.out.println("produtos com desconto:"+desconto);
            }else if(desconto > 50){
                System.out.println("Produtos sem desconto: "+desconto);
            }
            
    }
        
    }}
