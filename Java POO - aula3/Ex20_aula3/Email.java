/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex20_aula3;

/**
 *
 * @author Júlia
 */
public class Email implements Notificacao{
    private String mensagem;

    public Email() {
        this.mensagem = "julia";
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    @Override
    public String enviar() {
        System.out.println("Voce recebeu um Email de"+this.mensagem);
        return mensagem;
               
    }
    
}
