package Exercicio2POO;

public class contabancaria {
String numeroconta;
double saldo;
String titular;


void depositar(double valor) {
    saldo += valor ;
    System.out.println("Depósito de R$"+valor+" realizado com sucesso.\nNovo saldo: R$"+saldo);
    
}
        
void sacar(double valor) {
  if(valor <= saldo){
    saldo -= valor; 
      System.out.println("Saque de R$"+valor+" realizado com sucesso.\n Novo saldo: R#"+saldo);
  }else{
      System.out.println("Saldo para saque");
  }   
}
    
}
