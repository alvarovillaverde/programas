package prepararExamen;

import java.util.Arrays;
import java.util.Random;

/*
    Genera un array de 60 posiciones ENTERAS que tomarán valores entre -150 y 150. 
    Separa en dos matrices los valores pares e impares. Ordena ambos arrays utilizando el método Quick Sort.
Considera el cero como par. A continuación, separa el array de impares en dos arrays, uno de positivos y 
otro de negativos; muestra ambos.
*/

public class ejercicio1A {

    public static void quicksort(int[] arreglo, int izq, int der) {
            if (izq < der) {
                int indicePivote = particion(arreglo, izq, der);
                // Ordenar la parte izquierda
                quicksort(arreglo, izq, indicePivote - 1);
                // Ordenar la parte derecha
                quicksort(arreglo, indicePivote + 1, der);
            }
        }

    private static int particion(int[] arreglo, int izq, int der) {
            // Elegimos el último elemento como pivote
            int pivote = arreglo[der];
            int i = (izq - 1);
            
            for (int j = izq; j < der; j++) {
                if (arreglo[j] <= pivote) {
                    i++;
                    // Intercambiar arreglo[i] y arreglo[j]
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
            
            // Intercambiar el pivote con el elemento en i + 1
            int temp = arreglo[i + 1];
            arreglo[i + 1] = arreglo[der];
            arreglo[der] = temp;
            
            return i + 1;
        }
    public static void main(String[] args) {
        int[] array60Enteros = new int[60];
        Random hector = new Random();

        for (int i = 0; i < array60Enteros.length; i++) {
            array60Enteros[i] = hector.nextInt(-150, 150);
        }
        //System.out.println(Arrays.toString(array60Enteros));

        int contPares = 0;
        for (int i : array60Enteros) {
            if (i%2 == 0) {
                contPares++;
            }
        }

        int[] arrayPares = new int[contPares];
        int[] arrayImpares = new int[array60Enteros.length - contPares];

        for (int i = 0, j = 0, k = 0; i < array60Enteros.length; i++) {
            if (array60Enteros[i]%2 == 0) {
                arrayPares[j] = array60Enteros[i];
                j++;
            } else {
                arrayImpares[k] = array60Enteros[i];
                k++;
            }
        }

        quicksort(arrayImpares, 0, arrayImpares.length - 1);
        quicksort(arrayPares, 0, arrayPares.length - 1);

        System.out.println("Array de pares" + Arrays.toString(arrayPares));
        System.out.println("Array de impares" + Arrays.toString(arrayImpares));

        int contNeg = 0;
        for (int i = 0; i < arrayImpares.length; i++) {
            if (arrayImpares[i] < 0) contNeg++;
        }

        int[] arrayNegativos = new int[contNeg];
        int[] arrayPositivos = new int[arrayImpares.length - contNeg];

        for (int i = 0, j = 0, k = 0; i < arrayImpares.length; i++) {
            //System.out.println(arrayImpares[i]);
            if (arrayImpares[i] < 0) {
                arrayNegativos[j] = arrayImpares[i];
                j++;
            } else {
                arrayPositivos[k] = arrayImpares[i];
                k++;
            }
        }

        System.out.println("Array impares negativos" + Arrays.toString(arrayNegativos));
        System.out.println("Array impares positivos" + Arrays.toString(arrayPositivos));
    }
}
