package Ex5_DispositivosEletronicos;

public class Not extends DispositivoEletronico{
    private String marca;
    private String modelo;

    public Not(String marca, String modelo) {
        super(marca, modelo);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
