package Ex4_Aula2;

public class Livros {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livros(String t, String a, int ap) {
        this.titulo = t;
        this.autor = a;
        this.anoPublicacao = ap;
        this.setDisponivel(true);
    }
    
     public void status(){ // Tambem chamadob de estado(como o objeto esta no momento)
        System.out.println("# INFORMAÇÕES SOBRE O LIVRO #");
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Autor: "+this.getAnoPublicacao());
        System.out.println("Ele está disponivel? "+this.getDisponivel());
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public void setAnoPublicacao(int ap) {
        this.anoPublicacao = ap;
    }

    public void setDisponivel(boolean d) {
        this.disponivel = d;
    }


    }

