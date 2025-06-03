/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5_aula3;

/**
 *
 * @author Júlia
 */
public class Main {
    public static void main(String[] args) {
        FuncionarioHorista sh = new FuncionarioHorista();
        FuncionarioAssalariado fa = new FuncionarioAssalariado();
        
        fa.calcularPagamento();
        sh.calcularPagamento();
    }
}
