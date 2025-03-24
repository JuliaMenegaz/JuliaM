package Exercicio8;

import java.util.HashSet;
import java.util.Set;

public class AT8 {
    public static void main(String[] args) {
        Set<String> cidades = new HashSet<>();
        
        cidades.add("RS");
        cidades.add("SP");
        cidades.add("BF");
        cidades.add("PA");
        cidades.add("SC");
        
        for(String cidade : cidades){
            System.out.println(cidade); 
        }
        if(cidades.contains("SP")){
            System.out.println("\n Estado SP encontrado");
        }
    }

}
