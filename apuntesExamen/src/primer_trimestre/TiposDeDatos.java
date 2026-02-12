package primer_trimestre;

/**
 * Clase para repasar los tipos de datos básicos en Java.
 * Recuerda: El nombre de la clase (TipoDeDatos) debe coincidir con el archivo (.java)
 */
public class TiposDeDatos {

    public static void main(String[] args) {
        
        // ---------------------------------------------------------
        // 1. TIPOS PRIMITIVOS (Van en minúscula)
        // ---------------------------------------------------------

        // ENTEROS (Para números sin decimales)
        byte minúsculo = 127;          // 8 bits (muy pequeño)
        short pequeño = 32767;         // 16 bits
        int entero = 2147483647;       // 32 bits (EL MÁS USADO)
        long muyLargo = 9000000000L;   // 64 bits (Ojo: requiere la 'L' al final)

        // DECIMALES (Punto flotante)
        float decimalSimple = 3.14f;    // 32 bits (Ojo: requiere la 'f' al final)
        double decimalDoble = 3.14159;  // 64 bits (EL MÁS USADO para decimales)

        // OTROS
        char letra = 'A';               // Un solo carácter (siempre comillas simples '')
        boolean esJavaFacil = true;     // Solo puede ser true o false

        // ---------------------------------------------------------
        // 2. TIPOS DE OBJETO / REFERENCIA (Empiezan por Mayúscula)
        // ---------------------------------------------------------
        
        String frase = "Esto es una cadena de texto"; // Usa comillas dobles ""

        // ---------------------------------------------------------
        // 3. SALIDA POR CONSOLA (Para ver los resultados)
        // ---------------------------------------------------------
        
        System.out.println("--- APUNTES: TIPOS DE DATOS ---");
        System.out.println("El valor del entero es: " + entero);
        System.out.println("El decimal doble es: " + decimalDoble);
        System.out.println("Mi inicial es: " + letra);
        System.out.println("¿Me gusta Java?: " + esJavaFacil);
        System.out.println("Mensaje: " + frase);
    }
}
