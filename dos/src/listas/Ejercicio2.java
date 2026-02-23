package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {
public static void main(String[] args) {
    Random mero = new Random();

    int elementos = 10 + mero.nextInt(11);
    System.out.println("elementos de la lista " + elementos);

    List<Integer> numeros = new ArrayList<>();

    for(int i = 0; i < elementos; i++) {
        numeros.add(mero.nextInt(100));
    }

    int pequeño = Collections.min(numeros);
    int mayor = Collections.max(numeros);

    System.out.println("el pequeño es " + pequeño);
    System.out.println("el mayor es " + mayor);

    int suma = 0;
    for (int i = 0; i < elementos; i++) {
        suma += numeros.get(i);
    }

    System.out.println("suma " + suma);
    System.out.println("promedio es " + suma/(double)numeros.size());

    
}
}
