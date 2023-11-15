package POO.application;

import POO.application.entities.Triangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y; //Variaveis compostas

        // Objetos, Instancias da classe
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.area();
        double areaY = y.area();

        System.out.println(areaX);
        System.out.println(areaY);

        sc.close();
    }
}
