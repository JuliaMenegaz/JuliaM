package Exercicio8;

import java.util.HashSet;
import java.util.Set;

public class AT9 {
    public static void main(String[] args) {
        Set<String> letras = new HashSet<>();
        
        for(char c='a'; c<='f';c++){
        
        letras.add("a");
        letras.add("b");
        letras.add("c");
        letras.add("d");
        letras.add("e");
        letras.add("f");
        } 
        System.out.println("Na lita tem:" +letras.size());
    }
}
