package EX2_EX17_Livro;

import EX2_EX14_Casa.Pessoas_casa;

/**
 *
 * @author ADM
 */
public class Livro {

    String titulo;
    String autor;
    int ano;

    public Livro(String t, String a) {

        this.titulo = t;
        this.autor = a;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public Livro(String t, String au, int a) {

        this.titulo = t;
        this.autor = au;
        this.ano = a;

    }

    public void status() {

        System.out.println(" Informacoes sobre o livro");
        System.out.println("Volume: " + this.getTitulo());
        System.out.println("Canal: " + this.getAutor());
        System.out.println("Proprietario: " + getAno());

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    
}
