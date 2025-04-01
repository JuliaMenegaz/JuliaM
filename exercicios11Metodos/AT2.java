package Exercicio11_Metodos;

import java.util.Scanner;

public class AT2 {
   

    public static int somar(int n1) {
        if(n1%2 == 0){
            String f1 = "true";
            System.out.println("O numero e par "+f1);
        }else{
            String f2 ="false";
            System.out.println("O numero e par "+f2);
        }
        return n1;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("## PAR OU IMPAR ##");
            
            System.out.println("Digite um numero: ");
            int n1 = sc.nextInt();
            
            somar(n1);
        }
        
    
    }

