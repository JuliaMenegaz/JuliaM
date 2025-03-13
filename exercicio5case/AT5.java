package exercicio5case;

import java.util.Scanner;

public class AT5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int n1 = 0;
        
        System.out.println("Qual a sua altura?");
        double altura = teclado.nextDouble();
        
        System.out.println("Qual o seu peso?");
        double peso = teclado.nextDouble();
        
        double imc = peso / (altura*altura);
        
        if (imc<18.5) {
            n1 = 1;

        }else if (imc<25) {
            n1 = 2;
            
        }else if (imc<30) {
            n1 = 3;
            
        }else if (imc<40) {
            n1 = 4;
            
        }else if (imc>40) { 
            n1 = 5;
        }
        
        switch(n1){
        case 1:
                System.out.println("Abaixo do peso");
                break;
        case 2:
                System.out.println("Peso Ideal");
                break;
        case 3:
                System.out.println("Sobrepeso");
                break;
        case 4:
                System.out.println("Obesidade");
                break;
        case 5:
                System.out.println("Obesidade Morbida");
                break;
        default:
                System.out.println("Nao temos essa opcao no menu!");
                break;
        
    }

}}
