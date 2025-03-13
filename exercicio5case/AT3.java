package exercicio5case;

import java.util.Scanner;

public class AT3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int n1 = 0;
        
        System.out.println("Digite o lado do triangulo:");
        int c1 = teclado.nextInt();
        System.out.println("Digite o lado do triangulo:");
        int c2 = teclado.nextInt();
        System.out.println("Digite o lado do triangulo:");
        int c3 = teclado.nextInt();
        
        if((c1 == c2) && (c1 == c3) && (c3 == c2)) {
            n1 = 1;
        }else if((c1 == c2) && (c1 != c3) && (c3 != c2)) {
            n1 = 2;
        }else if((c1 != c2) && (c1==c3) && (c3 != c2)) {
            n1 = 2;
        }else if((c1 != c2) && (c1 != c3) && (c3 == c2)) {
            n1 = 2;
        }else if((c1 != c2) && (c1 != c3) && (c3 != c2)) {
            n1 = 3;
        }
        switch(n1){
            case 1:
              System.out.println("Equilatero");
                break;
            case 2:
              System.out.println("Isosceles");
                break;
            case 3:
              System.out.println("Escaleno");
                break;
            default:
                System.out.println("Numero invalido");
             break;   
        }
        
        
    }
    
}
