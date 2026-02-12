package listas;

import java.util.ArrayList;

public class Ejemplo6 {
public static void main(String[] args) {
    ArrayList<String> colores = new ArrayList<String>();

    colores.add("rojo");
    colores.add("verde");
    colores.add("azul");
    colores.add("blanco");
    colores.add("amarillo");
    colores.add("blanco");

    System.out.println("Contenido de la lista: ");
    System.out.println(colores);

    colores.removeIf(palabra -> palabra.startsWith("a"));
    System.out.println("Contenido despues de modificar");
    System.out.println(colores);
}
}
