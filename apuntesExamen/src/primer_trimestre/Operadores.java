package primer_trimestre;

public class Operadores {
    public static void main(String[] args) {
        
        // 1. OPERADORES ARITMÉTICOS (Cálculos)
        int a = 10;
        int b = 3;
        
        int suma = a + b;        // 13
        int resta = a - b;       // 7
        int multi = a * b;       // 30
        int div = a / b;         // 3 (Ojo: al ser int, pierde los decimales)
        int resto = a % b;       // 1 (Es el sobrante de la división)

        // 2. OPERADORES DE COMPARACIÓN (Devuelven true o false)
        boolean esIgual = (a == b);    // false
        boolean esDistinto = (a != b); // true
        boolean esMayor = (a > b);     // true

        // 3. OPERADORES LÓGICOS (Para combinar condiciones)
        // && (AND): Ambas deben ser true
        // || (OR): Al menos una debe ser true
        // !  (NOT): Invierte el valor
        boolean condicion = (a > 5 && b < 5); // true, porque ambas se cumplen

        System.out.println("Suma: " + suma);
        System.out.println("¿Es 'a' mayor que 'b'?: " + esMayor);
        System.out.println("Resultado lógico: " + condicion);
    }
}