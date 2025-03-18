package Exercicio6;

import java.util.ArrayList;

public class AT12 {
    public static void main(String[] args) {
        
        ArrayList<String> NomesAleatorios = new ArrayList<>();
        ArrayList <String> NomesAleatorios2 = new ArrayList<>();
        
        NomesAleatorios.add("Julia");
        NomesAleatorios.add("Joao");
        NomesAleatorios.add("Ze");
        NomesAleatorios.add("Alice");
        NomesAleatorios.add("Bruna");
        
        NomesAleatorios2.add("Rosa");
        NomesAleatorios2.add("Julia");
        NomesAleatorios2.add("Pedro");
        NomesAleatorios2.add("Ketlin");
        NomesAleatorios2.add("Alice");
        
        System.out.println("Lista 1");
        for(String nome : NomesAleatorios) {
            System.out.println(nome);
        }
        
        System.out.println("Lista 2");
        for(String nome2 : NomesAleatorios2) {
            System.out.println(nome2);
        }
    }

}
