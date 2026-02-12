package ordenamiento;

import java.util.Arrays;

public class QuickSort {
    
    public static class AlgoritmoQuickSort {
        
        public static void main(String[] args) {
            // Los datos de nuestro ejemplo de mascotas
            int[] datos = { 2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2 };
            quicksort(datos, 0, datos.length - 1);
            System.out.print("Datos ordenados: ");
            System.out.println(Arrays.toString(datos));
        }
        
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
    }
}
