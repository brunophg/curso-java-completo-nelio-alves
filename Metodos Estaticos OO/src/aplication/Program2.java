package aplication;

import utilities.Calculator2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o raio: ");
        double raio = sc.nextDouble();

        double circunferencia = Calculator2.circumference(raio);
        double volume = Calculator2.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", circunferencia);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("Valor de PI: %.2f%n", Calculator2.PI);
    }

}