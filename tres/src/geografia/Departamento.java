package geografia;

import java.util.ArrayList;

public class Departamento {
    String nombre;
    private ArrayList<Municipio> municipios;

    public Departamento(String nombre, ArrayList<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public void eliminarMunicipio(String nombre) {
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            if (nombre.equals(municipio.getNombre())) {
                municipios.remove(municipio); 
                break;
            }
        }
    }

    public void buscarMunicipio(String nombre) {
        boolean encontrado = false;
        
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            if (nombre.equals(municipio.getNombre())) {
                municipio.imprimir(); 
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) { 
            System.out.println("Municipio no encontrado.");
        }
    }

    public void buscarMunicipioConPoblacionMayor(int poblacion) {
        boolean encontroMunicipios = false;
        
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            if (municipio.getPoblación() >= poblacion) {
                System.out.println(municipio.getNombre()); 
                encontroMunicipios = true;
            }
        }
        
        if (!encontroMunicipios) {
            System.out.println("No existen municipios con esta población");
        }
    }

    public int calcularCensoPoblacionDepartamento() {
        int totalCenso = 0; 
        for (int i = 0; i < municipios.size(); i++) { 
            Municipio municipio = municipios.get(i);
            totalCenso += municipio.getPoblación(); 
        }
        return totalCenso; 
    }
}