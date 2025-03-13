package exercicio5case;

import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
        
       System.out.println("------------------");
        System.out.println(" MENU DE BEBIDAS ");
        System.out.println("------------------");
        System.out.println("Escolha uma opcao:");
        System.out.println("[1] Agua");
        System.out.println("[2] Whisky");
        System.out.println("[3] Cerveja");
        System.out.println("[4] Tequila");
        int opcao = teclado.nextInt();
        String mensagem;
        
        switch(opcao){
            case 1:
                mensagem = "Voce escolheu Agua!" ;
                break;
            case 2:
                mensagem = "Voce escolheu Whisky!";
                break;
            case 3:
                mensagem = "Voce escolheu Cerveja!";
                break;
            case 4:
                mensagem = "Voce escolheu Tequila!";
                break;
            default:
                mensagem = "Nao temos essa opcao no menu!";
                break;
        }
        System.out.println("--------------------");
        System.out.println(mensagem);
        System.out.println("--------------------");
        
    }
}
