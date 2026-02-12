package uno;

import java.util.Scanner;

public class reuselto5 {
	//Dentro de una clase joven tenemos las variables enteras edad, nivel_de_estudios e ingresos.
	//Necesitamos almacenar en la variable booleana jasp el valor:
	//– Verdadero. Si la edad es menor o igual a 28,                 <=28
	//el nivel_de_estudios es mayor que tres y los ingresos superan  >3
	//los 28.000 (euros).                                            >28000
	//– Falso. En caso contrario.
	//n Escribe el código necesario (2 líneas).
	
	public static void main(String[] args) {
		
		//variables
		Scanner sc = new Scanner(System.in);
		int edad = 0, nivel_estudios = 0, ingresos = 0;
		boolean jasp;
		
		//entradas
		System.out.println("dame tu edad: ");
		edad = sc.nextInt();
		System.out.println("Dame tu nivel de estudios de 1 a 6: ");
		nivel_estudios = sc.nextInt();
		System.out.println("dame tus ingresos: ");
		ingresos = sc.nextInt();
		
		//algoritmo
		jasp = (edad<=28) && (nivel_estudios>3) && (ingresos>28000);
		
		//salida
		if(jasp) {
			System.out.println("ERES UN CRACK CHAVALOTE");
		} else {
			System.out.println("NO PASA NADA TU MAMA TE QUIERE");
		}
		
		sc.close();
	}
}
