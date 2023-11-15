package POO.construcorExample.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() { // Para manter o construtor padrão
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    /* O Construtor vem logo depois dos atributos e antes dos métodos
    É iniciado com public e leva o nome da classe
    this -> utilizado para se referenciar ao atributo do objeto
     */

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        //quantity = 0 poderia ser utilizado pois não existe mais o problema de ambiguidade entre atributo e parametro
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    //Sem a criação de setQuantity para prodeter o objeto produto de alterações incosistentes da quantidade dele
    //Para isso já existe os métodos add e remove product
    public double totalValueInStock() {
        return price * quantity;
    }

    public  void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
