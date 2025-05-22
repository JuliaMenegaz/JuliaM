package EX2_EX10_Data;

/**
 *
 * @author ADM
 */
public class Data {

    int dia;
    int mes;
    int ano;

    public Data (int d , int m, int a){
    
        this.dia=d ;
        this.mes=m;
        this.ano=a;
    
    }

    void juntar() {
        
        System.out.println("Data : "+dia+"/"+mes+"/"+ano);     
        

    }
    
}
