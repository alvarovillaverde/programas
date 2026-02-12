package listas;

import java.util.ArrayList;
import java.util.List;

public class VectorALista {
    public static void main(String[] args) {
        // 1. Usar la interfaz List para mayor flexibilidad
        // ArrayList no necesita el "incremento" (el 5 que tenías), 
        // ya que gestiona su crecimiento de forma mucho más eficiente (un 50% extra cada vez).
        List<String> listaSuper = new ArrayList<>(10);

        // 2. Añadir elementos (Igual que en Vector)
        listaSuper.add("Leche");
        listaSuper.add("Huevos");
        listaSuper.add("Pan");
        listaSuper.add("Café");

        // 3. Insertar en una posición específica
        // En colecciones modernas usamos .add(índice, objeto) en lugar de insertElementAt
        listaSuper.add(1, "Fruta");

        // 4. Eliminar un elemento
        listaSuper.remove("Huevos");

        // 5. Recorrer el ArrayList (Moderno con Lambda / forEach)
        System.out.println("--- Lista de la Compra ---");
        listaSuper.forEach(item -> System.out.println("Producto: " + item));

        // 6. Datos de la colección
        System.out.println("\n--- Info del ArrayList ---");
        System.out.println("Tamaño actual: " + listaSuper.size());
        
        // Nota: ArrayList no expone .capacity() directamente como Vector, 
        // porque la filosofía moderna es que no te preocupes por la gestión interna de memoria.
    }
}