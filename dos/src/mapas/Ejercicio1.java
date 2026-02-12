package mapas;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
public static void main(String[] args) {
    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Nuñez");
    m.put(932, "Cindy Nero");
    m.put(732, "Pepe Dominguez");
    m.put(921, "Martin neto");
    m.put(872, "Pedro fernandez");

    System.out.println("Los elementos de m son:");

    for (Map.Entry<Integer, String> entry : m.entrySet()) {
        System.out.println("Código: " + entry.getKey() + " - Nombre: " + entry.getValue());
    }
}
}
