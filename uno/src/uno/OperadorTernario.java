package uno;

public class OperadorTernario {

	public static void main(String[] args) {
		
		//condicion ? valor_si_verdadero : valor_si_falso
		
		int edad=20;
		String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de dad";
		System.out.println(mensaje);
		
		int a = 15;
		int b = 20;
		int menor = (a<b) ? a : b;
		System.out.println("El valor menor es " +menor); //El valor menor es 15
		
		int n = 4;
		n = 5 * n + 3;
		System.out.println("valor de n: " +n);
		
	}
	
}
