package Ex08_Alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    
    Alunos alunos1 = new Alunos();
    double media = alunos1.calcularMedia(); 
    
        System.out.println("Qual o seu nome:");
        alunos1.nome = sc.nextLine();
        
        System.out.println("Qual a sua matricula:");
        alunos1.matricula = sc.nextInt();
        
        System.out.println("Qual a sua nota:");
        alunos1.notas = sc.nextDouble();
        
        
        System.out.println("A media de notas e:"+media);
    }
}
