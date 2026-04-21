package alvaroExamen2ev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Carta implements Comparable<Object> {
    
    // 1. Definimos el mapa estático
    public static HashMap<Palos, Integer> puntos = new HashMap<>();

    // 2. Inicializamos los valores (Bloque static)
    static {
        puntos.put(Palos.OROS, 1);
        puntos.put(Palos.COPAS, 5);
        puntos.put(Palos.ESPADAS, 10);
        puntos.put(Palos.BASTOS, 20);
    }

    public enum Valor {
        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
    }

    enum Palos {
        ESPADAS, BASTOS, COPAS, OROS
    }

    // atributos -->
    String valor;
    String palo;

    // constructor -->
    Carta() {
        Random random = new Random();
        Valor[] valores = Valor.values();
        Palos[] palos = Palos.values();
        this.valor = valores[random.nextInt(valores.length)].name();
        this.palo = palos[random.nextInt(palos.length)].name();
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    // ESTE METODO PERMITIRA comparar dos objetos carta y ordenarlos segun el
    // criterio de su interior
    @Override
    public int compareTo(Object o) {
        // la carta que llama a este metodo es this
        // la carta con la que comparo es o
        // quiero ordenar por palos
        // quiero ordenar por palos
        Carta c = (Carta) o;
        return (this.getPalo()).compareTo(c.getPalo());
    }

    @Override
    public String toString() {
        return "Carta [valor=" + valor + ", palo=" + palo + "]";
    }

    public static int calcularPuntosCarta(Carta carta) {
        return puntos.get(carta.getValor());
    }

    // 4. Método para sumar los puntos de una lista (mano)
    public static int sumarMano(ArrayList<Carta> mano) {
        int total = 0;
        for (Carta c : mano) {
            total += calcularPuntosCarta(c);
        }
        return total;
    }


    public static ArrayList<Carta> mano = new ArrayList<Carta>();
    public static void main(String[] args) {

        int opcion;
		boolean seguir = true;
        Scanner s = new Scanner(System.in);

        

        // añado las cartas
        for (int i = 0; i < 6; i++) {
            Carta carta = new Carta();
            //System.out.println(carta);
            mano.add(carta);
        }

        //mano.sort((o1, o2) -> o1.compareTo(o2));

        //for (Carta carta : mano) {
          //  System.out.println(carta);
        //}

        do {
			System.out.println("\nMENU");
			System.out.println("===================");
			System.out.println("1. Mostrar mano y resultado");
			System.out.println("2. Guardar coleccion");
			System.out.println("3. Cargar coleccion");
			System.out.println("4. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");

				System.out.println("ve tu mano");
                System.out.println(mano);
                int puntos = sumarMano(mano); // no se porque no funciona el metodo sumar mano, el error esta en calcularPuntosCarta
                // pero no se porque falla, crei que es por lo que devulve el get
                System.out.println("tienes " + puntos + " puntos");

				break;

			case 2:
				System.out.println("\nGUARDAR");
				System.out.println("==========");
				guardarColeccionEnAlmacenamiento();
				break;

			case 3:
				System.out.println("\nCARGAR");
				System.out.println("===========");
				cargarColeccionDesdeAlmacenamiento();
				break;

			case 4:
				System.out.println("...abandonando menu...");
				seguir = false;
				guardarColeccionEnAlmacenamiento();
				break;
			default:
                System.out.println("INTRODUCE OPCIÓN VÁLIDA");
			} // switch
		} while (seguir);
        s.close();
    }

    public static void guardarColeccionEnAlmacenamiento() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("galeria.txt"));
            Collections.sort(mano);
			oos.writeObject(mano);
			System.out.println("Coleccion guardada correctamente en galeria.obj");
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al guardar la colección " + e.getMessage());
		}
	}

    public static void cargarColeccionDesdeAlmacenamiento() {
		File fichero = new File("galeria.txt");

		if (!fichero.exists()) {
			System.out.println("No hay archivo de guardado previo. Creando colección nueva...");
            return;
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
			mano = (ArrayList<Carta>) ois.readObject();
            Collections.sort(mano);
			System.out.println("Coleccion cargada con exito");
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error al cargar la coleccion: " + e.getMessage());
		}
	}

}
