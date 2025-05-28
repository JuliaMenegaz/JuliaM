package Ex8_aula2;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
    
    public void status(){ // Tambem chamadob de estado(como o objeto esta no momento)
        System.out.println("# INFORMAÇÕES SOBRE A CANETA #");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Nota: "+this.nota);
        System.out.println("Media: "+this.calcularMedia(5));
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public double calcularMedia(double media){
        if(media == nota+nota % 2){
            System.out.println("A media é:"+media);
        }
        return media;
    }
}
