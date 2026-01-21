package aplication;

import utilities.Conversor;

import java.util.Scanner;

public class ProgramConversor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a cotação do dolar: ");
        double cotacaoDolar = sc.nextDouble();
        System.out.print("Quantos dolares deseja comprar?: ");
        double dolaresComprados = sc.nextDouble();

        double valorFinalPago = Conversor.calcularValorAPagar(cotacaoDolar, dolaresComprados);
        System.out.printf("Valor a ser pago com IOF aplicado: R$ %.2f%n", valorFinalPago);
    }
}
