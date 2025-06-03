/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex8_aula3;

/**
 *
 * @author Júlia
 */
public class ControleVeiculo implements Veiculos{
    private String acelerar;
    private String freiar;
    private String virarEsquerda;
    private String virarDireita;

    public ControleVeiculo() {
        this.acelerar = acelerar;
        this.freiar = freiar;
        this.virarEsquerda = virarEsquerda;
        this.virarDireita = virarDireita;
    }
    public String getAcelerar() {
        return acelerar;
    }

    public void setAcelerar(String acelerar) {
        this.acelerar = acelerar;
    }

    public String getFreiar() {
        return freiar;
    }

    public void setFreiar(String freiar) {
        this.freiar = freiar;
    }

    public String getVirarEsquerda() {
        return virarEsquerda;
    }

    public void setVirarEsquerda(String virarEsquerda) {
        this.virarEsquerda = virarEsquerda;
    }

    public String getVirarDireita() {
        return virarDireita;
    }

    public void setVirarDireita(String virarDireita) {
        this.virarDireita = virarDireita;
    }

    @Override
    public void acelerar() {
        System.out.println("Voce acelerou o carro!");
    }

    @Override
    public void freiar() {
        System.out.println("Voce freiou o carro!");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("Voce virou a esquerda!");
    }

    @Override
    public void virarDireita() {
        System.out.println("Voce virou a direita!");
    }
}
