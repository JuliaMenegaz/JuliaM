package com.mycompany.aula1.aula;

import java.util.ArrayList;

/**
 *
 * @author Adm
 */
public class aula5 {
    
    public static void main(String[] args){
        
      //Criando um ArrayList de String
        ArrayList<String> listaDeLetras = new ArrayList<>();
        
      //Adicionando elementos ao ArrayList
        listaDeLetras.add("A");
        listaDeLetras.add("B");
        listaDeLetras.add("C");
        listaDeLetras.add("D");
      
        boolean estaVazia = listaDeLetras.isEmpty();
        System.out.println("A lista esta vazia? "+estaVazia);  
        
          int tamanho = listaDeLetras.size();
        System.out.println("\nTem "+tamanho+" letras impressas.");
        
    }
}