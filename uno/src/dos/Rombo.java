package dos;

public class Rombo {

     private double diagonalMayor;
    private double diagonalMenor;

    // Constructor
    public Rombo(double diagonalMayor, double diagonalMenor) {
        if (diagonalMayor <= 0 || diagonalMenor <= 0) {
            throw new IllegalArgumentException("Las diagonales deben ser mayores que cero.");
        }
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    // Getters
    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    // Setters
    public void setDiagonalMayor(double diagonalMayor) {
        if (diagonalMayor <= 0) {
            throw new IllegalArgumentException("La diagonal mayor debe ser mayor que cero.");
        }
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        if (diagonalMenor <= 0) {
            throw new IllegalArgumentException("La diagonal menor debe ser mayor que cero.");
        }
        this.diagonalMenor = diagonalMenor;
    }

    // Método para calcular el área del rombo
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    // Método para calcular el perímetro del rombo
    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(diagonalMayor / 2, 2) + Math.pow(diagonalMenor / 2, 2));
        return 4 * lado;
    }

    // Método toString para imprimir la información del rombo
    @Override
    public String toString() {
        return "Rombo {" +
               "Diagonal mayor = " + diagonalMayor +
               ", Diagonal menor = " + diagonalMenor +
               ", Área = " + calcularArea() +
               ", Perímetro = " + calcularPerimetro() +
               "}";
    }

}
