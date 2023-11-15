package POO.staticMemberExample.util;

public class Calculator {

    public static final double PI = 3.14159;//Membro estatico da classe, "Final" o valor não poderá ser alterado
    //Ele vai ser uma constante independente de qualquer objeto do tipo Calculator(classe)
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
    //Ambos estáticos pois podem ser calculados independente de objeto
}
