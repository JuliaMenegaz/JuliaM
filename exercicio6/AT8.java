package Exercicio6;

import java.util.ArrayList;

public class AT8 {
    public static void main(String[] args) {
        
        ArrayList<String> paises = new ArrayList<>();
        
        paises.add("Brasil");
        paises.add("Russia");
       paises.add("Alemanha");
       paises.add("ira");
       paises.add("Polonia");
       
       for(int i = 0; i < paises.size(); i ++) {
        System.out.println("Pais "+ (i + 1) + ": " + paises.get(i));
    }
    }

}
