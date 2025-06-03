package Ex6_MeioTransporte;

public class Aviao extends MeioTransporte{
    private String mover;

    public Aviao() {
        this.mover = mover;
    }
    
    @Override
    public String mover() {
        System.out.println("O aviao está voando!");
        return mover;
    }

}
