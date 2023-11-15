package progFuncional.exemploComparator.application;

import progFuncional.exemploComparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));



        /* Versão muito verbosa
        classe anonima, para não precisar,nesse caso, da classe MyComparator
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };*/

        //Expressão lambda -> função anonima ou arrow function
        //Dispensa a declaração de tipos
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        //Outra maneira de escrever
        //Comparator<Product> comp = (p1, p2) -> 1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

       list.sort(comp);

       //Outra maneira
       //list.sort((p1, p2) -> 1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
