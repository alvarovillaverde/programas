package mover;

public class VehiculoAereo extends Vehiculo implements Reactor, Alas {

    public VehiculoAereo(int velocidad_actual, int velocidad_maxima) {
        super(velocidad_actual, velocidad_maxima);
    }
    
    @Override
    int acelerar(int velocidad) {
        int acelerado = velocidad + velocidad_actual;
        if (acelerado > velocidad_maxima) {
            System.out.println("no puedes superar la velocidad maxima");
            return velocidad_actual;
        } 
        return velocidad_actual += velocidad;
    }

    @Override
    int frenar(int velocidad) {
        int frenado = velocidad_actual - velocidad;
        if (frenado < 0) {
            System.out.println("no puedes tener una velocidad negativa");
            return velocidad_actual;
        }
        return velocidad_actual -= velocidad;
    }
    
    void despegar() {
        System.out.println("el vehiculo esta despegando");
    }

    void aterrizar() {
        System.out.println("el vehiculo esta aterrizando");
    }

    void volar() {
        System.out.println("el vahiculo esta volando");
    }

    @Override
    public void encender() {
        System.out.println("el reactor esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("el reactor esta apagado");
    }

    @Override
    public void soltar() {
        System.out.println("el tren de aterrizaje esta suelto");
    }

    @Override
    public void subir() {
        System.out.println("el tren de aterrizaje esta subido");
    }
}
