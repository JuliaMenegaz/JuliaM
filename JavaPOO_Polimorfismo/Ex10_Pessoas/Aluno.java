package Ex10_Pessoas;

public class Aluno extends Pessoa{
    private String apresentar;

    public Aluno() {
        this.apresentar = apresentar;
    }
    
    @Override
    public String apresentar() {
        System.out.println("Olá eu sou o aluno João");
        return apresentar;
    }

}
