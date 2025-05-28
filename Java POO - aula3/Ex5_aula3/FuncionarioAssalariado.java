/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_aula3;

/**
 *
 * @author Júlia
 */
public class FuncionarioAssalariado implements Pagavel{
    private double salarioMensal;

    public FuncionarioAssalariado(double salarioMensal) {
        this.salarioMensal = 2000.0;
    }
    
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public double calcularPagamento() {
        System.out.println("Valor: "+this.calcularPagamento());
        return salarioMensal;
        
    }
    
}
