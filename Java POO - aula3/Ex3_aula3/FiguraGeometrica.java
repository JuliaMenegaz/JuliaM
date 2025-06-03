/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3_aula3;

/**
 *
 * @author Júlia
 */
public class FiguraGeometrica implements Figura{
    private double areaCirculo;
    private double calcularPerimetro;
    private double raio;

    public FiguraGeometrica() {
        this.areaCirculo = raio;
        this.calcularPerimetro = raio;
        this.raio = 5.3;
    }

    public double getareaCirculo() {
        return areaCirculo;
    }

    public void setareaCirculo(double areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

    public double getcalcularPerimetro() {
        return calcularPerimetro;
    }

    public void setcalcularPerimetro(double calcularPerimetro) {
        this.calcularPerimetro = calcularPerimetro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
 
    @Override
    public void areaCirculo() {
        if(areaCirculo == Math.PI * raio * raio){
            System.out.println("Area do circulo: "+this.areaCirculo);
        }else{
            System.out.println("Nao foi possivel calcular.");
        }
    }

    @Override
    public void calcularPerimetro() {
        if(calcularPerimetro == raio * raio){
            System.out.println("Perimetro: "+this.calcularPerimetro);
        
        }else{
            System.out.println("Nao foi possivel calcular.");
        }
    }

    @Override
    public void raio() {
        System.out.println("Valor do raio: "+this.raio);
    }
    
    
   
}
