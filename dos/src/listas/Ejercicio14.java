package listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio14 {
/* Un supermercado de productos ecológicos nos ha pedido hacer un programa para vender su mercancía. 
En esta primera versión del programa se tendrán en cuenta los productos que se indican en la tabla 
junto con su precio. Los productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
indicar el producto y el número de unidades que se compran, por ejemplo “guisantes” si se quiere comprar
un bote de guisantes y la cantidad, por ejemplo “3” si se quieren comprar 3 botes. La compra se termina 
con la palabra “fin. Suponemos que el usuario no va a intentar comprar un producto que no existe.
Utiliza un diccionario para almacenar los nombres y precios de los productos y una o varias listas para
almacenar la compra que realiza el usuario. A continuación se muestra una tabla con los productos 
disponibles y sus respectivos precios:

avena garbanzos tomate jengibre quinoa guisantes
2,21    2,39     1,59    3,13    4,50    1,60

Ejemplo:
Producto: tomate
Cantidad: 1
Producto: quinoa
Cantidad: 2
Producto: avena
Cantidad: 1
Producto: tomate
Cantidad: 2
Producto: fin

Producto Precio Cantidad Subtotal
---------------------------------
tomate    1,59      1      1,59
quinoa    4,50      2      9,00
avena     2,21      1      2,21
tomate    1,59      2      3,18
---------------------------------
TOTAL: 15,98 */
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // declaro el mapa para los productos y su precio
        Map<String, Double> lista = new HashMap<String, Double>();
        
        // Listas para almacenar la compra (productos y cantidades por separado)
        List<String> productosComprados = new ArrayList<>();
        List<Integer> cantidadesCompradas = new ArrayList<>();

        lista.put("avena", 2.21);
        lista.put("garbanzos", 2.39);
        lista.put("tomate", 1.59);
        lista.put("jengibre", 3.13);
        lista.put("quinoa", 4.50);
        lista.put("guisantes", 1.60);
        
        // variables para los calculos
        String producto;
        int cantidad;

        // --- ENTRADA DE DATOS ---
        do {
            System.out.print("Producto: ");
            producto = sc.nextLine();

            if (!producto.equals("fin")) {
                System.out.print("Cantidad: ");
                cantidad = Integer.parseInt(sc.nextLine());
                
                // Guardamos en las listas
                productosComprados.add(producto);
                cantidadesCompradas.add(cantidad);
            }

        } while (!producto.equals("fin"));

        // --- SALIDA DE DATOS (TABLA) ---
        System.out.println("\nProducto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");
        
        double total = 0;

        for (int i = 0; i < productosComprados.size(); i++) {
            String nombre = productosComprados.get(i);
            int cant = cantidadesCompradas.get(i);
            double precioUnitario = lista.get(nombre);
            double subtotal = precioUnitario * cant;
            
            total += subtotal;

            // %-10s alinea el texto a la izquierda, %5.2f formatea el decimal
            System.out.printf("%-10s %5.2f %8d %10.2f\n", nombre, precioUnitario, cant, subtotal);
        }

        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %.2f\n", total);

        sc.close();
    }
}
