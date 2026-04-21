package Libro;

public class Novelas extends Libro{
    public enum genero{
        histórica, romántica, policíaca, realista, ciencia_ficción, aventuras;
    }
    private genero genero1;

    public Novelas(String titulo, String autor, double precio, genero genero1){
        super(titulo, autor, precio);
        this.genero1=genero1;
    }

    //getter y setters
    public genero getGenero() {
        return genero1;
    }

    public void setGenero(genero genero) {
        this.genero1 = genero;
    }

    @Override
    public String toString() {
        return "Novelas{" +
                "genero1=" + genero1 +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }

    //metodoSobreescrito
    @Override


    //metodo propio
    public boolean prestar(){
        return super.prestar();
    }

    public boolean devolver(){
        return super.devolver();
    }
}
