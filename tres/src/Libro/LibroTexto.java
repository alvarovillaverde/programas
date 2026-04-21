package Libro;

public class LibroTexto extends Libro{
    protected int curso;

    public LibroTexto(String titulo, String autor, int precio, int curso){
        super(titulo, autor, precio);
        this.curso=curso;
    }

    //getters y setters
    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "LibroTexto{" +
                "curso=" + curso +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
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
