package Exercicio6;

import java.util.ArrayList;

public class AT2Teste {
    public static void main(String[] args) {
        ArrayList<String> ListadeNumeros = new ArrayList<>();
        
        ListadeNumeros.add("1");
        ListadeNumeros.add("2");
        ListadeNumeros.add("3");
        ListadeNumeros.add("4");
        ListadeNumeros.add("5");
        ListadeNumeros.add("6");
        ListadeNumeros.add("7");
        ListadeNumeros.add("8");
        ListadeNumeros.add("9");
        ListadeNumeros.add("10");
        
        ListadeNumeros.remove(1);
         ListadeNumeros.remove(2);
          ListadeNumeros.remove(3);
           ListadeNumeros.remove(4);
            ListadeNumeros.remove(5);

        System.out.println("Lista de numeros");
        for(String nome : ListadeNumeros){
        System.out.println(nome);
    }
    }
}
