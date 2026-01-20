//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.


package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();


        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um valor");
            vetor[i] = sc.nextDouble();
        }

        double negativos = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                negativos += 1;
                System.out.println(vetor[i]);
            }
        }


    }
}
