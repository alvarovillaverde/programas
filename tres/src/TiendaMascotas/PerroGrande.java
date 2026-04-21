package TiendaMascotas;

public class PerroGrande extends Perro {

    enum razaG{
        pastor_aleman, doberman, rotwiller
    }

    protected static final double ADICIONAL_PERRO_GRANDE = 2000;

    private razaG raza;

    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, razaG raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public razaG getRaza() {
        return raza;
    }

    public void setRaza(razaG raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "PerroGrande [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
                + color + ", raza=" + raza + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + ADICIONAL_PERRO_GRANDE;
    }
    
}
