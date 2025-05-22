package EX2_EX15_Empregado;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Empregado {



    String Funcionario;
    double salario;
    String dep;
    
    public Empregado (String F , String d, double s){
    
        this.Funcionario=F ;
        this.salario=s;
        this.dep=d;
    
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a caneta ");
        System.out.println("Modelo: "+this.getFuncionario());
        System.out.println("Ponta: "+ this.getSalario());
         System.out.println("Ponta: "+ this.getDep());
      
        
    }
    
    void aumento() {
        Scanner teclado = new Scanner(System.in);
        
        
    double NS = 0.10*salario;
      
    double NST = NS + salario;
    
    System.out.println("O novo salario de " +Funcionario+ "do departamento de "+dep+" eh "+NST);
    
    }

    public String getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(String Funcionario) {
        this.Funcionario = Funcionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    
    
}
