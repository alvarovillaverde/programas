package mundial;

public class Entrenador extends SeleccionFutbol
{

	private String idFederacion;

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
		System.out.println("el entrenador dirige un partido");
	}

	public void dirigirEntreno() {
		System.out.println("el entrenador dirige un entreno");
	}

    @Override
    public String toString() {
        return super.toString() + "\nEntrenador [idFederacion=" + idFederacion + "]";
    }

    @Override
    public void Viajar() {
        super.Viajar();
        System.out.println("el entrenador viaja en clase vip");
    }

}
