package discoteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Disco implements Serializable {
	
    public static Scanner s = new Scanner(System.in);

	//atributos
	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion; // duración total en minutos

	//constructor????? 
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    // constructor sin codigo
    public Disco(String autor, String titulo, String genero, int duracion) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    // constructor por defecto
    public Disco() {}
    
	//get set
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

	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	//toString
	public String toString() {
		String cadena = "";
		cadena += "Código: " + this.codigo;
		cadena += "\nAutor: " + this.autor;
		cadena += "\nTítulo: " + this.titulo;
		cadena += "\nGénero: " + this.genero;
		cadena += "\nDuración: " + this.duracion;
		cadena += "\n------------------------------------------";
		return cadena;
	}

	
	public static final int PLAZAS = 100;

	public static Disco[] discos= new Disco[PLAZAS];

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

	public static void addDisco() {
		int pos = -1; //evito problems
		boolean no_trovato = true;

		do {
			pos++;
			if (discos[pos].getCodigo().equals("LIBRE")) {
				no_trovato = false;
			}
		} while (no_trovato);

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

		discos[pos] = new Disco(codigoIn, autorIn, tituloIn, generoIn, duracionIn);
		System.out.println("...añadido disco a la coleccion...");
    }

	public static int buscarCodigo() {

		System.out.println("Introduzca codigo existente: ");
		String code = s.nextLine();

		for (int i = 0; i < discos.length; i++) {
			if (discos[i].getCodigo().equals(code)) {
				return i;
			}
		}
		
		return -1;
		
	}

	public static void modificarDiscoExistente() {
		int indice = buscarCodigo();

		if (indice == -1) {
			System.out.println("Código no encontrado.");
		} else {
			System.out.println("DATOS ACTUALES DEL DISCO:");
			System.out.println(discos[indice].toString());
			
			System.out.println("\n--- Introduzca los nuevos datos ---");

			// Pedimos los nuevos datos. 
			// Nota: Si usas Scanner, asegúrate de gestionar el buffer tras leer números.
			System.out.print("Nuevo Autor: ");
			String nuevoAutor = s.nextLine();
			
			System.out.print("Nuevo Título: ");
			String nuevoTitulo = s.nextLine();
			
			System.out.print("Nuevo Género: ");
			String nuevoGenero = s.nextLine();
			
			System.out.print("Nueva Duración: ");
			int nuevaDuracion = Integer.parseInt(s.nextLine());

			// Aplicamos los cambios usando los setters del objeto
			discos[indice].setAutor(nuevoAutor);
			discos[indice].setTitulo(nuevoTitulo);
			discos[indice].setGenero(nuevoGenero);
			discos[indice].setDuracion(nuevaDuracion);

			System.out.println("\nDisco modificado con éxito.");
		}
	}

	public static void cargarColeccionDesdeAlmacenamiento() {
		File fichero = new File("collection.obj");

		if (!fichero.exists()) {
			System.out.println("No hay archivo de guardado previo. Creando colección nueva...");
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
			discos = (Disco[]) ois.readObject();
			System.out.println("Coleccion cargada con exito");
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error al cargar la coleccion: " + e.getMessage());
			crearColeccion();
			mockDiscos();
		}
	}

	public static void guardarColeccionEnAlmacenamiento() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coleccion.obj"));
			oos.writeObject(discos);
			System.out.println("Coleccion guardada correctamente en coleccion.obj");
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al guardar la colección " + e.getMessage());
		}
	}
}