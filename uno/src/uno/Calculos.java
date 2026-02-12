package uno;

import java.util.Scanner;

public class Calculos {
	
	public static double calculaLongCirc (double radio) {
		double longitud=0d;
		longitud= 2 * Math.PI * radio;
		return longitud;
	}

	public static double calculaAreaCirc (double radio) {
		double area=0d;
		area = Math.PI * Math.pow(radio, 2);
		return area;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		double radio=0d;
		
		//entradas
		System.out.println("dame un radio: ");
		radio= scanner.nextDouble();
		
		//salidas
		System.out.println("longitud: " +calculaLongCirc(radio));
		System.out.println("area: " +calculaAreaCirc(radio));

		scanner.close();
	}
	
}
