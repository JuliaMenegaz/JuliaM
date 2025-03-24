package Exercicio8;

import java.util.HashSet;
import java.util.Set;

public class AT4 {
    public static void main(String[] args) {
        Set<String> cidades = new HashSet<>();
        
        cidades.add("POA");
        cidades.add("Imbe");
        cidades.add("Xangrila");
        cidades.add("Tramandai");
        cidades.add("Taquara");
        
        System.out.println("A lista esta vazia?"+cidades.isEmpty());
    }

}
