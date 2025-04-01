package ex11Refazendo_comMetodos;

import java.util.Scanner;

public class teste4 {
    public static int soma(int media, int n1, int n2){
        media = (n1+n2)/2;
        if(media >=7){
            System.out.println("Aluno aprovado!");
        }else if(media>5 && media<6){
            System.out.println("Aluno em recuperacao!");
        }else{
            System.out.println("Aluno reprovado!");
        }
        return media;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota: ");
        int n1 = sc.nextInt();
        
        System.out.println("Digite sua segunda nota: ");
        int n2 = sc.nextInt();
        
        int media = (n1+n2)/2;
        
        soma(media,n1,n2);
    }
}
