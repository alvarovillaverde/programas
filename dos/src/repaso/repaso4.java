package repaso;

import java.util.Arrays;
import java.util.Random;

/*
    Genera un array de 60 posiciones DOBLES que tomarán valores entre -200 y 200. 
    Separe en dos matrices los valores positivos y negativos. Ordene ambos arrays por el método de QuickSort.

    Considere el cero positivo. A continuación, separe el array de negativos en dos arrays, uno de pares y 
    otro de impares (use casteo); muestre ambos.
*/

public class repaso4 {
    public static void quicksort(double[] arreglo, int izq, int der) {
                if (izq < der) {
                    int indicePivote = particion(arreglo, izq, der);
                    // Ordenar la parte izquierda
                    quicksort(arreglo, izq, indicePivote - 1);
                    // Ordenar la parte derecha
                    quicksort(arreglo, indicePivote + 1, der);
                }
            }

    private static int particion(double[] arreglo, int izq, int der) {
            // Elegimos el último elemento como pivote
            double pivote = arreglo[der];
            int i = (izq - 1);
            
            for (int j = izq; j < der; j++) {
                if (arreglo[j] <= pivote) {
                    i++;
                    // Intercambiar arreglo[i] y arreglo[j]
                    double temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
            
            // Intercambiar el pivote con el elemento en i + 1
            double temp = arreglo[i + 1];
            arreglo[i + 1] = arreglo[der];
            arreglo[der] = temp;
            
            return i + 1;
        }
    public static void main(String[] args) {
        Random r = new Random();
        double[] array60dobles = new double[60];

        int contNeg = 0;
        for (int i = 0; i < array60dobles.length; i++) {
            array60dobles[i] = r.nextDouble(-200, 200);
            if (array60dobles[i] < 0) contNeg++;
        }

        // Creamos los arrays con el tamaño exacto para evitar NULLs
        double[] arrayNegativos = new double[contNeg];
        double[] arrayPositivos = new double[array60dobles.length - contNeg];

        for (int i = 0, j = 0, k = 0; i < array60dobles.length; i++) {
            if (array60dobles[i] < 0) {
                arrayNegativos[j] = array60dobles[i];
                j++;
            } else {
                arrayPositivos[k] = array60dobles[i];
                k++;
            }
        }

        quicksort(arrayNegativos, 0, arrayNegativos.length - 1);
        quicksort(arrayPositivos, 0, arrayPositivos.length - 1);
        
        int numPares = 0;
        for (int i = 0; i < arrayNegativos.length; i++) {
            if ((int)arrayNegativos[i]%2 == 0) {
                numPares++;
            }
        }

        double arrayNegPares[] = new double[numPares];
        double arrayNegImpares[] = new double[arrayNegativos.length - numPares];

        for (int i = 0, j = 0, k = 0; i < arrayNegativos.length; i++) {
            if ((int)arrayNegativos[i]%2 == 0) {
                arrayNegPares[j] = arrayNegativos[i];
                j++;
            } else {
                arrayNegImpares[k] = arrayNegativos[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(arrayNegPares));
        System.out.println(Arrays.toString(arrayNegImpares));
    }
}
