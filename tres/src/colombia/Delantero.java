package colombia;

public class Delantero extends Jugador {
    int golesMarcados;

    public Delantero(String nombre, String apellidos, int edad, boolean titular, int golesMarcados) {
        super(nombre, apellidos, edad, titular);
        this.golesMarcados = golesMarcados;
    }
    
}
