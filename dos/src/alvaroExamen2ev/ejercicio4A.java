package alvaroExamen2ev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ejercicio4A implements Serializable, Comparable<Object> {

public static Scanner s;

public static ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();

    public static void main(String[] args) {
        int opcion;
		boolean seguir = true;
        Scanner s = new Scanner(System.in);
        //empezar
        if (videojuegos.isEmpty()) {
			cargarColeccionDesdeAlmacenamiento();
		} else {
			mockDiscos();
		}

        do {
			System.out.println("\nCOLECCIÓN DE VIDEOJUEGOS");
			System.out.println("===================");
			System.out.println("1. Nuevo juego");
			System.out.println("2. Listado");
			System.out.println("3. Ordenar");
			System.out.println("4. Borrar");
			System.out.println("5. Guardar coleccion");
			System.out.println("6. Cargar coleccion");
			System.out.println("7. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {
			case 2:
				System.out.println("\nLISTADO");
				System.out.println("=======");

				for (Videojuego d : videojuegos) {
					System.out.println(d);
				}

				break;

			case 1:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
                //metodo para añadir
                addJuego();
                Collections.sort(videojuegos);
				break;

			case 3:
				System.out.println("\nORDENAR");
				System.out.println("===========");
                //metodo para modificar que tenga code num
				escogerOrdenamiento();
				break;

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");
                //metodo para borrar que tenga code num
				borrarDiscoExistente();
				break;

			case 5:
				System.out.println("\nGUARDAR");
				System.out.println("==========");
				guardarColeccionEnAlmacenamiento();
				break;

			case 6:
				System.out.println("\nCARGAR");
				System.out.println("===========");
				cargarColeccionDesdeAlmacenamiento();
				break;

			case 7:
				System.out.println("...abandonando gestion de discos...");
				seguir = false;
                guardarColeccionEnAlmacenamiento();
                break;
			default:
                System.out.println("INTRODUCE OPCIÓN VÁLIDA");
			} // switch
		} while (seguir);
        s.close();
    }

    private static void mockDiscos() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'mockDiscos'");
	}

	public static void addJuego() {
		
        s = new Scanner(System.in);
        System.out.println("Por favor, introduzca los datos del disco.");
				System.out.print("Código: ");
				String id = s.nextLine();
				System.out.print("Titulo: ");
				String tituloIn = s.nextLine();
				System.out.print("Desarrollador: ");
				String desarroladorIn = s.nextLine();
				System.out.print("Género: ");
				String generoIn = s.nextLine();
				System.out.print("Duración: ");
				Integer precioIn = Integer.parseInt(s.nextLine());

		videojuegos.add(new Videojuego(id, desarroladorIn, tituloIn, generoIn, precioIn));
		System.out.println("...añadido juego a la coleccion...");
    }

    public static void escogerOrdenamiento() {
        System.out.println("\nEscoge atributo para ordenar");
        System.out.println("1 titulo");
        System.out.println("2 precio");
        System.out.println("seleccione una opcion");

        try {
            int opcion = Integer.parseInt(s.nextLine());
            Comparator<Videojuego> comparator = null;

            switch (opcion) {
                case 1:
                    comparator = Comparator.comparing(Videojuego::getTitulo);
                    break;
            
                case 2:
                    comparator = Comparator.comparing(Videojuego::getPrecio);
                    break;

                default:
                    System.out.println("No valida se usara el criterio actual");
                    break;
            }

            if (comparator != null) {
                videojuegos.sort(comparator);
                System.out.println("\nColeccion ordenada con exito");
            }

            System.out.println("\nLISTADO ORDENADO A TU GUSTO");
				System.out.println("=======");

				for (Videojuego d : videojuegos) {
					System.out.println(d);
				}
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Error: debes introducir un numero valido");
        }
    }


    public static int buscarCodigo() {
    System.out.print("Introduzca el código exacto del juego: ");
    String code = s.nextLine();

    for (int i = 0; i < videojuegos.size(); i++) {
        // Usamos equalsIgnoreCase para que sea una búsqueda exacta y segura
        if (videojuegos.get(i).getId().equals(code)) {
            return i; // Devuelve la posición 0, 1, 2...
        }
    }
    
    System.out.println("Código no encontrado.");
    return (Integer) null; // No existe
    }
    public static void borrarDiscoExistente() {
		int indice = buscarCodigo();

		if (indice == -1) {
			System.out.println("Código no encontrado.");
		} else {
			System.out.println("DATOS DEL juego A ELIMINAR:");
			System.out.println(videojuegos).get(indice).toString();

			// Primera confirmación
			System.out.print("¿Estás seguro de que quieres borrar este disco? (s/n): ");
			String respuesta1 = s.nextLine().toLowerCase();

			if (respuesta1.equals("s")) {
				// Segunda confirmación (el "doble check" de seguridad)
				System.out.print("¿ESTÁS COMPLETAMENTE SEGURO? Esta acción no se puede deshacer (s/n): ");
				String respuesta2 = s.nextLine().toLowerCase();

				if (respuesta2.equals("s")) {
					//discos[indice] = null; // Borrado lógico
					videojuegos.remove(indice);
					System.out.println("Disco eliminado correctamente.");
				} else {
					System.out.println("Borrado cancelado en el último momento.");
				}
			} else {
				System.out.println("Operación de borrado cancelada.");
			}
		}
	}


     public static void cargarColeccionDesdeAlmacenamiento() {
		File fichero = new File("inventario.dat");

		if (!fichero.exists()) {
			System.out.println("No hay archivo de guardado previo. Creando colección nueva...");
            return;
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
			videojuegos = (ArrayList<Videojuego>) ois.readObject();
            Collections.sort(videojuegos);
			System.out.println("Coleccion cargada con exito");
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error al cargar la coleccion: " + e.getMessage());
		}
	}

    public static void guardarColeccionEnAlmacenamiento() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("inventario.dat"));
            Collections.sort(videojuegos);
			oos.writeObject(videojuegos);
			System.out.println("Coleccion guardada correctamente en galeria.obj");
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al guardar la colección " + e.getMessage());
		}
	}

    

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
	}


}
