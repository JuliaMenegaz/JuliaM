package Exercicio8;

import java.util.HashSet;
import java.util.Set;

public class AT7 {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();
        
        cores.add("Vermelho");
        cores.add("Roxo");
        cores.add("Rosa");
        cores.add("Azul");
        
        for(String cor : cores){ 
            System.out.println(cor);
        }
        if(cores.contains("Vermelho")){
            System.out.println("\n Cor vermelho encontrada");
        }
    }

}
