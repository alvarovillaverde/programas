package mapas;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import mapas.CartaBaraja.Valor;

public class PuntuacionMano {
    
    // 1. Definimos el mapa estático
    public static HashMap<Valor, Integer> puntos = new HashMap<>();

    // 2. Inicializamos los valores (Bloque static)
    static {
        puntos.put(Valor.AS, 11);
        puntos.put(Valor.TRES, 10);
        puntos.put(Valor.REY, 4);
        puntos.put(Valor.CABALLO, 3);
        puntos.put(Valor.SOTA, 2);
        
        // El resto valen 0 puntos
        puntos.put(Valor.DOS, 0);
        puntos.put(Valor.CUATRO, 0);
        puntos.put(Valor.CINCO, 0);
        puntos.put(Valor.SEIS, 0);
        puntos.put(Valor.SIETE, 0);
    }

    // 3. Método para obtener puntos de una sola carta
    public static int calcularPuntosCarta(CartaBaraja carta) {
        return puntos.get(carta.getValor());
    }

    // 4. Método para sumar los puntos de una lista (mano)
    public static int sumarMano(List<CartaBaraja> mano) {
        int total = 0;
        for (CartaBaraja c : mano) {
            total += calcularPuntosCarta(c);
        }
        return total;
    }

    // 5. El método MAIN para probarlo todo
    public static void main(String[] args) {
        // Creamos una mano de 5 cartas aleatorias
        ArrayList<CartaBaraja> miMano = new ArrayList<>();
        
        System.out.println("=== TU MANO DE CARTAS ===");
        for (int i = 0; i < 5; i++) {
            CartaBaraja nueva = new CartaBaraja(); // Generada aleatoriamente
            miMano.add(nueva);
            System.out.println("- " + nueva + " (" + calcularPuntosCarta(nueva) + " pts)");
        }

        // Mostramos el total
        int resultado = sumarMano(miMano);
        System.out.println("=========================");
        System.out.println("PUNTUACIÓN TOTAL: " + resultado);
        
        if (resultado > 30) {
            System.out.println("¡Vaya mano! Estás en racha.");
        }
    }
}