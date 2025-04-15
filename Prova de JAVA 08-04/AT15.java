
import java.util.ArrayList;

public class AT15 {
    public static void main(String[] args) {
        
         ArrayList<String> palavras = new ArrayList<>();
       
       palavras.add("abelha");
       palavras.add("jogo");
       palavras.add("amem");
       palavras.add("ola");
       palavras.add("enem");
       
       for(String palavra : palavras){
         if(palavra.startsWith("e")){
             System.out.println("Tem "+palavra+" na lista");
         }
    }
    }
}
    
