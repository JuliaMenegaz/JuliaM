package EX5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ParouImpar {
    
    
    public static void main(String[] args) {    
    
  Scanner teclado = new Scanner(System.in);
  
  
  System.out.println("Digite um numero");
  int n1 = teclado.nextInt();  
  
  while (n1 <= 5)  {
  
  int r1 = new Random().nextInt(5);

  
  System.out.println("Digite um numero maior que 5 para sair"); 
  System.out.println("Digite um numero");
  n1 = teclado.nextInt();
  
   System.out.println("Par[1] Impae[2] ");
 int p1 = teclado.nextInt();
 int r2 = r1 + n1;  
 
 System.out.println("Outro escolheu"+r1);
 
 if (p1 == 1) { 
 
 r2 = r1 + n1;     
if (r2%2==0) {
 
 System.out.println("Voce ganhou");   
 
} else {   
 
  System.out.println("Voce perdeu");    
    
}
 } 

 if (p1 == 2) { 
     
  r2 = r1 + n1;     
if (r2%2!=0) {
 
 System.out.println("Voce ganhou");   
 
} else {   
 
  System.out.println("Voce perdeu");    
    
}   
     
     
 }
  }
  
    }
}
