package ex11Refazendo_comMetodos;

import java.util.Scanner;

public class teste3 {
    public static int soma(int n1,int n2){
    if(n1 > n2){
        System.out.println("O primeiro numero e maior!");
    }else if(n1 < n2){
        System.out.println("O segundo numero e maior!");
    }else{
        System.out.println("Os dois numeros sao iguais!");
    }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        
        System.out.println("Digirte o segundo numero: ");
        int n2 = sc.nextInt();
        
        soma(n1,n2);
    }

}
