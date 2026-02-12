package listas;

import java.util.ArrayList;

public class Ejemplo1 {
public static void main(String[] args) {
    ArrayList<String> colores = new ArrayList<String>();

    System.out.println("N de elementoss: " + colores.size());
    colores.add("rojo");
    colores.add("verde");
    colores.add("azul");

    System.out.println("N de elementos: " + colores.size());
    colores.add("blanco");

    System.out.println("N de elementos: " + colores.size());

    System.out.println("El elmeento que hay en la posicion 0 es " + colores.get(0));
    if (colores.size()>=5) {
        System.out.println("El elemneto 5 es: " + colores.get(5));
    }
    colores.forEach(colo -> System.out.println("El color es " + colo + " y esta en la posicion " + colores.indexOf(colo)));
}
}
