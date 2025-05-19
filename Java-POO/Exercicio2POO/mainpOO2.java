package Exercicio2POO;

public class mainpOO2 {

    public static void main(String[] args) {
        contabancaria conta1 = new contabancaria();
        conta1.numeroconta = "12345-6";
        conta1.titular = "Bryan";
        conta1.saldo = 20.0;
        
        conta1.depositar(200.0);
        conta1.sacar(50.0);
       
        
    }
    
}