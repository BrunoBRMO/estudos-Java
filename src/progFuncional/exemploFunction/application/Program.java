package progFuncional.exemploFunction.application;

import progFuncional.exemploFunction.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /*Primeiro converte a list para stream e depois retorna para list, após isso atribuo isso a list de Strings,
        // no caso estou aplicando a função UpperCaseName para cada elemento da minha lista
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());*/

        /*REFERENCE METHOD com método estatico
        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());*/

        /*REFERENCE METHOD com método não estatico
        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
         */

        /*Expressão lambda declarada
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());*/

        /*Expressão lambda inline*/
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());


        names.forEach(System.out::println);
    }
}
