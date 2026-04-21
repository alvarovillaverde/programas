package cole;

public class TestColeUP {
    public static void main(String[] args) {

        // 1. Instanciamos un Estudiante pero con casteo a persona
        Persona est = new Estudiante("Juan Pérez", "Calle 10", "Sistemas", 4);
        
        // 2. Instanciamos un Profesor pero con casteo a persona
        Persona prof = new Profesor("Marta Ruiz", "Carrera 15", "Ciencias", "Asociado");
    
        System.out.println("=== REGISTRO DEL COLEGIO ===");

        if (est instanceof Estudiante) {
            System.out.println("=== Datos del estudiante ===");
            System.out.println(est);
        }
        
        if (prof instanceof Profesor) {
            System.out.println("=== Datos del Profesor ===");
            System.out.println(prof);
        }
        
    }

}
