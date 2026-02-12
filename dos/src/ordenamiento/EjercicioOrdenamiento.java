package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class EjercicioOrdenamiento {

    /**
     * Algoritmo Merge Sort (Ordenación por mezcla)
     * Divide el array recursivamente a la mitad hasta tener elementos individuales
     * y luego los mezcla de forma ordenada.
     */
    public static String[] mergeSort(String array[]) {
        // Si el array tiene más de un elemento, necesitamos dividirlo
        if (array.length > 1) {

            // Calculamos el tamaño de las dos mitades
            int elementosEnA1 = array.length / 2;
            int elementosEnA2 = array.length - elementosEnA1;

            // Declaramos e inicializamos los dos sub-arrays
            String arr1[] = new String[elementosEnA1];
            String arr2[] = new String[elementosEnA2];

            // Copiamos la primera parte del array original a arr1
            for (int i = 0; i < elementosEnA1; i++)
                arr1[i] = array[i];

            // Copiamos la parte restante a arr2
            for (int i = elementosEnA1; i < elementosEnA1 + elementosEnA2; i++)
                arr2[i - elementosEnA1] = array[i];

            // Llamadas recursivas para ordenar cada mitad
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            // Variables para el proceso de mezcla (merge)
            // i: índice del array principal
            // j: índice del sub-array 1
            // k: índice del sub-array 2
            int i = 0, j = 0, k = 0;

            // Bucle para mezclar comparando elementos de ambos sub-arrays
            while (arr1.length != j && arr2.length != k) {
                // Comparamos alfabéticamente usando compareTo
                if (arr1[j].compareTo(arr2[k]) < 0) {
                    array[i] = arr1[j];
                    i++;
                    j++;
                } else {
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }

            // Copiamos los elementos restantes si un sub-array se agota antes que el otro
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
        // Arrays de nombres
        String[] hombres = { "Alejandro", "Carlos", "Javier", "Diego", "Pablo", "Sergio", "David", "Rubén", "Manuel",
                "Adrián", "Iván", "Óscar", "Raúl", "Álvaro", "Mario", "Tomás", "Samuel", "Gonzalo", "Hugo", "Mateo",
                "Bruno", "Nicolás", "Lucas", "Martín", "Rafael", "Fernando", "Jorge", "Luis", "Enrique", "Víctor",
                "Jaime", "Andrés", "Eduardo", "Iker", "Saúl", "Ángel", "Cristian", "Marcos", "Joel", "Sebastián", 
                "Thiago", "Gael", "Adriel", "Damián", "Elías", "Max", "Leo", "Héctor" };

        String[] mujeres = { "María", "Lucía", "Sofía", "Laura", "Elena", "Ana", "Carmen", "Paula", "Claudia", "Irene",
                "Sara", "Marta", "Julia", "Noelia", "Natalia", "Alicia", "Beatriz", "Rocío", "Patricia", "Eva",
                "Verónica", "Daniela", "Andrea", "Marina", "Isabel", "Teresa", "Lidia", "Nerea", "Ariadna", "Silvia", 
                "Lorena", "Ainhoa", "Esther", "Alba", "Mónica", "Pilar", "Belén", "Helena", "Jimena", "Olga", "Amaya", 
                "Carla", "Manuela", "Violeta", "Luna", "Valeria", "Emma", "Clara" };

        // Creamos el array de 100 posiciones
        String[] nombresMezclados = new String[100];
        Random random = new Random();

        // Rellenamos el array con nombres aleatorios
        for (int i = 0; i < nombresMezclados.length; i++) {
            int genero = random.nextInt(2);
            
            // He corregido el índice para que use la longitud real de los arrays
            if (genero == 0) {
                int indiceNombre = random.nextInt(hombres.length);
                nombresMezclados[i] = hombres[indiceNombre];
            } else {
                int indiceNombre = random.nextInt(mujeres.length);
                nombresMezclados[i] = mujeres[indiceNombre];
            }
        }

        // Mostramos el resultado original
        System.out.println("--- ARRAY ORIGINAL (MEZCLADO) ---");
        System.out.println(Arrays.toString(nombresMezclados));

        // Ordenamos la cadena usando tu método Merge Sort
        nombresMezclados = mergeSort(nombresMezclados);

        // Mostramos la cadena ordenada
        System.out.println("\n--- ARRAY ORDENADO (MERGE SORT) ---");
        System.out.println(Arrays.toString(nombresMezclados));
    }
}