package Ex6_aula2;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public void status(){ // Tambem chamadob de estado(como o objeto esta no momento)
        System.out.println("# INFORMAÇÕES SOBRE A CANETA #");
        System.out.println("Largura: "+this.getLargura());
        System.out.println("Altura: "+this.getAltura());
        
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void calcularArea(int area, int perimetro){
        if(area == altura*largura){
            System.out.println("A area do Retangulo é:"+area);
        }
    }
    public void calcularPerimetro(int perimetro, int area){
        if(perimetro == largura+altura * 2){
            System.out.println("O perimetro do Retangulo é:");
        }
    }
}
