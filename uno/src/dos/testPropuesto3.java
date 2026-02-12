package dos;

import java.util.Scanner;

public class testPropuesto3 {
	

	private static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	    	System.out.println("dame un entero: ");
			propuesto3 n1 = new propuesto3(sc.nextInt());
			
			System.out.println("dame un entero: ");
			propuesto3 n2 = new propuesto3(sc.nextInt());
			
			propuesto3 n3 = new propuesto3(n2);

	        n1.sumar(5);
	        n2.restar(2);

	        System.out.println("n1 = " + n1);
	        System.out.println("n2 = " + n2);
	        System.out.println("n3 (copia de n2) = " + n3);

	        System.out.println("Valor de n1: " + n1.getValor());
	        System.out.println("Doble de n2: " + n2.getDoble());
	        System.out.println("Triple de n3: " + n3.getTriple());

	        System.out.println("¿n2 y n3 son iguales? " + n2.equals(n3));
	    }
	}


