package TiendaMascotas;

public class GatoPeloLargo extends Gato {

    enum razaPL{
        angora, himalayo, balines, somali
    }

    protected static final double ADICIONAL_GATO_PL = 1500;

    private razaPL raza;

    public GatoPeloLargo(String nombre, int edad, String color, double altura, double longitud, razaPL raza) {
        super(nombre, edad, color, altura, longitud);
        this.raza = raza;
    }

    public razaPL getRaza() {
        return raza;
    }

    public void setRaza(razaPL raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "GatoPeloLargo [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitud=" + longitud
                + ", color=" + color + ", raza=" + raza + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + ADICIONAL_GATO_PL;
    }

}
