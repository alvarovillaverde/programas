package listas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio16 {

//	Ejercicio 16
//	Realiza un programa que sepa decir la capital de un país (en caso de conocer
//	la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
//	principio, el programa solo conoce las capitales de España, Portugal y Francia.
//	Estos datos deberán estar almacenados en un diccionario. Los datos sobre
//	capitales que vaya aprendiendo el programa se deben almacenar en el mismo
//	diccionario. El usuario sale del programa escribiendo la palabra “salir”.
//	
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Creamos el HashMap: País (String) -> Capital (String)
        HashMap<String, String> capitales = new HashMap<>();

        // Añadimos algunos datos iniciales
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");

        String pais = "";

        while (true) {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = s.nextLine();

            // Condición para salir del bucle
            if (pais.equalsIgnoreCase("salir")) {
                break;
            }

            // Comprobamos si el país ya existe en nuestro HashMap
            if (capitales.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + capitales.get(pais));
            } else {
                // Si no existe, le pedimos al usuario que nos enseñe
                System.out.print("No conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
                String nuevaCapital = s.nextLine();
                
                // Guardamos el nuevo pais y su capital con 
                capitales.put(pais, nuevaCapital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }
        
        System.out.println("¡Hasta luego!");
        s.close();
    }
	
}