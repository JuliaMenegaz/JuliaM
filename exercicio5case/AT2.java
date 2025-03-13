package exercicio5case;

import java.util.Scanner;

public class AT2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("------------------");
        System.out.println("  DIA DA SEMANA  ");
        System.out.println("------------------");
        System.out.println("Digite um numero de 1 a 7:");
        System.out.println("[1] Segunda");
        System.out.println("[2] Terca");
        System.out.println("[3] Quarta");
        System.out.println("[4] Quinta");
        System.out.println("[5] Sexta");
        System.out.println("[6] Sabado");
        System.out.println("[7] Domingo");
        int opcao = teclado.nextInt();
        String mensagem;
        
        switch(opcao){
            case 1:
                mensagem = "Hoje e Segunda" ;
                break;
            case 2:
                mensagem = "Hoje e Terca";
                break;
            case 3:
                mensagem = "Hoje e Quarta";
                break;
            case 4:
                mensagem = "Hoje e Quinta";
                break;
            case 5:
                mensagem = "Hoje e Sexta";
                break;
            case 6:
                mensagem = "Hoje e Sabado";
                break;
            default:
                mensagem = "Hoje e Domingo";
        }
        System.out.println("----------");
        System.out.println(mensagem);
        System.out.println("----------");
    }

}
