package Libro;

public class LibroUniversidad extends LibroTexto{
    private String facultad;

    public LibroUniversidad(String titulo, String autor, int precio, int curso, String facultad){
        super(titulo, autor, precio, curso);
        this.facultad=facultad;
    }

    //getters y setters
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "LibroUniversidad{" +
                "facultad='" + facultad + '\'' +
                ", curso=" + curso +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }

    //metodoSobreescrito
    @Override


    //metodos propios
    public boolean prestar(){
        return super.prestar();
    }
    public boolean devolver(){
        return super.devolver();
    }
}
