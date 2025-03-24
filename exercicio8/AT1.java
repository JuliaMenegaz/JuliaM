package Exercicio8;

import java.util.HashSet;
import java.util.Set;

public class AT1 {
    public static void main(String[] args) {
        
        Set<Integer> numeros = new HashSet<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        
        for(int numero : numeros){
            System.out.println(numero);
        }
        
        if(numeros.contains(5)){
            System.out.println("Tem o numero 5 na lista");
        }
    }
}
