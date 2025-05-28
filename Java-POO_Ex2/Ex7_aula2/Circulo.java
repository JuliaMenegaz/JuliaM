package Ex7_aula2;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
        public void status(){ // Tambem chamadob de estado(como o objeto esta no momento)
        System.out.println("# INFORMAÇÕES SOBRE A CANETA #");
        System.out.println("Raio: "+this.getRaio());
        System.out.println("Area: "+this.calcularArea());
        System.out.println("Perimetro: "+this.calcularCircunferencia());
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calcularArea(){
        return Math.PI * raio * raio;  
    }
    public double calcularCircunferencia(){
        return 2 * Math.PI * raio;
    }
}
