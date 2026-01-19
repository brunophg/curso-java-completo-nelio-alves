package aplication;

import entities.Aluno;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Qual o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Informe as notas ");

        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println("Nome" + aluno.nome);
        System.out.println("Nota final: " + aluno.calcularNotaFinal());
        System.out.println("Situação: " + aluno.verificarAprovacao());
        System.out.println("Pontos restantes: " + aluno.calcularPontosRestantes());

    }
}
