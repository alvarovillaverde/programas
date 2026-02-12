package uno;

public class resuelto1 {

	// metodo estatico
	public static char getLetras() {
		return (char) (Math.random() * 26 + 'a');
	}

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println(getLetras());

		}

		for (int j = 0; j < 20; j++) {
			System.out.println(Math.random());
		}

	}

}
