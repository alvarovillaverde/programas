package boletin;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] notas = new int[6];

    //1. pedir notas
    for (int i = 0; i < notas.length; i++) {
        System.out.println("Introduce una nota entera:(1 a 9)");
        notas[i] = Integer.parseInt(sc.nextLine());
    }

    //2. ver notas
    System.out.println(Arrays.toString(notas));

    //3. decidir casos
    int numSus = 0;
    int numCond = 0;
    int numApro = 0;

    for (int j = 0; j < notas.length; j++) {
        if (notas[j] < 4) {
            numSus++;
        } else if (notas[j] == 4) {
            numCond++;
        } else if (notas[j] > 4) {
            numSus++;
        }
    }

    System.out.println("aprobados " +numApro);
    System.out.println("condicionados " + numCond);
    System.out.println("suspensos" + numSus);

    sc.close();
}
}
