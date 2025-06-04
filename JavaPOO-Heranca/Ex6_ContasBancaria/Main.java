package Ex6_ContasBancaria;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Corrente(1234, 20000);
        Conta p1 = new Poupanca(1234, 20000);
        Conta i1 = new Investimento(1234, 20000);
        
        System.out.println("Numero da Conta: "+c1.getNumeroConta()+"| Saldo: "+c1.getSaldo());
        System.out.println("Numero da Conta: "+p1.getNumeroConta()+"| Saldo: "+p1.getSaldo());
        System.out.println("Numero da Conta: "+i1.getNumeroConta()+"| Saldo: "+i1.getSaldo());
    }

}
