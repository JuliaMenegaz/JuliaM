package Ex06_Funcionarios;

public class Funcionarios {
    String nome;
    double salario;
    String departamento;
    
    Void aumentarSalario(double percentual){
        salario += salario * percentual/100;
        System.out.println("Seu salario nove e: RS"+salario);
        return null;
        
        
    }
}
