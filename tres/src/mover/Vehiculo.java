package mover;

public abstract class Vehiculo {
    int velocidad_actual = 0; // km/h
    int velocidad_maxima = 0; // km/h
    
    public Vehiculo(int velocidad_actual, int velocidad_maxima) {
        this.velocidad_actual = velocidad_actual;
        this.velocidad_maxima = velocidad_maxima;
    }

    @Override
    public String toString() {
        return "Vehiculo [velocidad_actual=" + velocidad_actual + ", velocidad_maxima=" + velocidad_maxima + "]";
    }

    abstract int acelerar(int velocidad);

    abstract int frenar(int velocidad);
}
