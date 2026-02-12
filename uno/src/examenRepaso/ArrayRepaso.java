package examenRepaso;

public class ArrayRepaso {
    public static void main(String[] args) {
        double[] peso = {102.8, 912, 012, 31, 98230, 1};
        minMaxArray(peso);
    }
    public static void minMaxArray(double[] peso) { // Pide un array de enteros.
        double max = peso[0]; // Asume primero es max.
        double min = peso[0]; // Asume primero es min.

        for (Double entero : peso) { // Recorre array.
            if (entero > max) // Si es mayor que max actual.
                max = entero; // Actualiza max.
            if (entero < min) // Si es menor que min actual
                min = entero; // Actualiza min
        }

        System.out.println("el maximo valos de los pesos es : " + max); // Imprime max
        System.out.println("el minimo valor de los pesos es : " + min); // Imprime min
    }
}
