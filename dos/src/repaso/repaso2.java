package repaso;

import java.util.Arrays;
import java.util.Scanner;

public class repaso2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        String resultado = "";

        System.out.println("Pasa la cadena separando las palabras con espacios: ");
        cadena = sc.nextLine();
        
        String[] arrayPalabras = cadena.split(" ");
        System.out.println(Arrays.toString(arrayPalabras));
        
        for (int i = 0, j; i < arrayPalabras.length; i++) {
            String temp = "";
            temp += arrayPalabras[i];
            j = temp.length() - 1;
            char[] arrayTemporal = temp.toCharArray();
            while (j >= 0) {
                resultado += arrayTemporal[j];
                j--;
            }
            resultado += " ";
        }

        System.out.println(resultado);

        sc.close();
    }
}
