package progFuncional.exemploConsumer.util;

import progFuncional.exemploConsumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {


    @Override
    public void accept(Product product) {
        //para aumentar o preço dos produtos em 10%
        product.setPrice(product.getPrice() * 1.1);
    }

}
