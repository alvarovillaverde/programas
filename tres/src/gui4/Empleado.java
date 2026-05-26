package gui4;

public class Empleado {
    private String nombre;
    private String apellidos;
    
    // CAMBIADO A PUBLIC
    public enum Cargo {
        directivo, estrategico, operativo
    }
    private Cargo cargo;
    
    // CAMBIADO A PUBLIC
    public enum Genero {
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

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public Cargo getCargo() { return cargo; }
    public Genero getGenero() { return genero; }
    public double getSalarioDiario() { return salarioDiario; }
    public void setSalarioDiario(double salarioDiario) { this.salarioDiario = salarioDiario; }
    public int getDiasTrabajados() { return diasTrabajados; }
    public void setDiasTrabajados(int diasTrabajados) { this.diasTrabajados = diasTrabajados; }
    public double getOtrosIngresos() { return otrosIngresos; }
    public void setOtrosIngresos(double otrosIngresos) { this.otrosIngresos = otrosIngresos; }
    public double getPagoPorSalud() { return pagoPorSalud; }
    public void setPagoPorSalud(double pagoPorSalud) { this.pagoPorSalud = pagoPorSalud; }
    public double getAportePensiones() { return aportePensiones; }
    public void setAportePensiones(double aportePensiones) { this.aportePensiones = aportePensiones; }

    public double salarioMensual(){
        return diasTrabajados * salarioDiario + otrosIngresos - pagoPorSalud - aportePensiones;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre='" + nombre + '\'' + ", apellidos='" + apellidos + '\'' + ", cargo=" + cargo + ", genero=" + genero + '}';
    }
}