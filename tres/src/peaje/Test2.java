package peaje;

public class Test2 {
public static void main(String[] args) {
    Persona varo = new Persona("35629898T");
    Persona joni = new Persona("3289109V");

    Vehiculo motillo = new Moto("3672 HVX", "35629898T");
    Vehiculo fiat = new Carro("78191827", "35629898T");
    Vehiculo gitanazo = new Camion("42932", "3289109V", 4);

    varo.desAsignarVehiculo(motillo);
    varo.asignarVehiculo(motillo);
    joni.desAsignarVehiculo(fiat);
    joni.asignarVehiculo(gitanazo);

    varo.calcularTotalPagado();
    joni.calcularTotalPagado();

    varo.imprimirInformePeajes();
    joni.imprimirInformePeajes();
}
}
