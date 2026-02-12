package mapas;

import java.util.LinkedHashMap;

public class Ejercicio6 {
public static void main(String[] args) {
    LinkedHashMap<Integer, String> mapita = new LinkedHashMap<Integer, String>();

    mapita.put(924, "Amalia Nuñez");
    mapita.put(932, "Cindy Nero");
    mapita.put(732, "Pepe Dominguez");
    mapita.put(921, "Martin neto");
    mapita.put(872, "Pedro fernandez");

    System.out.println("Todas las entradas con entrySet: ");
    System.out.println(mapita.entrySet());
}
}
