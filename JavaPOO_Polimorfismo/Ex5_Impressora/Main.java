package Ex5_Impressora;

public class Main {
    public static void main(String[] args) {
        
        Impressora i1 = new ImpressoraJatoTinta();
        Impressora i2 = new ImpressoraLaser();
        
        i1.imprimir();
        i2.imprimir();
    }
}
