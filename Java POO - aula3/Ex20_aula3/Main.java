/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex20_aula3;

/**
 *
 * @author Júlia
 */
public class Main {
    public static void main(String[] args) {
        Email e1 = new Email();
        SMS s1 = new SMS();
        PushNotification p1 = new PushNotification();
        
        e1.enviar();
        s1.enviar();
        p1.enviar();
    }
}
