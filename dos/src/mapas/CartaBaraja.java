package mapas;

import java.util.Random;

public class CartaBaraja implements Comparable<CartaBaraja> {

    // 2. Definimos los Enums
    public enum Valor {
        DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY, AS
    }

    public enum Palo {
        OROS, COPAS, ESPADAS, BASTOS
    }

    // 3. ATRIBUTOS
    private final Valor valor;
    private final Palo palo;
    private static final Random random = new Random();

    // 4. CONSTRUCTOR ALEATORIO
    public CartaBaraja() {
        this.valor = Valor.values()[random.nextInt(Valor.values().length)];
        this.palo = Palo.values()[random.nextInt(Palo.values().length)];
    }

    // 5. CONSTRUCTOR ESPECÍFICO
    public CartaBaraja(Valor valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // --- MÉTODOS ADICIONALES PARA COMPLETAR LA CLASE ---

    public Valor getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }

    @Override
    public int compareTo(CartaBaraja otra) {
        // Primero comparamos por palo
        int comparacionPalo = this.palo.compareTo(otra.palo);
        if (comparacionPalo != 0) {
            return comparacionPalo;
        }
        // Si es el mismo palo, comparamos por valor
        return this.valor.compareTo(otra.valor);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        result = prime * result + ((palo == null) ? 0 : palo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CartaBaraja other = (CartaBaraja) obj;
        if (valor != other.valor)
            return false;
        if (palo != other.palo)
            return false;
        return true;
    }

    
}