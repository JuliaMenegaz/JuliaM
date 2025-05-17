
import java.util.Scanner;

public class AT38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total;
        int numeros;
        int cont = 0;
        
        System.out.println("Digite o total de numeros: ");
        total = sc.nextInt();
        
        for (int i = 0; i < total; i++) {
            System.out.println("Digite um numero "+(i+1)+" : ");
            numeros = sc.nextInt();
           
            if(numeros >= 20 && numeros <= 70){
               cont ++;
               
        }
        }
        System.out.println("A quantidade e: "+cont);
       
                
            }
        }
        
    


