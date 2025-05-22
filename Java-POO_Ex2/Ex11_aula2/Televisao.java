package EX2_EX11_Televisao;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Televisao {
    
    int Volume;
    int canal;
    int VA;
    
    
     public Televisao (int v , int c){
    
        this.Volume=v ;
        this.canal=c;
        
    }

    public void status(){
    
        System.out.println(" Informacoes sobre a televisao ");
        System.out.println("Volume: "+this.getVolume());
        System.out.println("Canal: "+ this.getCanal());
        
        
    }
    
     void AumentarVolume() {
        
           Scanner teclado = new Scanner(System.in);
         
         System.out.println("Quanto voce deseja aumentar");
        int VS = teclado.nextInt();
         
        VA = VS + Volume;
         System.out.println("O volume atual eh " +VA);
    }

     void DiminuirVolume() {
        
           Scanner teclado = new Scanner(System.in);
         
         System.out.println("Quanto voce deseja aumentar");
        int VSA = teclado.nextInt();
         
        int VAS = VA - VSA;
         System.out.println("O volume atual eh " +VAS);
    }
    
     void TrocarCanal() {
        
           Scanner teclado = new Scanner(System.in);
         
         System.out.println("Escolha um canal");
        canal = teclado.nextInt();
         
      System.out.println("O canal atual eh " +canal);
         
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int Volume) {
        this.Volume = Volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVA() {
        return VA;
    }

    public void setVA(int VA) {
        this.VA = VA;
    }
     
    
     
     
}
