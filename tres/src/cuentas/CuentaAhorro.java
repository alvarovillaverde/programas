package cuentas;

public class CuentaAhorro extends cuenta {

    //constructor
    public CuentaAhorro(float saldo, float tasaAnual) {
        //llamada a la clase padre.
        super(saldo, tasaAnual);
        // TODO Auto-generated constructor stub
        //damos valor al atributo en funcion de la regla
        this.activa= this.isActiva();
    }

    /*	posee un atributo para determinar si la cuenta de ahorros está activa
     *  (tipo boolean). Si el saldo es menor a $10000, la cuenta está inactiva,
     *  en caso contrario se considera activa.
     */
    boolean activa;
    //este metodo es bastante similar a un metodo GEt
    public boolean isActiva() {
        if(this.getSaldo()>10000)
            return true;
        else
            return false;
    }
    //retoque de metodos heredados
    //retirar
    @Override
    public void retirar(float cantidad) {
        if (this.isActiva()) {
            super.retirar(cantidad);
        }else {
            System.out.println("La cuenta de ahorro no esta activa en este momento");
        }
    }
    //extracto mensual
    @Override
    public void extractoMensual() {
        if(numeroRetiros>4){

            this.comisionMensual=+1000F*(numeroRetiros-4);
        }
        super.extractoMensual();
    }

    //metodos de ejercicio PROPIOS

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    //toString

    @Override
    public String toString() {
        String todo= super.toString();
        return todo+"\nCuentaAhorro{" +
                "activa=" + activa +
                '}';
    }


}
