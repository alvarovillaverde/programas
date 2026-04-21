package TiendaMascotas;

public class Gato extends Mascota {

    protected double altura;
    protected double longitud;
    protected static final double ADICIONAL_GATO = 2500;

    public Gato(String nombre, int edad, String color, double altura, double longitud) {
        super(nombre, edad, color);
        this.altura = altura;
        this.longitud = longitud;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void sonido() {
        super.sonido();
        System.out.println("los gatos maullan y ronronean");
    }

    @Override
    public String toString() {
        return "Gato [altura=" + altura + ", longitud=" + longitud + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + ADICIONAL_GATO;
    }

}
