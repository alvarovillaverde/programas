package listas;

import java.util.Random;

public class Moneda {
    private static String[] valores = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
    private static String[] posiciones = {"cara", "cruz"};
    
    private String valor;
    private String posicion;

    // Constructor aleatorio total (para la primera moneda)
    public Moneda() {
        Random r = new Random();
        this.valor = valores[r.nextInt(valores.length)];
        this.posicion = posiciones[r.nextInt(posiciones.length)];
    }

    // Constructor basado en otra moneda (sigue la pauta)
    public Moneda(Moneda anterior) {
        Random r = new Random();
        // 50% de probabilidad de mantener valor o posición
        if (r.nextBoolean()) {
            this.valor = anterior.getValor(); // Mismo valor
            this.posicion = posiciones[r.nextInt(posiciones.length)]; // Nueva posición
        } else {
            this.posicion = anterior.getPosicion(); // Misma posición
            this.valor = valores[r.nextInt(valores.length)]; // Nuevo valor
        }
    }

    public String getValor() {
        return valor; 
    }
    
    public String getPosicion() { 
        return posicion; 
    }

    @Override
    public String toString() {
        return valor + " " + posicion;
    }
}