package mapas;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
public static void main(String[] args) {
    HashMap<Integer, String> m = new HashMap<Integer, String>();

    m.put(924, "Amalia Nuñez");
    m.put(932, "Cindy Nero");
    m.put(732, "Pepe Dominguez");
    m.put(921, "Martin neto");
    m.put(872, "Pedro fernandez");

    System.out.println("Todas las entradas con entrySet: ");
    System.out.println(m.entrySet());
    System.out.println("extraidas una a una: ");
    for(Map.Entry<Integer, String> pareja : m.entrySet()) {
        System.out.println(pareja.getKey());
        System.out.print("------>");
        System.out.print(pareja.getValue() + "\n");
    }
}
}
