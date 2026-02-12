package dos;

import dos.Pelicula.TipoGenero;

public class TestPelicula {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Neymar", "Juan",
        TipoGenero.ACCION, 1990, 200, 5);
        
        Pelicula pelicula2 = new Pelicula("Lamine", "Toni",
        TipoGenero.SUSPENSE, 2018, 180, 1);

        System.out.println(pelicula1);
        System.out.println(pelicula2);

        System.out.println(pelicula1.esPeliculaEpica());
        System.out.println(pelicula1.calcularValoracion());

        System.out.println(pelicula2.esPeliculaEpica());
        System.out.println(pelicula2.calcularValoracion());

        System.out.println(pelicula1.esSimilar(pelicula2));

    }
}
