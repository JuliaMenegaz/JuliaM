package ex11Refazendo_comMetodos;

import java.util.Scanner;

public class teste2 {
    public static int soma(int distancia){
        
       if(distancia<=200){
           System.out.println("Valor da passagem: RS"+distancia*0.50);
       }else{
           System.out.println("Valor da passagem: RS"+distancia*0.45);
       }
        return distancia;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a distancia que voce vai percorrer? ");
        int distancia = sc.nextInt();
        
        soma(distancia);
    }

}
