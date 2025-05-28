/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex12_aula3;

/**
 *
 * @author Júlia
 */
public class Gerente implements Funcionarios{
    private double diasTrabalhados;
    private double valorDia;

    public Gerente() {
        this.diasTrabalhados = 6;
        this.valorDia = 300;
    }

    public double getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(double diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    @Override
    public double calcularSalario() {
        return diasTrabalhados * valorDia;
        
    }
    
}
