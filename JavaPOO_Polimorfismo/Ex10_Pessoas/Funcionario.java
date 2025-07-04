package Ex10_Pessoas;

public class Funcionario extends Pessoa{
    private String apresentar;

    public Funcionario() {
        this.apresentar = apresentar;
    }
    
    @Override
    public String apresentar() {
        System.out.println("Olá eu sou o funcionario José!");
        return apresentar;
    }

}
