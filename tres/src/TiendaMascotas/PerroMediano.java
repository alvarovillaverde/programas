package TiendaMascotas;

public class PerroMediano extends Perro {

    enum razaM{
        collie, dalmata, bulldog, galgo, sabueso
    }

    protected static final double ADICIONAL_PERRO_MEDIANO = 1500;

    private razaM raza;

    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, razaM raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public razaM getRaza() {
        return raza;
    }

    public void setRaza(razaM raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "PerroMediano [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde
                + ", color=" + color + ", raza=" + raza + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + ADICIONAL_PERRO_MEDIANO;
    }

}
