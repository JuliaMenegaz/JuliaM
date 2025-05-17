
import java.util.ArrayList;

public class AT2 {
    public static void main(String[] args) {
         ArrayList<String> alunos = new ArrayList<>();
       
        alunos.add("Carlos");
        alunos.add("Ana");
        alunos.add("João");
        alunos.add("Mariana");
        alunos.add("Beatriz");
        alunos.add("Roberto");
        alunos.add("Lucas");
        alunos.add("Fernanda");
        alunos.add("Ricardo");
        alunos.add("Patricia");

        System.out.println("Alunos com mais de 6 letras:");
        for (String aluno : alunos) {
            if (aluno.length() > 6) {
                System.out.println(aluno);
            }
        }
    }
}
    

