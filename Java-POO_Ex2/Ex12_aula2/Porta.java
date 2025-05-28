package EX2_EX12_Porta;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Porta {

    boolean aberta;

    public Porta() {

        this.setFechar(true);

    }

    public void status() {

        System.out.println(" Informacoes sobre a porta ");

        System.out.println("Ela esta tampada: " + this.getFechar());

    }

    void Abrir() {
                
        if (aberta) {
            aberta = true;
            System.out.println("A porta esta aberta ");
        } else {
            System.out.println("A porta esta fechada");

        }

    }

    void desligar() {
          
        if (aberta) {
            aberta = true;
            System.out.println("A porta esta fechada");
        } else {
            System.out.println("A porta esta aberta");

        }
        }
    
    
    

    

    public boolean getFechar() {
        return aberta;
    }

    public void setFechar(boolean t) {
        this.aberta = t;
    }

}
