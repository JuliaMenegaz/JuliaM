package Ex15_Midias;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica("Bohemian Rhapsody", 660, "Queen", "Bohemian Rhapsody");
        Filme meuFilme = new Filme("Meu malvado favorito", 148, "diretor do filme", "Animação");
        Jogo meuJogo = new Jogo("Castlevania SOTN", 660, "multiplataforma", 14);

        System.out.println("Música: " + minhaMusica.getTitulo() + " | Artista: " + minhaMusica.getArtista());
        System.out.println("Filme: " + meuFilme.getTitulo() + " | Diretor: " + meuFilme.getDiretor());
        System.out.println("Jogo: " + meuJogo.getTitulo() + " | Plataforma: " + meuJogo.getPlataforma()+ " | Classificação: "+meuJogo.getClassificacao());
    }
}

