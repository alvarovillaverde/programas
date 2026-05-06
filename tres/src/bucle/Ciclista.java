package bucle;

import java.util.Random;

public class Ciclista {

		protected int dorsal; 
		protected String nombre; // Atributo que define el nombre del ciclista
		protected int tiempo=0;  // SEGUNDOS supongo parcial 
		protected int tiempoAcumulado = 0; /* Atributo que define el tiempo acumulado de un ciclista */
		protected int posicionGen=0; 
		
		public Ciclista(int identificador, String nombre) {
			this.dorsal = identificador;
			this.nombre = nombre;
		}
		
		//abstract String imprimirTipo();  //velo, crono y escala
		
		public int getTiempo() {
			return tiempo;
		}

		public void setTiempo(int tiempo) {
			this.tiempo = tiempo;
		}

		protected int getDorsal() {
			return dorsal;
		}
		
		protected void setDorsal(int dorsal) {
		this.dorsal = dorsal;
		}
		
		protected String getNombre() {
			return nombre;
		}
		
		protected void setNombre(String nombre) {
			this.nombre = nombre;
		}
						
		protected int getPosicionGen() {
			return posicionGen;
		}
		
		protected void setPosicionGeneral(int posicionGen) {
			this.posicionGen = posicionGen;
		}
		
		protected int getTiempoAcumulado() {
			return tiempoAcumulado;
		}
		
		protected void setTiempoAcumulado(int tiempoAcumulado) {
			this.tiempoAcumulado = tiempoAcumulado;
		}
		
		protected void imprimir() {
			System.out.println("Posicion: "+posicionGen);
			System.out.println("Identificador = " + dorsal);
			System.out.println("Nombre = " + nombre);
			System.out.println("Tiempo Parcial = " +tiempo);
			System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
		}
        
        public void correrEtapa(int tiempoMinimo, int tiempoMaximo) {
            Random r = new Random();

            int tiempoDeEstaEtapa = r.nextInt((tiempoMaximo - tiempoMinimo) + 1) + tiempoMinimo;

            this.tiempo = tiempoDeEstaEtapa;
            this.tiempoAcumulado += tiempoDeEstaEtapa;

            System.out.println(nombre + " ha terminado la etapa en: " + tiempoDeEstaEtapa + " segundos.");
        }
}