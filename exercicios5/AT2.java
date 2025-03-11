package EX5;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class senha {
    
public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);   
  
  int s1 = 1234;
  
System.out.println("Digite sua senha");
  int n1 = teclado.nextInt();    
 
  while (n1 != s1) { 
 
  System.out.println("Senha incorreta");
  System.out.println("Digite sua senha");
   n1 = teclado.nextInt();    
  
  
  
  }
  
  System.out.println("Fez o basico");
  
}
}
