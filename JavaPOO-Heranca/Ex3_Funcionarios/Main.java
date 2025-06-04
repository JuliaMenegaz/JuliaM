package Ex3_Funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente("Joao", 2000, "Operador");
        Funcionario v1 = new Vendedor("Pedro", 2500, "Vendedor");
        Funcionario d1 = new Desenvolvedor("Alex", 3000, "TI");
        
        System.out.println("Nome: "+g1.getNome()+"| Salario: "+g1.getSalario()+"| Cargo: "+g1.getCargo());
        System.out.println("Nome: "+v1.getNome()+"| Salario: "+v1.getSalario()+"| Cargo: "+v1.getCargo());
        System.out.println("Nome: "+d1.getNome()+"| Salario: "+d1.getSalario()+"| Cargo: "+d1.getCargo());
    }
}
