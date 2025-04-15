public class AT29 {
    public static int contarDigitos(String texto) {
        int contador = 0;

       
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isDigit(c)) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String texto = "Eu tenho 2 macas e 3 bananas!";
        
        int numeroDeDigitos = contarDigitos(texto);
        System.out.println("A string contem " + numeroDeDigitos + " digitos.");
    }
}

