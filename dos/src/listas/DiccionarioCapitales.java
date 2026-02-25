package listas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DiccionarioCapitales {
    private HashMap<String, String> capitales;
    private final String nombreArchivo = "capitales.txt";

    public DiccionarioCapitales() {
        this.capitales = new HashMap<>();
        // Datos iniciales
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");
        
        cargarDesdeArchivo();
    }

    public boolean existePais(String pais) {
        return capitales.containsKey(pais);
    }

    public String getCapital(String pais) {
        return capitales.get(pais);
    }

    public void aprender(String pais, String capital) {
        capitales.put(pais, capital);
        guardarEnArchivo();
    }

    // --- MEJORA: Escritura con BufferedWriter ---
    private void guardarEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Map.Entry<String, String> entry : capitales.entrySet()) {
                bw.write(entry.getKey() + ";" + entry.getValue());
                bw.newLine(); // Añade el salto de línea automáticamente
            }
        } catch (IOException e) {
            System.err.println("No se pudo escribir en el archivo: " + e.getMessage());
        }
    }

    // --- MEJORA: Lectura con BufferedReader ---
    private void cargarDesdeArchivo() {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    capitales.put(partes[0], partes[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}