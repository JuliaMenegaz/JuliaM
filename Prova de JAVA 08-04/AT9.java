
import java.util.HashSet;
import java.util.Scanner;

public class AT9 {
    public static void main(String[] args) {
        HashSet<String> animais = new HashSet<>();
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite nomes deb animais (digite 'fim' para encerrae): ");
         
         while(true){
           String entrada = sc.nextLine().trim();
           if(entrada.equalsIgnoreCase("fim")){
               break;
           }else if(!animais.add(entrada)){
               System.out.println("Duplicata detectada: "+entrada);
           }
         }
               for(String animal : animais){
                   System.out.println(animal);
               }
               sc.close();
           
           
    }
    }

