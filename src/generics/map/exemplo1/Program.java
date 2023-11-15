package generics.map.exemplo1;

import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();//Como String já tem hashCode e equals implementado posso utilizar
        // o TreeMap

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "40028922");

        cookies.remove("email");
        cookies.put("phone", "12345678");//sobreescreve o valor de "phone" pois não pode ter repetição de chave

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));//true
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); //null, foi removido anteriomente

        System.out.println("All cookies: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
