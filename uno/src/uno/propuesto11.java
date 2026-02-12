package uno;

import java.util.Scanner;

public class propuesto11 {

	public static void main(String[] args) {
		int t = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce una cantidad de segundos: ");
		t = sc.nextInt();
		
		int cociente = t/60;
		int sec = t%60;
		int resto = cociente/60;
		int min = cociente%60;
		int dias = resto/24;
		int horas = resto%24;
		
		System.out.println("días "+dias);
		System.out.println("horas "+horas);
		System.out.println("minutos "+min);
		System.out.println("segundos "+sec);

		sc.close();
	}
	
}
