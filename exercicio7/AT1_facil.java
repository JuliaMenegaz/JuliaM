package Exercicio7;

public class AT1_facil {
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5};
        int soma = 0;

        for(int numero : numeros) {
            soma += numero;
            
        }
        System.out.println("Soma: "+soma);
    }

}
