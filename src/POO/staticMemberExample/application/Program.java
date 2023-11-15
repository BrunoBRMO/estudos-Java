package POO.staticMemberExample.application;

import POO.staticMemberExample.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        //Calculator calc = new Calculator();// Não é necessario mais instanciar um objeto para depois chamar o
        // operação a partir do objeto

        double c = Calculator.circumference(radius); //No lugar do objeto troca-se pela classe
        double v = Calculator.volume(radius);

        System.out.println("Circumference: " + c);
        System.out.println("Volume: " + v);
        System.out.println("PI value: " + Calculator.PI);

        sc.close();
    }
}
