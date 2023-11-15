package progFuncional.exemploConsumer.application;

import progFuncional.exemploConsumer.entities.Product;

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

        double factor = 1.1;

        /*método default, interface list. Ele percorre a coleção e vai executar um consumer para cada elemento
       list.forEach(new PriceUpdate());*/

        /*reference method com método estatico
        list.forEach(Product::staticPriceUpdate);*/

        /*reference method com método não estatico
        list.forEach(Product::nonStaticPriceUpdate);*/

        /*Expressão lambda declarada

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
          //p.setPrice(p.getPrice() * 1.1);
        };
        list.forEach(cons);*/

        /*Expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * factor));*/

       list.forEach(System.out::println);//reference method para o metodo println
    }
}
