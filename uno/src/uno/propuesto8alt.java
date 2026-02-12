package uno;

import java.util.Random;

public class propuesto8alt {
	// metodo estatico
		public static char getLetras() {
			return (char) (Math.random() * 26 + 'a');
		}

		public static void main(String[] args) {

			Random rand = new Random();
			int veces = rand.nextInt(10)+1;
			int contVoc = 0;
			int contCons = 0;
			
			System.out.println("se van a generar "+veces+" caracteres");
			
			for (int i = 0; i < veces; i++) {
				
				char letra = getLetras();
				
				/*if (letra == 'a'|letra == 'e'|letra == 'i'|letra == 'o'|letra == 'u') {
					
					System.out.println("El carácter "+letra+" es una vocal.");
					contVoc++;
				}
				else {
						System.out.println("El carácter "+letra+" es una consonante.");
						contCons++;
					}
					
				}*/ //fin bucle for
			
			switch (letra) {
			case 'a','e','i','o','u': 
				System.out.println("El carácter "+letra+" es una vocal.");
				contVoc++;
				break;
				default:
					System.out.println("El carácter "+letra+" es una consonante.");
					contCons++;
					break;
					
				}
			
				
			System.out.println("Se han generado "+contVoc+" vocales y "+contCons+" consonantes.");
			
			}

		}
}

