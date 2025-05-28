/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex7_aula3;

/**
 *
 * @author Júlia
 */
public class Dinheiro implements FormaPagamento{
    private double dinheiro;

    public Dinheiro() {
        this.dinheiro = 3000.0;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public double efetuarPagamento() {
        System.out.println("Valor: "+this.efetuarPagamento());
        return dinheiro;
    }
    
}
