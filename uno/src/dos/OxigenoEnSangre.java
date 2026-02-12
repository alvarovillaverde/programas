package dos;

import java.util.Scanner;

public class OxigenoEnSangre {

    //scanner
    Scanner sc = new Scanner(System.in);

    //atributos
    private double Hb; //concentración de hemoglobina (en g/dL)
    private double SaO2; //porcentaje de saturación de oxígeno arterial
    private double PaO2; //presión parcial de oxígeno disuelto en el plasma (en mmHg)
    
    //constructor
    public OxigenoEnSangre(double hb, double saO2, double paO2) {
        Hb = hb;
        SaO2 = saO2;
        PaO2 = paO2;
    }

    //getters y setters
    public double getHb() {
        return Hb;
    }

    public void setHb(double hb) {
        Hb = hb;
    }

    public double getSaO2() {
        return SaO2;
    }

    public void setSaO2(double saO2) {
        SaO2 = saO2;
    }

    public double getPaO2() {
        return PaO2;
    }

    public void setPaO2(double paO2) {
        PaO2 = paO2;
    }

    //metodo para el cálculo
    public double CalculoCaO2() {
        double CaO2;

        System.out.println("Introduzca la cantidad de Hb: ");
        Hb = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduzca la cantidad de SaO2: ");
        SaO2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduzca la cantidad de PaO2: ");
        PaO2 = sc.nextDouble();
        sc.nextLine();

        CaO2 = (1.34 * Hb * (SaO2 / 100)) + (0.003 * PaO2);

        System.out.println("Tu concentración de oxígeno en sangre es de: " +CaO2);
        return CaO2;
    }
}
