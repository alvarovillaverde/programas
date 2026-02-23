package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploColeccionesGatos {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<>();

        g.add(new Gato("Garfield", "naranja", "mestizo"));
        g.add(new Gato("Pepe", "gris", "angora"));
        g.add(new Gato("Mauri", "blanco", "manx"));
        g.add(new Gato("Ulises", "marrón", "persa"));
        g.add(new Gato("Adán", "negro", "angora"));

        // 1. Sort: Ordena según el compareTo definido en la clase Gato
        Collections.sort(g);
        System.out.println("--- Ordenados (A-Z) ---");
        imprimirLista(g);

        // 2. Reverse: Invierte el orden actual de la lista
        Collections.reverse(g);
        System.out.println("--- Invertidos (Z-A) ---");
        imprimirLista(g);

        // 3. Shuffle: Mezcla los elementos aleatoriamente
        Collections.shuffle(g);
        System.out.println("--- Mezclados aleatoriamente ---");
        imprimirLista(g);

        // 4. Min y Max: Encuentran el elemento menor y mayor (alfabéticamente)
        // Nota: Requiere que la lista esté basada en Comparable
        System.out.println("El gato que va primero alfabéticamente: " + Collections.min(g).getNombre());
        System.out.println("El gato que va último alfabéticamente: " + Collections.max(g).getNombre());

        // 5. Frequency: Cuenta cuántas veces aparece un objeto exacto
        Gato clonGarfield = g.get(0); // Supongamos que tomamos uno de la lista
        System.out.println("Frecuencia de " + clonGarfield.getNombre() + ": " + Collections.frequency(g, clonGarfield));

        // 6. ReplaceAll: Reemplaza todas las apariciones de un objeto por otro
        Gato nuevoGato = new Gato("Botas", "azul", "siamés");
        Collections.replaceAll(g, g.get(0), nuevoGato); 
        System.out.println("--- Tras reemplazar al primer gato por Botas ---");
        imprimirLista(g);

        // 7. BinarySearch: Busca la posición de un elemento (LA LISTA DEBE ESTAR ORDENADA)
        Collections.sort(g); // Reordenamos primero
        int index = Collections.binarySearch(g, nuevoGato);
        System.out.println("Botas se encuentra en el índice: " + index);

        // 8. Unmodifiable: Crea una vista de la lista que no se puede modificar
        List<Gato> listaProtegida = Collections.unmodifiableList(g);
        // listaProtegida.add(new Gato("Intruso", "rojo", "desconocido")); // Esto lanzaría una excepción
        System.out.println("\nLista inmutable creada con éxito.");
    }

    // Método auxiliar para no repetir código de impresión
    public static void imprimirLista(ArrayList<Gato> lista) {
        for (Gato gato : lista) {
            System.out.print(gato.getNombre() + " ");
        }
        System.out.println("\n");
    }
}