package progFuncional.exemploConsumer.entities;

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

    //REFERENCE METHOD com método estatico
    //método estatico para fazer o mesmo papel do consumer, atualizar o preço do produto
    //por ser um método estatico ele não mexe com o proprio objeto, e sim com o objeto que vai ser receber como
    // parametro
    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    //REFERENCE METHOD com método não estatico
    //Por não ser estatico, ele mexe com o price do próprio objeto
    public void nonStaticPriceUpdate() {
        setPrice(getPrice() * 1.1);
        //price = price * 1.1;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

}
