package entities;

public class Product {

    public String nome;
    public double preco;
    public int quantidade;

    public Product() {
        //pode ter mais de um construtor
        //alem do padrao
    }

    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Product(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double valorTotalEmEstoque() {
        double valorEstoque = preco * quantidade;
        return valorEstoque;
    }

    public void adicionarProdutos(int qtde) {
        this.quantidade += qtde;
    }
    public void removerProdutos(int qtde) {
        this.quantidade -= qtde;
    }
    public String toString() {
        return nome + ", $" + String.format("%.2f", preco) + ", $" + quantidade + ", unidades, Total: $ " +
                String.format("%.2f", valorTotalEmEstoque());
    }
}
