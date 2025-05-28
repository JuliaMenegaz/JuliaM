package Ex01_alua2;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    
    // Constructor
    public Pessoa(String n, int i, double a) {
        this.nome = n;
        this.idade = i;
        this.altura = a;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
