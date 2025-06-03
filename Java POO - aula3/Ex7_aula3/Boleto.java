/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex7_aula3;

/**
 *
 * @author Júlia
 */
public class Boleto implements FormaPagamento{
    private double boleto;

    public Boleto() {
        this.boleto = 1000.0;
    }

    public double getBoleto() {
        return boleto;
    }

    public void setBoleto(double boleto) {
        this.boleto = boleto;
    }

    @Override
    public double efetuarPagamento() {
        System.out.println("Valor: "+this.efetuarPagamento());
        return boleto;
    }
    
}
