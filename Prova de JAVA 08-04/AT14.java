
import java.util.Scanner;

public class AT14 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
         
        System.out.println("------------------");
        System.out.println(" MENU DO PROGRAMA ");
        System.out.println("------------------");
        System.out.println("Escolha uma opcao:");
        System.out.println("[1] Cadastrar");
        System.out.println("[2] Listar");
        System.out.println("[3] Sair");
        int opcao = teclado.nextInt();
        
        do{
            if(opcao == 1){
                System.out.println("Voce foi cadastrado");
            }else if(opcao == 2){
                System.out.println("Abrindo Lista");
            }else if(opcao == 3){
                System.out.println("Saindo do programa");
                
            }
        }while(opcao == 4);
        }
    }
