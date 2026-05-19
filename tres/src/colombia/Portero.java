package colombia;

public class Portero extends Jugador {
    int golesRecibidos;

    public Portero(String nombre, String apellidos, int edad, boolean titular, int golesRecibidos) {
        super(nombre, apellidos, edad, titular);
        this.golesRecibidos = golesRecibidos;
    }

    
}
