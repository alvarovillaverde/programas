package dos;

public class Propuesto9 {

    // Atributos
    private double kms;
    private double litros;
    private double vmed;
    private double pgas;

    // Constructor
    public Propuesto9(double kms, double litros, double vmed, double pgas) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    // metodo tiempo empleado
    public double getTiempo() {
        return kms / vmed;
    }

    // metodo consumo medio en litros
    public double consumoMedio() {
        return (litros / kms) * 100;
    }

    // metodo consumo medio en euros
    public double consumoEuros() {
        return consumoMedio() * pgas;
    }

    // getters y setters
    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getVmed() {
        return vmed;
    }

    public void setVmed(double vmed) {
        this.vmed = vmed;
    }

    public double getPgas() {
        return pgas;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }
}
