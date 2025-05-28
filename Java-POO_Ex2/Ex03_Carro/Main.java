package Ex03_Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Carro carro1 = new Carro();
        
        System.out.println("Qual a marca do carro");
        carro1.marca = sc.nextLine();
        
        System.out.println("Qual o modelo do carro");
        carro1.modelo = sc.nextLine();
        
        System.out.println("Qual o ano do seu carro");
        carro1.ano = sc.nextInt();
        
        System.out.println("Deseja ligar o carro? (s/n)");
        sc.nextLine();
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("s")){
            carro1.ligado();
        }
        sc.close();
    }
}
