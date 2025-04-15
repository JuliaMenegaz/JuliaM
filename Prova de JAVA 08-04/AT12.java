public class AT12 {
     public static double mediaMaioresQueCinco(double[] numeros) {
        double soma = 0;
        int count = 0;

        for (double num : numeros) {
            if (num > 5.0) {
                soma += num;
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return soma / count;
    }

    public static void main(String[] args) {
        double[] valores = {4.2, 6.5, 5.1, 3.8, 8.0};
        double media = mediaMaioresQueCinco(valores);
        System.out.println("Media dos valores maiores que 5.0: " + media);
    }
}

