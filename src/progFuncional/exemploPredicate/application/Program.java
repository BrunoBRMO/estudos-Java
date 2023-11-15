package progFuncional.exemploPredicate.application;

import progFuncional.exemploPredicate.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /*implementação da interface
        list.removeIf(new ProductPredicate());*/

        /*referencia para método estatico-> "nome da classe" :: "nome do método"
        list.removeIf(Product::staticProductPredicate);*/

        /*referencia para metodo não estatico
        list.removeIf(Product::nonStaticProductPredicate);*/

        /*lambda declarada
        //Posso colocar um valor parametrizado, ou por scanner, etc
        double min = 100.0;
        Predicate<Product> pred = p -> p.getPrice() >= min;
        list.removeIf(pred);*/

        //Expressão lambda inline
        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);


        for (Product p : list) {
            System.out.println(p);
        }
    }
}
