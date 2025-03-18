package Exercicio6;

import java.util.ArrayList;

public class AT14 {
    public static void main(String[] args) {
        
        ArrayList<String> NomesAleatorios = new ArrayList<>();
        
       NomesAleatorios.add("Lobo");
       NomesAleatorios.add("Julia");
       NomesAleatorios.add("Palavra");
       NomesAleatorios.add("Leao");
       NomesAleatorios.add("Corda");
       NomesAleatorios.add("Fruta");
       NomesAleatorios.add("Gruta");
       NomesAleatorios.add("Bruta");
       NomesAleatorios.add("Multa");
       NomesAleatorios.add("Lutar");
       
       NomesAleatorios.remove(0);
       NomesAleatorios.remove(1);
       NomesAleatorios.remove("Leao");
       
        System.out.println("Lista de nomes:");
       for(String nome : NomesAleatorios) {
           System.out.println(nome);
       }
    }

}
