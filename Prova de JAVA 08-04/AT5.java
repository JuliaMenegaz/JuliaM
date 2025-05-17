
import java.util.Scanner;

public class AT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total;
        int idade;
        int cont = 0;
        
        System.out.println("Digite o total de pessoas: ");
        total = sc.nextInt();
        
        for (int i = 0; i < total; i++) {
            System.out.println("Digite sua "+(i+1)+" idade: ");
            idade = sc.nextInt();
           
            if(idade >= 18 && idade <= 30){
               cont ++;
               
        }
        }
        System.out.println("A quantidade e: "+cont);
        
    }
}
