package Exercicio8;

import java.util.HashSet;
import java.util.Set;

public class AT2 {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Manga");
        frutas.add("Melao");
        frutas.add("Kiwi");
        
        frutas.remove("Kiwi");
        
        for(String fruta : frutas){
            System.out.println(fruta);
        }
    }

}
