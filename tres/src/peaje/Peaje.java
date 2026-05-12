package peaje;

import java.util.ArrayList; // Se cambia la importación

public class Peaje {

    // Atributo que identifica el nombre de una estación de peaje
    String nombre;
    /*
     * Atributo que identifica el nombre del departamento donde está ubicada la
     * estación de peaje
     */
    String departamento;
    /*
     * Atributo que identifica el conjunto de vehículos que llega a la estación de
     * peaje. Se cambia Vector por ArrayList.
     */
    ArrayList<Vehiculo> vehiculos; 
    /*
     * Atributo que identifica el total de dinero recolectado por la estación de
     * peaje
     */
    int totalPeaje = 0;
    /*
     * Atributo que identifica el total de camiones que llegó a la estación de peaje
     */
    static int totalCamiones = 0;
    /*
     * Atributo que identifica el total de motos que llegó a la estación de peaje
     */
    static int totalMotos = 0;
    /*
     * Atributo que identifica el total de carros que llegó a la estación de peaje
     */
    static int totalCarros = 0;

    /**
     * Constructor de la clase Peaje
     * * @param nombre       Parámetro que define el nombre de la estación de peaje
     * @param departamento Parámetro que define el departamento donde se encuentra
     * localizado el peaje
     */
    Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.vehiculos = new ArrayList<>(); // Inicialización del ArrayList
    }

    /**
     * Método que devuelve el nombre de la estación de peaje
     * * @return El nombre de la estación de peaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de la estación de peaje
     * * @param nombre Parámetro que define el nombre de la estación de peaje
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el departamento donde está localizada la estación de
     * peaje
     * * @return El departamento donde está localizada la estación de peaje
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Método que establece el departamento donde está localizada la estación de
     * peaje
     * * @param departamento Parámetro que define el departamento donde está
     * localizada la estación de peaje
     */
    private void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Método que permite añadir un vehículo al ArrayList de vehículos de la estación
     * de peaje
     * * @param vehiculo Parámetro que define el vehículo a agregar
     */
    public void anadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /**
     * Método que permite calcular el peaje de un vehículo que llega a la estación
     * de peaje
     * * @param vehiculo Parámetro que define el vehículo que llega a la estación de peaje
     */
    public int calcularPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) { 
            totalCarros++; 
            totalPeaje += Carro.valorPeaje; 
            return Carro.valorPeaje; 
        } else if (vehiculo instanceof Moto) { 
            totalMotos++; 
            totalPeaje += Moto.valorPeaje; 
            return Moto.valorPeaje; 
        } else if (vehiculo instanceof Camion) { 
            totalCamiones++; 
            Camion camion = (Camion) vehiculo; 
            int peajeCamion = camion.numeroEjes * Camion.valorPeajeEje;
            totalPeaje += peajeCamion;
            return peajeCamion;
        } else {
            return -1; 
        }
    }

    /**
     * Método que muestra en pantalla los datos del peaje y estadísticas
     */
    public void imprimir() {
        System.out.println("Peaje = " + getNombre());
        System.out.println("Ubicación = " + getDepartamento());
        System.out.println("Total de carros = " + totalCarros);
        System.out.println("Total de motos = " + totalMotos);
        System.out.println("Total de camiones = " + totalCamiones);
        int totalVehiculos = totalCarros + totalMotos + totalCamiones;
        System.out.println("Total de vehículos = " + totalVehiculos);
        System.out.println("Dinero total = $" + totalPeaje);
    }
}