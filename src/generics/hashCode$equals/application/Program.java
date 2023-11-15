package generics.hashCode$equals.application;

import generics.hashCode$equals.entities.Client;

public class Program {

    public static void main(String[] args) {


        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);//false -> não compara o conteudo mas sim as referências de
        // memorias, ao criar 2
        // objetos diferentes, o heap aloca como 2 objetos diferentes também independente do conteúdo deles

        String s1 = "Test";
        String s2 = "Test";
        System.out.println(s1 == s2);//true -> o compilador faz um tratamento especial para
        // literais

        String s3 = new String("Test");
        String s4 = new String("Test");
        System.out.println(s3 == s4); //força a criação de um novo objeto

    }
}
