package Ex6_MeioTransporte;

public class Carro extends MeioTransporte{
    private String mover;

    public Carro() {
        this.mover = mover;
    }

    @Override
    public String mover() {
        System.out.println("O carro está rodando!");
        return mover;
    }

}
