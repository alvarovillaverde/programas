package boletin;

import java.util.Scanner;

public class Ejercicio5V2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = (int) (Math.random() * 1000 + 1);
    int intento;
    int contador = 0;

    do {
        contador++;
        System.out.println("Estas en el intento " + contador + " de un maximo de 10 intentos");
        System.out.println("Introduce un numero para acertar entre 1 y 1000");
        intento = Integer.parseInt(sc.nextLine());
        if (intento < n) {
            System.out.println("El numero a acertar es mayor que el introducido");
        } else if (intento > n){
            System.out.println("El numero a acertar es menor que el introducido");
        }
    } while (n != intento || contador < 10);

    if (contador > 10) {
        System.out.println("No has conseguido acertar el numero en 10 intentos");
    } else if (contador <= 10){
        System.out.println("Has acertado el numero " + n + " :) en " + contador + " intentos");
    }

    sc.close();
}
}
