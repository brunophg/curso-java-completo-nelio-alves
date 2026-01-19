//3) Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.


package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas voce vai digitar?");
        int n = sc.nextInt();

        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Pessoa(nome, idade, altura);
        }

        double altura = 0;
        double menores = 0;

        for (int i = 0; i < n; i++) {
            altura += vetor[i].getAltura();
            if (vetor[i].getIdade() < 16) {
                menores += 1;
            }
        }

        double alturaMedia = altura / vetor.length;
        double porcentagemMenores =  ((menores / vetor.length) / 100);
        System.out.printf("Altura Media: ", alturaMedia);
        sc.nextLine();
        System.out.printf("Menores de 16 anos: ", porcentagemMenores);



    }
}
