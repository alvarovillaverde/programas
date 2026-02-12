package dos;

public class CuentaBancaria {

    // Programa que modele cuenta bancaria que posea:
    // · Nombre del titular
    // · Apellido del titular
    // · Número cuenta bancaria
    // · Tipo de cuenta
    // · Saldo de cuenta
    // Cnstr a 0

    String nombreCuenta;
    String apellidosCuenta;
    long numeroCuenta;
    double saldoCuenta;
    float interes;

    enum tipoCuenta {
        CUENTA_AHORROS, CUENTA_CORRIENTE
    }

    tipoCuenta cuenta;

    public CuentaBancaria(String nombreCuenta, String apellidosCuenta, long numeroCuenta, double saldoCuenta,
            tipoCuenta cuenta, float in) {
        this.interes = in;
        this.nombreCuenta = nombreCuenta;
        this.apellidosCuenta = apellidosCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = 0d;
        this.cuenta = cuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getApellidosCuenta() {
        return apellidosCuenta;
    }

    public void setApellidosCuenta(String apellidosCuenta) {
        this.apellidosCuenta = apellidosCuenta;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public tipoCuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(tipoCuenta cuenta) {
        this.cuenta = cuenta;
    }

    //consultar saldo
    public double consultarSaldo() {
        return this.saldoCuenta;
    }

    //ingreso en Cuenta
    public void consignar(double valor) {
        this.saldoCuenta+=valor;
    }

    //retirar dinero de la Cuenta
    public void retirar(double valor) {
        if (saldoCuenta-valor<0) {
            System.out.println("No puede retirar dicha cantidad...");
        } else {
            saldoCuenta-=valor;
        }
    }

    public void calcularInteres() {
        double cantidad = saldoCuenta * (interes / 12);
        saldoCuenta += cantidad;
    }

    public boolean compararCuentas(CuentaBancaria otra) {
        if (this.saldoCuenta >= otra.saldoCuenta) {
            return false;
        } else {
            return true;
        }
    }

    public double transferir(double transferencia, CuentaBancaria otra) {
        if (transferencia > otra.consultarSaldo()) {
            System.out.println("No puedes transferir más del dinero de tu cuenta");
        } else {
            otra.retirar(transferencia);
            this.consignar(transferencia);
        }
        return this.consultarSaldo();
    }

    @Override
    public String toString() {
        return "CuentaBancaria [nombreCuenta=" + nombreCuenta + ", apellidosCuenta=" + apellidosCuenta
                + ", numeroCuenta=" + numeroCuenta + ", saldoCuenta=" + saldoCuenta + ", cuenta=" + cuenta + ", interes=" 
                + interes + "]";
    }

}