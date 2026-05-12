package municipal;

public class Libros {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private String referenciaBibliografica;

    public Libros(String titulo, int añoPublicacion, String autor, String editorial, String referenciaBibliografica) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
        this.editorial = editorial;
        this.referenciaBibliografica = referenciaBibliografica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getReferenciaBibliografica() {
        return referenciaBibliografica;
    }

    public void setReferenciaBibliografica(String referenciaBibliografica) {
        this.referenciaBibliografica = referenciaBibliografica;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", editorial='" + editorial + '\'' +
                ", referenciaBibliografica='" + referenciaBibliografica + '\'' +
                '}';
    }
}