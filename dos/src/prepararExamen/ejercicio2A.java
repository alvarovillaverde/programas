package prepararExamen;

import java.util.Scanner;

/*
    Un grupo de inteligencia militar desea codificar los mensajes secretos de tal forma que no puedan 
    ser interpretados con una lectura directa, para lo cual han establecido las siguientes reglas: 
    
    a) Todo mensaje debe estar sus letras en mayúsculas.
    
    b) Reemplazar cada letra por la que sigue dos posiciones después según abecedario, excepto Y que se
    deberá reemplazar con la letra A y Z por B.
    
    c) Reemplazar cada dígito encontrado por el número que le sigue dos posiciones después excepto el 
    8 que deberá ser reemplazado por el 0 y el 9 por el 1.Pida una cadena al usuario (conteniendo letras
    mayusculas y minusculas y digitos) y muestrela codificada con las anteriores reglas.
*/

public class ejercicio2A {
    public static void main(String[] args) {
        // hacer un mapa con los valores o dos arrays y sumar las posiciones de 1 en una
        Scanner sc = new Scanner(System.in);

        // variables
        String cadena = "";
        // declarar los arrays, en el de las letras podría con char o string pero escojo string porque asi es del mismo tipo que la cadena
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String numeros = "0123456789";

        // pedir la cadena
        System.out.println("Dame la cadena que quieres cifrar: ");
        cadena += sc.nextLine().toUpperCase();// en mayusculas como pide

        //string builder para la salida
        StringBuilder cifrado = new StringBuilder();

        //bucle para hacer los cambios
        for (int i = 0; i < cadena.length(); i++) {
            char aux = cadena.charAt(i);
            //tenemos el caracter y ahora vamos a ver si es un numero o una letra
            if (Character.isLetter(aux)) {
                // metemos otra condicion por si es la y o la z
                if (aux == 'Y') {
                    aux = 'A';
                    cifrado.append(aux);
                } else if (aux == 'Z') {
                    aux = 'B';
                    cifrado.append(aux);
                } else {
                    // lo cambiamos por su nueva letra
                    int pos = letras.indexOf(aux);
                    cifrado.append(letras.charAt(pos + 2));
                }
            } else if (Character.isDigit(aux)) {
                // por si es 8 o 9
                if (aux == '8') {
                    aux = '0';
                    cifrado.append(aux);
                } else if (aux == '9') {
                    aux = '1';
                    cifrado.append(aux);
                } else {
                    int pos = numeros.indexOf(aux);
                    cifrado.append(numeros.charAt(pos + 2));
                }
            } else {
                cifrado.append(aux);
            }
        }

        System.out.println(cifrado);

        sc.close();
    }
}
