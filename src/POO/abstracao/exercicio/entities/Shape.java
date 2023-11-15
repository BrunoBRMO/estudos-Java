package POO.abstracao.exercicio.entities;

import POO.abstracao.exercicio.entitiesEnum.Color;

public abstract class Shape { // Por ter um método abstrato essa classe é obrigada a ser abstrata também

    private Color color;

    public Shape(){
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area(); //métodos abstratos não tem corpo
}
