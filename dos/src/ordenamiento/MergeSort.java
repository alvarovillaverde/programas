package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    // Método MergeSort adaptado para String[]
    public static String[] mergeSort(String array[]) {
        // Si el array tiene más de un elemento, lo dividimos y mezclamos
        if (array.length > 1) {

            // Calculamos la mitad para dividir el array
            int elementosEnA1 = array.length / 2;
            int elementosEnA2 = array.length - elementosEnA1;

            // Declaramos los dos sub-arrays temporales
            String arr1[] = new String[elementosEnA1];
            String arr2[] = new String[elementosEnA2];

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

        String[] nombresMezclados = new String[100];
        Random random = new Random();

        // Rellenamos el array con 100 nombres aleatorios
        for (int i = 0; i < nombresMezclados.length; i++) {
            int genero = random.nextInt(2);
            
            if (genero == 0)
                nombresMezclados[i] = hombres[random.nextInt(hombres.length)];
            else
                nombresMezclados[i] = mujeres[random.nextInt(mujeres.length)];
        }

        // Mostramos el resultado desordenado
        System.out.println("--- ARRAY ORIGINAL ---");
        System.out.println(Arrays.toString(nombresMezclados));

        // Ordenamos usando MergeSort
        mergeSort(nombresMezclados);

        // Mostramos la cadena ordenada
        System.out.println("\n--- ARRAY ORDENADO ALFABÉTICAMENTE ---");
        System.out.println(Arrays.toString(nombresMezclados));
    }
}