package Exercicio6;

import java.util.ArrayList;

public class AT11 {
    public static void main(String[] args) {
         ArrayList<Integer> NumerosAleatorios = new ArrayList<>();
         
       NumerosAleatorios.add(1);
       NumerosAleatorios.add(2);
       NumerosAleatorios.add(2);
       NumerosAleatorios.add(3);
       NumerosAleatorios.add(4);
       NumerosAleatorios.add(5);
       NumerosAleatorios.add(6);
       NumerosAleatorios.add(7);
       NumerosAleatorios.add(7);
       NumerosAleatorios.add(8);
       
       NumerosAleatorios.remove(1);
       NumerosAleatorios.remove(7);
       
       System.out.println("Lista de nomes:");
       for(int numero : NumerosAleatorios) {
           System.out.println(numero);
       }
    }

}
