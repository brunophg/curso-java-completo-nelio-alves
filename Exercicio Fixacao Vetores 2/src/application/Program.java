package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas voce vai digitar?");
        int n = sc.nextInt();

        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da pessoa");
            System.out.print("Nome");
            String nome = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade");
            int idade = sc.nextInt();
            System.out.print("Altura");
            double altura = sc.nextDouble();
            vetor[i] = new Pessoa(nome, idade, altura);

        }

        double altura = 0;
        double menoresDezesseis = 0;

        for (int i = 0; i < vetor.length; i++) {
            altura += vetor[i].getAltura();
            if (vetor[i].getIdade() < 16) {
                menoresDezesseis += 1;
            }
        }

        double alturaMedia = altura / vetor.length;
        double porcentagemMenores =  ((menoresDezesseis / vetor.length) / 100);
        System.out.printf("Altura Media: ", alturaMedia);
        sc.nextLine();
        System.out.printf("Menores de 16 anos: ", porcentagemMenores);


    }
}
