package colombia;

public class Jugador extends Persona {
    protected boolean titular;

    public Jugador(String nombre, String apellidos, int edad, boolean titular) {
        super(nombre, apellidos, edad);
        this.titular = titular;
    }

    
}
