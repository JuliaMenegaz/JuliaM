
import java.util.Scanner;

public class AT26 {
public class SistemaDeLogin {

    private static final String USUARIO_CORRETO = "usuario";  
    private static final String SENHA_CORRETA = "senha123";  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tentativas = 0;
        boolean acessoConcedido = false;

        while (tentativas < 3) {
            System.out.print("Digite o nome de usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            
            if (usuario.equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
                acessoConcedido = true;
                break; 
            } else {
                tentativas++;
                System.out.println("Usuario ou senha incorretos. Tentativa " + tentativas + " de 3.");
            }
        }

        if (acessoConcedido) {
            System.out.println("Acesso concedido! Bem-vindo.");
        } else {
            System.out.println("Voce atingiu o limite de tentativas. Acesso bloqueado.");
        }

        sc.close();
    }
}
}
