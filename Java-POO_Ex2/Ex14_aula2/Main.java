package EX2_EX14_Casa;

import EX2_EX16_Aviao.Aviao;

/**
 *
 * @author ADM
 */
public class Main {


    public static void main(String[] args) {
         
         Pessoas_casa p = new Pessoas_casa("Jubs");
         
         Casa c = new Casa(321,"Verde",p);
         
//        System.out.println(" Informacoes sobre a casa");
//        System.out.println("Volume: "+c.getNumero());
//        System.out.println("Canal: "+ c.getCor());
//        System.out.println("Proprietario: "+c.getPropri());
//         
         
c.status();

    }  
}
