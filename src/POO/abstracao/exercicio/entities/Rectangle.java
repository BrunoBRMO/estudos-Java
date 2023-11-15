package POO.abstracao.exercicio.entities;

import POO.abstracao.exercicio.entitiesEnum.Color;

public class Rectangle extends Shape{

    //A classe Rectangle, por estar herdando Shppe , é obrigada a implementar o método abstrato area();
    //e como ela não é abstrata ela é obrigada a sobrescrever o método abstrato da super classe Shape, area();

    private Double width;
    private Double height;

    public Rectangle () {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
