package prepararExamen;

import java.util.HashMap;
import java.util.Random;

/*
    Crea un programa que genere un número entero aleatorio de 1 a 999 (inclusive) y utilice 
    un mapeado para convertir cada dígito del número generado en su equivalente en palabras.
    Además devuelve una cadena con los equivalentes en palabras de los dígitos del número 
    generado, mostrando el número generado y su representación en palabras.
    
    Ejemplo
    Número generado: 213
    En palabras: dos uno tres
*/

public class ejercicio3A {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(999) + 1;
        HashMap<Integer, String> ari = new HashMap<>();

        ari.put(0, "cero");
        ari.put(1, "uno");
        ari.put(2, "dos");
        ari.put(3, "tres");
        ari.put(4, "cuatro");
        ari.put(5, "cinco");
        ari.put(6, "seis");
        ari.put(7, "siete");
        ari.put(8, "ocho");
        ari.put(9, "nueve");

        int cifras = 0;
        int temp = numero;
        while (temp > 0) {
            temp = temp/10;
            cifras++;
        }
        int[] goku = new int[cifras];

        temp = numero;
        for (int i = cifras - 1; i >= 0; i--) {
            goku[i] = temp%10;
            temp = temp/10;
        }

        System.out.println("Traducido: ");
        System.out.println(numero);
        for (int i = 0; i < goku.length; i++) {
            System.out.print(ari.get(goku[i]) + " ");
        }
    }
}
