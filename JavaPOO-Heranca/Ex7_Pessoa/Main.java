package Ex7_Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa a1 = new Aluno("Julia", 18, "Mariluz");
        Pessoa p1 = new Professor("Julia", 18, "Mariluz");
        Pessoa f1 = new Funcionario("Julia", 18, "Mariluz");
        
        System.out.println("Nome: "+a1.getNome()+"| Idade: "+a1.getIdade()+"| Endereco: "+a1.getEndereco());
        System.out.println("Nome: "+p1.getNome()+"| Idade: "+p1.getIdade()+"| Endereco: "+p1.getEndereco());
        System.out.println("Nome: "+f1.getNome()+"| Idade: "+f1.getIdade()+"| Endereco: "+f1.getEndereco());
    }
}
