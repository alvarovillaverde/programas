package dos;

import java.util.Scanner;

public class propuesto7 {

	public static float millasaMetros(float marinas) {
		
		return marinas*1852;
		
	}
	
	public static float millasaKilometros(float millas) {
		return millasaMetros(millas)/1000;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("millas marinas a convertir");
		float millas = Float.parseFloat( sc.nextLine() );
		System.out.println("EN METROS ES: " + millasaMetros(millas));
		System.out.println("EN KILOMETROS ES: " + millasaKilometros(millas));
		sc.close();
	}
	
}
