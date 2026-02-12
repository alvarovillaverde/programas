package dos;

import java.util.Scanner;

public class testpropuesto2 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("dame un entero: ");
		propuesto2 objeto = new propuesto2(sc.nextInt());
		
		System.out.println("dame otro entero: ");
		propuesto2 extraño = new propuesto2(sc.nextInt());

		System.out.println(objeto.toString());
		System.out.println(extraño.toString());
		
		propuesto2 otro = new propuesto2(objeto);
		System.out.println(otro.toString());
		System.out.println(objeto.toString());
		
		System.out.println(otro.equals(objeto));
		 
		System.out.println(extraño.equals(objeto));
		
	}
}
