/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex12_aula3;

/**
 *
 * @author Júlia
 */
public class Tecnico implements Funcionarios{
    private double horasTabalhadas;
    private double valorHora;

    public Tecnico() {
        this.horasTabalhadas = 6;
        this.valorHora = 10;
    }

    public double getHorasTabalhadas() {
        return horasTabalhadas;
    }

    public void setHorasTabalhadas(double horasTabalhadas) {
        this.horasTabalhadas = horasTabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTabalhadas * valorHora;
    }
    
}
