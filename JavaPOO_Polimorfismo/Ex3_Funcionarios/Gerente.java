package Ex3_Funcionarios;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.15; // Bonus de 15% por venda
    }
    
        
    

}
