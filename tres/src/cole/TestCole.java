package cole;

public class TestCole {

    public static void main(String[] args) {

        // 1. Instanciamos un Estudiante (Nombre, Dirección, Carrera, Semestre)
        Estudiante est = new Estudiante("Juan Pérez", "Calle 10", "Sistemas", 4);
        
        // 2. Instanciamos un Profesor (Nombre, Dirección, Departamento, Categoría)
        Profesor prof = new Profesor("Marta Ruiz", "Carrera 15", "Ciencias", "Asociado");
    
        System.out.println("=== REGISTRO DEL COLEGIO ===");

        System.out.println("=== Datos del estudiante ===");
        System.out.println(est);
        System.out.println("=== Datos del Profesor ===");
        System.out.println(prof);
    }
}