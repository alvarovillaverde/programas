package dos;

import java.util.Scanner;

public class TestPropuesto9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca distancia en km: ");
        double kms = sc.nextDouble();

        System.out.print("Introduzca el combustible consumido en litros: ");
        double litros = sc.nextDouble();

        System.out.print("Introduzca velocidad media en km/h: ");
        double vmed = sc.nextDouble();

        System.out.print("Introduzca precio de la gasolina en euros: ");
        double pgas = sc.nextDouble();

        Propuesto9 viaje = new Propuesto9(kms, litros, vmed, pgas);

        System.out.println("Tiempo de viaje: " + viaje.getTiempo() + " horas");
        System.out.println("Consumo medio: " + viaje.consumoMedio() + " L/100km");
        System.out.println("Consumo medio en euros: " + viaje.consumoEuros() + " euros/100km");

        sc.close();
    }
}

