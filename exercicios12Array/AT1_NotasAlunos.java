package Exercicio12Array;

import java.util.Scanner;

public class AT1_NotasAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double [5];
        double media = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota do aluno "+(i+1)+" :");
            notas[i] = sc.nextDouble();
            media += notas[i];
        }
        media /= notas.length;
        System.out.println("Media das notas: "+media);
        

        
//        double[] notas = {8.5 , 9.0 , 7.5 , 6.0 , 10.0};
//        double media = 0;
//        
//        for(double nota : notas){
//            media += nota;
//        }
//        media /= notas.length;
//        System.out.println("Media das notas: "+media);
    }
}
    