package dos;

public class Pelicula {
    
    //atributos
    private String nombre;
    private String director;
    enum TipoGenero{
        ACCION,COMEDIA,DRAMA,SUSPENSE
    }
    private TipoGenero genero;
    private int año;
    private int duracion;
    private double calificacion;

    //constructor
    public Pelicula(String nombre, String director, TipoGenero genero, int año, int duracion, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.año = año;
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Pelicula [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", año=" + año
                + ", duracion=" + duracion + ", calificacion=" + calificacion + "]";
    }

    //metodos propios

    public boolean esPeliculaEpica() {
        if (duracion <= 180) {
            return false;
        } else {
            return true;
        }
    }

    public String calcularValoracion() {
        String val;
        if(calificacion<=2)
            val="muy mala";
            else if(calificacion<=5)
                val="mala";
                    else if(calificacion<=7)
                        val="regulera";
                            else if(calificacion<=8)
                                val="buena";
                                    else
                                        val="excelente";
        return val;
    }

    public boolean esSimilar(Pelicula otraPelicula) {
        if (this.getGenero() == otraPelicula.getGenero() && this.calcularValoracion().equals(otraPelicula.calcularValoracion())) {
            return true;
        } else {
            return false;
        }
    }
}
