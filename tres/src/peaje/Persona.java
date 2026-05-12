package peaje;

import java.util.ArrayList;

public class Persona {
    String nombre, apellidos, DNI, fechaNac;
    ArrayList<Vehiculo> misVehiculos = new ArrayList<>();
    
    public Persona(String nombre, String apellidos, String dNI, String fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        DNI = dNI;
        this.fechaNac = fechaNac;
    }

    public Persona(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void asignarVehiculo(Vehiculo v) {
    // 1. Verificamos que el DNI coincida (por seguridad)
    if (v.getConductor().getDNI().equals(this.DNI)) {
        this.misVehiculos.add(v);
        System.out.println("Vehículo " + v.getPlaca() + " asignado a " + this.DNI);
    } else {
        System.out.println("Error: El DNI del vehículo no coincide con esta persona.");
    }
    }

    public void desAsignarVehiculo(Vehiculo v) {
    // 1. Verificamos que el DNI coincida (por seguridad)
    if (v.getConductor().getDNI().equals(this.DNI)) {
        this.misVehiculos.remove(v);
        System.out.println("Vehículo " + v.getPlaca() + " desasignado a " + this.DNI);
    } else {
        System.out.println("Error: El DNI del vehículo no coincide con esta persona.");
    }
    }

    // Dentro de Persona.java

    public int calcularTotalPagado() {
        int total = 0;
        for (Vehiculo v : this.misVehiculos) {
            // Lógica para obtener el precio según el tipo de vehículo
            if (v instanceof Carro) {
                total += Carro.valorPeaje;
            } else if (v instanceof Moto) {
                total += Moto.valorPeaje;
            } else if (v instanceof Camion) {
                Camion c = (Camion) v;
                total += c.numeroEjes * Camion.valorPeajeEje;
            }
        }
        return total;
    }

    public void imprimirInformePeajes() {
    System.out.println("Persona: " + this.DNI);
    System.out.println("Total pagado en peajes: $" + calcularTotalPagado());
    }
}
