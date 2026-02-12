package mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Nuñez");
    m.put(932, "Cindy Nero");
    m.put(732, "Pepe Dominguez");
    m.put(921, "Martin neto");
    m.put(872, "Pedro fernandez");

    System.out.println(m.get(924));
    System.out.println(m.get(872));
    System.out.println(m.get(888));

    int i = 0;
    while (i<5) {
        System.out.println("clave a introducir: ");
        int clave = Integer.parseInt(sc.nextLine());
        if (m.containsKey(clave)) {
            System.out.println("corresponde a " + m.get(clave));
        } else {
            System.out.println("nadie con esa clave");
        }
        i++;
    }

    sc.close();
}
}
