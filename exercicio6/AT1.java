package Exercicio6;

import java.util.ArrayList;

public class AT1 {
    public static void main(String[] args) {
        
        ArrayList<String> ListadeNomes = new ArrayList<>();
        
        ListadeNomes.add("Osorio");
        ListadeNomes.add("Tramandai");
        ListadeNomes.add("Jaquirana");
        ListadeNomes.add("Imbe");
        ListadeNomes.add("Novo Hamburgo");
        
        System.out.println("Lista de Cidades");
        for(String nome : ListadeNomes){
            System.out.println(nome);
        }
        
    }

}
