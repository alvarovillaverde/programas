package gui4;

import java.util.ArrayList;

public class ListaEmpleados {
    public ArrayList<Empleado> empleados;
    double totalNomina=0;

    public ListaEmpleados(){
        empleados=new ArrayList<>();
    }

    public double calcularNominaTotal(){
        for (int i=0; i<empleados.size(); i++){
            Empleado e=(Empleado) empleados.get(i);
            totalNomina=totalNomina+e.salarioMensual();
        }
        return totalNomina;
    }

    public void contratarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }


    /**
     * Método que convierte los datos de la lista de empleados en una matriz
     */
    public String[][] obtenerMatriz() {
        String datos[][] = new String[empleados.size()][3]; // Se crea la matriz
        for (int i = 0; i < empleados.size(); i++) { // Recorre el vector de empleados 	// Obtiene un elemento de la lista de empleados
            Empleado e = (Empleado) empleados.get(i);
            /* Coloca el nombre del empleado en la primera columna de 	la matriz */
            datos[i][0] = e.getNombre();
            /* Coloca los apellidos del empleado en la segunda columna 	de la matriz */
            datos[i][1] = e.getApellidos();
            /* Coloca el salario del empleado en la tercera columna de la 	matriz */
            datos[i][2] = Double.toString(e.salarioMensual());
            // Va acumulando el total de nómina mensual de la empresa
            totalNomina = totalNomina + e.salarioMensual(); //ABSURDO --> ya hay un metodo
        }
        return datos;
    }

    public String convertirTexto() {
        StringBuilder texto = new StringBuilder();

        // Recorre la lista de empleados
        for (int i = 0; i < empleados.size(); i++) {
            // Obtiene un elemento de la lista de empleados
            Empleado e = (Empleado) empleados.get(i);

            // Concatena en el StringBuilder los datos de un empleado
            texto.append("Nombre = ").append(e.getNombre()).append("\n")
                    .append("Apellidos = ").append(e.getApellidos()).append("\n")
                    .append("Cargo = ").append(e.getCargo()).append("\n")
                    .append("Género = ").append(e.getGenero()).append("\n")
                    .append("Salario = $").append(e.getSalarioDiario()).append("\n")
                    .append("Días trabajados = ").append(e.getDiasTrabajados()).append("\n")
                    .append("Otros ingresos = $").append(e.getOtrosIngresos()).append("\n")
                    .append("Pagos salud = $").append(e.getPagoPorSalud()).append("\n")
                    .append("Aportes pensiones = $").append(e.getAportePensiones()).append("\n")
                    .append("---------\n");
        }

        // Concatena el total de la nómina al final
        texto.append("Total nómina = $").append(String.format("%.2f", calcularNominaTotal()));

        return texto.toString();
    }

}