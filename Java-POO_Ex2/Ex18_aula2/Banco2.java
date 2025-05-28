package EX2_EX18_Banco;

/**
 *
 * @author ADM
 */
public class Banco2 {

     String titular;
    double conta, saldo;
 
    public Banco2 (String t , double c, double s){
    
        this.titular=t ;
        this.conta=c;
        this.saldo=s;
    
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a caneta ");
        System.out.println("Modelo: "+this.getTitular());
        System.out.println("Ponta: "+ this.getConta());
         System.out.println("Ponta: "+ this.getSaldo());
        
    
    }

    void depositar (double valor){
    saldo += valor;
    System.out.println("Deposito de R$"+valor+" realizado com sucesso.\nNovo saldo: R$"+saldo);
    
}
    
    void sacar (double valor){
    saldo -= valor;
    System.out.println("O saque de R$"+valor+" foi realizado com sucesso.\nNovo saldo: R$"+saldo);
    
}
    
    
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
}
