
public class AT36 {
    public static boolean estaOrdenadoCrescente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 3, 8, 1};

        System.out.println("Array 1 esta ordenado em ordem crescente? " + estaOrdenadoCrescente(array1));
        System.out.println("Array 2 esta ordenado em ordem crescente? " + estaOrdenadoCrescente(array2));
    }
}

