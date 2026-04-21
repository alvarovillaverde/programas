package TiendaMascotas;

public class Perro extends Mascota {

    protected double peso;
    protected boolean muerde;
    protected static final double ADICIONAL_PERRO = 5000;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    public void sonido() {
        super.sonido();
        System.out.println("Los perros ladran");
    }

    @Override
    public String toString() {
        return "Perro [peso=" + peso + ", muerde=" + muerde + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + ADICIONAL_PERRO;
    }
    
}
