/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_aula3;

/**
 *
 * @author Júlia
 */
public class FuncionarioHorista implements Pagavel {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista() {
        this.valorHora = 10.0;
        this.horasTrabalhadas = 5;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    

    @Override
    public double calcularPagamento() {
        System.out.println("Valor: "+this.calcularPagamento());
        return valorHora * horasTrabalhadas;
    }
    
}
