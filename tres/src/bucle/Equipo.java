package bucle;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private int totalTiempoEq = 0;
    private int tiempoAcumuladoEq = 0;
    private String pais;
    ArrayList<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaCiclistas = new ArrayList<Ciclista>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalTiempoEq() {
        return totalTiempoEq;
    }

    public void setTotalTiempoEq(int totalTiempoEq) {
        this.totalTiempoEq = totalTiempoEq;
    }

    public int getTiempoAcumuladoEq() {
        return tiempoAcumuladoEq;
    }

    public void setTiempoAcumuladoEq(int tiempoAcumuladoEq) {
        this.tiempoAcumuladoEq = tiempoAcumuladoEq;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Ciclista> getListaCiclistas() {
        return listaCiclistas;
    }

    public void setListaCiclistas(ArrayList<Ciclista> listaCiclistas) {
        this.listaCiclistas = listaCiclistas;
    }

    void annadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            System.out.println(c.getNombre() + " " + c.getDorsal());
        }
    }

    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.nextLine();
        boolean esta = false;
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre() + c.getDorsal());
                esta = true;
            }
        }
        if (!esta) {
            System.out.println("no esta en el equipo...");
        }
        sc.close();
    }

    void calcularTiempoParyAcu() {
        int par = 0;
        int acu = 0;
        
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            par += c.getTiempo();
            acu += c.getTiempoAcumulado();
        }
        this.setTotalTiempoEq(par);;
        this.setTiempoAcumuladoEq(acu);
        System.out.println("El equipo en la etapa tiempo: " + this.getTotalTiempoEq());
        System.out.println("El equipo en la vuelta tiempo: " + this.getTiempoAcumuladoEq());
    }

    void imprimir() {
        System.out.println("Nombre del equipo " + nombre);
        System.out.println("Pais " + pais);
        System.out.println("Total tiempo etapa " + totalTiempoEq);
        System.out.println("Total tiempo acumulado " + tiempoAcumuladoEq);
    }
}