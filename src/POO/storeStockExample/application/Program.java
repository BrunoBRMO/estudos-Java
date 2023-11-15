package POO.storeStockExample.application;

import POO.storeStockExample.entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        p1.name = sc.nextLine();
        System.out.println("Price: ");
        p1.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        p1.quantity = sc.nextInt();

        //System.out.println(p1.name + ", " + p1.price + ", " + p1.quantity);
        System.out.println("Product data: " + p1);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        p1.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + p1);

        System.out.println();
        System.out.println("Enter the number of products to be remove from stock: ");
        quantity = sc.nextInt();
        p1.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + p1);
        sc.close();
    }
}
