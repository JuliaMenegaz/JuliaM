package Exercicio6;

import java.util.ArrayList;

public class AT15 {
    public static void main(String[] args) {
        ArrayList<String> NomesAleatorios = new ArrayList<>();
        
       NomesAleatorios.add("Lobo");
       NomesAleatorios.add("Julia");
       NomesAleatorios.add("Palavra");
       NomesAleatorios.add("Leao");
       NomesAleatorios.add("Corda");
       NomesAleatorios.add("Fruta");
       
       int tamanho = NomesAleatorios.size(); 
       
        for (int i = 0; i < tamanho / 2; i++) {  
        String temp = NomesAleatorios.get(i);  
        NomesAleatorios.set(i, NomesAleatorios.get(tamanho - 1 - i));  
        NomesAleatorios.set(tamanho - 1 - i, temp); 
        
            
        }
        
        System.out.println(NomesAleatorios);
    }

}
