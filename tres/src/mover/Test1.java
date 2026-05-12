package mover;

public class Test1 {
    public static void main(String[] args) {
        Vehiculo moto = new Acuatico(10, 15);
        Vehiculo camioneta = new Terrestre(11, 58);
        VehiculoAereo avion = new VehiculoAereo(100, 345);
        moto.acelerar(5);
        camioneta.frenar(10);
        if (moto instanceof Acuatico) {
            ((Acuatico)moto).calcularRevolucionesMotor(10, 20);
            ((Acuatico)moto).recomendarVelocidad(9);
        }
        avion.subir();
        avion.soltar();
        avion.apagar();
        avion.encender();
    }
}
