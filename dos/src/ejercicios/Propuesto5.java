package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Propuesto5 {
    /* "5. (Ejercicio de dificultad alta) Programa que realice una sopa de letras. La sopa de letras tendrá
	 * un tamaño de matriz 15 x 15. El programa pedirá 10 palabras, las cuales las irá escondiendo de forma
	 * aleatoria por la matriz (obviamente las palabras siempre tendrán 15 letras o menos). 
	 * Una vez escondidas las palabras rellenará las demás casillas de la matriz con 
	 * letras de forma aleatoria. Solo se utilizarán mayúsculas. 
	 * Si el usuario introduce palabras en minúsculas se transformarán a mayúsculas."
	 */

	
	
	    public static void main(String[] args) {

	    	char[][] sopa = new char[15][15];
	        
	    	Scanner sc = new Scanner(System.in);
	        
	    	Random rand = new Random();

	        // Inicializar matriz con espacios
	        for (int i = 0; i < 15; i++) {
	            for (int j = 0; j < 15; j++) sopa[i][j] = ' ';
	        }

	        System.out.println("--- Creador de Sopa de Letras ---");

	        // Pedir 10 palabras
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Introduce la palabra " + i + ": ");
	            String palabra = sc.nextLine().toUpperCase();
	            
	            if (palabra.length() > 15) {
	                System.out.println("Palabra demasiado larga, intenta otra.");
	                i--; continue;
	            }

	            // Intentar colocar la palabra aleatoriamente
	            boolean colocada = false;
	            while (!colocada) {
	                int fila = rand.nextInt(15);
	                int col = rand.nextInt(15);
	                boolean horizontal = rand.nextBoolean();

	                if (puedeColocar(sopa, palabra, fila, col, horizontal)) {
	                    colocarPalabra(sopa, palabra, fila, col, horizontal);
	                    colocada = true;
	                }
	            }
	        }

	        // Rellenar huecos vacíos con letras aleatorias
	        for (int i = 0; i < 15; i++) {
	            for (int j = 0; j < 15; j++) {
	                if (sopa[i][j] == ' ') {
	                    sopa[i][j] = (char) ('A' + rand.nextInt(26));
	                }
	            }
	        }

	        // Imprimir la sopa de letras
	        System.out.println("\nSOPA DE LETRAS RESULTANTE:");
	        for (char[] fila : sopa) {
	            for (char c : fila) System.out.print(c + " ");
	            System.out.println();
	        }

            sc.close();
	    }

	    private static boolean puedeColocar(char[][] m, String p, int f, int c, boolean h) {
	        if (h && c + p.length() > 15) return false;
	        if (!h && f + p.length() > 15) return false;
	        
	        for (int i = 0; i < p.length(); i++) {
	            char actual = h ? m[f][c + i] : m[f + i][c];
	            if (actual != ' ' && actual != p.charAt(i)) return false;
	        }
	        return true;
	    }

	    private static void colocarPalabra(char[][] m, String p, int f, int c, boolean h) {
	        for (int i = 0; i < p.length(); i++) {
	            if (h) m[f][c + i] = p.charAt(i);
	            else m[f + i][c] = p.charAt(i);
	        }
	    }
}
