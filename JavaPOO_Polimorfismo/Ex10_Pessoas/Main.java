package Ex10_Pessoas;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Professor();
        Pessoa a1 = new Aluno();
        Pessoa f1 = new Funcionario();
        
        p1.apresentar();
        a1.apresentar();
        f1.apresentar();
    }

}
