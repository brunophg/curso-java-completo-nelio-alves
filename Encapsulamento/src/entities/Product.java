package entities;

public class Product {

    private String nome;
    private double preco;
    private int quantidade;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
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
        return nome + ", $" + String.format("%.2f", preco) + ", $"
                + quantidade + ", unidades, Total: $ " +
                String.format("%.2f", valorTotalEmEstoque());
    }
}
