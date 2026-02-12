package examenprimeraev;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void clasificacion(int[] datos) {
        int secos = 0;
        int normales = 0;
        int lluviosos = 0;
        for (Integer entero : datos) { // recorre el array
            if (entero <= 30) {
                secos++;//aumento los secos
            }
            if (entero >= 31 || entero <= 100) {
                normales++;//aumento los normales
            }
            if (entero >= 101) {
                lluviosos++;//aumento los lluviosos
            }
        }
        System.out.println("secos: " + secos);
        System.out.println("normales: " + normales);
        System.out.println("lluviosos: " + lluviosos);
    }
    
    public static void minMaxArray(int[] datos) { // Pide un array de enteros.
        int max = datos[0]; // Asume primero es max.
        int min = datos[0]; // Asume primero es min.

        for (Integer entero : datos) { // Recorre array.
            if (entero > max) // Si es mayor que max actual.
                max = entero; // Actualiza max.
            if (entero < min) // Si es menor que min actual
                min = entero; // Actualiza min
        }

        System.out.println("el maximo valos de los datos es : " + max); // Imprime max
        System.out.println("el minimo valor de los datos es : " + min); // Imprime min
    }
    public static void calculoMedioArray(int[] datos) {
        Arrays.sort(datos); // Ordena el array.
        System.out.println("El medio es: " + datos[6]); // Imprime medio.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las precipitaciones de enero: ");
        int enero = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de febrero: ");
        int febrero = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de marzo: ");
        int marzo = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de abril: ");
        int abril = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de mayo: ");
        int mayo = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de junio: ");
        int junio = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de julio: ");
        int julio = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de agosto: ");
        int agosto = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de septiembre: ");
        int septiembre = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de octubre: ");
        int octubre = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de noviembre: ");
        int noviembre = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce las precipitaciones de diciembre: ");
        int diciembre = Integer.parseInt(sc.nextLine());

        int[] precipitaciones = {enero, febrero, marzo, abril, mayo, junio, julio, agosto, 
            septiembre, octubre, noviembre, diciembre};
        
        System.out.println("la media es: ");
        calculoMedioArray(precipitaciones); // muestro la media

        minMaxArray(precipitaciones); // muestro el maximo y minimo

        clasificacion(precipitaciones); // muestro la clasificacion

        int total = enero + febrero + marzo + abril + mayo + junio + julio + agosto 
        + septiembre + octubre + noviembre + diciembre; //sumo todos

        System.out.println("el total es: " + total);

        sc.close();
    }
}
