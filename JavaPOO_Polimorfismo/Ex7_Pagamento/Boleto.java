package Ex7_Pagamento;

public class Boleto extends Pagamento{
    private String processarPagamento;

    public Boleto() {
        this.processarPagamento = processarPagamento;
    }
    
    @Override
    public String processarPagamento() {
        System.out.println("Pagamneto em Boleto aprovado!");
        return processarPagamento;
    }

}
