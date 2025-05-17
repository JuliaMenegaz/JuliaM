
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AT35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o "+(i+1)+" nome");
            String nome = sc.nextLine();
        }
            while(true){
           String entrada = sc.nextLine().trim();
           if(entrada.equalsIgnoreCase("fim")){
               break;
              
           }
           }  
         nomes.sort((Comparator<? super String>) nomes);
//         System.out.println("Array ordenado:");
//        for(String nome : nomes) {
//            System.out.println(nome);
//        }     
    }
    }
