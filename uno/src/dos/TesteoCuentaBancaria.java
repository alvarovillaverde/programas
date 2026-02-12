package dos;

import dos.CuentaBancaria.tipoCuenta;

public class TesteoCuentaBancaria {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Perez", 123456789,
         0, tipoCuenta.CUENTA_AHORROS, 0);

        System.out.println(cuenta.toString());
        cuenta.consignar(200000);
        System.out.println(cuenta.toString());
        cuenta.consignar(300000);
        System.out.println(cuenta.toString());
        cuenta.retirar(400000);
        System.out.println(cuenta.toString());

        CuentaBancaria cuenta2 = new CuentaBancaria("Pedro", "Perez", 123456789, 0, 
        tipoCuenta.CUENTA_AHORROS, 0.02f);

        System.out.println(cuenta2.toString());
        cuenta2.consignar(200000);
        System.out.println(cuenta2.toString());
        cuenta2.consignar(300000);
        System.out.println(cuenta2.toString());
        double retiro=400000;
        cuenta2.retirar(retiro);
        System.out.println(cuenta2.toString());
        cuenta2.calcularInteres();
        System.out.println("nuevo saldo es: " + cuenta2.consultarSaldo());
        System.out.println(retiro);

        System.out.println(cuenta.compararCuentas(cuenta2));
        cuenta.transferir(10000, cuenta2);
        System.out.println(cuenta.getSaldoCuenta());
        System.out.println(cuenta2.getSaldoCuenta());

        CuentaBancaria cuenta3 = new CuentaBancaria(null, null, 0, 
        10, null, 0);
        CuentaBancaria cuenta4 = new CuentaBancaria(null, null, 0, 
        9, null, 0);

        System.out.println(cuenta3.transferir(5, cuenta4));
        System.out.println(cuenta3.getSaldoCuenta());
        System.out.println(cuenta4.getSaldoCuenta());

    }
}
