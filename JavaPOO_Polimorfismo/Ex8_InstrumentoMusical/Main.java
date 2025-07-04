package Ex8_InstrumentoMusical;

public class Main {
    public static void main(String[] args) {
        InstrumentoMusical g1 = new Guitarra();
        InstrumentoMusical p1 = new Piano();
        InstrumentoMusical b1 = new Bateria();
        
        g1.tocar();
        p1.tocar();
        b1.tocar();
    }

}
