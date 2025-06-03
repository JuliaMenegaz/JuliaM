package Ex7_Pagamento;

public class Cartao extends Pagamento{
    private String processarPagamento;

    public Cartao() {
        this.processarPagamento = processarPagamento;
    }
    
    @Override
    public String processarPagamento() {
        System.out.println("Pagamento em cartão aprovado!");
        return processarPagamento;
    }

}
