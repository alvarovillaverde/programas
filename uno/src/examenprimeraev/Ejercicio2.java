package examenprimeraev;

import java.util.Scanner;

public class Ejercicio2 {
    /*Crea un programa que calcule descuentos en una tienda considerando los siguientes elementos a pedir al usuario: 
    importe de la compra, tipo de cliente (Regular, VIP, Nuevo), el dia de la semana, la temporada (Normal, Rebajas) 
    y el uso de cupón de descuento
LAS Reglas de descuento SON:
a/ Basado en el importe: € 0 - 100: 0%, € 100.01 - 500: 5% y € 500.01 o más: 10%
b/ Tipo de cliente: Regular: 0%, VIP: 5%, Nuevo: 2% en su primera compra
c/ Día de la semana: Lunes a jueves: nada, Viernes a domingo: 2% adicional
d/ Temporada: Normal: nada, Rebajas: 5% adicional
e/ Cupón: Si se usa un cupón, 5% adicional
El descuento máximo no puede superar el 25%
Muestre*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("introduce importe de la compra: ");
    int importe = Integer.parseInt(sc.nextLine());

    System.out.println("Que tipo eres: 1 regular 2 vip 3 nuevo");
    int tipo = Integer.parseInt(sc.nextLine());

    System.out.println("Que dia es: 1 de lunes a jueves, 2 de viernes a domingo");
    int dia = Integer.parseInt(sc.nextLine());

    System.out.println("Que temporada estamos: 1 normal o 2 rebajas");
    int temporada = Integer.parseInt(sc.nextLine());

    int descuento = 0;

    if (importe <= 500 || importe >=101) {
        descuento += 5;
    } 
    if (importe > 500) {
        descuento += 10;
    }


    if (tipo == 2) {
        descuento += 5;
    }
    if (tipo == 3) {
        descuento += 2;
    }

    if (dia == 2) {
        descuento += 2;
    }

    if (temporada == 2) {
        descuento += 5;
    }

    if (descuento > 25) {
        descuento = 25;
    }

    sc.close();
}
}
