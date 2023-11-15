package generics.exemplo3.application;

import generics.exemplo3.entities.Circle;
import generics.exemplo3.entities.Rectangle;
import generics.exemplo3.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircle));
    }
   /* public static double totalArea(List<Shape> list) {//List<Shape> não é um supertipo de List<Circle> e nesse caso
        // este método esta funcionando apenas para List<Shape>, mesmo List<Circle> sendo um subtipo de Shape
        double sum = 0.0;
        for (Shape s : list) {//Caso eu mude para List<?> o compilador reclama pois não necessariamente os elementos
            // da lista serão do tipo Shape
            sum += s.area();
        }
        return sum;
    }*/

    public static double totalArea(List<? extends Shape> list) {//Agora essa lista funciona para Shape e qualquer
        // tipo que seja subtipo de Shape

        //list.add(new Rectangle(3.0, 4.0)); Não posso adicionar elementos na lista do método
        double sum = 0.0;
        for (Shape s: list) {
            sum += s.area();
        }
        return sum;
    }
}
