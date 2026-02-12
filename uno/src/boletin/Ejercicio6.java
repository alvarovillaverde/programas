package boletin;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double n;
    double suma = 0;

    do {
        System.out.println("Introduce un numero o 0 para finalizar");
        n = Double.parseDouble(sc.nextLine());
        suma = n + suma;
    } while (n != 0);

    System.out.println("Aqui tienes la suma de tus numeros " + suma);

    sc.close();
}
}
