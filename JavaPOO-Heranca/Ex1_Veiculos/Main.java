package Ex1_Veiculos;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Renault", "Kwid", 2022);
        Moto minhaMoto = new Moto("Honda", "Biz", 2016);
        Caminhao meuCaminhao = new Caminhao("Mercedes Benz", "11Triste", 1997);
        
        System.out.println("Marca: "+meuCarro.getMarca() +"| Modelo: "+meuCarro.getModelo() +"| Ano: "+meuCarro.getAno());
        System.out.println("Marca: "+minhaMoto.getMarca() +"| Modelo: "+minhaMoto.getModelo() +"| Ano: "+minhaMoto.getAno());
        System.out.println("Marca: "+meuCaminhao.getMarca() +"| Modelo: "+meuCaminhao.getModelo() +"| Ano: "+meuCaminhao.getAno());
    }
}
