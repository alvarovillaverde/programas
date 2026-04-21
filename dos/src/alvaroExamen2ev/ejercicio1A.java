package alvaroExamen2ev;

import java.util.Arrays;
import java.util.Random;

public class ejercicio1A {
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
    Random r = new Random(); // random para generar los numeros
    int[] array80Enteros = new int[80];

    // generar los numeros, hago un contador para el tamaño de los nuevos arrays
    int mult5 = 0;
    for (int i = 0; i < array80Enteros.length; i++) {
        array80Enteros[i] = r.nextInt(1, 1000);
        if (array80Enteros[i]%5 == 0) {
            mult5++; // si es multiplo de 5 se añade al contador
        }
    }

    // inicializo los nuevos arrays
    int[] arrayMult5 = new int[mult5];
    int[] arrayNoMult5 = new int[array80Enteros.length - mult5];

    // meto los valores
    for (int i = 0, j = 0, k = 0; i < array80Enteros.length; i++) {
            if ((int)array80Enteros[i]%5 == 0) {
                arrayMult5[j] = array80Enteros[i];
                j++;
            } else {
                arrayNoMult5[k] = array80Enteros[i];
                k++;
            }
        }

    // ordeno mediante insertionSort
    insertionSort(arrayMult5);
    insertionSort(arrayNoMult5);

    // hago el casteo a byte
    byte[] arrayByteMult5 = new byte[arrayMult5.length];
    for (int i = 0; i < arrayMult5.length; i++) {
        arrayByteMult5[i] = (byte) arrayMult5[i];
    }

    // cuento los positivos para meterlos en un array
    int positivos = 0;
    for (int i = 0; i < arrayByteMult5.length; i++) {
        if (arrayByteMult5[i] >= 0) {
            positivos++; // si es positivo se añade al contador
        }
    }

    // meto los positivos en un array
    byte[] arrayBytePos = new byte[positivos];
    for (int i = 0, k = 0; i < arrayBytePos.length; i++) {
        if (arrayByteMult5[i] >= 0) {
            arrayBytePos[k] = arrayByteMult5[i]; // si es positivo se añade
            k++;
        }
    }

    // imprimo
    System.out.println(Arrays.toString(arrayBytePos));
}
}
