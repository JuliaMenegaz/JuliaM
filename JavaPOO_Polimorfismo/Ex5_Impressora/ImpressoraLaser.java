package Ex5_Impressora;

public class ImpressoraLaser extends Impressora{
    private String imprimir;

    public ImpressoraLaser() {
        this.imprimir = imprimir;
    }

    @Override
    public String imprimir() {
        System.out.println("Imprimindo a Laser!");
        return imprimir;
    }

}
