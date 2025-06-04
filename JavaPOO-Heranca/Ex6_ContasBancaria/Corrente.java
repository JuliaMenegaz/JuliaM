package Ex6_ContasBancaria;

public class Corrente extends Conta{
    private int numeroConta;
    private int saldo;

    public Corrente(int numeroConta, int saldo) {
        super(numeroConta, saldo);
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
