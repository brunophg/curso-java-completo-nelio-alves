package aplication;

import utilities.Calculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Entre com o raio: ");
        double raio = sc.nextDouble();

        double c = calc.circumference(raio);
        double v = calc.volume(raio);
        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", calc.PI);
    }
}
