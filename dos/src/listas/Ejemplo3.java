package listas;

import java.util.ArrayList;

public class Ejemplo3 {
public static void main(String[] args) {
    ArrayList<String> colores = new ArrayList<String>();

    colores.add("rojo");
    colores.add("verde");
    colores.add("azul");
    colores.add("blanco");
    colores.add("amarillo");
    colores.add("blanco");

    System.out.println("Contenido de la lista again: ");
    for (String lin : colores) {
        System.out.println(lin);
    }

    //ejemplo de contains
    if (colores.contains("blanco")) {
        System.out.println("EL blamco esta en la lista");
        colores.remove("blanco");
    }

    System.out.println("Lista despues de boorrar el primer blanco");
    for (String color : colores) {
        System.out.println(color);
    }
    colores.remove(2);

}
}
