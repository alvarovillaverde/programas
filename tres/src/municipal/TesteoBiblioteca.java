package municipal;

public class TesteoBiblioteca {
    static void main(String[] args) {
        Biblioteca biblioteca=new Biblioteca("Redondela");
        biblioteca.añadirLibro(new Libros("Cien años de soledad", 1967,
                "Gabriel Garcia Marquez", "Sudamerica", "858.67/M566"));
        biblioteca.añadirLibro(new Libros("Rayuela", 1963, "Julio Cortaz",
                "Sudamerica", "863.55/J667"));
        biblioteca.añadirLibro(new Libros("La tia Julia y el escribidor", 1977, "Mario Vargas",
                "Seix Barral", "868.23/L567"));

        biblioteca.listarLibros();
    }
}