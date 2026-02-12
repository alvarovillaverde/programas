package dos;

import java.util.Arrays;

public class ArticuloCientifico {

    //atributos
    String titulo;
    String autor;
    String[] palabrasClave = new String[3];
    String publicacion;
    int año;
    String resumen;

    //constr 1
    ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /*constr otro
    ArticuloCientifico(String publicacion, String resumen) {
        this.publicacion = publicacion;
        this.resumen = resumen;
    } */

    //constr 2
    public ArticuloCientifico(String titulo, String autor, String[] palabrasClave, String publicacion, int año) {
        //this.titulo = titulo;
        //this.autor = autor;

        //llamando al primer constructor
        this(titulo, autor);
        
        this.palabrasClave = palabrasClave;
        this.publicacion = publicacion;
        this.año = año;
    }

    //tercer constructor
     public ArticuloCientifico(String titulo, String autor, String[] palabrasClave, String publicacion, int año,
            String resumen) {
        this.titulo = titulo;
        this.autor = autor;
        this.palabrasClave = palabrasClave;
        this.publicacion = publicacion;
        this.año = año;
        this.resumen = resumen;
    }

     @Override
     public String toString() {
        return "ArticuloCientifico [titulo=" + titulo + ", autor=" + autor + ", palabrasClave="
                + Arrays.toString(palabrasClave) + ", publicacion=" + publicacion + ", año=" + año + ", resumen="
                + resumen + "]";
     }

}
