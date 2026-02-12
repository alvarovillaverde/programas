package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Propuesto8 {
public static void main(String[] args) {
    Random random = new Random();
    int [] aleatorios = new int[1000];

    for (int i = 0; i < aleatorios.length; i++) {
        aleatorios[i] = random.nextInt(500);
    }

    System.out.println(Arrays.toString(aleatorios));

    Arrays.sort(aleatorios);

    int [] altos = new int[10];

    altos = Arrays.copyOfRange(altos, 990, 999);
    System.out.println("10 mas altos son ");
    System.out.println(Arrays.toString(altos));
}
}
