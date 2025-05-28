package Ex4_Aula2;

public class Main {
    public static void main(String[] args) {
        
        Livros l1 = new Livros("Thor", "BlaBla", 2000);
        
        l1.setDisponivel(false);
        l1.status();
    }
}
