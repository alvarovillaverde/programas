package colombia;

public class Mediocampo extends Jugador {
    int asistencias;

    public Mediocampo(String nombre, String apellidos, int edad, boolean titular, int asistencias) {
        super(nombre, apellidos, edad, titular);
        this.asistencias = asistencias;
    }

    
}
