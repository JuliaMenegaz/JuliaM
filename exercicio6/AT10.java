package Exercicio6;

import java.util.ArrayList;

public class AT10 {
    public static void main(String[] args) {
        
        ArrayList<String> NomeAnimais = new ArrayList<>();
        
        ArrayList<String> NomeAnimais2 = new ArrayList<>();
        
        NomeAnimais.add("Lobo");
        NomeAnimais.add("Tigre");
        NomeAnimais.add("Pantera");
        NomeAnimais.add("Urso");
        
        System.out.println("Nome de animais!");
        for(String nome : NomeAnimais) {
            NomeAnimais2.add(nome);
        }
        
        for(String nome2 : NomeAnimais2) {
            System.out.println(nome2);
        }
    }

}
