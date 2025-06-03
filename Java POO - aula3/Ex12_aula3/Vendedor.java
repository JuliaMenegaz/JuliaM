/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex12_aula3;

/**
 *
 * @author Júlia
 */
public class Vendedor implements Funcionarios{
    private double Vendas;
    private double valorVendas;

    public Vendedor() {
        this.Vendas = 6;
        this.valorVendas = 200;
    }

    public double getVendas() {
        return Vendas;
    }

    public void setVendas(double Vendas) {
        this.Vendas = Vendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    
    @Override
    public double calcularSalario() {
        return Vendas * valorVendas;
    }
    
}
