package mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Nuñez");
    m.put(932, "Cindy Nero");
    m.put(732, "Pepe Dominguez");
    m.put(921, "Martin neto");
    m.put(872, "Pedro fernandez");

    System.out.println("clave a introducir: ");
     int clave = Integer.parseInt(sc.nextLine());
    if (m.containsKey(clave)) {
            System.out.println("corresponde a " + m.get(clave));
    } else {
            System.out.println("nadie con esa clave");
    }

    sc.close();
    }
}
