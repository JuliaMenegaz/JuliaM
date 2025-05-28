/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex7_aula3;

/**
 *
 * @author Júlia
 */
public class Main {
    public static void main(String[] args) {
        CartaoCredito cc = new CartaoCredito();
        Boleto b1 = new Boleto();
        Dinheiro d1 = new Dinheiro();
        
        cc.efetuarPagamento();
        b1.efetuarPagamento();
        d1.efetuarPagamento();
        
    }
}
