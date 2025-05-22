package EX2_EX11_Televisao;

import Exercicio2Caneta.Exemplo_caneta_azul;

/**
 *
 * @author ADM
 */
public class Main {

    public static void main(String[] args) {

        Televisao c1 = new Televisao(12, 12);

        c1.AumentarVolume();

        c1.DiminuirVolume();

        c1.TrocarCanal();
    }
}
