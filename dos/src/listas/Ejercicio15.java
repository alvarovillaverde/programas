package listas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Diccionario de precios
        Map<String, Double> precios = new HashMap<>();
        precios.put("avena", 2.21);
        precios.put("garbanzos", 2.39);
        precios.put("tomate", 1.59);
        precios.put("jengibre", 3.13);
        precios.put("quinoa", 4.50);
        precios.put("guisantes", 1.60);

        // 2. Cesta de la compra (Usamos LinkedHashMap para mantener el orden de inserción)
        // Clave: Nombre del producto, Valor: Cantidad total acumulada
        Map<String, Integer> cesta = new LinkedHashMap<>();

        String productoInput;

        // --- ENTRADA DE DATOS ---
        while (true) {
            System.out.print("Producto: ");
            productoInput = sc.nextLine().toLowerCase(); // Normalizamos a minúsculas

            if (productoInput.equals("fin")) {
                break;
            }

            if (precios.containsKey(productoInput)) {
                System.out.print("Cantidad: ");
                int cantidadInput = Integer.parseInt(sc.nextLine());

                // Lógica de agrupación: si ya existe, sumamos la nueva cantidad
                if (cesta.containsKey(productoInput)) {
                    cesta.put(productoInput, cesta.get(productoInput) + cantidadInput);
                } else {
                    cesta.put(productoInput, cantidadInput);
                }
            } else {
                System.out.println("Lo siento, ese producto no está disponible.");
            }
        }

        // --- CÓDIGO DE DESCUENTO ---
        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        String codigo = sc.nextLine();

        // --- SALIDA DE DATOS (TABLA) ---
        System.out.println("\nProducto   Precio   Cantidad   Subtotal");
        System.out.println("---------------------------------------");

        double totalSinDescuento = 0;

        // Iteramos sobre la cesta agrupada
        for (Map.Entry<String, Integer> entrada : cesta.entrySet()) {
            String nombre = entrada.getKey();
            int cantidad = entrada.getValue();
            double precioUnitario = precios.get(nombre);
            double subtotal = precioUnitario * cantidad;

            totalSinDescuento += subtotal;

            System.out.printf("%-10s %6.2f %8d %11.2f\n", nombre, precioUnitario, cantidad, subtotal);
        }

        System.out.println("---------------------------------------");

        // Cálculo del descuento
        double descuento = 0;
        if (codigo.equalsIgnoreCase("ECODTO")) {
            descuento = totalSinDescuento * 0.10;
            System.out.printf("Descuento: %.2f\n", descuento);
            System.out.println("---------------------------------------");
        }

        System.out.printf("TOTAL: %.2f\n", (totalSinDescuento - descuento));

        sc.close();
    }
}