package Ex5_Impressora;

public class ImpressoraJatoTinta extends Impressora{
    private String imprimir;

    public ImpressoraJatoTinta() {
        this.imprimir = imprimir;
    }

    @Override
    public String imprimir() {
        System.out.println("Imprimindo com jato de tinta!");
        return imprimir;
    }
    
    
}
