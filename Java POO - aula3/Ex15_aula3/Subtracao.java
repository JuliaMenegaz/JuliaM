/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex15_aula3;

/**
 *
 * @author Júlia
 */
public class Subtracao implements OperacaoMatematica{
    private double A;
    private double B;

    public Subtracao() {
        this.A = 5.0;
        this.B = 5.0;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }
    
    @Override
    public double calcular() {
        System.out.println("R: "+this.calcular());
        return A - B;
    }
    
}
