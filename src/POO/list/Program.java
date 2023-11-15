package POO.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Bruno");
        System.out.println(list.size());
        for (String x: list) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //Para encontrar a posição de um elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // Caso o elemento não exista

        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList()); // or just
        for (String x: result) {
            System.out.println(x);
        }
        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("-------------------");
        list.removeIf(x -> x.charAt(0) == 'B');//Função Lambda chamado de predicado, pois é uma função que vai retornar
        // em verdadeiro ou falso
        //Leitura: "Pega um valor 'x'(do tipo String) e me retorna se esse x.charAt(0) é igual a 'B'
        for (String x: list) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        list.remove("Anna");//Case sensitive
        list.remove(1);
        for (String x: list) {
            System.out.println(x);
        }
    }
}
