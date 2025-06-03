package Ex8_InstrumentoMusical;

public class Bateria extends InstrumentoMusical{
    private String tocar;

    public Bateria() {
        this.tocar = tocar;
    }
    
    @Override
    public String tocar() {
        System.out.println("Tum Dum Dum Pa!");
        return tocar;
    }

}
