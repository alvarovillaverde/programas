package uno;

import java.util.Scanner;

public class OpRelacion {
	
		// Pedir variables //
	public static int pedirNumero() {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		lector.close();
		return lector.nextInt();
		
	}
	
	public static void main(String[] args) {
		
		
		int m = pedirNumero(), n = pedirNumero() ;
		boolean res;
		res = (m > n);
		System.out.println("la expresión es: "+res);//res=false
		res = m < n;
		System.out.println("la expresión es: "+res);//res=true
		res = m >= n;
		System.out.println("la expresión es: "+res);//res=false
		res = m <= n;
		System.out.println("la expresión es: "+res);//res=true
		res = (m == n);
		System.out.println("la expresión es: "+res);//res=false
		res = (m != n);
		System.out.println("la expresión es: "+res);//res=true
		
	}

}
