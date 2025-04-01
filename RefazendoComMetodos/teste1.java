package ex11Refazendo_comMetodos;

import java.util.Scanner;

public class teste1 {
    public static int somar(int n1, int compra){
        if(n1 == 1){
            System.out.println("O desconto fica: "+compra*0.05);
        }else{
            System.out.println("O desconto fica: "+compra*0.13);
        }
        return compra;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor da sua compra: ");
        int compra = sc.nextInt();
        
        System.out.println("Qual o seu sexo [1=mulher 2=homen]?");
        int n1 = sc.nextInt();
        
        somar(n1,compra);
    }

}
