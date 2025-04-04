/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online;

import java.util.Arrays;

/**
 *
 * @author Júlia
 */
public class AT7_03 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int numeroParaProcurar = 7;

        boolean encontrado = Arrays.stream(numeros).anyMatch(num -> num == numeroParaProcurar);

        if (encontrado) {
            System.out.println("O numero " + numeroParaProcurar + " foi encontrado no array.");
        } else {
            System.out.println("O numero " + numeroParaProcurar + " não foi encontrado no array.");
        }
    }

    }

