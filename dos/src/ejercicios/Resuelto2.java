package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Resuelto2 {
public static void main(String[] args) {
    int numeros[] = new int[50];
    Random random = new Random();

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = 1 + random.nextInt(99);
        }
    System.out.println("Array desordenado");
    System.out.println(Arrays.toString(numeros));

    Arrays.sort(numeros);

    System.out.println("Array ordenado");
    System.out.println(Arrays.toString(numeros));
}
}
