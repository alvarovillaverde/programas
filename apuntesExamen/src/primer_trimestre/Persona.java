package primer_trimestre;

/**
 * Una CLASE es como un "molde" o plantilla.
 * Define qué datos tiene una Persona y qué puede hacer.
 */
public class Persona {
    
    // 1. ATRIBUTOS (Las características)
    String nombre;
    int edad;

    // 2. MÉTODOS (Las acciones que puede realizar)
    public void saludar() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
    }

    // El método main para probar la clase
    public static void main(String[] args) {
        
        // 3. CREAR OBJETOS (Instanciar la clase)
        // Usamos el molde para crear personas reales
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 20;

        Persona persona2 = new Persona();
        persona2.nombre = "Maria";
        persona2.edad = 25;

        // 4. USAR LOS OBJETOS
        persona1.saludar();
        persona2.saludar();
    }
}