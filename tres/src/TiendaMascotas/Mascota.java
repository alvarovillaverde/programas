package TiendaMascotas;

public class Mascota {

    protected String nombre;
    protected int edad;
    protected String color;
    protected static final double PRECIO_BASE_VENTA = 10000;

    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void sonido() {
        System.out.println("Las mascotas hacen ruido...");
    }

    public double calcularPrecioVenta() {
        return PRECIO_BASE_VENTA;
    }

}
