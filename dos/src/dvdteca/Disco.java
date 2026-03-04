package dvdteca;

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

public class Disco implements Serializable, Comparable<Disco> {
    public static Scanner s = new Scanner(System.in);

    public static List<Disco> discos = new ArrayList<Disco>();

    //atributos
    private String codigo;
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;

    public Disco() {}
    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
	
    
	
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    //tres discos de prueba en un mock
    public static void mockDiscos() {
        // Carga varios discos
        discos.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        discos.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
        discos.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
    }

   public static void cargarColeccionDesdeAlmacenamiento() {
		File fichero = new File("galeria.obj");

		if (!fichero.exists()) {
			System.out.println("No hay archivo de guardado previo. Creando colección nueva...");
            mockDiscos();
            return;
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
			discos = (ArrayList<Disco>) ois.readObject();
            Collections.sort(discos);
			System.out.println("Coleccion cargada con exito");
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error al cargar la coleccion: " + e.getMessage());
			mockDiscos();
		}
	}

    public static void guardarColeccionEnAlmacenamiento() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("galeria.obj"));
            Collections.sort(discos);
			oos.writeObject(discos);
			System.out.println("Coleccion guardada correctamente en galeria.obj");
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al guardar la colección " + e.getMessage());
		}
	}

    public static void addDisco() {
		
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

		discos.add(new Disco(codigoIn, autorIn, tituloIn, generoIn, duracionIn));
		System.out.println("...añadido disco a la coleccion...");
    }
    
    public static int buscarCodigo() {
    System.out.print("Introduzca el código exacto del disco: ");
    String code = s.nextLine();

    for (int i = 0; i < discos.size(); i++) {
        // Usamos equalsIgnoreCase para que sea una búsqueda exacta y segura
        if (discos.get(i).getCodigo().equals(code)) {
            return i; // Devuelve la posición 0, 1, 2...
        }
    }
    
    System.out.println("Código no encontrado.");
    return -1; // No existe
    }

    public static void borrarDiscoExistente() {
		int indice = buscarCodigo();

		if (indice == -1) {
			System.out.println("Código no encontrado.");
		} else {
			System.out.println("DATOS DEL DISCO A ELIMINAR:");
			System.out.println(discos.get(indice).toString());

			// Primera confirmación
			System.out.print("¿Estás seguro de que quieres borrar este disco? (s/n): ");
			String respuesta1 = s.nextLine().toLowerCase();

			if (respuesta1.equals("s")) {
				// Segunda confirmación (el "doble check" de seguridad)
				System.out.print("¿ESTÁS COMPLETAMENTE SEGURO? Esta acción no se puede deshacer (s/n): ");
				String respuesta2 = s.nextLine().toLowerCase();

				if (respuesta2.equals("s")) {
					//discos[indice] = null; // Borrado lógico
					discos.remove(indice);
					System.out.println("Disco eliminado correctamente.");
				} else {
					System.out.println("Borrado cancelado en el último momento.");
				}
			} else {
				System.out.println("Operación de borrado cancelada.");
			}
		}
	}

    public static void modificarDiscoExistente() {
    int indice = buscarCodigo();

    if (indice == -1) {
        System.out.println("Código no encontrado.");
        } else {
            // Obtenemos una referencia al disco para que el código sea más limpio
            Disco disco = discos.get(indice);
            
            System.out.println("DATOS ACTUALES DEL DISCO:");
            System.out.println(disco.toString());
            
            System.out.println("\n--- Introduzca los nuevos datos (deje en blanco para no modificar) ---");

            // --- Modificar Autor ---
            System.out.print("Nuevo Autor [" + disco.getAutor() + "]: ");
            String nuevoAutor = s.nextLine();
            if (!nuevoAutor.isBlank()) {
                disco.setAutor(nuevoAutor);
            }

            // --- Modificar Título ---
            System.out.print("Nuevo Título [" + disco.getTitulo() + "]: ");
            String nuevoTitulo = s.nextLine();
            if (!nuevoTitulo.isBlank()) {
                disco.setTitulo(nuevoTitulo);
            }

            // --- Modificar Género ---
            System.out.print("Nuevo Género [" + disco.getGenero() + "]: ");
            String nuevoGenero = s.nextLine();
            if (!nuevoGenero.isBlank()) {
                disco.setGenero(nuevoGenero);
            }

            // --- Modificar Duración (Tratamiento especial por ser int) ---
            System.out.print("Nueva Duración [" + disco.getDuracion() + "]: ");
            String nuevaDuracionStr = s.nextLine();
            if (!nuevaDuracionStr.isBlank()) {
                try {
                    int nuevaDuracion = Integer.parseInt(nuevaDuracionStr);
                    disco.setDuracion(nuevaDuracion);
                } catch (NumberFormatException e) {
                    System.out.println("Formato no válido, se mantiene la duración anterior.");
                }
            }

            System.out.println("\nProceso de modificación finalizado.");
            System.out.println("DATOS ACTUALIZADOS: " + disco.toString());
        }
    }

    public static void escogerOrdenamiento() {
        System.out.println("\nEscoge atributo para ordenar");
        System.out.println("1 autor");
        System.out.println("2 titulo");
        System.out.println("3 genero");
        System.out.println("4 duracion");
        System.out.println("seleccione una opcion");

        try {
            int opcion = Integer.parseInt(s.nextLine());
            Comparator<Disco> comparator = null;

            switch (opcion) {
                case 1:
                    comparator = Comparator.comparing(Disco::getAutor);
                    break;
            
                case 2:
                    comparator = Comparator.comparing(Disco::getTitulo);
                    break;

                case 3:
                    comparator = Comparator.comparing(Disco::getGenero);
                    break;

                case 4:
                    comparator = Comparator.comparing(Disco::getDuracion);
                    break;

                default:
                    System.out.println("No valida se usara el criterio actual");
                    break;
            }

            if (comparator != null) {
                discos.sort(comparator);
                System.out.println("\nColeccion ordenada con exito");
            }

            System.out.println("\nLISTADO ORDENADO A TU GUSTO");
				System.out.println("=======");

				for (Disco d : Disco.discos) {
					System.out.println(d);
				}
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Error: debes introducir un numero valido");
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + duracion;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disco other = (Disco) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (duracion != other.duracion)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
                + ", duracion=" + duracion + "]";
    }
    @Override
    public int compareTo(Disco o) {
    // Ordenar alfabéticamente por título (ignorando mayúsculas/minúsculas)
    return this.titulo.compareToIgnoreCase(o.titulo);
    }
   
}
