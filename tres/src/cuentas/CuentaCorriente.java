package cuentas;

public class CuentaCorriente extends cuenta{

    //nuevos atributos
   protected float sobregiro=0; //Descubierto

    //nuevo constructor
    public CuentaCorriente(float saldo, float tasaAnual) {
        //llamada al constructor de  la clase padre
        super(saldo, tasaAnual);
    }

    //getter y setter
    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro)
    {
        this.sobregiro = sobregiro;
    }


    //Modificacion de los metodos que heredas(?)
    //Si no los modificas los heredas y funcionan tal cual estan en la clase padre

    //metodo de retirada teniendo en cuenta el sobregiro
    @Override
    public void retirar(float cantidad) {
        float Sobrete = this.saldo - cantidad;
        /* Si la cantidad a retirar supera al saldo, queda como sobregiro
         */
        this.numeroRetiros ++;
        if (Sobrete >= 0) {
            //normal
            this.saldo -= cantidad;
        } else {
            this.sobregiro= -Sobrete;
            this.saldo=0;
            System.out.println("la cantidad a retirar excede el saldo actual.");
            System.out.println("Dicho exceso quedara como sobregiro: "+this.sobregiro);
        }
    }


    //retoques a consignar
    @Override
    public void consignar(float cantidad) {
        //Si no hay sobregiro(sobregiro=0) todo funciona como en la clase cuenta
        if (this.sobregiro==0) {
            super.consignar(cantidad);
        }else {
            //a parte si hay sobre giro primero anulamos el sobregiro
            //y si queda lo metemos como saldo
            numeroConsignaciones++;
            if (cantidad >= this.sobregiro) {
                this.saldo = cantidad - this.sobregiro;
                this.sobregiro = 0;
            } else {
                this.sobregiro -= cantidad;
            }
        }

    }

    //Metodos propios no HAY

    //toString
    @Override
    public String toString() {
        //si quisiesemos ver las caracteristicas heredadas de papa
        String todo= super.toString();
        return todo+"\nCuentaCorriente{" +
                "sobregiro=" + sobregiro +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}
