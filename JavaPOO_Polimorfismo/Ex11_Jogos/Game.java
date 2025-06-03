package Ex11_Jogos;

public class Game extends Jogo{
    private String iniciarJogo;
    private String jogar;
    private String finalizarJogo;

    public Game() {
        this.iniciarJogo = iniciarJogo;
        this.jogar = jogar;
        this.finalizarJogo = finalizarJogo;
    }
    
    @Override
    public String iniciarJogo() {
         System.out.println("Jogo de Video Game Iniciado . . .");
        return iniciarJogo;
    }

    @Override
    public String Jogar() {
        System.out.println("Jogando!");
        return jogar;
    }

    @Override
    public String finalizarJogo() {
        System.out.println("Jogo de Video Game finalizado . . .");
        return finalizarJogo;
    }

}
