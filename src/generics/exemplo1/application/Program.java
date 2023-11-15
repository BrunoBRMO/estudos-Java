package generics.exemplo1.application;

import generics.exemplo1.services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<Integer>(); //Agora PrintService so aceita Integer

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();//Casting não é mais necessario, pois o type safety do generics garante retornar
        // apenas Intergers nesse caso
        System.out.println("First: " + x);

        sc.close();
    }
}
