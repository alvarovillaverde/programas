package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class CocktailSort {

    public static int[] cocktailSort(int[] numbers) {
    boolean swapped = true;
    int i = 0;
    int j = numbers.length - 1;

    while (i < j && swapped) {
        swapped = false;
        for (int k = i; k < j; k++) {
            if (numbers[k] > numbers[k + 1]) {
                int temp = numbers[k];
                numbers[k] = numbers[k + 1];
                numbers[k + 1] = temp;
                swapped = true;
            }
        }
        j--;

        if (swapped) {
            swapped = false;
            for (int k = j; k > i; k--) {
                if (numbers[k] < numbers[k - 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k - 1];
                    numbers[k - 1] = temp;
                    swapped = true;
                }
            }
        }
        i++;
    }
    return numbers;
}
    public static void main(String[] args) {
        int[] datos = {2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2};

        datos = cocktailSort(datos);

        System.out.println(Arrays.toString(datos));

        int[] muchas = new int[10000];
        Random random = new Random();
        for (int i = 0; i < muchas.length; i++) {
            muchas[i] = random.nextInt(10);
        }

        muchas = cocktailSort(muchas);
        System.out.println(Arrays.toString(muchas));
    }
    
}
