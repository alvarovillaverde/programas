package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Resuelto9binS {
    public static int buscabin(int[] a, int valor, int min, int max) {
        if (min == max) {
            return -1;
        }
        int mitad = (min + max) / 2;
        System.out.println("min " + min + " a[min] " + a[min] + " max " + max + " a[max] " + a[max] + " mitad " + mitad);

        if (valor == a[mitad]) {
            return mitad;
        }
        if (valor == a[min]) {
            return min;
        }
        if (valor == a[max]) {
            return max;
        }

        if (valor > a[mitad]) {
            return buscabin(a, valor, mitad + 1, max);
        } else {
            return buscabin(a, valor, min, mitad - 1);
        }
        
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[50];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + random.nextInt(99);
        }
        Arrays.sort(numeros);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(numeros));

        System.out.println("numero a buscar");
        int num = Integer.parseInt(sc.nextLine());

        int indice = buscabin(numeros, num, 0, numeros.length-1);

        if (indice >= 0) {
            System.out.println("encontrado el valor " + num + " en la posición " + indice);
        }

        sc.close();
    }
}
