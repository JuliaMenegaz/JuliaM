package Ex1_aula3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    ContaCorrente cc = new ContaCorrente(100);
    
        System.out.println("Bem-vindo ao SISTEMA BANCARIO");
        while(true){
            System.out.println("\nEscolha uma opcao");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao){
            case 1:
            System.out.println("Informe o valor para deposito:");
            double deposito = sc.nextDouble();
            cc.depositar(deposito);
            break;
            case 2:
                System.out.println("Informe o valor para saque");
                double saque = sc.nextDouble();
                cc.sacar(saque);
                break;
            case 3:
                System.out.println("Saldo atual: "+cc.getSaldo());
                break;
            case 4:
                System.out.println("Obrigado por usar o SISTEMA BANCARIO");
                sc.close();
                return;
            default:
                System.out.println("Opcao invalida. Tente novamente!");
            }
        }
    }
}
