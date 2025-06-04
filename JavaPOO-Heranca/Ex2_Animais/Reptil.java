package Ex2_Animais;

public class Reptil extends Animal{
    private String nome;
    private int idade;

    public Reptil(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
        
    
}
