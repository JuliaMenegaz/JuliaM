package Ex11_Jogos;

public class Main {
    public static void main(String[] args) {
        Jogo t1 = new Tabuleiro();
        Jogo c1 = new Cartas();
        Jogo g1 = new Game();
        
        System.out.println("## Jogo de Tabuleiro ##");
        t1.iniciarJogo();
        t1.Jogar();
        t1.finalizarJogo();
        
        System.out.println("\n## Jogo de Cartas ##");
        c1.iniciarJogo();
        c1.Jogar();
        c1.finalizarJogo();
        
        System.out.println("\n## Jogo de Video Game ##");
        g1.iniciarJogo();
        g1.Jogar();
        g1.finalizarJogo();
    }
}
