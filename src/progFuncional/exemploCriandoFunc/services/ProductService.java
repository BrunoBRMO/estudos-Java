package progFuncional.exemploCriandoFunc.services;

import progFuncional.exemploCriandoFunc.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p : list) {
            if (criteria.test(p)) {//teste generico de qualquer predicado que for recebido como parametro
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
