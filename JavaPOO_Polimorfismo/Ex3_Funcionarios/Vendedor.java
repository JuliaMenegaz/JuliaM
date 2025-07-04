package Ex3_Funcionarios;

public class Vendedor extends Funcionario{
    private int vendas;

    public Vendedor(String nome, double salario, int vendas) {
        super(nome, salario);
        this.vendas = vendas;
    }

    @Override
    public double calcularBonus() {
        return vendas * 10.0;
    }
    
    
}
