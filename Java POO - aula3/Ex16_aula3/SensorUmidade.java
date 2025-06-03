/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex16_aula3;

/**
 *
 * @author Júlia
 */
public class SensorUmidade implements Sensor{
    private double alteracao;

    public SensorUmidade() {
        this.alteracao = 150;
    }

    public double getAlteracao() {
        return alteracao;
    }

    public void setAlteracao(double alteracao) {
        this.alteracao = alteracao;
    }

    @Override
    public double lerValor() {
        System.out.println("A umidade esta em: "+this.alteracao);
        return alteracao;
    }
    
}
