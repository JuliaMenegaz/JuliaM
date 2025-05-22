package Ex02_aula2;

public class contaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public contaBancaria(int nc, double s, String t) {
        this.numeroConta = nc;
        this.saldo = s;
        this.titular = t;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            System.out.println("Depósito de R$"+valor+" realizado com sucesso!");
        }else{
            System.out.println("Valor de depósito inválido");
        }
        
    }
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo-= valor;
            System.out.println("Saque de R$"+valor+" realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }
    public void exibirInformacoes(){
        System.out.println("\nTitulo: "+titular);
        System.out.println("Numero da conta: "+numeroConta);
        System.out.println("Saldo atual: R$"+saldo);
    }
}
