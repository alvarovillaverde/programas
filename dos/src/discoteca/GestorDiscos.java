package discoteca;

import java.util.Scanner;

public class GestorDiscos {

    public static Scanner s;

    public static Disco[] discos= new Disco[100];

    public static void crearColeccion() {
        for (int i = 0; i < discos.length; i++) {
            discos[i] = new Disco();
        }
    }

    public static void mockDiscos() {
        // Carga varios discos
        discos[0] = new Disco(
        "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Disco(
        "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Disco(
        "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
    }

    private static void addDisco() {
        s = new Scanner(System.in);
        System.out.println("Por favor, introduzca los datos del disco.");
				System.out.print("Código: ");
				String codigoIn = s.nextLine();
				System.out.print("Autor: ");
				String autorIn = s.nextLine();
				System.out.print("Título: ");
				String tituloIn = s.nextLine();
				System.out.print("Género: ");
				String generoIn = s.nextLine();
				System.out.print("Duración: ");
				Integer duracionIn = Integer.parseInt(s.nextLine());
				//discos[primeraLibre] = new Disco(codigoIn, autorIn, tituloIn,
				//		generoIn, duracionIn);
    }

    public static void main(String[] args) {
        int opcion;
        Scanner s = new Scanner(System.in);
        //empezar
        crearColeccion();
        mockDiscos();
        do {
			System.out.println("\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");

				for (Disco d : discos) {
					if (!d.getCodigo().equals("LIBRE")) {
						System.out.println(d);
					}
				}

				break;

			case 2:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
                //metodo para añadir
                addDisco();
				break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");
                //metodo para modificar que tenga code num
				break;

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");
                //metodo para borrar

				break;

			default:
                System.out.println("...abandonando gestion de discos...");
			} // switch
		} while (opcion != 5);
        s.close();
    }
}
