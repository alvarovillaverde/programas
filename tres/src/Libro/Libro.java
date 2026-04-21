package Libro;
//Ejercicio propuesto 1
//
//Definir una clase Libro para manejar la información asociada a un
//libro. La información de interés para un libro es: el título, el autor
//y el precio. Los métodos de interés son:
//○ Un constructor para crear un objeto libro, con título y autor
//como parámetros.
//○ Imprimir en pantalla el título, los autores y el precio del libro.
//○ Métodos get y set para cada atributo de un libro.
//Se debe extender la clase Libro definiendo las siguientes clases:
//○ Libros de texto con un nuevo atributo que especifica el curso al
//cual está asociado el libro.
//○ Libros de texto de la Universidad Nacional de Colombia: subclase de la clase anterior.
// Esta subclase tiene un atributo que
//especifica cuál facultad lo publicó.
//○ Novelas: pueden ser de diferente tipo, histórica, romántica, policíaca, realista, ciencia ficción o aventuras.
//○ Para cada una de las clases anteriores se debe definir su constructor
//y redefinir adecuadamente el método para visualizar del objeto.

public class Libro {
    protected String titulo;
    protected String autor;
    protected double precio=0d;
    protected boolean disponible=true;

    //constructor
    public Libro(String titulo, String autor, double precio){
        this.titulo=titulo;
        this.autor=autor;
        this.precio=precio;
    }

    //setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio + '\''+
                ", disponible=" + disponible +
                '}';
    }

    //metodo propio para prestar
    public boolean prestar(){
        if (disponible){
            disponible=false;
            System.out.println("Libro disponible para prestar");
            return disponible;
        }else {
            System.out.println("Libro no disponible para prestar");
            return false;
        }
    }

    public boolean devolver(){
        if (!disponible){
            disponible=true;
            System.out.println("Devolucion hecha con exito");
            return disponible;
        }else {
            System.out.println("No se puede devolver un libro que no esta prestado");
            return false;
        }
    }
}


