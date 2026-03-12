package repaso;

import java.util.Arrays;
import java.util.Random;

public class repaso3 {

    public static float[] mergeSort(float array[]) {
        // Si el array tiene más de un elemento, lo dividimos y mezclamos
        if (array.length > 1) {

            // Calculamos la mitad para dividir el array
            int elementosEnA1 = array.length / 2;
            int elementosEnA2 = array.length - elementosEnA1;

            // Declaramos los dos sub-arrays temporales
            float arr1[] = new float[elementosEnA1];
            float arr2[] = new float[elementosEnA2];

            // Copiamos la primera mitad
            for (int i = 0; i < elementosEnA1; i++)
                arr1[i] = array[i];

            // Copiamos la segunda mitad
            for (int i = elementosEnA1; i < elementosEnA1 + elementosEnA2; i++)
                arr2[i - elementosEnA1] = array[i];

            // Llamadas recursivas para ordenar las mitades
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            // Índices para la mezcla (merge)
            int i = 0, j = 0, k = 0;

            // Bucle de mezcla: comparamos elementos de ambos sub-arrays
            while (arr1.length != j && arr2.length != k) {

                // IMPORTANTE: Para String usamos compareTo en lugar de <
                if (arr1[j]<(arr2[k])) {
                    array[i] = arr1[j];
                    i++;
                    j++;
                } else {
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }

            // Copiamos los elementos restantes si un array se acaba antes que el otro
            while (arr1.length != j) {
                array[i] = arr1[j];
                i++;
                j++;
            }

            while (arr2.length != k) {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }

        return array;
    }
    public static void main(String[] args) {
        float[] array50flotantes = new float[50];
        Random random = new Random();
        float max = 100;
        float min = -100;

        for (int i = 0; i < 50; i++) {
            array50flotantes[i] = random.nextFloat(min, max);
        }

        int contNeg = 0;
        for (int i = 0; i < 50; i++) {
            array50flotantes[i] = random.nextFloat(-100, 100);
            if (array50flotantes[i] < 0) contNeg++;
        }

        // Creamos los arrays con el tamaño exacto para evitar NULLs
        float[] arrayNegativos = new float[contNeg];
        float[] arrayPositivos = new float[50 - contNeg];

        for (int i = 0, j = 0, k = 0; i < 50; i++) {
            if (array50flotantes[i] < 0) {
                arrayNegativos[j] = array50flotantes[i];
                j++;
            } else {
                arrayPositivos[k] = array50flotantes[i];
                k++;
            }
        }

        mergeSort(arrayNegativos);
        mergeSort(arrayPositivos);

        System.out.println(Arrays.toString(arrayNegativos));
        System.out.println(Arrays.toString(arrayPositivos));

        int arrayIntPos[] = new int[arrayPositivos.length];

        for (int i = 0; i < arrayPositivos.length; i++) {
            arrayIntPos[i] = (int) arrayPositivos[i];
        }

        int numPares = 0;
        for (int i = 0; i < arrayIntPos.length; i++) {
            if (arrayIntPos[i]%2 == 0) {
                numPares++;
            }
        }

        int arrayPosPares[] = new int[numPares];
        int arrayPosImpares[] = new int[arrayIntPos.length - numPares];

        for (int i = 0, j = 0, k = 0; i < arrayIntPos.length; i++) {
            if (arrayIntPos[i]%2 == 0) {
                arrayPosPares[j] = arrayIntPos[i];
                j++;
            } else {
                arrayPosImpares[k] = arrayIntPos[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(arrayPosPares));
        System.out.println(Arrays.toString(arrayPosImpares));
    }
}
