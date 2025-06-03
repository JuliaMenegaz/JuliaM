/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex16_aula3;

/**
 *
 * @author Júlia
 */
public class Main {
    public static void main(String[] args) {
        SensorTemperatura st = new SensorTemperatura();
        SensorUmidade su = new SensorUmidade();
        SensorLuminosidade sl = new SensorLuminosidade();
        
        st.lerValor();
        su.lerValor();
        sl.lerValor();
    }
}
