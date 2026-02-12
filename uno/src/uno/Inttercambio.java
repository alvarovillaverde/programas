package uno;

public class Inttercambio {
	public static void main(String[] args) {
		int a = 5, b = 8;
		int tmp;
		System.out.println("ANTES");
		System.out.println("EL valor de a ahora es:" +a);
		System.out.println("EL valor de b ahora es:" +b);
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("DESPUES");
		System.out.println("EL valor de a ahora es:" +a);
		System.out.println("EL valor de b ahora es:" +b);
		
	}
}
