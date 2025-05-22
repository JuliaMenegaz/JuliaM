package Ex5_aula2;

public class Produto {
   private String nome;
   private double preco;
   private int quantidadeEmEstoque;
   private boolean disponivel;

    public Produto(String n, double p, int q) {
        this.nome = n;
        this.preco = p;
        this.quantidadeEmEstoque = q;
        this.setDisponivel(true);
    }
    
    public void status(){ // Tambem chamadob de estado(como o objeto esta no momento)
        System.out.println("# INFORMAÇÕES SOBRE O PRODUTO #");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Preço: "+this.getPreco());
        System.out.println("Quantidade em estoque: "+this.getQuantidadeEmEstoque());
        System.out.println("Ele está disponivel? "+this.getDisponivel());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setPreco(double p) {
        this.preco = p;
    }

    public void setQuantidadeEmEstoque(int q) {
        this.quantidadeEmEstoque = q;
    }    
    
    public void comprar(int quantidade){
        if(quantidade <= this.quantidadeEmEstoque){
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Compra realizada com sucesso! quantidade comprada: "+quantidade);
        }else{
            System.out.println("Quantidade insuficiente no estoque!");
        }
    }

}
