package Ex3_Funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do gerente: ");
        String nomeGerente = sc.nextLine();
        System.out.println("Digite o salari0o do gerente: ");
        double salarioGerente = sc.nextDouble();
        
        Funcionario  gerente = new Gerente(nomeGerente, salarioGerente);
        
        sc.nextLine();// Limpar Buffer
        
         System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = sc.nextLine();
        System.out.println("Digite o salario do vendedor: ");
        double salarioVendedor = sc.nextDouble();
        System.out.println("Digite o numero de vendas");
        int vendasVendedor = sc.nextInt();
        
        
        Funcionario vendedor = new Vendedor(nomeVendedor, salarioVendedor, vendasVendedor);
        
        sc.nextLine();// Limpar Buffer
        
         System.out.println("Digite o nome do Desenvolvedor: ");
        String nomeDesenvolvedor = sc.nextLine();
        System.out.println("Digite o salario do desenvolvedor: ");
        double salarioDesenvolvedor = sc.nextDouble();
        
        Funcionario desenvolvedor = new Desenvolvedor(nomeDesenvolvedor, salarioDesenvolvedor);
        
        System.out.println("Bonus do gerente: R$"+gerente.calcularBonus());
        System.out.println("Bonus do vendedor: R$"+vendedor.calcularBonus());
        System.out.println("Bonus do desenvolvedor: R$"+desenvolvedor.calcularBonus());
        
    }
}
