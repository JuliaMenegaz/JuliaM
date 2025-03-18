package Exercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class AT7 {
    public static void main(String[] args) {
        
        ArrayList<Integer> NumerosAleatorios = new ArrayList<>();
        
        NumerosAleatorios.add(1);
        NumerosAleatorios.add(5);
        NumerosAleatorios.add(2);
        NumerosAleatorios.add(4);
        NumerosAleatorios.add(3);
        NumerosAleatorios.add(6);
        NumerosAleatorios.add(8);
        NumerosAleatorios.add(7);
        NumerosAleatorios.add(10);
        NumerosAleatorios.add(9);
        
        Collections.sort(NumerosAleatorios);
        
        System.out.println("Lista de numeros");
        for(int numero : NumerosAleatorios){
            System.out.println(numero);
        }
    }
}
