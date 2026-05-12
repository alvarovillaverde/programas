package peaje;

public class Test {
    public static void main(String[] args) {
        // 1. Crear la estación de peaje
        Peaje estacionRande = new Peaje("Peaje de Rande", "Pontevedra");

        // 2. Crear diferentes tipos de vehículos
        Carro miCarro = new Carro("8728", "90823");
        Moto miMoto = new Moto("98743987", "874326987");
        Camion miCamionPequeno = new Camion("327468", "762378", 2); // 2 ejes
        Camion miCamionGrande = new Camion("328736", "3872789", 6); // 6 ejes

        // 3. Añadir los vehículos a la estación y calcular sus peajes
        System.out.println("--- Procesando Vehículos ---");
        
        System.out.println("Peaje Carro: $" + estacionRande.calcularPeaje(miCarro));
        estacionRande.anadirVehiculo(miCarro);

        System.out.println("Peaje Moto: $" + estacionRande.calcularPeaje(miMoto));
        estacionRande.anadirVehiculo(miMoto);

        System.out.println("Peaje Camión (2 ejes): $" + estacionRande.calcularPeaje(miCamionPequeno));
        estacionRande.anadirVehiculo(miCamionPequeno);

        System.out.println("Peaje Camión (6 ejes): $" + estacionRande.calcularPeaje(miCamionGrande));
        estacionRande.anadirVehiculo(miCamionGrande);

        System.out.println();

        // 4. Imprimir el informe general de la estación
        System.out.println("--- Informe de la Estación ---");
        estacionRande.imprimir();

        System.out.println();

        // 5. Ejemplo de uso de métodos estáticos: Cambiar el precio base
        // Si el precio de las motos sube a 6000
        Moto.setValorPeaje(6000);
        System.out.println("Nuevo valor peaje moto: $" + miMoto.getValorPeaje());
    }
}
