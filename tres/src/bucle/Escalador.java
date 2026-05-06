package bucle;

public class Escalador extends Ciclista {

	// Atributo que define la acelaración promedio de un escalador
	private double aceleracionPromedio;
	// Atributo que define el grado de rampa soportado por un escalador
	private double gradoRampa;

	public Escalador(int dorsal, String nombre, double aceleracionPromedio, double gradoRampa) {
		super(dorsal, nombre);
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
	}

	protected double getAceleraciónPromedio() {
		return aceleracionPromedio;
	}

	protected void setAceleraciónPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}

	protected double getGradoRampa() {
		return gradoRampa;
	}

	protected void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}

	protected void imprimir() {
		super.imprimir(); // Invoca el método imprimir de la clase padre
		System.out.println("Aceleración promedio = " + aceleracionPromedio);
		System.out.println("Grado de rampa = " + gradoRampa);
	}

	/**
	 * Método que devuelve el tipo de ciclista
	 * 
	 * @return Un valor String con el texto “Es un escalador”
	 */
	protected String imprimirTipo() {
		return "Es un escalador";
	}

	@Override
	public void correrEtapa(int tiempoMinimo, int tiempoMaximo) {
		java.util.Random r = new java.util.Random();
		int tiempoBase = r.nextInt((tiempoMaximo - tiempoMinimo) + 1) + tiempoMinimo;
		
		// Aplicamos la bonificación: - (5 * aceleracion) - (4 * rampa)
		int tiempoDeEstaEtapa = tiempoBase - (int)(5 * aceleracionPromedio) - (int)(4 * gradoRampa);

		this.tiempo = tiempoDeEstaEtapa;
		this.tiempoAcumulado += tiempoDeEstaEtapa;

		System.out.println(nombre + " (Escalador) ha terminado en: " + tiempoDeEstaEtapa + "s. (Base: " + tiempoBase + ")");
	}	
	
}