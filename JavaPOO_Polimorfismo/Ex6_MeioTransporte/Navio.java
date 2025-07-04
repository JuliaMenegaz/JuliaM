package Ex6_MeioTransporte;

public class Navio extends MeioTransporte{
    private String mover;

    public Navio() {
        this.mover = mover;
    }
    
    @Override
    public String mover() {
        System.out.println("O navio está navegando!");
        return mover;
    }

}
