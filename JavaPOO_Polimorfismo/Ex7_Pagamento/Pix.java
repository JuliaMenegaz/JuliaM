package Ex7_Pagamento;

public class Pix extends Pagamento{
    private String processarPagamento;

    public Pix() {
        this.processarPagamento = processarPagamento;
    }
    
    @Override
    public String processarPagamento() {
        System.out.println("Pagamento em Pix aprovado!");
        return processarPagamento;
    }

}
