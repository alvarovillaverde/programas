package gui4;

public class Empleado {
    private String nombre;
    private String apellidos;
    private enum Cargo {
        directivo, estrategico, operativo
    }
    private Cargo cargo;
    private enum Genero{
        masculino, femenino
    }
    private Genero genero;
    private double salarioDiario = 0;
    private int diasTrabajados = 0;
    private double otrosIngresos = 0;
    private double pagoPorSalud = 0;
    private double aportePensiones = 0;

    public Empleado(String nombre, String apellidos, Cargo cargo,
                    Genero genero, double salarioDiario, int diasTrabajados, double otrosIngresos,
                    double pagoPorSalud, double aportePensiones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.genero = genero;
        this.salarioDiario = salarioDiario;
        this.diasTrabajados = diasTrabajados;
        this.otrosIngresos = otrosIngresos;
        this.pagoPorSalud = pagoPorSalud;
        this.aportePensiones = aportePensiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Genero getGenero() {
        return genero;
    }

    public double getSalarioDiario() {
        return salarioDiario;
    }

    public void setSalarioDiario(double salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public double getPagoPorSalud() {
        return pagoPorSalud;
    }

    public void setPagoPorSalud(double pagoPorSalud) {
        this.pagoPorSalud = pagoPorSalud;
    }

    public double getAportePensiones() {
        return aportePensiones;
    }

    public void setAportePensiones(double aportePensiones) {
        this.aportePensiones = aportePensiones;
    }

    public double salarioMensual(){
        double salarioMensual = diasTrabajados * salarioDiario + otrosIngresos - pagoPorSalud - aportePensiones;
        return salarioMensual;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cargo=" + cargo +
                ", genero=" + genero +
                ", salarioDiario=" + salarioDiario +
                '}';
    }

    // =========================================================================
    // MÉTODO AÑADIDO: Permite crear un Empleado convirtiendo los Strings de la GUI
    // =========================================================================
    public static Empleado crearDesdeString(String nombre, String apellidos, String cargoStr,
                                            String generoStr, double salarioDiario, int diasTrabajados, 
                                            double otrosIngresos, double pagoPorSalud, double aportePensiones) {
        
        Cargo cargoElegido = Cargo.valueOf(cargoStr.toLowerCase());
        Genero generoElegido = Genero.valueOf(generoStr.toLowerCase());
        
        return new Empleado(nombre, apellidos, cargoElegido, generoElegido, 
                            salarioDiario, diasTrabajados, otrosIngresos, pagoPorSalud, aportePensiones);
    }
}