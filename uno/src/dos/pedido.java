package dos;

public class pedido {
    private String primerPlato;
    private double costoPrimerPlato;
    private String SegundoPlato;
    private double costoSegundoPlato;
    private String postre;
    private double costoPostre;
    private String bebida;
    private double costoBebida;
    
    
    public String getPrimerPlato() {
        return primerPlato;
    }

    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }

    public double getCostoPrimerPlato() {
        return costoPrimerPlato;
    }

    public void setCostoPrimerPlato(double costoPrimerPlato) {
        this.costoPrimerPlato = costoPrimerPlato;
    }

    public String getSegundoPlato() {
        return SegundoPlato;
    }

    public void setSegundoPlato(String segundoPlato) {
        SegundoPlato = segundoPlato;
    }

    public double getCostoSegundoPlato() {
        return costoSegundoPlato;
    }

    public void setCostoSegundoPlato(double costoSegundoPlato) {
        this.costoSegundoPlato = costoSegundoPlato;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public double getCostoPostre() {
        return costoPostre;
    }

    public void setCostoPostre(double costoPostre) {
        this.costoPostre = costoPostre;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public double getCostoBebida() {
        return costoBebida;
    }

    public void setCostoBebida(double costoBebida) {
        this.costoBebida = costoBebida;
    }
    

    @Override
    public String toString() {
        return "pedido [primerPlato=" + primerPlato + ", costoPrimerPlato=" + costoPrimerPlato + ", SegundoPlato="
                + SegundoPlato + ", costoSegundoPlato=" + costoSegundoPlato + ", postre=" + postre + ", costoPostre="
                + costoPostre + ", bebida=" + bebida + ", costoBebida=" + costoBebida + "]";
    }

    public void calcularPrecio (String primerPlato, double costoPrimerPlato, String bebida, double costoBebida){
        double total = costoPrimerPlato + costoBebida;
        System.out.println("el costo de " + primerPlato + " y " + bebida + " es = $" + total);
    }
    public void calcularPrecio (String primerPlato, double costoPrimerPlato, String SegundoPlato, double costoSegundoPlato,String bebida, double costoBebida){
        double total = costoPrimerPlato + costoSegundoPlato + costoBebida;
        System.out.println("el Precio de " + primerPlato + " + " + SegundoPlato + " + " + bebida + " es = $" + total);
    }
    public void calcularPrecio (String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String postre, double costoPostre, String bebida, double costoBebida) {
        double total = costoPrimerPlato + costoSegundoPlato + costoBebida + costoPostre;
        System.out.println("el Precio de " + primerPlato + " + " + segundoPlato + " + " + postre + " + " + bebida + " es = $" + total);
        
    }
   
}
