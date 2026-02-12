package uno;

public class Aleatorios2 {

	public static void main(String[] args) {
		
		//Usando Math.random() java
		
		// Decimal aleatorio entre 0.0 y 1.0
		double aleatorio = Math.random();
		System.out.println("Decimal aleatorio: " + aleatorio);
		
		//Entero aleatorio entre 1 y 6 (simular dado)
		for (int k = 0; k < 10; k++) {
		int dado = (int)(Math.random() * 6) + 1;
		System.out.println("Tirada ded dado: " + dado);
		}
		
	}
	
}
