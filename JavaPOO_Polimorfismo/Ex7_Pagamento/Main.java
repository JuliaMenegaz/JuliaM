package Ex7_Pagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento c1 = new Cartao();
        Pagamento b1 = new Boleto();
        Pagamento p1 = new Pix();
        
        c1.processarPagamento();
        b1.processarPagamento();
        p1.processarPagamento();
    }

}
