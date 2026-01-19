package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de posições do seu vetor: ");
        int n = sc.nextInt();

        double[] vetor = new double[n]; //criação de vetores em java

        for (int i = 0; i < n; i++) {
            System.out.println("Digite uma altura: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++) {
            soma += vetor[i];
        }

        double media = soma / n;

        System.out.printf("Media das alturas: %.2f%n", media);
    }
}
