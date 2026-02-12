package listas;

import java.util.ArrayList;

public class Ejemplo5 {
public static void main(String[] args) {
    ArrayList<String> colores = new ArrayList<String>();

    colores.add("rojo");
    colores.add("verde");
    colores.add("azul");
    colores.add("blanco");
    colores.add("amarillo");
    colores.add("blanco");

    System.out.println("Contenido");
    System.out.println(colores);

    colores.add(1, "Turquesa");
    System.out.println("Contenido despues de añadir");
    System.out.println(colores);
}
}
