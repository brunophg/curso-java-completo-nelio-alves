

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

package application;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();


        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um valor");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        double media = soma / n;
        System.out.printf("Soma: %.2f%n", soma);
        System.out.printf("Media: %.2f%n", media);


    }
}
