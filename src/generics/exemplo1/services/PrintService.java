package generics.exemplo1.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {//Agora PrintService que vai ser parametrizado com um tipo "T" da minha escolha, no
    // caso T pode ter o nome que eu escolher mas esse é o padrão

    List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first(){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
