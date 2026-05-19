package cursos;

public class TestCursos {

    public static void main(String[] args) {
        AuxAsignatura miColeccion = new AuxAsignatura();

        Asignatura mates = new Asignatura(101, "Matemáticas Discretas", 6);
        Asignatura programacion = new Asignatura(102, "Programación Orientada a Objetos", 8);
        Asignatura basesDatos = new Asignatura(103, "Bases de Datos I", 6);

        miColeccion.agregarAsignatura(mates);
        miColeccion.agregarAsignatura(programacion);
        miColeccion.agregarAsignatura(basesDatos);

        System.out.println("=== GUARDANDO COLECCIÓN EN DISCO ===");
        miColeccion.guardarColeccion();
        System.out.println("Colección guardada con éxito.");
        System.out.println("------------------------------------\n");

        System.out.println("=== CREANDO NUEVA INSTANCIA VACÍA ===");
        AuxAsignatura coleccionRecuperada = new AuxAsignatura();
        
        System.out.println("=== RECONSTRUYENDO DESDE EL ARCHIVO ===");
        coleccionRecuperada.cargarColeccion();
        System.out.println("------------------------------------\n");

        System.out.println("=== LISTADO DE ASIGNATURAS RECUPERADAS ===");
        coleccionRecuperada.listarAsignaturas();
    }
}