package progFuncional.exemploPredicate.entities;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //mesma coisa da interface mas agora é um método, invés de ser uma classe separada
    public static boolean staticProductPredicate (Product p) {
        return p.getPrice() >= 100.0;
    }

    //Como ele não é estatico ele vai trabalhar com o próprio produto onde estou e não com o do argumento Na versão
    // estatica se trabalha com o produto passado como argumento
    public boolean nonStaticProductPredicate () {
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

}
