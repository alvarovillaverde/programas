package uno;

import java.util.Scanner;

public class calcEsfera {

	public static void main(String[] args) {
		//variables
		double area = 0;
		double volumen = 0;
		int radio = 0;
		
		//scanner para pedir el radio al usuario
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el radio de la esfera: ");
		radio = sc.nextInt();
		
		//calculo de area
		area = 4 * Math.PI * Math.pow(radio, 2);
		
		//salida area
		System.out.println("El área es: "+area);
		
		//calculo de volumen
		volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);
		
		//salida volumen
		System.out.println("El volumen es de: "+volumen);

		sc.close();
	}
	
}
