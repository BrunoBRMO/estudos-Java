package generics.exemplo2.service;

import java.util.List;

public class CalculationService {

    //O método vai trabalhar com qualquer tipo T, desde que T seja qualquer subtipo de Comparable T
    public static <T extends Comparable> T max (List<T> list) {//Por ser estatica não preciso instanciar CalculationService
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item: list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
