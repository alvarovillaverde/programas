package municipal;

import java.util.ArrayList;

public class Biblioteca {
    protected String nombre;
    private ArrayList<Libros> libros;

    public Biblioteca(String nombre){
        this.nombre=nombre;
        libros=new ArrayList<Libros>();
    }

    //metodos
    public void añadirLibro(Libros libro){
        libros.add(libro);
    }

    public void listarLibros(){
        for (Libros l: libros){
            System.out.println(l.toString());
        }
    }
}
