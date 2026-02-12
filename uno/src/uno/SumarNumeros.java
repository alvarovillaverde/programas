package uno;

import java.util.Scanner;

public class SumarNumeros {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("suma de enteros desde 1----");
	System.out.println("introduce hasta que numero quieres sumar/multiplicar: ");
	int numero=sc.nextInt();
	

	long producto=1;
	long suma = 0;
	int contador=0;
	
	for (int i = contador+1; i <=numero; i++) {
		suma+=i;
		contador++;
		producto*=i; //producto=i*2;
		}
	System.out.println("la suma da: "+suma+" para los primeros "+contador+" numeros");
	System.out.println("el producto da: "+producto+" para los primeros "+contador+" numeros");

	sc.close();
	}
}
