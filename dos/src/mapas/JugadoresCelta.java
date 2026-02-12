package mapas;

import java.util.Map;
import java.util.TreeMap;

public class JugadoresCelta {
    public static void main(String[] args) {
        // El TreeMap ordenará automáticamente por la clave (Integer - Dorsal)
        TreeMap<Integer, String> plantillaCelta = new TreeMap<>();

        plantillaCelta.put(10, "Iago Aspas");
        plantillaCelta.put(1, "Iván Villar");
        plantillaCelta.put(6, "Ilaix Moriba");
        plantillaCelta.put(8, "Fran Beltrán");
        plantillaCelta.put(3, "Oscar Mingueza");
        plantillaCelta.put(17, "Jonathan Bamba");

        System.out.println("--- Plantilla del RC Celta (Ordenada por Dorsal) ---");
        
        for (Map.Entry<Integer, String> jugador : plantillaCelta.entrySet()) {
            System.out.println("Dorsal " + jugador.getKey() + ": " + jugador.getValue());
        }
    }
}