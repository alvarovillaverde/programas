package cole;

public class Test3 {
    public static void main(String[] args) {
        Persona p = new Estudiante("Carlos", "Falso 123", "Sistemas", 4);

        if (p instanceof Estudiante) {
            Estudiante e = (Estudiante) p;

            System.out.println("Carrera recuperada: " + e.getCarrera());
            System.out.println("Semestre: " + e.getSemestre());
        }

        Persona p2 = new Profesor("Ana", "Av central", "FIsixa", "Titular");

        if (p2 instanceof Profesor) {
            Profesor profe = (Profesor) p2;

            System.out.println("Departamento: " + profe.getDepartamento());
            System.out.println("Categoria: " + profe.getCategoria());
        }

        
    }
}
