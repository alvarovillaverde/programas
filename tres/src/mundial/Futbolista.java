package mundial;

public class Futbolista extends SeleccionFutbol
{
	private int dorsal;
	private String demarcacion;

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
		System.out.println("el futbolista juega un partido");
	}

	public void entrenar() {
		System.out.println("el futbolista hace un entreno");
	}

    @Override
    public String toString() {
        return super.toString() + "\nFutbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
    }

    @Override
    public void Viajar() {
        super.Viajar();
        System.out.println("el futbolista viaja en clase turista");
    }

}
