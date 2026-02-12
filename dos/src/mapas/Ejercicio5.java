package mapas;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(924, "Amalia Nuñez");
        m.put(932, "Cindy Nero");
        m.put(732, "Pepe Dominguez");
        m.put(921, "Martin neto");
        m.put(872, "Pedro fernandez");

        System.out.println("Para verlo ordenado sin usar TreeMap, usamos Stream API:");

        // Ejecutamos el flujo directamente
        m.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}