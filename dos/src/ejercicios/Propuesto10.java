package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*"10. Realiza un programa que cree un array de 100 posiciones con números aleatorios entre 1 y 100. 
Una vez creado el array el programa deberá ordenar lo y mostrar los números entre 1 y 100 que no han aparecidodos." */
public class Propuesto10 {
    public static void main(String[] args) {
        int[] enteros = new int[100];
        Random random = new Random();

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = 1 + random.nextInt(100);
        }

        Arrays.sort(enteros);

        System.out.println("Numeros que no aparecieron");
        for (int i = 0; i < enteros.length; i++) {
            if (Arrays.binarySearch(enteros, i) < 0) {
                System.out.print(i + " ");
            }
        }

        List<Integer> faltantes = new ArrayList<>();

        for (int i = 1; i <= enteros.length; i++) {
            // Si al buscar el número 'i' no se encuentra (resultado < 0)
            if (Arrays.binarySearch(enteros, i) < 0) {
                faltantes.add(i); // Lo añadimos a nuestra lista de "ausentes"
            }
        }

        System.out.println("\nNúmeros que no han aparecido (" + faltantes.size() + " en total):");
        System.out.println(faltantes);
    }
}
