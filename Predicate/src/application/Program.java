package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

     public static void main() {

         List<Product> list = new ArrayList<>();

         list.add(new Product("Tv", 900.00));
         list.add(new Product("Mouse", 50.00));
         list.add(new Product("Tablet", 350.00));
         list.add(new Product("HD Case ", 90.00));

         double min = 100.0;


         list.removeIf(p -> p.getPrice() >= min);

         for (Product product : list) {
             System.out.println(product);
         }
    }
}
