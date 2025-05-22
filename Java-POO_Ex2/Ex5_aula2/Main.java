package Ex5_aula2;

public class Main {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Blusa", 20.00, 200);
        
        p1.setDisponivel(false);
        p1.status();
    }
}
