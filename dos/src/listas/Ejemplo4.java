package listas;

import java.util.ArrayList;

public class Ejemplo4 {
public static void main(String[] args) {
    ArrayList<String> colores = new ArrayList<String>();

    colores.add("rojo");
    colores.add("verde");
    colores.add("azul");
    colores.add("blanco");
    colores.add("amarillo");
    colores.add("blanco");

    System.out.println("Contenido del vector: ");
    System.out.println(colores);

    colores.set(2, "turquesa");

    System.out.println("Contenido despues de machacar la pos 2: ");
    System.out.println(colores);
}
}
