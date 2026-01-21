package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionarios serão registrados?: ");
        int n = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario # " + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Esse ID ja existe.");
                id = sc.nextInt();
            }


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Funcionario func = new Funcionario(id, name, salary);
            list.add(func);

        }

        System.out.println("Entre com o id do funcionario que terá o salario aumentado");
        int idSalary = sc.nextInt();
//      Integer pos = position(list, idSalary);

        Funcionario func = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if (func == null) {
            System.out.println("Esse id não existe, digite novamente.");
        } else {
            System.out.print("Dê a porcentagem de aumento");
            double percent = sc.nextDouble();
            func.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionarios");
        for (Funcionario funcionario : list) {
            System.out.println(funcionario);
        }

        sc.close();
    }
    public static Integer position(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }

}
