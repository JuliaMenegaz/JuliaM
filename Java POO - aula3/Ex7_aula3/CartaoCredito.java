/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex7_aula3;

/**
 *
 * @author Júlia
 */
public class CartaoCredito implements FormaPagamento{
    private double cartao;

    public CartaoCredito() {
        this.cartao = 2000.0;
    }

    public double getCartao() {
        return cartao;
    }

    public void setCartao(double cartao) {
        this.cartao = cartao;
    }

    @Override
    public double efetuarPagamento() {    
        System.out.println("Valor: "+this.efetuarPagamento());
        return cartao;
    }
}
