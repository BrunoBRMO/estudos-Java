package generics.setExemplo.exemplo1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        //set.remove("Tablet");
        set.removeIf(x -> x.length() >= 3); //remover todo mundo que tem pelo menos 3 caracteres
        set.removeIf(x -> x.charAt(0) == 'T');


        //System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
