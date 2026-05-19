package cursos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class AuxAsignatura implements Serializable {
    private ArrayList<Asignatura> lista;

    public AuxAsignatura() {
        this.lista = new ArrayList<>();
    }

    public void agregarAsignatura(Asignatura asignatura) {
        lista.add(asignatura);
    }

    public void listarAsignaturas() {
        for (Asignatura a : lista) {
            a.imprimir();
            System.out.println("--------------------");
        }
    }

    public void guardarColeccion() {
        try {
            FileOutputStream archivo = new FileOutputStream("Coleccion.dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(lista);
            salida.close();
        } catch (Exception e) {
            System.out.println("No se puede escribir en el archivo de la colección");
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarColeccion() {
        try {
            FileInputStream archivo = new FileInputStream("Coleccion.dat");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            lista = (ArrayList<Asignatura>) entrada.readObject();
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
