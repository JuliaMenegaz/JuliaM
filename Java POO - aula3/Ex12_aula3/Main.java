/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex12_aula3;

/**
 *
 * @author Júlia
 */
public class Main {
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();
        Tecnico t1 = new Tecnico();
        
        g1.calcularSalario();
        v1.calcularSalario();
        t1.calcularSalario();
    }
}
