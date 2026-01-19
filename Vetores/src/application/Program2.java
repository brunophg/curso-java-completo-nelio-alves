package application;

import entities.Product;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de produtos a ser colocado: ");
        int n = sc.nextInt();

        Product[] vetor = new Product[n];

        for (int i=0; i<vetor.length; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            double preco = sc.nextDouble();
            vetor[i] = new Product(nome, preco);
        }

        double soma = 0;

        for (int i=0; i< vetor.length; i++) {
            soma += vetor[i].getPreco();
        }
        double media = soma / vetor.length;
        System.out.printf("Media: %.2f%n", media);
    }
}
