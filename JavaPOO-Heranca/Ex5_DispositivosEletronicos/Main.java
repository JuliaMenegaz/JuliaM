package Ex5_DispositivosEletronicos;

public class Main {
    public static void main(String[] args) {
        DispositivoEletronico f1 = new Fone("jbl", "i1");
        DispositivoEletronico t1 = new Table("Motorola", "i7");
        DispositivoEletronico n1 = new Not("Sansung", "l2");
        
        System.out.println("Marca: "+f1.getMarca()+"| Modelo: "+f1.getModelo());
        System.out.println("Marca: "+t1.getMarca()+"| Modelo: "+t1.getModelo());
        System.out.println("Marca: "+n1.getMarca()+"| Modelo: "+n1.getModelo());
    }
}
