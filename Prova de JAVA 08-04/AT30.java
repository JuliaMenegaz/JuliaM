
import java.util.HashSet;
import java.util.Set;

public class AT30 {
 public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        Set<String> frutas2 = new HashSet<>();
        
        
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maca");
        
        frutas2.add("Morango");
        frutas2.add("Pera");
        frutas2.add("Limao");
        frutas2.add("Morango");
        
        for(String fruta : frutas){ 
            System.out.println(fruta);
           
            }
         for(String fruta2 : frutas2){ 
            System.out.println(fruta2);
        }
 }
}
