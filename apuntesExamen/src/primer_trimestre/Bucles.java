package primer_trimestre;

public class Bucles {
    public static void main(String[] args) {
        
        // 1. BUCLE FOR (Se usa cuando sabemos EXACTAMENTE cuántas veces repetir)
        // Estructura: (inicio; condición; incremento)
        System.out.println("--- Bucle FOR: Contando del 1 al 5 ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Vuelta número: " + i);
        }

        // 2. BUCLE WHILE (Se usa cuando NO sabemos cuántas veces repetiremos)
        // Se repite MIENTRAS la condición sea verdadera.
        System.out.println("\n--- Bucle WHILE: Cuenta atrás ---");
        int contador = 3;
        while (contador > 0) {
            System.out.println("Despegue en... " + contador);
            contador--; // ¡Importante! Si no restamos, el bucle es infinito
        }
        System.out.println("¡Fuego!");

        // 3. BUCLE DO-WHILE (Se ejecuta al menos UNA VEZ)
        // La condición se mira al final.
        System.out.println("\n--- Bucle DO-WHILE ---");
        int numero = 10;
        do {
            System.out.println("Esto se imprime aunque la condición sea falsa.");
        } while (numero < 5);
    }
}