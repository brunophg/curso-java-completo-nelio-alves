package application;


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List <String> list =  new ArrayList<>();

        list.add("Camila");
        list.add("Maria");
        list.add("Júlia");
        list.add("Bruno");
        list.add("Ana");
        list.add(3, "Maria Clara");


        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------");
        System.out.println("Indice de Bruno: " + list.indexOf("Bruno"));
    }
}
