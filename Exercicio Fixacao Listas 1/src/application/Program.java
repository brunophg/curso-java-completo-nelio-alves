package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionarios serão registrados?: ");
        int n = sc.nextInt();

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o" + i + 1 +  "funcionario");
            sc.nextLine();
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add()
        }

    }

}
