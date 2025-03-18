package Exercicio6;

import java.util.ArrayList;

public class AT3 {
    public static void main(String[] args) {
        ArrayList<String> ListadeNomes = new ArrayList<>();
        
        ListadeNomes.add("1");
        ListadeNomes.add("2");
        ListadeNomes.add("3");
        ListadeNomes.add("4");
        ListadeNomes.add("5");
        
        System.out.println("Lista de numeros");
        for(String nome : ListadeNomes){
        System.out.println(nome);
        }
        
        String primeiroNome = ListadeNomes.get(2);
        System.out.println("O terceiro numero e: "+primeiroNome);

        }
    }


