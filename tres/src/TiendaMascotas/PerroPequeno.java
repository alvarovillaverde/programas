package TiendaMascotas;

public class PerroPequeno extends Perro {

    enum razaP{
        caniche, yorkshire_terrier, schnauzer, chiuahua
    }

    protected static final double ADICIONAL_PERRO_PEQUENO = 1000;

    private razaP raza;

    public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde, razaP raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public razaP getRaza() {
        return raza;
    }

    public void setRaza(razaP raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "PerroPequeno [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde
                + ", color=" + color + ", raza=" + raza + "]";
    }

    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + ADICIONAL_PERRO_PEQUENO;
    }

}
