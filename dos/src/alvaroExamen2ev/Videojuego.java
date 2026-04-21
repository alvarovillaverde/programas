package alvaroExamen2ev;

import java.io.Serializable;

public class Videojuego implements Serializable, Comparable<Videojuego> {
    private static final long serialVersionUID = 1L; // Recomendado para Serializable

    private String id; // Similar al "codigo" de Disco
    private String titulo;
    private String desarrollador;
    private String genero;
    private double precio;

    // Constructores
    public Videojuego() {}

    public Videojuego(String id, String titulo, String desarrollador, String genero, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.genero = genero;
        this.precio = precio;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s (%s) | Precio: %.2f€", 
                             id, titulo, desarrollador, genero, precio);
    }

    @Override
    public int compareTo(Videojuego o) {
    // Ordenar alfabéticamente por título (ignorando mayúsculas/minúsculas)
    return this.titulo.compareToIgnoreCase(o.titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Videojuego other = (Videojuego) obj;
        if (precio == 0) {
            if (other.precio != 0)
                return false;
        } else if (precio == other.precio)
            return false;
        return true;
    }
}

