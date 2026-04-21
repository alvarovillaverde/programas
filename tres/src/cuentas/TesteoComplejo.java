package cuentas;

public class TesteoComplejo {
    static void main(String[] args) {
        cuenta uno=new cuenta(100f, 1.5f);
        System.out.println(uno);
        uno.consignar(200f);
        uno.retirar(100f);
        uno.extractoMensual();
        System.out.println(uno);
        CuentaCorriente dos=new CuentaCorriente(500.50f, 2.5f);
        System.out.println(dos);
        dos.retirar(600f);
        System.out.println(dos);//con sobregiro
        dos.consignar(100F);
        System.out.println(dos);
        dos.extractoMensual();
        System.out.println(dos);
        CuentaAhorro tres=new CuentaAhorro(10000f, 3.5f);
        System.out.println(tres);
        tres.retirar(2000F);// deja de estar activa
        System.out.println(tres);
        tres.retirar(1000F);
    }
}
