package TiendaMascotas;

public class GatoPeloCorto extends Gato {

    enum razaPC{
        azul_ruso, britanico, manx, devon_rex
    }

    protected static final double ADICIONAL_GATO_PC = 2000;

    private razaPC raza;

    public GatoPeloCorto(String nombre, int edad, String color, double altura, double longitud, razaPC raza) {
        super(nombre, edad, color, altura, longitud);
        this.raza = raza;
    }

    public razaPC getRaza() {
        return raza;
    }

    public void setRaza(razaPC raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "GatoPeloCorto [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitud=" + longitud
                + ", color=" + color + ", raza=" + raza + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + ADICIONAL_GATO_PC;
    }

}
