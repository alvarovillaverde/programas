package cuentas;

public class testeoSimple {
    static void main(String[] args) {

        cuenta uno=new cuenta(245.56f, 1.45f);
        System.out.println(uno);
        //metodos de uno
        uno.consignar(120.5f);
        uno.retirar(23.78f);
        System.out.println(uno);//sin extracto mensual
        uno.extractoMensual();
        System.out.println(uno);

        CuentaCorriente dos= new CuentaCorriente(566.34f, 1f);
        System.out.println(dos);
        dos.retirar(45f);
        System.out.println(dos);

        CuentaAhorro tres= new CuentaAhorro(12345f, 2.2f);
        System.out.println(tres);
        tres.consignar(1300f);
        tres.extractoMensual();
        System.out.println(tres);

    }
}
