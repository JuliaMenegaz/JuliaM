package exercicio5case;

import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um numero:");
        int n1 = teclado.nextInt();
        System.out.println("Digite um numero:");
        int n2 = teclado.nextInt();
        
       System.out.println("------------------");
        System.out.println(" MENU DO PROGRAMA ");
        System.out.println("------------------");
        System.out.println("Escolha uma opcao:");
        System.out.println("[1] Adicao");
        System.out.println("[2] Subitracao");
        System.out.println("[3] Divisao");
        System.out.println("[3] Multiplicacao");
        int opcao = teclado.nextInt();
        String mensagem;
        
        switch(opcao){
            case 1:
                mensagem = "R="+(n1+n2) ;
                break;
            case 2:
                mensagem = "R="+ (n1-n2);
                break;
            case 3:
                mensagem = "R="+ (n1%n2);
                break;
            default:
                mensagem = "R="+ (n1*n2);
                break;
        }
        System.out.println("----------");
        System.out.println(mensagem);
        System.out.println("----------");
    }
}
