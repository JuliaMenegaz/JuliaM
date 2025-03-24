package Exercicio8;

import java.util.HashSet;
import java.util.Set;

public class AT10 {
    public static void main(String[] args) {
        
    
    Set<String> animais = new HashSet<>();
        
      
        animais.add("Lobo");
        animais.add("Coelho");
        animais.add("Lebre");
        animais.add("Tigre");
        
        for(String animal : animais){
            System.out.println(animal);
        }
    }
}
    
