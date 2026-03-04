package dvdteca;

import java.util.Collections;
import java.util.Scanner;

public class GestorDiscos {
    public static Scanner s;

    public static void main(String[] args) {
        int opcion;
		boolean seguir = true;
        Scanner s = new Scanner(System.in);
        //empezar
        if (Disco.discos.isEmpty()) {
			Disco.cargarColeccionDesdeAlmacenamiento();
		} else {
			Disco.mockDiscos();
		}

        do {
			System.out.println("\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Guardar coleccion");
			System.out.println("6. Cargar coleccion");
			System.out.println("7. Escoger criterio ordenamiento");
			System.out.println("8. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");

				for (Disco d : Disco.discos) {
					System.out.println(d);
				}

				break;

			case 2:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
                //metodo para añadir
                Disco.addDisco();
                Collections.sort(Disco.discos);
				break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");
                //metodo para modificar que tenga code num
				Disco.modificarDiscoExistente();
				break;

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");
                //metodo para borrar que tenga code num
				Disco.borrarDiscoExistente();
				break;

			case 5:
				System.out.println("\nGUARDAR");
				System.out.println("==========");
				Disco.guardarColeccionEnAlmacenamiento();
				break;

			case 6:
				System.out.println("\nCARGAR");
				System.out.println("===========");
				Disco.cargarColeccionDesdeAlmacenamiento();
				break;

			case 7:
				System.out.println("...escoger criterio de ordenamiento...");
				Disco.escogerOrdenamiento();
				break;
			case 8:
				System.out.println("...abandonando gestion de discos...");
				seguir = false;
                Disco.guardarColeccionEnAlmacenamiento();
                break;
			default:
                System.out.println("INTRODUCE OPCIÓN VÁLIDA");
			} // switch
		} while (seguir);
        s.close();
    }
}
