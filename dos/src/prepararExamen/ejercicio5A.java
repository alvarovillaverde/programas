package prepararExamen;

import java.util.Scanner;

/*
    Ingresar una cadena de caracteres formadas por números y letras, en ese orden 
    y obtenga otra cadena donde aparezca cada letra tantas veces como lo indique el 
    número que lo precede. Ejemplo: Si la cadena es 2w4r5f debemos obtener la siguiente cadena: wwrrrrfffff.
*/

public class ejercicio5A {
    public static void main(String[] args) {
        Scanner baby = new Scanner(System.in);

        System.out.println("Dame una cadena con numeros y letras por ese orden(1 numero, 1 letra): ");
        String cadena = baby.nextLine();
        String resultado = "";

        int temp = 0;
        for (int i = 0, j = 1; j < cadena.length(); i+=2, j+=2) {
            temp = Character.getNumericValue(cadena.charAt(i));
            char aux = cadena.charAt(j);
            for (int k = 0; k < temp; k++) {
                    resultado += aux;
                }
        }

        System.out.println(resultado);
        baby.close();
    }
}
