package Ex6_MeioTransporte;

public class Main {
    public static void main(String[] args) {
        MeioTransporte c1 = new Carro();
        MeioTransporte a1 = new Aviao();
        MeioTransporte n1 = new Navio();
        
        c1.mover();
        a1.mover();
        n1.mover();
    }

}
