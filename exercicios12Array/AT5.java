package Exercicio12Array;

import java.util.Arrays;

public class AT5 {
    public static void main(String[] args) {
        String[]naipes = {"Copas","Ouros","Paus","Espadas"};
        String[]valores = {"As","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
        String[]baralho = new String [52];
        
        int indice = 0;
        
        for(String naipe : naipes){
            for(String valor : valores){
                baralho[indice++] = valor + " de " + naipe;
                
            }
        }
        System.out.println(Arrays.toString(baralho));
    }
}
