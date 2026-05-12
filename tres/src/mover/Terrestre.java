package mover;

public class Terrestre extends Vehiculo implements Motor {

    int numero_llantas = 0;
    enum tipo_vehiculo_terrestre{militar, civil};

    public Terrestre(int velocidad_actual, int velocidad_maxima) {
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

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        int rev = fuerza * radio;
        return rev;
    }
    
}
