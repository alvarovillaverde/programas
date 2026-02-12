package boletin;

public class Ejercicio17 {
public static void main(String[] args) {

		Linea[] factura = new Linea[5];
		
		//mock de datos para crear las lineas 
		int[] CODIGOS = {101, 102, 103, 104, 105};
	    double[] LITROS = {15.5, 2.0, 50.0, 3.2, 10.0};
	    double[] PRECIOS = {2.50, 10.00, 0.75, 5.00, 1.80};

        double total;
		
	    
	    for (int i = 0; i < factura.length; i++) {
            
            // 2. Instanciación dentro del bucle
            Linea nuevaLinea = new Linea(
                CODIGOS[i],      // Utiliza el i-ésimo código
                LITROS[i],       // Utiliza el i-ésimo litro
                PRECIOS[i]       // Utiliza el i-ésimo precio
            );
            
            // 3. Adición al array estático 'factura'
            factura[i] = nuevaLinea;
            
            System.out.println("Posición " + i + " creada: " + factura[i].toString());

        }

	}

//inner class
    private static class Linea {
    
        // Atributos (Propiedades)
        int codigo;
        double litros;
        double precioL; // Precio por litro
        double subtotal; // Nuevo: Calculado
        
        // Constructor para inicializar los atributos
        public Linea(int codigo, double litros, double precioL) {
            this.codigo = codigo;
            this.litros = litros;
            this.precioL = precioL;
            this.subtotal = litros * precioL; // Cálculo automático al crear la línea
        }
        
        // Método para calcular el subtotal (si es que la cantidad o precio cambian)
        public double calcularSubtotal() {
            this.subtotal = this.litros * this.precioL;
            return this.subtotal;
        }

        // Getter para subtotal
        public double getSubtotal() {
            return subtotal;
        }
        
        // Método toString() para una representación legible del objeto
        @Override
        public String toString() {
            return "Linea [Código=" + codigo + 
                   ", Litros=" + litros + 
                   ", Precio/L=" + precioL + 
                   ", Subtotal=" + subtotal + "]";
        }
        
        // Getters y Setters (Opcionales, pero buena práctica si se necesita acceder/modificar)
        
        public int getCodigo() { return codigo; }
        public void setCodigo(int codigo) { this.codigo = codigo; }

        public double getLitros() { return litros; }
        public void setLitros(double litros) { this.litros = litros; }

        public double getPrecioL() { return precioL; }
        public void setPrecioL(double precioL) { this.precioL = precioL; }
    }
}
