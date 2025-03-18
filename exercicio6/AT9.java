package Exercicio6;

import java.util.ArrayList;

public class AT9 {
    public static void main(String[] args) {
        ArrayList<Integer> NumerosDuplicados = new ArrayList<>();
        
        NumerosDuplicados.add(1);
        NumerosDuplicados.add(2);
        NumerosDuplicados.add(2);
        NumerosDuplicados.add(3);
        NumerosDuplicados.add(4);
        NumerosDuplicados.add(5);
        NumerosDuplicados.add(5);
        NumerosDuplicados.add(6);
        NumerosDuplicados.add(7);
        NumerosDuplicados.add(8);
        
         System.out.println("Lista de Numeros");
        for(int numero : NumerosDuplicados){
        System.out.println(numero);
        }
        int tamanho = NumerosDuplicados.size();
        System.out.println("\n Na nossa sala possuem "+tamanho+" alunos.");
    }
}
