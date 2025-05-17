
import java.util.HashSet;
import java.util.Set;

public class AT33 {
    public static void main(String[] args) {
        Set<String> estoque = new HashSet<>();
        
        estoque.add("Caixa");
        estoque.add("Vassoura");
        estoque.add("Oculos");
        estoque.add("Baly");
        estoque.add("Camera");
        System.out.println(estoque);
        
        if(estoque.contains("Baly")){
            System.out.println("\nBaly encontrado");
    }
    }
}
