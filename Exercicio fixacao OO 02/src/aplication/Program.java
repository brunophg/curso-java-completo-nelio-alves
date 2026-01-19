package aplication;

import entities.Funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Qual o seu nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Qual o seu salario bruto?: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Qual o valor de imposto?: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println(funcionario);

        System.out.println("Qual a porcentagem de aumento de salario?: ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println("Dados atualizados: " + funcionario);
        sc.close();


    }
}
