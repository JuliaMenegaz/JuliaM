package Ex10_Pessoas;

public class Professor extends Pessoa{
    private String apresentar;

    public Professor() {
        this.apresentar = apresentar;
    }
    
    @Override
    public String apresentar() {
        System.out.println("Olá eu sou o professor Léo!");
        return apresentar;
    }
}
