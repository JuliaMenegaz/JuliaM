package Ex2_Animais;

public class Main {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero("Perry", 70);
        Ave a1 = new Ave("Águia", 5);
        Reptil r1 = new Reptil("Cobra", 18);
        
        System.out.println("Nome: "+m1.getNome() +" | Idade: "+m1.getIdade());
        System.out.println("Nome: "+a1.getNome() +" | Idade: "+a1.getIdade());
        System.out.println("Nome: "+r1.getNome() +" | Idade: "+r1.getIdade());
    }
}
