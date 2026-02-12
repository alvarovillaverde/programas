package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Propuesto7b {
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
    public static int[] apretujaOrdenado(int[] arreglo1, int[] arreglo2) {
        int[] mezcla = new int[arreglo1.length + arreglo2.length];
        int i, j, k;

        for (i = 0, j = 0, k = 0; i < arreglo1.length && j < arreglo2.length; k++) {
            if (arreglo1[i] < arreglo2[j]) {
                mezcla[k] = arreglo1[i];
                i++;
            } else {
                mezcla[k] = arreglo2[j];
                j++;
            }
        }
        while (i < arreglo1.length) {
            mezcla[k] = arreglo1[i];
            i++;
            k++;
        }
        while (j < arreglo2.length) {
            mezcla[k] = arreglo2[j];
            j++;
            k++;
        }

        System.out.println("indice i " + i);
        System.out.println("indice j " + j);
        System.out.println("indice k " + k);

        return mezcla;
    }

    public static void main(String[] args) {
    int uno[] = new int[70];
    int[] otro = new int[60];

    Random random = new Random();
    for (int i = 0; i < uno.length; i++) {
        uno[i] = random.nextInt(350);
    }

    for (int j = 0; j < otro.length; j++) {
        otro[j] = random.nextInt(525);
    }
    uno = insertionSort(uno);
    otro = insertionSort(otro);
    int[] resultado = apretujaOrdenado(uno, otro);

    System.out.println(Arrays.toString(resultado));

}
}
