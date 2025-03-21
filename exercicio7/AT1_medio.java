package Exercicio7;

public class AT1_medio {
    public static void main(String[] args) {
        
        int[] numeros = {5, 10, 25, 30, 15, 8, 9};
        
        int maior = 10;
        
        for(var numero : numeros){
            if(numero >= maior){
                System.out.println("Os numeros maiores sao: "+numero);
            }
        }
    }
}
