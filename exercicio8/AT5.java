package Exercicio8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AT5 {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();
        
        cores.add("Roxo");
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Rosa");
        cores.add("Vermelho");
        
        List<String> listaCores = new ArrayList<>(cores);
        System.out.println(cores);
    }

}
