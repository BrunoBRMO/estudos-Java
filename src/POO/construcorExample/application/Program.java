package POO.construcorExample.application;

import POO.construcorExample.entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Product p1 = new Product(); esse construtor padrão não existe mais devido a criação do construtor com
        // argumentos
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        //p1.name = sc.nextLine();
        String name = sc.nextLine();//Criação de uma variavel temporaria para receber o input
        System.out.println("Price: ");
        double price = sc.nextDouble();
//        System.out.println("Quantity in stock: ");
//        int quantity = sc.nextInt();
        Product prod = new Product(name, price);//Agora eu chamo a variavel

        prod.setName("Computer");
        System.out.println("Updated name: " + prod.getName());

        //System.out.println(p1.name + ", " + p1.price + ", " + p1.quantity);
        System.out.println("Product data: " + prod);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();//nesse exemplo necessario iniciar a variavel devido ao 2° construtor
        prod.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + prod);

        System.out.println();
        System.out.println("Enter the number of products to be remove from stock: ");
        quantity = sc.nextInt();
        prod.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + prod);
        sc.close();
    }

}
