package Ex08_Alunos;

public class Alunos {
    String nome;
    int matricula;
    double notas;
    
    double calcularMedia(){
        return notas + notas % 2;
       
    }
}
