package com.mycompany.aula1.aula;

import java.util.ArrayList;

/**
 *
 * @author Adm
 */
public class aula4 {
    
    public static void main(String[] args){
        
      //Criando um ArrayList de String
        ArrayList<String> listaDeNomes = new ArrayList<>();
        
      //Adicionando elementos ao ArrayList
        listaDeNomes.add("Vermelho");
        listaDeNomes.add("Verde");
        listaDeNomes.add("Azul");
        listaDeNomes.add("Amarelo");
        
        listaDeNomes.remove("Amarelo");
        
        System.out.println("Lista de Cores: ");
        for(String nome : listaDeNomes){
        System.out.println(nome);
        }
        
        boolean contemAmarelo = listaDeNomes.contains("Amarelo");
        System.out.println("Na lista de cores contem a cor Amarela? "+contemAmarelo);

    }
}








