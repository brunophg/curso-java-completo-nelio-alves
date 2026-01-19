package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Product produto = new Product(nome, preco, quantidade);


        System.out.println("Dados do produto: " + produto);

        System.out.print("Digite a quantidade de produtos a serem adicionados em estoque: ");
        quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println("Dados atualizados: " + produto);

        System.out.print("Digite a quantidade de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println("Dados atualizados" + produto);

        sc.close();
    }
}
