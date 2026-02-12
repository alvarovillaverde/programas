package boletin;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 0;

    System.out.println("cuantos sueldos vas a introducir");
    n = Integer.parseInt(sc.nextLine());

    double[] sueldos = new double[n];

    //1. pedir sueldos
    for (int i = 0; i < sueldos.length; i++) {
        System.out.println("Introduce un sueldo: ");
        sueldos[i] = Integer.parseInt(sc.nextLine());
    }

    //2. ver sueldos
    System.out.println(Arrays.toString(sueldos));

    double max = sueldos[0];
    double suma = 0d;

    //mostrar el sueldo maximo y el promedio
    for(Double d : sueldos) {
        suma += d;
        if (d > max) {
            max = d;
        }
    }
    System.out.println("sueldo maximo: " + max);
    System.out.println("sueldo promedio: " + (suma/n));

    sc.close();
}
}
