package Ex2_aula2;

public class Carro {
   private String marca;
   private String modelo;
   private int ano;
   private boolean ligar;
   
    public Carro(String m, String mod, int a) {
        this.marca = m;
        this.modelo = mod;
        this.ano = a;
        this.setLigar(true);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setMarca(String m) {
        this.marca = marca;
    }

    public void setModelo(String mod) {
        this.modelo = mod;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public void status() {
        System.out.println("# INFORMAÇÕES SOBRE A CANETA #");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("Ela está ligada? "+this.ligar);
    }

    
    }
    
   

