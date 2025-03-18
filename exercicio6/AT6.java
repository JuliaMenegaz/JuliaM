package Exercicio6;

import java.util.ArrayList;

public class AT6 {
    public static void main(String[] args) {
        ArrayList<String> Frutas = new ArrayList<>();
        
        Frutas.add("Pera");
        Frutas.add("Maca");
        Frutas.add("Melancia");
        Frutas.add("Uva");
        Frutas.add("Banana");
        
        System.out.println("Lista de frutas:");
        for(String nome : Frutas) {
            System.out.println(nome);
        
        Frutas.set(2, "Morango");
        }
    }
}
