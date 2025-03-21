package Exercicio7;

import java.util.ArrayList;

public class AT2_medio {
    public static void main(String[] args) {
        
       ArrayList<String> palavras = new ArrayList<>();
       
       palavras.add("Abelha");
       palavras.add("Jogo");
       palavras.add("Amem");
       palavras.add("Ola");
       palavras.add("Amor");
       
       for(String palavra : palavras){
         if(palavra.startsWith("A")){
             System.out.println("Tem "+palavra+" na lista:");
         }  
       }
    }

}
