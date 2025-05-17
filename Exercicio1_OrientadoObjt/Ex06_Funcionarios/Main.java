package Ex06_Funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Funcionarios funcionarios1 = new Funcionarios();
        
        System.out.println("Qual o seu nome");
        funcionarios1.nome = sc.nextLine();
        
        System.out.println("Qual o seu departamento");
        funcionarios1.departamento = sc.nextLine();
        
        System.out.println("Qual o seu salario");
        funcionarios1.salario = sc.nextDouble();
        
        funcionarios1.aumentarSalario(200);
    }
}
