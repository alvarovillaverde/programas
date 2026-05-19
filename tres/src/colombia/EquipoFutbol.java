package colombia;

public class EquipoFutbol {
    private String nombre;
    private String pais;

    private Tecnico tecnico;
    private Portero portero;
    private Defensa[] defensas;
    private Mediocampo[] mediocampos;
    private Delantero[] delanteros;

    public EquipoFutbol(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public EquipoFutbol(String nombre, String pais, Tecnico tecnico, Portero portero, 
        Defensa[] defensas, Mediocampo[] mediocampos, Delantero[] delanteros) {
        this(nombre, pais);
        this.tecnico = tecnico;
        this.portero = portero;
        this.defensas = defensas;
        this.mediocampos = mediocampos;
        this.delanteros = delanteros;
    }

    
    public void imprimir() {
        System.out.println("Equipo: " + nombre);
        System.out.println("País: " + pais);
        System.out.println("---------------------------");
        
        System.out.println("TÉCNICO:");
        
        System.out.println(tecnico.nombre + " " + tecnico.apellidos + 
        " | Edad: " + tecnico.edad + 
        " | Experiencia: " + tecnico.anosExperiencia + " años" +
        " | Nacional: " + (tecnico.nacional));

        System.out.println("\nPORTERO:");
        System.out.println(portero.nombre + " " + portero.apellidos + 
        " | Goles recibidos: " + portero.golesRecibidos);
        
        System.out.println("\nDEFENSAS:");
        for (Defensa d : defensas) {
            System.out.println(d.nombre + " " + d.apellidos + " | Edad: " + d.edad);
        }

        System.out.println("\nMEDIOCAMPOS:");
        for (Mediocampo m : mediocampos) {
            System.out.println(m.nombre + " " + m.apellidos + " | Asistencias: " + m.asistencias);
        }

        System.out.println("\nDELANTEROS:");
        for (Delantero del : delanteros) {
            System.out.println(del.nombre + " " + del.apellidos + " | Goles: " + del.golesMarcados);
        }
    }
}