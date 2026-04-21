package TiendaMascotas;

public class GatoSinPelo extends Gato {

    enum razaSP{
        esfinge, elfo, donskoy
    }

    protected static final double ADICIONAL_GATOSP = 1000;

    private razaSP raza;

    public GatoSinPelo(String nombre, int edad, String color, double altura, double longitud, razaSP raza) {
        super(nombre, edad, color, altura, longitud);
        this.raza = raza;
    }

    public razaSP getRaza() {
        return raza;
    }

    public void setRaza(razaSP raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "GatoSinPelo [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitud=" + longitud
                + ", color=" + color + ", raza=" + raza + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + ADICIONAL_GATOSP;
    }

}
