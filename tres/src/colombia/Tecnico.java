package colombia;

public class Tecnico extends Persona {
    int anosExperiencia;
    boolean nacional;

    public Tecnico(String nombre, String apellidos, int edad, int anosExperiencia, boolean nacional) {
        super(nombre, apellidos, edad);
        this.anosExperiencia = anosExperiencia;
        this.nacional = nacional;
    }
}
