package Ex15_Midias;

public class Filme extends Midia{
    private String diretor, genero;
    
    public Filme(String titulo, int duracao, String diretor, String genero) {
        super(titulo, duracao);
        this.diretor = diretor;
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

