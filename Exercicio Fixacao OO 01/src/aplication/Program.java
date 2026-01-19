package aplication;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite as medidas para calculo: ");
        System.out.print("Altura: ");
        retangulo.altura = sc.nextDouble();
        System.out.print("Largura: ");
        retangulo.largura = sc.nextDouble();

        System.out.println("Calculos atualizados: ");
        double area = retangulo.calcularArea();
        System.out.println(area);
        double perimetro = retangulo.calcularPerimetro();
        System.out.println(perimetro);
        double diagonal = retangulo.calcularDiagonal();
        System.out.println(diagonal);

        sc.close();

    }
}
