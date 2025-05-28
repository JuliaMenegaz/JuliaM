/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1_aula3;

/**
 *
 * @author Júlia
 */
public class ContaCorrente implements Conta{
    private double saldo;

    
    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    

    @Override
    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!\nSaldo atual: "+saldo);
    }else{
            System.out.println("Valor invalido para deposito.");
        }
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
    }else{
            System.out.println("Saldo insuficiente ou valor invalido.");
        }
    }

   public double getSaldo(){
       return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    
    }

}
