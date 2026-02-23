package listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
public static void main(String[] args) {
    List<String> compis = new ArrayList<>();
    compis.add("yelmilena");
    compis.add("anxo f");
    compis.add("hector");
    compis.add("pepe");
    compis.add("luisao");
    compis.add("pepe dominguez");

    for(String puntero : compis) {
        System.out.println(puntero);
    }

    compis.forEach(puntero -> System.out.println(puntero));
}
}
