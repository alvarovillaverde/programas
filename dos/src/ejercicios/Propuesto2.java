package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Propuesto2 {
    public static int[] insertionSort(int[] numbers) {

        // Iniciamos un fori del rango del array -->
        for (int i = 0; i < numbers.length; i++) {

            // Creamos la variable COPIA -->
            int copyNumber = numbers[i];

            // Creamos un index extra (j), del tamaño de i -->
            int j = i;

            // Bucle while para sustituir los numeros del array -->
            while (j > 0 && copyNumber < numbers[j - 1]) {

                // Sustitución
                numbers[j] = numbers[j - 1];

                // Proceso de regresión del index "j" a 0 -->
                j--;
            }

            // devuelta al array de la variable COPIA -->
            numbers[j] = copyNumber;
        }

        // Devolvemos el array ya ordenado -->
        return numbers;
    }

    public static void main(String[] args) {
        int[] original = new int[100];
        int[] ordenado = new int[100];

        Random random = new Random();
        for (int i = 0; i < original.length; i++) {
            original[i] = random.nextInt(200);
        }

        ordenado = insertionSort(original);

        System.out.println(Arrays.toString(ordenado));
    }
}
