package boletin;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    int contador = 0;
    int suma = 0;

    do {
        System.out.println("Introduce numero positivo o un negativo para finalizar");
        n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            contador++;
            suma += n; 
        }
    } while (n >= 0);

    System.out.println("La media de los numeros es " + ((double)suma / contador));

    sc.close();
}
}
