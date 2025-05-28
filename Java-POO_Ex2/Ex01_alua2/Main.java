package Ex01_alua2;

public class Main {
    public static void main(String[] args) {
        // Criando objeto da classe pessoa
        Pessoa p1 = new Pessoa("Bryan",18,1.54);
        
        System.out.println("\nInformaç~ões da Pessoa:");
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("Altura: "+p1.getAltura());
    }
}
