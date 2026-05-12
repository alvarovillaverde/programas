package peaje;

public abstract class Vehiculo {
    protected String placa;
    protected Persona conductor;

    public Vehiculo(String placa, String dniConductor) {
        this.placa = placa;
        this.conductor = new Persona(dniConductor);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }
    
}
