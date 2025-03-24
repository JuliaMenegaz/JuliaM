package Exercicio8;

import java.util.HashSet;
import java.util.Set;

public class AT3 {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.clear();
//        for (int numero : numeros) {
//            System.out.println(numero);

            //
            System.out.println("A lista esta vazia: " + numeros.isEmpty());
        }
    }


