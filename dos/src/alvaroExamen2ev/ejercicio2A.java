package alvaroExamen2ev;

import java.util.Scanner;

public class ejercicio2A {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // inicializo variables
    String cadena1 = "";
    String cadena2 = "";
    String resultado = "";

    // pido las dos cadenas
    System.out.println("Pasa la primera cadena separando las palabras con espacios: ");
    cadena1 = sc.nextLine();
    System.out.println("Pasa la segunda cadena separando las palabras con espacios: ");
    cadena2 = sc.nextLine();

    // voy a separar las palabras de cada cadena en dos arrays
    String[] arrayPalabras1 = cadena1.split(" ");
    String[] arrayPalabras2 = cadena2.split(" ");

    // ahora voy a mezclarlas en la cadena resultado
    for (int i = 0; i < arrayPalabras1.length && i < arrayPalabras2.length; i++) {
        resultado += arrayPalabras1[i].toLowerCase();
        resultado += " ";
        resultado += arrayPalabras2[i].toUpperCase();
        resultado += " ";
    }

    // hasta aqui lo hace bien pero luego falla al añadir el resto de la frase
    //System.out.println(resultado);

    // si las cadenas no tenian el mismo numero de palabras meto las sobrantes al final
    if (arrayPalabras1.length > arrayPalabras2.length) {
        for (int i = arrayPalabras1.length -1; i > arrayPalabras2.length; i--) {
            resultado += arrayPalabras1[i];
            resultado += " ";
        }
        // esto era con caracteres solo
        //resultado += cadena1.substring(arrayPalabras2.length);
    } else if (arrayPalabras2.length > arrayPalabras1.length) {
        for (int i = arrayPalabras2.length - 1; i > arrayPalabras1.length; i--) {
            resultado += arrayPalabras2[i];
            resultado += " ";
        }
        //resultado += cadena2.substring(arrayPalabras1.length);
    }

    // imprimo el resultado
    System.out.println(resultado);

    sc.close();
}
}
