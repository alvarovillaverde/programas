package gui1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ListaPersona {
	ArrayList<Persona> listaPersona; // Atributo que identifica un vector de personas
	/**
	* Constructor de la clase ListaPersonas
	*/
	public ListaPersona() {
	listaPersona = new ArrayList<Persona>(); // Crea el vector de personas
	}
	public void anadirPersona(Persona p) {
	listaPersona.add(p);
	}
	/**
	* Método que permite eliminar una persona del vector de personas
	* @param i Parámetro que define la posición a eliminar en el vector
	* de personas
	*/
	public void eliminarPersona(int i) {
	listaPersona.remove(i);
	}
	/**
	* Método que permite eliminar todos los elementos del vector de
	* personas
	*/
	public void borrarLista() {
	listaPersona.removeAll(listaPersona);
	}

    public void guardarColeccion() {
        try {
            FileOutputStream archivo = new FileOutputStream("Personas.dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(listaPersona);
            salida.close();
        } catch (Exception e) {
            System.out.println("No se puede escribir en el archivo de la colección");
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarColeccion() {
        try {
            FileInputStream archivo = new FileInputStream("Personas.dat");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            listaPersona = (ArrayList<Persona>) entrada.readObject();
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo de la colección");
        } catch (IOException e) {
            System.out.println("Error de entrada o salida al cargar la colección");
        } catch (Exception e) {
            System.out.println("Error al cargar la colección del archivo");
        }
    }
}