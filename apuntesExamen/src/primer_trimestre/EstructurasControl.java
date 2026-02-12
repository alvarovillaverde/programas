package primer_trimestre;

import java.util.Scanner;

public class EstructurasControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. CONDICIONALES (IF - ELSE IF - ELSE)
        // Sirven para tomar decisiones basadas en una condición (true/false)
        System.out.println("--- SECCIÓN: CONDICIONALES ---");
        System.out.print("Introduce una hora (0-23): ");
        int hora = sc.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora > 12 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }

        // 2. SWITCH
        // Ideal para menús o cuando comparas una variable con valores fijos
        System.out.println("\n--- SECCIÓN: SWITCH ---");
        System.out.print("Dime un día de la semana (1-3): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break; // El break es obligatorio para salir del switch
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Opción no válida");
        }

        // 3. BUCLE FOR
        // Se usa cuando sabes exactamente cuántas veces quieres repetir algo
        System.out.println("\n--- SECCIÓN: BUCLE FOR ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Repetición número: " + i);
        }

        // 4. BUCLE WHILE
        // Se repite mientras la condición sea verdadera (cuidado con los bucles infinitos)
        System.out.println("\n--- SECCIÓN: BUCLE WHILE ---");
        int contador = 3;
        while (contador > 0) {
            System.out.println("Contador hacia atrás: " + contador);
            contador--; // Restamos 1 para que el bucle termine
        }

        sc.close();
    }
}