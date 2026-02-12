package ordenamiento;

import java.util.Arrays;

public class BubbleSort {

    // para enteros
    public static int[] burbuja(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int swap = array[j];
                    array[j] = array[i];
                    array[i] = swap;
                }
            }
        }
        return array;
    }

    //para dobles
    public static double[] burbuja(double[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    double swap = array[j];
                    array[j] = array[i];
                    array[i] = swap;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
       int[] datos = {2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2};
       
       datos = burbuja(datos);

       System.out.println(Arrays.toString(datos));

       double[] masDatos = {1.5, 4.2, 0.8, 9.1, 3.3, 1.9, 8.4, 4.7, 7.0};

       masDatos = burbuja(masDatos);

       System.out.println(Arrays.toString(masDatos));

    }
}
