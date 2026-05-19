package cursos;

public class TestAsignatura {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura(4100547, "Progra", 4);
        asignatura.escribirAsignatura();
        asignatura.leerAsignatura();
    }
}
